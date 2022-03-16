// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blockchain;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.blockchain.TransactionNodeArgs;
import io.pulumi.azurenative.blockchain.outputs.FirewallRuleResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Payload of the transaction node which is the request/response of the resource provider.
 * API Version: 2018-06-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:blockchain:TransactionNode txnode2 /subscriptions/51766542-3ed7-4a72-a187-0c8ab644ddab/resourceGroups/mygroup/providers/Microsoft.Blockchain/blockchainMembers/contosemember1/transactionNodes/txnode2 
 * ```
 * 
 */
@ResourceType(type="azure-native:blockchain:TransactionNode")
public class TransactionNode extends io.pulumi.resources.CustomResource {
    /**
     * Gets or sets the transaction node dns endpoint.
     * 
     */
    @Export(name="dns", type=String.class, parameters={})
    private Output<String> dns;

    /**
     * @return Gets or sets the transaction node dns endpoint.
     * 
     */
    public Output<String> getDns() {
        return this.dns;
    }
    /**
     * Gets or sets the firewall rules.
     * 
     */
    @Export(name="firewallRules", type=List.class, parameters={FirewallRuleResponse.class})
    private Output</* @Nullable */ List<FirewallRuleResponse>> firewallRules;

    /**
     * @return Gets or sets the firewall rules.
     * 
     */
    public Output</* @Nullable */ List<FirewallRuleResponse>> getFirewallRules() {
        return this.firewallRules;
    }
    /**
     * Gets or sets the transaction node location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Gets or sets the transaction node location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Sets the transaction node dns endpoint basic auth password.
     * 
     */
    @Export(name="password", type=String.class, parameters={})
    private Output</* @Nullable */ String> password;

    /**
     * @return Sets the transaction node dns endpoint basic auth password.
     * 
     */
    public Output</* @Nullable */ String> getPassword() {
        return this.password;
    }
    /**
     * Gets or sets the blockchain member provision state.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Gets or sets the blockchain member provision state.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Gets or sets the transaction node public key.
     * 
     */
    @Export(name="publicKey", type=String.class, parameters={})
    private Output<String> publicKey;

    /**
     * @return Gets or sets the transaction node public key.
     * 
     */
    public Output<String> getPublicKey() {
        return this.publicKey;
    }
    /**
     * The type of the service - e.g. "Microsoft.Blockchain"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the service - e.g. "Microsoft.Blockchain"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Gets or sets the transaction node dns endpoint basic auth user name.
     * 
     */
    @Export(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    /**
     * @return Gets or sets the transaction node dns endpoint basic auth user name.
     * 
     */
    public Output<String> getUserName() {
        return this.userName;
    }

    public interface BuilderApplicator {
        public void apply(TransactionNodeArgs.Builder a);
    }
    private static io.pulumi.azurenative.blockchain.TransactionNodeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.blockchain.TransactionNodeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public TransactionNode(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransactionNode(String name) {
        this(name, TransactionNodeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransactionNode(String name, TransactionNodeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransactionNode(String name, TransactionNodeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:blockchain:TransactionNode", name, args == null ? TransactionNodeArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private TransactionNode(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:blockchain:TransactionNode", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:blockchain/v20180601preview:TransactionNode").build())
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
    public static TransactionNode get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TransactionNode(name, id, options);
    }
}
