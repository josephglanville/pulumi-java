// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.WorkflowAccessKeyArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * API Version: 2015-02-01-preview.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:logic:WorkflowAccessKey myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/workflows/{workflowName}/accessKeys/{accessKeyName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:logic:WorkflowAccessKey")
public class WorkflowAccessKey extends io.pulumi.resources.CustomResource {
    /**
     * Gets the workflow access key name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets the workflow access key name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Gets or sets the not-after time.
     * 
     */
    @OutputExport(name="notAfter", type=String.class, parameters={})
    private Output</* @Nullable */ String> notAfter;

    /**
     * @return Gets or sets the not-after time.
     * 
     */
    public Output</* @Nullable */ String> getNotAfter() {
        return this.notAfter;
    }
    /**
     * Gets or sets the not-before time.
     * 
     */
    @OutputExport(name="notBefore", type=String.class, parameters={})
    private Output</* @Nullable */ String> notBefore;

    /**
     * @return Gets or sets the not-before time.
     * 
     */
    public Output</* @Nullable */ String> getNotBefore() {
        return this.notBefore;
    }
    /**
     * Gets the workflow access key type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Gets the workflow access key type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkflowAccessKey(String name) {
        this(name, WorkflowAccessKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkflowAccessKey(String name, WorkflowAccessKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkflowAccessKey(String name, WorkflowAccessKeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:WorkflowAccessKey", name, args == null ? WorkflowAccessKeyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WorkflowAccessKey(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:WorkflowAccessKey", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:logic/v20150201preview:WorkflowAccessKey").build())
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
    public static WorkflowAccessKey get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WorkflowAccessKey(name, id, options);
    }
}
