// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainEndpointOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainEndpointOptionsArgs Empty = new DomainEndpointOptionsArgs();

    @Import(name="customEndpoint")
      private final @Nullable Output<String> customEndpoint;

    public Output<String> getCustomEndpoint() {
        return this.customEndpoint == null ? Codegen.empty() : this.customEndpoint;
    }

    @Import(name="customEndpointCertificateArn")
      private final @Nullable Output<String> customEndpointCertificateArn;

    public Output<String> getCustomEndpointCertificateArn() {
        return this.customEndpointCertificateArn == null ? Codegen.empty() : this.customEndpointCertificateArn;
    }

    @Import(name="customEndpointEnabled")
      private final @Nullable Output<Boolean> customEndpointEnabled;

    public Output<Boolean> getCustomEndpointEnabled() {
        return this.customEndpointEnabled == null ? Codegen.empty() : this.customEndpointEnabled;
    }

    @Import(name="enforceHTTPS")
      private final @Nullable Output<Boolean> enforceHTTPS;

    public Output<Boolean> getEnforceHTTPS() {
        return this.enforceHTTPS == null ? Codegen.empty() : this.enforceHTTPS;
    }

    @Import(name="tLSSecurityPolicy")
      private final @Nullable Output<String> tLSSecurityPolicy;

    public Output<String> getTLSSecurityPolicy() {
        return this.tLSSecurityPolicy == null ? Codegen.empty() : this.tLSSecurityPolicy;
    }

    public DomainEndpointOptionsArgs(
        @Nullable Output<String> customEndpoint,
        @Nullable Output<String> customEndpointCertificateArn,
        @Nullable Output<Boolean> customEndpointEnabled,
        @Nullable Output<Boolean> enforceHTTPS,
        @Nullable Output<String> tLSSecurityPolicy) {
        this.customEndpoint = customEndpoint;
        this.customEndpointCertificateArn = customEndpointCertificateArn;
        this.customEndpointEnabled = customEndpointEnabled;
        this.enforceHTTPS = enforceHTTPS;
        this.tLSSecurityPolicy = tLSSecurityPolicy;
    }

    private DomainEndpointOptionsArgs() {
        this.customEndpoint = Codegen.empty();
        this.customEndpointCertificateArn = Codegen.empty();
        this.customEndpointEnabled = Codegen.empty();
        this.enforceHTTPS = Codegen.empty();
        this.tLSSecurityPolicy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainEndpointOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> customEndpoint;
        private @Nullable Output<String> customEndpointCertificateArn;
        private @Nullable Output<Boolean> customEndpointEnabled;
        private @Nullable Output<Boolean> enforceHTTPS;
        private @Nullable Output<String> tLSSecurityPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainEndpointOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customEndpoint = defaults.customEndpoint;
    	      this.customEndpointCertificateArn = defaults.customEndpointCertificateArn;
    	      this.customEndpointEnabled = defaults.customEndpointEnabled;
    	      this.enforceHTTPS = defaults.enforceHTTPS;
    	      this.tLSSecurityPolicy = defaults.tLSSecurityPolicy;
        }

        public Builder customEndpoint(@Nullable Output<String> customEndpoint) {
            this.customEndpoint = customEndpoint;
            return this;
        }
        public Builder customEndpoint(@Nullable String customEndpoint) {
            this.customEndpoint = Codegen.ofNullable(customEndpoint);
            return this;
        }
        public Builder customEndpointCertificateArn(@Nullable Output<String> customEndpointCertificateArn) {
            this.customEndpointCertificateArn = customEndpointCertificateArn;
            return this;
        }
        public Builder customEndpointCertificateArn(@Nullable String customEndpointCertificateArn) {
            this.customEndpointCertificateArn = Codegen.ofNullable(customEndpointCertificateArn);
            return this;
        }
        public Builder customEndpointEnabled(@Nullable Output<Boolean> customEndpointEnabled) {
            this.customEndpointEnabled = customEndpointEnabled;
            return this;
        }
        public Builder customEndpointEnabled(@Nullable Boolean customEndpointEnabled) {
            this.customEndpointEnabled = Codegen.ofNullable(customEndpointEnabled);
            return this;
        }
        public Builder enforceHTTPS(@Nullable Output<Boolean> enforceHTTPS) {
            this.enforceHTTPS = enforceHTTPS;
            return this;
        }
        public Builder enforceHTTPS(@Nullable Boolean enforceHTTPS) {
            this.enforceHTTPS = Codegen.ofNullable(enforceHTTPS);
            return this;
        }
        public Builder tLSSecurityPolicy(@Nullable Output<String> tLSSecurityPolicy) {
            this.tLSSecurityPolicy = tLSSecurityPolicy;
            return this;
        }
        public Builder tLSSecurityPolicy(@Nullable String tLSSecurityPolicy) {
            this.tLSSecurityPolicy = Codegen.ofNullable(tLSSecurityPolicy);
            return this;
        }        public DomainEndpointOptionsArgs build() {
            return new DomainEndpointOptionsArgs(customEndpoint, customEndpointCertificateArn, customEndpointEnabled, enforceHTTPS, tLSSecurityPolicy);
        }
    }
}
