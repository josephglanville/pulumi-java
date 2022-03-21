// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.container_v1beta1.inputs.GcfsConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Subset of NodeConfig message that has defaults.
 * 
 */
public final class NodeConfigDefaultsArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeConfigDefaultsArgs Empty = new NodeConfigDefaultsArgs();

    /**
     * GCFS (Google Container File System, a.k.a Riptide) options.
     * 
     */
    @Import(name="gcfsConfig")
      private final @Nullable Output<GcfsConfigArgs> gcfsConfig;

    public Output<GcfsConfigArgs> getGcfsConfig() {
        return this.gcfsConfig == null ? Output.empty() : this.gcfsConfig;
    }

    public NodeConfigDefaultsArgs(@Nullable Output<GcfsConfigArgs> gcfsConfig) {
        this.gcfsConfig = gcfsConfig;
    }

    private NodeConfigDefaultsArgs() {
        this.gcfsConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeConfigDefaultsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GcfsConfigArgs> gcfsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeConfigDefaultsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcfsConfig = defaults.gcfsConfig;
        }

        public Builder gcfsConfig(@Nullable Output<GcfsConfigArgs> gcfsConfig) {
            this.gcfsConfig = gcfsConfig;
            return this;
        }
        public Builder gcfsConfig(@Nullable GcfsConfigArgs gcfsConfig) {
            this.gcfsConfig = Output.ofNullable(gcfsConfig);
            return this;
        }        public NodeConfigDefaultsArgs build() {
            return new NodeConfigDefaultsArgs(gcfsConfig);
        }
    }
}
