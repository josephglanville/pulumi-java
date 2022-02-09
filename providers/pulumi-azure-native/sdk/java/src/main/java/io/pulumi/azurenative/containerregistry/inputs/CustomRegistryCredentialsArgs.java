// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.SecretObjectArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomRegistryCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomRegistryCredentialsArgs Empty = new CustomRegistryCredentialsArgs();

    @InputImport(name="identity")
    private final @Nullable Input<String> identity;

    public Input<String> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    @InputImport(name="password")
    private final @Nullable Input<SecretObjectArgs> password;

    public Input<SecretObjectArgs> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    @InputImport(name="userName")
    private final @Nullable Input<SecretObjectArgs> userName;

    public Input<SecretObjectArgs> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public CustomRegistryCredentialsArgs(
        @Nullable Input<String> identity,
        @Nullable Input<SecretObjectArgs> password,
        @Nullable Input<SecretObjectArgs> userName) {
        this.identity = identity;
        this.password = password;
        this.userName = userName;
    }

    private CustomRegistryCredentialsArgs() {
        this.identity = Input.empty();
        this.password = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomRegistryCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> identity;
        private @Nullable Input<SecretObjectArgs> password;
        private @Nullable Input<SecretObjectArgs> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomRegistryCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.password = defaults.password;
    	      this.userName = defaults.userName;
        }

        public Builder setIdentity(@Nullable Input<String> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable String identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setPassword(@Nullable Input<SecretObjectArgs> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable SecretObjectArgs password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setUserName(@Nullable Input<SecretObjectArgs> userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserName(@Nullable SecretObjectArgs userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }

        public CustomRegistryCredentialsArgs build() {
            return new CustomRegistryCredentialsArgs(identity, password, userName);
        }
    }
}
