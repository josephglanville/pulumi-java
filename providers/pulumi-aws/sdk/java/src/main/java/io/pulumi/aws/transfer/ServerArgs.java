// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.transfer;

import io.pulumi.aws.transfer.inputs.ServerEndpointDetailsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerArgs Empty = new ServerArgs();

    /**
     * The Amazon Resource Name (ARN) of the AWS Certificate Manager (ACM) certificate. This is required when `protocols` is set to `FTPS`
     * 
     */
    @Import(name="certificate")
      private final @Nullable Output<String> certificate;

    public Output<String> getCertificate() {
        return this.certificate == null ? Output.empty() : this.certificate;
    }

    /**
     * The directory service ID of the directory service you want to connect to with an `identity_provider_type` of `AWS_DIRECTORY_SERVICE`.
     * 
     */
    @Import(name="directoryId")
      private final @Nullable Output<String> directoryId;

    public Output<String> getDirectoryId() {
        return this.directoryId == null ? Output.empty() : this.directoryId;
    }

    /**
     * The domain of the storage system that is used for file transfers. Valid values are: `S3` and `EFS`. The default value is `S3`.
     * 
     */
    @Import(name="domain")
      private final @Nullable Output<String> domain;

    public Output<String> getDomain() {
        return this.domain == null ? Output.empty() : this.domain;
    }

    /**
     * The virtual private cloud (VPC) endpoint settings that you want to configure for your SFTP server. Fields documented below.
     * 
     */
    @Import(name="endpointDetails")
      private final @Nullable Output<ServerEndpointDetailsArgs> endpointDetails;

    public Output<ServerEndpointDetailsArgs> getEndpointDetails() {
        return this.endpointDetails == null ? Output.empty() : this.endpointDetails;
    }

    /**
     * The type of endpoint that you want your SFTP server connect to. If you connect to a `VPC` (or `VPC_ENDPOINT`), your SFTP server isn't accessible over the public internet. If you want to connect your SFTP server via public internet, set `PUBLIC`.  Defaults to `PUBLIC`.
     * 
     */
    @Import(name="endpointType")
      private final @Nullable Output<String> endpointType;

    public Output<String> getEndpointType() {
        return this.endpointType == null ? Output.empty() : this.endpointType;
    }

    /**
     * A boolean that indicates all users associated with the server should be deleted so that the Server can be destroyed without error. The default value is `false`. This option only applies to servers configured with a `SERVICE_MANAGED` `identity_provider_type`.
     * 
     */
    @Import(name="forceDestroy")
      private final @Nullable Output<Boolean> forceDestroy;

    public Output<Boolean> getForceDestroy() {
        return this.forceDestroy == null ? Output.empty() : this.forceDestroy;
    }

    /**
     * The ARN for a lambda function to use for the Identity provider.
     * 
     */
    @Import(name="function")
      private final @Nullable Output<String> function;

    public Output<String> getFunction() {
        return this.function == null ? Output.empty() : this.function;
    }

    /**
     * RSA private key (e.g., as generated by the `ssh-keygen -N "" -m PEM -f my-new-server-key` command).
     * 
     */
    @Import(name="hostKey")
      private final @Nullable Output<String> hostKey;

    public Output<String> getHostKey() {
        return this.hostKey == null ? Output.empty() : this.hostKey;
    }

    /**
     * The mode of authentication enabled for this service. The default value is `SERVICE_MANAGED`, which allows you to store and access SFTP user credentials within the service. `API_GATEWAY` indicates that user authentication requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your choice. Using `AWS_DIRECTORY_SERVICE` will allow for authentication against AWS Managed Active Directory or Microsoft Active Directory in your on-premises environment, or in AWS using AD Connectors. Use the `AWS_LAMBDA` value to directly use a Lambda function as your identity provider. If you choose this value, you must specify the ARN for the lambda function in the `function` argument.
     * 
     */
    @Import(name="identityProviderType")
      private final @Nullable Output<String> identityProviderType;

    public Output<String> getIdentityProviderType() {
        return this.identityProviderType == null ? Output.empty() : this.identityProviderType;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM role used to authenticate the user account with an `identity_provider_type` of `API_GATEWAY`.
     * 
     */
    @Import(name="invocationRole")
      private final @Nullable Output<String> invocationRole;

    public Output<String> getInvocationRole() {
        return this.invocationRole == null ? Output.empty() : this.invocationRole;
    }

    /**
     * Amazon Resource Name (ARN) of an IAM role that allows the service to write your SFTP users’ activity to your Amazon CloudWatch logs for monitoring and auditing purposes.
     * 
     */
    @Import(name="loggingRole")
      private final @Nullable Output<String> loggingRole;

    public Output<String> getLoggingRole() {
        return this.loggingRole == null ? Output.empty() : this.loggingRole;
    }

    /**
     * Specifies the file transfer protocol or protocols over which your file transfer protocol client can connect to your server's endpoint. This defaults to `SFTP` . The available protocols are:
     * * `SFTP`: File transfer over SSH
     * * `FTPS`: File transfer with TLS encryption
     * * `FTP`: Unencrypted file transfer
     * 
     */
    @Import(name="protocols")
      private final @Nullable Output<List<String>> protocols;

    public Output<List<String>> getProtocols() {
        return this.protocols == null ? Output.empty() : this.protocols;
    }

    /**
     * Specifies the name of the security policy that is attached to the server. Possible values are `TransferSecurityPolicy-2018-11`, `TransferSecurityPolicy-2020-06`, and  `TransferSecurityPolicy-FIPS-2020-06`. Default value is: `TransferSecurityPolicy-2018-11`.
     * 
     */
    @Import(name="securityPolicyName")
      private final @Nullable Output<String> securityPolicyName;

    public Output<String> getSecurityPolicyName() {
        return this.securityPolicyName == null ? Output.empty() : this.securityPolicyName;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * - URL of the service endpoint used to authenticate users with an `identity_provider_type` of `API_GATEWAY`.
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> getUrl() {
        return this.url == null ? Output.empty() : this.url;
    }

    public ServerArgs(
        @Nullable Output<String> certificate,
        @Nullable Output<String> directoryId,
        @Nullable Output<String> domain,
        @Nullable Output<ServerEndpointDetailsArgs> endpointDetails,
        @Nullable Output<String> endpointType,
        @Nullable Output<Boolean> forceDestroy,
        @Nullable Output<String> function,
        @Nullable Output<String> hostKey,
        @Nullable Output<String> identityProviderType,
        @Nullable Output<String> invocationRole,
        @Nullable Output<String> loggingRole,
        @Nullable Output<List<String>> protocols,
        @Nullable Output<String> securityPolicyName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> url) {
        this.certificate = certificate;
        this.directoryId = directoryId;
        this.domain = domain;
        this.endpointDetails = endpointDetails;
        this.endpointType = endpointType;
        this.forceDestroy = forceDestroy;
        this.function = function;
        this.hostKey = hostKey;
        this.identityProviderType = identityProviderType;
        this.invocationRole = invocationRole;
        this.loggingRole = loggingRole;
        this.protocols = protocols;
        this.securityPolicyName = securityPolicyName;
        this.tags = tags;
        this.url = url;
    }

    private ServerArgs() {
        this.certificate = Output.empty();
        this.directoryId = Output.empty();
        this.domain = Output.empty();
        this.endpointDetails = Output.empty();
        this.endpointType = Output.empty();
        this.forceDestroy = Output.empty();
        this.function = Output.empty();
        this.hostKey = Output.empty();
        this.identityProviderType = Output.empty();
        this.invocationRole = Output.empty();
        this.loggingRole = Output.empty();
        this.protocols = Output.empty();
        this.securityPolicyName = Output.empty();
        this.tags = Output.empty();
        this.url = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificate;
        private @Nullable Output<String> directoryId;
        private @Nullable Output<String> domain;
        private @Nullable Output<ServerEndpointDetailsArgs> endpointDetails;
        private @Nullable Output<String> endpointType;
        private @Nullable Output<Boolean> forceDestroy;
        private @Nullable Output<String> function;
        private @Nullable Output<String> hostKey;
        private @Nullable Output<String> identityProviderType;
        private @Nullable Output<String> invocationRole;
        private @Nullable Output<String> loggingRole;
        private @Nullable Output<List<String>> protocols;
        private @Nullable Output<String> securityPolicyName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.directoryId = defaults.directoryId;
    	      this.domain = defaults.domain;
    	      this.endpointDetails = defaults.endpointDetails;
    	      this.endpointType = defaults.endpointType;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.function = defaults.function;
    	      this.hostKey = defaults.hostKey;
    	      this.identityProviderType = defaults.identityProviderType;
    	      this.invocationRole = defaults.invocationRole;
    	      this.loggingRole = defaults.loggingRole;
    	      this.protocols = defaults.protocols;
    	      this.securityPolicyName = defaults.securityPolicyName;
    	      this.tags = defaults.tags;
    	      this.url = defaults.url;
        }

        public Builder certificate(@Nullable Output<String> certificate) {
            this.certificate = certificate;
            return this;
        }
        public Builder certificate(@Nullable String certificate) {
            this.certificate = Output.ofNullable(certificate);
            return this;
        }
        public Builder directoryId(@Nullable Output<String> directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public Builder directoryId(@Nullable String directoryId) {
            this.directoryId = Output.ofNullable(directoryId);
            return this;
        }
        public Builder domain(@Nullable Output<String> domain) {
            this.domain = domain;
            return this;
        }
        public Builder domain(@Nullable String domain) {
            this.domain = Output.ofNullable(domain);
            return this;
        }
        public Builder endpointDetails(@Nullable Output<ServerEndpointDetailsArgs> endpointDetails) {
            this.endpointDetails = endpointDetails;
            return this;
        }
        public Builder endpointDetails(@Nullable ServerEndpointDetailsArgs endpointDetails) {
            this.endpointDetails = Output.ofNullable(endpointDetails);
            return this;
        }
        public Builder endpointType(@Nullable Output<String> endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public Builder endpointType(@Nullable String endpointType) {
            this.endpointType = Output.ofNullable(endpointType);
            return this;
        }
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }
        public Builder forceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Output.ofNullable(forceDestroy);
            return this;
        }
        public Builder function(@Nullable Output<String> function) {
            this.function = function;
            return this;
        }
        public Builder function(@Nullable String function) {
            this.function = Output.ofNullable(function);
            return this;
        }
        public Builder hostKey(@Nullable Output<String> hostKey) {
            this.hostKey = hostKey;
            return this;
        }
        public Builder hostKey(@Nullable String hostKey) {
            this.hostKey = Output.ofNullable(hostKey);
            return this;
        }
        public Builder identityProviderType(@Nullable Output<String> identityProviderType) {
            this.identityProviderType = identityProviderType;
            return this;
        }
        public Builder identityProviderType(@Nullable String identityProviderType) {
            this.identityProviderType = Output.ofNullable(identityProviderType);
            return this;
        }
        public Builder invocationRole(@Nullable Output<String> invocationRole) {
            this.invocationRole = invocationRole;
            return this;
        }
        public Builder invocationRole(@Nullable String invocationRole) {
            this.invocationRole = Output.ofNullable(invocationRole);
            return this;
        }
        public Builder loggingRole(@Nullable Output<String> loggingRole) {
            this.loggingRole = loggingRole;
            return this;
        }
        public Builder loggingRole(@Nullable String loggingRole) {
            this.loggingRole = Output.ofNullable(loggingRole);
            return this;
        }
        public Builder protocols(@Nullable Output<List<String>> protocols) {
            this.protocols = protocols;
            return this;
        }
        public Builder protocols(@Nullable List<String> protocols) {
            this.protocols = Output.ofNullable(protocols);
            return this;
        }
        public Builder protocols(String... protocols) {
            return protocols(List.of(protocols));
        }
        public Builder securityPolicyName(@Nullable Output<String> securityPolicyName) {
            this.securityPolicyName = securityPolicyName;
            return this;
        }
        public Builder securityPolicyName(@Nullable String securityPolicyName) {
            this.securityPolicyName = Output.ofNullable(securityPolicyName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = Output.ofNullable(url);
            return this;
        }        public ServerArgs build() {
            return new ServerArgs(certificate, directoryId, domain, endpointDetails, endpointType, forceDestroy, function, hostKey, identityProviderType, invocationRole, loggingRole, protocols, securityPolicyName, tags, url);
        }
    }
}