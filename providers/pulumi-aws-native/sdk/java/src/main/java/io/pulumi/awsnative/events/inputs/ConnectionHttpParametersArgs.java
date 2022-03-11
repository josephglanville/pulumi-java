// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.events.inputs;

import io.pulumi.awsnative.events.inputs.ConnectionParameterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionHttpParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionHttpParametersArgs Empty = new ConnectionHttpParametersArgs();

    @InputImport(name="bodyParameters")
      private final @Nullable Output<List<ConnectionParameterArgs>> bodyParameters;

    public Output<List<ConnectionParameterArgs>> getBodyParameters() {
        return this.bodyParameters == null ? Output.empty() : this.bodyParameters;
    }

    @InputImport(name="headerParameters")
      private final @Nullable Output<List<ConnectionParameterArgs>> headerParameters;

    public Output<List<ConnectionParameterArgs>> getHeaderParameters() {
        return this.headerParameters == null ? Output.empty() : this.headerParameters;
    }

    @InputImport(name="queryStringParameters")
      private final @Nullable Output<List<ConnectionParameterArgs>> queryStringParameters;

    public Output<List<ConnectionParameterArgs>> getQueryStringParameters() {
        return this.queryStringParameters == null ? Output.empty() : this.queryStringParameters;
    }

    public ConnectionHttpParametersArgs(
        @Nullable Output<List<ConnectionParameterArgs>> bodyParameters,
        @Nullable Output<List<ConnectionParameterArgs>> headerParameters,
        @Nullable Output<List<ConnectionParameterArgs>> queryStringParameters) {
        this.bodyParameters = bodyParameters;
        this.headerParameters = headerParameters;
        this.queryStringParameters = queryStringParameters;
    }

    private ConnectionHttpParametersArgs() {
        this.bodyParameters = Output.empty();
        this.headerParameters = Output.empty();
        this.queryStringParameters = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionHttpParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ConnectionParameterArgs>> bodyParameters;
        private @Nullable Output<List<ConnectionParameterArgs>> headerParameters;
        private @Nullable Output<List<ConnectionParameterArgs>> queryStringParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionHttpParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bodyParameters = defaults.bodyParameters;
    	      this.headerParameters = defaults.headerParameters;
    	      this.queryStringParameters = defaults.queryStringParameters;
        }

        public Builder bodyParameters(@Nullable Output<List<ConnectionParameterArgs>> bodyParameters) {
            this.bodyParameters = bodyParameters;
            return this;
        }

        public Builder bodyParameters(@Nullable List<ConnectionParameterArgs> bodyParameters) {
            this.bodyParameters = Output.ofNullable(bodyParameters);
            return this;
        }

        public Builder headerParameters(@Nullable Output<List<ConnectionParameterArgs>> headerParameters) {
            this.headerParameters = headerParameters;
            return this;
        }

        public Builder headerParameters(@Nullable List<ConnectionParameterArgs> headerParameters) {
            this.headerParameters = Output.ofNullable(headerParameters);
            return this;
        }

        public Builder queryStringParameters(@Nullable Output<List<ConnectionParameterArgs>> queryStringParameters) {
            this.queryStringParameters = queryStringParameters;
            return this;
        }

        public Builder queryStringParameters(@Nullable List<ConnectionParameterArgs> queryStringParameters) {
            this.queryStringParameters = Output.ofNullable(queryStringParameters);
            return this;
        }
        public ConnectionHttpParametersArgs build() {
            return new ConnectionHttpParametersArgs(bodyParameters, headerParameters, queryStringParameters);
        }
    }
}
