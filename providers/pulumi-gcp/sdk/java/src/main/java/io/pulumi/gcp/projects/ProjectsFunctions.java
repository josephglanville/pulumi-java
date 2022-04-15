// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.projects.inputs.GetOrganizationPolicyArgs;
import io.pulumi.gcp.projects.inputs.GetProjectArgs;
import io.pulumi.gcp.projects.outputs.GetOrganizationPolicyResult;
import io.pulumi.gcp.projects.outputs.GetProjectResult;
import java.util.concurrent.CompletableFuture;

public final class ProjectsFunctions {
    /**
     * Allows management of Organization policies for a Google Project. For more information see
     * [the official
     * documentation](https://cloud.google.com/resource-manager/docs/organization-policy/overview)
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetOrganizationPolicyResult> getOrganizationPolicy(GetOrganizationPolicyArgs args) {
        return getOrganizationPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOrganizationPolicyResult> getOrganizationPolicy(GetOrganizationPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:projects/getOrganizationPolicy:getOrganizationPolicy", TypeShape.of(GetOrganizationPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about a set of projects based on a filter. See the
     * [REST API](https://cloud.google.com/resource-manager/reference/rest/v1/projects/list)
     * for more details.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetProjectResult> getProject(GetProjectArgs args) {
        return getProject(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetProjectResult> getProject(GetProjectArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:projects/getProject:getProject", TypeShape.of(GetProjectResult.class), args, Utilities.withVersion(options));
    }
}