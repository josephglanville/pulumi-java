// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.redhatopenshift.inputs.GetOpenShiftClusterArgs;
import io.pulumi.azurenative.redhatopenshift.inputs.ListOpenShiftClusterAdminCredentialsArgs;
import io.pulumi.azurenative.redhatopenshift.inputs.ListOpenShiftClusterCredentialsArgs;
import io.pulumi.azurenative.redhatopenshift.outputs.GetOpenShiftClusterResult;
import io.pulumi.azurenative.redhatopenshift.outputs.ListOpenShiftClusterAdminCredentialsResult;
import io.pulumi.azurenative.redhatopenshift.outputs.ListOpenShiftClusterCredentialsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class RedhatopenshiftFunctions {
    /**
     * OpenShiftCluster represents an Azure Red Hat OpenShift cluster.
     * API Version: 2020-04-30.
     * 
     */
    public static CompletableFuture<GetOpenShiftClusterResult> getOpenShiftCluster(GetOpenShiftClusterArgs args) {
        return getOpenShiftCluster(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOpenShiftClusterResult> getOpenShiftCluster(GetOpenShiftClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:redhatopenshift:getOpenShiftCluster", TypeShape.of(GetOpenShiftClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * OpenShiftClusterAdminKubeconfig represents an OpenShift cluster's admin kubeconfig.
     * API Version: 2021-09-01-preview.
     * 
     */
    public static CompletableFuture<ListOpenShiftClusterAdminCredentialsResult> listOpenShiftClusterAdminCredentials(ListOpenShiftClusterAdminCredentialsArgs args) {
        return listOpenShiftClusterAdminCredentials(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListOpenShiftClusterAdminCredentialsResult> listOpenShiftClusterAdminCredentials(ListOpenShiftClusterAdminCredentialsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:redhatopenshift:listOpenShiftClusterAdminCredentials", TypeShape.of(ListOpenShiftClusterAdminCredentialsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * OpenShiftClusterCredentials represents an OpenShift cluster's credentials
     * API Version: 2020-04-30.
     * 
     */
    public static CompletableFuture<ListOpenShiftClusterCredentialsResult> listOpenShiftClusterCredentials(ListOpenShiftClusterCredentialsArgs args) {
        return listOpenShiftClusterCredentials(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListOpenShiftClusterCredentialsResult> listOpenShiftClusterCredentials(ListOpenShiftClusterCredentialsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:redhatopenshift:listOpenShiftClusterCredentials", TypeShape.of(ListOpenShiftClusterCredentialsResult.class), args, Utilities.withVersion(options));
    }
}