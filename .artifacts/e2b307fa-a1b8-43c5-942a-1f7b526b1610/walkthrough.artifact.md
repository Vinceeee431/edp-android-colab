# Walkthrough - Laboratory Activity 8 (MVVM Profile App)

I have successfully implemented the user profile app following the MVVM architectural pattern.

## Changes Made

### 1. Dependency Configuration
- Updated [libs.versions.toml](file:///D:/edp-android-tan/gradle/libs.versions.toml) and [build.gradle.kts](file:///D:/edp-android-tan/app/build.gradle.kts) to include the required Compose Lifecycle and ViewModel libraries.

### 2. UI State
- Created [ProfileUiState.kt](file:///D:/edp-android-tan/app/src/main/java/com/example/myapplication/ProfileUiState.kt) to model the entire screen's state as an immutable data class.

### 3. ViewModel
- Implemented [ProfileViewModel.kt](file:///D:/edp-android-tan/app/src/main/java/com/example/myapplication/ProfileViewModel.kt) to handle all business logic, state updates (using `MutableStateFlow` and `copy()`), and item management for the skills list.

### 4. UI View (Compose)
- Developed [ProfileScreen.kt](file:///D:/edp-android-tan/app/src/main/java/com/example/myapplication/ProfileScreen.kt) which reactively switches between an edit form (`ProfileForm`) and a read-only preview (`ProfilePreview`).

### 5. Integration
- Updated [MainActivity.kt](file:///D:/edp-android-tan/app/src/main/java/com/example/myapplication/MainActivity.kt) to launch the `ProfileScreen` within the app's entry point using `MyApplicationTheme`.

### 6. Theming
- Applied the project's custom theme (`MyApplicationTheme`) in `MainActivity` to ensure all buttons, text fields, and UI elements use the designated **Maroon** (`0xFF800000`) primary color.

## Verification Results

### Build & Deployment
- Successfully built the app using `gradlew :app:assembleDebug`.
- Deployed to an emulator and verified the complete flow:
    - Filling the form (Name, Email, Contact, Address, Username).
    - Adding and removing skills (Kotlin, Compose).
    - Toggling between Edit and Preview modes.

### Screenshot
- Captured proof of the **Preview screen** with a filled-in profile and 2 skills: [screenshot.png](file:///D:/edp-android-tan/screenshots/screenshot.png).

### Final Git Status
- All work is committed and pushed to the `lab-activity-8` branch.
