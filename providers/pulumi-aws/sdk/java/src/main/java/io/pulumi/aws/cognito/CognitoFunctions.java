// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cognito.inputs.GetUserPoolClientArgs;
import io.pulumi.aws.cognito.inputs.GetUserPoolClientsArgs;
import io.pulumi.aws.cognito.inputs.GetUserPoolSigningCertificateArgs;
import io.pulumi.aws.cognito.inputs.GetUserPoolsArgs;
import io.pulumi.aws.cognito.outputs.GetUserPoolClientResult;
import io.pulumi.aws.cognito.outputs.GetUserPoolClientsResult;
import io.pulumi.aws.cognito.outputs.GetUserPoolSigningCertificateResult;
import io.pulumi.aws.cognito.outputs.GetUserPoolsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class CognitoFunctions {
    /**
     * Provides a Cognito User Pool Client resource.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetUserPoolClientResult> getUserPoolClient(GetUserPoolClientArgs args) {
        return getUserPoolClient(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetUserPoolClientResult> getUserPoolClient(GetUserPoolClientArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cognito/getUserPoolClient:getUserPoolClient", TypeShape.of(GetUserPoolClientResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get a list of Cognito user pools clients for a Cognito IdP user pool.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetUserPoolClientsResult> getUserPoolClients(GetUserPoolClientsArgs args) {
        return getUserPoolClients(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetUserPoolClientsResult> getUserPoolClients(GetUserPoolClientsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cognito/getUserPoolClients:getUserPoolClients", TypeShape.of(GetUserPoolClientsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the signing certificate for a Cognito IdP user pool.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetUserPoolSigningCertificateResult> getUserPoolSigningCertificate(GetUserPoolSigningCertificateArgs args) {
        return getUserPoolSigningCertificate(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetUserPoolSigningCertificateResult> getUserPoolSigningCertificate(GetUserPoolSigningCertificateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cognito/getUserPoolSigningCertificate:getUserPoolSigningCertificate", TypeShape.of(GetUserPoolSigningCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get a list of cognito user pools.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetUserPoolsResult> getUserPools(GetUserPoolsArgs args) {
        return getUserPools(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetUserPoolsResult> getUserPools(GetUserPoolsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cognito/getUserPools:getUserPools", TypeShape.of(GetUserPoolsResult.class), args, Utilities.withVersion(options));
    }
}