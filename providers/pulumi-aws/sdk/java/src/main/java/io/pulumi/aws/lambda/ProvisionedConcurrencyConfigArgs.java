// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ProvisionedConcurrencyConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProvisionedConcurrencyConfigArgs Empty = new ProvisionedConcurrencyConfigArgs();

    /**
     * Name or Amazon Resource Name (ARN) of the Lambda Function.
     * 
     */
    @Import(name="functionName", required=true)
      private final Output<String> functionName;

    public Output<String> getFunctionName() {
        return this.functionName;
    }

    /**
     * Amount of capacity to allocate. Must be greater than or equal to `1`.
     * 
     */
    @Import(name="provisionedConcurrentExecutions", required=true)
      private final Output<Integer> provisionedConcurrentExecutions;

    public Output<Integer> getProvisionedConcurrentExecutions() {
        return this.provisionedConcurrentExecutions;
    }

    /**
     * Lambda Function version or Lambda Alias name.
     * 
     */
    @Import(name="qualifier", required=true)
      private final Output<String> qualifier;

    public Output<String> getQualifier() {
        return this.qualifier;
    }

    public ProvisionedConcurrencyConfigArgs(
        Output<String> functionName,
        Output<Integer> provisionedConcurrentExecutions,
        Output<String> qualifier) {
        this.functionName = Objects.requireNonNull(functionName, "expected parameter 'functionName' to be non-null");
        this.provisionedConcurrentExecutions = Objects.requireNonNull(provisionedConcurrentExecutions, "expected parameter 'provisionedConcurrentExecutions' to be non-null");
        this.qualifier = Objects.requireNonNull(qualifier, "expected parameter 'qualifier' to be non-null");
    }

    private ProvisionedConcurrencyConfigArgs() {
        this.functionName = Output.empty();
        this.provisionedConcurrentExecutions = Output.empty();
        this.qualifier = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProvisionedConcurrencyConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> functionName;
        private Output<Integer> provisionedConcurrentExecutions;
        private Output<String> qualifier;

        public Builder() {
    	      // Empty
        }

        public Builder(ProvisionedConcurrencyConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionName = defaults.functionName;
    	      this.provisionedConcurrentExecutions = defaults.provisionedConcurrentExecutions;
    	      this.qualifier = defaults.qualifier;
        }

        public Builder functionName(Output<String> functionName) {
            this.functionName = Objects.requireNonNull(functionName);
            return this;
        }
        public Builder functionName(String functionName) {
            this.functionName = Output.of(Objects.requireNonNull(functionName));
            return this;
        }
        public Builder provisionedConcurrentExecutions(Output<Integer> provisionedConcurrentExecutions) {
            this.provisionedConcurrentExecutions = Objects.requireNonNull(provisionedConcurrentExecutions);
            return this;
        }
        public Builder provisionedConcurrentExecutions(Integer provisionedConcurrentExecutions) {
            this.provisionedConcurrentExecutions = Output.of(Objects.requireNonNull(provisionedConcurrentExecutions));
            return this;
        }
        public Builder qualifier(Output<String> qualifier) {
            this.qualifier = Objects.requireNonNull(qualifier);
            return this;
        }
        public Builder qualifier(String qualifier) {
            this.qualifier = Output.of(Objects.requireNonNull(qualifier));
            return this;
        }        public ProvisionedConcurrencyConfigArgs build() {
            return new ProvisionedConcurrencyConfigArgs(functionName, provisionedConcurrentExecutions, qualifier);
        }
    }
}