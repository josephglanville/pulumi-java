// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.outputs.DataSourceWebCrawlerSeedUrlConfiguration;
import io.pulumi.awsnative.kendra.outputs.DataSourceWebCrawlerSiteMapsConfiguration;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceWebCrawlerUrls {
    private final @Nullable DataSourceWebCrawlerSeedUrlConfiguration seedUrlConfiguration;
    private final @Nullable DataSourceWebCrawlerSiteMapsConfiguration siteMapsConfiguration;

    @CustomType.Constructor
    private DataSourceWebCrawlerUrls(
        @CustomType.Parameter("seedUrlConfiguration") @Nullable DataSourceWebCrawlerSeedUrlConfiguration seedUrlConfiguration,
        @CustomType.Parameter("siteMapsConfiguration") @Nullable DataSourceWebCrawlerSiteMapsConfiguration siteMapsConfiguration) {
        this.seedUrlConfiguration = seedUrlConfiguration;
        this.siteMapsConfiguration = siteMapsConfiguration;
    }

    public Optional<DataSourceWebCrawlerSeedUrlConfiguration> getSeedUrlConfiguration() {
        return Optional.ofNullable(this.seedUrlConfiguration);
    }
    public Optional<DataSourceWebCrawlerSiteMapsConfiguration> getSiteMapsConfiguration() {
        return Optional.ofNullable(this.siteMapsConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceWebCrawlerUrls defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataSourceWebCrawlerSeedUrlConfiguration seedUrlConfiguration;
        private @Nullable DataSourceWebCrawlerSiteMapsConfiguration siteMapsConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceWebCrawlerUrls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.seedUrlConfiguration = defaults.seedUrlConfiguration;
    	      this.siteMapsConfiguration = defaults.siteMapsConfiguration;
        }

        public Builder seedUrlConfiguration(@Nullable DataSourceWebCrawlerSeedUrlConfiguration seedUrlConfiguration) {
            this.seedUrlConfiguration = seedUrlConfiguration;
            return this;
        }
        public Builder siteMapsConfiguration(@Nullable DataSourceWebCrawlerSiteMapsConfiguration siteMapsConfiguration) {
            this.siteMapsConfiguration = siteMapsConfiguration;
            return this;
        }        public DataSourceWebCrawlerUrls build() {
            return new DataSourceWebCrawlerUrls(seedUrlConfiguration, siteMapsConfiguration);
        }
    }
}
