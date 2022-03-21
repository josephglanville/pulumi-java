// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureBlobFSWriteSettingsResponse {
    /**
     * Indicates the block size(MB) when writing data to blob. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object blockSizeInMB;
    /**
     * The type of copy behavior for copy sink.
     * 
     */
    private final @Nullable Object copyBehavior;
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * The write setting type.
     * Expected value is 'AzureBlobFSWriteSettings'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AzureBlobFSWriteSettingsResponse(
        @CustomType.Parameter("blockSizeInMB") @Nullable Object blockSizeInMB,
        @CustomType.Parameter("copyBehavior") @Nullable Object copyBehavior,
        @CustomType.Parameter("disableMetricsCollection") @Nullable Object disableMetricsCollection,
        @CustomType.Parameter("maxConcurrentConnections") @Nullable Object maxConcurrentConnections,
        @CustomType.Parameter("type") String type) {
        this.blockSizeInMB = blockSizeInMB;
        this.copyBehavior = copyBehavior;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.type = type;
    }

    /**
     * Indicates the block size(MB) when writing data to blob. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getBlockSizeInMB() {
        return Optional.ofNullable(this.blockSizeInMB);
    }
    /**
     * The type of copy behavior for copy sink.
     * 
    */
    public Optional<Object> getCopyBehavior() {
        return Optional.ofNullable(this.copyBehavior);
    }
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * The write setting type.
     * Expected value is 'AzureBlobFSWriteSettings'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobFSWriteSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object blockSizeInMB;
        private @Nullable Object copyBehavior;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobFSWriteSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockSizeInMB = defaults.blockSizeInMB;
    	      this.copyBehavior = defaults.copyBehavior;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.type = defaults.type;
        }

        public Builder blockSizeInMB(@Nullable Object blockSizeInMB) {
            this.blockSizeInMB = blockSizeInMB;
            return this;
        }
        public Builder copyBehavior(@Nullable Object copyBehavior) {
            this.copyBehavior = copyBehavior;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AzureBlobFSWriteSettingsResponse build() {
            return new AzureBlobFSWriteSettingsResponse(blockSizeInMB, copyBehavior, disableMetricsCollection, maxConcurrentConnections, type);
        }
    }
}
