// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.apigatewayv2.DeploymentArgs;
import io.pulumi.aws.apigatewayv2.inputs.DeploymentState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an Amazon API Gateway Version 2 deployment.
 * More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).
 * 
 * > **Note:** Creating a deployment for an API requires at least one `aws.apigatewayv2.Route` resource associated with that API. To avoid race conditions when all resources are being created together, you need to add implicit resource references via the `triggers` argument or explicit resource references using the [resource `dependsOn` meta-argument](https://www.pulumi.com/docs/intro/concepts/programming-model/#dependson).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_apigatewayv2_deployment` can be imported by using the API identifier and deployment identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigatewayv2/deployment:Deployment example aabbccddee/1122334
 * ```
 * 
 *  The `triggers` argument cannot be imported.
 * 
 */
@ResourceType(type="aws:apigatewayv2/deployment:Deployment")
public class Deployment extends io.pulumi.resources.CustomResource {
    /**
     * The API identifier.
     * 
     */
    @Export(name="apiId", type=String.class, parameters={})
    private Output<String> apiId;

    /**
     * @return The API identifier.
     * 
     */
    public Output<String> getApiId() {
        return this.apiId;
    }
    /**
     * Whether the deployment was automatically released.
     * 
     */
    @Export(name="autoDeployed", type=Boolean.class, parameters={})
    private Output<Boolean> autoDeployed;

    /**
     * @return Whether the deployment was automatically released.
     * 
     */
    public Output<Boolean> getAutoDeployed() {
        return this.autoDeployed;
    }
    /**
     * The description for the deployment resource. Must be less than or equal to 1024 characters in length.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description for the deployment resource. Must be less than or equal to 1024 characters in length.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * A map of arbitrary keys and values that, when changed, will trigger a redeployment.
     * 
     */
    @Export(name="triggers", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> triggers;

    /**
     * @return A map of arbitrary keys and values that, when changed, will trigger a redeployment.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTriggers() {
        return this.triggers;
    }

    public interface BuilderApplicator {
        public void apply(DeploymentArgs.Builder a);
    }
    private static io.pulumi.aws.apigatewayv2.DeploymentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.apigatewayv2.DeploymentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Deployment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Deployment(String name) {
        this(name, DeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Deployment(String name, DeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Deployment(String name, DeploymentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/deployment:Deployment", name, args == null ? DeploymentArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Deployment(String name, Output<String> id, @Nullable DeploymentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/deployment:Deployment", name, state, makeResourceOptions(options, id));
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
    public static Deployment get(String name, Output<String> id, @Nullable DeploymentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Deployment(name, id, state, options);
    }
}
