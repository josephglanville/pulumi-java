// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureMembershipConfigmanagementBinauthzArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureMembershipConfigmanagementBinauthzArgs Empty = new FeatureMembershipConfigmanagementBinauthzArgs();

    /**
     * Enables the installation of Policy Controller. If false, the rest of PolicyController fields take no effect.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    public FeatureMembershipConfigmanagementBinauthzArgs(@Nullable Input<Boolean> enabled) {
        this.enabled = enabled;
    }

    private FeatureMembershipConfigmanagementBinauthzArgs() {
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureMembershipConfigmanagementBinauthzArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureMembershipConfigmanagementBinauthzArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }
        public FeatureMembershipConfigmanagementBinauthzArgs build() {
            return new FeatureMembershipConfigmanagementBinauthzArgs(enabled);
        }
    }
}
