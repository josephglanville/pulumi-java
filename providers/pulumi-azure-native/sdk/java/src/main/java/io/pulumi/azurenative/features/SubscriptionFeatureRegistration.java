// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.features;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.features.SubscriptionFeatureRegistrationArgs;
import io.pulumi.azurenative.features.outputs.SubscriptionFeatureRegistrationResponseProperties;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:features:SubscriptionFeatureRegistration")
public class SubscriptionFeatureRegistration extends io.pulumi.resources.CustomResource {
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="properties", type=SubscriptionFeatureRegistrationResponseProperties.class, parameters={})
    private Output<SubscriptionFeatureRegistrationResponseProperties> properties;

    public Output<SubscriptionFeatureRegistrationResponseProperties> getProperties() {
        return this.properties;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public SubscriptionFeatureRegistration(String name, SubscriptionFeatureRegistrationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:features:SubscriptionFeatureRegistration", name, args == null ? SubscriptionFeatureRegistrationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SubscriptionFeatureRegistration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:features:SubscriptionFeatureRegistration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:features/v20210701:SubscriptionFeatureRegistration").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static SubscriptionFeatureRegistration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SubscriptionFeatureRegistration(name, id, options);
    }
}
