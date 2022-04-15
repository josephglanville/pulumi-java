// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.essentialcontacts_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.essentialcontacts_v1.inputs.GetContactArgs;
import io.pulumi.googlenative.essentialcontacts_v1.inputs.GetFolderContactArgs;
import io.pulumi.googlenative.essentialcontacts_v1.inputs.GetOrganizationContactArgs;
import io.pulumi.googlenative.essentialcontacts_v1.outputs.GetContactResult;
import io.pulumi.googlenative.essentialcontacts_v1.outputs.GetFolderContactResult;
import io.pulumi.googlenative.essentialcontacts_v1.outputs.GetOrganizationContactResult;
import java.util.concurrent.CompletableFuture;

public final class Essentialcontacts_v1Functions {
    /**
     * Gets a single contact.
     * 
     */
    public static CompletableFuture<GetContactResult> getContact(GetContactArgs args) {
        return getContact(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetContactResult> getContact(GetContactArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:essentialcontacts/v1:getContact", TypeShape.of(GetContactResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a single contact.
     * 
     */
    public static CompletableFuture<GetFolderContactResult> getFolderContact(GetFolderContactArgs args) {
        return getFolderContact(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetFolderContactResult> getFolderContact(GetFolderContactArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:essentialcontacts/v1:getFolderContact", TypeShape.of(GetFolderContactResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a single contact.
     * 
     */
    public static CompletableFuture<GetOrganizationContactResult> getOrganizationContact(GetOrganizationContactArgs args) {
        return getOrganizationContact(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOrganizationContactResult> getOrganizationContact(GetOrganizationContactArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:essentialcontacts/v1:getOrganizationContact", TypeShape.of(GetOrganizationContactResult.class), args, Utilities.withVersion(options));
    }
}