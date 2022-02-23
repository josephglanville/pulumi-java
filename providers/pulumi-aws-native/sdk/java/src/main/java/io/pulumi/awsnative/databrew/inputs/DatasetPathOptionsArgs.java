// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.DatasetFilesLimitArgs;
import io.pulumi.awsnative.databrew.inputs.DatasetFilterExpressionArgs;
import io.pulumi.awsnative.databrew.inputs.DatasetPathParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Path options for dataset
 * 
 */
public final class DatasetPathOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetPathOptionsArgs Empty = new DatasetPathOptionsArgs();

    @InputImport(name="filesLimit")
      private final @Nullable Input<DatasetFilesLimitArgs> filesLimit;

    public Input<DatasetFilesLimitArgs> getFilesLimit() {
        return this.filesLimit == null ? Input.empty() : this.filesLimit;
    }

    @InputImport(name="lastModifiedDateCondition")
      private final @Nullable Input<DatasetFilterExpressionArgs> lastModifiedDateCondition;

    public Input<DatasetFilterExpressionArgs> getLastModifiedDateCondition() {
        return this.lastModifiedDateCondition == null ? Input.empty() : this.lastModifiedDateCondition;
    }

    @InputImport(name="parameters")
      private final @Nullable Input<List<DatasetPathParameterArgs>> parameters;

    public Input<List<DatasetPathParameterArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    public DatasetPathOptionsArgs(
        @Nullable Input<DatasetFilesLimitArgs> filesLimit,
        @Nullable Input<DatasetFilterExpressionArgs> lastModifiedDateCondition,
        @Nullable Input<List<DatasetPathParameterArgs>> parameters) {
        this.filesLimit = filesLimit;
        this.lastModifiedDateCondition = lastModifiedDateCondition;
        this.parameters = parameters;
    }

    private DatasetPathOptionsArgs() {
        this.filesLimit = Input.empty();
        this.lastModifiedDateCondition = Input.empty();
        this.parameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetPathOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DatasetFilesLimitArgs> filesLimit;
        private @Nullable Input<DatasetFilterExpressionArgs> lastModifiedDateCondition;
        private @Nullable Input<List<DatasetPathParameterArgs>> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetPathOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filesLimit = defaults.filesLimit;
    	      this.lastModifiedDateCondition = defaults.lastModifiedDateCondition;
    	      this.parameters = defaults.parameters;
        }

        public Builder setFilesLimit(@Nullable Input<DatasetFilesLimitArgs> filesLimit) {
            this.filesLimit = filesLimit;
            return this;
        }

        public Builder setFilesLimit(@Nullable DatasetFilesLimitArgs filesLimit) {
            this.filesLimit = Input.ofNullable(filesLimit);
            return this;
        }

        public Builder setLastModifiedDateCondition(@Nullable Input<DatasetFilterExpressionArgs> lastModifiedDateCondition) {
            this.lastModifiedDateCondition = lastModifiedDateCondition;
            return this;
        }

        public Builder setLastModifiedDateCondition(@Nullable DatasetFilterExpressionArgs lastModifiedDateCondition) {
            this.lastModifiedDateCondition = Input.ofNullable(lastModifiedDateCondition);
            return this;
        }

        public Builder setParameters(@Nullable Input<List<DatasetPathParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable List<DatasetPathParameterArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }
        public DatasetPathOptionsArgs build() {
            return new DatasetPathOptionsArgs(filesLimit, lastModifiedDateCondition, parameters);
        }
    }
}
