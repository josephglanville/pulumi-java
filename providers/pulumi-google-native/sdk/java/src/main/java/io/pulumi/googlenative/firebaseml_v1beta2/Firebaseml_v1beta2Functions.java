// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaseml_v1beta2;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.firebaseml_v1beta2.inputs.GetModelArgs;
import io.pulumi.googlenative.firebaseml_v1beta2.outputs.GetModelResult;
import java.util.concurrent.CompletableFuture;

public final class Firebaseml_v1beta2Functions {
    /**
     * Gets a model resource.
     * 
     */
    public static CompletableFuture<GetModelResult> getModel(GetModelArgs args) {
        return getModel(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetModelResult> getModel(GetModelArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:firebaseml/v1beta2:getModel", TypeShape.of(GetModelResult.class), args, Utilities.withVersion(options));
    }
}