// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationArgs Empty = new ConfigurationArgs();

    /**
     * Authentication strategy associated with the configuration. Valid values are `simple` and `ldap`. `ldap` is not supported for `engine_type` `RabbitMQ`.
     * 
     */
    @Import(name="authenticationStrategy")
      private final @Nullable Output<String> authenticationStrategy;

    public Output<String> getAuthenticationStrategy() {
        return this.authenticationStrategy == null ? Output.empty() : this.authenticationStrategy;
    }

    /**
     * Broker configuration in XML format. See [official docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/amazon-mq-broker-configuration-parameters.html) for supported parameters and format of the XML.
     * 
     */
    @Import(name="data", required=true)
      private final Output<String> data;

    public Output<String> getData() {
        return this.data;
    }

    /**
     * Description of the configuration.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Type of broker engine. Valid values are `ActiveMQ` and `RabbitMQ`.
     * 
     */
    @Import(name="engineType", required=true)
      private final Output<String> engineType;

    public Output<String> getEngineType() {
        return this.engineType;
    }

    /**
     * Version of the broker engine.
     * 
     */
    @Import(name="engineVersion", required=true)
      private final Output<String> engineVersion;

    public Output<String> getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * Name of the configuration.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ConfigurationArgs(
        @Nullable Output<String> authenticationStrategy,
        Output<String> data,
        @Nullable Output<String> description,
        Output<String> engineType,
        Output<String> engineVersion,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags) {
        this.authenticationStrategy = authenticationStrategy;
        this.data = Objects.requireNonNull(data, "expected parameter 'data' to be non-null");
        this.description = description;
        this.engineType = Objects.requireNonNull(engineType, "expected parameter 'engineType' to be non-null");
        this.engineVersion = Objects.requireNonNull(engineVersion, "expected parameter 'engineVersion' to be non-null");
        this.name = name;
        this.tags = tags;
    }

    private ConfigurationArgs() {
        this.authenticationStrategy = Output.empty();
        this.data = Output.empty();
        this.description = Output.empty();
        this.engineType = Output.empty();
        this.engineVersion = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authenticationStrategy;
        private Output<String> data;
        private @Nullable Output<String> description;
        private Output<String> engineType;
        private Output<String> engineVersion;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationStrategy = defaults.authenticationStrategy;
    	      this.data = defaults.data;
    	      this.description = defaults.description;
    	      this.engineType = defaults.engineType;
    	      this.engineVersion = defaults.engineVersion;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder authenticationStrategy(@Nullable Output<String> authenticationStrategy) {
            this.authenticationStrategy = authenticationStrategy;
            return this;
        }
        public Builder authenticationStrategy(@Nullable String authenticationStrategy) {
            this.authenticationStrategy = Output.ofNullable(authenticationStrategy);
            return this;
        }
        public Builder data(Output<String> data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        public Builder data(String data) {
            this.data = Output.of(Objects.requireNonNull(data));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder engineType(Output<String> engineType) {
            this.engineType = Objects.requireNonNull(engineType);
            return this;
        }
        public Builder engineType(String engineType) {
            this.engineType = Output.of(Objects.requireNonNull(engineType));
            return this;
        }
        public Builder engineVersion(Output<String> engineVersion) {
            this.engineVersion = Objects.requireNonNull(engineVersion);
            return this;
        }
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = Output.of(Objects.requireNonNull(engineVersion));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public ConfigurationArgs build() {
            return new ConfigurationArgs(authenticationStrategy, data, description, engineType, engineVersion, name, tags);
        }
    }
}