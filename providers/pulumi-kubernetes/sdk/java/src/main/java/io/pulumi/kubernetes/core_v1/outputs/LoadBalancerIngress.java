// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.PortStatus;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LoadBalancerIngress {
    private final @Nullable String hostname;
    private final @Nullable String ip;
    private final @Nullable List<PortStatus> ports;

    @OutputCustomType.Constructor({"hostname","ip","ports"})
    private LoadBalancerIngress(
        @Nullable String hostname,
        @Nullable String ip,
        @Nullable List<PortStatus> ports) {
        this.hostname = hostname;
        this.ip = ip;
        this.ports = ports;
    }

    public Optional<String> getHostname() {
        return Optional.ofNullable(this.hostname);
    }
    public Optional<String> getIp() {
        return Optional.ofNullable(this.ip);
    }
    public List<PortStatus> getPorts() {
        return this.ports == null ? List.of() : this.ports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerIngress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostname;
        private @Nullable String ip;
        private @Nullable List<PortStatus> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerIngress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.ip = defaults.ip;
    	      this.ports = defaults.ports;
        }

        public Builder setHostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }

        public Builder setIp(@Nullable String ip) {
            this.ip = ip;
            return this;
        }

        public Builder setPorts(@Nullable List<PortStatus> ports) {
            this.ports = ports;
            return this;
        }

        public LoadBalancerIngress build() {
            return new LoadBalancerIngress(hostname, ip, ports);
        }
    }
}