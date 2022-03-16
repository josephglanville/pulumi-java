// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.memorydb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.memorydb.AclArgs;
import io.pulumi.aws.memorydb.inputs.AclState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a MemoryDB ACL.
 * 
 * More information about users and ACL-s can be found in the [MemoryDB User Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/clusters.acls.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Use the `name` to import an ACL. For example
 * 
 * ```sh
 *  $ pulumi import aws:memorydb/acl:Acl example my-acl
 * ```
 * 
 */
@ResourceType(type="aws:memorydb/acl:Acl")
public class Acl extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the ACL.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the ACL.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The minimum engine version supported by the ACL.
     * 
     */
    @Export(name="minimumEngineVersion", type=String.class, parameters={})
    private Output<String> minimumEngineVersion;

    /**
     * @return The minimum engine version supported by the ACL.
     * 
     */
    public Output<String> getMinimumEngineVersion() {
        return this.minimumEngineVersion;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Output<String> getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
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
    /**
     * Set of MemoryDB user names to be included in this ACL.
     * 
     */
    @Export(name="userNames", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> userNames;

    /**
     * @return Set of MemoryDB user names to be included in this ACL.
     * 
     */
    public Output</* @Nullable */ List<String>> getUserNames() {
        return this.userNames;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable AclArgs.Builder a);
    }
    private static io.pulumi.aws.memorydb.AclArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.memorydb.AclArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Acl(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Acl(String name) {
        this(name, AclArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Acl(String name, @Nullable AclArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Acl(String name, @Nullable AclArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:memorydb/acl:Acl", name, args == null ? AclArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Acl(String name, Output<String> id, @Nullable AclState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:memorydb/acl:Acl", name, state, makeResourceOptions(options, id));
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
    public static Acl get(String name, Output<String> id, @Nullable AclState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Acl(name, id, state, options);
    }
}
