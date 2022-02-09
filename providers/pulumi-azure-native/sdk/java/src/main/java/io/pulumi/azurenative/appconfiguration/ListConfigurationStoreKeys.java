// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appconfiguration;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.appconfiguration.inputs.ListConfigurationStoreKeysArgs;
import io.pulumi.azurenative.appconfiguration.outputs.ListConfigurationStoreKeysResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListConfigurationStoreKeys {
    public static CompletableFuture<ListConfigurationStoreKeysResult> invokeAsync(ListConfigurationStoreKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appconfiguration:listConfigurationStoreKeys", TypeShape.of(ListConfigurationStoreKeysResult.class), args == null ? ListConfigurationStoreKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}
