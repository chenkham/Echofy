package com.Chenkham.Echofy.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.Chenkham.Echofy.utils.reportException
import com.chenkham.Echofy.innertube.YouTube
import com.chenkham.Echofy.innertube.models.AlbumItem
import com.chenkham.Echofy.innertube.models.ArtistItem
import com.chenkham.Echofy.innertube.models.PlaylistItem
import com.chenkham.Echofy.innertube.utils.completed
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AccountViewModel
    @Inject
    constructor() : ViewModel() {
        val playlists = MutableStateFlow<List<PlaylistItem>?>(null)
        val albums = MutableStateFlow<List<AlbumItem>?>(null)
        val artists = MutableStateFlow<List<ArtistItem>?>(null)

        init {
            viewModelScope.launch {
                YouTube.library("FEmusic_liked_playlists").completed().onSuccess { page ->
                    playlists.value =
                        page.items.filterIsInstance<PlaylistItem>()
                            .filterNot { it.id == "SE" }
                }.onFailure {
                    reportException(it)
                }
                YouTube.library("FEmusic_liked_albums").completed().onSuccess { page ->
                    albums.value = page.items.filterIsInstance<AlbumItem>()
                }.onFailure {
                    reportException(it)
                }
                YouTube.library("FEmusic_library_corpus_artists").completed().onSuccess { page ->
                    artists.value = page.items.filterIsInstance<ArtistItem>()
                }.onFailure {
                    reportException(it)
                }
            }
        }
    }
