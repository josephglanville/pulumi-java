// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.transfer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetServerResult {
    /**
     * Amazon Resource Name (ARN) of Transfer Server.
     * 
     */
    private final String arn;
    /**
     * The ARN of any certificate.
     * 
     */
    private final String certificate;
    /**
     * The domain of the storage system that is used for file transfers.
     * 
     */
    private final String domain;
    /**
     * The endpoint of the Transfer Server (e.g., `s-12345678.server.transfer.REGION.amazonaws.com`).
     * 
     */
    private final String endpoint;
    /**
     * The type of endpoint that the server is connected to.
     * 
     */
    private final String endpointType;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The mode of authentication enabled for this service. The default value is `SERVICE_MANAGED`, which allows you to store and access SFTP user credentials within the service. `API_GATEWAY` indicates that user authentication requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your choice.
     * 
     */
    private final String identityProviderType;
    /**
     * Amazon Resource Name (ARN) of the IAM role used to authenticate the user account with an `identity_provider_type` of `API_GATEWAY`.
     * 
     */
    private final String invocationRole;
    /**
     * Amazon Resource Name (ARN) of an IAM role that allows the service to write your SFTP users’ activity to your Amazon CloudWatch logs for monitoring and auditing purposes.
     * 
     */
    private final String loggingRole;
    /**
     * The file transfer protocol or protocols over which your file transfer protocol client can connect to your server's endpoint.
     * 
     */
    private final List<String> protocols;
    /**
     * The name of the security policy that is attached to the server.
     * 
     */
    private final String securityPolicyName;
    private final String serverId;
    /**
     * URL of the service endpoint used to authenticate users with an `identity_provider_type` of `API_GATEWAY`.
     * 
     */
    private final String url;

    @OutputCustomType.Constructor
    private GetServerResult(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("certificate") String certificate,
        @OutputCustomType.Parameter("domain") String domain,
        @OutputCustomType.Parameter("endpoint") String endpoint,
        @OutputCustomType.Parameter("endpointType") String endpointType,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("identityProviderType") String identityProviderType,
        @OutputCustomType.Parameter("invocationRole") String invocationRole,
        @OutputCustomType.Parameter("loggingRole") String loggingRole,
        @OutputCustomType.Parameter("protocols") List<String> protocols,
        @OutputCustomType.Parameter("securityPolicyName") String securityPolicyName,
        @OutputCustomType.Parameter("serverId") String serverId,
        @OutputCustomType.Parameter("url") String url) {
        this.arn = arn;
        this.certificate = certificate;
        this.domain = domain;
        this.endpoint = endpoint;
        this.endpointType = endpointType;
        this.id = id;
        this.identityProviderType = identityProviderType;
        this.invocationRole = invocationRole;
        this.loggingRole = loggingRole;
        this.protocols = protocols;
        this.securityPolicyName = securityPolicyName;
        this.serverId = serverId;
        this.url = url;
    }

    /**
     * Amazon Resource Name (ARN) of Transfer Server.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The ARN of any certificate.
     * 
    */
    public String getCertificate() {
        return this.certificate;
    }
    /**
     * The domain of the storage system that is used for file transfers.
     * 
    */
    public String getDomain() {
        return this.domain;
    }
    /**
     * The endpoint of the Transfer Server (e.g., `s-12345678.server.transfer.REGION.amazonaws.com`).
     * 
    */
    public String getEndpoint() {
        return this.endpoint;
    }
    /**
     * The type of endpoint that the server is connected to.
     * 
    */
    public String getEndpointType() {
        return this.endpointType;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The mode of authentication enabled for this service. The default value is `SERVICE_MANAGED`, which allows you to store and access SFTP user credentials within the service. `API_GATEWAY` indicates that user authentication requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your choice.
     * 
    */
    public String getIdentityProviderType() {
        return this.identityProviderType;
    }
    /**
     * Amazon Resource Name (ARN) of the IAM role used to authenticate the user account with an `identity_provider_type` of `API_GATEWAY`.
     * 
    */
    public String getInvocationRole() {
        return this.invocationRole;
    }
    /**
     * Amazon Resource Name (ARN) of an IAM role that allows the service to write your SFTP users’ activity to your Amazon CloudWatch logs for monitoring and auditing purposes.
     * 
    */
    public String getLoggingRole() {
        return this.loggingRole;
    }
    /**
     * The file transfer protocol or protocols over which your file transfer protocol client can connect to your server's endpoint.
     * 
    */
    public List<String> getProtocols() {
        return this.protocols;
    }
    /**
     * The name of the security policy that is attached to the server.
     * 
    */
    public String getSecurityPolicyName() {
        return this.securityPolicyName;
    }
    public String getServerId() {
        return this.serverId;
    }
    /**
     * URL of the service endpoint used to authenticate users with an `identity_provider_type` of `API_GATEWAY`.
     * 
    */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String certificate;
        private String domain;
        private String endpoint;
        private String endpointType;
        private String id;
        private String identityProviderType;
        private String invocationRole;
        private String loggingRole;
        private List<String> protocols;
        private String securityPolicyName;
        private String serverId;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.certificate = defaults.certificate;
    	      this.domain = defaults.domain;
    	      this.endpoint = defaults.endpoint;
    	      this.endpointType = defaults.endpointType;
    	      this.id = defaults.id;
    	      this.identityProviderType = defaults.identityProviderType;
    	      this.invocationRole = defaults.invocationRole;
    	      this.loggingRole = defaults.loggingRole;
    	      this.protocols = defaults.protocols;
    	      this.securityPolicyName = defaults.securityPolicyName;
    	      this.serverId = defaults.serverId;
    	      this.url = defaults.url;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setCertificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }

        public Builder setDomain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setEndpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentityProviderType(String identityProviderType) {
            this.identityProviderType = Objects.requireNonNull(identityProviderType);
            return this;
        }

        public Builder setInvocationRole(String invocationRole) {
            this.invocationRole = Objects.requireNonNull(invocationRole);
            return this;
        }

        public Builder setLoggingRole(String loggingRole) {
            this.loggingRole = Objects.requireNonNull(loggingRole);
            return this;
        }

        public Builder setProtocols(List<String> protocols) {
            this.protocols = Objects.requireNonNull(protocols);
            return this;
        }

        public Builder setSecurityPolicyName(String securityPolicyName) {
            this.securityPolicyName = Objects.requireNonNull(securityPolicyName);
            return this;
        }

        public Builder setServerId(String serverId) {
            this.serverId = Objects.requireNonNull(serverId);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public GetServerResult build() {
            return new GetServerResult(arn, certificate, domain, endpoint, endpointType, id, identityProviderType, invocationRole, loggingRole, protocols, securityPolicyName, serverId, url);
        }
    }
}
