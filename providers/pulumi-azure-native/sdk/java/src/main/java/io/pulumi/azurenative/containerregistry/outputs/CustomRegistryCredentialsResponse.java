// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.SecretObjectResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomRegistryCredentialsResponse {
    private final @Nullable String identity;
    private final @Nullable SecretObjectResponse password;
    private final @Nullable SecretObjectResponse userName;

    @OutputCustomType.Constructor({"identity","password","userName"})
    private CustomRegistryCredentialsResponse(
        @Nullable String identity,
        @Nullable SecretObjectResponse password,
        @Nullable SecretObjectResponse userName) {
        this.identity = identity;
        this.password = password;
        this.userName = userName;
    }

    public Optional<String> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    public Optional<SecretObjectResponse> getPassword() {
        return Optional.ofNullable(this.password);
    }
    public Optional<SecretObjectResponse> getUserName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomRegistryCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String identity;
        private @Nullable SecretObjectResponse password;
        private @Nullable SecretObjectResponse userName;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomRegistryCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.password = defaults.password;
    	      this.userName = defaults.userName;
        }

        public Builder setIdentity(@Nullable String identity) {
            this.identity = identity;
            return this;
        }

        public Builder setPassword(@Nullable SecretObjectResponse password) {
            this.password = password;
            return this;
        }

        public Builder setUserName(@Nullable SecretObjectResponse userName) {
            this.userName = userName;
            return this;
        }

        public CustomRegistryCredentialsResponse build() {
            return new CustomRegistryCredentialsResponse(identity, password, userName);
        }
    }
}
