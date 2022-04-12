// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.run_v1.inputs.GetDomainMappingArgs;
import io.pulumi.googlenative.run_v1.inputs.GetJobIamPolicyArgs;
import io.pulumi.googlenative.run_v1.inputs.GetServiceArgs;
import io.pulumi.googlenative.run_v1.inputs.GetServiceIamPolicyArgs;
import io.pulumi.googlenative.run_v1.outputs.GetDomainMappingResult;
import io.pulumi.googlenative.run_v1.outputs.GetJobIamPolicyResult;
import io.pulumi.googlenative.run_v1.outputs.GetServiceIamPolicyResult;
import io.pulumi.googlenative.run_v1.outputs.GetServiceResult;
import java.util.concurrent.CompletableFuture;

public final class Run_v1Functions {
    /**
     * Get information about a domain mapping.
     * 
     */
    public static CompletableFuture<GetDomainMappingResult> getDomainMapping(GetDomainMappingArgs args) {
        return getDomainMapping(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDomainMappingResult> getDomainMapping(GetDomainMappingArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:run/v1:getDomainMapping", TypeShape.of(GetDomainMappingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get the IAM Access Control policy currently in effect for the given job. This result does not include any inherited policies.
     * 
     */
    public static CompletableFuture<GetJobIamPolicyResult> getJobIamPolicy(GetJobIamPolicyArgs args) {
        return getJobIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetJobIamPolicyResult> getJobIamPolicy(GetJobIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:run/v1:getJobIamPolicy", TypeShape.of(GetJobIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get information about a service.
     * 
     */
    public static CompletableFuture<GetServiceResult> getService(GetServiceArgs args) {
        return getService(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetServiceResult> getService(GetServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:run/v1:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get the IAM Access Control policy currently in effect for the given Cloud Run service. This result does not include any inherited policies.
     * 
     */
    public static CompletableFuture<GetServiceIamPolicyResult> getServiceIamPolicy(GetServiceIamPolicyArgs args) {
        return getServiceIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetServiceIamPolicyResult> getServiceIamPolicy(GetServiceIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:run/v1:getServiceIamPolicy", TypeShape.of(GetServiceIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
