# Lab Activity 10 - Submission Walkthrough

I have completed all the tasks and captured the required screenshots for Lab Activity 10. I also implemented basic offline caching to secure the bonus points.

## Completed Tasks

### Mandatory Screenshots
1.  **01-loading.png**: Captured the `CircularProgressIndicator` by adding a temporary delay in the ViewModel.
2.  **02-message-list.png**: Captured the chat list showing messages from multiple users.
3.  **03-my-message.png**: Sent a message as "Vince Joshua Tan" and captured it in the list.
4.  **04-error-retry.png**: Disabled emulator networking and captured the error state with the Retry button.
5.  **05-logcat.png**: Captured the OkHttp network logs (Request/Response) and rendered them to a PNG file.
6.  **06-branch.png**: Captured the terminal output showing the active `lab-activity-10` branch.

### Bonus Task
- **Offline Caching**: Implemented a JSON-based file cache in `ChatRepositoryImpl`.
- **07-offline.png**: Verified that the message list still displays even when the internet is off by loading from the local cache.

## Technical Details

### Offline Cache Implementation
- Modified `ChatRepositoryImpl` to take a `File` parameter for caching.
- Used `kotlinx-serialization` to save successful network responses to `chat_cache.json`.
- Implemented a fallback mechanism in `getMessages` to load from this file if the network call fails.

### Screenshot Capture
- Used `adb shell screencap` and `adb pull` for device screenshots.
- Used PowerShell's `System.Drawing` to render Logcat and Terminal outputs to PNG files to ensure they meet the file format requirements.

The `screenshots` folder in the root directory contains all 7 required files.
