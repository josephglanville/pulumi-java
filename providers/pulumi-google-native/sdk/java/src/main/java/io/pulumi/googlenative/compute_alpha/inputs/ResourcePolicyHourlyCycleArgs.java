// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Time window specified for hourly operations.
 * 
 */
public final class ResourcePolicyHourlyCycleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyHourlyCycleArgs Empty = new ResourcePolicyHourlyCycleArgs();

    /**
     * Defines a schedule with units measured in hours. The value determines how many hours pass between the start of each cycle.
     * 
     */
    @Import(name="hoursInCycle")
      private final @Nullable Output<Integer> hoursInCycle;

    public Output<Integer> getHoursInCycle() {
        return this.hoursInCycle == null ? Output.empty() : this.hoursInCycle;
    }

    /**
     * Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime == null ? Output.empty() : this.startTime;
    }

    public ResourcePolicyHourlyCycleArgs(
        @Nullable Output<Integer> hoursInCycle,
        @Nullable Output<String> startTime) {
        this.hoursInCycle = hoursInCycle;
        this.startTime = startTime;
    }

    private ResourcePolicyHourlyCycleArgs() {
        this.hoursInCycle = Output.empty();
        this.startTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyHourlyCycleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> hoursInCycle;
        private @Nullable Output<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyHourlyCycleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hoursInCycle = defaults.hoursInCycle;
    	      this.startTime = defaults.startTime;
        }

        public Builder hoursInCycle(@Nullable Output<Integer> hoursInCycle) {
            this.hoursInCycle = hoursInCycle;
            return this;
        }
        public Builder hoursInCycle(@Nullable Integer hoursInCycle) {
            this.hoursInCycle = Output.ofNullable(hoursInCycle);
            return this;
        }
        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = Output.ofNullable(startTime);
            return this;
        }        public ResourcePolicyHourlyCycleArgs build() {
            return new ResourcePolicyHourlyCycleArgs(hoursInCycle, startTime);
        }
    }
}
