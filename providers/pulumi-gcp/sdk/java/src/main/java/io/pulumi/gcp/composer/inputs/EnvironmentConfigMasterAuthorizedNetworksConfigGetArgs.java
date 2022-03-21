// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.composer.inputs.EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs Empty = new EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs();

    @Import(name="cidrBlocks")
      private final @Nullable Output<List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs>> cidrBlocks;

    public Output<List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs>> getCidrBlocks() {
        return this.cidrBlocks == null ? Output.empty() : this.cidrBlocks;
    }

    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled;
    }

    public EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs(
        @Nullable Output<List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs>> cidrBlocks,
        Output<Boolean> enabled) {
        this.cidrBlocks = cidrBlocks;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs() {
        this.cidrBlocks = Output.empty();
        this.enabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs>> cidrBlocks;
        private Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.enabled = defaults.enabled;
        }

        public Builder cidrBlocks(@Nullable Output<List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs>> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            return this;
        }
        public Builder cidrBlocks(@Nullable List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs> cidrBlocks) {
            this.cidrBlocks = Output.ofNullable(cidrBlocks);
            return this;
        }
        public Builder cidrBlocks(EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }
        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }        public EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs build() {
            return new EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs(cidrBlocks, enabled);
        }
    }
}
