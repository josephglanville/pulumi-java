// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LabPlanNetworkProfileResponse {
    /**
     * The external subnet resource id
     * 
     */
    private final @Nullable String subnetId;

    @CustomType.Constructor
    private LabPlanNetworkProfileResponse(@CustomType.Parameter("subnetId") @Nullable String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * The external subnet resource id
     * 
    */
    public Optional<String> getSubnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabPlanNetworkProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(LabPlanNetworkProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetId = defaults.subnetId;
        }

        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }        public LabPlanNetworkProfileResponse build() {
            return new LabPlanNetworkProfileResponse(subnetId);
        }
    }
}
