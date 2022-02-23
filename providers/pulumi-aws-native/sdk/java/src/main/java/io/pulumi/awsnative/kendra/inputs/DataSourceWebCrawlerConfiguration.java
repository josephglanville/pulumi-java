// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceProxyConfiguration;
import io.pulumi.awsnative.kendra.inputs.DataSourceWebCrawlerAuthenticationConfiguration;
import io.pulumi.awsnative.kendra.inputs.DataSourceWebCrawlerUrls;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceWebCrawlerConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceWebCrawlerConfiguration Empty = new DataSourceWebCrawlerConfiguration();

    @InputImport(name="authenticationConfiguration")
      private final @Nullable DataSourceWebCrawlerAuthenticationConfiguration authenticationConfiguration;

    public Optional<DataSourceWebCrawlerAuthenticationConfiguration> getAuthenticationConfiguration() {
        return this.authenticationConfiguration == null ? Optional.empty() : Optional.ofNullable(this.authenticationConfiguration);
    }

    @InputImport(name="crawlDepth")
      private final @Nullable Integer crawlDepth;

    public Optional<Integer> getCrawlDepth() {
        return this.crawlDepth == null ? Optional.empty() : Optional.ofNullable(this.crawlDepth);
    }

    @InputImport(name="maxContentSizePerPageInMegaBytes")
      private final @Nullable Double maxContentSizePerPageInMegaBytes;

    public Optional<Double> getMaxContentSizePerPageInMegaBytes() {
        return this.maxContentSizePerPageInMegaBytes == null ? Optional.empty() : Optional.ofNullable(this.maxContentSizePerPageInMegaBytes);
    }

    @InputImport(name="maxLinksPerPage")
      private final @Nullable Integer maxLinksPerPage;

    public Optional<Integer> getMaxLinksPerPage() {
        return this.maxLinksPerPage == null ? Optional.empty() : Optional.ofNullable(this.maxLinksPerPage);
    }

    @InputImport(name="maxUrlsPerMinuteCrawlRate")
      private final @Nullable Integer maxUrlsPerMinuteCrawlRate;

    public Optional<Integer> getMaxUrlsPerMinuteCrawlRate() {
        return this.maxUrlsPerMinuteCrawlRate == null ? Optional.empty() : Optional.ofNullable(this.maxUrlsPerMinuteCrawlRate);
    }

    @InputImport(name="proxyConfiguration")
      private final @Nullable DataSourceProxyConfiguration proxyConfiguration;

    public Optional<DataSourceProxyConfiguration> getProxyConfiguration() {
        return this.proxyConfiguration == null ? Optional.empty() : Optional.ofNullable(this.proxyConfiguration);
    }

    @InputImport(name="urlExclusionPatterns")
      private final @Nullable List<String> urlExclusionPatterns;

    public List<String> getUrlExclusionPatterns() {
        return this.urlExclusionPatterns == null ? List.of() : this.urlExclusionPatterns;
    }

    @InputImport(name="urlInclusionPatterns")
      private final @Nullable List<String> urlInclusionPatterns;

    public List<String> getUrlInclusionPatterns() {
        return this.urlInclusionPatterns == null ? List.of() : this.urlInclusionPatterns;
    }

    @InputImport(name="urls", required=true)
      private final DataSourceWebCrawlerUrls urls;

    public DataSourceWebCrawlerUrls getUrls() {
        return this.urls;
    }

    public DataSourceWebCrawlerConfiguration(
        @Nullable DataSourceWebCrawlerAuthenticationConfiguration authenticationConfiguration,
        @Nullable Integer crawlDepth,
        @Nullable Double maxContentSizePerPageInMegaBytes,
        @Nullable Integer maxLinksPerPage,
        @Nullable Integer maxUrlsPerMinuteCrawlRate,
        @Nullable DataSourceProxyConfiguration proxyConfiguration,
        @Nullable List<String> urlExclusionPatterns,
        @Nullable List<String> urlInclusionPatterns,
        DataSourceWebCrawlerUrls urls) {
        this.authenticationConfiguration = authenticationConfiguration;
        this.crawlDepth = crawlDepth;
        this.maxContentSizePerPageInMegaBytes = maxContentSizePerPageInMegaBytes;
        this.maxLinksPerPage = maxLinksPerPage;
        this.maxUrlsPerMinuteCrawlRate = maxUrlsPerMinuteCrawlRate;
        this.proxyConfiguration = proxyConfiguration;
        this.urlExclusionPatterns = urlExclusionPatterns;
        this.urlInclusionPatterns = urlInclusionPatterns;
        this.urls = Objects.requireNonNull(urls, "expected parameter 'urls' to be non-null");
    }

    private DataSourceWebCrawlerConfiguration() {
        this.authenticationConfiguration = null;
        this.crawlDepth = null;
        this.maxContentSizePerPageInMegaBytes = null;
        this.maxLinksPerPage = null;
        this.maxUrlsPerMinuteCrawlRate = null;
        this.proxyConfiguration = null;
        this.urlExclusionPatterns = List.of();
        this.urlInclusionPatterns = List.of();
        this.urls = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceWebCrawlerConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataSourceWebCrawlerAuthenticationConfiguration authenticationConfiguration;
        private @Nullable Integer crawlDepth;
        private @Nullable Double maxContentSizePerPageInMegaBytes;
        private @Nullable Integer maxLinksPerPage;
        private @Nullable Integer maxUrlsPerMinuteCrawlRate;
        private @Nullable DataSourceProxyConfiguration proxyConfiguration;
        private @Nullable List<String> urlExclusionPatterns;
        private @Nullable List<String> urlInclusionPatterns;
        private DataSourceWebCrawlerUrls urls;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceWebCrawlerConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationConfiguration = defaults.authenticationConfiguration;
    	      this.crawlDepth = defaults.crawlDepth;
    	      this.maxContentSizePerPageInMegaBytes = defaults.maxContentSizePerPageInMegaBytes;
    	      this.maxLinksPerPage = defaults.maxLinksPerPage;
    	      this.maxUrlsPerMinuteCrawlRate = defaults.maxUrlsPerMinuteCrawlRate;
    	      this.proxyConfiguration = defaults.proxyConfiguration;
    	      this.urlExclusionPatterns = defaults.urlExclusionPatterns;
    	      this.urlInclusionPatterns = defaults.urlInclusionPatterns;
    	      this.urls = defaults.urls;
        }

        public Builder setAuthenticationConfiguration(@Nullable DataSourceWebCrawlerAuthenticationConfiguration authenticationConfiguration) {
            this.authenticationConfiguration = authenticationConfiguration;
            return this;
        }

        public Builder setCrawlDepth(@Nullable Integer crawlDepth) {
            this.crawlDepth = crawlDepth;
            return this;
        }

        public Builder setMaxContentSizePerPageInMegaBytes(@Nullable Double maxContentSizePerPageInMegaBytes) {
            this.maxContentSizePerPageInMegaBytes = maxContentSizePerPageInMegaBytes;
            return this;
        }

        public Builder setMaxLinksPerPage(@Nullable Integer maxLinksPerPage) {
            this.maxLinksPerPage = maxLinksPerPage;
            return this;
        }

        public Builder setMaxUrlsPerMinuteCrawlRate(@Nullable Integer maxUrlsPerMinuteCrawlRate) {
            this.maxUrlsPerMinuteCrawlRate = maxUrlsPerMinuteCrawlRate;
            return this;
        }

        public Builder setProxyConfiguration(@Nullable DataSourceProxyConfiguration proxyConfiguration) {
            this.proxyConfiguration = proxyConfiguration;
            return this;
        }

        public Builder setUrlExclusionPatterns(@Nullable List<String> urlExclusionPatterns) {
            this.urlExclusionPatterns = urlExclusionPatterns;
            return this;
        }

        public Builder setUrlInclusionPatterns(@Nullable List<String> urlInclusionPatterns) {
            this.urlInclusionPatterns = urlInclusionPatterns;
            return this;
        }

        public Builder setUrls(DataSourceWebCrawlerUrls urls) {
            this.urls = Objects.requireNonNull(urls);
            return this;
        }
        public DataSourceWebCrawlerConfiguration build() {
            return new DataSourceWebCrawlerConfiguration(authenticationConfiguration, crawlDepth, maxContentSizePerPageInMegaBytes, maxLinksPerPage, maxUrlsPerMinuteCrawlRate, proxyConfiguration, urlExclusionPatterns, urlInclusionPatterns, urls);
        }
    }
}
