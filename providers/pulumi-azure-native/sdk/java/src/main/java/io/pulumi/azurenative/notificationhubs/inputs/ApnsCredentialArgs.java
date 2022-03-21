// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Description of a NotificationHub ApnsCredential.
 * 
 */
public final class ApnsCredentialArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApnsCredentialArgs Empty = new ApnsCredentialArgs();

    /**
     * The APNS certificate. Specify if using Certificate Authentication Mode.
     * 
     */
    @Import(name="apnsCertificate")
      private final @Nullable Output<String> apnsCertificate;

    public Output<String> getApnsCertificate() {
        return this.apnsCertificate == null ? Output.empty() : this.apnsCertificate;
    }

    /**
     * The issuer (iss) registered claim key. The value is a 10-character TeamId, obtained from your developer account. Specify if using Token Authentication Mode.
     * 
     */
    @Import(name="appId")
      private final @Nullable Output<String> appId;

    public Output<String> getAppId() {
        return this.appId == null ? Output.empty() : this.appId;
    }

    /**
     * The name of the application or BundleId. Specify if using Token Authentication Mode.
     * 
     */
    @Import(name="appName")
      private final @Nullable Output<String> appName;

    public Output<String> getAppName() {
        return this.appName == null ? Output.empty() : this.appName;
    }

    /**
     * The APNS certificate password if it exists.
     * 
     */
    @Import(name="certificateKey")
      private final @Nullable Output<String> certificateKey;

    public Output<String> getCertificateKey() {
        return this.certificateKey == null ? Output.empty() : this.certificateKey;
    }

    /**
     * The APNS endpoint of this credential. If using Certificate Authentication Mode and Sandbox specify 'gateway.sandbox.push.apple.com'. If using Certificate Authentication Mode and Production specify 'gateway.push.apple.com'. If using Token Authentication Mode and Sandbox specify 'https://api.development.push.apple.com:443/3/device'. If using Token Authentication Mode and Production specify 'https://api.push.apple.com:443/3/device'.
     * 
     */
    @Import(name="endpoint")
      private final @Nullable Output<String> endpoint;

    public Output<String> getEndpoint() {
        return this.endpoint == null ? Output.empty() : this.endpoint;
    }

    /**
     * A 10-character key identifier (kid) key, obtained from your developer account. Specify if using Token Authentication Mode.
     * 
     */
    @Import(name="keyId")
      private final @Nullable Output<String> keyId;

    public Output<String> getKeyId() {
        return this.keyId == null ? Output.empty() : this.keyId;
    }

    /**
     * The APNS certificate thumbprint. Specify if using Certificate Authentication Mode.
     * 
     */
    @Import(name="thumbprint")
      private final @Nullable Output<String> thumbprint;

    public Output<String> getThumbprint() {
        return this.thumbprint == null ? Output.empty() : this.thumbprint;
    }

    /**
     * Provider Authentication Token, obtained through your developer account. Specify if using Token Authentication Mode.
     * 
     */
    @Import(name="token")
      private final @Nullable Output<String> token;

    public Output<String> getToken() {
        return this.token == null ? Output.empty() : this.token;
    }

    public ApnsCredentialArgs(
        @Nullable Output<String> apnsCertificate,
        @Nullable Output<String> appId,
        @Nullable Output<String> appName,
        @Nullable Output<String> certificateKey,
        @Nullable Output<String> endpoint,
        @Nullable Output<String> keyId,
        @Nullable Output<String> thumbprint,
        @Nullable Output<String> token) {
        this.apnsCertificate = apnsCertificate;
        this.appId = appId;
        this.appName = appName;
        this.certificateKey = certificateKey;
        this.endpoint = endpoint;
        this.keyId = keyId;
        this.thumbprint = thumbprint;
        this.token = token;
    }

    private ApnsCredentialArgs() {
        this.apnsCertificate = Output.empty();
        this.appId = Output.empty();
        this.appName = Output.empty();
        this.certificateKey = Output.empty();
        this.endpoint = Output.empty();
        this.keyId = Output.empty();
        this.thumbprint = Output.empty();
        this.token = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApnsCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apnsCertificate;
        private @Nullable Output<String> appId;
        private @Nullable Output<String> appName;
        private @Nullable Output<String> certificateKey;
        private @Nullable Output<String> endpoint;
        private @Nullable Output<String> keyId;
        private @Nullable Output<String> thumbprint;
        private @Nullable Output<String> token;

        public Builder() {
    	      // Empty
        }

        public Builder(ApnsCredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apnsCertificate = defaults.apnsCertificate;
    	      this.appId = defaults.appId;
    	      this.appName = defaults.appName;
    	      this.certificateKey = defaults.certificateKey;
    	      this.endpoint = defaults.endpoint;
    	      this.keyId = defaults.keyId;
    	      this.thumbprint = defaults.thumbprint;
    	      this.token = defaults.token;
        }

        public Builder apnsCertificate(@Nullable Output<String> apnsCertificate) {
            this.apnsCertificate = apnsCertificate;
            return this;
        }
        public Builder apnsCertificate(@Nullable String apnsCertificate) {
            this.apnsCertificate = Output.ofNullable(apnsCertificate);
            return this;
        }
        public Builder appId(@Nullable Output<String> appId) {
            this.appId = appId;
            return this;
        }
        public Builder appId(@Nullable String appId) {
            this.appId = Output.ofNullable(appId);
            return this;
        }
        public Builder appName(@Nullable Output<String> appName) {
            this.appName = appName;
            return this;
        }
        public Builder appName(@Nullable String appName) {
            this.appName = Output.ofNullable(appName);
            return this;
        }
        public Builder certificateKey(@Nullable Output<String> certificateKey) {
            this.certificateKey = certificateKey;
            return this;
        }
        public Builder certificateKey(@Nullable String certificateKey) {
            this.certificateKey = Output.ofNullable(certificateKey);
            return this;
        }
        public Builder endpoint(@Nullable Output<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = Output.ofNullable(endpoint);
            return this;
        }
        public Builder keyId(@Nullable Output<String> keyId) {
            this.keyId = keyId;
            return this;
        }
        public Builder keyId(@Nullable String keyId) {
            this.keyId = Output.ofNullable(keyId);
            return this;
        }
        public Builder thumbprint(@Nullable Output<String> thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }
        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = Output.ofNullable(thumbprint);
            return this;
        }
        public Builder token(@Nullable Output<String> token) {
            this.token = token;
            return this;
        }
        public Builder token(@Nullable String token) {
            this.token = Output.ofNullable(token);
            return this;
        }        public ApnsCredentialArgs build() {
            return new ApnsCredentialArgs(apnsCertificate, appId, appName, certificateKey, endpoint, keyId, thumbprint, token);
        }
    }
}
