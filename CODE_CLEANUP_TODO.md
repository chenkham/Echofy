# Echofy Code Cleanup & Refactoring Roadmap (TODO)

Welcome to the Echofy Android refactoring roadmap! As this project originated from a fork of OpenTune and is evolving into an independent, beautifully designed music experience, several areas of the codebase are ready for cleanup, modernization, and optimization.

Contributions in any of the areas below are very welcome!

---

## 🧹 High-Priority Cleanup Areas

### 1. Legacy Package Names in Submodules
- **Current State**: Submodules (`:spotify`, `:lastfm`, `:innertube`) still declare packages under `com.arturo254.opentune.*`.
- **Goal**: Consolidate and refactor submodule namespaces cleanly into `com.Chenkham.Echofy.*` or modularized library namespaces without breaking Room or serialization models.

### 2. Large Composables & ViewModels (> 250 Lines)
- **Current State**: Several UI files and ViewModels have grown quite large:
  - `app/.../ui/screens/ExploreScreen.kt` (> 600 lines)
  - `app/.../ui/component/ChangelogButton.kt` (> 1000 lines)
  - `app/.../viewmodels/BackupRestoreViewModel.kt` (> 900 lines)
  - `app/.../utils/Updater.kt` (> 600 lines)
- **Goal**: Decompose large composables into dedicated, reusable sub-components and smaller state holders following single-responsibility principles.

### 3. XML Resource Consolidation
- **Current State**:
  - `opentune_strings.xml` still houses many UI strings separately from `strings.xml`.
  - Legacy drawables (`opentune.xml`, `opentune_monochrome.xml`) still exist alongside newer assets.
- **Goal**: Merge string resources cleanly into categorized XML files and provide modern vector alternatives for all brand assets.

### 4. Background Threading & Coroutine Dispatchers
- **Current State**: Most operations use coroutines, but some database queries and image processing steps need strict auditing to ensure they execute solely on `Dispatchers.IO` and never cause frame drops on `Dispatchers.Main`.
- **Goal**: Audit all DAO calls and network fetches to guarantee zero jank and fluid 120Hz scrolling across Jetpack Compose lists.

### 5. Automated Unit & UI Tests
- **Current State**: The project has limited test coverage for view models, Room migrations, and playback session management.
- **Goal**:
  - Add unit tests for `HomeViewModel`, `SearchViewModel`, and `PlayerConnection`.
  - Add Room migration integration tests to verify database schema upgrades.

---

## 🛠️ What Was Already Cleaned Up Before Open-Sourcing
- [x] **AdMob Security**: Moved all production AdMob App IDs and Ad Unit IDs out of source code into `local.properties`. Configured Gradle with Google's official public test IDs as automatic fallbacks for open-source contributors.
- [x] **Keystore Security**: Keystores and private signing credentials are fully removed from version control and safeguarded in `.gitignore`.
- [x] **Repository URLs**: Updated updater endpoints, Discord RPC links, GitHub API changelog targets, and issue templates to point to `chenkham/Echofy-android`.
- [x] **Community Governance**: Added GitHub Actions CI, Contributing guidelines, Issue/PR templates, and GPL-3.0 License.

---

## 🤝 Interested in Helping?
Check out [CONTRIBUTING.md](CONTRIBUTING.md) to get started! If you want to take on any item from this list, please open an issue first to discuss your approach so we can collaborate and avoid duplicated effort.
