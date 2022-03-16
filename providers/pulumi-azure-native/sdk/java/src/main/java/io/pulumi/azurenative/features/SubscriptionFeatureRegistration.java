// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.features;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.features.SubscriptionFeatureRegistrationArgs;
import io.pulumi.azurenative.features.outputs.SubscriptionFeatureRegistrationResponseProperties;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Subscription feature registration details
 * API Version: 2021-07-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:features:SubscriptionFeatureRegistration testFeature /subscriptions/00000000-1111-2222-3333-444444444444/providers/Microsoft.Features/featureProviders/Microsoft.TestRP/subscriptionFeatureRegistrations/testFeature 
 * ```
 * 
 */
@ResourceType(type="azure-native:features:SubscriptionFeatureRegistration")
public class SubscriptionFeatureRegistration extends io.pulumi.resources.CustomResource {
    /**
     * Azure resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @Export(name="properties", type=SubscriptionFeatureRegistrationResponseProperties.class, parameters={})
    private Output<SubscriptionFeatureRegistrationResponseProperties> properties;

    public Output<SubscriptionFeatureRegistrationResponseProperties> getProperties() {
        return this.properties;
    }
    /**
     * Azure resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(SubscriptionFeatureRegistrationArgs.Builder a);
    }
    private static io.pulumi.azurenative.features.SubscriptionFeatureRegistrationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.features.SubscriptionFeatureRegistrationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SubscriptionFeatureRegistration(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SubscriptionFeatureRegistration(String name) {
        this(name, SubscriptionFeatureRegistrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SubscriptionFeatureRegistration(String name, SubscriptionFeatureRegistrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SubscriptionFeatureRegistration(String name, SubscriptionFeatureRegistrationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:features:SubscriptionFeatureRegistration", name, args == null ? SubscriptionFeatureRegistrationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private SubscriptionFeatureRegistration(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:features:SubscriptionFeatureRegistration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:features/v20210701:SubscriptionFeatureRegistration").build())
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
    public static SubscriptionFeatureRegistration get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SubscriptionFeatureRegistration(name, id, options);
    }
}
