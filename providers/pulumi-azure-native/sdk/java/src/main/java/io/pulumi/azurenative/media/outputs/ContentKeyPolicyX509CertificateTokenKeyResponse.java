// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ContentKeyPolicyX509CertificateTokenKeyResponse {
    private final String odataType;
    private final String rawBody;

    @OutputCustomType.Constructor({"odataType","rawBody"})
    private ContentKeyPolicyX509CertificateTokenKeyResponse(
        String odataType,
        String rawBody) {
        this.odataType = Objects.requireNonNull(odataType);
        this.rawBody = Objects.requireNonNull(rawBody);
    }

    public String getOdataType() {
        return this.odataType;
    }
    public String getRawBody() {
        return this.rawBody;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyX509CertificateTokenKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;
        private String rawBody;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyX509CertificateTokenKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.rawBody = defaults.rawBody;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setRawBody(String rawBody) {
            this.rawBody = Objects.requireNonNull(rawBody);
            return this;
        }

        public ContentKeyPolicyX509CertificateTokenKeyResponse build() {
            return new ContentKeyPolicyX509CertificateTokenKeyResponse(odataType, rawBody);
        }
    }
}
