// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.enums.RuleStatus;
import io.pulumi.azurenative.costmanagement.inputs.CostAllocationRuleDetailsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties of a cost allocation rule
 * 
 */
public final class CostAllocationRulePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final CostAllocationRulePropertiesArgs Empty = new CostAllocationRulePropertiesArgs();

    /**
     * Description of a cost allocation rule.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Resource information for the cost allocation rule
     * 
     */
    @InputImport(name="details", required=true)
      private final Input<CostAllocationRuleDetailsArgs> details;

    public Input<CostAllocationRuleDetailsArgs> getDetails() {
        return this.details;
    }

    /**
     * Status of the rule
     * 
     */
    @InputImport(name="status", required=true)
      private final Input<Either<String,RuleStatus>> status;

    public Input<Either<String,RuleStatus>> getStatus() {
        return this.status;
    }

    public CostAllocationRulePropertiesArgs(
        @Nullable Input<String> description,
        Input<CostAllocationRuleDetailsArgs> details,
        Input<Either<String,RuleStatus>> status) {
        this.description = description;
        this.details = Objects.requireNonNull(details, "expected parameter 'details' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private CostAllocationRulePropertiesArgs() {
        this.description = Input.empty();
        this.details = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CostAllocationRulePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<CostAllocationRuleDetailsArgs> details;
        private Input<Either<String,RuleStatus>> status;

        public Builder() {
    	      // Empty
        }

        public Builder(CostAllocationRulePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.details = defaults.details;
    	      this.status = defaults.status;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDetails(Input<CostAllocationRuleDetailsArgs> details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder setDetails(CostAllocationRuleDetailsArgs details) {
            this.details = Input.of(Objects.requireNonNull(details));
            return this;
        }

        public Builder setStatus(Input<Either<String,RuleStatus>> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatus(Either<String,RuleStatus> status) {
            this.status = Input.of(Objects.requireNonNull(status));
            return this;
        }
        public CostAllocationRulePropertiesArgs build() {
            return new CostAllocationRulePropertiesArgs(description, details, status);
        }
    }
}
