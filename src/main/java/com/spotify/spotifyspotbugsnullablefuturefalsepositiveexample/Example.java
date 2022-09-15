package com.spotify.spotifyspotbugsnullablefuturefalsepositiveexample;

import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Example {

  public CompletableFuture<@Nullable String> getFutureWithNullableValue() {
    return CompletableFuture.completedFuture(null);
  }

  public @NotNull CompletableFuture<@Nullable String> getNotNullFutureWithNullableValue() {
    return CompletableFuture.completedFuture(null);
  }

  public void triggerIssue() {
    // This is not fine? It's seemingly inferring the @Nullable to affect the return value of the
    // actual method.
    this.getFutureWithNullableValue().thenAccept(s -> System.out.println("s = " + s));

    // This is luckily OK, as the future is marked not-null.
    this.getNotNullFutureWithNullableValue().thenAccept(s -> System.out.println("s = " + s));
  }
}
