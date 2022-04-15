// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.secretmanager.inputs.GetSecretArgs;
import io.pulumi.gcp.secretmanager.inputs.GetSecretVersionArgs;
import io.pulumi.gcp.secretmanager.outputs.GetSecretResult;
import io.pulumi.gcp.secretmanager.outputs.GetSecretVersionResult;
import java.util.concurrent.CompletableFuture;

public final class SecretmanagerFunctions {
    /**
     * Use this data source to get information about a Secret Manager Secret
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetSecretResult> getSecret(GetSecretArgs args) {
        return getSecret(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSecretResult> getSecret(GetSecretArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:secretmanager/getSecret:getSecret", TypeShape.of(GetSecretResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a Secret Manager secret's version. For more information see the [official documentation](https://cloud.google.com/secret-manager/docs/) and [API](https://cloud.google.com/secret-manager/docs/reference/rest/v1/projects.secrets.versions).
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetSecretVersionResult> getSecretVersion(GetSecretVersionArgs args) {
        return getSecretVersion(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSecretVersionResult> getSecretVersion(GetSecretVersionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:secretmanager/getSecretVersion:getSecretVersion", TypeShape.of(GetSecretVersionResult.class), args, Utilities.withVersion(options));
    }
}