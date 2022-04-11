// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.redshift.SecurityGroupArgs;
import io.pulumi.aws.redshift.inputs.SecurityGroupState;
import io.pulumi.aws.redshift.outputs.SecurityGroupIngress;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new Amazon Redshift security group. You use security groups to control access to non-VPC clusters
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Redshift security groups can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:redshift/securityGroup:SecurityGroup testgroup1 redshift_test_group
 * ```
 * 
 */
@ResourceType(type="aws:redshift/securityGroup:SecurityGroup")
public class SecurityGroup extends io.pulumi.resources.CustomResource {
    /**
     * The description of the Redshift security group. Defaults to "Managed by Pulumi".
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the Redshift security group. Defaults to "Managed by Pulumi".
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * A list of ingress rules.
     * 
     */
    @Export(name="ingress", type=List.class, parameters={SecurityGroupIngress.class})
    private Output<List<SecurityGroupIngress>> ingress;

    /**
     * @return A list of ingress rules.
     * 
     */
    public Output<List<SecurityGroupIngress>> getIngress() {
        return this.ingress;
    }
    /**
     * The name of the Redshift security group.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Redshift security group.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecurityGroup(String name) {
        this(name, SecurityGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityGroup(String name, SecurityGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityGroup(String name, SecurityGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/securityGroup:SecurityGroup", name, args == null ? SecurityGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecurityGroup(String name, Output<String> id, @Nullable SecurityGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/securityGroup:SecurityGroup", name, state, makeResourceOptions(options, id));
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
    public static SecurityGroup get(String name, Output<String> id, @Nullable SecurityGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SecurityGroup(name, id, state, options);
    }
}
