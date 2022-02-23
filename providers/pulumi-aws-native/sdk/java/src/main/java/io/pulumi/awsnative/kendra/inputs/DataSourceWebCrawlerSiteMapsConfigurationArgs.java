// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DataSourceWebCrawlerSiteMapsConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceWebCrawlerSiteMapsConfigurationArgs Empty = new DataSourceWebCrawlerSiteMapsConfigurationArgs();

    @InputImport(name="siteMaps", required=true)
      private final Input<List<String>> siteMaps;

    public Input<List<String>> getSiteMaps() {
        return this.siteMaps;
    }

    public DataSourceWebCrawlerSiteMapsConfigurationArgs(Input<List<String>> siteMaps) {
        this.siteMaps = Objects.requireNonNull(siteMaps, "expected parameter 'siteMaps' to be non-null");
    }

    private DataSourceWebCrawlerSiteMapsConfigurationArgs() {
        this.siteMaps = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceWebCrawlerSiteMapsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> siteMaps;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceWebCrawlerSiteMapsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.siteMaps = defaults.siteMaps;
        }

        public Builder setSiteMaps(Input<List<String>> siteMaps) {
            this.siteMaps = Objects.requireNonNull(siteMaps);
            return this;
        }

        public Builder setSiteMaps(List<String> siteMaps) {
            this.siteMaps = Input.of(Objects.requireNonNull(siteMaps));
            return this;
        }
        public DataSourceWebCrawlerSiteMapsConfigurationArgs build() {
            return new DataSourceWebCrawlerSiteMapsConfigurationArgs(siteMaps);
        }
    }
}
