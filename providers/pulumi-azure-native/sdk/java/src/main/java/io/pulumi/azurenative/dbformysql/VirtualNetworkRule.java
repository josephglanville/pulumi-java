// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dbformysql.VirtualNetworkRuleArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:dbformysql:VirtualNetworkRule")
public class VirtualNetworkRule extends io.pulumi.resources.CustomResource {
    @OutputExport(name="ignoreMissingVnetServiceEndpoint", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ignoreMissingVnetServiceEndpoint;

    public Output</* @Nullable */ Boolean> getIgnoreMissingVnetServiceEndpoint() {
        return this.ignoreMissingVnetServiceEndpoint;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> getState() {
        return this.state;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="virtualNetworkSubnetId", type=String.class, parameters={})
    private Output<String> virtualNetworkSubnetId;

    public Output<String> getVirtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId;
    }

    public VirtualNetworkRule(String name, VirtualNetworkRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbformysql:VirtualNetworkRule", name, args == null ? VirtualNetworkRuleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VirtualNetworkRule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbformysql:VirtualNetworkRule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:dbformysql/v20171201:VirtualNetworkRule").build()),
                Input.of(Alias.builder().setType("azure-native:dbformysql/v20171201preview:VirtualNetworkRule").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static VirtualNetworkRule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualNetworkRule(name, id, options);
    }
}
