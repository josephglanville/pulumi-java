// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFunctionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFunctionArgs Empty = new GetFunctionArgs();

    /**
     * The name of the Lambda function, up to 64 characters in length. If you don't specify a name, AWS CloudFormation generates one.
     * 
     */
    @InputImport(name="functionName", required=true)
      private final String functionName;

    public String getFunctionName() {
        return this.functionName;
    }

    public GetFunctionArgs(String functionName) {
        this.functionName = Objects.requireNonNull(functionName, "expected parameter 'functionName' to be non-null");
    }

    private GetFunctionArgs() {
        this.functionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String functionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionName = defaults.functionName;
        }

        public Builder setFunctionName(String functionName) {
            this.functionName = Objects.requireNonNull(functionName);
            return this;
        }
        public GetFunctionArgs build() {
            return new GetFunctionArgs(functionName);
        }
    }
}
