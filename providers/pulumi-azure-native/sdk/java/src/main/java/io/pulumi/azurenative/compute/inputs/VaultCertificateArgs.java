// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VaultCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final VaultCertificateArgs Empty = new VaultCertificateArgs();

    @InputImport(name="certificateStore")
    private final @Nullable Input<String> certificateStore;

    public Input<String> getCertificateStore() {
        return this.certificateStore == null ? Input.empty() : this.certificateStore;
    }

    @InputImport(name="certificateUrl")
    private final @Nullable Input<String> certificateUrl;

    public Input<String> getCertificateUrl() {
        return this.certificateUrl == null ? Input.empty() : this.certificateUrl;
    }

    public VaultCertificateArgs(
        @Nullable Input<String> certificateStore,
        @Nullable Input<String> certificateUrl) {
        this.certificateStore = certificateStore;
        this.certificateUrl = certificateUrl;
    }

    private VaultCertificateArgs() {
        this.certificateStore = Input.empty();
        this.certificateUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificateStore;
        private @Nullable Input<String> certificateUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateStore = defaults.certificateStore;
    	      this.certificateUrl = defaults.certificateUrl;
        }

        public Builder setCertificateStore(@Nullable Input<String> certificateStore) {
            this.certificateStore = certificateStore;
            return this;
        }

        public Builder setCertificateStore(@Nullable String certificateStore) {
            this.certificateStore = Input.ofNullable(certificateStore);
            return this;
        }

        public Builder setCertificateUrl(@Nullable Input<String> certificateUrl) {
            this.certificateUrl = certificateUrl;
            return this;
        }

        public Builder setCertificateUrl(@Nullable String certificateUrl) {
            this.certificateUrl = Input.ofNullable(certificateUrl);
            return this;
        }

        public VaultCertificateArgs build() {
            return new VaultCertificateArgs(certificateStore, certificateUrl);
        }
    }
}