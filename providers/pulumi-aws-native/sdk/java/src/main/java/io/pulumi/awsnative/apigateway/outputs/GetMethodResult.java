// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.outputs;

import io.pulumi.awsnative.apigateway.enums.MethodAuthorizationType;
import io.pulumi.awsnative.apigateway.outputs.MethodIntegration;
import io.pulumi.awsnative.apigateway.outputs.MethodResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMethodResult {
    /**
     * Indicates whether the method requires clients to submit a valid API key.
     * 
     */
    private final @Nullable Boolean apiKeyRequired;
    /**
     * A list of authorization scopes configured on the method.
     * 
     */
    private final @Nullable List<String> authorizationScopes;
    /**
     * The method's authorization type.
     * 
     */
    private final @Nullable MethodAuthorizationType authorizationType;
    /**
     * The identifier of the authorizer to use on this method.
     * 
     */
    private final @Nullable String authorizerId;
    /**
     * The backend system that the method calls when it receives a request.
     * 
     */
    private final @Nullable MethodIntegration integration;
    /**
     * The responses that can be sent to the client who calls the method.
     * 
     */
    private final @Nullable List<MethodResponse> methodResponses;
    /**
     * A friendly operation name for the method.
     * 
     */
    private final @Nullable String operationName;
    /**
     * The resources that are used for the request's content type. Specify request models as key-value pairs (string-to-string mapping), with a content type as the key and a Model resource name as the value.
     * 
     */
    private final @Nullable Object requestModels;
    /**
     * The request parameters that API Gateway accepts. Specify request parameters as key-value pairs (string-to-Boolean mapping), with a source as the key and a Boolean as the value.
     * 
     */
    private final @Nullable Object requestParameters;
    /**
     * The ID of the associated request validator.
     * 
     */
    private final @Nullable String requestValidatorId;

    @CustomType.Constructor
    private GetMethodResult(
        @CustomType.Parameter("apiKeyRequired") @Nullable Boolean apiKeyRequired,
        @CustomType.Parameter("authorizationScopes") @Nullable List<String> authorizationScopes,
        @CustomType.Parameter("authorizationType") @Nullable MethodAuthorizationType authorizationType,
        @CustomType.Parameter("authorizerId") @Nullable String authorizerId,
        @CustomType.Parameter("integration") @Nullable MethodIntegration integration,
        @CustomType.Parameter("methodResponses") @Nullable List<MethodResponse> methodResponses,
        @CustomType.Parameter("operationName") @Nullable String operationName,
        @CustomType.Parameter("requestModels") @Nullable Object requestModels,
        @CustomType.Parameter("requestParameters") @Nullable Object requestParameters,
        @CustomType.Parameter("requestValidatorId") @Nullable String requestValidatorId) {
        this.apiKeyRequired = apiKeyRequired;
        this.authorizationScopes = authorizationScopes;
        this.authorizationType = authorizationType;
        this.authorizerId = authorizerId;
        this.integration = integration;
        this.methodResponses = methodResponses;
        this.operationName = operationName;
        this.requestModels = requestModels;
        this.requestParameters = requestParameters;
        this.requestValidatorId = requestValidatorId;
    }

    /**
     * Indicates whether the method requires clients to submit a valid API key.
     * 
    */
    public Optional<Boolean> getApiKeyRequired() {
        return Optional.ofNullable(this.apiKeyRequired);
    }
    /**
     * A list of authorization scopes configured on the method.
     * 
    */
    public List<String> getAuthorizationScopes() {
        return this.authorizationScopes == null ? List.of() : this.authorizationScopes;
    }
    /**
     * The method's authorization type.
     * 
    */
    public Optional<MethodAuthorizationType> getAuthorizationType() {
        return Optional.ofNullable(this.authorizationType);
    }
    /**
     * The identifier of the authorizer to use on this method.
     * 
    */
    public Optional<String> getAuthorizerId() {
        return Optional.ofNullable(this.authorizerId);
    }
    /**
     * The backend system that the method calls when it receives a request.
     * 
    */
    public Optional<MethodIntegration> getIntegration() {
        return Optional.ofNullable(this.integration);
    }
    /**
     * The responses that can be sent to the client who calls the method.
     * 
    */
    public List<MethodResponse> getMethodResponses() {
        return this.methodResponses == null ? List.of() : this.methodResponses;
    }
    /**
     * A friendly operation name for the method.
     * 
    */
    public Optional<String> getOperationName() {
        return Optional.ofNullable(this.operationName);
    }
    /**
     * The resources that are used for the request's content type. Specify request models as key-value pairs (string-to-string mapping), with a content type as the key and a Model resource name as the value.
     * 
    */
    public Optional<Object> getRequestModels() {
        return Optional.ofNullable(this.requestModels);
    }
    /**
     * The request parameters that API Gateway accepts. Specify request parameters as key-value pairs (string-to-Boolean mapping), with a source as the key and a Boolean as the value.
     * 
    */
    public Optional<Object> getRequestParameters() {
        return Optional.ofNullable(this.requestParameters);
    }
    /**
     * The ID of the associated request validator.
     * 
    */
    public Optional<String> getRequestValidatorId() {
        return Optional.ofNullable(this.requestValidatorId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMethodResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean apiKeyRequired;
        private @Nullable List<String> authorizationScopes;
        private @Nullable MethodAuthorizationType authorizationType;
        private @Nullable String authorizerId;
        private @Nullable MethodIntegration integration;
        private @Nullable List<MethodResponse> methodResponses;
        private @Nullable String operationName;
        private @Nullable Object requestModels;
        private @Nullable Object requestParameters;
        private @Nullable String requestValidatorId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMethodResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKeyRequired = defaults.apiKeyRequired;
    	      this.authorizationScopes = defaults.authorizationScopes;
    	      this.authorizationType = defaults.authorizationType;
    	      this.authorizerId = defaults.authorizerId;
    	      this.integration = defaults.integration;
    	      this.methodResponses = defaults.methodResponses;
    	      this.operationName = defaults.operationName;
    	      this.requestModels = defaults.requestModels;
    	      this.requestParameters = defaults.requestParameters;
    	      this.requestValidatorId = defaults.requestValidatorId;
        }

        public Builder apiKeyRequired(@Nullable Boolean apiKeyRequired) {
            this.apiKeyRequired = apiKeyRequired;
            return this;
        }
        public Builder authorizationScopes(@Nullable List<String> authorizationScopes) {
            this.authorizationScopes = authorizationScopes;
            return this;
        }
        public Builder authorizationScopes(String... authorizationScopes) {
            return authorizationScopes(List.of(authorizationScopes));
        }
        public Builder authorizationType(@Nullable MethodAuthorizationType authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }
        public Builder authorizerId(@Nullable String authorizerId) {
            this.authorizerId = authorizerId;
            return this;
        }
        public Builder integration(@Nullable MethodIntegration integration) {
            this.integration = integration;
            return this;
        }
        public Builder methodResponses(@Nullable List<MethodResponse> methodResponses) {
            this.methodResponses = methodResponses;
            return this;
        }
        public Builder methodResponses(MethodResponse... methodResponses) {
            return methodResponses(List.of(methodResponses));
        }
        public Builder operationName(@Nullable String operationName) {
            this.operationName = operationName;
            return this;
        }
        public Builder requestModels(@Nullable Object requestModels) {
            this.requestModels = requestModels;
            return this;
        }
        public Builder requestParameters(@Nullable Object requestParameters) {
            this.requestParameters = requestParameters;
            return this;
        }
        public Builder requestValidatorId(@Nullable String requestValidatorId) {
            this.requestValidatorId = requestValidatorId;
            return this;
        }        public GetMethodResult build() {
            return new GetMethodResult(apiKeyRequired, authorizationScopes, authorizationType, authorizerId, integration, methodResponses, operationName, requestModels, requestParameters, requestValidatorId);
        }
    }
}
