// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DataSourceWebCrawlerSiteMapsConfiguration {
    private final List<String> siteMaps;

    @CustomType.Constructor
    private DataSourceWebCrawlerSiteMapsConfiguration(@CustomType.Parameter("siteMaps") List<String> siteMaps) {
        this.siteMaps = siteMaps;
    }

    public List<String> getSiteMaps() {
        return this.siteMaps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceWebCrawlerSiteMapsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> siteMaps;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceWebCrawlerSiteMapsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.siteMaps = defaults.siteMaps;
        }

        public Builder siteMaps(List<String> siteMaps) {
            this.siteMaps = Objects.requireNonNull(siteMaps);
            return this;
        }
        public Builder siteMaps(String... siteMaps) {
            return siteMaps(List.of(siteMaps));
        }        public DataSourceWebCrawlerSiteMapsConfiguration build() {
            return new DataSourceWebCrawlerSiteMapsConfiguration(siteMaps);
        }
    }
}
