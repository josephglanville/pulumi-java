// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storage.ObjectReplicationPolicyArgs;
import io.pulumi.azurenative.storage.outputs.ObjectReplicationPolicyRuleResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The replication policy between two storage accounts. Multiple rules can be defined in one policy.
 * API Version: 2021-02-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storage:ObjectReplicationPolicy 2a20bb73-5717-4635-985a-5d4cf777438f /subscriptions/{subscription-id}/resourceGroups/res7687/providers/Microsoft.Storage/storageAccounts/src1122/objectReplicationPolicies/2a20bb73-5717-4635-985a-5d4cf777438f 
 * ```
 * 
 */
@ResourceType(type="azure-native:storage:ObjectReplicationPolicy")
public class ObjectReplicationPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Required. Destination account name.
     * 
     */
    @Export(name="destinationAccount", type=String.class, parameters={})
    private Output<String> destinationAccount;

    /**
     * @return Required. Destination account name.
     * 
     */
    public Output<String> getDestinationAccount() {
        return this.destinationAccount;
    }
    /**
     * Indicates when the policy is enabled on the source account.
     * 
     */
    @Export(name="enabledTime", type=String.class, parameters={})
    private Output<String> enabledTime;

    /**
     * @return Indicates when the policy is enabled on the source account.
     * 
     */
    public Output<String> getEnabledTime() {
        return this.enabledTime;
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
     * A unique id for object replication policy.
     * 
     */
    @Export(name="policyId", type=String.class, parameters={})
    private Output<String> policyId;

    /**
     * @return A unique id for object replication policy.
     * 
     */
    public Output<String> getPolicyId() {
        return this.policyId;
    }
    /**
     * The storage account object replication rules.
     * 
     */
    @Export(name="rules", type=List.class, parameters={ObjectReplicationPolicyRuleResponse.class})
    private Output</* @Nullable */ List<ObjectReplicationPolicyRuleResponse>> rules;

    /**
     * @return The storage account object replication rules.
     * 
     */
    public Output</* @Nullable */ List<ObjectReplicationPolicyRuleResponse>> getRules() {
        return this.rules;
    }
    /**
     * Required. Source account name.
     * 
     */
    @Export(name="sourceAccount", type=String.class, parameters={})
    private Output<String> sourceAccount;

    /**
     * @return Required. Source account name.
     * 
     */
    public Output<String> getSourceAccount() {
        return this.sourceAccount;
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
        public void apply(ObjectReplicationPolicyArgs.Builder a);
    }
    private static io.pulumi.azurenative.storage.ObjectReplicationPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.storage.ObjectReplicationPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ObjectReplicationPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ObjectReplicationPolicy(String name) {
        this(name, ObjectReplicationPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ObjectReplicationPolicy(String name, ObjectReplicationPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ObjectReplicationPolicy(String name, ObjectReplicationPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:ObjectReplicationPolicy", name, args == null ? ObjectReplicationPolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ObjectReplicationPolicy(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:ObjectReplicationPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:storage/v20190601:ObjectReplicationPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20200801preview:ObjectReplicationPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210101:ObjectReplicationPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210201:ObjectReplicationPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210401:ObjectReplicationPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210601:ObjectReplicationPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210801:ObjectReplicationPolicy").build())
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
    public static ObjectReplicationPolicy get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ObjectReplicationPolicy(name, id, options);
    }
}
