// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GcpCredentialsDetailsPropertiesResponse {
    private final String authProviderX509CertUrl;
    private final String authUri;
    private final String authenticationProvisioningState;
    private final String authenticationType;
    private final String clientEmail;
    private final String clientId;
    private final String clientX509CertUrl;
    private final List<String> grantedPermissions;
    private final String organizationId;
    private final String privateKey;
    private final String privateKeyId;
    private final String projectId;
    private final String tokenUri;
    private final String type;

    @OutputCustomType.Constructor({"authProviderX509CertUrl","authUri","authenticationProvisioningState","authenticationType","clientEmail","clientId","clientX509CertUrl","grantedPermissions","organizationId","privateKey","privateKeyId","projectId","tokenUri","type"})
    private GcpCredentialsDetailsPropertiesResponse(
        String authProviderX509CertUrl,
        String authUri,
        String authenticationProvisioningState,
        String authenticationType,
        String clientEmail,
        String clientId,
        String clientX509CertUrl,
        List<String> grantedPermissions,
        String organizationId,
        String privateKey,
        String privateKeyId,
        String projectId,
        String tokenUri,
        String type) {
        this.authProviderX509CertUrl = Objects.requireNonNull(authProviderX509CertUrl);
        this.authUri = Objects.requireNonNull(authUri);
        this.authenticationProvisioningState = Objects.requireNonNull(authenticationProvisioningState);
        this.authenticationType = Objects.requireNonNull(authenticationType);
        this.clientEmail = Objects.requireNonNull(clientEmail);
        this.clientId = Objects.requireNonNull(clientId);
        this.clientX509CertUrl = Objects.requireNonNull(clientX509CertUrl);
        this.grantedPermissions = Objects.requireNonNull(grantedPermissions);
        this.organizationId = Objects.requireNonNull(organizationId);
        this.privateKey = Objects.requireNonNull(privateKey);
        this.privateKeyId = Objects.requireNonNull(privateKeyId);
        this.projectId = Objects.requireNonNull(projectId);
        this.tokenUri = Objects.requireNonNull(tokenUri);
        this.type = Objects.requireNonNull(type);
    }

    public String getAuthProviderX509CertUrl() {
        return this.authProviderX509CertUrl;
    }
    public String getAuthUri() {
        return this.authUri;
    }
    public String getAuthenticationProvisioningState() {
        return this.authenticationProvisioningState;
    }
    public String getAuthenticationType() {
        return this.authenticationType;
    }
    public String getClientEmail() {
        return this.clientEmail;
    }
    public String getClientId() {
        return this.clientId;
    }
    public String getClientX509CertUrl() {
        return this.clientX509CertUrl;
    }
    public List<String> getGrantedPermissions() {
        return this.grantedPermissions;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }
    public String getPrivateKeyId() {
        return this.privateKeyId;
    }
    public String getProjectId() {
        return this.projectId;
    }
    public String getTokenUri() {
        return this.tokenUri;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcpCredentialsDetailsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authProviderX509CertUrl;
        private String authUri;
        private String authenticationProvisioningState;
        private String authenticationType;
        private String clientEmail;
        private String clientId;
        private String clientX509CertUrl;
        private List<String> grantedPermissions;
        private String organizationId;
        private String privateKey;
        private String privateKeyId;
        private String projectId;
        private String tokenUri;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GcpCredentialsDetailsPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authProviderX509CertUrl = defaults.authProviderX509CertUrl;
    	      this.authUri = defaults.authUri;
    	      this.authenticationProvisioningState = defaults.authenticationProvisioningState;
    	      this.authenticationType = defaults.authenticationType;
    	      this.clientEmail = defaults.clientEmail;
    	      this.clientId = defaults.clientId;
    	      this.clientX509CertUrl = defaults.clientX509CertUrl;
    	      this.grantedPermissions = defaults.grantedPermissions;
    	      this.organizationId = defaults.organizationId;
    	      this.privateKey = defaults.privateKey;
    	      this.privateKeyId = defaults.privateKeyId;
    	      this.projectId = defaults.projectId;
    	      this.tokenUri = defaults.tokenUri;
    	      this.type = defaults.type;
        }

        public Builder setAuthProviderX509CertUrl(String authProviderX509CertUrl) {
            this.authProviderX509CertUrl = Objects.requireNonNull(authProviderX509CertUrl);
            return this;
        }

        public Builder setAuthUri(String authUri) {
            this.authUri = Objects.requireNonNull(authUri);
            return this;
        }

        public Builder setAuthenticationProvisioningState(String authenticationProvisioningState) {
            this.authenticationProvisioningState = Objects.requireNonNull(authenticationProvisioningState);
            return this;
        }

        public Builder setAuthenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder setClientEmail(String clientEmail) {
            this.clientEmail = Objects.requireNonNull(clientEmail);
            return this;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setClientX509CertUrl(String clientX509CertUrl) {
            this.clientX509CertUrl = Objects.requireNonNull(clientX509CertUrl);
            return this;
        }

        public Builder setGrantedPermissions(List<String> grantedPermissions) {
            this.grantedPermissions = Objects.requireNonNull(grantedPermissions);
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder setPrivateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }

        public Builder setPrivateKeyId(String privateKeyId) {
            this.privateKeyId = Objects.requireNonNull(privateKeyId);
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }

        public Builder setTokenUri(String tokenUri) {
            this.tokenUri = Objects.requireNonNull(tokenUri);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GcpCredentialsDetailsPropertiesResponse build() {
            return new GcpCredentialsDetailsPropertiesResponse(authProviderX509CertUrl, authUri, authenticationProvisioningState, authenticationType, clientEmail, clientId, clientX509CertUrl, grantedPermissions, organizationId, privateKey, privateKeyId, projectId, tokenUri, type);
        }
    }
}
