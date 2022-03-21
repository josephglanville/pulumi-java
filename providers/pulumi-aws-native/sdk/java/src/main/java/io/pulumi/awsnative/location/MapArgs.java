// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.location;

import io.pulumi.awsnative.location.enums.MapPricingPlan;
import io.pulumi.awsnative.location.inputs.MapConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MapArgs extends io.pulumi.resources.ResourceArgs {

    public static final MapArgs Empty = new MapArgs();

    @Import(name="configuration", required=true)
      private final Output<MapConfigurationArgs> configuration;

    public Output<MapConfigurationArgs> getConfiguration() {
        return this.configuration;
    }

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    @Import(name="mapName")
      private final @Nullable Output<String> mapName;

    public Output<String> getMapName() {
        return this.mapName == null ? Output.empty() : this.mapName;
    }

    @Import(name="pricingPlan")
      private final @Nullable Output<MapPricingPlan> pricingPlan;

    public Output<MapPricingPlan> getPricingPlan() {
        return this.pricingPlan == null ? Output.empty() : this.pricingPlan;
    }

    public MapArgs(
        Output<MapConfigurationArgs> configuration,
        @Nullable Output<String> description,
        @Nullable Output<String> mapName,
        @Nullable Output<MapPricingPlan> pricingPlan) {
        this.configuration = Objects.requireNonNull(configuration, "expected parameter 'configuration' to be non-null");
        this.description = description;
        this.mapName = mapName;
        this.pricingPlan = pricingPlan;
    }

    private MapArgs() {
        this.configuration = Output.empty();
        this.description = Output.empty();
        this.mapName = Output.empty();
        this.pricingPlan = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<MapConfigurationArgs> configuration;
        private @Nullable Output<String> description;
        private @Nullable Output<String> mapName;
        private @Nullable Output<MapPricingPlan> pricingPlan;

        public Builder() {
    	      // Empty
        }

        public Builder(MapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.description = defaults.description;
    	      this.mapName = defaults.mapName;
    	      this.pricingPlan = defaults.pricingPlan;
        }

        public Builder configuration(Output<MapConfigurationArgs> configuration) {
            this.configuration = Objects.requireNonNull(configuration);
            return this;
        }
        public Builder configuration(MapConfigurationArgs configuration) {
            this.configuration = Output.of(Objects.requireNonNull(configuration));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder mapName(@Nullable Output<String> mapName) {
            this.mapName = mapName;
            return this;
        }
        public Builder mapName(@Nullable String mapName) {
            this.mapName = Output.ofNullable(mapName);
            return this;
        }
        public Builder pricingPlan(@Nullable Output<MapPricingPlan> pricingPlan) {
            this.pricingPlan = pricingPlan;
            return this;
        }
        public Builder pricingPlan(@Nullable MapPricingPlan pricingPlan) {
            this.pricingPlan = Output.ofNullable(pricingPlan);
            return this;
        }        public MapArgs build() {
            return new MapArgs(configuration, description, mapName, pricingPlan);
        }
    }
}
