// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.workspaces.inputs.GetBundleArgs;
import io.pulumi.aws.workspaces.inputs.GetDirectoryArgs;
import io.pulumi.aws.workspaces.inputs.GetImageArgs;
import io.pulumi.aws.workspaces.inputs.GetWorkspaceArgs;
import io.pulumi.aws.workspaces.outputs.GetBundleResult;
import io.pulumi.aws.workspaces.outputs.GetDirectoryResult;
import io.pulumi.aws.workspaces.outputs.GetImageResult;
import io.pulumi.aws.workspaces.outputs.GetWorkspaceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class WorkspacesFunctions {
    /**
     * Retrieve information about an AWS WorkSpaces bundle.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBundleResult> getBundle() {
        return getBundle(GetBundleArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetBundleResult> getBundle(GetBundleArgs args) {
        return getBundle(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetBundleResult> getBundle(GetBundleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:workspaces/getBundle:getBundle", TypeShape.of(GetBundleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about an AWS WorkSpaces directory.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDirectoryResult> getDirectory(GetDirectoryArgs args) {
        return getDirectory(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDirectoryResult> getDirectory(GetDirectoryArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:workspaces/getDirectory:getDirectory", TypeShape.of(GetDirectoryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a Workspaces image.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetImageResult> getImage(GetImageArgs args) {
        return getImage(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetImageResult> getImage(GetImageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:workspaces/getImage:getImage", TypeShape.of(GetImageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a workspace in [AWS Workspaces](https://docs.aws.amazon.com/workspaces/latest/adminguide/amazon-workspaces.html) Service.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetWorkspaceResult> getWorkspace() {
        return getWorkspace(GetWorkspaceArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetWorkspaceResult> getWorkspace(GetWorkspaceArgs args) {
        return getWorkspace(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetWorkspaceResult> getWorkspace(GetWorkspaceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:workspaces/getWorkspace:getWorkspace", TypeShape.of(GetWorkspaceResult.class), args, Utilities.withVersion(options));
    }
}