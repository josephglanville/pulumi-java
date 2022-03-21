// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.inputs;

import io.pulumi.awsnative.lambda.inputs.EventSourceMappingFilterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The filter criteria to control event filtering.
 * 
 */
public final class FilterCriteriaPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FilterCriteriaPropertiesArgs Empty = new FilterCriteriaPropertiesArgs();

    /**
     * List of filters of this FilterCriteria
     * 
     */
    @Import(name="filters")
      private final @Nullable Output<List<EventSourceMappingFilterArgs>> filters;

    public Output<List<EventSourceMappingFilterArgs>> getFilters() {
        return this.filters == null ? Output.empty() : this.filters;
    }

    public FilterCriteriaPropertiesArgs(@Nullable Output<List<EventSourceMappingFilterArgs>> filters) {
        this.filters = filters;
    }

    private FilterCriteriaPropertiesArgs() {
        this.filters = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterCriteriaPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<EventSourceMappingFilterArgs>> filters;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterCriteriaPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
        }

        public Builder filters(@Nullable Output<List<EventSourceMappingFilterArgs>> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(@Nullable List<EventSourceMappingFilterArgs> filters) {
            this.filters = Output.ofNullable(filters);
            return this;
        }
        public Builder filters(EventSourceMappingFilterArgs... filters) {
            return filters(List.of(filters));
        }        public FilterCriteriaPropertiesArgs build() {
            return new FilterCriteriaPropertiesArgs(filters);
        }
    }
}
