// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetMonitoring extends io.pulumi.resources.InvokeArgs {

    public static final SpotFleetMonitoring Empty = new SpotFleetMonitoring();

    @Import(name="enabled")
      private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    public SpotFleetMonitoring(@Nullable Boolean enabled) {
        this.enabled = enabled;
    }

    private SpotFleetMonitoring() {
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetMonitoring defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetMonitoring defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }        public SpotFleetMonitoring build() {
            return new SpotFleetMonitoring(enabled);
        }
    }
}
