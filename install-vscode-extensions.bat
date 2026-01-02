@echo off
echo ================================
echo Installing VS Code Extensions
echo for Android Development
echo ================================
echo.

echo Installing Kotlin support...
code --install-extension fwcd.kotlin

echo Installing Java support...
code --install-extension vscjava.vscode-java-pack

echo Installing Gradle support...
code --install-extension vscjava.vscode-gradle

echo Installing Android emulator support...
code --install-extension diemasm.vscode-android-ios-emulator

echo Installing XML support...
code --install-extension redhat.vscode-xml

echo Installing Git enhancements...
code --install-extension eamodio.gitlens

echo.
echo ================================
echo Optional Extensions
echo ================================

echo Installing Code Runner...
code --install-extension formulahendry.code-runner

echo Installing Material Icons...
code --install-extension pkief.material-icon-theme

echo Installing Auto Rename Tag...
code --install-extension formulahendry.auto-rename-tag

echo.
echo ================================
echo Installation Complete!
echo ================================
echo.
echo Restart VS Code to activate all extensions
echo.
pause