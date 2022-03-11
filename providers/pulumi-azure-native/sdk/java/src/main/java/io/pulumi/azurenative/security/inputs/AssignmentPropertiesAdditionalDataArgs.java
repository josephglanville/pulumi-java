// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Additional data about the assignment
 * 
 */
public final class AssignmentPropertiesAdditionalDataArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssignmentPropertiesAdditionalDataArgs Empty = new AssignmentPropertiesAdditionalDataArgs();

    /**
     * Exemption category of this assignment
     * 
     */
    @InputImport(name="exemptionCategory")
      private final @Nullable Output<String> exemptionCategory;

    public Output<String> getExemptionCategory() {
        return this.exemptionCategory == null ? Output.empty() : this.exemptionCategory;
    }

    public AssignmentPropertiesAdditionalDataArgs(@Nullable Output<String> exemptionCategory) {
        this.exemptionCategory = exemptionCategory;
    }

    private AssignmentPropertiesAdditionalDataArgs() {
        this.exemptionCategory = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentPropertiesAdditionalDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> exemptionCategory;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentPropertiesAdditionalDataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exemptionCategory = defaults.exemptionCategory;
        }

        public Builder exemptionCategory(@Nullable Output<String> exemptionCategory) {
            this.exemptionCategory = exemptionCategory;
            return this;
        }

        public Builder exemptionCategory(@Nullable String exemptionCategory) {
            this.exemptionCategory = Output.ofNullable(exemptionCategory);
            return this;
        }
        public AssignmentPropertiesAdditionalDataArgs build() {
            return new AssignmentPropertiesAdditionalDataArgs(exemptionCategory);
        }
    }
}
