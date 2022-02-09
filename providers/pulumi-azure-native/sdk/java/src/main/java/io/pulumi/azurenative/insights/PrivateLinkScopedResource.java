// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.PrivateLinkScopedResourceArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:insights:PrivateLinkScopedResource")
public class PrivateLinkScopedResource extends io.pulumi.resources.CustomResource {
    @OutputExport(name="linkedResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> linkedResourceId;

    public Output</* @Nullable */ String> getLinkedResourceId() {
        return this.linkedResourceId;
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
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public PrivateLinkScopedResource(String name, PrivateLinkScopedResourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:PrivateLinkScopedResource", name, args == null ? PrivateLinkScopedResourceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PrivateLinkScopedResource(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:PrivateLinkScopedResource", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:insights/v20191017preview:PrivateLinkScopedResource").build()),
                Input.of(Alias.builder().setType("azure-native:insights/v20210701preview:PrivateLinkScopedResource").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PrivateLinkScopedResource get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateLinkScopedResource(name, id, options);
    }
}
