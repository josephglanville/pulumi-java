// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.acmpca.PermissionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Permission set on private certificate authority
 * 
 */
@ResourceType(type="aws-native:acmpca:Permission")
public class Permission extends io.pulumi.resources.CustomResource {
    /**
     * The actions that the specified AWS service principal can use. Actions IssueCertificate, GetCertificate and ListPermissions must be provided.
     * 
     */
    @Export(name="actions", type=List.class, parameters={String.class})
    private Output<List<String>> actions;

    /**
     * @return The actions that the specified AWS service principal can use. Actions IssueCertificate, GetCertificate and ListPermissions must be provided.
     * 
     */
    public Output<List<String>> getActions() {
        return this.actions;
    }
    /**
     * The Amazon Resource Name (ARN) of the Private Certificate Authority that grants the permission.
     * 
     */
    @Export(name="certificateAuthorityArn", type=String.class, parameters={})
    private Output<String> certificateAuthorityArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Private Certificate Authority that grants the permission.
     * 
     */
    public Output<String> getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }
    /**
     * The AWS service or identity that receives the permission. At this time, the only valid principal is acm.amazonaws.com.
     * 
     */
    @Export(name="principal", type=String.class, parameters={})
    private Output<String> principal;

    /**
     * @return The AWS service or identity that receives the permission. At this time, the only valid principal is acm.amazonaws.com.
     * 
     */
    public Output<String> getPrincipal() {
        return this.principal;
    }
    /**
     * The ID of the calling account.
     * 
     */
    @Export(name="sourceAccount", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceAccount;

    /**
     * @return The ID of the calling account.
     * 
     */
    public Output</* @Nullable */ String> getSourceAccount() {
        return this.sourceAccount;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Permission(String name) {
        this(name, PermissionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Permission(String name, PermissionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Permission(String name, PermissionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:acmpca:Permission", name, args == null ? PermissionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Permission(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:acmpca:Permission", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Permission get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Permission(name, id, options);
    }
}
