// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FilterFileDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final FilterFileDetailsResponse Empty = new FilterFileDetailsResponse();

    @InputImport(name="filterFilePath", required=true)
    private final String filterFilePath;

    public String getFilterFilePath() {
        return this.filterFilePath;
    }

    @InputImport(name="filterFileType", required=true)
    private final String filterFileType;

    public String getFilterFileType() {
        return this.filterFileType;
    }

    public FilterFileDetailsResponse(
        String filterFilePath,
        String filterFileType) {
        this.filterFilePath = Objects.requireNonNull(filterFilePath, "expected parameter 'filterFilePath' to be non-null");
        this.filterFileType = Objects.requireNonNull(filterFileType, "expected parameter 'filterFileType' to be non-null");
    }

    private FilterFileDetailsResponse() {
        this.filterFilePath = null;
        this.filterFileType = null;
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
