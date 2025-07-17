# CriminalIntent App

A crime reporting application that allows users to record and track crimes. The app includes features like adding crime details, taking photos, making phone calls, and managing crime reports.

## Development Environment

- Android Studio
- Pixel 6a (API 35, Android 15) - Emulator
- Samsung A21s (Android 12) - Physical Device

## Known Issues

### Camera Functionality
- The camera feature does not work properly on the Pixel 6a emulator (API 35, Android 15)
- This is a known issue with the emulator's camera implementation
- Solution: Use a physical device (tested and working on Samsung A21s with Android 12)

## Features

1. Crime Management
   - Add new crimes
   - Edit crime details
   - Mark crimes as solved
   - Delete crimes

2. Photo Integration
   - Take photos of crime scenes
   - View full-size photos
   - Store photos with crime records

3. Contact Integration
   - Choose suspects from contacts
   - Make phone calls to report crimes
   - Call hardcoded emergency numbers

4. Layout Support
   - Portrait and landscape layouts
   - Responsive design for different screen sizes

## Setup Instructions

1. Clone the repository
2. Open the project in Android Studio
3. Build and run the application
4. For testing camera features, use a physical device

## Testing Notes

- Camera functionality should be tested on a physical device
- The app has been tested and works properly on Samsung A21s (Android 12)
- Some features may behave differently on emulators vs physical devices

## Dependencies

- AndroidX libraries
- RecyclerView
- FileProvider
- MediaStore
- ContactsContract 