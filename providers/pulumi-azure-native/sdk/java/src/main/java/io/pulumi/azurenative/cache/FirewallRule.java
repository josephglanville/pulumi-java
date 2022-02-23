// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cache.FirewallRuleArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A firewall rule on a redis cache has a name, and describes a contiguous range of IP addresses permitted to connect
 * API Version: 2020-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:cache:FirewallRule cache1/rule1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Cache/Redis/cache1/firewallRules/rule1 
 * ```
 * 
 */
@ResourceType(type="azure-native:cache:FirewallRule")
public class FirewallRule extends io.pulumi.resources.CustomResource {
    /**
     * highest IP address included in the range
     * 
     */
    @OutputExport(name="endIP", type=String.class, parameters={})
    private Output<String> endIP;

    /**
     * @return highest IP address included in the range
     * 
     */
    public Output<String> getEndIP() {
        return this.endIP;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * lowest IP address included in the range
     * 
     */
    @OutputExport(name="startIP", type=String.class, parameters={})
    private Output<String> startIP;

    /**
     * @return lowest IP address included in the range
     * 
     */
    public Output<String> getStartIP() {
        return this.startIP;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
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
        super("azure-native:cache:FirewallRule", name, args == null ? FirewallRuleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FirewallRule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cache:FirewallRule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:cache/v20160401:FirewallRule").build()),
                Input.of(Alias.builder().setType("azure-native:cache/v20170201:FirewallRule").build()),
                Input.of(Alias.builder().setType("azure-native:cache/v20171001:FirewallRule").build()),
                Input.of(Alias.builder().setType("azure-native:cache/v20180301:FirewallRule").build()),
                Input.of(Alias.builder().setType("azure-native:cache/v20190701:FirewallRule").build()),
                Input.of(Alias.builder().setType("azure-native:cache/v20200601:FirewallRule").build()),
                Input.of(Alias.builder().setType("azure-native:cache/v20201201:FirewallRule").build()),
                Input.of(Alias.builder().setType("azure-native:cache/v20210601:FirewallRule").build())
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
    public static FirewallRule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FirewallRule(name, id, options);
    }
}
