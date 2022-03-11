// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs Empty = new ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs();

    /**
     * External network that can access Kubernetes master through HTTPS.
     * Must be specified in CIDR notation.
     * 
     */
    @InputImport(name="cidrBlock", required=true)
      private final Output<String> cidrBlock;

    public Output<String> getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * Field for users to identify CIDR blocks.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    public ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs(
        Output<String> cidrBlock,
        @Nullable Output<String> displayName) {
        this.cidrBlock = Objects.requireNonNull(cidrBlock, "expected parameter 'cidrBlock' to be non-null");
        this.displayName = displayName;
    }

    private ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs() {
        this.cidrBlock = Output.empty();
        this.displayName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cidrBlock;
        private @Nullable Output<String> displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.displayName = defaults.displayName;
        }

        public Builder cidrBlock(Output<String> cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }

        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = Output.of(Objects.requireNonNull(cidrBlock));
            return this;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }
        public ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs build() {
            return new ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs(cidrBlock, displayName);
        }
    }
}
