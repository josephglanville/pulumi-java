// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CniConfigResponse {
    private final String podSubnet;
    private final String serviceSubnet;
    private final String type;
    private final String version;

    @OutputCustomType.Constructor({"podSubnet","serviceSubnet","type","version"})
    private CniConfigResponse(
        String podSubnet,
        String serviceSubnet,
        String type,
        String version) {
        this.podSubnet = Objects.requireNonNull(podSubnet);
        this.serviceSubnet = Objects.requireNonNull(serviceSubnet);
        this.type = Objects.requireNonNull(type);
        this.version = Objects.requireNonNull(version);
    }

    public String getPodSubnet() {
        return this.podSubnet;
    }
    public String getServiceSubnet() {
        return this.serviceSubnet;
    }
    public String getType() {
        return this.type;
    }
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CniConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String podSubnet;
        private String serviceSubnet;
        private String type;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(CniConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.podSubnet = defaults.podSubnet;
    	      this.serviceSubnet = defaults.serviceSubnet;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setPodSubnet(String podSubnet) {
            this.podSubnet = Objects.requireNonNull(podSubnet);
            return this;
        }

        public Builder setServiceSubnet(String serviceSubnet) {
            this.serviceSubnet = Objects.requireNonNull(serviceSubnet);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public CniConfigResponse build() {
            return new CniConfigResponse(podSubnet, serviceSubnet, type, version);
        }
    }
}
