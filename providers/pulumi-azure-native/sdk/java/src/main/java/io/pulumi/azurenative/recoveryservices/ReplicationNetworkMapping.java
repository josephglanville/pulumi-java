// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.recoveryservices.ReplicationNetworkMappingArgs;
import io.pulumi.azurenative.recoveryservices.outputs.NetworkMappingPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Network Mapping model. Ideally it should have been possible to inherit this class from prev version in InheritedModels as long as there is no difference in structure or method signature. Since there were no base Models for certain fields and methods viz NetworkMappingProperties and Load with required return type, the class has been introduced in its entirety with references to base models to facilitate extensions in subsequent versions.
 * API Version: 2018-07-10.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:recoveryservices:ReplicationNetworkMapping corpe2amap /Subscriptions/9112a37f-0f3e-46ec-9c00-060c6edca071/resourceGroups/srcBvte2a14C27/providers/Microsoft.RecoveryServices/vaults/srce2avaultbvtaC27/replicationFabrics/b0cef6e9a4437b81803d0b55ada4f700ab66caae59c35d62723a1589c0cd13ac/replicationNetworks/e2267b5c-2650-49bd-ab3f-d66aae694c06/replicationNetworkMappings/corpe2amap 
 * ```
 * 
 */
@ResourceType(type="azure-native:recoveryservices:ReplicationNetworkMapping")
public class ReplicationNetworkMapping extends io.pulumi.resources.CustomResource {
    /**
     * Resource Location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource Location
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Resource Name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The Network Mapping Properties.
     * 
     */
    @Export(name="properties", type=NetworkMappingPropertiesResponse.class, parameters={})
    private Output<NetworkMappingPropertiesResponse> properties;

    /**
     * @return The Network Mapping Properties.
     * 
     */
    public Output<NetworkMappingPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Resource Type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource Type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReplicationNetworkMapping(String name) {
        this(name, ReplicationNetworkMappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReplicationNetworkMapping(String name, ReplicationNetworkMappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReplicationNetworkMapping(String name, ReplicationNetworkMappingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:ReplicationNetworkMapping", name, args == null ? ReplicationNetworkMappingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ReplicationNetworkMapping(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:ReplicationNetworkMapping", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20160810:ReplicationNetworkMapping").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20180110:ReplicationNetworkMapping").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20180710:ReplicationNetworkMapping").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210210:ReplicationNetworkMapping").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210301:ReplicationNetworkMapping").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210401:ReplicationNetworkMapping").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210601:ReplicationNetworkMapping").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210701:ReplicationNetworkMapping").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210801:ReplicationNetworkMapping").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20211001:ReplicationNetworkMapping").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20211101:ReplicationNetworkMapping").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20211201:ReplicationNetworkMapping").build())
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
    public static ReplicationNetworkMapping get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ReplicationNetworkMapping(name, id, options);
    }
}
