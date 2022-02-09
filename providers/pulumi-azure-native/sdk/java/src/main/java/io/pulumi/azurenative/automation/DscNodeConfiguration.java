// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.DscNodeConfigurationArgs;
import io.pulumi.azurenative.automation.outputs.DscConfigurationAssociationPropertyResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:automation:DscNodeConfiguration")
public class DscNodeConfiguration extends io.pulumi.resources.CustomResource {
    @OutputExport(name="configuration", type=DscConfigurationAssociationPropertyResponse.class, parameters={})
    private Output</* @Nullable */ DscConfigurationAssociationPropertyResponse> configuration;

    public Output</* @Nullable */ DscConfigurationAssociationPropertyResponse> getConfiguration() {
        return this.configuration;
    }
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> creationTime;

    public Output</* @Nullable */ String> getCreationTime() {
        return this.creationTime;
    }
    @OutputExport(name="incrementNodeConfigurationBuild", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> incrementNodeConfigurationBuild;

    public Output</* @Nullable */ Boolean> getIncrementNodeConfigurationBuild() {
        return this.incrementNodeConfigurationBuild;
    }
    @OutputExport(name="lastModifiedTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedTime;

    public Output</* @Nullable */ String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="nodeCount", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> nodeCount;

    public Output</* @Nullable */ Double> getNodeCount() {
        return this.nodeCount;
    }
    @OutputExport(name="source", type=String.class, parameters={})
    private Output</* @Nullable */ String> source;

    public Output</* @Nullable */ String> getSource() {
        return this.source;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public DscNodeConfiguration(String name, DscNodeConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:DscNodeConfiguration", name, args == null ? DscNodeConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DscNodeConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:DscNodeConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:automation/v20151031:DscNodeConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:automation/v20180115:DscNodeConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:automation/v20190601:DscNodeConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:automation/v20200113preview:DscNodeConfiguration").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static DscNodeConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DscNodeConfiguration(name, id, options);
    }
}
