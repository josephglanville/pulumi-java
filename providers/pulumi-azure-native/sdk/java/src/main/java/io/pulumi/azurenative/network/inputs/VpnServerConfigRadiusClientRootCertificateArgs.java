// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of the Radius client root certificate of VpnServerConfiguration.
 * 
 */
public final class VpnServerConfigRadiusClientRootCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpnServerConfigRadiusClientRootCertificateArgs Empty = new VpnServerConfigRadiusClientRootCertificateArgs();

    /**
     * The certificate name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The Radius client root certificate thumbprint.
     * 
     */
    @InputImport(name="thumbprint")
      private final @Nullable Input<String> thumbprint;

    public Input<String> getThumbprint() {
        return this.thumbprint == null ? Input.empty() : this.thumbprint;
    }

    public VpnServerConfigRadiusClientRootCertificateArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> thumbprint) {
        this.name = name;
        this.thumbprint = thumbprint;
    }

    private VpnServerConfigRadiusClientRootCertificateArgs() {
        this.name = Input.empty();
        this.thumbprint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnServerConfigRadiusClientRootCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnServerConfigRadiusClientRootCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setThumbprint(@Nullable Input<String> thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }

        public Builder setThumbprint(@Nullable String thumbprint) {
            this.thumbprint = Input.ofNullable(thumbprint);
            return this;
        }
        public VpnServerConfigRadiusClientRootCertificateArgs build() {
            return new VpnServerConfigRadiusClientRootCertificateArgs(name, thumbprint);
        }
    }
}
