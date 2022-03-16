// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.connect.SecurityProfileArgs;
import io.pulumi.aws.connect.inputs.SecurityProfileState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an Amazon Connect Security Profile resource. For more information see
 * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Amazon Connect Security Profiles can be imported using the `instance_id` and `security_profile_id` separated by a colon (`:`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:connect/securityProfile:SecurityProfile example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
 * ```
 * 
 */
@ResourceType(type="aws:connect/securityProfile:SecurityProfile")
public class SecurityProfile extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the Security Profile.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Security Profile.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Specifies the description of the Security Profile.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Specifies the description of the Security Profile.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    public Output<String> getInstanceId() {
        return this.instanceId;
    }
    /**
     * Specifies the name of the Security Profile.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Security Profile.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The organization resource identifier for the security profile.
     * 
     */
    @Export(name="organizationResourceId", type=String.class, parameters={})
    private Output<String> organizationResourceId;

    /**
     * @return The organization resource identifier for the security profile.
     * 
     */
    public Output<String> getOrganizationResourceId() {
        return this.organizationResourceId;
    }
    /**
     * Specifies a list of permissions assigned to the security profile.
     * 
     */
    @Export(name="permissions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> permissions;

    /**
     * @return Specifies a list of permissions assigned to the security profile.
     * 
     */
    public Output</* @Nullable */ List<String>> getPermissions() {
        return this.permissions;
    }
    /**
     * The identifier for the Security Profile.
     * 
     */
    @Export(name="securityProfileId", type=String.class, parameters={})
    private Output<String> securityProfileId;

    /**
     * @return The identifier for the Security Profile.
     * 
     */
    public Output<String> getSecurityProfileId() {
        return this.securityProfileId;
    }
    /**
     * Tags to apply to the Security Profile. If configured with a provider
     * [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags to apply to the Security Profile. If configured with a provider
     * [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(SecurityProfileArgs.Builder a);
    }
    private static io.pulumi.aws.connect.SecurityProfileArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.connect.SecurityProfileArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SecurityProfile(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecurityProfile(String name) {
        this(name, SecurityProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityProfile(String name, SecurityProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityProfile(String name, SecurityProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/securityProfile:SecurityProfile", name, args == null ? SecurityProfileArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private SecurityProfile(String name, Output<String> id, @Nullable SecurityProfileState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/securityProfile:SecurityProfile", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SecurityProfile get(String name, Output<String> id, @Nullable SecurityProfileState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SecurityProfile(name, id, state, options);
    }
}
