// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.appplatform.inputs.AppResourcePropertiesArgs;
import io.pulumi.azurenative.appplatform.inputs.ManagedIdentityPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppArgs Empty = new AppArgs();

    /**
     * The name of the App resource.
     * 
     */
    @Import(name="appName")
      private final @Nullable Output<String> appName;

    public Output<String> getAppName() {
        return this.appName == null ? Codegen.empty() : this.appName;
    }

    /**
     * The Managed Identity type of the app resource
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ManagedIdentityPropertiesArgs> identity;

    public Output<ManagedIdentityPropertiesArgs> getIdentity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * The GEO location of the application, always the same with its parent resource
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Properties of the App resource
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<AppResourcePropertiesArgs> properties;

    public Output<AppResourcePropertiesArgs> getProperties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName;
    }

    public AppArgs(
        @Nullable Output<String> appName,
        @Nullable Output<ManagedIdentityPropertiesArgs> identity,
        @Nullable Output<String> location,
        @Nullable Output<AppResourcePropertiesArgs> properties,
        Output<String> resourceGroupName,
        Output<String> serviceName) {
        this.appName = appName;
        this.identity = identity;
        this.location = location;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private AppArgs() {
        this.appName = Codegen.empty();
        this.identity = Codegen.empty();
        this.location = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serviceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> appName;
        private @Nullable Output<ManagedIdentityPropertiesArgs> identity;
        private @Nullable Output<String> location;
        private @Nullable Output<AppResourcePropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private Output<String> serviceName;

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

        public Builder appName(@Nullable Output<String> appName) {
            this.appName = appName;
            return this;
        }
        public Builder appName(@Nullable String appName) {
            this.appName = Codegen.ofNullable(appName);
            return this;
        }
        public Builder identity(@Nullable Output<ManagedIdentityPropertiesArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable ManagedIdentityPropertiesArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder properties(@Nullable Output<AppResourcePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable AppResourcePropertiesArgs properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }        public AppArgs build() {
            return new AppArgs(appName, identity, location, properties, resourceGroupName, serviceName);
        }
    }
}
