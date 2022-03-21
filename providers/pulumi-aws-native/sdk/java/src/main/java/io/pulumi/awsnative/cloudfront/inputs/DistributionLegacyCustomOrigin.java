// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionLegacyCustomOrigin extends io.pulumi.resources.InvokeArgs {

    public static final DistributionLegacyCustomOrigin Empty = new DistributionLegacyCustomOrigin();

    @Import(name="dNSName", required=true)
      private final String dNSName;

    public String getDNSName() {
        return this.dNSName;
    }

    @Import(name="hTTPPort")
      private final @Nullable Integer hTTPPort;

    public Optional<Integer> getHTTPPort() {
        return this.hTTPPort == null ? Optional.empty() : Optional.ofNullable(this.hTTPPort);
    }

    @Import(name="hTTPSPort")
      private final @Nullable Integer hTTPSPort;

    public Optional<Integer> getHTTPSPort() {
        return this.hTTPSPort == null ? Optional.empty() : Optional.ofNullable(this.hTTPSPort);
    }

    @Import(name="originProtocolPolicy", required=true)
      private final String originProtocolPolicy;

    public String getOriginProtocolPolicy() {
        return this.originProtocolPolicy;
    }

    @Import(name="originSSLProtocols", required=true)
      private final List<String> originSSLProtocols;

    public List<String> getOriginSSLProtocols() {
        return this.originSSLProtocols;
    }

    public DistributionLegacyCustomOrigin(
        String dNSName,
        @Nullable Integer hTTPPort,
        @Nullable Integer hTTPSPort,
        String originProtocolPolicy,
        List<String> originSSLProtocols) {
        this.dNSName = Objects.requireNonNull(dNSName, "expected parameter 'dNSName' to be non-null");
        this.hTTPPort = hTTPPort;
        this.hTTPSPort = hTTPSPort;
        this.originProtocolPolicy = Objects.requireNonNull(originProtocolPolicy, "expected parameter 'originProtocolPolicy' to be non-null");
        this.originSSLProtocols = Objects.requireNonNull(originSSLProtocols, "expected parameter 'originSSLProtocols' to be non-null");
    }

    private DistributionLegacyCustomOrigin() {
        this.dNSName = null;
        this.hTTPPort = null;
        this.hTTPSPort = null;
        this.originProtocolPolicy = null;
        this.originSSLProtocols = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionLegacyCustomOrigin defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dNSName;
        private @Nullable Integer hTTPPort;
        private @Nullable Integer hTTPSPort;
        private String originProtocolPolicy;
        private List<String> originSSLProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionLegacyCustomOrigin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dNSName = defaults.dNSName;
    	      this.hTTPPort = defaults.hTTPPort;
    	      this.hTTPSPort = defaults.hTTPSPort;
    	      this.originProtocolPolicy = defaults.originProtocolPolicy;
    	      this.originSSLProtocols = defaults.originSSLProtocols;
        }

        public Builder dNSName(String dNSName) {
            this.dNSName = Objects.requireNonNull(dNSName);
            return this;
        }
        public Builder hTTPPort(@Nullable Integer hTTPPort) {
            this.hTTPPort = hTTPPort;
            return this;
        }
        public Builder hTTPSPort(@Nullable Integer hTTPSPort) {
            this.hTTPSPort = hTTPSPort;
            return this;
        }
        public Builder originProtocolPolicy(String originProtocolPolicy) {
            this.originProtocolPolicy = Objects.requireNonNull(originProtocolPolicy);
            return this;
        }
        public Builder originSSLProtocols(List<String> originSSLProtocols) {
            this.originSSLProtocols = Objects.requireNonNull(originSSLProtocols);
            return this;
        }
        public Builder originSSLProtocols(String... originSSLProtocols) {
            return originSSLProtocols(List.of(originSSLProtocols));
        }        public DistributionLegacyCustomOrigin build() {
            return new DistributionLegacyCustomOrigin(dNSName, hTTPPort, hTTPSPort, originProtocolPolicy, originSSLProtocols);
        }
    }
}
