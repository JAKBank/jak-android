# JAK App

JAK App is an open source app for JAK Members Bank in Sweden (see https://groups.google.com/forum/#!forum/jakapp).

### Setting up JAK App in Eclipse
(Currently we use Eclipse, but we're happy to accept contributions to make it IDE agnostic)

1. Download and install [ADT Bundle](http://developer.android.com/sdk/installing/bundle.html) or install [Eclipse/ADT](http://developer.android.com/sdk/index.html) separately
2. Clone this project to some place, not in your Eclipse-workspace folder. You can also fork the project if you prefer to contribute using pull requests
3. In Eclipse choose File-menu > Import > Android > Existing Android Code Into Workspace
4. Browse to the parent of the source code folder (jakapp)
5. Make sure to clear (Uncheck) "Copy projects into workspace" and click Finish
6. Setup [android-support-v7-appcompat as a library project](https://developer.android.com/tools/support-library/setup.html#libs-with-res) in your workspace. If you're using Eclipse, follow the instructions in the section "Adding libraries with resources"
7. Go to the Android preferences of your project and change the path of the support library if it doesn't match already

We use [git-flow](https://github.com/nvie/gitflow) and currently there is one branch called "develop" and one called "master". Push your commits to develop. The master branch is where releases are published. If you are using Eclipse, it's a good idea to use a Git-plugin like EGit or similar. If you are pulling from the command line, make sure to hit Refresh in Eclipse to make it pick up the changes.

In order to run the project in the Android emulator you have to define a device in the Android Virtual Device Manager (accessible in Eclipse from the Window menu). Open the Manager and check if there are any active devices. If not select "New" and fill out "AVD Name" and from the Device drop-down select the device corresponding to your phone (for example Nexus 5), then select CPU/ABI and Skin. The rest of the fields should auto-populate, but change options if neccessary. Lastly, press Ok to create the device. Once this is done you should be able to run the project by right-click on it in the Project Explorer and selecting "Run As/Android Application". The emulator could take up to 10 minutes to start on a slow machine. If the Eclipse deploy fails, let the emulator start properly first and then select "Run As" again to deploy to the active emulator.

We just started this project so you will likely run into some issues.
If you have any questions or suggestions regarding this code please
contact Adam Nybäck (adam.nyback on Skype or email adam@anyro.se) or
post in the [google group](https://groups.google.com/forum/#!forum/jakapp).
Thanks.

