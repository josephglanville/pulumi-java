// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VPN client root certificate of P2SVpnServerConfiguration.
 * 
 */
public final class P2SVpnServerConfigVpnClientRootCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final P2SVpnServerConfigVpnClientRootCertificateArgs Empty = new P2SVpnServerConfigVpnClientRootCertificateArgs();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The certificate public data.
     * 
     */
    @InputImport(name="publicCertData", required=true)
      private final Input<String> publicCertData;

    public Input<String> getPublicCertData() {
        return this.publicCertData;
    }

    public P2SVpnServerConfigVpnClientRootCertificateArgs(
        @Nullable Input<String> etag,
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        Input<String> publicCertData) {
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.publicCertData = Objects.requireNonNull(publicCertData, "expected parameter 'publicCertData' to be non-null");
    }

    private P2SVpnServerConfigVpnClientRootCertificateArgs() {
        this.etag = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.publicCertData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(P2SVpnServerConfigVpnClientRootCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> etag;
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private Input<String> publicCertData;

        public Builder() {
    	      // Empty
        }

        public Builder(P2SVpnServerConfigVpnClientRootCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.publicCertData = defaults.publicCertData;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPublicCertData(Input<String> publicCertData) {
            this.publicCertData = Objects.requireNonNull(publicCertData);
            return this;
        }

        public Builder setPublicCertData(String publicCertData) {
            this.publicCertData = Input.of(Objects.requireNonNull(publicCertData));
            return this;
        }
        public P2SVpnServerConfigVpnClientRootCertificateArgs build() {
            return new P2SVpnServerConfigVpnClientRootCertificateArgs(etag, id, name, publicCertData);
        }
    }
}
