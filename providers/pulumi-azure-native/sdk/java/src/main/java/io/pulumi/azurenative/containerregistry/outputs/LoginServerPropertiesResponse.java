// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.TlsPropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LoginServerPropertiesResponse {
    private final String host;
    private final TlsPropertiesResponse tls;

    @OutputCustomType.Constructor({"host","tls"})
    private LoginServerPropertiesResponse(
        String host,
        TlsPropertiesResponse tls) {
        this.host = Objects.requireNonNull(host);
        this.tls = Objects.requireNonNull(tls);
    }

    public String getHost() {
        return this.host;
    }
    public TlsPropertiesResponse getTls() {
        return this.tls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoginServerPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private TlsPropertiesResponse tls;

        public Builder() {
    	      // Empty
        }

        public Builder(LoginServerPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.tls = defaults.tls;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setTls(TlsPropertiesResponse tls) {
            this.tls = Objects.requireNonNull(tls);
            return this;
        }

        public LoginServerPropertiesResponse build() {
            return new LoginServerPropertiesResponse(host, tls);
        }
    }
}
