// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.appplatform.inputs.AppResourcePropertiesArgs;
import io.pulumi.azurenative.appplatform.inputs.ManagedIdentityPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppArgs Empty = new AppArgs();

    @InputImport(name="appName")
    private final @Nullable Input<String> appName;

    public Input<String> getAppName() {
        return this.appName == null ? Input.empty() : this.appName;
    }

    @InputImport(name="identity")
    private final @Nullable Input<ManagedIdentityPropertiesArgs> identity;

    public Input<ManagedIdentityPropertiesArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="properties")
    private final @Nullable Input<AppResourcePropertiesArgs> properties;

    public Input<AppResourcePropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="serviceName", required=true)
    private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    public AppArgs(
        @Nullable Input<String> appName,
        @Nullable Input<ManagedIdentityPropertiesArgs> identity,
        @Nullable Input<String> location,
        @Nullable Input<AppResourcePropertiesArgs> properties,
        Input<String> resourceGroupName,
        Input<String> serviceName) {
        this.appName = appName;
        this.identity = identity;
        this.location = location;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private AppArgs() {
        this.appName = Input.empty();
        this.identity = Input.empty();
        this.location = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> appName;
        private @Nullable Input<ManagedIdentityPropertiesArgs> identity;
        private @Nullable Input<String> location;
        private @Nullable Input<AppResourcePropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private Input<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(AppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appName = defaults.appName;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setAppName(@Nullable Input<String> appName) {
            this.appName = appName;
            return this;
        }

        public Builder setAppName(@Nullable String appName) {
            this.appName = Input.ofNullable(appName);
            return this;
        }

        public Builder setIdentity(@Nullable Input<ManagedIdentityPropertiesArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable ManagedIdentityPropertiesArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProperties(@Nullable Input<AppResourcePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable AppResourcePropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public AppArgs build() {
            return new AppArgs(appName, identity, location, properties, resourceGroupName, serviceName);
        }
    }
}
