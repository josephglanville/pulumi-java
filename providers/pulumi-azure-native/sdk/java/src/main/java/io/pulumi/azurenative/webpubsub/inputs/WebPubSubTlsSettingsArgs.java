// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * TLS settings for the resource
 * 
 */
public final class WebPubSubTlsSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebPubSubTlsSettingsArgs Empty = new WebPubSubTlsSettingsArgs();

    /**
     * Request client certificate during TLS handshake if enabled
     * 
     */
    @Import(name="clientCertEnabled")
      private final @Nullable Output<Boolean> clientCertEnabled;

    public Output<Boolean> getClientCertEnabled() {
        return this.clientCertEnabled == null ? Output.empty() : this.clientCertEnabled;
    }

    public WebPubSubTlsSettingsArgs(@Nullable Output<Boolean> clientCertEnabled) {
        this.clientCertEnabled = clientCertEnabled == null ? Output.ofNullable(true) : clientCertEnabled;
    }

    private WebPubSubTlsSettingsArgs() {
        this.clientCertEnabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebPubSubTlsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> clientCertEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(WebPubSubTlsSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientCertEnabled = defaults.clientCertEnabled;
        }

        public Builder clientCertEnabled(@Nullable Output<Boolean> clientCertEnabled) {
            this.clientCertEnabled = clientCertEnabled;
            return this;
        }
        public Builder clientCertEnabled(@Nullable Boolean clientCertEnabled) {
            this.clientCertEnabled = Output.ofNullable(clientCertEnabled);
            return this;
        }        public WebPubSubTlsSettingsArgs build() {
            return new WebPubSubTlsSettingsArgs(clientCertEnabled);
        }
    }
}
