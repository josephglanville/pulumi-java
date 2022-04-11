// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devops;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devops.PipelineArgs;
import io.pulumi.azurenative.devops.outputs.BootstrapConfigurationResponse;
import io.pulumi.azurenative.devops.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Pipeline used to configure Continuous Integration (CI) & Continuous Delivery (CD) for Azure resources.
 * API Version: 2020-07-13-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:devops:Pipeline myAspNetWebAppPipeline /subscriptions/{subscriptionId}/resourceGroups/myAspNetWebAppPipeline-rg/providers/Microsoft.DevOps/pipelines/myAspNetWebAppPipeline 
 * ```
 * 
 */
@ResourceType(type="azure-native:devops:Pipeline")
public class Pipeline extends io.pulumi.resources.CustomResource {
    /**
     * Configuration used to bootstrap the Pipeline.
     * 
     */
    @Export(name="bootstrapConfiguration", type=BootstrapConfigurationResponse.class, parameters={})
    private Output<BootstrapConfigurationResponse> bootstrapConfiguration;

    /**
     * @return Configuration used to bootstrap the Pipeline.
     * 
     */
    public Output<BootstrapConfigurationResponse> getBootstrapConfiguration() {
        return this.bootstrapConfiguration;
    }
    /**
     * Resource Location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource Location
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Resource Name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Unique identifier of the Pipeline
     * 
     */
    @Export(name="pipelineId", type=Integer.class, parameters={})
    private Output<Integer> pipelineId;

    /**
     * @return Unique identifier of the Pipeline
     * 
     */
    public Output<Integer> getPipelineId() {
        return this.pipelineId;
    }
    /**
     * Specifies which CI/CD provider to use. Valid options are 'azurePipeline', 'githubWorkflow'.
     * 
     */
    @Export(name="pipelineType", type=String.class, parameters={})
    private Output<String> pipelineType;

    /**
     * @return Specifies which CI/CD provider to use. Valid options are 'azurePipeline', 'githubWorkflow'.
     * 
     */
    public Output<String> getPipelineType() {
        return this.pipelineType;
    }
    /**
     * The system metadata pertaining to this resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata pertaining to this resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource Tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource Tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource Type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource Type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Pipeline(String name) {
        this(name, PipelineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Pipeline(String name, PipelineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pipeline(String name, PipelineArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devops:Pipeline", name, args == null ? PipelineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Pipeline(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devops:Pipeline", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:devops/v20190701preview:Pipeline").build()),
                Output.of(Alias.builder().type("azure-native:devops/v20200713preview:Pipeline").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Pipeline get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Pipeline(name, id, options);
    }
}
