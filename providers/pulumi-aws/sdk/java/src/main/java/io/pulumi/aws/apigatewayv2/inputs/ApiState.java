// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.inputs;

import io.pulumi.aws.apigatewayv2.inputs.ApiCorsConfigurationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiState extends io.pulumi.resources.ResourceArgs {

    public static final ApiState Empty = new ApiState();

    /**
     * The URI of the API, of the form `https://{api-id}.execute-api.{region}.amazonaws.com` for HTTP APIs and `wss://{api-id}.execute-api.{region}.amazonaws.com` for WebSocket APIs.
     * 
     */
    @Import(name="apiEndpoint")
      private final @Nullable Output<String> apiEndpoint;

    public Output<String> getApiEndpoint() {
        return this.apiEndpoint == null ? Output.empty() : this.apiEndpoint;
    }

    /**
     * An [API key selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions).
     * Valid values: `$context.authorizer.usageIdentifierKey`, `$request.header.x-api-key`. Defaults to `$request.header.x-api-key`.
     * Applicable for WebSocket APIs.
     * 
     */
    @Import(name="apiKeySelectionExpression")
      private final @Nullable Output<String> apiKeySelectionExpression;

    public Output<String> getApiKeySelectionExpression() {
        return this.apiKeySelectionExpression == null ? Output.empty() : this.apiKeySelectionExpression;
    }

    /**
     * The ARN of the API.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * An OpenAPI specification that defines the set of routes and integrations to create as part of the HTTP APIs. Supported only for HTTP APIs.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<String> body;

    public Output<String> getBody() {
        return this.body == null ? Output.empty() : this.body;
    }

    /**
     * The cross-origin resource sharing (CORS) [configuration](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html). Applicable for HTTP APIs.
     * 
     */
    @Import(name="corsConfiguration")
      private final @Nullable Output<ApiCorsConfigurationGetArgs> corsConfiguration;

    public Output<ApiCorsConfigurationGetArgs> getCorsConfiguration() {
        return this.corsConfiguration == null ? Output.empty() : this.corsConfiguration;
    }

    /**
     * Part of _quick create_. Specifies any credentials required for the integration. Applicable for HTTP APIs.
     * 
     */
    @Import(name="credentialsArn")
      private final @Nullable Output<String> credentialsArn;

    public Output<String> getCredentialsArn() {
        return this.credentialsArn == null ? Output.empty() : this.credentialsArn;
    }

    /**
     * The description of the API. Must be less than or equal to 1024 characters in length.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Whether clients can invoke the API by using the default `execute-api` endpoint.
     * By default, clients can invoke the API with the default `{api_id}.execute-api.{region}.amazonaws.com endpoint`.
     * To require that clients use a custom domain name to invoke the API, disable the default endpoint.
     * 
     */
    @Import(name="disableExecuteApiEndpoint")
      private final @Nullable Output<Boolean> disableExecuteApiEndpoint;

    public Output<Boolean> getDisableExecuteApiEndpoint() {
        return this.disableExecuteApiEndpoint == null ? Output.empty() : this.disableExecuteApiEndpoint;
    }

    /**
     * The ARN prefix to be used in an `aws.lambda.Permission`'s `source_arn` attribute
     * or in an `aws.iam.Policy` to authorize access to the [`@connections` API](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-how-to-call-websocket-api-connections.html).
     * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-control-access-iam.html) for details.
     * 
     */
    @Import(name="executionArn")
      private final @Nullable Output<String> executionArn;

    public Output<String> getExecutionArn() {
        return this.executionArn == null ? Output.empty() : this.executionArn;
    }

    /**
     * Whether warnings should return an error while API Gateway is creating or updating the resource using an OpenAPI specification. Defaults to `false`. Applicable for HTTP APIs.
     * 
     */
    @Import(name="failOnWarnings")
      private final @Nullable Output<Boolean> failOnWarnings;

    public Output<Boolean> getFailOnWarnings() {
        return this.failOnWarnings == null ? Output.empty() : this.failOnWarnings;
    }

    /**
     * The name of the API. Must be less than or equal to 128 characters in length.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The API protocol. Valid values: `HTTP`, `WEBSOCKET`.
     * 
     */
    @Import(name="protocolType")
      private final @Nullable Output<String> protocolType;

    public Output<String> getProtocolType() {
        return this.protocolType == null ? Output.empty() : this.protocolType;
    }

    /**
     * Part of _quick create_. Specifies any [route key](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-routes.html). Applicable for HTTP APIs.
     * 
     */
    @Import(name="routeKey")
      private final @Nullable Output<String> routeKey;

    public Output<String> getRouteKey() {
        return this.routeKey == null ? Output.empty() : this.routeKey;
    }

    /**
     * The [route selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-selection-expressions) for the API.
     * Defaults to `$request.method $request.path`.
     * 
     */
    @Import(name="routeSelectionExpression")
      private final @Nullable Output<String> routeSelectionExpression;

    public Output<String> getRouteSelectionExpression() {
        return this.routeSelectionExpression == null ? Output.empty() : this.routeSelectionExpression;
    }

    /**
     * A map of tags to assign to the API. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * Part of _quick create_. Quick create produces an API with an integration, a default catch-all route, and a default stage which is configured to automatically deploy changes.
     * For HTTP integrations, specify a fully qualified URL. For Lambda integrations, specify a function ARN.
     * The type of the integration will be `HTTP_PROXY` or `AWS_PROXY`, respectively. Applicable for HTTP APIs.
     * 
     */
    @Import(name="target")
      private final @Nullable Output<String> target;

    public Output<String> getTarget() {
        return this.target == null ? Output.empty() : this.target;
    }

    /**
     * A version identifier for the API. Must be between 1 and 64 characters in length.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public ApiState(
        @Nullable Output<String> apiEndpoint,
        @Nullable Output<String> apiKeySelectionExpression,
        @Nullable Output<String> arn,
        @Nullable Output<String> body,
        @Nullable Output<ApiCorsConfigurationGetArgs> corsConfiguration,
        @Nullable Output<String> credentialsArn,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> disableExecuteApiEndpoint,
        @Nullable Output<String> executionArn,
        @Nullable Output<Boolean> failOnWarnings,
        @Nullable Output<String> name,
        @Nullable Output<String> protocolType,
        @Nullable Output<String> routeKey,
        @Nullable Output<String> routeSelectionExpression,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> target,
        @Nullable Output<String> version) {
        this.apiEndpoint = apiEndpoint;
        this.apiKeySelectionExpression = apiKeySelectionExpression;
        this.arn = arn;
        this.body = body;
        this.corsConfiguration = corsConfiguration;
        this.credentialsArn = credentialsArn;
        this.description = description;
        this.disableExecuteApiEndpoint = disableExecuteApiEndpoint;
        this.executionArn = executionArn;
        this.failOnWarnings = failOnWarnings;
        this.name = name;
        this.protocolType = protocolType;
        this.routeKey = routeKey;
        this.routeSelectionExpression = routeSelectionExpression;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.target = target;
        this.version = version;
    }

    private ApiState() {
        this.apiEndpoint = Output.empty();
        this.apiKeySelectionExpression = Output.empty();
        this.arn = Output.empty();
        this.body = Output.empty();
        this.corsConfiguration = Output.empty();
        this.credentialsArn = Output.empty();
        this.description = Output.empty();
        this.disableExecuteApiEndpoint = Output.empty();
        this.executionArn = Output.empty();
        this.failOnWarnings = Output.empty();
        this.name = Output.empty();
        this.protocolType = Output.empty();
        this.routeKey = Output.empty();
        this.routeSelectionExpression = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.target = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiEndpoint;
        private @Nullable Output<String> apiKeySelectionExpression;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> body;
        private @Nullable Output<ApiCorsConfigurationGetArgs> corsConfiguration;
        private @Nullable Output<String> credentialsArn;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> disableExecuteApiEndpoint;
        private @Nullable Output<String> executionArn;
        private @Nullable Output<Boolean> failOnWarnings;
        private @Nullable Output<String> name;
        private @Nullable Output<String> protocolType;
        private @Nullable Output<String> routeKey;
        private @Nullable Output<String> routeSelectionExpression;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> target;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiEndpoint = defaults.apiEndpoint;
    	      this.apiKeySelectionExpression = defaults.apiKeySelectionExpression;
    	      this.arn = defaults.arn;
    	      this.body = defaults.body;
    	      this.corsConfiguration = defaults.corsConfiguration;
    	      this.credentialsArn = defaults.credentialsArn;
    	      this.description = defaults.description;
    	      this.disableExecuteApiEndpoint = defaults.disableExecuteApiEndpoint;
    	      this.executionArn = defaults.executionArn;
    	      this.failOnWarnings = defaults.failOnWarnings;
    	      this.name = defaults.name;
    	      this.protocolType = defaults.protocolType;
    	      this.routeKey = defaults.routeKey;
    	      this.routeSelectionExpression = defaults.routeSelectionExpression;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.target = defaults.target;
    	      this.version = defaults.version;
        }

        public Builder apiEndpoint(@Nullable Output<String> apiEndpoint) {
            this.apiEndpoint = apiEndpoint;
            return this;
        }
        public Builder apiEndpoint(@Nullable String apiEndpoint) {
            this.apiEndpoint = Output.ofNullable(apiEndpoint);
            return this;
        }
        public Builder apiKeySelectionExpression(@Nullable Output<String> apiKeySelectionExpression) {
            this.apiKeySelectionExpression = apiKeySelectionExpression;
            return this;
        }
        public Builder apiKeySelectionExpression(@Nullable String apiKeySelectionExpression) {
            this.apiKeySelectionExpression = Output.ofNullable(apiKeySelectionExpression);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder body(@Nullable Output<String> body) {
            this.body = body;
            return this;
        }
        public Builder body(@Nullable String body) {
            this.body = Output.ofNullable(body);
            return this;
        }
        public Builder corsConfiguration(@Nullable Output<ApiCorsConfigurationGetArgs> corsConfiguration) {
            this.corsConfiguration = corsConfiguration;
            return this;
        }
        public Builder corsConfiguration(@Nullable ApiCorsConfigurationGetArgs corsConfiguration) {
            this.corsConfiguration = Output.ofNullable(corsConfiguration);
            return this;
        }
        public Builder credentialsArn(@Nullable Output<String> credentialsArn) {
            this.credentialsArn = credentialsArn;
            return this;
        }
        public Builder credentialsArn(@Nullable String credentialsArn) {
            this.credentialsArn = Output.ofNullable(credentialsArn);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder disableExecuteApiEndpoint(@Nullable Output<Boolean> disableExecuteApiEndpoint) {
            this.disableExecuteApiEndpoint = disableExecuteApiEndpoint;
            return this;
        }
        public Builder disableExecuteApiEndpoint(@Nullable Boolean disableExecuteApiEndpoint) {
            this.disableExecuteApiEndpoint = Output.ofNullable(disableExecuteApiEndpoint);
            return this;
        }
        public Builder executionArn(@Nullable Output<String> executionArn) {
            this.executionArn = executionArn;
            return this;
        }
        public Builder executionArn(@Nullable String executionArn) {
            this.executionArn = Output.ofNullable(executionArn);
            return this;
        }
        public Builder failOnWarnings(@Nullable Output<Boolean> failOnWarnings) {
            this.failOnWarnings = failOnWarnings;
            return this;
        }
        public Builder failOnWarnings(@Nullable Boolean failOnWarnings) {
            this.failOnWarnings = Output.ofNullable(failOnWarnings);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder protocolType(@Nullable Output<String> protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public Builder protocolType(@Nullable String protocolType) {
            this.protocolType = Output.ofNullable(protocolType);
            return this;
        }
        public Builder routeKey(@Nullable Output<String> routeKey) {
            this.routeKey = routeKey;
            return this;
        }
        public Builder routeKey(@Nullable String routeKey) {
            this.routeKey = Output.ofNullable(routeKey);
            return this;
        }
        public Builder routeSelectionExpression(@Nullable Output<String> routeSelectionExpression) {
            this.routeSelectionExpression = routeSelectionExpression;
            return this;
        }
        public Builder routeSelectionExpression(@Nullable String routeSelectionExpression) {
            this.routeSelectionExpression = Output.ofNullable(routeSelectionExpression);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public Builder target(@Nullable Output<String> target) {
            this.target = target;
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = Output.ofNullable(target);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }        public ApiState build() {
            return new ApiState(apiEndpoint, apiKeySelectionExpression, arn, body, corsConfiguration, credentialsArn, description, disableExecuteApiEndpoint, executionArn, failOnWarnings, name, protocolType, routeKey, routeSelectionExpression, tags, tagsAll, target, version);
        }
    }
}
