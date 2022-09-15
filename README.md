# SpotBugs nullity false positive example

This project exists as a proof of a SpotBugs `NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE` false positive.

## Compiling and checking

You need a Java 17 JDK installed and on the PATH. Run `./mvnw clean verify`.

This has only been tested on macOS with `Temurin-17.0.3+7`.

## Output

The output you should get from running the check is:

```
[INFO] --- spotbugs-maven-plugin:4.7.2.0:check (default) @ spotify-spotbugs-nullable-future-false-positive-example ---
[INFO] BugInstance size is 1
[INFO] Error size is 0
[INFO] Total bugs: 1
[ERROR] Medium: Possible null pointer dereference in com.spotify.spotifyspotbugsnullablefuturefalsepositiveexample.Example.triggerIssue() due to return value of called method [com.spotify.spotifyspotbugsnullablefuturefalsepositiveexample.Example, com.spotify.spotifyspotbugsnullablefuturefalsepositiveexample.Example] Dereferenced at Example.java:[line 20]Known null at Example.java:[line 20] NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE
```

## Licence

Note that this code is not owned by the author, but rather Spotify AB.
This project is licensed under the MIT Licence. See the licence text [here](./LICENCE).

Ownership details:

```
Spotify AB
Regeringsgata 19
111 53 Stockholm
Sweden
```