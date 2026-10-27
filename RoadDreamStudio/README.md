# RoadDream Studio — Native Android App

A standalone **native Java Android application** with its own Activity, dashboard, theme picker, GPS telemetry and user settings. This is deliberately not a DreamService-only screensaver, and it does not depend on Android WebView.

## Build
Open this folder in Android Studio (JDK 17, Android SDK 35, Gradle 8.10.2) and select **Build > Build APK(s)**. Alternatively, the isolated GitHub Actions build workflow produces a signed **debug/test APK** at `dist/RoadDreamStudio-v3-debug.apk` on the `roaddream-native-mobile` branch, if GitHub Actions is enabled for this repository.

## Operation
- App opens immediately to a normal **Drive** screen without requesting permission.
- **Enable GPS** explicitly requests foreground location. Only fresh location fixes can show *LIVE GPS* speed. No fabricated real-time readings.
- **Demo** has a clearly marked simulated speed slider for testing animations.
- Themes 1-10, Insights and Settings are accessible via bottom navigation.
- Optional full-screen immersive mode; standard navigation is the default.
- Settings saved locally using SharedPreferences. No internet, microphone, SMS, camera, boot receiver, foreground service, background location, ads or trackers.
- Holographic car/road is procedural **2D/2.5D animation**, not a photorealistic 3D model. Audio level display (if shown) is an artistic effect, not a real dB measurement.

## Safety
Use while safely parked or as a passenger. GPS speed is supplemental only, never a replacement for the manufacturer's speedometer. Keep Play Protect enabled. Debug-signed sideload APK may trigger an unknown-source warning and is not a Play Store-certified release.

## Installation
This build has package ID `com.roaddream.studio`, separate from old broken `com.roaddream.mobile`; install side-by-side or uninstall the old app when ready. If app fails to open, collect logcat from Android Studio: `adb logcat -d -s AndroidRuntime ActivityTaskManager`.
