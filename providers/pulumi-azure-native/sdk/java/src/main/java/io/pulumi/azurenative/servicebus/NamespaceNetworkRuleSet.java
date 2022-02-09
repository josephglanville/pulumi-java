// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicebus.NamespaceNetworkRuleSetArgs;
import io.pulumi.azurenative.servicebus.outputs.NWRuleSetIpRulesResponse;
import io.pulumi.azurenative.servicebus.outputs.NWRuleSetVirtualNetworkRulesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:servicebus:NamespaceNetworkRuleSet")
public class NamespaceNetworkRuleSet extends io.pulumi.resources.CustomResource {
    @OutputExport(name="defaultAction", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultAction;

    public Output</* @Nullable */ String> getDefaultAction() {
        return this.defaultAction;
    }
    @OutputExport(name="ipRules", type=List.class, parameters={NWRuleSetIpRulesResponse.class})
    private Output</* @Nullable */ List<NWRuleSetIpRulesResponse>> ipRules;

    public Output</* @Nullable */ List<NWRuleSetIpRulesResponse>> getIpRules() {
        return this.ipRules;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="virtualNetworkRules", type=List.class, parameters={NWRuleSetVirtualNetworkRulesResponse.class})
    private Output</* @Nullable */ List<NWRuleSetVirtualNetworkRulesResponse>> virtualNetworkRules;

    public Output</* @Nullable */ List<NWRuleSetVirtualNetworkRulesResponse>> getVirtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    public NamespaceNetworkRuleSet(String name, NamespaceNetworkRuleSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicebus:NamespaceNetworkRuleSet", name, args == null ? NamespaceNetworkRuleSetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NamespaceNetworkRuleSet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicebus:NamespaceNetworkRuleSet", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:servicebus/v20170401:NamespaceNetworkRuleSet").build()),
                Input.of(Alias.builder().setType("azure-native:servicebus/v20180101preview:NamespaceNetworkRuleSet").build()),
                Input.of(Alias.builder().setType("azure-native:servicebus/v20210101preview:NamespaceNetworkRuleSet").build()),
                Input.of(Alias.builder().setType("azure-native:servicebus/v20210601preview:NamespaceNetworkRuleSet").build()),
                Input.of(Alias.builder().setType("azure-native:servicebus/v20211101:NamespaceNetworkRuleSet").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static NamespaceNetworkRuleSet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NamespaceNetworkRuleSet(name, id, options);
    }
}
