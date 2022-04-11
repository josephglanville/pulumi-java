// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.apigateway.ModelArgs;
import io.pulumi.aws.apigateway.inputs.ModelState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Model for a REST API Gateway.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_api_gateway_model` can be imported using `REST-API-ID/NAME`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigateway/model:Model example 12345abcde/example
 * ```
 * 
 */
@ResourceType(type="aws:apigateway/model:Model")
public class Model extends io.pulumi.resources.CustomResource {
    /**
     * The content type of the model
     * 
     */
    @Export(name="contentType", type=String.class, parameters={})
    private Output<String> contentType;

    /**
     * @return The content type of the model
     * 
     */
    public Output<String> getContentType() {
        return this.contentType;
    }
    /**
     * The description of the model
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the model
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The name of the model
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the model
     * 
     */
    public Output<String> getName() {
        return this.name;
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
     * The schema of the model in a JSON form
     * 
     */
    @Export(name="schema", type=String.class, parameters={})
    private Output</* @Nullable */ String> schema;

    /**
     * @return The schema of the model in a JSON form
     * 
     */
    public Output</* @Nullable */ String> getSchema() {
        return this.schema;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Model(String name) {
        this(name, ModelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Model(String name, ModelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Model(String name, ModelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/model:Model", name, args == null ? ModelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Model(String name, Output<String> id, @Nullable ModelState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/model:Model", name, state, makeResourceOptions(options, id));
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
    public static Model get(String name, Output<String> id, @Nullable ModelState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Model(name, id, state, options);
    }
}
