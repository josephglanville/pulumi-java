// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.apigateway.AuthorizerArgs;
import io.pulumi.aws.apigateway.inputs.AuthorizerState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides an API Gateway Authorizer.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AWS API Gateway Authorizer can be imported using the `REST-API-ID/AUTHORIZER-ID`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigateway/authorizer:Authorizer authorizer 12345abcde/example
 * ```
 * 
 */
@ResourceType(type="aws:apigateway/authorizer:Authorizer")
public class Authorizer extends io.pulumi.resources.CustomResource {
    /**
     * The credentials required for the authorizer. To specify an IAM Role for API Gateway to assume, use the IAM Role ARN.
     * 
     */
    @OutputExport(name="authorizerCredentials", type=String.class, parameters={})
    private Output</* @Nullable */ String> authorizerCredentials;

    /**
     * @return The credentials required for the authorizer. To specify an IAM Role for API Gateway to assume, use the IAM Role ARN.
     * 
     */
    public Output</* @Nullable */ String> getAuthorizerCredentials() {
        return this.authorizerCredentials;
    }
    /**
     * The TTL of cached authorizer results in seconds. Defaults to `300`.
     * 
     */
    @OutputExport(name="authorizerResultTtlInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> authorizerResultTtlInSeconds;

    /**
     * @return The TTL of cached authorizer results in seconds. Defaults to `300`.
     * 
     */
    public Output</* @Nullable */ Integer> getAuthorizerResultTtlInSeconds() {
        return this.authorizerResultTtlInSeconds;
    }
    /**
     * The authorizer's Uniform Resource Identifier (URI). This must be a well-formed Lambda function URI in the form of `arn:aws:apigateway:{region}:lambda:path/{service_api}`,
     * e.g., `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:012345678912:function:my-function/invocations`
     * 
     */
    @OutputExport(name="authorizerUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> authorizerUri;

    /**
     * @return The authorizer's Uniform Resource Identifier (URI). This must be a well-formed Lambda function URI in the form of `arn:aws:apigateway:{region}:lambda:path/{service_api}`,
     * e.g., `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:012345678912:function:my-function/invocations`
     * 
     */
    public Output</* @Nullable */ String> getAuthorizerUri() {
        return this.authorizerUri;
    }
    /**
     * The source of the identity in an incoming request. Defaults to `method.request.header.Authorization`. For `REQUEST` type, this may be a comma-separated list of values, including headers, query string parameters and stage variables - e.g., `"method.request.header.SomeHeaderName,method.request.querystring.SomeQueryStringName,stageVariables.SomeStageVariableName"`
     * 
     */
    @OutputExport(name="identitySource", type=String.class, parameters={})
    private Output</* @Nullable */ String> identitySource;

    /**
     * @return The source of the identity in an incoming request. Defaults to `method.request.header.Authorization`. For `REQUEST` type, this may be a comma-separated list of values, including headers, query string parameters and stage variables - e.g., `"method.request.header.SomeHeaderName,method.request.querystring.SomeQueryStringName,stageVariables.SomeStageVariableName"`
     * 
     */
    public Output</* @Nullable */ String> getIdentitySource() {
        return this.identitySource;
    }
    /**
     * A validation expression for the incoming identity. For `TOKEN` type, this value should be a regular expression. The incoming token from the client is matched against this expression, and will proceed if the token matches. If the token doesn't match, the client receives a 401 Unauthorized response.
     * 
     */
    @OutputExport(name="identityValidationExpression", type=String.class, parameters={})
    private Output</* @Nullable */ String> identityValidationExpression;

    /**
     * @return A validation expression for the incoming identity. For `TOKEN` type, this value should be a regular expression. The incoming token from the client is matched against this expression, and will proceed if the token matches. If the token doesn't match, the client receives a 401 Unauthorized response.
     * 
     */
    public Output</* @Nullable */ String> getIdentityValidationExpression() {
        return this.identityValidationExpression;
    }
    /**
     * The name of the authorizer
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the authorizer
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A list of the Amazon Cognito user pool ARNs. Each element is of this format: `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}`.
     * 
     */
    @OutputExport(name="providerArns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> providerArns;

    /**
     * @return A list of the Amazon Cognito user pool ARNs. Each element is of this format: `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}`.
     * 
     */
    public Output</* @Nullable */ List<String>> getProviderArns() {
        return this.providerArns;
    }
    /**
     * The ID of the associated REST API
     * 
     */
    @OutputExport(name="restApi", type=String.class, parameters={})
    private Output<String> restApi;

    /**
     * @return The ID of the associated REST API
     * 
     */
    public Output<String> getRestApi() {
        return this.restApi;
    }
    /**
     * The type of the authorizer. Possible values are `TOKEN` for a Lambda function using a single authorization token submitted in a custom header, `REQUEST` for a Lambda function using incoming request parameters, or `COGNITO_USER_POOLS` for using an Amazon Cognito user pool. Defaults to `TOKEN`.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The type of the authorizer. Possible values are `TOKEN` for a Lambda function using a single authorization token submitted in a custom header, `REQUEST` for a Lambda function using incoming request parameters, or `COGNITO_USER_POOLS` for using an Amazon Cognito user pool. Defaults to `TOKEN`.
     * 
     */
    public Output</* @Nullable */ String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(AuthorizerArgs.Builder a);
    }
    private static io.pulumi.aws.apigateway.AuthorizerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.apigateway.AuthorizerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Authorizer(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Authorizer(String name) {
        this(name, AuthorizerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Authorizer(String name, AuthorizerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Authorizer(String name, AuthorizerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/authorizer:Authorizer", name, args == null ? AuthorizerArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Authorizer(String name, Output<String> id, @Nullable AuthorizerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/authorizer:Authorizer", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static Authorizer get(String name, Output<String> id, @Nullable AuthorizerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Authorizer(name, id, state, options);
    }
}
