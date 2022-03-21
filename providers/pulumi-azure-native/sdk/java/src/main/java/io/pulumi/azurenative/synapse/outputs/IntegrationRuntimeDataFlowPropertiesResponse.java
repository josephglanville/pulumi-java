// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationRuntimeDataFlowPropertiesResponse {
    /**
     * Compute type of the cluster which will execute data flow job.
     * 
     */
    private final @Nullable String computeType;
    /**
     * Core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272.
     * 
     */
    private final @Nullable Integer coreCount;
    /**
     * Time to live (in minutes) setting of the cluster which will execute data flow job.
     * 
     */
    private final @Nullable Integer timeToLive;

    @CustomType.Constructor
    private IntegrationRuntimeDataFlowPropertiesResponse(
        @CustomType.Parameter("computeType") @Nullable String computeType,
        @CustomType.Parameter("coreCount") @Nullable Integer coreCount,
        @CustomType.Parameter("timeToLive") @Nullable Integer timeToLive) {
        this.computeType = computeType;
        this.coreCount = coreCount;
        this.timeToLive = timeToLive;
    }

    /**
     * Compute type of the cluster which will execute data flow job.
     * 
    */
    public Optional<String> getComputeType() {
        return Optional.ofNullable(this.computeType);
    }
    /**
     * Core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272.
     * 
    */
    public Optional<Integer> getCoreCount() {
        return Optional.ofNullable(this.coreCount);
    }
    /**
     * Time to live (in minutes) setting of the cluster which will execute data flow job.
     * 
    */
    public Optional<Integer> getTimeToLive() {
        return Optional.ofNullable(this.timeToLive);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeDataFlowPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String computeType;
        private @Nullable Integer coreCount;
        private @Nullable Integer timeToLive;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeDataFlowPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeType = defaults.computeType;
    	      this.coreCount = defaults.coreCount;
    	      this.timeToLive = defaults.timeToLive;
        }

        public Builder computeType(@Nullable String computeType) {
            this.computeType = computeType;
            return this;
        }
        public Builder coreCount(@Nullable Integer coreCount) {
            this.coreCount = coreCount;
            return this;
        }
        public Builder timeToLive(@Nullable Integer timeToLive) {
            this.timeToLive = timeToLive;
            return this;
        }        public IntegrationRuntimeDataFlowPropertiesResponse build() {
            return new IntegrationRuntimeDataFlowPropertiesResponse(computeType, coreCount, timeToLive);
        }
    }
}
