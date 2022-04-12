// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.assuredworkloads_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.assuredworkloads_v1.inputs.GetWorkloadArgs;
import io.pulumi.googlenative.assuredworkloads_v1.outputs.GetWorkloadResult;
import java.util.concurrent.CompletableFuture;

public final class Assuredworkloads_v1Functions {
    /**
     * Gets Assured Workload associated with a CRM Node
     * 
     */
    public static CompletableFuture<GetWorkloadResult> getWorkload(GetWorkloadArgs args) {
        return getWorkload(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetWorkloadResult> getWorkload(GetWorkloadArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:assuredworkloads/v1:getWorkload", TypeShape.of(GetWorkloadResult.class), args, Utilities.withVersion(options));
    }
}
