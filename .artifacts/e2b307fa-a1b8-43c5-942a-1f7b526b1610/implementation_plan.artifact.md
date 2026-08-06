# Implementation Plan - Jetpack Compose Navigation with Type-Safe Routes

Implement a two-screen navigation flow using Jetpack Compose Navigation and Kotlin Serialization for type-safe routing.

## Proposed Changes

### Build Configuration

#### [MODIFY] [libs.versions.toml](file:///D:/edp-android-tan/gradle/libs.versions.toml)
- Add versions for `navigation-compose` (2.8.5) and `kotlinx-serialization-json` (1.7.3).
- Add `kotlin-serialization` plugin definition.
- Add library definitions for navigation and serialization.

#### [MODIFY] [build.gradle.kts (app)](file:///D:/edp-android-tan/app/build.gradle.kts)
- Apply the Kotlin Serialization plugin.
- Add navigation and serialization dependencies.

### Source Code

#### [NEW] [Routes.kt](file:///D:/edp-android-tan/app/src/main/java/com/example/myapplication/Routes.kt)
- Define `@Serializable` routes: `Home` (object) and `Greeting` (data class).

#### [NEW] [Screens.kt](file:///D:/edp-android-tan/app/src/main/java/com/example/myapplication/Screens.kt)
- Implement `HomeScreen` with a text field and button.
- Implement `GreetingScreen` to display the passed name.

#### [MODIFY] [MainActivity.kt](file:///D:/edp-android-tan/app/src/main/java/com/example/myapplication/MainActivity.kt)
- Set up `NavController` and `NavHost` in `setContent`.
- Define navigation graph with `Home` and `Greeting` destinations.

## Verification Plan

### Automated Tests
- Run `gradlew :app:assembleDebug` to verify compilation.
- (Optional) Run the app on an emulator to verify navigation logic.

### Manual Verification
- Deploy to an emulator/device.
- Enter a name on the Home screen.
- Click "Show Greeting" and verify the second screen displays the name.
- Take a screenshot of the Greeting screen and save it to `screenshots/greeting_screenshot.png`.
