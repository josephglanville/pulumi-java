// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationState extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationState Empty = new ConfigurationState();

    /**
     * Amazon Resource Name (ARN) of the configuration.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
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
     * List of Apache Kafka versions which can use this configuration.
     * 
     */
    @Import(name="kafkaVersions")
      private final @Nullable Output<List<String>> kafkaVersions;

    public Output<List<String>> getKafkaVersions() {
        return this.kafkaVersions == null ? Output.empty() : this.kafkaVersions;
    }

    /**
     * Latest revision of the configuration.
     * 
     */
    @Import(name="latestRevision")
      private final @Nullable Output<Integer> latestRevision;

    public Output<Integer> getLatestRevision() {
        return this.latestRevision == null ? Output.empty() : this.latestRevision;
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
     * Contents of the server.properties file. Supported properties are documented in the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration-properties.html).
     * 
     */
    @Import(name="serverProperties")
      private final @Nullable Output<String> serverProperties;

    public Output<String> getServerProperties() {
        return this.serverProperties == null ? Output.empty() : this.serverProperties;
    }

    public ConfigurationState(
        @Nullable Output<String> arn,
        @Nullable Output<String> description,
        @Nullable Output<List<String>> kafkaVersions,
        @Nullable Output<Integer> latestRevision,
        @Nullable Output<String> name,
        @Nullable Output<String> serverProperties) {
        this.arn = arn;
        this.description = description;
        this.kafkaVersions = kafkaVersions;
        this.latestRevision = latestRevision;
        this.name = name;
        this.serverProperties = serverProperties;
    }

    private ConfigurationState() {
        this.arn = Output.empty();
        this.description = Output.empty();
        this.kafkaVersions = Output.empty();
        this.latestRevision = Output.empty();
        this.name = Output.empty();
        this.serverProperties = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> kafkaVersions;
        private @Nullable Output<Integer> latestRevision;
        private @Nullable Output<String> name;
        private @Nullable Output<String> serverProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.kafkaVersions = defaults.kafkaVersions;
    	      this.latestRevision = defaults.latestRevision;
    	      this.name = defaults.name;
    	      this.serverProperties = defaults.serverProperties;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
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
        public Builder kafkaVersions(@Nullable Output<List<String>> kafkaVersions) {
            this.kafkaVersions = kafkaVersions;
            return this;
        }
        public Builder kafkaVersions(@Nullable List<String> kafkaVersions) {
            this.kafkaVersions = Output.ofNullable(kafkaVersions);
            return this;
        }
        public Builder kafkaVersions(String... kafkaVersions) {
            return kafkaVersions(List.of(kafkaVersions));
        }
        public Builder latestRevision(@Nullable Output<Integer> latestRevision) {
            this.latestRevision = latestRevision;
            return this;
        }
        public Builder latestRevision(@Nullable Integer latestRevision) {
            this.latestRevision = Output.ofNullable(latestRevision);
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
        public Builder serverProperties(@Nullable Output<String> serverProperties) {
            this.serverProperties = serverProperties;
            return this;
        }
        public Builder serverProperties(@Nullable String serverProperties) {
            this.serverProperties = Output.ofNullable(serverProperties);
            return this;
        }        public ConfigurationState build() {
            return new ConfigurationState(arn, description, kafkaVersions, latestRevision, name, serverProperties);
        }
    }
}
