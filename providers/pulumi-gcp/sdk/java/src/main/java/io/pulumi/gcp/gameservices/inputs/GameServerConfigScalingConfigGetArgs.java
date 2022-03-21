// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.gameservices.inputs.GameServerConfigScalingConfigScheduleGetArgs;
import io.pulumi.gcp.gameservices.inputs.GameServerConfigScalingConfigSelectorGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameServerConfigScalingConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameServerConfigScalingConfigGetArgs Empty = new GameServerConfigScalingConfigGetArgs();

    /**
     * Fleet autoscaler spec, which is sent to Agones.
     * Example spec can be found :
     * https://agones.dev/site/docs/reference/fleetautoscaler/
     * 
     */
    @Import(name="fleetAutoscalerSpec", required=true)
      private final Output<String> fleetAutoscalerSpec;

    public Output<String> getFleetAutoscalerSpec() {
        return this.fleetAutoscalerSpec;
    }

    /**
     * The name of the ScalingConfig
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The schedules to which this scaling config applies.
     * Structure is documented below.
     * 
     */
    @Import(name="schedules")
      private final @Nullable Output<List<GameServerConfigScalingConfigScheduleGetArgs>> schedules;

    public Output<List<GameServerConfigScalingConfigScheduleGetArgs>> getSchedules() {
        return this.schedules == null ? Output.empty() : this.schedules;
    }

    /**
     * Labels used to identify the clusters to which this scaling config
     * applies. A cluster is subject to this scaling config if its labels match
     * any of the selector entries.
     * Structure is documented below.
     * 
     */
    @Import(name="selectors")
      private final @Nullable Output<List<GameServerConfigScalingConfigSelectorGetArgs>> selectors;

    public Output<List<GameServerConfigScalingConfigSelectorGetArgs>> getSelectors() {
        return this.selectors == null ? Output.empty() : this.selectors;
    }

    public GameServerConfigScalingConfigGetArgs(
        Output<String> fleetAutoscalerSpec,
        Output<String> name,
        @Nullable Output<List<GameServerConfigScalingConfigScheduleGetArgs>> schedules,
        @Nullable Output<List<GameServerConfigScalingConfigSelectorGetArgs>> selectors) {
        this.fleetAutoscalerSpec = Objects.requireNonNull(fleetAutoscalerSpec, "expected parameter 'fleetAutoscalerSpec' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.schedules = schedules;
        this.selectors = selectors;
    }

    private GameServerConfigScalingConfigGetArgs() {
        this.fleetAutoscalerSpec = Output.empty();
        this.name = Output.empty();
        this.schedules = Output.empty();
        this.selectors = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerConfigScalingConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> fleetAutoscalerSpec;
        private Output<String> name;
        private @Nullable Output<List<GameServerConfigScalingConfigScheduleGetArgs>> schedules;
        private @Nullable Output<List<GameServerConfigScalingConfigSelectorGetArgs>> selectors;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerConfigScalingConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fleetAutoscalerSpec = defaults.fleetAutoscalerSpec;
    	      this.name = defaults.name;
    	      this.schedules = defaults.schedules;
    	      this.selectors = defaults.selectors;
        }

        public Builder fleetAutoscalerSpec(Output<String> fleetAutoscalerSpec) {
            this.fleetAutoscalerSpec = Objects.requireNonNull(fleetAutoscalerSpec);
            return this;
        }
        public Builder fleetAutoscalerSpec(String fleetAutoscalerSpec) {
            this.fleetAutoscalerSpec = Output.of(Objects.requireNonNull(fleetAutoscalerSpec));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder schedules(@Nullable Output<List<GameServerConfigScalingConfigScheduleGetArgs>> schedules) {
            this.schedules = schedules;
            return this;
        }
        public Builder schedules(@Nullable List<GameServerConfigScalingConfigScheduleGetArgs> schedules) {
            this.schedules = Output.ofNullable(schedules);
            return this;
        }
        public Builder schedules(GameServerConfigScalingConfigScheduleGetArgs... schedules) {
            return schedules(List.of(schedules));
        }
        public Builder selectors(@Nullable Output<List<GameServerConfigScalingConfigSelectorGetArgs>> selectors) {
            this.selectors = selectors;
            return this;
        }
        public Builder selectors(@Nullable List<GameServerConfigScalingConfigSelectorGetArgs> selectors) {
            this.selectors = Output.ofNullable(selectors);
            return this;
        }
        public Builder selectors(GameServerConfigScalingConfigSelectorGetArgs... selectors) {
            return selectors(List.of(selectors));
        }        public GameServerConfigScalingConfigGetArgs build() {
            return new GameServerConfigScalingConfigGetArgs(fleetAutoscalerSpec, name, schedules, selectors);
        }
    }
}
