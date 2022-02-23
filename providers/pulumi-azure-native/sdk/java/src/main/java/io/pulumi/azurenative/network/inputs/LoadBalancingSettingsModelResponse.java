// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Load balancing settings for a backend pool
 * 
 */
public final class LoadBalancingSettingsModelResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoadBalancingSettingsModelResponse Empty = new LoadBalancingSettingsModelResponse();

    /**
     * The additional latency in milliseconds for probes to fall into the lowest latency bucket
     * 
     */
    @InputImport(name="additionalLatencyMilliseconds")
      private final @Nullable Integer additionalLatencyMilliseconds;

    public Optional<Integer> getAdditionalLatencyMilliseconds() {
        return this.additionalLatencyMilliseconds == null ? Optional.empty() : Optional.ofNullable(this.additionalLatencyMilliseconds);
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Resource name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Resource status.
     * 
     */
    @InputImport(name="resourceState", required=true)
      private final String resourceState;

    public String getResourceState() {
        return this.resourceState;
    }

    /**
     * The number of samples to consider for load balancing decisions
     * 
     */
    @InputImport(name="sampleSize")
      private final @Nullable Integer sampleSize;

    public Optional<Integer> getSampleSize() {
        return this.sampleSize == null ? Optional.empty() : Optional.ofNullable(this.sampleSize);
    }

    /**
     * The number of samples within the sample period that must succeed
     * 
     */
    @InputImport(name="successfulSamplesRequired")
      private final @Nullable Integer successfulSamplesRequired;

    public Optional<Integer> getSuccessfulSamplesRequired() {
        return this.successfulSamplesRequired == null ? Optional.empty() : Optional.ofNullable(this.successfulSamplesRequired);
    }

    /**
     * Resource type.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public LoadBalancingSettingsModelResponse(
        @Nullable Integer additionalLatencyMilliseconds,
        @Nullable String id,
        @Nullable String name,
        String resourceState,
        @Nullable Integer sampleSize,
        @Nullable Integer successfulSamplesRequired,
        String type) {
        this.additionalLatencyMilliseconds = additionalLatencyMilliseconds;
        this.id = id;
        this.name = name;
        this.resourceState = Objects.requireNonNull(resourceState, "expected parameter 'resourceState' to be non-null");
        this.sampleSize = sampleSize;
        this.successfulSamplesRequired = successfulSamplesRequired;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private LoadBalancingSettingsModelResponse() {
        this.additionalLatencyMilliseconds = null;
        this.id = null;
        this.name = null;
        this.resourceState = null;
        this.sampleSize = null;
        this.successfulSamplesRequired = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancingSettingsModelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer additionalLatencyMilliseconds;
        private @Nullable String id;
        private @Nullable String name;
        private String resourceState;
        private @Nullable Integer sampleSize;
        private @Nullable Integer successfulSamplesRequired;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancingSettingsModelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalLatencyMilliseconds = defaults.additionalLatencyMilliseconds;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceState = defaults.resourceState;
    	      this.sampleSize = defaults.sampleSize;
    	      this.successfulSamplesRequired = defaults.successfulSamplesRequired;
    	      this.type = defaults.type;
        }

        public Builder setAdditionalLatencyMilliseconds(@Nullable Integer additionalLatencyMilliseconds) {
            this.additionalLatencyMilliseconds = additionalLatencyMilliseconds;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setResourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }

        public Builder setSampleSize(@Nullable Integer sampleSize) {
            this.sampleSize = sampleSize;
            return this;
        }

        public Builder setSuccessfulSamplesRequired(@Nullable Integer successfulSamplesRequired) {
            this.successfulSamplesRequired = successfulSamplesRequired;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public LoadBalancingSettingsModelResponse build() {
            return new LoadBalancingSettingsModelResponse(additionalLatencyMilliseconds, id, name, resourceState, sampleSize, successfulSamplesRequired, type);
        }
    }
}
