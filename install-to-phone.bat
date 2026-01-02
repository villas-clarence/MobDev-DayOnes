@echo off
echo Building EduSync+ APK...
call gradlew.bat assembleDebug

echo.
echo Connect your Android phone via USB
echo Make sure USB Debugging is enabled
echo.
pause

echo Installing app to phone...
adb install app\build\outputs\apk\debug\app-debug.apk

echo.
echo App installed! Check your phone.
pause