# Echofy 🎵

<div align="center">
  <img src="assets/ic_launcher-playstore.png" alt="Echofy Logo" width="128"/>
  
  <h3>A Modern, Elegant YouTube Music Client for Android</h3>
  
  <p>Stream your favorite music with an intuitive Material Design 3 interface, background playback, synchronized lyrics, offline downloads, and customizable experiences.</p>

  [![Platform](https://img.shields.io/badge/Platform-Android%207.0+-3DDC84.svg?style=for-the-badge&logo=android&logoColor=white)](https://www.android.com)
  [![Language](https://img.shields.io/badge/Kotlin-2.1.0-7F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org)
  [![License](https://img.shields.io/badge/License-GPL%20v3-blue.svg?style=for-the-badge)](LICENSE)
  [![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=for-the-badge)](CONTRIBUTING.md)
</div>

---

## 📸 Screenshots

<div align="center">
  <!-- Place your screenshots here once ready -->
  <img src="assets/ic_launcher-playstore.png" width="200" alt="Home Screen Placeholder"/>
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="assets/ic_launcher-playstore.png" width="200" alt="Player Screen Placeholder"/>
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="assets/ic_launcher-playstore.png" width="200" alt="Lyrics Screen Placeholder"/>
  <p><em>(Screenshots coming soon!)</em></p>
</div>

---

## 🌱 A Note from the Creator

> **Hi there! 👋**  
> I am still learning Android development! Because I'm learning as I build, you might spot some messy areas, experimental code, or files that need refactoring across the codebase. 
> 
> **Code-cleanup PRs, architecture suggestions, and beginner-friendly reviews are warmly welcomed.** If you have experience in Jetpack Compose, Kotlin coroutines, or modern Android architecture, I'd love to learn from your feedback!

---

## 🌟 The Vision for Echofy

Echofy started as a fork and derivative of the awesome project **OpenTune**. My goal is to:
1. **Completely Redesign the UI**: Transform the interface into an original, ultra-fluid, and responsive experience that looks and feels unique.
2. **Elevate Audio & Social Features**: Build advanced features like real-time listening rooms (Jam Together), smart recommendations, and offline caching.
3. **Build Together with the Community**: Create a welcoming open-source space where designers, contributors, and music enthusiasts can shape the future of the app.

---

## 💡 Ads & Transparency

To help support ongoing server costs (for features like Jam Together relay synchronization and development tools), Echofy includes small, non-intrusive banner ads.

- **Open-source builds automatically use Google's official public Test Ad IDs**, ensuring zero private IDs are exposed in the repository and allowing contributors to build and run the app out of the box with zero setup.
- If you build the app for yourself from source, you can customize or disable ads in your local build.

---

## ✨ Features

- 🎧 **Background Playback**: Keep listening seamlessly while using other apps or with your screen turned off.
- 📜 **Synchronized Lyrics**: Live, time-synced lyrics powered by LRCLIB and BetterLyrics.
- 💾 **Offline Cache & Downloads**: Save songs and albums locally for listening on the go without an internet connection.
- 🎨 **Dynamic Material Design 3**: Dynamic theming, custom color palettes, and adaptive layouts.
- 🤝 **Jam Sessions (Listen Together)**: Real-time collaborative listening with friends.
- 🎙️ **Song Recognition**: Built-in audio fingerprinting powered by ShazamKit.
- 🎮 **Discord Rich Presence**: Share what you're listening to live on Discord.
- ⏱️ **Sleep Timer & Normalization**: Automatically pause music when you sleep, with loudness normalization across tracks.

---

## 🛠️ Building from Source

### Prerequisites
- **Android Studio** (Ladybug / Koala or newer recommended)
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
   *(On Windows PowerShell, run: `.\gradlew.bat assembleDebug`)*

The project is pre-configured with Google's public AdMob test IDs, so **no manual configuration or API keys are required to build and test the app!**

---

## 🤝 Contributing

We would love your help to make Echofy even better! Whether you are interested in fixing bugs, cleaning up code, or proposing new UI concepts:

- **Check our [Code Cleanup Roadmap](CODE_CLEANUP_TODO.md)** for a list of areas that need TLC.
- **Read [CONTRIBUTING.md](CONTRIBUTING.md)** before opening a Pull Request.
- **Have a feature idea or UI mockup?** Please [open a Discussion / Issue](https://github.com/chenkham/Echofy/issues) first to discuss your concept before writing code. This saves you time and ensures our design vision stays aligned!

---

## 💖 Credits & Acknowledgments

Echofy stands on the shoulders of giants in the Android open-source community:

- **[OpenTune](https://github.com/Arturo254/OpenTune)** by [Arturo254](https://github.com/Arturo254) — the original foundation upon which this project was built. Thank you for your incredible work!
- **[NewPipeExtractor / MetrolistExtractor](https://github.com/TeamNewPipe/NewPipeExtractor)** — powers reliable streaming and YouTube integration.
- **[InnerTube](https://github.com/TeamNewPipe)** and the wider open-source Android music developer community.

---

## 📜 License

Echofy is licensed under the **GNU General Public License v3.0 (GPL-3.0)**. See the [LICENSE](LICENSE) file for full details.
