# Walkthrough - Jetpack Compose Navigation

I have successfully implemented the two-screen navigation app using type-safe routes.

## Changes Made

### 1. Dependency Configuration
- Updated [libs.versions.toml](file:///D:/edp-android-tan/gradle/libs.versions.toml) to include `androidx.navigation:navigation-compose` and `kotlinx-serialization-json`.
- Applied the `kotlin-serialization` plugin in [build.gradle.kts](file:///D:/edp-android-tan/app/build.gradle.kts).

### 2. Type-Safe Routes
- Created [Routes.kt](file:///D:/edp-android-tan/app/src/main/java/com/example/myapplication/Routes.kt) containing:
    - `Home`: An object for the starting screen.
    - `Greeting`: A data class for the second screen, carrying a `userName` string.

### 3. Screen UI
- Implemented [Screens.kt](file:///D:/edp-android-tan/app/src/main/java/com/example/myapplication/Screens.kt):
    - `HomeScreen`: Includes an `OutlinedTextField` for name input and a "Show Greeting" button.
    - `GreetingScreen`: Displays "Hello, <name>! Welcome to Jetpack Navigation.".

### 4. Navigation Hosting
- Refactored [MainActivity.kt](file:///D:/edp-android-tan/app/src/main/java/com/example/myapplication/MainActivity.kt) to use `NavHost` and manage navigation between the two screens.

## Verification Results

### Build
- Successfully ran `gradlew :app:assembleDebug`.

### Next Steps (Manual)
1. **Run the app** on your emulator or device.
2. **Test the flow**: Enter your name on the Home screen and verify the Greeting screen displays it correctly.
3. **Capture a screenshot**: Save the screenshot as `greeting_screenshot.png` in the `screenshots/` folder.
4. **Git Commands**:
   ```bash
   git branch  # Confirm you are on lab-activity-7
   git add .
   git commit -m "Lab Activity 7: Jetpack Compose navigation two-screen app"
   git push -u origin lab-activity-7
   ```
