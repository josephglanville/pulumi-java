// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInvocationResult {
    private final String functionName;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String input;
    private final @Nullable String qualifier;
    /**
     * String result of the lambda function invocation.
     * 
     */
    private final String result;

    @CustomType.Constructor
    private GetInvocationResult(
        @CustomType.Parameter("functionName") String functionName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("input") String input,
        @CustomType.Parameter("qualifier") @Nullable String qualifier,
        @CustomType.Parameter("result") String result) {
        this.functionName = functionName;
        this.id = id;
        this.input = input;
        this.qualifier = qualifier;
        this.result = result;
    }

    public String getFunctionName() {
        return this.functionName;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getInput() {
        return this.input;
    }
    public Optional<String> getQualifier() {
        return Optional.ofNullable(this.qualifier);
    }
    /**
     * String result of the lambda function invocation.
     * 
    */
    public String getResult() {
        return this.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInvocationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String functionName;
        private String id;
        private String input;
        private @Nullable String qualifier;
        private String result;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInvocationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionName = defaults.functionName;
    	      this.id = defaults.id;
    	      this.input = defaults.input;
    	      this.qualifier = defaults.qualifier;
    	      this.result = defaults.result;
        }

        public Builder functionName(String functionName) {
            this.functionName = Objects.requireNonNull(functionName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder input(String input) {
            this.input = Objects.requireNonNull(input);
            return this;
        }
        public Builder qualifier(@Nullable String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public Builder result(String result) {
            this.result = Objects.requireNonNull(result);
            return this;
        }        public GetInvocationResult build() {
            return new GetInvocationResult(functionName, id, input, qualifier, result);
        }
    }
}