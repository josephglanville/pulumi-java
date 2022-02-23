// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * CDN Authorization credentials
 * 
 */
public final class OriginEndpointAuthorization extends io.pulumi.resources.InvokeArgs {

    public static final OriginEndpointAuthorization Empty = new OriginEndpointAuthorization();

    /**
     * The Amazon Resource Name (ARN) for the secret in Secrets Manager that your Content Distribution Network (CDN) uses for authorization to access your endpoint.
     * 
     */
    @InputImport(name="cdnIdentifierSecret", required=true)
      private final String cdnIdentifierSecret;

    public String getCdnIdentifierSecret() {
        return this.cdnIdentifierSecret;
    }

    /**
     * The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
     * 
     */
    @InputImport(name="secretsRoleArn", required=true)
      private final String secretsRoleArn;

    public String getSecretsRoleArn() {
        return this.secretsRoleArn;
    }

    public OriginEndpointAuthorization(
        String cdnIdentifierSecret,
        String secretsRoleArn) {
        this.cdnIdentifierSecret = Objects.requireNonNull(cdnIdentifierSecret, "expected parameter 'cdnIdentifierSecret' to be non-null");
        this.secretsRoleArn = Objects.requireNonNull(secretsRoleArn, "expected parameter 'secretsRoleArn' to be non-null");
    }

    private OriginEndpointAuthorization() {
        this.cdnIdentifierSecret = null;
        this.secretsRoleArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointAuthorization defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cdnIdentifierSecret;
        private String secretsRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointAuthorization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cdnIdentifierSecret = defaults.cdnIdentifierSecret;
    	      this.secretsRoleArn = defaults.secretsRoleArn;
        }

        public Builder setCdnIdentifierSecret(String cdnIdentifierSecret) {
            this.cdnIdentifierSecret = Objects.requireNonNull(cdnIdentifierSecret);
            return this;
        }

        public Builder setSecretsRoleArn(String secretsRoleArn) {
            this.secretsRoleArn = Objects.requireNonNull(secretsRoleArn);
            return this;
        }
        public OriginEndpointAuthorization build() {
            return new OriginEndpointAuthorization(cdnIdentifierSecret, secretsRoleArn);
        }
    }
}
