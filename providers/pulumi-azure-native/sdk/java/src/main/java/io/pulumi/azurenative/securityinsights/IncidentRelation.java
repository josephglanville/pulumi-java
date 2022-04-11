// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.IncidentRelationArgs;
import io.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a relation between two resources
 * API Version: 2021-03-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:securityinsights:IncidentRelation 4bb36b7b-26ff-4d1c-9cbe-0d8ab3da0014 /subscriptions/d0cfe6b2-9ac0-4464-9919-dccaee2e48c0/resourceGroups/myRg/providers/Microsoft.OperationalIinsights/workspaces/myWorkspace/providers/Microsoft.SecurityInsights/incidents/afbd324f-6c48-459c-8710-8d1e1cd03812/relations/4bb36b7b-26ff-4d1c-9cbe-0d8ab3da0014 
 * ```
 * 
 */
@ResourceType(type="azure-native:securityinsights:IncidentRelation")
public class IncidentRelation extends io.pulumi.resources.CustomResource {
    /**
     * Etag of the azure resource
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Etag of the azure resource
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The resource ID of the related resource
     * 
     */
    @Export(name="relatedResourceId", type=String.class, parameters={})
    private Output<String> relatedResourceId;

    /**
     * @return The resource ID of the related resource
     * 
     */
    public Output<String> getRelatedResourceId() {
        return this.relatedResourceId;
    }
    /**
     * The resource kind of the related resource
     * 
     */
    @Export(name="relatedResourceKind", type=String.class, parameters={})
    private Output<String> relatedResourceKind;

    /**
     * @return The resource kind of the related resource
     * 
     */
    public Output<String> getRelatedResourceKind() {
        return this.relatedResourceKind;
    }
    /**
     * The name of the related resource
     * 
     */
    @Export(name="relatedResourceName", type=String.class, parameters={})
    private Output<String> relatedResourceName;

    /**
     * @return The name of the related resource
     * 
     */
    public Output<String> getRelatedResourceName() {
        return this.relatedResourceName;
    }
    /**
     * The resource type of the related resource
     * 
     */
    @Export(name="relatedResourceType", type=String.class, parameters={})
    private Output<String> relatedResourceType;

    /**
     * @return The resource type of the related resource
     * 
     */
    public Output<String> getRelatedResourceType() {
        return this.relatedResourceType;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IncidentRelation(String name) {
        this(name, IncidentRelationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IncidentRelation(String name, IncidentRelationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IncidentRelation(String name, IncidentRelationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:IncidentRelation", name, args == null ? IncidentRelationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IncidentRelation(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:IncidentRelation", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:securityinsights/v20190101preview:IncidentRelation").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210301preview:IncidentRelation").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210401:IncidentRelation").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210901preview:IncidentRelation").build())
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
    public static IncidentRelation get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IncidentRelation(name, id, options);
    }
}
