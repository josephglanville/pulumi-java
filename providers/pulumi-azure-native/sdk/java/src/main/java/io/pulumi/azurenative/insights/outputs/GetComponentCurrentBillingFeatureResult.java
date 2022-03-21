// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.ApplicationInsightsComponentDataVolumeCapResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetComponentCurrentBillingFeatureResult {
    /**
     * Current enabled pricing plan. When the component is in the Enterprise plan, this will list both 'Basic' and 'Application Insights Enterprise'.
     * 
     */
    private final @Nullable List<String> currentBillingFeatures;
    /**
     * An Application Insights component daily data volume cap
     * 
     */
    private final @Nullable ApplicationInsightsComponentDataVolumeCapResponse dataVolumeCap;

    @CustomType.Constructor
    private GetComponentCurrentBillingFeatureResult(
        @CustomType.Parameter("currentBillingFeatures") @Nullable List<String> currentBillingFeatures,
        @CustomType.Parameter("dataVolumeCap") @Nullable ApplicationInsightsComponentDataVolumeCapResponse dataVolumeCap) {
        this.currentBillingFeatures = currentBillingFeatures;
        this.dataVolumeCap = dataVolumeCap;
    }

    /**
     * Current enabled pricing plan. When the component is in the Enterprise plan, this will list both 'Basic' and 'Application Insights Enterprise'.
     * 
    */
    public List<String> getCurrentBillingFeatures() {
        return this.currentBillingFeatures == null ? List.of() : this.currentBillingFeatures;
    }
    /**
     * An Application Insights component daily data volume cap
     * 
    */
    public Optional<ApplicationInsightsComponentDataVolumeCapResponse> getDataVolumeCap() {
        return Optional.ofNullable(this.dataVolumeCap);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetComponentCurrentBillingFeatureResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> currentBillingFeatures;
        private @Nullable ApplicationInsightsComponentDataVolumeCapResponse dataVolumeCap;

        public Builder() {
    	      // Empty
        }

        public Builder(GetComponentCurrentBillingFeatureResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentBillingFeatures = defaults.currentBillingFeatures;
    	      this.dataVolumeCap = defaults.dataVolumeCap;
        }

        public Builder currentBillingFeatures(@Nullable List<String> currentBillingFeatures) {
            this.currentBillingFeatures = currentBillingFeatures;
            return this;
        }
        public Builder currentBillingFeatures(String... currentBillingFeatures) {
            return currentBillingFeatures(List.of(currentBillingFeatures));
        }
        public Builder dataVolumeCap(@Nullable ApplicationInsightsComponentDataVolumeCapResponse dataVolumeCap) {
            this.dataVolumeCap = dataVolumeCap;
            return this;
        }        public GetComponentCurrentBillingFeatureResult build() {
            return new GetComponentCurrentBillingFeatureResult(currentBillingFeatures, dataVolumeCap);
        }
    }
}
