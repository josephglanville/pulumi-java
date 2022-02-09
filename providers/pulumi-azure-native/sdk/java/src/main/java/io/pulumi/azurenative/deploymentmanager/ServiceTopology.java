// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.deploymentmanager.ServiceTopologyArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:deploymentmanager:ServiceTopology")
public class ServiceTopology extends io.pulumi.resources.CustomResource {
    @OutputExport(name="artifactSourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> artifactSourceId;

    public Output</* @Nullable */ String> getArtifactSourceId() {
        return this.artifactSourceId;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ServiceTopology(String name, ServiceTopologyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:deploymentmanager:ServiceTopology", name, args == null ? ServiceTopologyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ServiceTopology(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:deploymentmanager:ServiceTopology", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:deploymentmanager/v20180901preview:ServiceTopology").build()),
                Input.of(Alias.builder().setType("azure-native:deploymentmanager/v20191101preview:ServiceTopology").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ServiceTopology get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServiceTopology(name, id, options);
    }
}
