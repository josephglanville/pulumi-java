// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.offazure;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.offazure.inputs.GetHyperVSiteArgs;
import io.pulumi.azurenative.offazure.inputs.GetPrivateEndpointConnectionArgs;
import io.pulumi.azurenative.offazure.inputs.GetSiteArgs;
import io.pulumi.azurenative.offazure.outputs.GetHyperVSiteResult;
import io.pulumi.azurenative.offazure.outputs.GetPrivateEndpointConnectionResult;
import io.pulumi.azurenative.offazure.outputs.GetSiteResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class OffazureFunctions {
    /**
     * Site REST Resource.
     * API Version: 2020-01-01.
     * 
     */
    public static CompletableFuture<GetHyperVSiteResult> getHyperVSite(GetHyperVSiteArgs args) {
        return getHyperVSite(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetHyperVSiteResult> getHyperVSite(GetHyperVSiteArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:offazure:getHyperVSite", TypeShape.of(GetHyperVSiteResult.class), args, Utilities.withVersion(options));
    }
    /**
     * REST model used to encapsulate the user visible state of a PrivateEndpoint.
     * API Version: 2020-07-07.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:offazure:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Site REST Resource.
     * API Version: 2020-01-01.
     * 
     */
    public static CompletableFuture<GetSiteResult> getSite(GetSiteArgs args) {
        return getSite(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSiteResult> getSite(GetSiteArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:offazure:getSite", TypeShape.of(GetSiteResult.class), args, Utilities.withVersion(options));
    }
}