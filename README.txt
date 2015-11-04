How to import "volley":

1. Clone the repo from this url:

git clone https://android.googlesource.com/platform/frameworks/volley

2. In Android Studio goto File -> Import Module -> Specify the directory
   Enter the module name- “:Volley” (for internal project reference), hit finish.
   By now the gradle would start building the project. Let it complete.
3. Open build.gradle file for your app module
   In dependencies block add a line compile project(':Volley')
Go to Build menu -> Rebuild Project
You are done importing Android Volley to you project.