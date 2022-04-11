// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.relay;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.relay.WCFRelayArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Description of the WCF relay resource.
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:relay:WCFRelay example-Relay-Wcf-1194 /subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/resourcegroup/providers/Microsoft.Relay/namespaces/example-RelayNamespace-9953/WcfRelays/example-Relay-Wcf-1194 
 * ```
 * 
 */
@ResourceType(type="azure-native:relay:WCFRelay")
public class WCFRelay extends io.pulumi.resources.CustomResource {
    /**
     * The time the WCF relay was created.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The time the WCF relay was created.
     * 
     */
    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Returns true if the relay is dynamic; otherwise, false.
     * 
     */
    @Export(name="isDynamic", type=Boolean.class, parameters={})
    private Output<Boolean> isDynamic;

    /**
     * @return Returns true if the relay is dynamic; otherwise, false.
     * 
     */
    public Output<Boolean> getIsDynamic() {
        return this.isDynamic;
    }
    /**
     * The number of listeners for this relay. Note that min :1 and max:25 are supported.
     * 
     */
    @Export(name="listenerCount", type=Integer.class, parameters={})
    private Output<Integer> listenerCount;

    /**
     * @return The number of listeners for this relay. Note that min :1 and max:25 are supported.
     * 
     */
    public Output<Integer> getListenerCount() {
        return this.listenerCount;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * WCF relay type.
     * 
     */
    @Export(name="relayType", type=String.class, parameters={})
    private Output</* @Nullable */ String> relayType;

    /**
     * @return WCF relay type.
     * 
     */
    public Output</* @Nullable */ String> getRelayType() {
        return this.relayType;
    }
    /**
     * Returns true if client authorization is needed for this relay; otherwise, false.
     * 
     */
    @Export(name="requiresClientAuthorization", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> requiresClientAuthorization;

    /**
     * @return Returns true if client authorization is needed for this relay; otherwise, false.
     * 
     */
    public Output</* @Nullable */ Boolean> getRequiresClientAuthorization() {
        return this.requiresClientAuthorization;
    }
    /**
     * Returns true if transport security is needed for this relay; otherwise, false.
     * 
     */
    @Export(name="requiresTransportSecurity", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> requiresTransportSecurity;

    /**
     * @return Returns true if transport security is needed for this relay; otherwise, false.
     * 
     */
    public Output</* @Nullable */ Boolean> getRequiresTransportSecurity() {
        return this.requiresTransportSecurity;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The time the namespace was updated.
     * 
     */
    @Export(name="updatedAt", type=String.class, parameters={})
    private Output<String> updatedAt;

    /**
     * @return The time the namespace was updated.
     * 
     */
    public Output<String> getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * The usermetadata is a placeholder to store user-defined string data for the WCF Relay endpoint. For example, it can be used to store descriptive data, such as list of teams and their contact information. Also, user-defined configuration settings can be stored.
     * 
     */
    @Export(name="userMetadata", type=String.class, parameters={})
    private Output</* @Nullable */ String> userMetadata;

    /**
     * @return The usermetadata is a placeholder to store user-defined string data for the WCF Relay endpoint. For example, it can be used to store descriptive data, such as list of teams and their contact information. Also, user-defined configuration settings can be stored.
     * 
     */
    public Output</* @Nullable */ String> getUserMetadata() {
        return this.userMetadata;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WCFRelay(String name) {
        this(name, WCFRelayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WCFRelay(String name, WCFRelayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WCFRelay(String name, WCFRelayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:relay:WCFRelay", name, args == null ? WCFRelayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WCFRelay(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:relay:WCFRelay", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:relay/v20160701:WCFRelay").build()),
                Output.of(Alias.builder().type("azure-native:relay/v20170401:WCFRelay").build())
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
    public static WCFRelay get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WCFRelay(name, id, options);
    }
}
