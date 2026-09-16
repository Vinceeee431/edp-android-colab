# Lab Activity 11: LiceoFieldKit Implementation Walkthrough

I have implemented the LiceoFieldKit application, covering permissions, sensors, CameraX, and location APIs as specified in the lab instructions. I also ensured the project is on the correct branch.

## Key Accomplishments

### 1. Project Management
- **Branch Fix**: Moved all progress from `lab-activity-11` to the required `lab-activity-12` branch.
- **TODO 1**: Declared `CAMERA`, `ACCESS_FINE_LOCATION`, `ACCESS_COARSE_LOCATION`, and `VIBRATE` permissions in the `AndroidManifest.xml`. Also added the `android.hardware.camera` feature.

### 2. Permissions Framework
- **TODO 2 & 3**: Created a robust `PermissionHelper.kt` with `permStatus()` to determine the state (Granted, NeedsRationale, Denied, NotAsked) and `rememberPermission()` to handle the lifecycle and request logic.
- **TODO 4**: Implemented `PermissionGate.kt` which provides a reusable UI wrapper for all four permission states.

### 3. Hardware APIs
- **TODO 5 & 6**: Implemented accelerometer reading in `Accelerometer.kt` with proper lifecycle management. The `LevelCard.kt` provides a visual "LEVEL ✓" indicator when the device is flat.
- **TODO 7, 8 & 9**: Set up CameraX in `CameraPreview.kt` and `Photo.kt`. Users can take photos which are saved to the app's cache directory.
- **TODO 10, 11 & 12**: Integrated Google Play Services for location tracking in `Location.kt` and `LocationCard.kt`. The app correctly handles both precise and approximate location requests.

### 4. Bonus Features
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
- `07-branch.png`: Git branch showing `* lab-activity-12` and the last commit.
- `08-shake-capture.png`: Bonus screenshot showing the "Shake capture" Logcat entry and the app thumbnail.

The app builds successfully and adheres to the LiceoFieldKit design requirements.
