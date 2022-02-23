// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.customerinsights.RoleAssignmentArgs;
import io.pulumi.azurenative.customerinsights.outputs.AssignmentPrincipalResponse;
import io.pulumi.azurenative.customerinsights.outputs.ResourceSetDescriptionResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The Role Assignment resource format.
 * API Version: 2017-04-26.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:customerinsights:RoleAssignment azSdkTestHub/assignmentName8976 /subscriptions/c909e979-ef71-4def-a970-bc7c154db8c5/resourceGroups/TestHubRG/providers/Microsoft.CustomerInsights/hubs/azSdkTestHub/RoleAssignments/assignmentName8976 
 * ```
 * 
 */
@ResourceType(type="azure-native:customerinsights:RoleAssignment")
public class RoleAssignment extends io.pulumi.resources.CustomResource {
    /**
     * The name of the metadata object.
     * 
     */
    @OutputExport(name="assignmentName", type=String.class, parameters={})
    private Output<String> assignmentName;

    /**
     * @return The name of the metadata object.
     * 
     */
    public Output<String> getAssignmentName() {
        return this.assignmentName;
    }
    /**
     * Widget types set for the assignment.
     * 
     */
    @OutputExport(name="conflationPolicies", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> conflationPolicies;

    /**
     * @return Widget types set for the assignment.
     * 
     */
    public Output</* @Nullable */ ResourceSetDescriptionResponse> getConflationPolicies() {
        return this.conflationPolicies;
    }
    /**
     * Connectors set for the assignment.
     * 
     */
    @OutputExport(name="connectors", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> connectors;

    /**
     * @return Connectors set for the assignment.
     * 
     */
    public Output</* @Nullable */ ResourceSetDescriptionResponse> getConnectors() {
        return this.connectors;
    }
    /**
     * Localized description for the metadata.
     * 
     */
    @OutputExport(name="description", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> description;

    /**
     * @return Localized description for the metadata.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getDescription() {
        return this.description;
    }
    /**
     * Localized display names for the metadata.
     * 
     */
    @OutputExport(name="displayName", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> displayName;

    /**
     * @return Localized display names for the metadata.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getDisplayName() {
        return this.displayName;
    }
    /**
     * Interactions set for the assignment.
     * 
     */
    @OutputExport(name="interactions", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> interactions;

    /**
     * @return Interactions set for the assignment.
     * 
     */
    public Output</* @Nullable */ ResourceSetDescriptionResponse> getInteractions() {
        return this.interactions;
    }
    /**
     * Kpis set for the assignment.
     * 
     */
    @OutputExport(name="kpis", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> kpis;

    /**
     * @return Kpis set for the assignment.
     * 
     */
    public Output</* @Nullable */ ResourceSetDescriptionResponse> getKpis() {
        return this.kpis;
    }
    /**
     * Links set for the assignment.
     * 
     */
    @OutputExport(name="links", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> links;

    /**
     * @return Links set for the assignment.
     * 
     */
    public Output</* @Nullable */ ResourceSetDescriptionResponse> getLinks() {
        return this.links;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The principals being assigned to.
     * 
     */
    @OutputExport(name="principals", type=List.class, parameters={AssignmentPrincipalResponse.class})
    private Output<List<AssignmentPrincipalResponse>> principals;

    /**
     * @return The principals being assigned to.
     * 
     */
    public Output<List<AssignmentPrincipalResponse>> getPrincipals() {
        return this.principals;
    }
    /**
     * Profiles set for the assignment.
     * 
     */
    @OutputExport(name="profiles", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> profiles;

    /**
     * @return Profiles set for the assignment.
     * 
     */
    public Output</* @Nullable */ ResourceSetDescriptionResponse> getProfiles() {
        return this.profiles;
    }
    /**
     * Provisioning state.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The Role assignments set for the relationship links.
     * 
     */
    @OutputExport(name="relationshipLinks", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> relationshipLinks;

    /**
     * @return The Role assignments set for the relationship links.
     * 
     */
    public Output</* @Nullable */ ResourceSetDescriptionResponse> getRelationshipLinks() {
        return this.relationshipLinks;
    }
    /**
     * The Role assignments set for the relationships.
     * 
     */
    @OutputExport(name="relationships", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> relationships;

    /**
     * @return The Role assignments set for the relationships.
     * 
     */
    public Output</* @Nullable */ ResourceSetDescriptionResponse> getRelationships() {
        return this.relationships;
    }
    /**
     * Type of roles.
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return Type of roles.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }
    /**
     * The Role assignments set for the assignment.
     * 
     */
    @OutputExport(name="roleAssignments", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> roleAssignments;

    /**
     * @return The Role assignments set for the assignment.
     * 
     */
    public Output</* @Nullable */ ResourceSetDescriptionResponse> getRoleAssignments() {
        return this.roleAssignments;
    }
    /**
     * Sas Policies set for the assignment.
     * 
     */
    @OutputExport(name="sasPolicies", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> sasPolicies;

    /**
     * @return Sas Policies set for the assignment.
     * 
     */
    public Output</* @Nullable */ ResourceSetDescriptionResponse> getSasPolicies() {
        return this.sasPolicies;
    }
    /**
     * The Role assignments set for the assignment.
     * 
     */
    @OutputExport(name="segments", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> segments;

    /**
     * @return The Role assignments set for the assignment.
     * 
     */
    public Output</* @Nullable */ ResourceSetDescriptionResponse> getSegments() {
        return this.segments;
    }
    /**
     * The hub name.
     * 
     */
    @OutputExport(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    /**
     * @return The hub name.
     * 
     */
    public Output<String> getTenantId() {
        return this.tenantId;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Views set for the assignment.
     * 
     */
    @OutputExport(name="views", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> views;

    /**
     * @return Views set for the assignment.
     * 
     */
    public Output</* @Nullable */ ResourceSetDescriptionResponse> getViews() {
        return this.views;
    }
    /**
     * Widget types set for the assignment.
     * 
     */
    @OutputExport(name="widgetTypes", type=ResourceSetDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSetDescriptionResponse> widgetTypes;

    /**
     * @return Widget types set for the assignment.
     * 
     */
    public Output</* @Nullable */ ResourceSetDescriptionResponse> getWidgetTypes() {
        return this.widgetTypes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RoleAssignment(String name) {
        this(name, RoleAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RoleAssignment(String name, RoleAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RoleAssignment(String name, RoleAssignmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:customerinsights:RoleAssignment", name, args == null ? RoleAssignmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RoleAssignment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:customerinsights:RoleAssignment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:customerinsights/v20170101:RoleAssignment").build()),
                Input.of(Alias.builder().setType("azure-native:customerinsights/v20170426:RoleAssignment").build())
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
    public static RoleAssignment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RoleAssignment(name, id, options);
    }
}
