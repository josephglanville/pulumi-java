// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigSpConfigSpCertificateArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TenantInboundSamlConfigSpConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final TenantInboundSamlConfigSpConfigArgs Empty = new TenantInboundSamlConfigSpConfigArgs();

    /**
     * Callback URI where responses from IDP are handled. Must start with `https://`.
     * 
     */
    @Import(name="callbackUri", required=true)
      private final Output<String> callbackUri;

    public Output<String> getCallbackUri() {
        return this.callbackUri;
    }

    /**
     * - 
     * The IDP's certificate data to verify the signature in the SAMLResponse issued by the IDP.
     * Structure is documented below.
     * 
     */
    @Import(name="spCertificates")
      private final @Nullable Output<List<TenantInboundSamlConfigSpConfigSpCertificateArgs>> spCertificates;

    public Output<List<TenantInboundSamlConfigSpConfigSpCertificateArgs>> getSpCertificates() {
        return this.spCertificates == null ? Output.empty() : this.spCertificates;
    }

    /**
     * Unique identifier for all SAML entities.
     * 
     */
    @Import(name="spEntityId", required=true)
      private final Output<String> spEntityId;

    public Output<String> getSpEntityId() {
        return this.spEntityId;
    }

    public TenantInboundSamlConfigSpConfigArgs(
        Output<String> callbackUri,
        @Nullable Output<List<TenantInboundSamlConfigSpConfigSpCertificateArgs>> spCertificates,
        Output<String> spEntityId) {
        this.callbackUri = Objects.requireNonNull(callbackUri, "expected parameter 'callbackUri' to be non-null");
        this.spCertificates = spCertificates;
        this.spEntityId = Objects.requireNonNull(spEntityId, "expected parameter 'spEntityId' to be non-null");
    }

    private TenantInboundSamlConfigSpConfigArgs() {
        this.callbackUri = Output.empty();
        this.spCertificates = Output.empty();
        this.spEntityId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TenantInboundSamlConfigSpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> callbackUri;
        private @Nullable Output<List<TenantInboundSamlConfigSpConfigSpCertificateArgs>> spCertificates;
        private Output<String> spEntityId;

        public Builder() {
    	      // Empty
        }

        public Builder(TenantInboundSamlConfigSpConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callbackUri = defaults.callbackUri;
    	      this.spCertificates = defaults.spCertificates;
    	      this.spEntityId = defaults.spEntityId;
        }

        public Builder callbackUri(Output<String> callbackUri) {
            this.callbackUri = Objects.requireNonNull(callbackUri);
            return this;
        }
        public Builder callbackUri(String callbackUri) {
            this.callbackUri = Output.of(Objects.requireNonNull(callbackUri));
            return this;
        }
        public Builder spCertificates(@Nullable Output<List<TenantInboundSamlConfigSpConfigSpCertificateArgs>> spCertificates) {
            this.spCertificates = spCertificates;
            return this;
        }
        public Builder spCertificates(@Nullable List<TenantInboundSamlConfigSpConfigSpCertificateArgs> spCertificates) {
            this.spCertificates = Output.ofNullable(spCertificates);
            return this;
        }
        public Builder spCertificates(TenantInboundSamlConfigSpConfigSpCertificateArgs... spCertificates) {
            return spCertificates(List.of(spCertificates));
        }
        public Builder spEntityId(Output<String> spEntityId) {
            this.spEntityId = Objects.requireNonNull(spEntityId);
            return this;
        }
        public Builder spEntityId(String spEntityId) {
            this.spEntityId = Output.of(Objects.requireNonNull(spEntityId));
            return this;
        }        public TenantInboundSamlConfigSpConfigArgs build() {
            return new TenantInboundSamlConfigSpConfigArgs(callbackUri, spCertificates, spEntityId);
        }
    }
}
