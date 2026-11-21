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

## 🎨 UI & Asset Submission Guidelines

We want to make Echofy look distinct and unique! If you want to contribute UI designs, icons, or vector drawables:

1. **Discuss Before You Code**:
   - Please open an **Issue / Feature Request** before submitting major design overhauls. Let's align on the visual direction first!
2. **Strictly No Copyrighted Assets**:
   - All contributed icons, artwork, illustrations, or vector drawables must be **100% original**, public domain (CC0), or released under a compatible open-source license.
   - Do **not** copy proprietary artwork, logos, or brand marks from Spotify, YouTube Music, or other commercial apps.
3. **Responsive Design**:
   - Ensure UI layouts support dynamic theming (Material Design 3) and look good on small phones, large phones, and tablets.

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
- Constructive feedback on code architecture is always celebrated. Let's learn together!
