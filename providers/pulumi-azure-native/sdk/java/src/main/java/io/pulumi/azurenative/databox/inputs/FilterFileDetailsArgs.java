// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.enums.FilterFileType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Details of the filter files to be used for data transfer.
 * 
 */
public final class FilterFileDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final FilterFileDetailsArgs Empty = new FilterFileDetailsArgs();

    /**
     * Path of the file that contains the details of all items to transfer.
     * 
     */
    @Import(name="filterFilePath", required=true)
      private final Output<String> filterFilePath;

    public Output<String> getFilterFilePath() {
        return this.filterFilePath;
    }

    /**
     * Type of the filter file.
     * 
     */
    @Import(name="filterFileType", required=true)
      private final Output<Either<String,FilterFileType>> filterFileType;

    public Output<Either<String,FilterFileType>> getFilterFileType() {
        return this.filterFileType;
    }

    public FilterFileDetailsArgs(
        Output<String> filterFilePath,
        Output<Either<String,FilterFileType>> filterFileType) {
        this.filterFilePath = Objects.requireNonNull(filterFilePath, "expected parameter 'filterFilePath' to be non-null");
        this.filterFileType = Objects.requireNonNull(filterFileType, "expected parameter 'filterFileType' to be non-null");
    }

    private FilterFileDetailsArgs() {
        this.filterFilePath = Output.empty();
        this.filterFileType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterFileDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> filterFilePath;
        private Output<Either<String,FilterFileType>> filterFileType;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterFileDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterFilePath = defaults.filterFilePath;
    	      this.filterFileType = defaults.filterFileType;
        }

        public Builder filterFilePath(Output<String> filterFilePath) {
            this.filterFilePath = Objects.requireNonNull(filterFilePath);
            return this;
        }
        public Builder filterFilePath(String filterFilePath) {
            this.filterFilePath = Output.of(Objects.requireNonNull(filterFilePath));
            return this;
        }
        public Builder filterFileType(Output<Either<String,FilterFileType>> filterFileType) {
            this.filterFileType = Objects.requireNonNull(filterFileType);
            return this;
        }
        public Builder filterFileType(Either<String,FilterFileType> filterFileType) {
            this.filterFileType = Output.of(Objects.requireNonNull(filterFileType));
            return this;
        }        public FilterFileDetailsArgs build() {
            return new FilterFileDetailsArgs(filterFilePath, filterFileType);
        }
    }
}
