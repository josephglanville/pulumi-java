// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UserAccessPolicyResponse {
    private final @Nullable String accessResourcePath;
    private final @Nullable String expireTime;
    private final @Nullable String permissions;
    private final @Nullable String profileName;
    private final @Nullable String startTime;

    @OutputCustomType.Constructor({"accessResourcePath","expireTime","permissions","profileName","startTime"})
    private UserAccessPolicyResponse(
        @Nullable String accessResourcePath,
        @Nullable String expireTime,
        @Nullable String permissions,
        @Nullable String profileName,
        @Nullable String startTime) {
        this.accessResourcePath = accessResourcePath;
        this.expireTime = expireTime;
        this.permissions = permissions;
        this.profileName = profileName;
        this.startTime = startTime;
    }

    public Optional<String> getAccessResourcePath() {
        return Optional.ofNullable(this.accessResourcePath);
    }
    public Optional<String> getExpireTime() {
        return Optional.ofNullable(this.expireTime);
    }
    public Optional<String> getPermissions() {
        return Optional.ofNullable(this.permissions);
    }
    public Optional<String> getProfileName() {
        return Optional.ofNullable(this.profileName);
    }
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAccessPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessResourcePath;
        private @Nullable String expireTime;
        private @Nullable String permissions;
        private @Nullable String profileName;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAccessPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessResourcePath = defaults.accessResourcePath;
    	      this.expireTime = defaults.expireTime;
    	      this.permissions = defaults.permissions;
    	      this.profileName = defaults.profileName;
    	      this.startTime = defaults.startTime;
        }

        public Builder setAccessResourcePath(@Nullable String accessResourcePath) {
            this.accessResourcePath = accessResourcePath;
            return this;
        }

        public Builder setExpireTime(@Nullable String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        public Builder setPermissions(@Nullable String permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setProfileName(@Nullable String profileName) {
            this.profileName = profileName;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public UserAccessPolicyResponse build() {
            return new UserAccessPolicyResponse(accessResourcePath, expireTime, permissions, profileName, startTime);
        }
    }
}
