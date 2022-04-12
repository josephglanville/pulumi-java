// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.oslogin_v1alpha;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.oslogin_v1alpha.inputs.GetSshPublicKeyArgs;
import io.pulumi.googlenative.oslogin_v1alpha.outputs.GetSshPublicKeyResult;
import java.util.concurrent.CompletableFuture;

public final class Oslogin_v1alphaFunctions {
    /**
     * Retrieves an SSH public key.
     * 
     */
    public static CompletableFuture<GetSshPublicKeyResult> getSshPublicKey(GetSshPublicKeyArgs args) {
        return getSshPublicKey(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSshPublicKeyResult> getSshPublicKey(GetSshPublicKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:oslogin/v1alpha:getSshPublicKey", TypeShape.of(GetSshPublicKeyResult.class), args, Utilities.withVersion(options));
    }
}
