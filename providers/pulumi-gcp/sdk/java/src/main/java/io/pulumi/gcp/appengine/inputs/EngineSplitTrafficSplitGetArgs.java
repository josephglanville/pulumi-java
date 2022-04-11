// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EngineSplitTrafficSplitGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EngineSplitTrafficSplitGetArgs Empty = new EngineSplitTrafficSplitGetArgs();

    /**
     * Mapping from version IDs within the service to fractional (0.000, 1] allocations of traffic for that version. Each version can be specified only once, but some versions in the service may not have any traffic allocation. Services that have traffic allocated cannot be deleted until either the service is deleted or their traffic allocation is removed. Allocations must sum to 1. Up to two decimal place precision is supported for IP-based splits and up to three decimal places is supported for cookie-based splits.
     * 
     */
    @Import(name="allocations", required=true)
      private final Output<Map<String,String>> allocations;

    public Output<Map<String,String>> getAllocations() {
        return this.allocations;
    }

    /**
     * Mechanism used to determine which version a request is sent to. The traffic selection algorithm will be stable for either type until allocations are changed.
     * Possible values are `UNSPECIFIED`, `COOKIE`, `IP`, and `RANDOM`.
     * 
     */
    @Import(name="shardBy")
      private final @Nullable Output<String> shardBy;

    public Output<String> getShardBy() {
        return this.shardBy == null ? Codegen.empty() : this.shardBy;
    }

    public EngineSplitTrafficSplitGetArgs(
        Output<Map<String,String>> allocations,
        @Nullable Output<String> shardBy) {
        this.allocations = Objects.requireNonNull(allocations, "expected parameter 'allocations' to be non-null");
        this.shardBy = shardBy;
    }

    private EngineSplitTrafficSplitGetArgs() {
        this.allocations = Codegen.empty();
        this.shardBy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EngineSplitTrafficSplitGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Map<String,String>> allocations;
        private @Nullable Output<String> shardBy;

        public Builder() {
    	      // Empty
        }

        public Builder(EngineSplitTrafficSplitGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocations = defaults.allocations;
    	      this.shardBy = defaults.shardBy;
        }

        public Builder allocations(Output<Map<String,String>> allocations) {
            this.allocations = Objects.requireNonNull(allocations);
            return this;
        }
        public Builder allocations(Map<String,String> allocations) {
            this.allocations = Output.of(Objects.requireNonNull(allocations));
            return this;
        }
        public Builder shardBy(@Nullable Output<String> shardBy) {
            this.shardBy = shardBy;
            return this;
        }
        public Builder shardBy(@Nullable String shardBy) {
            this.shardBy = Codegen.ofNullable(shardBy);
            return this;
        }        public EngineSplitTrafficSplitGetArgs build() {
            return new EngineSplitTrafficSplitGetArgs(allocations, shardBy);
        }
    }
}
