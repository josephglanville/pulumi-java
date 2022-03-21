// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationArgs Empty = new ConfigurationArgs();

    /**
     * The name of the server configuration.
     * 
     */
    @Import(name="configurationName")
      private final @Nullable Output<String> configurationName;

    public Output<String> getConfigurationName() {
        return this.configurationName == null ? Output.empty() : this.configurationName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
      private final Output<String> serverName;

    public Output<String> getServerName() {
        return this.serverName;
    }

    /**
     * Source of the configuration.
     * 
     */
    @Import(name="source")
      private final @Nullable Output<String> source;

    public Output<String> getSource() {
        return this.source == null ? Output.empty() : this.source;
    }

    /**
     * Value of the configuration.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Output.empty() : this.value;
    }

    public ConfigurationArgs(
        @Nullable Output<String> configurationName,
        Output<String> resourceGroupName,
        Output<String> serverName,
        @Nullable Output<String> source,
        @Nullable Output<String> value) {
        this.configurationName = configurationName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.source = source;
        this.value = value;
    }

    private ConfigurationArgs() {
        this.configurationName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.serverName = Output.empty();
        this.source = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> configurationName;
        private Output<String> resourceGroupName;
        private Output<String> serverName;
        private @Nullable Output<String> source;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationName = defaults.configurationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.source = defaults.source;
    	      this.value = defaults.value;
        }

        public Builder configurationName(@Nullable Output<String> configurationName) {
            this.configurationName = configurationName;
            return this;
        }
        public Builder configurationName(@Nullable String configurationName) {
            this.configurationName = Output.ofNullable(configurationName);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder serverName(Output<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        public Builder serverName(String serverName) {
            this.serverName = Output.of(Objects.requireNonNull(serverName));
            return this;
        }
        public Builder source(@Nullable Output<String> source) {
            this.source = source;
            return this;
        }
        public Builder source(@Nullable String source) {
            this.source = Output.ofNullable(source);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Output.ofNullable(value);
            return this;
        }        public ConfigurationArgs build() {
            return new ConfigurationArgs(configurationName, resourceGroupName, serverName, source, value);
        }
    }
}
