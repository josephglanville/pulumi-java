// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicediscovery.inputs;

import io.pulumi.aws.servicediscovery.inputs.ServiceDnsConfigDnsRecordArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceDnsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceDnsConfigArgs Empty = new ServiceDnsConfigArgs();

    /**
     * An array that contains one DnsRecord object for each resource record set.
     * 
     */
    @Import(name="dnsRecords", required=true)
      private final Output<List<ServiceDnsConfigDnsRecordArgs>> dnsRecords;

    public Output<List<ServiceDnsConfigDnsRecordArgs>> getDnsRecords() {
        return this.dnsRecords;
    }

    /**
     * The ID of the namespace to use for DNS configuration.
     * 
     */
    @Import(name="namespaceId", required=true)
      private final Output<String> namespaceId;

    public Output<String> getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * The routing policy that you want to apply to all records that Route 53 creates when you register an instance and specify the service. Valid Values: MULTIVALUE, WEIGHTED
     * 
     */
    @Import(name="routingPolicy")
      private final @Nullable Output<String> routingPolicy;

    public Output<String> getRoutingPolicy() {
        return this.routingPolicy == null ? Output.empty() : this.routingPolicy;
    }

    public ServiceDnsConfigArgs(
        Output<List<ServiceDnsConfigDnsRecordArgs>> dnsRecords,
        Output<String> namespaceId,
        @Nullable Output<String> routingPolicy) {
        this.dnsRecords = Objects.requireNonNull(dnsRecords, "expected parameter 'dnsRecords' to be non-null");
        this.namespaceId = Objects.requireNonNull(namespaceId, "expected parameter 'namespaceId' to be non-null");
        this.routingPolicy = routingPolicy;
    }

    private ServiceDnsConfigArgs() {
        this.dnsRecords = Output.empty();
        this.namespaceId = Output.empty();
        this.routingPolicy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceDnsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<ServiceDnsConfigDnsRecordArgs>> dnsRecords;
        private Output<String> namespaceId;
        private @Nullable Output<String> routingPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceDnsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsRecords = defaults.dnsRecords;
    	      this.namespaceId = defaults.namespaceId;
    	      this.routingPolicy = defaults.routingPolicy;
        }

        public Builder dnsRecords(Output<List<ServiceDnsConfigDnsRecordArgs>> dnsRecords) {
            this.dnsRecords = Objects.requireNonNull(dnsRecords);
            return this;
        }
        public Builder dnsRecords(List<ServiceDnsConfigDnsRecordArgs> dnsRecords) {
            this.dnsRecords = Output.of(Objects.requireNonNull(dnsRecords));
            return this;
        }
        public Builder dnsRecords(ServiceDnsConfigDnsRecordArgs... dnsRecords) {
            return dnsRecords(List.of(dnsRecords));
        }
        public Builder namespaceId(Output<String> namespaceId) {
            this.namespaceId = Objects.requireNonNull(namespaceId);
            return this;
        }
        public Builder namespaceId(String namespaceId) {
            this.namespaceId = Output.of(Objects.requireNonNull(namespaceId));
            return this;
        }
        public Builder routingPolicy(@Nullable Output<String> routingPolicy) {
            this.routingPolicy = routingPolicy;
            return this;
        }
        public Builder routingPolicy(@Nullable String routingPolicy) {
            this.routingPolicy = Output.ofNullable(routingPolicy);
            return this;
        }        public ServiceDnsConfigArgs build() {
            return new ServiceDnsConfigArgs(dnsRecords, namespaceId, routingPolicy);
        }
    }
}