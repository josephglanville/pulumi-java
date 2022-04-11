// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodePoolNetworkConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodePoolNetworkConfigGetArgs Empty = new NodePoolNetworkConfigGetArgs();

    @Import(name="createPodRange")
      private final @Nullable Output<Boolean> createPodRange;

    public Output<Boolean> getCreatePodRange() {
        return this.createPodRange == null ? Codegen.empty() : this.createPodRange;
    }

    @Import(name="podIpv4CidrBlock")
      private final @Nullable Output<String> podIpv4CidrBlock;

    public Output<String> getPodIpv4CidrBlock() {
        return this.podIpv4CidrBlock == null ? Codegen.empty() : this.podIpv4CidrBlock;
    }

    @Import(name="podRange", required=true)
      private final Output<String> podRange;

    public Output<String> getPodRange() {
        return this.podRange;
    }

    public NodePoolNetworkConfigGetArgs(
        @Nullable Output<Boolean> createPodRange,
        @Nullable Output<String> podIpv4CidrBlock,
        Output<String> podRange) {
        this.createPodRange = createPodRange;
        this.podIpv4CidrBlock = podIpv4CidrBlock;
        this.podRange = Objects.requireNonNull(podRange, "expected parameter 'podRange' to be non-null");
    }

    private NodePoolNetworkConfigGetArgs() {
        this.createPodRange = Codegen.empty();
        this.podIpv4CidrBlock = Codegen.empty();
        this.podRange = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNetworkConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> createPodRange;
        private @Nullable Output<String> podIpv4CidrBlock;
        private Output<String> podRange;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolNetworkConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createPodRange = defaults.createPodRange;
    	      this.podIpv4CidrBlock = defaults.podIpv4CidrBlock;
    	      this.podRange = defaults.podRange;
        }

        public Builder createPodRange(@Nullable Output<Boolean> createPodRange) {
            this.createPodRange = createPodRange;
            return this;
        }
        public Builder createPodRange(@Nullable Boolean createPodRange) {
            this.createPodRange = Codegen.ofNullable(createPodRange);
            return this;
        }
        public Builder podIpv4CidrBlock(@Nullable Output<String> podIpv4CidrBlock) {
            this.podIpv4CidrBlock = podIpv4CidrBlock;
            return this;
        }
        public Builder podIpv4CidrBlock(@Nullable String podIpv4CidrBlock) {
            this.podIpv4CidrBlock = Codegen.ofNullable(podIpv4CidrBlock);
            return this;
        }
        public Builder podRange(Output<String> podRange) {
            this.podRange = Objects.requireNonNull(podRange);
            return this;
        }
        public Builder podRange(String podRange) {
            this.podRange = Output.of(Objects.requireNonNull(podRange));
            return this;
        }        public NodePoolNetworkConfigGetArgs build() {
            return new NodePoolNetworkConfigGetArgs(createPodRange, podIpv4CidrBlock, podRange);
        }
    }
}
