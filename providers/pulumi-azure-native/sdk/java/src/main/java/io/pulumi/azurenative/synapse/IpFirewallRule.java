// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.synapse.IpFirewallRuleArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * IP firewall rule
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:synapse:IpFirewallRule ExampleIpFirewallRule /subscriptions/01234567-89ab-4def-0123-456789abcdef/resourceGroups/ExampleResourceGroup/providers/Microsoft.Synapse/workspaces/ExampleWorkspace/firewallRules/ExampleIpFirewallRule 
 * ```
 * 
 */
@ResourceType(type="azure-native:synapse:IpFirewallRule")
public class IpFirewallRule extends io.pulumi.resources.CustomResource {
    /**
     * The end IP address of the firewall rule. Must be IPv4 format. Must be greater than or equal to startIpAddress
     * 
     */
    @Export(name="endIpAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> endIpAddress;

    /**
     * @return The end IP address of the firewall rule. Must be IPv4 format. Must be greater than or equal to startIpAddress
     * 
     */
    public Output</* @Nullable */ String> getEndIpAddress() {
        return this.endIpAddress;
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
     * Resource provisioning state
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Resource provisioning state
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The start IP address of the firewall rule. Must be IPv4 format
     * 
     */
    @Export(name="startIpAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> startIpAddress;

    /**
     * @return The start IP address of the firewall rule. Must be IPv4 format
     * 
     */
    public Output</* @Nullable */ String> getStartIpAddress() {
        return this.startIpAddress;
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

    public interface BuilderApplicator {
        public void apply(IpFirewallRuleArgs.Builder a);
    }
    private static io.pulumi.azurenative.synapse.IpFirewallRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.synapse.IpFirewallRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public IpFirewallRule(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IpFirewallRule(String name) {
        this(name, IpFirewallRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IpFirewallRule(String name, IpFirewallRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IpFirewallRule(String name, IpFirewallRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:IpFirewallRule", name, args == null ? IpFirewallRuleArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private IpFirewallRule(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:IpFirewallRule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:synapse/v20190601preview:IpFirewallRule").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20201201:IpFirewallRule").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210301:IpFirewallRule").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210401preview:IpFirewallRule").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210501:IpFirewallRule").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210601:IpFirewallRule").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210601preview:IpFirewallRule").build())
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
    public static IpFirewallRule get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IpFirewallRule(name, id, options);
    }
}
