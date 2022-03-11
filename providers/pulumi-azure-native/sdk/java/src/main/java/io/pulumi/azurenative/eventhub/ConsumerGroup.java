// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventhub.ConsumerGroupArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Single item in List or Get Consumer group operation
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:eventhub:ConsumerGroup sdk-ConsumerGroup-5563 /subscriptions/5f750a97-50d9-4e36-8081-c9ee4c0210d4/resourceGroups/ArunMonocle/providers/Microsoft.EventHub/namespaces/sdk-Namespace-2661/eventhubs/sdk-EventHub-6681/consumergroups/sdk-ConsumerGroup-5563 
 * ```
 * 
 */
@ResourceType(type="azure-native:eventhub:ConsumerGroup")
public class ConsumerGroup extends io.pulumi.resources.CustomResource {
    /**
     * Exact time the message was created.
     * 
     */
    @OutputExport(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Exact time the message was created.
     * 
     */
    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The exact time the message was updated.
     * 
     */
    @OutputExport(name="updatedAt", type=String.class, parameters={})
    private Output<String> updatedAt;

    /**
     * @return The exact time the message was updated.
     * 
     */
    public Output<String> getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * User Metadata is a placeholder to store user-defined string data with maximum length 1024. e.g. it can be used to store descriptive data, such as list of teams and their contact information also user-defined configuration settings can be stored.
     * 
     */
    @OutputExport(name="userMetadata", type=String.class, parameters={})
    private Output</* @Nullable */ String> userMetadata;

    /**
     * @return User Metadata is a placeholder to store user-defined string data with maximum length 1024. e.g. it can be used to store descriptive data, such as list of teams and their contact information also user-defined configuration settings can be stored.
     * 
     */
    public Output</* @Nullable */ String> getUserMetadata() {
        return this.userMetadata;
    }

    public interface BuilderApplicator {
        public void apply(ConsumerGroupArgs.Builder a);
    }
    private static io.pulumi.azurenative.eventhub.ConsumerGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.eventhub.ConsumerGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ConsumerGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConsumerGroup(String name) {
        this(name, ConsumerGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConsumerGroup(String name, ConsumerGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConsumerGroup(String name, ConsumerGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:ConsumerGroup", name, args == null ? ConsumerGroupArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ConsumerGroup(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:ConsumerGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:eventhub/v20140901:ConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:eventhub/v20150801:ConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:eventhub/v20170401:ConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:eventhub/v20180101preview:ConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:eventhub/v20210101preview:ConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:eventhub/v20210601preview:ConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:eventhub/v20211101:ConsumerGroup").build())
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
    public static ConsumerGroup get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConsumerGroup(name, id, options);
    }
}
