// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventTargetHttpTargetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventTargetHttpTargetGetArgs Empty = new EventTargetHttpTargetGetArgs();

    /**
     * Enables you to specify HTTP headers to add to the request.
     * 
     */
    @InputImport(name="headerParameters")
      private final @Nullable Output<Map<String,String>> headerParameters;

    public Output<Map<String,String>> getHeaderParameters() {
        return this.headerParameters == null ? Output.empty() : this.headerParameters;
    }

    /**
     * The list of values that correspond sequentially to any path variables in your endpoint ARN (for example `arn:aws:execute-api:us-east-1:123456:myapi/*{@literal /}POST/pets/*`).
     * 
     */
    @InputImport(name="pathParameterValues")
      private final @Nullable Output<List<String>> pathParameterValues;

    public Output<List<String>> getPathParameterValues() {
        return this.pathParameterValues == null ? Output.empty() : this.pathParameterValues;
    }

    /**
     * Represents keys/values of query string parameters that are appended to the invoked endpoint.
     * 
     */
    @InputImport(name="queryStringParameters")
      private final @Nullable Output<Map<String,String>> queryStringParameters;

    public Output<Map<String,String>> getQueryStringParameters() {
        return this.queryStringParameters == null ? Output.empty() : this.queryStringParameters;
    }

    public EventTargetHttpTargetGetArgs(
        @Nullable Output<Map<String,String>> headerParameters,
        @Nullable Output<List<String>> pathParameterValues,
        @Nullable Output<Map<String,String>> queryStringParameters) {
        this.headerParameters = headerParameters;
        this.pathParameterValues = pathParameterValues;
        this.queryStringParameters = queryStringParameters;
    }

    private EventTargetHttpTargetGetArgs() {
        this.headerParameters = Output.empty();
        this.pathParameterValues = Output.empty();
        this.queryStringParameters = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetHttpTargetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> headerParameters;
        private @Nullable Output<List<String>> pathParameterValues;
        private @Nullable Output<Map<String,String>> queryStringParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetHttpTargetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerParameters = defaults.headerParameters;
    	      this.pathParameterValues = defaults.pathParameterValues;
    	      this.queryStringParameters = defaults.queryStringParameters;
        }

        public Builder headerParameters(@Nullable Output<Map<String,String>> headerParameters) {
            this.headerParameters = headerParameters;
            return this;
        }

        public Builder headerParameters(@Nullable Map<String,String> headerParameters) {
            this.headerParameters = Output.ofNullable(headerParameters);
            return this;
        }

        public Builder pathParameterValues(@Nullable Output<List<String>> pathParameterValues) {
            this.pathParameterValues = pathParameterValues;
            return this;
        }

        public Builder pathParameterValues(@Nullable List<String> pathParameterValues) {
            this.pathParameterValues = Output.ofNullable(pathParameterValues);
            return this;
        }

        public Builder queryStringParameters(@Nullable Output<Map<String,String>> queryStringParameters) {
            this.queryStringParameters = queryStringParameters;
            return this;
        }

        public Builder queryStringParameters(@Nullable Map<String,String> queryStringParameters) {
            this.queryStringParameters = Output.ofNullable(queryStringParameters);
            return this;
        }
        public EventTargetHttpTargetGetArgs build() {
            return new EventTargetHttpTargetGetArgs(headerParameters, pathParameterValues, queryStringParameters);
        }
    }
}
