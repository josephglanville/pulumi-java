// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dbformysql.VirtualNetworkRuleArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A virtual network rule.
 * API Version: 2017-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:dbformysql:VirtualNetworkRule vnet-firewall-rule /subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/TestGroup/providers/Microsoft.DBforMySQL/servers/vnet-test-svr/virtualNetworkRules/vnet-firewall-rule 
 * ```
 * 
 */
@ResourceType(type="azure-native:dbformysql:VirtualNetworkRule")
public class VirtualNetworkRule extends io.pulumi.resources.CustomResource {
    /**
     * Create firewall rule before the virtual network has vnet service endpoint enabled.
     * 
     */
    @Export(name="ignoreMissingVnetServiceEndpoint", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ignoreMissingVnetServiceEndpoint;

    /**
     * @return Create firewall rule before the virtual network has vnet service endpoint enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getIgnoreMissingVnetServiceEndpoint() {
        return this.ignoreMissingVnetServiceEndpoint;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Virtual Network Rule State
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Virtual Network Rule State
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The ARM resource id of the virtual network subnet.
     * 
     */
    @Export(name="virtualNetworkSubnetId", type=String.class, parameters={})
    private Output<String> virtualNetworkSubnetId;

    /**
     * @return The ARM resource id of the virtual network subnet.
     * 
     */
    public Output<String> getVirtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId;
    }

    public interface BuilderApplicator {
        public void apply(VirtualNetworkRuleArgs.Builder a);
    }
    private static io.pulumi.azurenative.dbformysql.VirtualNetworkRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.dbformysql.VirtualNetworkRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VirtualNetworkRule(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualNetworkRule(String name) {
        this(name, VirtualNetworkRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualNetworkRule(String name, VirtualNetworkRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualNetworkRule(String name, VirtualNetworkRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbformysql:VirtualNetworkRule", name, args == null ? VirtualNetworkRuleArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VirtualNetworkRule(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbformysql:VirtualNetworkRule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:dbformysql/v20171201:VirtualNetworkRule").build()),
                Output.of(Alias.builder().type("azure-native:dbformysql/v20171201preview:VirtualNetworkRule").build())
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
    public static VirtualNetworkRule get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualNetworkRule(name, id, options);
    }
}
