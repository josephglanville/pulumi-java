// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventgrid.EventChannelArgs;
import io.pulumi.azurenative.eventgrid.outputs.EventChannelDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.EventChannelFilterResponse;
import io.pulumi.azurenative.eventgrid.outputs.EventChannelSourceResponse;
import io.pulumi.azurenative.eventgrid.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:eventgrid:EventChannel")
public class EventChannel extends io.pulumi.resources.CustomResource {
    @OutputExport(name="destination", type=EventChannelDestinationResponse.class, parameters={})
    private Output</* @Nullable */ EventChannelDestinationResponse> destination;

    public Output</* @Nullable */ EventChannelDestinationResponse> getDestination() {
        return this.destination;
    }
    @OutputExport(name="expirationTimeIfNotActivatedUtc", type=String.class, parameters={})
    private Output</* @Nullable */ String> expirationTimeIfNotActivatedUtc;

    public Output</* @Nullable */ String> getExpirationTimeIfNotActivatedUtc() {
        return this.expirationTimeIfNotActivatedUtc;
    }
    @OutputExport(name="filter", type=EventChannelFilterResponse.class, parameters={})
    private Output</* @Nullable */ EventChannelFilterResponse> filter;

    public Output</* @Nullable */ EventChannelFilterResponse> getFilter() {
        return this.filter;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="partnerTopicFriendlyDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> partnerTopicFriendlyDescription;

    public Output</* @Nullable */ String> getPartnerTopicFriendlyDescription() {
        return this.partnerTopicFriendlyDescription;
    }
    @OutputExport(name="partnerTopicReadinessState", type=String.class, parameters={})
    private Output<String> partnerTopicReadinessState;

    public Output<String> getPartnerTopicReadinessState() {
        return this.partnerTopicReadinessState;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="source", type=EventChannelSourceResponse.class, parameters={})
    private Output</* @Nullable */ EventChannelSourceResponse> source;

    public Output</* @Nullable */ EventChannelSourceResponse> getSource() {
        return this.source;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public EventChannel(String name, EventChannelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventgrid:EventChannel", name, args == null ? EventChannelArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EventChannel(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventgrid:EventChannel", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20200401preview:EventChannel").build()),
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20201015preview:EventChannel").build()),
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20210601preview:EventChannel").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static EventChannel get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EventChannel(name, id, options);
    }
}
