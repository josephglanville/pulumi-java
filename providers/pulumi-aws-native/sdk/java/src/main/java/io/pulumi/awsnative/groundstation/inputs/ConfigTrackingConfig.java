// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.awsnative.groundstation.enums.ConfigTrackingConfigAutotrack;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigTrackingConfig extends io.pulumi.resources.InvokeArgs {

    public static final ConfigTrackingConfig Empty = new ConfigTrackingConfig();

    @Import(name="autotrack")
      private final @Nullable ConfigTrackingConfigAutotrack autotrack;

    public Optional<ConfigTrackingConfigAutotrack> getAutotrack() {
        return this.autotrack == null ? Optional.empty() : Optional.ofNullable(this.autotrack);
    }

    public ConfigTrackingConfig(@Nullable ConfigTrackingConfigAutotrack autotrack) {
        this.autotrack = autotrack;
    }

    private ConfigTrackingConfig() {
        this.autotrack = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigTrackingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigTrackingConfigAutotrack autotrack;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigTrackingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autotrack = defaults.autotrack;
        }

        public Builder autotrack(@Nullable ConfigTrackingConfigAutotrack autotrack) {
            this.autotrack = autotrack;
            return this;
        }        public ConfigTrackingConfig build() {
            return new ConfigTrackingConfig(autotrack);
        }
    }
}
