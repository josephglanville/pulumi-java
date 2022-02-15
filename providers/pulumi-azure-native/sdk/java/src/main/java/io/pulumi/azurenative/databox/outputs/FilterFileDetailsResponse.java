// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FilterFileDetailsResponse {
    private final String filterFilePath;
    private final String filterFileType;

    @OutputCustomType.Constructor({"filterFilePath","filterFileType"})
    private FilterFileDetailsResponse(
        String filterFilePath,
        String filterFileType) {
        this.filterFilePath = Objects.requireNonNull(filterFilePath);
        this.filterFileType = Objects.requireNonNull(filterFileType);
    }

    public String getFilterFilePath() {
        return this.filterFilePath;
    }
    public String getFilterFileType() {
        return this.filterFileType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterFileDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String filterFilePath;
        private String filterFileType;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterFileDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterFilePath = defaults.filterFilePath;
    	      this.filterFileType = defaults.filterFileType;
        }

        public Builder setFilterFilePath(String filterFilePath) {
            this.filterFilePath = Objects.requireNonNull(filterFilePath);
            return this;
        }

        public Builder setFilterFileType(String filterFileType) {
            this.filterFileType = Objects.requireNonNull(filterFileType);
            return this;
        }

        public FilterFileDetailsResponse build() {
            return new FilterFileDetailsResponse(filterFilePath, filterFileType);
        }
    }
}