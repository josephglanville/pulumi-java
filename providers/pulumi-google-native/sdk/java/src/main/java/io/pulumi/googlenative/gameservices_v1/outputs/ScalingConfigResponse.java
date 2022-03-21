// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.gameservices_v1.outputs.LabelSelectorResponse;
import io.pulumi.googlenative.gameservices_v1.outputs.ScheduleResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ScalingConfigResponse {
    /**
     * Agones fleet autoscaler spec. Example spec: https://agones.dev/site/docs/reference/fleetautoscaler/
     * 
     */
    private final String fleetAutoscalerSpec;
    /**
     * The name of the Scaling Config
     * 
     */
    private final String name;
    /**
     * The schedules to which this Scaling Config applies.
     * 
     */
    private final List<ScheduleResponse> schedules;
    /**
     * Labels used to identify the game server clusters to which this Agones scaling config applies. A game server cluster is subject to this Agones scaling config if its labels match any of the selector entries.
     * 
     */
    private final List<LabelSelectorResponse> selectors;

    @CustomType.Constructor
    private ScalingConfigResponse(
        @CustomType.Parameter("fleetAutoscalerSpec") String fleetAutoscalerSpec,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("schedules") List<ScheduleResponse> schedules,
        @CustomType.Parameter("selectors") List<LabelSelectorResponse> selectors) {
        this.fleetAutoscalerSpec = fleetAutoscalerSpec;
        this.name = name;
        this.schedules = schedules;
        this.selectors = selectors;
    }

    /**
     * Agones fleet autoscaler spec. Example spec: https://agones.dev/site/docs/reference/fleetautoscaler/
     * 
    */
    public String getFleetAutoscalerSpec() {
        return this.fleetAutoscalerSpec;
    }
    /**
     * The name of the Scaling Config
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The schedules to which this Scaling Config applies.
     * 
    */
    public List<ScheduleResponse> getSchedules() {
        return this.schedules;
    }
    /**
     * Labels used to identify the game server clusters to which this Agones scaling config applies. A game server cluster is subject to this Agones scaling config if its labels match any of the selector entries.
     * 
    */
    public List<LabelSelectorResponse> getSelectors() {
        return this.selectors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fleetAutoscalerSpec;
        private String name;
        private List<ScheduleResponse> schedules;
        private List<LabelSelectorResponse> selectors;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fleetAutoscalerSpec = defaults.fleetAutoscalerSpec;
    	      this.name = defaults.name;
    	      this.schedules = defaults.schedules;
    	      this.selectors = defaults.selectors;
        }

        public Builder fleetAutoscalerSpec(String fleetAutoscalerSpec) {
            this.fleetAutoscalerSpec = Objects.requireNonNull(fleetAutoscalerSpec);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder schedules(List<ScheduleResponse> schedules) {
            this.schedules = Objects.requireNonNull(schedules);
            return this;
        }
        public Builder schedules(ScheduleResponse... schedules) {
            return schedules(List.of(schedules));
        }
        public Builder selectors(List<LabelSelectorResponse> selectors) {
            this.selectors = Objects.requireNonNull(selectors);
            return this;
        }
        public Builder selectors(LabelSelectorResponse... selectors) {
            return selectors(List.of(selectors));
        }        public ScalingConfigResponse build() {
            return new ScalingConfigResponse(fleetAutoscalerSpec, name, schedules, selectors);
        }
    }
}
