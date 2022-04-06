// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InsightFiltersKeywordArgs extends io.pulumi.resources.ResourceArgs {

    public static final InsightFiltersKeywordArgs Empty = new InsightFiltersKeywordArgs();

    /**
     * A value for the keyword.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public InsightFiltersKeywordArgs(Output<String> value) {
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private InsightFiltersKeywordArgs() {
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersKeywordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersKeywordArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public InsightFiltersKeywordArgs build() {
            return new InsightFiltersKeywordArgs(value);
        }
    }
}