// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devicefarm;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.devicefarm.NetworkProfileArgs;
import io.pulumi.awsnative.devicefarm.outputs.NetworkProfileTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * AWS::DeviceFarm::NetworkProfile creates a new DF Network Profile
 * 
 */
@ResourceType(type="aws-native:devicefarm:NetworkProfile")
public class NetworkProfile extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="downlinkBandwidthBits", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> downlinkBandwidthBits;

    public Output</* @Nullable */ Integer> getDownlinkBandwidthBits() {
        return this.downlinkBandwidthBits;
    }
    @OutputExport(name="downlinkDelayMs", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> downlinkDelayMs;

    public Output</* @Nullable */ Integer> getDownlinkDelayMs() {
        return this.downlinkDelayMs;
    }
    @OutputExport(name="downlinkJitterMs", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> downlinkJitterMs;

    public Output</* @Nullable */ Integer> getDownlinkJitterMs() {
        return this.downlinkJitterMs;
    }
    @OutputExport(name="downlinkLossPercent", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> downlinkLossPercent;

    public Output</* @Nullable */ Integer> getDownlinkLossPercent() {
        return this.downlinkLossPercent;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="projectArn", type=String.class, parameters={})
    private Output<String> projectArn;

    public Output<String> getProjectArn() {
        return this.projectArn;
    }
    @OutputExport(name="tags", type=List.class, parameters={NetworkProfileTag.class})
    private Output</* @Nullable */ List<NetworkProfileTag>> tags;

    public Output</* @Nullable */ List<NetworkProfileTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="uplinkBandwidthBits", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> uplinkBandwidthBits;

    public Output</* @Nullable */ Integer> getUplinkBandwidthBits() {
        return this.uplinkBandwidthBits;
    }
    @OutputExport(name="uplinkDelayMs", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> uplinkDelayMs;

    public Output</* @Nullable */ Integer> getUplinkDelayMs() {
        return this.uplinkDelayMs;
    }
    @OutputExport(name="uplinkJitterMs", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> uplinkJitterMs;

    public Output</* @Nullable */ Integer> getUplinkJitterMs() {
        return this.uplinkJitterMs;
    }
    @OutputExport(name="uplinkLossPercent", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> uplinkLossPercent;

    public Output</* @Nullable */ Integer> getUplinkLossPercent() {
        return this.uplinkLossPercent;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkProfile(String name) {
        this(name, NetworkProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkProfile(String name, NetworkProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkProfile(String name, NetworkProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:devicefarm:NetworkProfile", name, args == null ? NetworkProfileArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NetworkProfile(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:devicefarm:NetworkProfile", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static NetworkProfile get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NetworkProfile(name, id, options);
    }
}
