// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sso;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sso.inputs.GetAssignmentArgs;
import io.pulumi.awsnative.sso.inputs.GetInstanceAccessControlAttributeConfigurationArgs;
import io.pulumi.awsnative.sso.inputs.GetPermissionSetArgs;
import io.pulumi.awsnative.sso.outputs.GetAssignmentResult;
import io.pulumi.awsnative.sso.outputs.GetInstanceAccessControlAttributeConfigurationResult;
import io.pulumi.awsnative.sso.outputs.GetPermissionSetResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class SsoFunctions {
    /**
     * Resource Type definition for SSO assignmet
     * 
     */
    public static CompletableFuture<GetAssignmentResult> getAssignment(GetAssignmentArgs args) {
        return getAssignment(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAssignmentResult> getAssignment(GetAssignmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:sso:getAssignment", TypeShape.of(GetAssignmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for SSO InstanceAccessControlAttributeConfiguration
     * 
     */
    public static CompletableFuture<GetInstanceAccessControlAttributeConfigurationResult> getInstanceAccessControlAttributeConfiguration(GetInstanceAccessControlAttributeConfigurationArgs args) {
        return getInstanceAccessControlAttributeConfiguration(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetInstanceAccessControlAttributeConfigurationResult> getInstanceAccessControlAttributeConfiguration(GetInstanceAccessControlAttributeConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:sso:getInstanceAccessControlAttributeConfiguration", TypeShape.of(GetInstanceAccessControlAttributeConfigurationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for SSO PermissionSet
     * 
     */
    public static CompletableFuture<GetPermissionSetResult> getPermissionSet(GetPermissionSetArgs args) {
        return getPermissionSet(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPermissionSetResult> getPermissionSet(GetPermissionSetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:sso:getPermissionSet", TypeShape.of(GetPermissionSetResult.class), args, Utilities.withVersion(options));
    }
}