# Implementation Plan - Laboratory Activity 8 (MVVM Profile App)

Build an Android app that allows users to create and update a profile using the MVVM pattern with Jetpack Compose.

## Proposed Changes

### Build Configuration

#### [MODIFY] [libs.versions.toml](file:///D:/edp-android-tan/gradle/libs.versions.toml)
- Add entries for `androidx-lifecycle-viewmodel-compose` and `androidx-lifecycle-runtime-compose` using the existing `lifecycleRuntimeKtx` version (2.11.0).

#### [MODIFY] [build.gradle.kts (app)](file:///D:/edp-android-tan/app/build.gradle.kts)
- Add the new lifecycle dependencies to the `dependencies` block.

### Source Code

#### [NEW] [ProfileUiState.kt](file:///D:/edp-android-tan/app/src/main/java/com/example/myapplication/ProfileUiState.kt)
- Create an immutable data class to hold the profile state (name, email, contact, address, username, skills list, etc.).

#### [NEW] [ProfileViewModel.kt](file:///D:/edp-android-tan/app/src/main/java/com/example/myapplication/ProfileViewModel.kt)
- Create a `ViewModel` that manages the `ProfileUiState` using `MutableStateFlow`.
- Implement functions to handle field changes, adding/removing skills, and toggling the preview mode.

#### [NEW] [ProfileScreen.kt](file:///D:/edp-android-tan/app/src/main/java/com/example/myapplication/ProfileScreen.kt)
- Implement `ProfileForm` for editing.
- Implement `ProfilePreview` for read-only viewing.
- Implement the main `ProfileScreen` composable to switch between the form and preview based on the UI state.

#### [MODIFY] [MainActivity.kt](file:///D:/edp-android-tan/app/src/main/java/com/example/myapplication/MainActivity.kt)
- Update `setContent` to display the `ProfileScreen`.

## Verification Plan

### Automated Tests
- Run `gradlew assembleDebug` to ensure the project builds correctly.

### Manual Verification
1. Launch the app on an emulator.
2. Fill in all profile fields.
3. Add at least two skills and remove one.
4. Tap the **Preview** button and verify the data is displayed correctly.
5. Tap **Back to edit** to return to the form.
6. Rotate the device and verify that the entered data persists (survives configuration change).

### Deliverables
- A screenshot of the **Preview** screen saved as `screenshots/screenshot.png`.
- All changes committed to the `lab-activity-8` branch.
