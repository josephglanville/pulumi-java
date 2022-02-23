// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dataflow_v1b3.TemplateArgs;
import io.pulumi.googlenative.dataflow_v1b3.outputs.RuntimeMetadataResponse;
import io.pulumi.googlenative.dataflow_v1b3.outputs.StatusResponse;
import io.pulumi.googlenative.dataflow_v1b3.outputs.TemplateMetadataResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a Cloud Dataflow job from a template.
 * Auto-naming is currently not supported for this resource.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:dataflow/v1b3:Template")
public class Template extends io.pulumi.resources.CustomResource {
    /**
     * The template metadata describing the template name, available parameters, etc.
     * 
     */
    @OutputExport(name="metadata", type=TemplateMetadataResponse.class, parameters={})
    private Output<TemplateMetadataResponse> metadata;

    /**
     * @return The template metadata describing the template name, available parameters, etc.
     * 
     */
    public Output<TemplateMetadataResponse> getMetadata() {
        return this.metadata;
    }
    /**
     * Describes the runtime metadata with SDKInfo and available parameters.
     * 
     */
    @OutputExport(name="runtimeMetadata", type=RuntimeMetadataResponse.class, parameters={})
    private Output<RuntimeMetadataResponse> runtimeMetadata;

    /**
     * @return Describes the runtime metadata with SDKInfo and available parameters.
     * 
     */
    public Output<RuntimeMetadataResponse> getRuntimeMetadata() {
        return this.runtimeMetadata;
    }
    /**
     * The status of the get template request. Any problems with the request will be indicated in the error_details.
     * 
     */
    @OutputExport(name="status", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> status;

    /**
     * @return The status of the get template request. Any problems with the request will be indicated in the error_details.
     * 
     */
    public Output<StatusResponse> getStatus() {
        return this.status;
    }
    /**
     * Template Type.
     * 
     */
    @OutputExport(name="templateType", type=String.class, parameters={})
    private Output<String> templateType;

    /**
     * @return Template Type.
     * 
     */
    public Output<String> getTemplateType() {
        return this.templateType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Template(String name) {
        this(name, TemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Template(String name, TemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Template(String name, TemplateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataflow/v1b3:Template", name, args == null ? TemplateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Template(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataflow/v1b3:Template", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Template get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Template(name, id, options);
    }
}
