// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.s3.MultiRegionAccessPointPolicyArgs;
import io.pulumi.awsnative.s3.outputs.PolicyStatusProperties;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The policy to be attached to a Multi Region Access Point
 * 
 */
@ResourceType(type="aws-native:s3:MultiRegionAccessPointPolicy")
public class MultiRegionAccessPointPolicy extends io.pulumi.resources.CustomResource {
    /**
     * The name of the Multi Region Access Point to apply policy
     * 
     */
    @Export(name="mrapName", type=String.class, parameters={})
    private Output<String> mrapName;

    /**
     * @return The name of the Multi Region Access Point to apply policy
     * 
     */
    public Output<String> getMrapName() {
        return this.mrapName;
    }
    /**
     * Policy document to apply to a Multi Region Access Point
     * 
     */
    @Export(name="policy", type=Object.class, parameters={})
    private Output<Object> policy;

    /**
     * @return Policy document to apply to a Multi Region Access Point
     * 
     */
    public Output<Object> getPolicy() {
        return this.policy;
    }
    /**
     * The Policy Status associated with this Multi Region Access Point
     * 
     */
    @Export(name="policyStatus", type=PolicyStatusProperties.class, parameters={})
    private Output<PolicyStatusProperties> policyStatus;

    /**
     * @return The Policy Status associated with this Multi Region Access Point
     * 
     */
    public Output<PolicyStatusProperties> getPolicyStatus() {
        return this.policyStatus;
    }

    public interface BuilderApplicator {
        public void apply(MultiRegionAccessPointPolicyArgs.Builder a);
    }
    private static io.pulumi.awsnative.s3.MultiRegionAccessPointPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.s3.MultiRegionAccessPointPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public MultiRegionAccessPointPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MultiRegionAccessPointPolicy(String name) {
        this(name, MultiRegionAccessPointPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MultiRegionAccessPointPolicy(String name, MultiRegionAccessPointPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MultiRegionAccessPointPolicy(String name, MultiRegionAccessPointPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:s3:MultiRegionAccessPointPolicy", name, args == null ? MultiRegionAccessPointPolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private MultiRegionAccessPointPolicy(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:s3:MultiRegionAccessPointPolicy", name, null, makeResourceOptions(options, id));
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
    public static MultiRegionAccessPointPolicy get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MultiRegionAccessPointPolicy(name, id, options);
    }
}
