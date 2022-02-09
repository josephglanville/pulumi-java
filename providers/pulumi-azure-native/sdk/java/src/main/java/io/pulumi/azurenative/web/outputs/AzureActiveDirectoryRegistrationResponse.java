// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureActiveDirectoryRegistrationResponse {
    private final @Nullable String clientId;
    private final @Nullable String clientSecretCertificateIssuer;
    private final @Nullable String clientSecretCertificateSubjectAlternativeName;
    private final @Nullable String clientSecretCertificateThumbprint;
    private final @Nullable String clientSecretSettingName;
    private final @Nullable String openIdIssuer;

    @OutputCustomType.Constructor({"clientId","clientSecretCertificateIssuer","clientSecretCertificateSubjectAlternativeName","clientSecretCertificateThumbprint","clientSecretSettingName","openIdIssuer"})
    private AzureActiveDirectoryRegistrationResponse(
        @Nullable String clientId,
        @Nullable String clientSecretCertificateIssuer,
        @Nullable String clientSecretCertificateSubjectAlternativeName,
        @Nullable String clientSecretCertificateThumbprint,
        @Nullable String clientSecretSettingName,
        @Nullable String openIdIssuer) {
        this.clientId = clientId;
        this.clientSecretCertificateIssuer = clientSecretCertificateIssuer;
        this.clientSecretCertificateSubjectAlternativeName = clientSecretCertificateSubjectAlternativeName;
        this.clientSecretCertificateThumbprint = clientSecretCertificateThumbprint;
        this.clientSecretSettingName = clientSecretSettingName;
        this.openIdIssuer = openIdIssuer;
    }

    public Optional<String> getClientId() {
        return Optional.ofNullable(this.clientId);
    }
    public Optional<String> getClientSecretCertificateIssuer() {
        return Optional.ofNullable(this.clientSecretCertificateIssuer);
    }
    public Optional<String> getClientSecretCertificateSubjectAlternativeName() {
        return Optional.ofNullable(this.clientSecretCertificateSubjectAlternativeName);
    }
    public Optional<String> getClientSecretCertificateThumbprint() {
        return Optional.ofNullable(this.clientSecretCertificateThumbprint);
    }
    public Optional<String> getClientSecretSettingName() {
        return Optional.ofNullable(this.clientSecretSettingName);
    }
    public Optional<String> getOpenIdIssuer() {
        return Optional.ofNullable(this.openIdIssuer);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureActiveDirectoryRegistrationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String clientSecretCertificateIssuer;
        private @Nullable String clientSecretCertificateSubjectAlternativeName;
        private @Nullable String clientSecretCertificateThumbprint;
        private @Nullable String clientSecretSettingName;
        private @Nullable String openIdIssuer;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureActiveDirectoryRegistrationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecretCertificateIssuer = defaults.clientSecretCertificateIssuer;
    	      this.clientSecretCertificateSubjectAlternativeName = defaults.clientSecretCertificateSubjectAlternativeName;
    	      this.clientSecretCertificateThumbprint = defaults.clientSecretCertificateThumbprint;
    	      this.clientSecretSettingName = defaults.clientSecretSettingName;
    	      this.openIdIssuer = defaults.openIdIssuer;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientSecretCertificateIssuer(@Nullable String clientSecretCertificateIssuer) {
            this.clientSecretCertificateIssuer = clientSecretCertificateIssuer;
            return this;
        }

        public Builder setClientSecretCertificateSubjectAlternativeName(@Nullable String clientSecretCertificateSubjectAlternativeName) {
            this.clientSecretCertificateSubjectAlternativeName = clientSecretCertificateSubjectAlternativeName;
            return this;
        }

        public Builder setClientSecretCertificateThumbprint(@Nullable String clientSecretCertificateThumbprint) {
            this.clientSecretCertificateThumbprint = clientSecretCertificateThumbprint;
            return this;
        }

        public Builder setClientSecretSettingName(@Nullable String clientSecretSettingName) {
            this.clientSecretSettingName = clientSecretSettingName;
            return this;
        }

        public Builder setOpenIdIssuer(@Nullable String openIdIssuer) {
            this.openIdIssuer = openIdIssuer;
            return this;
        }

        public AzureActiveDirectoryRegistrationResponse build() {
            return new AzureActiveDirectoryRegistrationResponse(clientId, clientSecretCertificateIssuer, clientSecretCertificateSubjectAlternativeName, clientSecretCertificateThumbprint, clientSecretSettingName, openIdIssuer);
        }
    }
}
