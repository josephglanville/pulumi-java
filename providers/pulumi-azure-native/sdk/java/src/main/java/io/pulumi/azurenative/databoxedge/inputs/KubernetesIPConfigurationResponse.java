// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Kubernetes node IP configuration
 * 
 */
public final class KubernetesIPConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final KubernetesIPConfigurationResponse Empty = new KubernetesIPConfigurationResponse();

    /**
     * IP address of the Kubernetes node.
     * 
     */
    @InputImport(name="ipAddress")
      private final @Nullable String ipAddress;

    public Optional<String> getIpAddress() {
        return this.ipAddress == null ? Optional.empty() : Optional.ofNullable(this.ipAddress);
    }

    /**
     * Port of the Kubernetes node.
     * 
     */
    @InputImport(name="port", required=true)
      private final String port;

    public String getPort() {
        return this.port;
    }

    public KubernetesIPConfigurationResponse(
        @Nullable String ipAddress,
        String port) {
        this.ipAddress = ipAddress;
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private KubernetesIPConfigurationResponse() {
        this.ipAddress = null;
        this.port = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipAddress;
        private String port;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesIPConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.port = defaults.port;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setPort(String port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public KubernetesIPConfigurationResponse build() {
            return new KubernetesIPConfigurationResponse(ipAddress, port);
        }
    }
}
