[![Release](https://jitpack.io/v/Sublimis/SteadyViews.svg)](https://jitpack.io/#Sublimis/SteadyViews)

# ⛵ SteadyViews library for Android and Wear 🏝️

### Make on-screen reading easier by softening small movements of mobile screens.


Ever been in a moving vehicle trying to read?


- [Stilly screen stabilizer](https://github.com/Sublimis/SteadyScreen/) is a service that allows compatible Android and Wear apps to easily soften small device movements within their user interface.
- Use the SteadyView library to make your Android or Wear application compatible with very little effort.


## How to make your application compatible

- The easiest way is to use the [SteadyViews](https://github.com/Sublimis/SteadyViews) library, which contains ready-to-use "Steady…" implementations of most common Android layouts (like e.g. LinearLayout or ConstraintLayout).
- Use the [SteadyView](https://github.com/Sublimis/SteadyView) library if you have a custom View or ViewGroup that you want to make compatible.
- Use the [SteadyService](https://github.com/Sublimis/SteadyService) library if you want to implement your own screen stabilizer service that won't need [Stilly](https://play.google.com/store/apps/details?id=com.sublimis.steadyscreen) to be installed.


## What happens if the service is not installed

Absolutely nothing. Your Views and ViewGroups continue to function as if the Stilly screen stabilizer service never existed, and we all get on with our merry lives.


## About the service

[Stilly](https://play.google.com/store/apps/details?id=com.sublimis.steadyscreen) application uses the [AccessibilityService API](https://developer.android.com/reference/android/accessibilityservice/AccessibilityService) to retrieve interactive windows on the screen, in order to find compatible ones. The service then sends multiple "move window" accessibility actions to such windows, as needed, to perform the intended function. The data accessed during the process, using Android's AccessibilityService API, can be of personal and confidential nature (i.e. sensitive information). The application never collects, stores nor shares that data in any way.

⚡ The service has been crafted very meticulously, in order to minimize resource usage and maximize performance. It uses only the accelerometer sensor to achieve the goal.


## Project components

- [Stilly app](https://play.google.com/store/apps/details?id=com.sublimis.steadyscreen): The engine behind the scenes.
- [SteadyService library](https://github.com/Sublimis/SteadyService): If you want to implement your own screen stabilizer service that won't need Stilly.
- SteadyViews library (this): Ready-to-use "Steady…" implementations of most common Android layouts (like e.g. LinearLayout or ConstraintLayout).
- [SteadyView library](https://github.com/Sublimis/SteadyView): Core classes and methods. To be used for custom View or ViewGroup implementations.


## More info

Please see the [SteadyScreen](https://github.com/Sublimis/SteadyScreen) project for more details.

