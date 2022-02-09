// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFactoryDataPlaneAccessArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFactoryDataPlaneAccessArgs Empty = new GetFactoryDataPlaneAccessArgs();

    @InputImport(name="accessResourcePath")
    private final @Nullable String accessResourcePath;

    public Optional<String> getAccessResourcePath() {
        return this.accessResourcePath == null ? Optional.empty() : Optional.ofNullable(this.accessResourcePath);
    }

    @InputImport(name="expireTime")
    private final @Nullable String expireTime;

    public Optional<String> getExpireTime() {
        return this.expireTime == null ? Optional.empty() : Optional.ofNullable(this.expireTime);
    }

    @InputImport(name="factoryName", required=true)
    private final String factoryName;

    public String getFactoryName() {
        return this.factoryName;
    }

    @InputImport(name="permissions")
    private final @Nullable String permissions;

    public Optional<String> getPermissions() {
        return this.permissions == null ? Optional.empty() : Optional.ofNullable(this.permissions);
    }

    @InputImport(name="profileName")
    private final @Nullable String profileName;

    public Optional<String> getProfileName() {
        return this.profileName == null ? Optional.empty() : Optional.ofNullable(this.profileName);
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="startTime")
    private final @Nullable String startTime;

    public Optional<String> getStartTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    public GetFactoryDataPlaneAccessArgs(
        @Nullable String accessResourcePath,
        @Nullable String expireTime,
        String factoryName,
        @Nullable String permissions,
        @Nullable String profileName,
        String resourceGroupName,
        @Nullable String startTime) {
        this.accessResourcePath = accessResourcePath;
        this.expireTime = expireTime;
        this.factoryName = Objects.requireNonNull(factoryName, "expected parameter 'factoryName' to be non-null");
        this.permissions = permissions;
        this.profileName = profileName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.startTime = startTime;
    }

    private GetFactoryDataPlaneAccessArgs() {
        this.accessResourcePath = null;
        this.expireTime = null;
        this.factoryName = null;
        this.permissions = null;
        this.profileName = null;
        this.resourceGroupName = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFactoryDataPlaneAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessResourcePath;
        private @Nullable String expireTime;
        private String factoryName;
        private @Nullable String permissions;
        private @Nullable String profileName;
        private String resourceGroupName;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFactoryDataPlaneAccessArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessResourcePath = defaults.accessResourcePath;
    	      this.expireTime = defaults.expireTime;
    	      this.factoryName = defaults.factoryName;
    	      this.permissions = defaults.permissions;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
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

        public Builder setFactoryName(String factoryName) {
            this.factoryName = Objects.requireNonNull(factoryName);
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

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public GetFactoryDataPlaneAccessArgs build() {
            return new GetFactoryDataPlaneAccessArgs(accessResourcePath, expireTime, factoryName, permissions, profileName, resourceGroupName, startTime);
        }
    }
}
