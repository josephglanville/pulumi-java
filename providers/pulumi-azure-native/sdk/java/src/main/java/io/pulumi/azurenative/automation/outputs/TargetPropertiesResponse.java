// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.azurenative.automation.outputs.AzureQueryPropertiesResponse;
import io.pulumi.azurenative.automation.outputs.NonAzureQueryPropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class TargetPropertiesResponse {
    /**
     * List of Azure queries in the software update configuration.
     * 
     */
    private final @Nullable List<AzureQueryPropertiesResponse> azureQueries;
    /**
     * List of non Azure queries in the software update configuration.
     * 
     */
    private final @Nullable List<NonAzureQueryPropertiesResponse> nonAzureQueries;

    @CustomType.Constructor
    private TargetPropertiesResponse(
        @CustomType.Parameter("azureQueries") @Nullable List<AzureQueryPropertiesResponse> azureQueries,
        @CustomType.Parameter("nonAzureQueries") @Nullable List<NonAzureQueryPropertiesResponse> nonAzureQueries) {
        this.azureQueries = azureQueries;
        this.nonAzureQueries = nonAzureQueries;
    }

    /**
     * List of Azure queries in the software update configuration.
     * 
    */
    public List<AzureQueryPropertiesResponse> getAzureQueries() {
        return this.azureQueries == null ? List.of() : this.azureQueries;
    }
    /**
     * List of non Azure queries in the software update configuration.
     * 
    */
    public List<NonAzureQueryPropertiesResponse> getNonAzureQueries() {
        return this.nonAzureQueries == null ? List.of() : this.nonAzureQueries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AzureQueryPropertiesResponse> azureQueries;
        private @Nullable List<NonAzureQueryPropertiesResponse> nonAzureQueries;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureQueries = defaults.azureQueries;
    	      this.nonAzureQueries = defaults.nonAzureQueries;
        }

        public Builder azureQueries(@Nullable List<AzureQueryPropertiesResponse> azureQueries) {
            this.azureQueries = azureQueries;
            return this;
        }
        public Builder azureQueries(AzureQueryPropertiesResponse... azureQueries) {
            return azureQueries(List.of(azureQueries));
        }
        public Builder nonAzureQueries(@Nullable List<NonAzureQueryPropertiesResponse> nonAzureQueries) {
            this.nonAzureQueries = nonAzureQueries;
            return this;
        }
        public Builder nonAzureQueries(NonAzureQueryPropertiesResponse... nonAzureQueries) {
            return nonAzureQueries(List.of(nonAzureQueries));
        }        public TargetPropertiesResponse build() {
            return new TargetPropertiesResponse(azureQueries, nonAzureQueries);
        }
    }
}
