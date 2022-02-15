// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BitbucketServerSecretsResponse {
    private final String adminAccessTokenVersionName;
    private final String readAccessTokenVersionName;
    private final String webhookSecretVersionName;

    @OutputCustomType.Constructor({"adminAccessTokenVersionName","readAccessTokenVersionName","webhookSecretVersionName"})
    private BitbucketServerSecretsResponse(
        String adminAccessTokenVersionName,
        String readAccessTokenVersionName,
        String webhookSecretVersionName) {
        this.adminAccessTokenVersionName = Objects.requireNonNull(adminAccessTokenVersionName);
        this.readAccessTokenVersionName = Objects.requireNonNull(readAccessTokenVersionName);
        this.webhookSecretVersionName = Objects.requireNonNull(webhookSecretVersionName);
    }

    public String getAdminAccessTokenVersionName() {
        return this.adminAccessTokenVersionName;
    }
    public String getReadAccessTokenVersionName() {
        return this.readAccessTokenVersionName;
    }
    public String getWebhookSecretVersionName() {
        return this.webhookSecretVersionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BitbucketServerSecretsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String adminAccessTokenVersionName;
        private String readAccessTokenVersionName;
        private String webhookSecretVersionName;

        public Builder() {
    	      // Empty
        }

        public Builder(BitbucketServerSecretsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminAccessTokenVersionName = defaults.adminAccessTokenVersionName;
    	      this.readAccessTokenVersionName = defaults.readAccessTokenVersionName;
    	      this.webhookSecretVersionName = defaults.webhookSecretVersionName;
        }

        public Builder setAdminAccessTokenVersionName(String adminAccessTokenVersionName) {
            this.adminAccessTokenVersionName = Objects.requireNonNull(adminAccessTokenVersionName);
            return this;
        }

        public Builder setReadAccessTokenVersionName(String readAccessTokenVersionName) {
            this.readAccessTokenVersionName = Objects.requireNonNull(readAccessTokenVersionName);
            return this;
        }

        public Builder setWebhookSecretVersionName(String webhookSecretVersionName) {
            this.webhookSecretVersionName = Objects.requireNonNull(webhookSecretVersionName);
            return this;
        }

        public BitbucketServerSecretsResponse build() {
            return new BitbucketServerSecretsResponse(adminAccessTokenVersionName, readAccessTokenVersionName, webhookSecretVersionName);
        }
    }
}