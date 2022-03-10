// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie.outputs;

import io.pulumi.aws.macie.outputs.FindingsFilterFindingCriteriaCriterion;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class FindingsFilterFindingCriteria {
    /**
     * A condition that specifies the property, operator, and one or more values to use to filter the results.  (documented below)
     * 
     */
    private final @Nullable List<FindingsFilterFindingCriteriaCriterion> criterions;

    @OutputCustomType.Constructor
    private FindingsFilterFindingCriteria(@OutputCustomType.Parameter("criterions") @Nullable List<FindingsFilterFindingCriteriaCriterion> criterions) {
        this.criterions = criterions;
    }

    /**
     * A condition that specifies the property, operator, and one or more values to use to filter the results.  (documented below)
     * 
    */
    public List<FindingsFilterFindingCriteriaCriterion> getCriterions() {
        return this.criterions == null ? List.of() : this.criterions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FindingsFilterFindingCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FindingsFilterFindingCriteriaCriterion> criterions;

        public Builder() {
    	      // Empty
        }

        public Builder(FindingsFilterFindingCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criterions = defaults.criterions;
        }

        public Builder setCriterions(@Nullable List<FindingsFilterFindingCriteriaCriterion> criterions) {
            this.criterions = criterions;
            return this;
        }
        public FindingsFilterFindingCriteria build() {
            return new FindingsFilterFindingCriteria(criterions);
        }
    }
}
