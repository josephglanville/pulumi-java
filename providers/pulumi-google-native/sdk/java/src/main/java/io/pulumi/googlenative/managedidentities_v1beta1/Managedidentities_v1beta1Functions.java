// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.managedidentities_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.managedidentities_v1beta1.inputs.GetBackupArgs;
import io.pulumi.googlenative.managedidentities_v1beta1.inputs.GetDomainArgs;
import io.pulumi.googlenative.managedidentities_v1beta1.inputs.GetDomainBackupIamPolicyArgs;
import io.pulumi.googlenative.managedidentities_v1beta1.inputs.GetDomainIamPolicyArgs;
import io.pulumi.googlenative.managedidentities_v1beta1.inputs.GetPeeringArgs;
import io.pulumi.googlenative.managedidentities_v1beta1.inputs.GetPeeringIamPolicyArgs;
import io.pulumi.googlenative.managedidentities_v1beta1.outputs.GetBackupResult;
import io.pulumi.googlenative.managedidentities_v1beta1.outputs.GetDomainBackupIamPolicyResult;
import io.pulumi.googlenative.managedidentities_v1beta1.outputs.GetDomainIamPolicyResult;
import io.pulumi.googlenative.managedidentities_v1beta1.outputs.GetDomainResult;
import io.pulumi.googlenative.managedidentities_v1beta1.outputs.GetPeeringIamPolicyResult;
import io.pulumi.googlenative.managedidentities_v1beta1.outputs.GetPeeringResult;
import java.util.concurrent.CompletableFuture;

public final class Managedidentities_v1beta1Functions {
    /**
     * Gets details of a single Backup.
     * 
     */
    public static CompletableFuture<GetBackupResult> getBackup(GetBackupArgs args) {
        return getBackup(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetBackupResult> getBackup(GetBackupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:managedidentities/v1beta1:getBackup", TypeShape.of(GetBackupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets information about a domain.
     * 
     */
    public static CompletableFuture<GetDomainResult> getDomain(GetDomainArgs args) {
        return getDomain(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDomainResult> getDomain(GetDomainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:managedidentities/v1beta1:getDomain", TypeShape.of(GetDomainResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetDomainBackupIamPolicyResult> getDomainBackupIamPolicy(GetDomainBackupIamPolicyArgs args) {
        return getDomainBackupIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDomainBackupIamPolicyResult> getDomainBackupIamPolicy(GetDomainBackupIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:managedidentities/v1beta1:getDomainBackupIamPolicy", TypeShape.of(GetDomainBackupIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetDomainIamPolicyResult> getDomainIamPolicy(GetDomainIamPolicyArgs args) {
        return getDomainIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDomainIamPolicyResult> getDomainIamPolicy(GetDomainIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:managedidentities/v1beta1:getDomainIamPolicy", TypeShape.of(GetDomainIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Peering.
     * 
     */
    public static CompletableFuture<GetPeeringResult> getPeering(GetPeeringArgs args) {
        return getPeering(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPeeringResult> getPeering(GetPeeringArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:managedidentities/v1beta1:getPeering", TypeShape.of(GetPeeringResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetPeeringIamPolicyResult> getPeeringIamPolicy(GetPeeringIamPolicyArgs args) {
        return getPeeringIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPeeringIamPolicyResult> getPeeringIamPolicy(GetPeeringIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:managedidentities/v1beta1:getPeeringIamPolicy", TypeShape.of(GetPeeringIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}