// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.policyinsights.RemediationAtManagementGroupArgs;
import io.pulumi.azurenative.policyinsights.outputs.RemediationDeploymentSummaryResponse;
import io.pulumi.azurenative.policyinsights.outputs.RemediationFiltersResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:policyinsights:RemediationAtManagementGroup")
public class RemediationAtManagementGroup extends io.pulumi.resources.CustomResource {
    @OutputExport(name="createdOn", type=String.class, parameters={})
    private Output<String> createdOn;

    public Output<String> getCreatedOn() {
        return this.createdOn;
    }
    @OutputExport(name="deploymentStatus", type=RemediationDeploymentSummaryResponse.class, parameters={})
    private Output<RemediationDeploymentSummaryResponse> deploymentStatus;

    public Output<RemediationDeploymentSummaryResponse> getDeploymentStatus() {
        return this.deploymentStatus;
    }
    @OutputExport(name="filters", type=RemediationFiltersResponse.class, parameters={})
    private Output</* @Nullable */ RemediationFiltersResponse> filters;

    public Output</* @Nullable */ RemediationFiltersResponse> getFilters() {
        return this.filters;
    }
    @OutputExport(name="lastUpdatedOn", type=String.class, parameters={})
    private Output<String> lastUpdatedOn;

    public Output<String> getLastUpdatedOn() {
        return this.lastUpdatedOn;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="policyAssignmentId", type=String.class, parameters={})
    private Output</* @Nullable */ String> policyAssignmentId;

    public Output</* @Nullable */ String> getPolicyAssignmentId() {
        return this.policyAssignmentId;
    }
    @OutputExport(name="policyDefinitionReferenceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> policyDefinitionReferenceId;

    public Output</* @Nullable */ String> getPolicyDefinitionReferenceId() {
        return this.policyDefinitionReferenceId;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="resourceDiscoveryMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceDiscoveryMode;

    public Output</* @Nullable */ String> getResourceDiscoveryMode() {
        return this.resourceDiscoveryMode;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public RemediationAtManagementGroup(String name, RemediationAtManagementGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:policyinsights:RemediationAtManagementGroup", name, args == null ? RemediationAtManagementGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RemediationAtManagementGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:policyinsights:RemediationAtManagementGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:policyinsights/v20180701preview:RemediationAtManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:policyinsights/v20190701:RemediationAtManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:policyinsights/v20211001:RemediationAtManagementGroup").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static RemediationAtManagementGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RemediationAtManagementGroup(name, id, options);
    }
}
