// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.memorydb.inputs;

import io.pulumi.awsnative.memorydb.enums.UserAuthenticationModePropertiesType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthenticationModePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthenticationModePropertiesArgs Empty = new AuthenticationModePropertiesArgs();

    /**
     * Passwords used for this user account. You can create up to two passwords for each user.
     * 
     */
    @InputImport(name="passwords")
      private final @Nullable Output<List<String>> passwords;

    public Output<List<String>> getPasswords() {
        return this.passwords == null ? Output.empty() : this.passwords;
    }

    /**
     * Type of authentication strategy for this user.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Output<UserAuthenticationModePropertiesType> type;

    public Output<UserAuthenticationModePropertiesType> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public AuthenticationModePropertiesArgs(
        @Nullable Output<List<String>> passwords,
        @Nullable Output<UserAuthenticationModePropertiesType> type) {
        this.passwords = passwords;
        this.type = type;
    }

    private AuthenticationModePropertiesArgs() {
        this.passwords = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticationModePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> passwords;
        private @Nullable Output<UserAuthenticationModePropertiesType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthenticationModePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.passwords = defaults.passwords;
    	      this.type = defaults.type;
        }

        public Builder passwords(@Nullable Output<List<String>> passwords) {
            this.passwords = passwords;
            return this;
        }

        public Builder passwords(@Nullable List<String> passwords) {
            this.passwords = Output.ofNullable(passwords);
            return this;
        }

        public Builder type(@Nullable Output<UserAuthenticationModePropertiesType> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable UserAuthenticationModePropertiesType type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public AuthenticationModePropertiesArgs build() {
            return new AuthenticationModePropertiesArgs(passwords, type);
        }
    }
}
