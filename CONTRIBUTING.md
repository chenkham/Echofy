# Contributing to Echofy 🎵

Thank you for your interest in contributing to Echofy! We welcome all contributions, from bug fixes and documentation improvements to new features, UI enhancements, and code cleanups.

As the author is still actively learning Android development, please be kind, constructive, and patient in code reviews and discussions!

---

## 🚀 Getting Started & Building

1. **Fork and Clone**
   ```bash
   git clone https://github.com/<your-username>/Echofy.git
   cd Echofy
   ```

2. **Branching**
   Create a descriptive branch for your work:
   ```bash
   git checkout -b feature/my-new-feature
   # or
   git checkout -b fix/issue-description
   ```

3. **No Special API Keys Needed (Test IDs by Default)**
   - The project is configured with safe fallbacks to Google's official public AdMob Test IDs:
     - **App ID**: `ca-app-pub-3940256099942544~3347511713`
     - **Banner Ad Unit**: `ca-app-pub-3940256099942544/6300978111`
   - You **do not** need a `local.properties` file or real ad credentials to build and test the app.
   - Run the build:
     ```bash
     ./gradlew assembleDebug
     ```

---

## 🎨 UI & Design Guidelines — Inspire & Innovate!

We want Echofy to look and feel like an absolute powerhouse music player!

1. **Take Inspiration from the Best**:
   - Love Spotify's sleek player UI? YouTube Music's intuitive navigation? Apple Music's fluid lyrics view? **We love them too!** Feel free to borrow, combine, and elevate the best UI/UX concepts and layouts from anywhere across the music streaming world.
2. **Make it Look & Feel Premium**:
   - Whether it's silky-smooth Compose animations, dynamic color theming, glassmorphic blur effects, or Spotify-grade layout Polish, all modern design ideas are welcome.
3. **Share Your Ideas First**:
   - Got a cool design idea or Figma mockup? Share it in a **GitHub Issue or Discussion** so the community can hype it up, give feedback, and collaborate on building it into Jetpack Compose.
4. **Responsive & Adaptive**:
   - Ensure UI improvements look gorgeous on phones of all aspect ratios, foldables, and tablets.

---

## 📱 Pull Request Requirements

To ensure quick and smooth reviews, every Pull Request must adhere to the following checklist:

1. **Visual Proof (Mandatory for UI Changes)**:
   - Any PR that touches UI elements (screens, dialogs, buttons, colors) **must include before-and-after screenshots or a short screen recording/GIF** in the PR description.
2. **Quality Gates & Formatting**:
   - Ensure the code compiles cleanly and passes quality checks:
     ```bash
     ./gradlew ktlintCheck detekt lintDebug
     ```
   - Automatically format code if needed:
     ```bash
     ./gradlew ktlintFormat
     ```
3. **Small & Focused Changes**:
   - Prefer small, targeted PRs over monolithic refactors. It makes reviewing easier and helps avoid merge conflicts.
   - Follow clean architecture: keep business logic in ViewModels/repositories and keep Composable files focused and modular (< 250 lines per file where practical).

---

## 💬 Community & Code of Conduct

- Be welcoming, respectful, and encouraging to fellow contributors regardless of experience level.
- Constructive feedback on code architecture and design is always celebrated. Let's learn, innovate, and build something incredible together!
