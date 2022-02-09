// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRegistryCredentialsResult {
    private final @Nullable String password;
    private final @Nullable String username;

    @OutputCustomType.Constructor({"password","username"})
    private GetRegistryCredentialsResult(
        @Nullable String password,
        @Nullable String username) {
        this.password = password;
        this.username = username;
    }

    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryCredentialsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryCredentialsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }

        public GetRegistryCredentialsResult build() {
            return new GetRegistryCredentialsResult(password, username);
        }
    }
}
