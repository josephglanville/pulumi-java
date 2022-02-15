// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.memcache;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.memcache.InstanceArgs;
import io.pulumi.gcp.memcache.inputs.InstanceState;
import io.pulumi.gcp.memcache.outputs.InstanceMemcacheNode;
import io.pulumi.gcp.memcache.outputs.InstanceMemcacheParameters;
import io.pulumi.gcp.memcache.outputs.InstanceNodeConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="gcp:memcache/instance:Instance")
public class Instance extends io.pulumi.resources.CustomResource {
    @OutputExport(name="authorizedNetwork", type=String.class, parameters={})
    private Output<String> authorizedNetwork;

    public Output<String> getAuthorizedNetwork() {
        return this.authorizedNetwork;
    }
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime;
    }
    @OutputExport(name="discoveryEndpoint", type=String.class, parameters={})
    private Output<String> discoveryEndpoint;

    public Output<String> getDiscoveryEndpoint() {
        return this.discoveryEndpoint;
    }
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    @OutputExport(name="memcacheFullVersion", type=String.class, parameters={})
    private Output<String> memcacheFullVersion;

    public Output<String> getMemcacheFullVersion() {
        return this.memcacheFullVersion;
    }
    @OutputExport(name="memcacheNodes", type=List.class, parameters={InstanceMemcacheNode.class})
    private Output<List<InstanceMemcacheNode>> memcacheNodes;

    public Output<List<InstanceMemcacheNode>> getMemcacheNodes() {
        return this.memcacheNodes;
    }
    @OutputExport(name="memcacheParameters", type=InstanceMemcacheParameters.class, parameters={})
    private Output</* @Nullable */ InstanceMemcacheParameters> memcacheParameters;

    public Output</* @Nullable */ InstanceMemcacheParameters> getMemcacheParameters() {
        return this.memcacheParameters;
    }
    @OutputExport(name="memcacheVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> memcacheVersion;

    public Output</* @Nullable */ String> getMemcacheVersion() {
        return this.memcacheVersion;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="nodeConfig", type=InstanceNodeConfig.class, parameters={})
    private Output<InstanceNodeConfig> nodeConfig;

    public Output<InstanceNodeConfig> getNodeConfig() {
        return this.nodeConfig;
    }
    @OutputExport(name="nodeCount", type=Integer.class, parameters={})
    private Output<Integer> nodeCount;

    public Output<Integer> getNodeCount() {
        return this.nodeCount;
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
    @OutputExport(name="zones", type=List.class, parameters={String.class})
    private Output<List<String>> zones;

    public Output<List<String>> getZones() {
        return this.zones;
    }

    public Instance(String name, InstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:memcache/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Instance(String name, Input<String> id, @Nullable InstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:memcache/instance:Instance", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Instance get(String name, Input<String> id, @Nullable InstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}