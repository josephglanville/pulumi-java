// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.awsnative.iotsitewise.inputs.AccessPolicyIamRole;
import io.pulumi.awsnative.iotsitewise.inputs.AccessPolicyIamUser;
import io.pulumi.awsnative.iotsitewise.inputs.AccessPolicyUser;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPolicyIdentity extends io.pulumi.resources.InvokeArgs {

    public static final AccessPolicyIdentity Empty = new AccessPolicyIdentity();

    @InputImport(name="iamRole")
    private final @Nullable AccessPolicyIamRole iamRole;

    public Optional<AccessPolicyIamRole> getIamRole() {
        return this.iamRole == null ? Optional.empty() : Optional.ofNullable(this.iamRole);
    }

    @InputImport(name="iamUser")
    private final @Nullable AccessPolicyIamUser iamUser;

    public Optional<AccessPolicyIamUser> getIamUser() {
        return this.iamUser == null ? Optional.empty() : Optional.ofNullable(this.iamUser);
    }

    @InputImport(name="user")
    private final @Nullable AccessPolicyUser user;

    public Optional<AccessPolicyUser> getUser() {
        return this.user == null ? Optional.empty() : Optional.ofNullable(this.user);
    }

    public AccessPolicyIdentity(
        @Nullable AccessPolicyIamRole iamRole,
        @Nullable AccessPolicyIamUser iamUser,
        @Nullable AccessPolicyUser user) {
        this.iamRole = iamRole;
        this.iamUser = iamUser;
        this.user = user;
    }

    private AccessPolicyIdentity() {
        this.iamRole = null;
        this.iamUser = null;
        this.user = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AccessPolicyIamRole iamRole;
        private @Nullable AccessPolicyIamUser iamUser;
        private @Nullable AccessPolicyUser user;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPolicyIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iamRole = defaults.iamRole;
    	      this.iamUser = defaults.iamUser;
    	      this.user = defaults.user;
        }

        public Builder setIamRole(@Nullable AccessPolicyIamRole iamRole) {
            this.iamRole = iamRole;
            return this;
        }

        public Builder setIamUser(@Nullable AccessPolicyIamUser iamUser) {
            this.iamUser = iamUser;
            return this;
        }

        public Builder setUser(@Nullable AccessPolicyUser user) {
            this.user = user;
            return this;
        }

        public AccessPolicyIdentity build() {
            return new AccessPolicyIdentity(iamRole, iamUser, user);
        }
    }
}