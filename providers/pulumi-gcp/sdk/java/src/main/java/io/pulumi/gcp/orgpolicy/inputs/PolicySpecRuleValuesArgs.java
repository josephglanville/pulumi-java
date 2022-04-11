// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.orgpolicy.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicySpecRuleValuesArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicySpecRuleValuesArgs Empty = new PolicySpecRuleValuesArgs();

    /**
     * List of values allowed at this resource.
     * 
     */
    @Import(name="allowedValues")
      private final @Nullable Output<List<String>> allowedValues;

    public Output<List<String>> getAllowedValues() {
        return this.allowedValues == null ? Codegen.empty() : this.allowedValues;
    }

    /**
     * List of values denied at this resource.
     * 
     */
    @Import(name="deniedValues")
      private final @Nullable Output<List<String>> deniedValues;

    public Output<List<String>> getDeniedValues() {
        return this.deniedValues == null ? Codegen.empty() : this.deniedValues;
    }

    public PolicySpecRuleValuesArgs(
        @Nullable Output<List<String>> allowedValues,
        @Nullable Output<List<String>> deniedValues) {
        this.allowedValues = allowedValues;
        this.deniedValues = deniedValues;
    }

    private PolicySpecRuleValuesArgs() {
        this.allowedValues = Codegen.empty();
        this.deniedValues = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicySpecRuleValuesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> allowedValues;
        private @Nullable Output<List<String>> deniedValues;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicySpecRuleValuesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
    	      this.deniedValues = defaults.deniedValues;
        }

        public Builder allowedValues(@Nullable Output<List<String>> allowedValues) {
            this.allowedValues = allowedValues;
            return this;
        }
        public Builder allowedValues(@Nullable List<String> allowedValues) {
            this.allowedValues = Codegen.ofNullable(allowedValues);
            return this;
        }
        public Builder allowedValues(String... allowedValues) {
            return allowedValues(List.of(allowedValues));
        }
        public Builder deniedValues(@Nullable Output<List<String>> deniedValues) {
            this.deniedValues = deniedValues;
            return this;
        }
        public Builder deniedValues(@Nullable List<String> deniedValues) {
            this.deniedValues = Codegen.ofNullable(deniedValues);
            return this;
        }
        public Builder deniedValues(String... deniedValues) {
            return deniedValues(List.of(deniedValues));
        }        public PolicySpecRuleValuesArgs build() {
            return new PolicySpecRuleValuesArgs(allowedValues, deniedValues);
        }
    }
}
