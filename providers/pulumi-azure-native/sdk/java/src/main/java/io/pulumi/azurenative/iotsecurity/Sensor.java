// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.iotsecurity;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.iotsecurity.SensorArgs;
import io.pulumi.azurenative.iotsecurity.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:iotsecurity:Sensor")
public class Sensor extends io.pulumi.resources.CustomResource {
    @OutputExport(name="connectivityTime", type=String.class, parameters={})
    private Output<String> connectivityTime;

    public Output<String> getConnectivityTime() {
        return this.connectivityTime;
    }
    @OutputExport(name="dynamicLearning", type=Boolean.class, parameters={})
    private Output<Boolean> dynamicLearning;

    public Output<Boolean> getDynamicLearning() {
        return this.dynamicLearning;
    }
    @OutputExport(name="learningMode", type=Boolean.class, parameters={})
    private Output<Boolean> learningMode;

    public Output<Boolean> getLearningMode() {
        return this.learningMode;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="sensorStatus", type=String.class, parameters={})
    private Output<String> sensorStatus;

    public Output<String> getSensorStatus() {
        return this.sensorStatus;
    }
    @OutputExport(name="sensorType", type=String.class, parameters={})
    private Output</* @Nullable */ String> sensorType;

    public Output</* @Nullable */ String> getSensorType() {
        return this.sensorType;
    }
    @OutputExport(name="sensorVersion", type=String.class, parameters={})
    private Output<String> sensorVersion;

    public Output<String> getSensorVersion() {
        return this.sensorVersion;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="tiAutomaticUpdates", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> tiAutomaticUpdates;

    public Output</* @Nullable */ Boolean> getTiAutomaticUpdates() {
        return this.tiAutomaticUpdates;
    }
    @OutputExport(name="tiStatus", type=String.class, parameters={})
    private Output<String> tiStatus;

    public Output<String> getTiStatus() {
        return this.tiStatus;
    }
    @OutputExport(name="tiVersion", type=String.class, parameters={})
    private Output<String> tiVersion;

    public Output<String> getTiVersion() {
        return this.tiVersion;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="zone", type=String.class, parameters={})
    private Output</* @Nullable */ String> zone;

    public Output</* @Nullable */ String> getZone() {
        return this.zone;
    }

    public Sensor(String name, SensorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:iotsecurity:Sensor", name, args == null ? SensorArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Sensor(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:iotsecurity:Sensor", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:iotsecurity/v20210201preview:Sensor").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Sensor get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Sensor(name, id, options);
    }
}