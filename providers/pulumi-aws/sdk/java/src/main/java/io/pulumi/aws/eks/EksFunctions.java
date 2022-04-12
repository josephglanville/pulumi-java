// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.eks.inputs.GetAddonArgs;
import io.pulumi.aws.eks.inputs.GetClusterArgs;
import io.pulumi.aws.eks.inputs.GetClusterAuthArgs;
import io.pulumi.aws.eks.inputs.GetNodeGroupArgs;
import io.pulumi.aws.eks.inputs.GetNodeGroupsArgs;
import io.pulumi.aws.eks.outputs.GetAddonResult;
import io.pulumi.aws.eks.outputs.GetClusterAuthResult;
import io.pulumi.aws.eks.outputs.GetClusterResult;
import io.pulumi.aws.eks.outputs.GetClustersResult;
import io.pulumi.aws.eks.outputs.GetNodeGroupResult;
import io.pulumi.aws.eks.outputs.GetNodeGroupsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.resources.InvokeArgs;
import java.util.concurrent.CompletableFuture;

public final class EksFunctions {
    /**
     * Retrieve information about an EKS add-on.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetAddonResult> getAddon(GetAddonArgs args) {
        return getAddon(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAddonResult> getAddon(GetAddonArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:eks/getAddon:getAddon", TypeShape.of(GetAddonResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about an EKS Cluster.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args) {
        return getCluster(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:eks/getCluster:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get an authentication token to communicate with an EKS cluster.
     * 
     * Uses IAM credentials from the AWS provider to generate a temporary token that is compatible with
     * [AWS IAM Authenticator](https://github.com/kubernetes-sigs/aws-iam-authenticator) authentication.
     * This can be used to authenticate to an EKS cluster or to a cluster that has the AWS IAM Authenticator
     * server configured.
     * 
     */
    public static CompletableFuture<GetClusterAuthResult> getClusterAuth(GetClusterAuthArgs args) {
        return getClusterAuth(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetClusterAuthResult> getClusterAuth(GetClusterAuthArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:eks/getClusterAuth:getClusterAuth", TypeShape.of(GetClusterAuthResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve EKS Clusters list
     * 
     */
    public static CompletableFuture<GetClustersResult> getClusters() {
        return getClusters(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetClustersResult> getClusters(InvokeArgs args) {
        return getClusters(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetClustersResult> getClusters(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:eks/getClusters:getClusters", TypeShape.of(GetClustersResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about an EKS Node Group.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetNodeGroupResult> getNodeGroup(GetNodeGroupArgs args) {
        return getNodeGroup(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNodeGroupResult> getNodeGroup(GetNodeGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:eks/getNodeGroup:getNodeGroup", TypeShape.of(GetNodeGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve the EKS Node Groups associated with a named EKS cluster. This will allow you to pass a list of Node Group names to other resources.
     * 
     */
    public static CompletableFuture<GetNodeGroupsResult> getNodeGroups(GetNodeGroupsArgs args) {
        return getNodeGroups(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNodeGroupsResult> getNodeGroups(GetNodeGroupsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:eks/getNodeGroups:getNodeGroups", TypeShape.of(GetNodeGroupsResult.class), args, Utilities.withVersion(options));
    }
}
