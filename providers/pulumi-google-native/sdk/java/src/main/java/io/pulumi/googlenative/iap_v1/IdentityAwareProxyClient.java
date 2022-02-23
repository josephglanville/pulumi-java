// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iap_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.iap_v1.IdentityAwareProxyClientArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates an Identity Aware Proxy (IAP) OAuth client. The client is owned by IAP. Requires that the brand for the project exists and that it is set for internal-only use.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:iap/v1:IdentityAwareProxyClient")
public class IdentityAwareProxyClient extends io.pulumi.resources.CustomResource {
    /**
     * Human-friendly name given to the OAuth client.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Human-friendly name given to the OAuth client.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Unique identifier of the OAuth client.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Unique identifier of the OAuth client.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Client secret of the OAuth client.
     * 
     */
    @OutputExport(name="secret", type=String.class, parameters={})
    private Output<String> secret;

    /**
     * @return Client secret of the OAuth client.
     * 
     */
    public Output<String> getSecret() {
        return this.secret;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IdentityAwareProxyClient(String name) {
        this(name, IdentityAwareProxyClientArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IdentityAwareProxyClient(String name, IdentityAwareProxyClientArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IdentityAwareProxyClient(String name, IdentityAwareProxyClientArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:iap/v1:IdentityAwareProxyClient", name, args == null ? IdentityAwareProxyClientArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IdentityAwareProxyClient(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:iap/v1:IdentityAwareProxyClient", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static IdentityAwareProxyClient get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IdentityAwareProxyClient(name, id, options);
    }
}
