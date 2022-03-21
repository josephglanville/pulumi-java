// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration options for the Config Connector add-on.
 * 
 */
public final class ConfigConnectorConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigConnectorConfigArgs Empty = new ConfigConnectorConfigArgs();

    /**
     * Whether Cloud Connector is enabled for this cluster.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    public ConfigConnectorConfigArgs(@Nullable Output<Boolean> enabled) {
        this.enabled = enabled;
    }

    private ConfigConnectorConfigArgs() {
        this.enabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigConnectorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigConnectorConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }        public ConfigConnectorConfigArgs build() {
            return new ConfigConnectorConfigArgs(enabled);
        }
    }
}
