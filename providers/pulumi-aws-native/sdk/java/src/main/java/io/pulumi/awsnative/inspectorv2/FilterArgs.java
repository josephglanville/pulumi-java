// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.inspectorv2;

import io.pulumi.awsnative.inspectorv2.enums.FilterAction;
import io.pulumi.awsnative.inspectorv2.inputs.FilterCriteriaArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final FilterArgs Empty = new FilterArgs();

    /**
     * Findings filter description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Findings filter action.
     * 
     */
    @InputImport(name="filterAction", required=true)
      private final Input<FilterAction> filterAction;

    public Input<FilterAction> getFilterAction() {
        return this.filterAction;
    }

    /**
     * Findings filter criteria.
     * 
     */
    @InputImport(name="filterCriteria", required=true)
      private final Input<FilterCriteriaArgs> filterCriteria;

    public Input<FilterCriteriaArgs> getFilterCriteria() {
        return this.filterCriteria;
    }

    /**
     * Findings filter name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public FilterArgs(
        @Nullable Input<String> description,
        Input<FilterAction> filterAction,
        Input<FilterCriteriaArgs> filterCriteria,
        @Nullable Input<String> name) {
        this.description = description;
        this.filterAction = Objects.requireNonNull(filterAction, "expected parameter 'filterAction' to be non-null");
        this.filterCriteria = Objects.requireNonNull(filterCriteria, "expected parameter 'filterCriteria' to be non-null");
        this.name = name;
    }

    private FilterArgs() {
        this.description = Input.empty();
        this.filterAction = Input.empty();
        this.filterCriteria = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<FilterAction> filterAction;
        private Input<FilterCriteriaArgs> filterCriteria;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.filterAction = defaults.filterAction;
    	      this.filterCriteria = defaults.filterCriteria;
    	      this.name = defaults.name;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFilterAction(Input<FilterAction> filterAction) {
            this.filterAction = Objects.requireNonNull(filterAction);
            return this;
        }

        public Builder setFilterAction(FilterAction filterAction) {
            this.filterAction = Input.of(Objects.requireNonNull(filterAction));
            return this;
        }

        public Builder setFilterCriteria(Input<FilterCriteriaArgs> filterCriteria) {
            this.filterCriteria = Objects.requireNonNull(filterCriteria);
            return this;
        }

        public Builder setFilterCriteria(FilterCriteriaArgs filterCriteria) {
            this.filterCriteria = Input.of(Objects.requireNonNull(filterCriteria));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public FilterArgs build() {
            return new FilterArgs(description, filterAction, filterCriteria, name);
        }
    }
}
