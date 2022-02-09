// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blockchain;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.blockchain.TransactionNodeArgs;
import io.pulumi.azurenative.blockchain.outputs.FirewallRuleResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:blockchain:TransactionNode")
public class TransactionNode extends io.pulumi.resources.CustomResource {
    @OutputExport(name="dns", type=String.class, parameters={})
    private Output<String> dns;

    public Output<String> getDns() {
        return this.dns;
    }
    @OutputExport(name="firewallRules", type=List.class, parameters={FirewallRuleResponse.class})
    private Output</* @Nullable */ List<FirewallRuleResponse>> firewallRules;

    public Output</* @Nullable */ List<FirewallRuleResponse>> getFirewallRules() {
        return this.firewallRules;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="password", type=String.class, parameters={})
    private Output</* @Nullable */ String> password;

    public Output</* @Nullable */ String> getPassword() {
        return this.password;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="publicKey", type=String.class, parameters={})
    private Output<String> publicKey;

    public Output<String> getPublicKey() {
        return this.publicKey;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    public Output<String> getUserName() {
        return this.userName;
    }

    public TransactionNode(String name, TransactionNodeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:blockchain:TransactionNode", name, args == null ? TransactionNodeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TransactionNode(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:blockchain:TransactionNode", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:blockchain/v20180601preview:TransactionNode").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static TransactionNode get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TransactionNode(name, id, options);
    }
}
