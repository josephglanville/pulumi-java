// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


/**
 * The custom setup of running cmdkey commands.
 * 
 */
public final class CmdkeySetupResponse extends io.pulumi.resources.InvokeArgs {

    public static final CmdkeySetupResponse Empty = new CmdkeySetupResponse();

    /**
     * The password of data source access.
     * 
     */
    @InputImport(name="password", required=true)
      private final Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPassword() {
        return this.password;
    }

    /**
     * The server name of data source access.
     * 
     */
    @InputImport(name="targetName", required=true)
      private final Object targetName;

    public Object getTargetName() {
        return this.targetName;
    }

    /**
     * The type of custom setup.
     * Expected value is 'CmdkeySetup'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * The user name of data source access.
     * 
     */
    @InputImport(name="userName", required=true)
      private final Object userName;

    public Object getUserName() {
        return this.userName;
    }

    public CmdkeySetupResponse(
        Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        Object targetName,
        String type,
        Object userName) {
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.targetName = Objects.requireNonNull(targetName, "expected parameter 'targetName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private CmdkeySetupResponse() {
        this.password = null;
        this.targetName = null;
        this.type = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CmdkeySetupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private Object targetName;
        private String type;
        private Object userName;

        public Builder() {
    	      // Empty
        }

        public Builder(CmdkeySetupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.targetName = defaults.targetName;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder setPassword(Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setTargetName(Object targetName) {
            this.targetName = Objects.requireNonNull(targetName);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserName(Object userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public CmdkeySetupResponse build() {
            return new CmdkeySetupResponse(password, targetName, type, userName);
        }
    }
}
