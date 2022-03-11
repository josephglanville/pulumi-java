// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.healthlake;

import io.pulumi.awsnative.healthlake.enums.FHIRDatastoreDatastoreTypeVersion;
import io.pulumi.awsnative.healthlake.inputs.FHIRDatastorePreloadDataConfigArgs;
import io.pulumi.awsnative.healthlake.inputs.FHIRDatastoreSseConfigurationArgs;
import io.pulumi.awsnative.healthlake.inputs.FHIRDatastoreTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FHIRDatastoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final FHIRDatastoreArgs Empty = new FHIRDatastoreArgs();

    @InputImport(name="datastoreName")
      private final @Nullable Output<String> datastoreName;

    public Output<String> getDatastoreName() {
        return this.datastoreName == null ? Output.empty() : this.datastoreName;
    }

    @InputImport(name="datastoreTypeVersion", required=true)
      private final Output<FHIRDatastoreDatastoreTypeVersion> datastoreTypeVersion;

    public Output<FHIRDatastoreDatastoreTypeVersion> getDatastoreTypeVersion() {
        return this.datastoreTypeVersion;
    }

    @InputImport(name="preloadDataConfig")
      private final @Nullable Output<FHIRDatastorePreloadDataConfigArgs> preloadDataConfig;

    public Output<FHIRDatastorePreloadDataConfigArgs> getPreloadDataConfig() {
        return this.preloadDataConfig == null ? Output.empty() : this.preloadDataConfig;
    }

    @InputImport(name="sseConfiguration")
      private final @Nullable Output<FHIRDatastoreSseConfigurationArgs> sseConfiguration;

    public Output<FHIRDatastoreSseConfigurationArgs> getSseConfiguration() {
        return this.sseConfiguration == null ? Output.empty() : this.sseConfiguration;
    }

    @InputImport(name="tags")
      private final @Nullable Output<List<FHIRDatastoreTagArgs>> tags;

    public Output<List<FHIRDatastoreTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public FHIRDatastoreArgs(
        @Nullable Output<String> datastoreName,
        Output<FHIRDatastoreDatastoreTypeVersion> datastoreTypeVersion,
        @Nullable Output<FHIRDatastorePreloadDataConfigArgs> preloadDataConfig,
        @Nullable Output<FHIRDatastoreSseConfigurationArgs> sseConfiguration,
        @Nullable Output<List<FHIRDatastoreTagArgs>> tags) {
        this.datastoreName = datastoreName;
        this.datastoreTypeVersion = Objects.requireNonNull(datastoreTypeVersion, "expected parameter 'datastoreTypeVersion' to be non-null");
        this.preloadDataConfig = preloadDataConfig;
        this.sseConfiguration = sseConfiguration;
        this.tags = tags;
    }

    private FHIRDatastoreArgs() {
        this.datastoreName = Output.empty();
        this.datastoreTypeVersion = Output.empty();
        this.preloadDataConfig = Output.empty();
        this.sseConfiguration = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FHIRDatastoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> datastoreName;
        private Output<FHIRDatastoreDatastoreTypeVersion> datastoreTypeVersion;
        private @Nullable Output<FHIRDatastorePreloadDataConfigArgs> preloadDataConfig;
        private @Nullable Output<FHIRDatastoreSseConfigurationArgs> sseConfiguration;
        private @Nullable Output<List<FHIRDatastoreTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(FHIRDatastoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreName = defaults.datastoreName;
    	      this.datastoreTypeVersion = defaults.datastoreTypeVersion;
    	      this.preloadDataConfig = defaults.preloadDataConfig;
    	      this.sseConfiguration = defaults.sseConfiguration;
    	      this.tags = defaults.tags;
        }

        public Builder datastoreName(@Nullable Output<String> datastoreName) {
            this.datastoreName = datastoreName;
            return this;
        }

        public Builder datastoreName(@Nullable String datastoreName) {
            this.datastoreName = Output.ofNullable(datastoreName);
            return this;
        }

        public Builder datastoreTypeVersion(Output<FHIRDatastoreDatastoreTypeVersion> datastoreTypeVersion) {
            this.datastoreTypeVersion = Objects.requireNonNull(datastoreTypeVersion);
            return this;
        }

        public Builder datastoreTypeVersion(FHIRDatastoreDatastoreTypeVersion datastoreTypeVersion) {
            this.datastoreTypeVersion = Output.of(Objects.requireNonNull(datastoreTypeVersion));
            return this;
        }

        public Builder preloadDataConfig(@Nullable Output<FHIRDatastorePreloadDataConfigArgs> preloadDataConfig) {
            this.preloadDataConfig = preloadDataConfig;
            return this;
        }

        public Builder preloadDataConfig(@Nullable FHIRDatastorePreloadDataConfigArgs preloadDataConfig) {
            this.preloadDataConfig = Output.ofNullable(preloadDataConfig);
            return this;
        }

        public Builder sseConfiguration(@Nullable Output<FHIRDatastoreSseConfigurationArgs> sseConfiguration) {
            this.sseConfiguration = sseConfiguration;
            return this;
        }

        public Builder sseConfiguration(@Nullable FHIRDatastoreSseConfigurationArgs sseConfiguration) {
            this.sseConfiguration = Output.ofNullable(sseConfiguration);
            return this;
        }

        public Builder tags(@Nullable Output<List<FHIRDatastoreTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<FHIRDatastoreTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public FHIRDatastoreArgs build() {
            return new FHIRDatastoreArgs(datastoreName, datastoreTypeVersion, preloadDataConfig, sseConfiguration, tags);
        }
    }
}
