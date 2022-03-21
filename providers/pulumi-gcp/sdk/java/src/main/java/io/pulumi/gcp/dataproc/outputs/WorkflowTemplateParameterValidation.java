// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplateParameterValidationRegex;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplateParameterValidationValues;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowTemplateParameterValidation {
    /**
     * Validation based on regular expressions.
     * 
     */
    private final @Nullable WorkflowTemplateParameterValidationRegex regex;
    /**
     * Optional. Corresponds to the label values of reservation resource.
     * 
     */
    private final @Nullable WorkflowTemplateParameterValidationValues values;

    @CustomType.Constructor
    private WorkflowTemplateParameterValidation(
        @CustomType.Parameter("regex") @Nullable WorkflowTemplateParameterValidationRegex regex,
        @CustomType.Parameter("values") @Nullable WorkflowTemplateParameterValidationValues values) {
        this.regex = regex;
        this.values = values;
    }

    /**
     * Validation based on regular expressions.
     * 
    */
    public Optional<WorkflowTemplateParameterValidationRegex> getRegex() {
        return Optional.ofNullable(this.regex);
    }
    /**
     * Optional. Corresponds to the label values of reservation resource.
     * 
    */
    public Optional<WorkflowTemplateParameterValidationValues> getValues() {
        return Optional.ofNullable(this.values);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateParameterValidation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WorkflowTemplateParameterValidationRegex regex;
        private @Nullable WorkflowTemplateParameterValidationValues values;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateParameterValidation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regex = defaults.regex;
    	      this.values = defaults.values;
        }

        public Builder regex(@Nullable WorkflowTemplateParameterValidationRegex regex) {
            this.regex = regex;
            return this;
        }
        public Builder values(@Nullable WorkflowTemplateParameterValidationValues values) {
            this.values = values;
            return this;
        }        public WorkflowTemplateParameterValidation build() {
            return new WorkflowTemplateParameterValidation(regex, values);
        }
    }
}
