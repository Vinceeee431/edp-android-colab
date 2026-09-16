# Screenshot Submission Plan

This plan outlines the steps to capture and save the required screenshots for Lab Activity 10.

## User Review Required

> [!IMPORTANT]
> I need to know your **Full Name** to use as the sender for screenshot `03-my-message.png`. Please provide it.
> Also, for `05-logcat.png` and `06-branch.png`, I will attempt to capture the terminal output. If this is not acceptable, you may need to take these manually from your IDE.

## Proposed Changes

### Project Structure
- Create a `screenshots` folder in the root directory.

### Automation & Capture
- Use `adb` to capture the screen of the emulator.
- Use `adb pull` to move the screenshots into the `screenshots` folder.
- Use PowerShell to capture terminal outputs for branch and logcat screenshots.

### Screenshots to Capture
1.  **01-loading.png**: Captured while the app shows the `CircularProgressIndicator`.
2.  **02-message-list.png**: Captured after successfully fetching messages from the API.
3.  **03-my-message.png**: Captured after sending a message with the user's name.
4.  **04-error-retry.png**: Captured after disabling internet and clicking Retry.
5.  **05-logcat.png**: Captured showing the OkHttp log lines.
6.  **06-branch.png**: Captured showing the `lab-activity-10` branch in the terminal.
7.  **07-offline.png** (Bonus): Attempted if caching is implemented (currently it is not, so this will be skipped unless requested).

## Verification Plan

### Manual Verification
- I will list the files in the `screenshots` folder to verify they exist and are correctly named.
- I will check the content of the screenshots using `take_screenshot` to ensure they show the correct states.
