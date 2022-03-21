// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WorkflowTemplateParameterValidationRegex {
    /**
     * Required. RE2 regular expressions used to validate the parameter's value. The value must match the regex in its entirety (substring matches are not sufficient).
     * 
     */
    private final List<String> regexes;

    @CustomType.Constructor
    private WorkflowTemplateParameterValidationRegex(@CustomType.Parameter("regexes") List<String> regexes) {
        this.regexes = regexes;
    }

    /**
     * Required. RE2 regular expressions used to validate the parameter's value. The value must match the regex in its entirety (substring matches are not sufficient).
     * 
    */
    public List<String> getRegexes() {
        return this.regexes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateParameterValidationRegex defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> regexes;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateParameterValidationRegex defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regexes = defaults.regexes;
        }

        public Builder regexes(List<String> regexes) {
            this.regexes = Objects.requireNonNull(regexes);
            return this;
        }
        public Builder regexes(String... regexes) {
            return regexes(List.of(regexes));
        }        public WorkflowTemplateParameterValidationRegex build() {
            return new WorkflowTemplateParameterValidationRegex(regexes);
        }
    }
}
