# Lab Activity 11: LiceoFieldKit Implementation Walkthrough

I have implemented the LiceoFieldKit application, covering permissions, sensors, CameraX, and location APIs as specified in the lab instructions.

## Key Accomplishments

### 1. Permissions Framework
- **TODO 1**: Declared `CAMERA`, `ACCESS_FINE_LOCATION`, `ACCESS_COARSE_LOCATION`, and `VIBRATE` permissions in the `AndroidManifest.xml`. Also added the `android.hardware.camera` feature.
- **TODO 2 & 3**: Created a robust `PermissionHelper.kt` with `permStatus()` to determine the state (Granted, NeedsRationale, Denied, NotAsked) and `rememberPermission()` to handle the lifecycle and request logic.
- **TODO 4**: Implemented `PermissionGate.kt` which provides a reusable UI wrapper for all four permission states.

### 2. Hardware APIs
- **TODO 5 & 6**: Implemented accelerometer reading in `Accelerometer.kt` with proper lifecycle management (registering in `onStart`/`onResume` and unregistering in `onPause`/`onDispose`). The `LevelCard.kt` provides a visual "LEVEL ✓" indicator when the device is flat.
- **TODO 7, 8 & 9**: Set up CameraX in `CameraPreview.kt` and `Photo.kt`. Users can take photos which are saved to the app's cache directory.
- **TODO 10, 11 & 12**: Integrated Google Play Services for location tracking in `Location.kt` and `LocationCard.kt`. The app correctly handles both precise and approximate location requests.

### 3. Bonus Features
- **TODO 13**: Added "Shake to take a photo" functionality using the accelerometer and a 1500ms cool-down.
- **TODO 14**: Implemented a torch toggle button that uses the `CameraX` `cameraControl`.
- **Haptics**: Integrated device vibration (`buzz`) for the shake-to-capture feature.

## Verification & Screenshots
I have verified the app's functionality on the emulator and captured the required screenshots:
- `01-camera-dialog.png`: Initial permission request.
- `02-rationale.png`: Rationale message after one denial.
- `03-open-settings.png`: Blocked state with "Open Settings" button.
- `04-camera-photo.png`: Working camera preview with thumbnail.
- `05-level.png`: Accelerometer level check.
- `06-location.png`: Location coordinates and access level.
- `07-branch.png`: Git branch and commit history.

The app builds successfully and adheres to the LiceoFieldKit design requirements.
