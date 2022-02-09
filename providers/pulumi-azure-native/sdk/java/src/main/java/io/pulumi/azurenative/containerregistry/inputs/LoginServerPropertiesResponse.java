// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.TlsPropertiesResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class LoginServerPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoginServerPropertiesResponse Empty = new LoginServerPropertiesResponse();

    @InputImport(name="host", required=true)
    private final String host;

    public String getHost() {
        return this.host;
    }

    @InputImport(name="tls", required=true)
    private final TlsPropertiesResponse tls;

    public TlsPropertiesResponse getTls() {
        return this.tls;
    }

    public LoginServerPropertiesResponse(
        String host,
        TlsPropertiesResponse tls) {
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.tls = Objects.requireNonNull(tls, "expected parameter 'tls' to be non-null");
    }

    private LoginServerPropertiesResponse() {
        this.host = null;
        this.tls = null;
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
