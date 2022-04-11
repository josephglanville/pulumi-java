// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.metastore_v1beta.inputs.ConsumerArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network configuration for the Dataproc Metastore service.
 * 
 */
public final class NetworkConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkConfigArgs Empty = new NetworkConfigArgs();

    /**
     * Immutable. The consumer-side network configuration for the Dataproc Metastore instance.
     * 
     */
    @Import(name="consumers")
      private final @Nullable Output<List<ConsumerArgs>> consumers;

    public Output<List<ConsumerArgs>> getConsumers() {
        return this.consumers == null ? Codegen.empty() : this.consumers;
    }

    public NetworkConfigArgs(@Nullable Output<List<ConsumerArgs>> consumers) {
        this.consumers = consumers;
    }

    private NetworkConfigArgs() {
        this.consumers = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ConsumerArgs>> consumers;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumers = defaults.consumers;
        }

        public Builder consumers(@Nullable Output<List<ConsumerArgs>> consumers) {
            this.consumers = consumers;
            return this;
        }
        public Builder consumers(@Nullable List<ConsumerArgs> consumers) {
            this.consumers = Codegen.ofNullable(consumers);
            return this;
        }
        public Builder consumers(ConsumerArgs... consumers) {
            return consumers(List.of(consumers));
        }        public NetworkConfigArgs build() {
            return new NetworkConfigArgs(consumers);
        }
    }
}
