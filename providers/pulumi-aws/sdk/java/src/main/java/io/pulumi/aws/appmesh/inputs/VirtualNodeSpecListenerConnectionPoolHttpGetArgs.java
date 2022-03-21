// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerConnectionPoolHttpGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerConnectionPoolHttpGetArgs Empty = new VirtualNodeSpecListenerConnectionPoolHttpGetArgs();

    /**
     * Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster. Minimum value of `1`.
     * 
     */
    @Import(name="maxConnections", required=true)
      private final Output<Integer> maxConnections;

    public Output<Integer> getMaxConnections() {
        return this.maxConnections;
    }

    /**
     * Number of overflowing requests after `max_connections` Envoy will queue to upstream cluster. Minimum value of `1`.
     * 
     */
    @Import(name="maxPendingRequests")
      private final @Nullable Output<Integer> maxPendingRequests;

    public Output<Integer> getMaxPendingRequests() {
        return this.maxPendingRequests == null ? Output.empty() : this.maxPendingRequests;
    }

    public VirtualNodeSpecListenerConnectionPoolHttpGetArgs(
        Output<Integer> maxConnections,
        @Nullable Output<Integer> maxPendingRequests) {
        this.maxConnections = Objects.requireNonNull(maxConnections, "expected parameter 'maxConnections' to be non-null");
        this.maxPendingRequests = maxPendingRequests;
    }

    private VirtualNodeSpecListenerConnectionPoolHttpGetArgs() {
        this.maxConnections = Output.empty();
        this.maxPendingRequests = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerConnectionPoolHttpGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> maxConnections;
        private @Nullable Output<Integer> maxPendingRequests;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerConnectionPoolHttpGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxPendingRequests = defaults.maxPendingRequests;
        }

        public Builder maxConnections(Output<Integer> maxConnections) {
            this.maxConnections = Objects.requireNonNull(maxConnections);
            return this;
        }
        public Builder maxConnections(Integer maxConnections) {
            this.maxConnections = Output.of(Objects.requireNonNull(maxConnections));
            return this;
        }
        public Builder maxPendingRequests(@Nullable Output<Integer> maxPendingRequests) {
            this.maxPendingRequests = maxPendingRequests;
            return this;
        }
        public Builder maxPendingRequests(@Nullable Integer maxPendingRequests) {
            this.maxPendingRequests = Output.ofNullable(maxPendingRequests);
            return this;
        }        public VirtualNodeSpecListenerConnectionPoolHttpGetArgs build() {
            return new VirtualNodeSpecListenerConnectionPoolHttpGetArgs(maxConnections, maxPendingRequests);
        }
    }
}
