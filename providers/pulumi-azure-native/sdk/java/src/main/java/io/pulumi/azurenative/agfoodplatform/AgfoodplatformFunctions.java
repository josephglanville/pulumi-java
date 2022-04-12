// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.agfoodplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.agfoodplatform.inputs.GetExtensionArgs;
import io.pulumi.azurenative.agfoodplatform.inputs.GetFarmBeatsModelArgs;
import io.pulumi.azurenative.agfoodplatform.outputs.GetExtensionResult;
import io.pulumi.azurenative.agfoodplatform.outputs.GetFarmBeatsModelResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AgfoodplatformFunctions {
    /**
     * Extension resource.
     * API Version: 2020-05-12-preview.
     * 
     */
    public static CompletableFuture<GetExtensionResult> getExtension(GetExtensionArgs args) {
        return getExtension(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetExtensionResult> getExtension(GetExtensionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:agfoodplatform:getExtension", TypeShape.of(GetExtensionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * FarmBeats ARM Resource.
     * API Version: 2020-05-12-preview.
     * 
     */
    public static CompletableFuture<GetFarmBeatsModelResult> getFarmBeatsModel(GetFarmBeatsModelArgs args) {
        return getFarmBeatsModel(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetFarmBeatsModelResult> getFarmBeatsModel(GetFarmBeatsModelArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:agfoodplatform:getFarmBeatsModel", TypeShape.of(GetFarmBeatsModelResult.class), args, Utilities.withVersion(options));
    }
}
