@echo off
echo ================================
echo    Building EduSync+ APK
echo ================================
echo.

echo Cleaning previous builds...
call gradlew.bat clean

echo.
echo Building debug APK...
call gradlew.bat assembleDebug

echo.
echo ================================
echo Build complete!
echo.
echo APK Location:
echo app\build\outputs\apk\debug\app-debug.apk
echo.
echo You can:
echo 1. Install on phone via USB
echo 2. Upload to online emulator
echo 3. Share with others for testing
echo ================================
pause