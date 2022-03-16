// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glacier;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.glacier.VaultArgs;
import io.pulumi.aws.glacier.inputs.VaultState;
import io.pulumi.aws.glacier.outputs.VaultNotification;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Glacier Vault Resource. You can refer to the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-vaults.html) for a full explanation of the Glacier Vault functionality
 * 
 * > **NOTE:** When removing a Glacier Vault, the Vault must be empty.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Glacier Vaults can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:glacier/vault:Vault archive my_archive
 * ```
 * 
 */
@ResourceType(type="aws:glacier/vault:Vault")
public class Vault extends io.pulumi.resources.CustomResource {
    /**
     * The policy document. This is a JSON formatted string.
     * The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
     * 
     */
    @Export(name="accessPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> accessPolicy;

    /**
     * @return The policy document. This is a JSON formatted string.
     * The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
     * 
     */
    public Output</* @Nullable */ String> getAccessPolicy() {
        return this.accessPolicy;
    }
    /**
     * The ARN of the vault.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the vault.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The URI of the vault that was created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The URI of the vault that was created.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The notifications for the Vault. Fields documented below.
     * 
     */
    @Export(name="notification", type=VaultNotification.class, parameters={})
    private Output</* @Nullable */ VaultNotification> notification;

    /**
     * @return The notifications for the Vault. Fields documented below.
     * 
     */
    public Output</* @Nullable */ VaultNotification> getNotification() {
        return this.notification;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable VaultArgs.Builder a);
    }
    private static io.pulumi.aws.glacier.VaultArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.glacier.VaultArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Vault(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Vault(String name) {
        this(name, VaultArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Vault(String name, @Nullable VaultArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Vault(String name, @Nullable VaultArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glacier/vault:Vault", name, args == null ? VaultArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Vault(String name, Output<String> id, @Nullable VaultState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glacier/vault:Vault", name, state, makeResourceOptions(options, id));
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
    public static Vault get(String name, Output<String> id, @Nullable VaultState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Vault(name, id, state, options);
    }
}
