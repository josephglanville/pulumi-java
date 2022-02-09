// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.portal.UserSettingsWithLocationArgs;
import io.pulumi.azurenative.portal.outputs.UserPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:portal:UserSettingsWithLocation")
public class UserSettingsWithLocation extends io.pulumi.resources.CustomResource {
    @OutputExport(name="properties", type=UserPropertiesResponse.class, parameters={})
    private Output<UserPropertiesResponse> properties;

    public Output<UserPropertiesResponse> getProperties() {
        return this.properties;
    }

    public UserSettingsWithLocation(String name, UserSettingsWithLocationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:portal:UserSettingsWithLocation", name, args == null ? UserSettingsWithLocationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private UserSettingsWithLocation(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:portal:UserSettingsWithLocation", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:portal/v20181001:UserSettingsWithLocation").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static UserSettingsWithLocation get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new UserSettingsWithLocation(name, id, options);
    }
}
