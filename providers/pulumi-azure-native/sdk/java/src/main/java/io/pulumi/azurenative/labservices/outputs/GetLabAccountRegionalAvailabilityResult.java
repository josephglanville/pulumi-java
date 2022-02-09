// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.azurenative.labservices.outputs.RegionalAvailabilityResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLabAccountRegionalAvailabilityResult {
    private final @Nullable List<RegionalAvailabilityResponse> regionalAvailability;

    @OutputCustomType.Constructor({"regionalAvailability"})
    private GetLabAccountRegionalAvailabilityResult(@Nullable List<RegionalAvailabilityResponse> regionalAvailability) {
        this.regionalAvailability = regionalAvailability;
    }

    public List<RegionalAvailabilityResponse> getRegionalAvailability() {
        return this.regionalAvailability == null ? List.of() : this.regionalAvailability;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLabAccountRegionalAvailabilityResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<RegionalAvailabilityResponse> regionalAvailability;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLabAccountRegionalAvailabilityResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regionalAvailability = defaults.regionalAvailability;
        }

        public Builder setRegionalAvailability(@Nullable List<RegionalAvailabilityResponse> regionalAvailability) {
            this.regionalAvailability = regionalAvailability;
            return this;
        }

        public GetLabAccountRegionalAvailabilityResult build() {
            return new GetLabAccountRegionalAvailabilityResult(regionalAvailability);
        }
    }
}
