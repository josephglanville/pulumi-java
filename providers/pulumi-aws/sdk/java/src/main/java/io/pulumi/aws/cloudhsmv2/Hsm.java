// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudhsmv2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudhsmv2.HsmArgs;
import io.pulumi.aws.cloudhsmv2.inputs.HsmState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates an HSM module in Amazon CloudHSM v2 cluster.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * HSM modules can be imported using their HSM ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cloudhsmv2/hsm:Hsm bar hsm-quo8dahtaca
 * ```
 * 
 */
@ResourceType(type="aws:cloudhsmv2/hsm:Hsm")
public class Hsm extends io.pulumi.resources.CustomResource {
    /**
     * The IDs of AZ in which HSM module will be located. Do not use together with subnet_id.
     * 
     */
    @Export(name="availabilityZone", type=String.class, parameters={})
    private Output<String> availabilityZone;

    /**
     * @return The IDs of AZ in which HSM module will be located. Do not use together with subnet_id.
     * 
     */
    public Output<String> getAvailabilityZone() {
        return this.availabilityZone;
    }
    /**
     * The ID of Cloud HSM v2 cluster to which HSM will be added.
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return The ID of Cloud HSM v2 cluster to which HSM will be added.
     * 
     */
    public Output<String> getClusterId() {
        return this.clusterId;
    }
    /**
     * The id of the ENI interface allocated for HSM module.
     * 
     */
    @Export(name="hsmEniId", type=String.class, parameters={})
    private Output<String> hsmEniId;

    /**
     * @return The id of the ENI interface allocated for HSM module.
     * 
     */
    public Output<String> getHsmEniId() {
        return this.hsmEniId;
    }
    /**
     * The id of the HSM module.
     * 
     */
    @Export(name="hsmId", type=String.class, parameters={})
    private Output<String> hsmId;

    /**
     * @return The id of the HSM module.
     * 
     */
    public Output<String> getHsmId() {
        return this.hsmId;
    }
    /**
     * The state of the HSM module.
     * 
     */
    @Export(name="hsmState", type=String.class, parameters={})
    private Output<String> hsmState;

    /**
     * @return The state of the HSM module.
     * 
     */
    public Output<String> getHsmState() {
        return this.hsmState;
    }
    /**
     * The IP address of HSM module. Must be within the CIDR of selected subnet.
     * 
     */
    @Export(name="ipAddress", type=String.class, parameters={})
    private Output<String> ipAddress;

    /**
     * @return The IP address of HSM module. Must be within the CIDR of selected subnet.
     * 
     */
    public Output<String> getIpAddress() {
        return this.ipAddress;
    }
    /**
     * The ID of subnet in which HSM module will be located.
     * 
     */
    @Export(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return The ID of subnet in which HSM module will be located.
     * 
     */
    public Output<String> getSubnetId() {
        return this.subnetId;
    }

    public interface BuilderApplicator {
        public void apply(HsmArgs.Builder a);
    }
    private static io.pulumi.aws.cloudhsmv2.HsmArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.cloudhsmv2.HsmArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Hsm(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Hsm(String name) {
        this(name, HsmArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Hsm(String name, HsmArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Hsm(String name, HsmArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudhsmv2/hsm:Hsm", name, args == null ? HsmArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Hsm(String name, Output<String> id, @Nullable HsmState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudhsmv2/hsm:Hsm", name, state, makeResourceOptions(options, id));
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
    public static Hsm get(String name, Output<String> id, @Nullable HsmState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Hsm(name, id, state, options);
    }
}
