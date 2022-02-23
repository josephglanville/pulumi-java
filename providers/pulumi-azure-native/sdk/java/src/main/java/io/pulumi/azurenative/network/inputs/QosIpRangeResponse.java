// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Qos Traffic Profiler IP Range properties.
 * 
 */
public final class QosIpRangeResponse extends io.pulumi.resources.InvokeArgs {

    public static final QosIpRangeResponse Empty = new QosIpRangeResponse();

    /**
     * End IP Address.
     * 
     */
    @InputImport(name="endIP")
      private final @Nullable String endIP;

    public Optional<String> getEndIP() {
        return this.endIP == null ? Optional.empty() : Optional.ofNullable(this.endIP);
    }

    /**
     * Start IP Address.
     * 
     */
    @InputImport(name="startIP")
      private final @Nullable String startIP;

    public Optional<String> getStartIP() {
        return this.startIP == null ? Optional.empty() : Optional.ofNullable(this.startIP);
    }

    public QosIpRangeResponse(
        @Nullable String endIP,
        @Nullable String startIP) {
        this.endIP = endIP;
        this.startIP = startIP;
    }

    private QosIpRangeResponse() {
        this.endIP = null;
        this.startIP = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QosIpRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endIP;
        private @Nullable String startIP;

        public Builder() {
    	      // Empty
        }

        public Builder(QosIpRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endIP = defaults.endIP;
    	      this.startIP = defaults.startIP;
        }

        public Builder setEndIP(@Nullable String endIP) {
            this.endIP = endIP;
            return this;
        }

        public Builder setStartIP(@Nullable String startIP) {
            this.startIP = startIP;
            return this;
        }
        public QosIpRangeResponse build() {
            return new QosIpRangeResponse(endIP, startIP);
        }
    }
}
