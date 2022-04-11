// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * User identity details.
 * 
 */
public final class UserIdentityContractArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserIdentityContractArgs Empty = new UserIdentityContractArgs();

    /**
     * Identifier value within provider.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * Identity provider name.
     * 
     */
    @Import(name="provider")
      private final @Nullable Output<String> provider;

    public Output<String> getProvider() {
        return this.provider == null ? Codegen.empty() : this.provider;
    }

    public UserIdentityContractArgs(
        @Nullable Output<String> id,
        @Nullable Output<String> provider) {
        this.id = id;
        this.provider = provider;
    }

    private UserIdentityContractArgs() {
        this.id = Codegen.empty();
        this.provider = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserIdentityContractArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<String> provider;

        public Builder() {
    	      // Empty
        }

        public Builder(UserIdentityContractArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.provider = defaults.provider;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder provider(@Nullable Output<String> provider) {
            this.provider = provider;
            return this;
        }
        public Builder provider(@Nullable String provider) {
            this.provider = Codegen.ofNullable(provider);
            return this;
        }        public UserIdentityContractArgs build() {
            return new UserIdentityContractArgs(id, provider);
        }
    }
}
