// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorizationArgs Empty = new AuthorizationArgs();

    /**
     * Name of the ExpressRoute Circuit Authorization in the private cloud
     * 
     */
    @Import(name="authorizationName")
      private final @Nullable Output<String> authorizationName;

    public Output<String> getAuthorizationName() {
        return this.authorizationName == null ? Codegen.empty() : this.authorizationName;
    }

    /**
     * The name of the private cloud.
     * 
     */
    @Import(name="privateCloudName", required=true)
      private final Output<String> privateCloudName;

    public Output<String> getPrivateCloudName() {
        return this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public AuthorizationArgs(
        @Nullable Output<String> authorizationName,
        Output<String> privateCloudName,
        Output<String> resourceGroupName) {
        this.authorizationName = authorizationName;
        this.privateCloudName = Objects.requireNonNull(privateCloudName, "expected parameter 'privateCloudName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private AuthorizationArgs() {
        this.authorizationName = Codegen.empty();
        this.privateCloudName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authorizationName;
        private Output<String> privateCloudName;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationName = defaults.authorizationName;
    	      this.privateCloudName = defaults.privateCloudName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder authorizationName(@Nullable Output<String> authorizationName) {
            this.authorizationName = authorizationName;
            return this;
        }
        public Builder authorizationName(@Nullable String authorizationName) {
            this.authorizationName = Codegen.ofNullable(authorizationName);
            return this;
        }
        public Builder privateCloudName(Output<String> privateCloudName) {
            this.privateCloudName = Objects.requireNonNull(privateCloudName);
            return this;
        }
        public Builder privateCloudName(String privateCloudName) {
            this.privateCloudName = Output.of(Objects.requireNonNull(privateCloudName));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public AuthorizationArgs build() {
            return new AuthorizationArgs(authorizationName, privateCloudName, resourceGroupName);
        }
    }
}
