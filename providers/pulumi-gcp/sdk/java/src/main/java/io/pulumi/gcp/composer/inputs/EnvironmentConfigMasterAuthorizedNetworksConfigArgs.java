// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.composer.inputs.EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentConfigMasterAuthorizedNetworksConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentConfigMasterAuthorizedNetworksConfigArgs Empty = new EnvironmentConfigMasterAuthorizedNetworksConfigArgs();

    @InputImport(name="cidrBlocks")
      private final @Nullable Input<List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs>> cidrBlocks;

    public Input<List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs>> getCidrBlocks() {
        return this.cidrBlocks == null ? Input.empty() : this.cidrBlocks;
    }

    @InputImport(name="enabled", required=true)
      private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    public EnvironmentConfigMasterAuthorizedNetworksConfigArgs(
        @Nullable Input<List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs>> cidrBlocks,
        Input<Boolean> enabled) {
        this.cidrBlocks = cidrBlocks;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private EnvironmentConfigMasterAuthorizedNetworksConfigArgs() {
        this.cidrBlocks = Input.empty();
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigMasterAuthorizedNetworksConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs>> cidrBlocks;
        private Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigMasterAuthorizedNetworksConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.enabled = defaults.enabled;
        }

        public Builder setCidrBlocks(@Nullable Input<List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs>> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            return this;
        }

        public Builder setCidrBlocks(@Nullable List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs> cidrBlocks) {
            this.cidrBlocks = Input.ofNullable(cidrBlocks);
            return this;
        }

        public Builder setEnabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }
        public EnvironmentConfigMasterAuthorizedNetworksConfigArgs build() {
            return new EnvironmentConfigMasterAuthorizedNetworksConfigArgs(cidrBlocks, enabled);
        }
    }
}
