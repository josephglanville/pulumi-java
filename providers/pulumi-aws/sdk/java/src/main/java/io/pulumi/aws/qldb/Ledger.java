// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.qldb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.qldb.LedgerArgs;
import io.pulumi.aws.qldb.inputs.LedgerState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an AWS Quantum Ledger Database (QLDB) resource
 * 
 * > **NOTE:** Deletion protection is enabled by default. To successfully delete this resource via this provider, `deletion_protection = false` must be applied before attempting deletion.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * QLDB Ledgers can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:qldb/ledger:Ledger sample-ledger sample-ledger
 * ```
 * 
 */
@ResourceType(type="aws:qldb/ledger:Ledger")
public class Ledger extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the QLDB Ledger
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the QLDB Ledger
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The deletion protection for the QLDB Ledger instance. By default it is `true`. To delete this resource via this provider, this value must be configured to `false` and applied first before attempting deletion.
     * 
     */
    @Export(name="deletionProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deletionProtection;

    /**
     * @return The deletion protection for the QLDB Ledger instance. By default it is `true`. To delete this resource via this provider, this value must be configured to `false` and applied first before attempting deletion.
     * 
     */
    public Output</* @Nullable */ Boolean> getDeletionProtection() {
        return this.deletionProtection;
    }
    /**
     * The friendly name for the QLDB Ledger instance. By default generated by this provider.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The friendly name for the QLDB Ledger instance. By default generated by this provider.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The permissions mode for the QLDB ledger instance. Specify either `ALLOW_ALL` or `STANDARD`.
     * 
     */
    @Export(name="permissionsMode", type=String.class, parameters={})
    private Output<String> permissionsMode;

    /**
     * @return The permissions mode for the QLDB ledger instance. Specify either `ALLOW_ALL` or `STANDARD`.
     * 
     */
    public Output<String> getPermissionsMode() {
        return this.permissionsMode;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Ledger(String name) {
        this(name, LedgerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Ledger(String name, LedgerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Ledger(String name, LedgerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:qldb/ledger:Ledger", name, args == null ? LedgerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Ledger(String name, Output<String> id, @Nullable LedgerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:qldb/ledger:Ledger", name, state, makeResourceOptions(options, id));
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
    public static Ledger get(String name, Output<String> id, @Nullable LedgerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Ledger(name, id, state, options);
    }
}
