// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.avs.WorkloadNetworkDnsServiceArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * NSX DNS Service
 * API Version: 2020-07-17-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:avs:WorkloadNetworkDnsService dnsService1 /subscriptions/{subscription-id}/resourceGroups/group1/providers/Microsoft.AVS/privateClouds/cloud1/workloadNetworks/default/dnsServices/dnsService1 
 * ```
 * 
 */
@ResourceType(type="azure-native:avs:WorkloadNetworkDnsService")
public class WorkloadNetworkDnsService extends io.pulumi.resources.CustomResource {
    /**
     * Default DNS zone of the DNS Service.
     * 
     */
    @OutputExport(name="defaultDnsZone", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultDnsZone;

    /**
     * @return Default DNS zone of the DNS Service.
     * 
     */
    public Output</* @Nullable */ String> getDefaultDnsZone() {
        return this.defaultDnsZone;
    }
    /**
     * Display name of the DNS Service.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Display name of the DNS Service.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * DNS service IP of the DNS Service.
     * 
     */
    @OutputExport(name="dnsServiceIp", type=String.class, parameters={})
    private Output</* @Nullable */ String> dnsServiceIp;

    /**
     * @return DNS service IP of the DNS Service.
     * 
     */
    public Output</* @Nullable */ String> getDnsServiceIp() {
        return this.dnsServiceIp;
    }
    /**
     * FQDN zones of the DNS Service.
     * 
     */
    @OutputExport(name="fqdnZones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> fqdnZones;

    /**
     * @return FQDN zones of the DNS Service.
     * 
     */
    public Output</* @Nullable */ List<String>> getFqdnZones() {
        return this.fqdnZones;
    }
    /**
     * DNS Service log level.
     * 
     */
    @OutputExport(name="logLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> logLevel;

    /**
     * @return DNS Service log level.
     * 
     */
    public Output</* @Nullable */ String> getLogLevel() {
        return this.logLevel;
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
     * The provisioning state
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * NSX revision number.
     * 
     */
    @OutputExport(name="revision", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> revision;

    /**
     * @return NSX revision number.
     * 
     */
    public Output</* @Nullable */ Double> getRevision() {
        return this.revision;
    }
    /**
     * DNS Service status.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return DNS Service status.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
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

    public interface BuilderApplicator {
        public void apply(WorkloadNetworkDnsServiceArgs.Builder a);
    }
    private static io.pulumi.azurenative.avs.WorkloadNetworkDnsServiceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.avs.WorkloadNetworkDnsServiceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public WorkloadNetworkDnsService(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkloadNetworkDnsService(String name) {
        this(name, WorkloadNetworkDnsServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkloadNetworkDnsService(String name, WorkloadNetworkDnsServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkloadNetworkDnsService(String name, WorkloadNetworkDnsServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:WorkloadNetworkDnsService", name, args == null ? WorkloadNetworkDnsServiceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private WorkloadNetworkDnsService(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:WorkloadNetworkDnsService", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:avs/v20200717preview:WorkloadNetworkDnsService").build()),
                Output.of(Alias.builder().setType("azure-native:avs/v20210101preview:WorkloadNetworkDnsService").build()),
                Output.of(Alias.builder().setType("azure-native:avs/v20210601:WorkloadNetworkDnsService").build()),
                Output.of(Alias.builder().setType("azure-native:avs/v20211201:WorkloadNetworkDnsService").build())
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
    public static WorkloadNetworkDnsService get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WorkloadNetworkDnsService(name, id, options);
    }
}
