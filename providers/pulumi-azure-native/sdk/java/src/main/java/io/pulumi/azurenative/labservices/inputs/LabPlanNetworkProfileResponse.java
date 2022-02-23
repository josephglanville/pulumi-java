// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Profile for how to handle networking for Lab Plans.
 * 
 */
public final class LabPlanNetworkProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final LabPlanNetworkProfileResponse Empty = new LabPlanNetworkProfileResponse();

    /**
     * The external subnet resource id
     * 
     */
    @InputImport(name="subnetId")
      private final @Nullable String subnetId;

    public Optional<String> getSubnetId() {
        return this.subnetId == null ? Optional.empty() : Optional.ofNullable(this.subnetId);
    }

    public LabPlanNetworkProfileResponse(@Nullable String subnetId) {
        this.subnetId = subnetId;
    }

    private LabPlanNetworkProfileResponse() {
        this.subnetId = null;
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

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public LabPlanNetworkProfileResponse build() {
            return new LabPlanNetworkProfileResponse(subnetId);
        }
    }
}
