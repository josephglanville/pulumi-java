// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mskconnect;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.mskconnect.inputs.GetCustomPluginArgs;
import io.pulumi.aws.mskconnect.inputs.GetWorkerConfigurationArgs;
import io.pulumi.aws.mskconnect.outputs.GetCustomPluginResult;
import io.pulumi.aws.mskconnect.outputs.GetWorkerConfigurationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class MskconnectFunctions {
    /**
     * Get information on an Amazon MSK Connect custom plugin.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetCustomPluginResult> getCustomPlugin(GetCustomPluginArgs args) {
        return getCustomPlugin(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCustomPluginResult> getCustomPlugin(GetCustomPluginArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:mskconnect/getCustomPlugin:getCustomPlugin", TypeShape.of(GetCustomPluginResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get information on an Amazon MSK Connect Worker Configuration.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetWorkerConfigurationResult> getWorkerConfiguration(GetWorkerConfigurationArgs args) {
        return getWorkerConfiguration(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetWorkerConfigurationResult> getWorkerConfiguration(GetWorkerConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:mskconnect/getWorkerConfiguration:getWorkerConfiguration", TypeShape.of(GetWorkerConfigurationResult.class), args, Utilities.withVersion(options));
    }
}
