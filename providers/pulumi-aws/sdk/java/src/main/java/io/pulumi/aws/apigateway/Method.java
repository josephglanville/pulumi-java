// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.apigateway.MethodArgs;
import io.pulumi.aws.apigateway.inputs.MethodState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a HTTP Method for an API Gateway Resource.
 * 
 * ## Example Usage
 * ## Usage with Cognito User Pool Authorizer
 * 
 * ## Import
 * 
 * `aws_api_gateway_method` can be imported using `REST-API-ID/RESOURCE-ID/HTTP-METHOD`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigateway/method:Method example 12345abcde/67890fghij/GET
 * ```
 * 
 */
@ResourceType(type="aws:apigateway/method:Method")
public class Method extends io.pulumi.resources.CustomResource {
    /**
     * Specify if the method requires an API key
     * 
     */
    @Export(name="apiKeyRequired", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> apiKeyRequired;

    /**
     * @return Specify if the method requires an API key
     * 
     */
    public Output</* @Nullable */ Boolean> getApiKeyRequired() {
        return this.apiKeyRequired;
    }
    /**
     * The type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
     * 
     */
    @Export(name="authorization", type=String.class, parameters={})
    private Output<String> authorization;

    /**
     * @return The type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
     * 
     */
    public Output<String> getAuthorization() {
        return this.authorization;
    }
    /**
     * The authorization scopes used when the authorization is `COGNITO_USER_POOLS`
     * 
     */
    @Export(name="authorizationScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> authorizationScopes;

    /**
     * @return The authorization scopes used when the authorization is `COGNITO_USER_POOLS`
     * 
     */
    public Output</* @Nullable */ List<String>> getAuthorizationScopes() {
        return this.authorizationScopes;
    }
    /**
     * The authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
     * 
     */
    @Export(name="authorizerId", type=String.class, parameters={})
    private Output</* @Nullable */ String> authorizerId;

    /**
     * @return The authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
     * 
     */
    public Output</* @Nullable */ String> getAuthorizerId() {
        return this.authorizerId;
    }
    /**
     * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
     * 
     */
    @Export(name="httpMethod", type=String.class, parameters={})
    private Output<String> httpMethod;

    /**
     * @return The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
     * 
     */
    public Output<String> getHttpMethod() {
        return this.httpMethod;
    }
    /**
     * The function name that will be given to the method when generating an SDK through API Gateway. If omitted, API Gateway will generate a function name based on the resource path and HTTP verb.
     * 
     */
    @Export(name="operationName", type=String.class, parameters={})
    private Output</* @Nullable */ String> operationName;

    /**
     * @return The function name that will be given to the method when generating an SDK through API Gateway. If omitted, API Gateway will generate a function name based on the resource path and HTTP verb.
     * 
     */
    public Output</* @Nullable */ String> getOperationName() {
        return this.operationName;
    }
    /**
     * A map of the API models used for the request's content type
     * where key is the content type (e.g., `application/json`)
     * and value is either `Error`, `Empty` (built-in models) or `aws.apigateway.Model`'s `name`.
     * 
     */
    @Export(name="requestModels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> requestModels;

    /**
     * @return A map of the API models used for the request's content type
     * where key is the content type (e.g., `application/json`)
     * and value is either `Error`, `Empty` (built-in models) or `aws.apigateway.Model`'s `name`.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getRequestModels() {
        return this.requestModels;
    }
    /**
     * A map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
     * For example: `request_parameters = {"method.request.header.X-Some-Header" = true "method.request.querystring.some-query-param" = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
     * 
     */
    @Export(name="requestParameters", type=Map.class, parameters={String.class, Boolean.class})
    private Output</* @Nullable */ Map<String,Boolean>> requestParameters;

    /**
     * @return A map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
     * For example: `request_parameters = {"method.request.header.X-Some-Header" = true "method.request.querystring.some-query-param" = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
     * 
     */
    public Output</* @Nullable */ Map<String,Boolean>> getRequestParameters() {
        return this.requestParameters;
    }
    /**
     * The ID of a `aws.apigateway.RequestValidator`
     * 
     */
    @Export(name="requestValidatorId", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestValidatorId;

    /**
     * @return The ID of a `aws.apigateway.RequestValidator`
     * 
     */
    public Output</* @Nullable */ String> getRequestValidatorId() {
        return this.requestValidatorId;
    }
    /**
     * The API resource ID
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return The API resource ID
     * 
     */
    public Output<String> getResourceId() {
        return this.resourceId;
    }
    /**
     * The ID of the associated REST API
     * 
     */
    @Export(name="restApi", type=String.class, parameters={})
    private Output<String> restApi;

    /**
     * @return The ID of the associated REST API
     * 
     */
    public Output<String> getRestApi() {
        return this.restApi;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Method(String name) {
        this(name, MethodArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Method(String name, MethodArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Method(String name, MethodArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/method:Method", name, args == null ? MethodArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Method(String name, Output<String> id, @Nullable MethodState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/method:Method", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Method get(String name, Output<String> id, @Nullable MethodState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Method(name, id, state, options);
    }
}