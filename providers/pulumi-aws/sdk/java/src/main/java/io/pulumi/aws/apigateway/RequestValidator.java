// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.apigateway.RequestValidatorArgs;
import io.pulumi.aws.apigateway.inputs.RequestValidatorState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an API Gateway Request Validator.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_api_gateway_request_validator` can be imported using `REST-API-ID/REQUEST-VALIDATOR-ID`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigateway/requestValidator:RequestValidator example 12345abcde/67890fghij
 * ```
 * 
 */
@ResourceType(type="aws:apigateway/requestValidator:RequestValidator")
public class RequestValidator extends io.pulumi.resources.CustomResource {
    /**
     * The name of the request validator
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the request validator
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the associated Rest API
     * 
     */
    @OutputExport(name="restApi", type=String.class, parameters={})
    private Output<String> restApi;

    /**
     * @return The ID of the associated Rest API
     * 
     */
    public Output<String> getRestApi() {
        return this.restApi;
    }
    /**
     * Boolean whether to validate request body. Defaults to `false`.
     * 
     */
    @OutputExport(name="validateRequestBody", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> validateRequestBody;

    /**
     * @return Boolean whether to validate request body. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getValidateRequestBody() {
        return this.validateRequestBody;
    }
    /**
     * Boolean whether to validate request parameters. Defaults to `false`.
     * 
     */
    @OutputExport(name="validateRequestParameters", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> validateRequestParameters;

    /**
     * @return Boolean whether to validate request parameters. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getValidateRequestParameters() {
        return this.validateRequestParameters;
    }

    public interface BuilderApplicator {
        public void apply(RequestValidatorArgs.Builder a);
    }
    private static io.pulumi.aws.apigateway.RequestValidatorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.apigateway.RequestValidatorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RequestValidator(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RequestValidator(String name) {
        this(name, RequestValidatorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RequestValidator(String name, RequestValidatorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RequestValidator(String name, RequestValidatorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/requestValidator:RequestValidator", name, args == null ? RequestValidatorArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private RequestValidator(String name, Output<String> id, @Nullable RequestValidatorState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/requestValidator:RequestValidator", name, state, makeResourceOptions(options, id));
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
    public static RequestValidator get(String name, Output<String> id, @Nullable RequestValidatorState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RequestValidator(name, id, state, options);
    }
}
