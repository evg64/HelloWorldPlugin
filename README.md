For now we can launch this project with:
```
./gradlew runIde
```
However if to switch from using "intellijIdeaCommunity" to local IDE instance in build.gradle.kts, then build breaks with the following error:
```
e: file:///.../src/main/kotlin/com/helloworld/actions/HelloWorldAction.kt:3:42 Unresolved reference 'AnAction'
```
To switch to local IDE instance just comment out line 21 in build.gradle.kts and uncomment line 22:
```
dependencies {
    intellijPlatform {
        intellijIdeaCommunity("2024.3.1")
        // local("/Applications/IntelliJ IDEA CE.app/Contents")
        ...
   }
   ...
}
```