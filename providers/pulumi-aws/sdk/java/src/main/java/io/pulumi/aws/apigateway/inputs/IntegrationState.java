// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.aws.apigateway.inputs.IntegrationTlsConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationState extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationState Empty = new IntegrationState();

    /**
     * A list of cache key parameters for the integration.
     * 
     */
    @InputImport(name="cacheKeyParameters")
      private final @Nullable Output<List<String>> cacheKeyParameters;

    public Output<List<String>> getCacheKeyParameters() {
        return this.cacheKeyParameters == null ? Output.empty() : this.cacheKeyParameters;
    }

    /**
     * The integration's cache namespace.
     * 
     */
    @InputImport(name="cacheNamespace")
      private final @Nullable Output<String> cacheNamespace;

    public Output<String> getCacheNamespace() {
        return this.cacheNamespace == null ? Output.empty() : this.cacheNamespace;
    }

    /**
     * The id of the VpcLink used for the integration. **Required** if `connection_type` is `VPC_LINK`
     * 
     */
    @InputImport(name="connectionId")
      private final @Nullable Output<String> connectionId;

    public Output<String> getConnectionId() {
        return this.connectionId == null ? Output.empty() : this.connectionId;
    }

    /**
     * The integration input's [connectionType](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/#connectionType). Valid values are `INTERNET` (default for connections through the public routable internet), and `VPC_LINK` (for private connections between API Gateway and a network load balancer in a VPC).
     * 
     */
    @InputImport(name="connectionType")
      private final @Nullable Output<String> connectionType;

    public Output<String> getConnectionType() {
        return this.connectionType == null ? Output.empty() : this.connectionType;
    }

    /**
     * Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the request payload will be passed through from the method request to integration request without modification, provided that the passthroughBehaviors is configured to support payload pass-through.
     * 
     */
    @InputImport(name="contentHandling")
      private final @Nullable Output<String> contentHandling;

    public Output<String> getContentHandling() {
        return this.contentHandling == null ? Output.empty() : this.contentHandling;
    }

    /**
     * The credentials required for the integration. For `AWS` integrations, 2 options are available. To specify an IAM Role for Amazon API Gateway to assume, use the role's ARN. To require that the caller's identity be passed through from the request, specify the string `arn:aws:iam::\*:user/\*`.
     * 
     */
    @InputImport(name="credentials")
      private final @Nullable Output<String> credentials;

    public Output<String> getCredentials() {
        return this.credentials == null ? Output.empty() : this.credentials;
    }

    /**
     * The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTION`, `ANY`)
     * when calling the associated resource.
     * 
     */
    @InputImport(name="httpMethod")
      private final @Nullable Output<String> httpMethod;

    public Output<String> getHttpMethod() {
        return this.httpMethod == null ? Output.empty() : this.httpMethod;
    }

    /**
     * The integration HTTP method
     * (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONs`, `ANY`, `PATCH`) specifying how API Gateway will interact with the back end.
     * **Required** if `type` is `AWS`, `AWS_PROXY`, `HTTP` or `HTTP_PROXY`.
     * Not all methods are compatible with all `AWS` integrations.
     * e.g., Lambda function [can only be invoked](https://github.com/awslabs/aws-apigateway-importer/issues/9#issuecomment-129651005) via `POST`.
     * 
     */
    @InputImport(name="integrationHttpMethod")
      private final @Nullable Output<String> integrationHttpMethod;

    public Output<String> getIntegrationHttpMethod() {
        return this.integrationHttpMethod == null ? Output.empty() : this.integrationHttpMethod;
    }

    /**
     * The integration passthrough behavior (`WHEN_NO_MATCH`, `WHEN_NO_TEMPLATES`, `NEVER`).  **Required** if `request_templates` is used.
     * 
     */
    @InputImport(name="passthroughBehavior")
      private final @Nullable Output<String> passthroughBehavior;

    public Output<String> getPassthroughBehavior() {
        return this.passthroughBehavior == null ? Output.empty() : this.passthroughBehavior;
    }

    /**
     * A map of request query string parameters and headers that should be passed to the backend responder.
     * For example: `request_parameters = { "integration.request.header.X-Some-Other-Header" = "method.request.header.X-Some-Header" }`
     * 
     */
    @InputImport(name="requestParameters")
      private final @Nullable Output<Map<String,String>> requestParameters;

    public Output<Map<String,String>> getRequestParameters() {
        return this.requestParameters == null ? Output.empty() : this.requestParameters;
    }

    /**
     * A map of the integration's request templates.
     * 
     */
    @InputImport(name="requestTemplates")
      private final @Nullable Output<Map<String,String>> requestTemplates;

    public Output<Map<String,String>> getRequestTemplates() {
        return this.requestTemplates == null ? Output.empty() : this.requestTemplates;
    }

    /**
     * The API resource ID.
     * 
     */
    @InputImport(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId == null ? Output.empty() : this.resourceId;
    }

    /**
     * The ID of the associated REST API.
     * 
     */
    @InputImport(name="restApi")
      private final @Nullable Output<String> restApi;

    public Output<String> getRestApi() {
        return this.restApi == null ? Output.empty() : this.restApi;
    }

    /**
     * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds.
     * 
     */
    @InputImport(name="timeoutMilliseconds")
      private final @Nullable Output<Integer> timeoutMilliseconds;

    public Output<Integer> getTimeoutMilliseconds() {
        return this.timeoutMilliseconds == null ? Output.empty() : this.timeoutMilliseconds;
    }

    /**
     * Configuration block specifying the TLS configuration for an integration. Defined below.
     * 
     */
    @InputImport(name="tlsConfig")
      private final @Nullable Output<IntegrationTlsConfigGetArgs> tlsConfig;

    public Output<IntegrationTlsConfigGetArgs> getTlsConfig() {
        return this.tlsConfig == null ? Output.empty() : this.tlsConfig;
    }

    /**
     * The integration input's [type](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/). Valid values are `HTTP` (for HTTP backends), `MOCK` (not calling any real backend), `AWS` (for AWS services), `AWS_PROXY` (for Lambda proxy integration) and `HTTP_PROXY` (for HTTP proxy integration). An `HTTP` or `HTTP_PROXY` integration with a `connection_type` of `VPC_LINK` is referred to as a private integration and uses a VpcLink to connect API Gateway to a network load balancer of a VPC.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    /**
     * The input's URI. **Required** if `type` is `AWS`, `AWS_PROXY`, `HTTP` or `HTTP_PROXY`.
     * For HTTP integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification . For AWS integrations, the URI should be of the form `arn:aws:apigateway:{region}:{subdomain.service|service}:{path|action}/{service_api}`. `region`, `subdomain` and `service` are used to determine the right endpoint.
     * e.g., `arn:aws:apigateway:eu-west-1:lambda:path/2015-03-31/functions/arn:aws:lambda:eu-west-1:012345678901:function:my-func/invocations`. For private integrations, the URI parameter is not used for routing requests to your endpoint, but is used for setting the Host header and for certificate validation.
     * 
     */
    @InputImport(name="uri")
      private final @Nullable Output<String> uri;

    public Output<String> getUri() {
        return this.uri == null ? Output.empty() : this.uri;
    }

    public IntegrationState(
        @Nullable Output<List<String>> cacheKeyParameters,
        @Nullable Output<String> cacheNamespace,
        @Nullable Output<String> connectionId,
        @Nullable Output<String> connectionType,
        @Nullable Output<String> contentHandling,
        @Nullable Output<String> credentials,
        @Nullable Output<String> httpMethod,
        @Nullable Output<String> integrationHttpMethod,
        @Nullable Output<String> passthroughBehavior,
        @Nullable Output<Map<String,String>> requestParameters,
        @Nullable Output<Map<String,String>> requestTemplates,
        @Nullable Output<String> resourceId,
        @Nullable Output<String> restApi,
        @Nullable Output<Integer> timeoutMilliseconds,
        @Nullable Output<IntegrationTlsConfigGetArgs> tlsConfig,
        @Nullable Output<String> type,
        @Nullable Output<String> uri) {
        this.cacheKeyParameters = cacheKeyParameters;
        this.cacheNamespace = cacheNamespace;
        this.connectionId = connectionId;
        this.connectionType = connectionType;
        this.contentHandling = contentHandling;
        this.credentials = credentials;
        this.httpMethod = httpMethod;
        this.integrationHttpMethod = integrationHttpMethod;
        this.passthroughBehavior = passthroughBehavior;
        this.requestParameters = requestParameters;
        this.requestTemplates = requestTemplates;
        this.resourceId = resourceId;
        this.restApi = restApi;
        this.timeoutMilliseconds = timeoutMilliseconds;
        this.tlsConfig = tlsConfig;
        this.type = type;
        this.uri = uri;
    }

    private IntegrationState() {
        this.cacheKeyParameters = Output.empty();
        this.cacheNamespace = Output.empty();
        this.connectionId = Output.empty();
        this.connectionType = Output.empty();
        this.contentHandling = Output.empty();
        this.credentials = Output.empty();
        this.httpMethod = Output.empty();
        this.integrationHttpMethod = Output.empty();
        this.passthroughBehavior = Output.empty();
        this.requestParameters = Output.empty();
        this.requestTemplates = Output.empty();
        this.resourceId = Output.empty();
        this.restApi = Output.empty();
        this.timeoutMilliseconds = Output.empty();
        this.tlsConfig = Output.empty();
        this.type = Output.empty();
        this.uri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> cacheKeyParameters;
        private @Nullable Output<String> cacheNamespace;
        private @Nullable Output<String> connectionId;
        private @Nullable Output<String> connectionType;
        private @Nullable Output<String> contentHandling;
        private @Nullable Output<String> credentials;
        private @Nullable Output<String> httpMethod;
        private @Nullable Output<String> integrationHttpMethod;
        private @Nullable Output<String> passthroughBehavior;
        private @Nullable Output<Map<String,String>> requestParameters;
        private @Nullable Output<Map<String,String>> requestTemplates;
        private @Nullable Output<String> resourceId;
        private @Nullable Output<String> restApi;
        private @Nullable Output<Integer> timeoutMilliseconds;
        private @Nullable Output<IntegrationTlsConfigGetArgs> tlsConfig;
        private @Nullable Output<String> type;
        private @Nullable Output<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheKeyParameters = defaults.cacheKeyParameters;
    	      this.cacheNamespace = defaults.cacheNamespace;
    	      this.connectionId = defaults.connectionId;
    	      this.connectionType = defaults.connectionType;
    	      this.contentHandling = defaults.contentHandling;
    	      this.credentials = defaults.credentials;
    	      this.httpMethod = defaults.httpMethod;
    	      this.integrationHttpMethod = defaults.integrationHttpMethod;
    	      this.passthroughBehavior = defaults.passthroughBehavior;
    	      this.requestParameters = defaults.requestParameters;
    	      this.requestTemplates = defaults.requestTemplates;
    	      this.resourceId = defaults.resourceId;
    	      this.restApi = defaults.restApi;
    	      this.timeoutMilliseconds = defaults.timeoutMilliseconds;
    	      this.tlsConfig = defaults.tlsConfig;
    	      this.type = defaults.type;
    	      this.uri = defaults.uri;
        }

        public Builder cacheKeyParameters(@Nullable Output<List<String>> cacheKeyParameters) {
            this.cacheKeyParameters = cacheKeyParameters;
            return this;
        }

        public Builder cacheKeyParameters(@Nullable List<String> cacheKeyParameters) {
            this.cacheKeyParameters = Output.ofNullable(cacheKeyParameters);
            return this;
        }

        public Builder cacheNamespace(@Nullable Output<String> cacheNamespace) {
            this.cacheNamespace = cacheNamespace;
            return this;
        }

        public Builder cacheNamespace(@Nullable String cacheNamespace) {
            this.cacheNamespace = Output.ofNullable(cacheNamespace);
            return this;
        }

        public Builder connectionId(@Nullable Output<String> connectionId) {
            this.connectionId = connectionId;
            return this;
        }

        public Builder connectionId(@Nullable String connectionId) {
            this.connectionId = Output.ofNullable(connectionId);
            return this;
        }

        public Builder connectionType(@Nullable Output<String> connectionType) {
            this.connectionType = connectionType;
            return this;
        }

        public Builder connectionType(@Nullable String connectionType) {
            this.connectionType = Output.ofNullable(connectionType);
            return this;
        }

        public Builder contentHandling(@Nullable Output<String> contentHandling) {
            this.contentHandling = contentHandling;
            return this;
        }

        public Builder contentHandling(@Nullable String contentHandling) {
            this.contentHandling = Output.ofNullable(contentHandling);
            return this;
        }

        public Builder credentials(@Nullable Output<String> credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder credentials(@Nullable String credentials) {
            this.credentials = Output.ofNullable(credentials);
            return this;
        }

        public Builder httpMethod(@Nullable Output<String> httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        public Builder httpMethod(@Nullable String httpMethod) {
            this.httpMethod = Output.ofNullable(httpMethod);
            return this;
        }

        public Builder integrationHttpMethod(@Nullable Output<String> integrationHttpMethod) {
            this.integrationHttpMethod = integrationHttpMethod;
            return this;
        }

        public Builder integrationHttpMethod(@Nullable String integrationHttpMethod) {
            this.integrationHttpMethod = Output.ofNullable(integrationHttpMethod);
            return this;
        }

        public Builder passthroughBehavior(@Nullable Output<String> passthroughBehavior) {
            this.passthroughBehavior = passthroughBehavior;
            return this;
        }

        public Builder passthroughBehavior(@Nullable String passthroughBehavior) {
            this.passthroughBehavior = Output.ofNullable(passthroughBehavior);
            return this;
        }

        public Builder requestParameters(@Nullable Output<Map<String,String>> requestParameters) {
            this.requestParameters = requestParameters;
            return this;
        }

        public Builder requestParameters(@Nullable Map<String,String> requestParameters) {
            this.requestParameters = Output.ofNullable(requestParameters);
            return this;
        }

        public Builder requestTemplates(@Nullable Output<Map<String,String>> requestTemplates) {
            this.requestTemplates = requestTemplates;
            return this;
        }

        public Builder requestTemplates(@Nullable Map<String,String> requestTemplates) {
            this.requestTemplates = Output.ofNullable(requestTemplates);
            return this;
        }

        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Output.ofNullable(resourceId);
            return this;
        }

        public Builder restApi(@Nullable Output<String> restApi) {
            this.restApi = restApi;
            return this;
        }

        public Builder timeoutMilliseconds(@Nullable Output<Integer> timeoutMilliseconds) {
            this.timeoutMilliseconds = timeoutMilliseconds;
            return this;
        }

        public Builder timeoutMilliseconds(@Nullable Integer timeoutMilliseconds) {
            this.timeoutMilliseconds = Output.ofNullable(timeoutMilliseconds);
            return this;
        }

        public Builder tlsConfig(@Nullable Output<IntegrationTlsConfigGetArgs> tlsConfig) {
            this.tlsConfig = tlsConfig;
            return this;
        }

        public Builder tlsConfig(@Nullable IntegrationTlsConfigGetArgs tlsConfig) {
            this.tlsConfig = Output.ofNullable(tlsConfig);
            return this;
        }

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }

        public Builder uri(@Nullable Output<String> uri) {
            this.uri = uri;
            return this;
        }

        public Builder uri(@Nullable String uri) {
            this.uri = Output.ofNullable(uri);
            return this;
        }
        public IntegrationState build() {
            return new IntegrationState(cacheKeyParameters, cacheNamespace, connectionId, connectionType, contentHandling, credentials, httpMethod, integrationHttpMethod, passthroughBehavior, requestParameters, requestTemplates, resourceId, restApi, timeoutMilliseconds, tlsConfig, type, uri);
        }
    }
}
