// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.labservices.UserArgs;
import io.pulumi.azurenative.labservices.outputs.LatestOperationResultResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:labservices:User")
public class User extends io.pulumi.resources.CustomResource {
    @OutputExport(name="email", type=String.class, parameters={})
    private Output<String> email;

    public Output<String> getEmail() {
        return this.email;
    }
    @OutputExport(name="familyName", type=String.class, parameters={})
    private Output<String> familyName;

    public Output<String> getFamilyName() {
        return this.familyName;
    }
    @OutputExport(name="givenName", type=String.class, parameters={})
    private Output<String> givenName;

    public Output<String> getGivenName() {
        return this.givenName;
    }
    @OutputExport(name="latestOperationResult", type=LatestOperationResultResponse.class, parameters={})
    private Output<LatestOperationResultResponse> latestOperationResult;

    public Output<LatestOperationResultResponse> getLatestOperationResult() {
        return this.latestOperationResult;
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
    private Output</* @Nullable */ String> provisioningState;

    public Output</* @Nullable */ String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    public Output<String> getTenantId() {
        return this.tenantId;
    }
    @OutputExport(name="totalUsage", type=String.class, parameters={})
    private Output<String> totalUsage;

    public Output<String> getTotalUsage() {
        return this.totalUsage;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="uniqueIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> uniqueIdentifier;

    public Output</* @Nullable */ String> getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    public User(String name, UserArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:labservices:User", name, args == null ? UserArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private User(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:labservices:User", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:labservices/v20181015:User").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static User get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new User(name, id, options);
    }
}
