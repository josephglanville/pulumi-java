package io.pulumi.deployment.internal;

import io.pulumi.Stack;
import io.pulumi.resources.StackOptions;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public interface Runner {
    <T> void registerTask(String description, CompletableFuture<T> task);

    CompletableFuture<Integer> runAsyncFuture(Supplier<CompletableFuture<Map<String, Optional<Object>>>> callback, @Nullable StackOptions options);

    <T extends Stack> CompletableFuture<Integer> runAsync(Class<T> stackType);

    <T extends Stack> CompletableFuture<Integer> runAsync(Supplier<T> stackFactory);

//    <T extends Stack> CompletableFuture<Integer> runAsync(ServiceProvider serviceProvider); // TODO ?!
}