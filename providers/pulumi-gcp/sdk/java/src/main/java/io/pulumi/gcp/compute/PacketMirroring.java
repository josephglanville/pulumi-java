// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.PacketMirroringArgs;
import io.pulumi.gcp.compute.inputs.PacketMirroringState;
import io.pulumi.gcp.compute.outputs.PacketMirroringCollectorIlb;
import io.pulumi.gcp.compute.outputs.PacketMirroringFilter;
import io.pulumi.gcp.compute.outputs.PacketMirroringMirroredResources;
import io.pulumi.gcp.compute.outputs.PacketMirroringNetwork;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:compute/packetMirroring:PacketMirroring")
public class PacketMirroring extends io.pulumi.resources.CustomResource {
    @OutputExport(name="collectorIlb", type=PacketMirroringCollectorIlb.class, parameters={})
    private Output<PacketMirroringCollectorIlb> collectorIlb;

    public Output<PacketMirroringCollectorIlb> getCollectorIlb() {
        return this.collectorIlb;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="filter", type=PacketMirroringFilter.class, parameters={})
    private Output</* @Nullable */ PacketMirroringFilter> filter;

    public Output</* @Nullable */ PacketMirroringFilter> getFilter() {
        return this.filter;
    }
    @OutputExport(name="mirroredResources", type=PacketMirroringMirroredResources.class, parameters={})
    private Output<PacketMirroringMirroredResources> mirroredResources;

    public Output<PacketMirroringMirroredResources> getMirroredResources() {
        return this.mirroredResources;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="network", type=PacketMirroringNetwork.class, parameters={})
    private Output<PacketMirroringNetwork> network;

    public Output<PacketMirroringNetwork> getNetwork() {
        return this.network;
    }
    @OutputExport(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }

    public PacketMirroring(String name, PacketMirroringArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/packetMirroring:PacketMirroring", name, args == null ? PacketMirroringArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PacketMirroring(String name, Input<String> id, @Nullable PacketMirroringState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/packetMirroring:PacketMirroring", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PacketMirroring get(String name, Input<String> id, @Nullable PacketMirroringState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PacketMirroring(name, id, state, options);
    }
}