// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VPN client revoked certificate of P2SVpnServerConfiguration.
 * 
 */
public final class P2SVpnServerConfigVpnClientRevokedCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final P2SVpnServerConfigVpnClientRevokedCertificateArgs Empty = new P2SVpnServerConfigVpnClientRevokedCertificateArgs();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The revoked VPN client certificate thumbprint.
     * 
     */
    @Import(name="thumbprint")
      private final @Nullable Output<String> thumbprint;

    public Output<String> getThumbprint() {
        return this.thumbprint == null ? Codegen.empty() : this.thumbprint;
    }

    public P2SVpnServerConfigVpnClientRevokedCertificateArgs(
        @Nullable Output<String> etag,
        @Nullable Output<String> id,
        @Nullable Output<String> name,
        @Nullable Output<String> thumbprint) {
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.thumbprint = thumbprint;
    }

    private P2SVpnServerConfigVpnClientRevokedCertificateArgs() {
        this.etag = Codegen.empty();
        this.id = Codegen.empty();
        this.name = Codegen.empty();
        this.thumbprint = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(P2SVpnServerConfigVpnClientRevokedCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> etag;
        private @Nullable Output<String> id;
        private @Nullable Output<String> name;
        private @Nullable Output<String> thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(P2SVpnServerConfigVpnClientRevokedCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder thumbprint(@Nullable Output<String> thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }
        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = Codegen.ofNullable(thumbprint);
            return this;
        }        public P2SVpnServerConfigVpnClientRevokedCertificateArgs build() {
            return new P2SVpnServerConfigVpnClientRevokedCertificateArgs(etag, id, name, thumbprint);
        }
    }
}
