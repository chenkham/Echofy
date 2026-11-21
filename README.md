# Echofy 🎵

<div align="center">
  <img src="assets/echofy.png" alt="Echofy Logo" width="128"/>
  
  <h3>A Modern, Elegant & High-Performance Music Player for Android</h3>
  
  <p>Stream your favorite music with an intuitive Material Design 3 interface, background playback, synchronized lyrics, offline downloads, and customizable audio experiences.</p>

  [![Platform](https://img.shields.io/badge/Platform-Android%207.0+-3DDC84.svg?style=for-the-badge&logo=android&logoColor=white)](https://www.android.com)
  [![Language](https://img.shields.io/badge/Kotlin-2.1.0-7F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org)
  [![License](https://img.shields.io/badge/License-GPL%20v3-blue.svg?style=for-the-badge)](LICENSE)
  [![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=for-the-badge)](CONTRIBUTING.md)
</div>

---

## 📸 Screenshots

<div align="center">
  <img src="assets/echofy.png" width="160" alt="Home Screen Placeholder"/>
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="assets/echofy.png" width="160" alt="Player Screen Placeholder"/>
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="assets/echofy.png" width="160" alt="Lyrics Screen Placeholder"/>
  <p><em>(Screenshots coming soon!)</em></p>
</div>

---

## 🌱 A Note from the Creator

> **Hi there! 👋**  
> I am still learning Android development! Because I'm learning as I build, you might spot experimental code, creative explorations, or files that can be refactored across the codebase. 
> 
> **Code cleanups, architecture suggestions, and beginner-friendly reviews are warmly welcomed.** If you have experience in Jetpack Compose, Kotlin coroutines, or modern Android architecture, I'd love to learn and collaborate with you!

---

## 🌟 The Vision for Echofy

1. **Ultra-Fluid, Unique UI/UX**: Deliver an original, responsive interface combining smooth Compose animations, dynamic color palettes, and glassmorphic aesthetics.
2. **Community Driven**: Create a welcoming open-source space where developers, designers, and music enthusiasts can collaborate and build together.
3. **Audio & Social Features**: Offer real-time listening rooms (Jam Together), smart recommendations, rich lyrics, and offline playback.

---

## ⚡ Architecture & Performance Optimizations

Echofy is engineered with key performance optimizations to ensure low latency, minimal battery usage, and smooth 60/120 FPS UI rendering:

### 1. Database & Analytics Optimization (Room + SQLite)
- **Epoch Millisecond Precision**: Timestamps are indexed and stored as 64-bit UTC epoch millisecond integers (`Long`), bypassing heavy string serialization.
- **Efficient Epoch Math**: Complex date queries use native SQLite arithmetic (`date(timestamp / 1000 + :offsetSeconds, 'unixepoch')`) coupled with user timezone offsets. This enables features like listening streaks and Time Machine history without full-table scans.
- **Opt-In Discovery Queries**: Discovery rows on the home screen check DataStore preferences first; disabled sections cost zero SQL queries or disk I/O.

### 2. Non-Blocking Asynchronous IO
- **Parallel Coroutine Dispatch**: Discovery modules load in parallel using `async(Dispatchers.IO)` and are joined together, preventing serial bottlenecks during home feed initialization.
- **Streamlined Main Thread**: Expensive calculations, bitmap palette extractions, and network deserializations run strictly on background worker threads.

### 3. Smart Stream Fallback & Lazy PoToken Generation
- **Intelligent Client Cascades**: Audio stream resolution prioritizes lightweight, unciphered client endpoints (`IOS`, `MOBILE`, `ANDROID_MUSIC`, `TVHTML5`) first.
- **Lazy PoToken Execution**: Heavy WebView token generation is deferred until strictly necessary, reducing song initialization latency to under 100ms.

### 4. Audio Engine & Layered Caching (Media3 / ExoPlayer)
- **Least Recently Used (LRU) Disk Cache**: Streamed chunks are transparently cached on disk via Media3's `SimpleCache`, eliminating repeated mobile data usage for replayed tracks.
- **Lossless Audio Focus & Service Lifecycle**: Dedicated foreground service handling ensures reliable background playback without Android OS memory terminations.

### 5. Release Shrinking & R8/ProGuard Rules
- **Optimized ProGuard Rules**: Release builds employ aggressive bytecode shrinking and dead code elimination.
- **Precise Keep Rules**: Reflection rules are scoped strictly to necessary libraries (Ktor, Kotlinx Serialization, ONNX Runtime) to preserve speed while maintaining minimal APK size.

---

## 💡 Ads & Transparency

To support ongoing project maintenance, Echofy includes small, non-intrusive banner ads.

- **Open-source builds automatically use Google's official public Test Ad IDs**, ensuring zero private IDs are exposed in the repository and allowing contributors to build and run the app out of the box with zero setup:
  - App ID: `ca-app-pub-3940256099942544~3347511713`
  - Banner ID: `ca-app-pub-3940256099942544/6300978111`
- If you build the app for yourself from source, you can customize or disable ads in your local build.

---

## ✨ Features

- 🎧 **Background Playback**: Seamless audio playback while multitasking or with your screen off.
- 📜 **Synchronized Lyrics**: Live, time-synced lyrics with rich typography.
- 💾 **Offline Cache & Downloads**: Save songs and albums locally for listening without an internet connection.
- 🎨 **Dynamic Material Design 3**: Dynamic color theming and adaptive layouts.
- 🤝 **Jam Sessions (Listen Together)**: Real-time synchronized listening with friends.
- 🎙️ **Song Recognition**: Built-in audio fingerprinting powered by ShazamKit.
- 🎮 **Discord Rich Presence**: Broadcast your current song directly to Discord.
- ⏱️ **Sleep Timer & Audio Normalization**: Automatic pause timer and loudness normalization across tracks.

---

## 🛠️ Building from Source

### Prerequisites
- **Android Studio** (Ladybug, Koala, or newer)
- **JDK 17 or JDK 21**
- **Android SDK** (API 35+ recommended)

### Quick Start
1. Clone the repository:
   ```bash
   git clone https://github.com/chenkham/Echofy.git
   cd Echofy
   ```
2. Open the project in Android Studio.
3. Build the debug APK:
   ```bash
   ./gradlew assembleDebug
   ```
   *(On Windows PowerShell: `.\gradlew.bat assembleDebug`)*

The project is pre-configured with Google's public AdMob test IDs, so **no manual configuration or API keys are required to build and test the app!**

---

## 🤝 Contributing

We would love your help to make Echofy even better! Whether you are interested in fixing bugs, cleaning up code, or proposing new UI concepts:

- **Read [CONTRIBUTING.md](CONTRIBUTING.md)** before opening a Pull Request.
- **Have a feature idea or UI mockup?** Please [open a Discussion / Issue](https://github.com/chenkham/Echofy/issues) first to discuss your concept before writing code. This saves you time and ensures our design vision stays aligned!

---

## 💖 Open-Source Credits & Acknowledgments

Echofy is built with the help of outstanding open-source libraries and services across the developer community:

- **[LRCLIB](https://lrclib.net/)** — Fast and open synchronized lyrics provider.
- **[BetterLyrics](https://github.com/)** — Enhanced synchronized lyric formatting and multi-source parsing.
- **[Last.fm](https://www.last.fm/)** — Music metadata and scrobbling API support.
- **[ShazamKit](https://github.com/)** — Audio recognition and acoustic fingerprinting.
- **[AndroidX Media3 / ExoPlayer](https://developer.android.com/media/media3)** — Production-grade media playback and audio cache pipelines.
- **[AndroidX Room](https://developer.android.com/training/data-storage/room)** — Robust SQLite database abstraction layer.
- **[Jetpack Compose & Material 3](https://developer.android.com/jetpack/compose)** — Declarative UI toolkit and dynamic theming engine.
- **[Ktor](https://ktor.io/)** — Asynchronous HTTP client for multi-platform network requests.
- **[Coil](https://coil-kt.github.io/coil/)** — Image loading and memory-efficient bitmap rendering.
- **[Material Color Utilities](https://github.com/material-foundation/material-color-utilities)** — Dynamic tonal palette generation from album art.
- **[Dagger Hilt](https://dagger.dev/hilt/)** — Dependency injection framework.
- **[NewPipeExtractor / MetrolistExtractor](https://github.com/TeamNewPipe/NewPipeExtractor)** — Stream extraction and media format parsing.

---

## 📜 License

Echofy is licensed under the **GNU General Public License v3.0 (GPL-3.0)**. See the [LICENSE](LICENSE) file for full details.
