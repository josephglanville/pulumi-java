// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.avs.WorkloadNetworkDnsServiceArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:avs:WorkloadNetworkDnsService")
public class WorkloadNetworkDnsService extends io.pulumi.resources.CustomResource {
    @OutputExport(name="defaultDnsZone", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultDnsZone;

    public Output</* @Nullable */ String> getDefaultDnsZone() {
        return this.defaultDnsZone;
    }
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    @OutputExport(name="dnsServiceIp", type=String.class, parameters={})
    private Output</* @Nullable */ String> dnsServiceIp;

    public Output</* @Nullable */ String> getDnsServiceIp() {
        return this.dnsServiceIp;
    }
    @OutputExport(name="fqdnZones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> fqdnZones;

    public Output</* @Nullable */ List<String>> getFqdnZones() {
        return this.fqdnZones;
    }
    @OutputExport(name="logLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> logLevel;

    public Output</* @Nullable */ String> getLogLevel() {
        return this.logLevel;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="revision", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> revision;

    public Output</* @Nullable */ Double> getRevision() {
        return this.revision;
    }
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public WorkloadNetworkDnsService(String name, WorkloadNetworkDnsServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:WorkloadNetworkDnsService", name, args == null ? WorkloadNetworkDnsServiceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WorkloadNetworkDnsService(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:WorkloadNetworkDnsService", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:avs/v20200717preview:WorkloadNetworkDnsService").build()),
                Input.of(Alias.builder().setType("azure-native:avs/v20210101preview:WorkloadNetworkDnsService").build()),
                Input.of(Alias.builder().setType("azure-native:avs/v20210601:WorkloadNetworkDnsService").build()),
                Input.of(Alias.builder().setType("azure-native:avs/v20211201:WorkloadNetworkDnsService").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static WorkloadNetworkDnsService get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WorkloadNetworkDnsService(name, id, options);
    }
}
