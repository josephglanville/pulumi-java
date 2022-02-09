// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.FlowLogArgs;
import io.pulumi.azurenative.network.outputs.FlowLogFormatParametersResponse;
import io.pulumi.azurenative.network.outputs.RetentionPolicyParametersResponse;
import io.pulumi.azurenative.network.outputs.TrafficAnalyticsPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:network:FlowLog")
public class FlowLog extends io.pulumi.resources.CustomResource {
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="flowAnalyticsConfiguration", type=TrafficAnalyticsPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ TrafficAnalyticsPropertiesResponse> flowAnalyticsConfiguration;

    public Output</* @Nullable */ TrafficAnalyticsPropertiesResponse> getFlowAnalyticsConfiguration() {
        return this.flowAnalyticsConfiguration;
    }
    @OutputExport(name="format", type=FlowLogFormatParametersResponse.class, parameters={})
    private Output</* @Nullable */ FlowLogFormatParametersResponse> format;

    public Output</* @Nullable */ FlowLogFormatParametersResponse> getFormat() {
        return this.format;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
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
    @OutputExport(name="retentionPolicy", type=RetentionPolicyParametersResponse.class, parameters={})
    private Output</* @Nullable */ RetentionPolicyParametersResponse> retentionPolicy;

    public Output</* @Nullable */ RetentionPolicyParametersResponse> getRetentionPolicy() {
        return this.retentionPolicy;
    }
    @OutputExport(name="storageId", type=String.class, parameters={})
    private Output<String> storageId;

    public Output<String> getStorageId() {
        return this.storageId;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="targetResourceGuid", type=String.class, parameters={})
    private Output<String> targetResourceGuid;

    public Output<String> getTargetResourceGuid() {
        return this.targetResourceGuid;
    }
    @OutputExport(name="targetResourceId", type=String.class, parameters={})
    private Output<String> targetResourceId;

    public Output<String> getTargetResourceId() {
        return this.targetResourceId;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public FlowLog(String name, FlowLogArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:FlowLog", name, args == null ? FlowLogArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FlowLog(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:FlowLog", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20191101:FlowLog").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:FlowLog").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:FlowLog").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:FlowLog").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:FlowLog").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:FlowLog").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:FlowLog").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:FlowLog").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:FlowLog").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:FlowLog").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:FlowLog").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:FlowLog").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static FlowLog get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FlowLog(name, id, options);
    }
}
