// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.kusto.EventHubDataConnectionArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:kusto:EventHubDataConnection")
public class EventHubDataConnection extends io.pulumi.resources.CustomResource {
    @OutputExport(name="compression", type=String.class, parameters={})
    private Output</* @Nullable */ String> compression;

    public Output</* @Nullable */ String> getCompression() {
        return this.compression;
    }
    @OutputExport(name="consumerGroup", type=String.class, parameters={})
    private Output<String> consumerGroup;

    public Output<String> getConsumerGroup() {
        return this.consumerGroup;
    }
    @OutputExport(name="dataFormat", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataFormat;

    public Output</* @Nullable */ String> getDataFormat() {
        return this.dataFormat;
    }
    @OutputExport(name="eventHubResourceId", type=String.class, parameters={})
    private Output<String> eventHubResourceId;

    public Output<String> getEventHubResourceId() {
        return this.eventHubResourceId;
    }
    @OutputExport(name="eventSystemProperties", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> eventSystemProperties;

    public Output</* @Nullable */ List<String>> getEventSystemProperties() {
        return this.eventSystemProperties;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="managedIdentityResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> managedIdentityResourceId;

    public Output</* @Nullable */ String> getManagedIdentityResourceId() {
        return this.managedIdentityResourceId;
    }
    @OutputExport(name="mappingRuleName", type=String.class, parameters={})
    private Output</* @Nullable */ String> mappingRuleName;

    public Output</* @Nullable */ String> getMappingRuleName() {
        return this.mappingRuleName;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="tableName", type=String.class, parameters={})
    private Output</* @Nullable */ String> tableName;

    public Output</* @Nullable */ String> getTableName() {
        return this.tableName;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public EventHubDataConnection(String name, EventHubDataConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:EventHubDataConnection", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private EventHubDataConnection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:EventHubDataConnection", name, null, makeResourceOptions(options, id));
    }

    private static EventHubDataConnectionArgs makeArgs(EventHubDataConnectionArgs args) {
        var builder = args == null ? EventHubDataConnectionArgs.builder() : EventHubDataConnectionArgs.builder(args);
        return builder
            .setKind("EventHub")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:kusto/v20190121:EventHubDataConnection").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20190515:EventHubDataConnection").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20190907:EventHubDataConnection").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20191109:EventHubDataConnection").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20200215:EventHubDataConnection").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20200614:EventHubDataConnection").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20200918:EventHubDataConnection").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20210101:EventHubDataConnection").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20210827:EventHubDataConnection").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static EventHubDataConnection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EventHubDataConnection(name, id, options);
    }
}
