// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.ScheduledTriggerArgs;
import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:datashare:ScheduledTrigger")
public class ScheduledTrigger extends io.pulumi.resources.CustomResource {
    @OutputExport(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
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
    @OutputExport(name="recurrenceInterval", type=String.class, parameters={})
    private Output<String> recurrenceInterval;

    public Output<String> getRecurrenceInterval() {
        return this.recurrenceInterval;
    }
    @OutputExport(name="synchronizationMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> synchronizationMode;

    public Output</* @Nullable */ String> getSynchronizationMode() {
        return this.synchronizationMode;
    }
    @OutputExport(name="synchronizationTime", type=String.class, parameters={})
    private Output<String> synchronizationTime;

    public Output<String> getSynchronizationTime() {
        return this.synchronizationTime;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="triggerStatus", type=String.class, parameters={})
    private Output<String> triggerStatus;

    public Output<String> getTriggerStatus() {
        return this.triggerStatus;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    public Output<String> getUserName() {
        return this.userName;
    }

    public ScheduledTrigger(String name, ScheduledTriggerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:ScheduledTrigger", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private ScheduledTrigger(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:ScheduledTrigger", name, null, makeResourceOptions(options, id));
    }

    private static ScheduledTriggerArgs makeArgs(ScheduledTriggerArgs args) {
        var builder = args == null ? ScheduledTriggerArgs.builder() : ScheduledTriggerArgs.builder(args);
        return builder
            .setKind("ScheduleBased")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:datashare/v20181101preview:ScheduledTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20191101:ScheduledTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20200901:ScheduledTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20201001preview:ScheduledTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20210801:ScheduledTrigger").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ScheduledTrigger get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ScheduledTrigger(name, id, options);
    }
}
