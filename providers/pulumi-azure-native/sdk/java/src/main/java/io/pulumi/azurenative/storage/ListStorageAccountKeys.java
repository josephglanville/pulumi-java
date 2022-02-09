// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storage.inputs.ListStorageAccountKeysArgs;
import io.pulumi.azurenative.storage.outputs.ListStorageAccountKeysResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListStorageAccountKeys {
    public static CompletableFuture<ListStorageAccountKeysResult> invokeAsync(ListStorageAccountKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:storage:listStorageAccountKeys", TypeShape.of(ListStorageAccountKeysResult.class), args == null ? ListStorageAccountKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}
