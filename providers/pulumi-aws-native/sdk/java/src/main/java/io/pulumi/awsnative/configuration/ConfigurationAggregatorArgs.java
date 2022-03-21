// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration;

import io.pulumi.awsnative.configuration.inputs.ConfigurationAggregatorAccountAggregationSourceArgs;
import io.pulumi.awsnative.configuration.inputs.ConfigurationAggregatorOrganizationAggregationSourceArgs;
import io.pulumi.awsnative.configuration.inputs.ConfigurationAggregatorTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationAggregatorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationAggregatorArgs Empty = new ConfigurationAggregatorArgs();

    @Import(name="accountAggregationSources")
      private final @Nullable Output<List<ConfigurationAggregatorAccountAggregationSourceArgs>> accountAggregationSources;

    public Output<List<ConfigurationAggregatorAccountAggregationSourceArgs>> getAccountAggregationSources() {
        return this.accountAggregationSources == null ? Output.empty() : this.accountAggregationSources;
    }

    /**
     * The name of the aggregator.
     * 
     */
    @Import(name="configurationAggregatorName")
      private final @Nullable Output<String> configurationAggregatorName;

    public Output<String> getConfigurationAggregatorName() {
        return this.configurationAggregatorName == null ? Output.empty() : this.configurationAggregatorName;
    }

    @Import(name="organizationAggregationSource")
      private final @Nullable Output<ConfigurationAggregatorOrganizationAggregationSourceArgs> organizationAggregationSource;

    public Output<ConfigurationAggregatorOrganizationAggregationSourceArgs> getOrganizationAggregationSource() {
        return this.organizationAggregationSource == null ? Output.empty() : this.organizationAggregationSource;
    }

    /**
     * The tags for the configuration aggregator.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<ConfigurationAggregatorTagArgs>> tags;

    public Output<List<ConfigurationAggregatorTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ConfigurationAggregatorArgs(
        @Nullable Output<List<ConfigurationAggregatorAccountAggregationSourceArgs>> accountAggregationSources,
        @Nullable Output<String> configurationAggregatorName,
        @Nullable Output<ConfigurationAggregatorOrganizationAggregationSourceArgs> organizationAggregationSource,
        @Nullable Output<List<ConfigurationAggregatorTagArgs>> tags) {
        this.accountAggregationSources = accountAggregationSources;
        this.configurationAggregatorName = configurationAggregatorName;
        this.organizationAggregationSource = organizationAggregationSource;
        this.tags = tags;
    }

    private ConfigurationAggregatorArgs() {
        this.accountAggregationSources = Output.empty();
        this.configurationAggregatorName = Output.empty();
        this.organizationAggregationSource = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationAggregatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ConfigurationAggregatorAccountAggregationSourceArgs>> accountAggregationSources;
        private @Nullable Output<String> configurationAggregatorName;
        private @Nullable Output<ConfigurationAggregatorOrganizationAggregationSourceArgs> organizationAggregationSource;
        private @Nullable Output<List<ConfigurationAggregatorTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationAggregatorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountAggregationSources = defaults.accountAggregationSources;
    	      this.configurationAggregatorName = defaults.configurationAggregatorName;
    	      this.organizationAggregationSource = defaults.organizationAggregationSource;
    	      this.tags = defaults.tags;
        }

        public Builder accountAggregationSources(@Nullable Output<List<ConfigurationAggregatorAccountAggregationSourceArgs>> accountAggregationSources) {
            this.accountAggregationSources = accountAggregationSources;
            return this;
        }
        public Builder accountAggregationSources(@Nullable List<ConfigurationAggregatorAccountAggregationSourceArgs> accountAggregationSources) {
            this.accountAggregationSources = Output.ofNullable(accountAggregationSources);
            return this;
        }
        public Builder accountAggregationSources(ConfigurationAggregatorAccountAggregationSourceArgs... accountAggregationSources) {
            return accountAggregationSources(List.of(accountAggregationSources));
        }
        public Builder configurationAggregatorName(@Nullable Output<String> configurationAggregatorName) {
            this.configurationAggregatorName = configurationAggregatorName;
            return this;
        }
        public Builder configurationAggregatorName(@Nullable String configurationAggregatorName) {
            this.configurationAggregatorName = Output.ofNullable(configurationAggregatorName);
            return this;
        }
        public Builder organizationAggregationSource(@Nullable Output<ConfigurationAggregatorOrganizationAggregationSourceArgs> organizationAggregationSource) {
            this.organizationAggregationSource = organizationAggregationSource;
            return this;
        }
        public Builder organizationAggregationSource(@Nullable ConfigurationAggregatorOrganizationAggregationSourceArgs organizationAggregationSource) {
            this.organizationAggregationSource = Output.ofNullable(organizationAggregationSource);
            return this;
        }
        public Builder tags(@Nullable Output<List<ConfigurationAggregatorTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<ConfigurationAggregatorTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(ConfigurationAggregatorTagArgs... tags) {
            return tags(List.of(tags));
        }        public ConfigurationAggregatorArgs build() {
            return new ConfigurationAggregatorArgs(accountAggregationSources, configurationAggregatorName, organizationAggregationSource, tags);
        }
    }
}
