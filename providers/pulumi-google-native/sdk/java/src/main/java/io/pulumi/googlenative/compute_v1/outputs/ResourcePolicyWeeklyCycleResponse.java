// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.compute_v1.outputs.ResourcePolicyWeeklyCycleDayOfWeekResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ResourcePolicyWeeklyCycleResponse {
    /**
     * Up to 7 intervals/windows, one for each day of the week.
     * 
     */
    private final List<ResourcePolicyWeeklyCycleDayOfWeekResponse> dayOfWeeks;

    @CustomType.Constructor
    private ResourcePolicyWeeklyCycleResponse(@CustomType.Parameter("dayOfWeeks") List<ResourcePolicyWeeklyCycleDayOfWeekResponse> dayOfWeeks) {
        this.dayOfWeeks = dayOfWeeks;
    }

    /**
     * Up to 7 intervals/windows, one for each day of the week.
     * 
    */
    public List<ResourcePolicyWeeklyCycleDayOfWeekResponse> getDayOfWeeks() {
        return this.dayOfWeeks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyWeeklyCycleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ResourcePolicyWeeklyCycleDayOfWeekResponse> dayOfWeeks;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyWeeklyCycleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeeks = defaults.dayOfWeeks;
        }

        public Builder dayOfWeeks(List<ResourcePolicyWeeklyCycleDayOfWeekResponse> dayOfWeeks) {
            this.dayOfWeeks = Objects.requireNonNull(dayOfWeeks);
            return this;
        }
        public Builder dayOfWeeks(ResourcePolicyWeeklyCycleDayOfWeekResponse... dayOfWeeks) {
            return dayOfWeeks(List.of(dayOfWeeks));
        }        public ResourcePolicyWeeklyCycleResponse build() {
            return new ResourcePolicyWeeklyCycleResponse(dayOfWeeks);
        }
    }
}
