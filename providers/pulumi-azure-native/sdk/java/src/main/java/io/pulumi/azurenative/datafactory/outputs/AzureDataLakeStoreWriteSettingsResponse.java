// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureDataLakeStoreWriteSettingsResponse {
    private final @Nullable Object copyBehavior;
    private final @Nullable Object disableMetricsCollection;
    private final @Nullable Object expiryDateTime;
    private final @Nullable Object maxConcurrentConnections;
    private final String type;

    @OutputCustomType.Constructor({"copyBehavior","disableMetricsCollection","expiryDateTime","maxConcurrentConnections","type"})
    private AzureDataLakeStoreWriteSettingsResponse(
        @Nullable Object copyBehavior,
        @Nullable Object disableMetricsCollection,
        @Nullable Object expiryDateTime,
        @Nullable Object maxConcurrentConnections,
        String type) {
        this.copyBehavior = copyBehavior;
        this.disableMetricsCollection = disableMetricsCollection;
        this.expiryDateTime = expiryDateTime;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<Object> getCopyBehavior() {
        return Optional.ofNullable(this.copyBehavior);
    }
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    public Optional<Object> getExpiryDateTime() {
        return Optional.ofNullable(this.expiryDateTime);
    }
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataLakeStoreWriteSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object copyBehavior;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object expiryDateTime;
        private @Nullable Object maxConcurrentConnections;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataLakeStoreWriteSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyBehavior = defaults.copyBehavior;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.expiryDateTime = defaults.expiryDateTime;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.type = defaults.type;
        }

        public Builder setCopyBehavior(@Nullable Object copyBehavior) {
            this.copyBehavior = copyBehavior;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setExpiryDateTime(@Nullable Object expiryDateTime) {
            this.expiryDateTime = expiryDateTime;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public AzureDataLakeStoreWriteSettingsResponse build() {
            return new AzureDataLakeStoreWriteSettingsResponse(copyBehavior, disableMetricsCollection, expiryDateTime, maxConcurrentConnections, type);
        }
    }
}
