// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.deploymentmanager_alpha.CompositeTypeArgs;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.CompositeTypeLabelEntryResponse;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.OperationResponse;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.TemplateContentsResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a composite type.
 * 
 */
@ResourceType(type="google-native:deploymentmanager/alpha:CompositeType")
public class CompositeType extends io.pulumi.resources.CustomResource {
    /**
     * An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="insertTime", type=String.class, parameters={})
    private Output<String> insertTime;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getInsertTime() {
        return this.insertTime;
    }
    /**
     * Map of labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
     * 
     */
    @Export(name="labels", type=List.class, parameters={CompositeTypeLabelEntryResponse.class})
    private Output<List<CompositeTypeLabelEntryResponse>> labels;

    /**
     * @return Map of labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
     * 
     */
    public Output<List<CompositeTypeLabelEntryResponse>> getLabels() {
        return this.labels;
    }
    /**
     * Name of the composite type, must follow the expression: `[a-z]([-a-z0-9_.]{0,61}[a-z0-9])?`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the composite type, must follow the expression: `[a-z]([-a-z0-9_.]{0,61}[a-z0-9])?`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The Operation that most recently ran, or is currently running, on this composite type.
     * 
     */
    @Export(name="operation", type=OperationResponse.class, parameters={})
    private Output<OperationResponse> operation;

    /**
     * @return The Operation that most recently ran, or is currently running, on this composite type.
     * 
     */
    public Output<OperationResponse> getOperation() {
        return this.operation;
    }
    /**
     * Server defined URL for the resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server defined URL for the resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Files for the template type.
     * 
     */
    @Export(name="templateContents", type=TemplateContentsResponse.class, parameters={})
    private Output<TemplateContentsResponse> templateContents;

    /**
     * @return Files for the template type.
     * 
     */
    public Output<TemplateContentsResponse> getTemplateContents() {
        return this.templateContents;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CompositeType(String name) {
        this(name, CompositeTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CompositeType(String name, @Nullable CompositeTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CompositeType(String name, @Nullable CompositeTypeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:deploymentmanager/alpha:CompositeType", name, args == null ? CompositeTypeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CompositeType(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:deploymentmanager/alpha:CompositeType", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CompositeType get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CompositeType(name, id, options);
    }
}
