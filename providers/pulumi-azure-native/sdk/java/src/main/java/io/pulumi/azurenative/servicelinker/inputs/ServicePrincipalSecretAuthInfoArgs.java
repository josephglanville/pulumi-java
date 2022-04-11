// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicelinker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The authentication info when authType is servicePrincipal secret
 * 
 */
public final class ServicePrincipalSecretAuthInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePrincipalSecretAuthInfoArgs Empty = new ServicePrincipalSecretAuthInfoArgs();

    /**
     * The authentication type.
     * Expected value is 'servicePrincipalSecret'.
     * 
     */
    @Import(name="authType", required=true)
      private final Output<String> authType;

    public Output<String> getAuthType() {
        return this.authType;
    }

    /**
     * ServicePrincipal application clientId for servicePrincipal auth.
     * 
     */
    @Import(name="clientId", required=true)
      private final Output<String> clientId;

    public Output<String> getClientId() {
        return this.clientId;
    }

    /**
     * Principal Id for servicePrincipal auth.
     * 
     */
    @Import(name="principalId", required=true)
      private final Output<String> principalId;

    public Output<String> getPrincipalId() {
        return this.principalId;
    }

    /**
     * Secret for servicePrincipal auth.
     * 
     */
    @Import(name="secret", required=true)
      private final Output<String> secret;

    public Output<String> getSecret() {
        return this.secret;
    }

    public ServicePrincipalSecretAuthInfoArgs(
        Output<String> authType,
        Output<String> clientId,
        Output<String> principalId,
        Output<String> secret) {
        this.authType = Objects.requireNonNull(authType, "expected parameter 'authType' to be non-null");
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.secret = Objects.requireNonNull(secret, "expected parameter 'secret' to be non-null");
    }

    private ServicePrincipalSecretAuthInfoArgs() {
        this.authType = Codegen.empty();
        this.clientId = Codegen.empty();
        this.principalId = Codegen.empty();
        this.secret = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePrincipalSecretAuthInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> authType;
        private Output<String> clientId;
        private Output<String> principalId;
        private Output<String> secret;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePrincipalSecretAuthInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authType = defaults.authType;
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
    	      this.secret = defaults.secret;
        }

        public Builder authType(Output<String> authType) {
            this.authType = Objects.requireNonNull(authType);
            return this;
        }
        public Builder authType(String authType) {
            this.authType = Output.of(Objects.requireNonNull(authType));
            return this;
        }
        public Builder clientId(Output<String> clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder clientId(String clientId) {
            this.clientId = Output.of(Objects.requireNonNull(clientId));
            return this;
        }
        public Builder principalId(Output<String> principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder principalId(String principalId) {
            this.principalId = Output.of(Objects.requireNonNull(principalId));
            return this;
        }
        public Builder secret(Output<String> secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }
        public Builder secret(String secret) {
            this.secret = Output.of(Objects.requireNonNull(secret));
            return this;
        }        public ServicePrincipalSecretAuthInfoArgs build() {
            return new ServicePrincipalSecretAuthInfoArgs(authType, clientId, principalId, secret);
        }
    }
}
