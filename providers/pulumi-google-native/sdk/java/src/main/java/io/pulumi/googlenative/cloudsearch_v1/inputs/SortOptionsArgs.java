// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.cloudsearch_v1.enums.SortOptionsSortOrder;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SortOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SortOptionsArgs Empty = new SortOptionsArgs();

    /**
     * Name of the operator corresponding to the field to sort on. The corresponding property must be marked as sortable.
     * 
     */
    @Import(name="operatorName")
      private final @Nullable Output<String> operatorName;

    public Output<String> getOperatorName() {
        return this.operatorName == null ? Output.empty() : this.operatorName;
    }

    /**
     * Ascending is the default sort order
     * 
     */
    @Import(name="sortOrder")
      private final @Nullable Output<SortOptionsSortOrder> sortOrder;

    public Output<SortOptionsSortOrder> getSortOrder() {
        return this.sortOrder == null ? Output.empty() : this.sortOrder;
    }

    public SortOptionsArgs(
        @Nullable Output<String> operatorName,
        @Nullable Output<SortOptionsSortOrder> sortOrder) {
        this.operatorName = operatorName;
        this.sortOrder = sortOrder;
    }

    private SortOptionsArgs() {
        this.operatorName = Output.empty();
        this.sortOrder = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SortOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> operatorName;
        private @Nullable Output<SortOptionsSortOrder> sortOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(SortOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operatorName = defaults.operatorName;
    	      this.sortOrder = defaults.sortOrder;
        }

        public Builder operatorName(@Nullable Output<String> operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public Builder operatorName(@Nullable String operatorName) {
            this.operatorName = Output.ofNullable(operatorName);
            return this;
        }
        public Builder sortOrder(@Nullable Output<SortOptionsSortOrder> sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        public Builder sortOrder(@Nullable SortOptionsSortOrder sortOrder) {
            this.sortOrder = Output.ofNullable(sortOrder);
            return this;
        }        public SortOptionsArgs build() {
            return new SortOptionsArgs(operatorName, sortOrder);
        }
    }
}
