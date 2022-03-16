// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dbformysql.FirewallRuleArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a server firewall rule.
 * API Version: 2017-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:dbformysql:FirewallRule rule1 /subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/TestGroup/providers/Microsoft.DBforMySQL/servers/testserver/firewallRules/rule1 
 * ```
 * 
 */
@ResourceType(type="azure-native:dbformysql:FirewallRule")
public class FirewallRule extends io.pulumi.resources.CustomResource {
    /**
     * The end IP address of the server firewall rule. Must be IPv4 format.
     * 
     */
    @Export(name="endIpAddress", type=String.class, parameters={})
    private Output<String> endIpAddress;

    /**
     * @return The end IP address of the server firewall rule. Must be IPv4 format.
     * 
     */
    public Output<String> getEndIpAddress() {
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
     * The start IP address of the server firewall rule. Must be IPv4 format.
     * 
     */
    @Export(name="startIpAddress", type=String.class, parameters={})
    private Output<String> startIpAddress;

    /**
     * @return The start IP address of the server firewall rule. Must be IPv4 format.
     * 
     */
    public Output<String> getStartIpAddress() {
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
        public void apply(FirewallRuleArgs.Builder a);
    }
    private static io.pulumi.azurenative.dbformysql.FirewallRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.dbformysql.FirewallRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public FirewallRule(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallRule(String name) {
        this(name, FirewallRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallRule(String name, FirewallRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallRule(String name, FirewallRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbformysql:FirewallRule", name, args == null ? FirewallRuleArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private FirewallRule(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbformysql:FirewallRule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:dbformysql/v20171201:FirewallRule").build()),
                Output.of(Alias.builder().type("azure-native:dbformysql/v20171201preview:FirewallRule").build())
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
    public static FirewallRule get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FirewallRule(name, id, options);
    }
}
