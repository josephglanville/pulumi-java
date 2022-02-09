// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devtestlab.EnvironmentArgs;
import io.pulumi.azurenative.devtestlab.outputs.EnvironmentDeploymentPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:devtestlab:Environment")
public class Environment extends io.pulumi.resources.CustomResource {
    @OutputExport(name="armTemplateDisplayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> armTemplateDisplayName;

    public Output</* @Nullable */ String> getArmTemplateDisplayName() {
        return this.armTemplateDisplayName;
    }
    @OutputExport(name="createdByUser", type=String.class, parameters={})
    private Output<String> createdByUser;

    public Output<String> getCreatedByUser() {
        return this.createdByUser;
    }
    @OutputExport(name="deploymentProperties", type=EnvironmentDeploymentPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ EnvironmentDeploymentPropertiesResponse> deploymentProperties;

    public Output</* @Nullable */ EnvironmentDeploymentPropertiesResponse> getDeploymentProperties() {
        return this.deploymentProperties;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="resourceGroupId", type=String.class, parameters={})
    private Output<String> resourceGroupId;

    public Output<String> getResourceGroupId() {
        return this.resourceGroupId;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="uniqueIdentifier", type=String.class, parameters={})
    private Output<String> uniqueIdentifier;

    public Output<String> getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    public Environment(String name, EnvironmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devtestlab:Environment", name, args == null ? EnvironmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Environment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devtestlab:Environment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:devtestlab/v20160515:Environment").build()),
                Input.of(Alias.builder().setType("azure-native:devtestlab/v20180915:Environment").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Environment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Environment(name, id, options);
    }
}
