// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleMetricDataSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final RuleMetricDataSourceResponse Empty = new RuleMetricDataSourceResponse();

    @InputImport(name="legacyResourceId")
    private final @Nullable String legacyResourceId;

    public Optional<String> getLegacyResourceId() {
        return this.legacyResourceId == null ? Optional.empty() : Optional.ofNullable(this.legacyResourceId);
    }

    @InputImport(name="metricName")
    private final @Nullable String metricName;

    public Optional<String> getMetricName() {
        return this.metricName == null ? Optional.empty() : Optional.ofNullable(this.metricName);
    }

    @InputImport(name="metricNamespace")
    private final @Nullable String metricNamespace;

    public Optional<String> getMetricNamespace() {
        return this.metricNamespace == null ? Optional.empty() : Optional.ofNullable(this.metricNamespace);
    }

    @InputImport(name="odataType", required=true)
    private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    @InputImport(name="resourceLocation")
    private final @Nullable String resourceLocation;

    public Optional<String> getResourceLocation() {
        return this.resourceLocation == null ? Optional.empty() : Optional.ofNullable(this.resourceLocation);
    }

    @InputImport(name="resourceUri")
    private final @Nullable String resourceUri;

    public Optional<String> getResourceUri() {
        return this.resourceUri == null ? Optional.empty() : Optional.ofNullable(this.resourceUri);
    }

    public RuleMetricDataSourceResponse(
        @Nullable String legacyResourceId,
        @Nullable String metricName,
        @Nullable String metricNamespace,
        String odataType,
        @Nullable String resourceLocation,
        @Nullable String resourceUri) {
        this.legacyResourceId = legacyResourceId;
        this.metricName = metricName;
        this.metricNamespace = metricNamespace;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.resourceLocation = resourceLocation;
        this.resourceUri = resourceUri;
    }

    private RuleMetricDataSourceResponse() {
        this.legacyResourceId = null;
        this.metricName = null;
        this.metricNamespace = null;
        this.odataType = null;
        this.resourceLocation = null;
        this.resourceUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleMetricDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String legacyResourceId;
        private @Nullable String metricName;
        private @Nullable String metricNamespace;
        private String odataType;
        private @Nullable String resourceLocation;
        private @Nullable String resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleMetricDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.legacyResourceId = defaults.legacyResourceId;
    	      this.metricName = defaults.metricName;
    	      this.metricNamespace = defaults.metricNamespace;
    	      this.odataType = defaults.odataType;
    	      this.resourceLocation = defaults.resourceLocation;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder setLegacyResourceId(@Nullable String legacyResourceId) {
            this.legacyResourceId = legacyResourceId;
            return this;
        }

        public Builder setMetricName(@Nullable String metricName) {
            this.metricName = metricName;
            return this;
        }

        public Builder setMetricNamespace(@Nullable String metricNamespace) {
            this.metricNamespace = metricNamespace;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setResourceLocation(@Nullable String resourceLocation) {
            this.resourceLocation = resourceLocation;
            return this;
        }

        public Builder setResourceUri(@Nullable String resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }

        public RuleMetricDataSourceResponse build() {
            return new RuleMetricDataSourceResponse(legacyResourceId, metricName, metricNamespace, odataType, resourceLocation, resourceUri);
        }
    }
}
