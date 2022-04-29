// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataScience;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.DataScience.ModelDeploymentArgs;
import com.pulumi.oci.DataScience.inputs.ModelDeploymentState;
import com.pulumi.oci.DataScience.outputs.ModelDeploymentCategoryLogDetails;
import com.pulumi.oci.DataScience.outputs.ModelDeploymentModelDeploymentConfigurationDetails;
import com.pulumi.oci.Utilities;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This resource provides the Model Deployment resource in Oracle Cloud Infrastructure Datascience service.
 * 
 * Creates a new model deployment.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ModelDeployments can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:DataScience/modelDeployment:ModelDeployment test_model_deployment &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:DataScience/modelDeployment:ModelDeployment")
public class ModelDeployment extends com.pulumi.resources.CustomResource {
    /**
     * (Updatable) The log details for each category.
     * 
     */
    @Export(name="categoryLogDetails", type=ModelDeploymentCategoryLogDetails.class, parameters={})
    private Output<ModelDeploymentCategoryLogDetails> categoryLogDetails;

    /**
     * @return (Updatable) The log details for each category.
     * 
     */
    public Output<ModelDeploymentCategoryLogDetails> categoryLogDetails() {
        return this.categoryLogDetails;
    }
    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the model deployment.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the model deployment.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the model deployment.
     * 
     */
    @Export(name="createdBy", type=String.class, parameters={})
    private Output<String> createdBy;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the model deployment.
     * 
     */
    public Output<String> createdBy() {
        return this.createdBy;
    }
    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
    }
    /**
     * (Updatable) A short description of the model deployment.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return (Updatable) A short description of the model deployment.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * (Updatable) A user-friendly display name for the resource. Does not have to be unique, and can be modified. Avoid entering confidential information. Example: `My ModelDeployment`
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return (Updatable) A user-friendly display name for the resource. Does not have to be unique, and can be modified. Avoid entering confidential information. Example: `My ModelDeployment`
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Export(name="freeformTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Output<Map<String,Object>> freeformTags() {
        return this.freeformTags;
    }
    /**
     * Details about the state of the model deployment.
     * 
     */
    @Export(name="lifecycleDetails", type=String.class, parameters={})
    private Output<String> lifecycleDetails;

    /**
     * @return Details about the state of the model deployment.
     * 
     */
    public Output<String> lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * (Updatable) The model deployment configuration details.
     * 
     */
    @Export(name="modelDeploymentConfigurationDetails", type=ModelDeploymentModelDeploymentConfigurationDetails.class, parameters={})
    private Output<ModelDeploymentModelDeploymentConfigurationDetails> modelDeploymentConfigurationDetails;

    /**
     * @return (Updatable) The model deployment configuration details.
     * 
     */
    public Output<ModelDeploymentModelDeploymentConfigurationDetails> modelDeploymentConfigurationDetails() {
        return this.modelDeploymentConfigurationDetails;
    }
    /**
     * The URL to interact with the model deployment.
     * 
     */
    @Export(name="modelDeploymentUrl", type=String.class, parameters={})
    private Output<String> modelDeploymentUrl;

    /**
     * @return The URL to interact with the model deployment.
     * 
     */
    public Output<String> modelDeploymentUrl() {
        return this.modelDeploymentUrl;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project to associate with the model deployment.
     * 
     */
    @Export(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project to associate with the model deployment.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * The state of the model deployment.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the model deployment.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The date and time the resource was created, in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2019-08-25T21:10:29.41Z
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The date and time the resource was created, in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2019-08-25T21:10:29.41Z
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ModelDeployment(String name) {
        this(name, ModelDeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ModelDeployment(String name, ModelDeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ModelDeployment(String name, ModelDeploymentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:DataScience/modelDeployment:ModelDeployment", name, args == null ? ModelDeploymentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ModelDeployment(String name, Output<String> id, @Nullable ModelDeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:DataScience/modelDeployment:ModelDeployment", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static ModelDeployment get(String name, Output<String> id, @Nullable ModelDeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ModelDeployment(name, id, state, options);
    }
}
