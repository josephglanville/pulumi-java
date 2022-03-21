// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.macie;

import io.pulumi.awsnative.macie.enums.FindingsFilterFindingFilterAction;
import io.pulumi.awsnative.macie.inputs.FindingsFilterFindingCriteriaArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FindingsFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final FindingsFilterArgs Empty = new FindingsFilterArgs();

    /**
     * Findings filter action.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<FindingsFilterFindingFilterAction> action;

    public Output<FindingsFilterFindingFilterAction> getAction() {
        return this.action == null ? Output.empty() : this.action;
    }

    /**
     * Findings filter description
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Findings filter criteria.
     * 
     */
    @Import(name="findingCriteria", required=true)
      private final Output<FindingsFilterFindingCriteriaArgs> findingCriteria;

    public Output<FindingsFilterFindingCriteriaArgs> getFindingCriteria() {
        return this.findingCriteria;
    }

    /**
     * Findings filter name
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Findings filter position.
     * 
     */
    @Import(name="position")
      private final @Nullable Output<Integer> position;

    public Output<Integer> getPosition() {
        return this.position == null ? Output.empty() : this.position;
    }

    public FindingsFilterArgs(
        @Nullable Output<FindingsFilterFindingFilterAction> action,
        @Nullable Output<String> description,
        Output<FindingsFilterFindingCriteriaArgs> findingCriteria,
        @Nullable Output<String> name,
        @Nullable Output<Integer> position) {
        this.action = action;
        this.description = description;
        this.findingCriteria = Objects.requireNonNull(findingCriteria, "expected parameter 'findingCriteria' to be non-null");
        this.name = name;
        this.position = position;
    }

    private FindingsFilterArgs() {
        this.action = Output.empty();
        this.description = Output.empty();
        this.findingCriteria = Output.empty();
        this.name = Output.empty();
        this.position = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FindingsFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FindingsFilterFindingFilterAction> action;
        private @Nullable Output<String> description;
        private Output<FindingsFilterFindingCriteriaArgs> findingCriteria;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> position;

        public Builder() {
    	      // Empty
        }

        public Builder(FindingsFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.findingCriteria = defaults.findingCriteria;
    	      this.name = defaults.name;
    	      this.position = defaults.position;
        }

        public Builder action(@Nullable Output<FindingsFilterFindingFilterAction> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable FindingsFilterFindingFilterAction action) {
            this.action = Output.ofNullable(action);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder findingCriteria(Output<FindingsFilterFindingCriteriaArgs> findingCriteria) {
            this.findingCriteria = Objects.requireNonNull(findingCriteria);
            return this;
        }
        public Builder findingCriteria(FindingsFilterFindingCriteriaArgs findingCriteria) {
            this.findingCriteria = Output.of(Objects.requireNonNull(findingCriteria));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder position(@Nullable Output<Integer> position) {
            this.position = position;
            return this;
        }
        public Builder position(@Nullable Integer position) {
            this.position = Output.ofNullable(position);
            return this;
        }        public FindingsFilterArgs build() {
            return new FindingsFilterArgs(action, description, findingCriteria, name, position);
        }
    }
}
