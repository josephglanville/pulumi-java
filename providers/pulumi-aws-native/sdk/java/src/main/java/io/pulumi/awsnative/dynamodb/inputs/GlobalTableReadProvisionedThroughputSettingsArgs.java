// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.inputs;

import io.pulumi.awsnative.dynamodb.inputs.GlobalTableCapacityAutoScalingSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalTableReadProvisionedThroughputSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalTableReadProvisionedThroughputSettingsArgs Empty = new GlobalTableReadProvisionedThroughputSettingsArgs();

    @InputImport(name="readCapacityAutoScalingSettings")
      private final @Nullable Input<GlobalTableCapacityAutoScalingSettingsArgs> readCapacityAutoScalingSettings;

    public Input<GlobalTableCapacityAutoScalingSettingsArgs> getReadCapacityAutoScalingSettings() {
        return this.readCapacityAutoScalingSettings == null ? Input.empty() : this.readCapacityAutoScalingSettings;
    }

    @InputImport(name="readCapacityUnits")
      private final @Nullable Input<Integer> readCapacityUnits;

    public Input<Integer> getReadCapacityUnits() {
        return this.readCapacityUnits == null ? Input.empty() : this.readCapacityUnits;
    }

    public GlobalTableReadProvisionedThroughputSettingsArgs(
        @Nullable Input<GlobalTableCapacityAutoScalingSettingsArgs> readCapacityAutoScalingSettings,
        @Nullable Input<Integer> readCapacityUnits) {
        this.readCapacityAutoScalingSettings = readCapacityAutoScalingSettings;
        this.readCapacityUnits = readCapacityUnits;
    }

    private GlobalTableReadProvisionedThroughputSettingsArgs() {
        this.readCapacityAutoScalingSettings = Input.empty();
        this.readCapacityUnits = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableReadProvisionedThroughputSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GlobalTableCapacityAutoScalingSettingsArgs> readCapacityAutoScalingSettings;
        private @Nullable Input<Integer> readCapacityUnits;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableReadProvisionedThroughputSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.readCapacityAutoScalingSettings = defaults.readCapacityAutoScalingSettings;
    	      this.readCapacityUnits = defaults.readCapacityUnits;
        }

        public Builder setReadCapacityAutoScalingSettings(@Nullable Input<GlobalTableCapacityAutoScalingSettingsArgs> readCapacityAutoScalingSettings) {
            this.readCapacityAutoScalingSettings = readCapacityAutoScalingSettings;
            return this;
        }

        public Builder setReadCapacityAutoScalingSettings(@Nullable GlobalTableCapacityAutoScalingSettingsArgs readCapacityAutoScalingSettings) {
            this.readCapacityAutoScalingSettings = Input.ofNullable(readCapacityAutoScalingSettings);
            return this;
        }

        public Builder setReadCapacityUnits(@Nullable Input<Integer> readCapacityUnits) {
            this.readCapacityUnits = readCapacityUnits;
            return this;
        }

        public Builder setReadCapacityUnits(@Nullable Integer readCapacityUnits) {
            this.readCapacityUnits = Input.ofNullable(readCapacityUnits);
            return this;
        }
        public GlobalTableReadProvisionedThroughputSettingsArgs build() {
            return new GlobalTableReadProvisionedThroughputSettingsArgs(readCapacityAutoScalingSettings, readCapacityUnits);
        }
    }
}
