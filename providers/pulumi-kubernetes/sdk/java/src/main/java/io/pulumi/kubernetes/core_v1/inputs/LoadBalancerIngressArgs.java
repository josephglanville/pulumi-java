// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.core_v1.inputs.PortStatusArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended for the service should be sent to an ingress point.
 * 
 */
public final class LoadBalancerIngressArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerIngressArgs Empty = new LoadBalancerIngressArgs();

    /**
     * Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers)
     * 
     */
    @Import(name="hostname")
      private final @Nullable Output<String> hostname;

    public Output<String> getHostname() {
        return this.hostname == null ? Codegen.empty() : this.hostname;
    }

    /**
     * IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers)
     * 
     */
    @Import(name="ip")
      private final @Nullable Output<String> ip;

    public Output<String> getIp() {
        return this.ip == null ? Codegen.empty() : this.ip;
    }

    /**
     * Ports is a list of records of service ports If used, every port defined in the service should have an entry in it
     * 
     */
    @Import(name="ports")
      private final @Nullable Output<List<PortStatusArgs>> ports;

    public Output<List<PortStatusArgs>> getPorts() {
        return this.ports == null ? Codegen.empty() : this.ports;
    }

    public LoadBalancerIngressArgs(
        @Nullable Output<String> hostname,
        @Nullable Output<String> ip,
        @Nullable Output<List<PortStatusArgs>> ports) {
        this.hostname = hostname;
        this.ip = ip;
        this.ports = ports;
    }

    private LoadBalancerIngressArgs() {
        this.hostname = Codegen.empty();
        this.ip = Codegen.empty();
        this.ports = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerIngressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> hostname;
        private @Nullable Output<String> ip;
        private @Nullable Output<List<PortStatusArgs>> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerIngressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.ip = defaults.ip;
    	      this.ports = defaults.ports;
        }

        public Builder hostname(@Nullable Output<String> hostname) {
            this.hostname = hostname;
            return this;
        }
        public Builder hostname(@Nullable String hostname) {
            this.hostname = Codegen.ofNullable(hostname);
            return this;
        }
        public Builder ip(@Nullable Output<String> ip) {
            this.ip = ip;
            return this;
        }
        public Builder ip(@Nullable String ip) {
            this.ip = Codegen.ofNullable(ip);
            return this;
        }
        public Builder ports(@Nullable Output<List<PortStatusArgs>> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(@Nullable List<PortStatusArgs> ports) {
            this.ports = Codegen.ofNullable(ports);
            return this;
        }
        public Builder ports(PortStatusArgs... ports) {
            return ports(List.of(ports));
        }        public LoadBalancerIngressArgs build() {
            return new LoadBalancerIngressArgs(hostname, ip, ports);
        }
    }
}
