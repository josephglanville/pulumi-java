// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetes.inputs;

import io.pulumi.azurenative.kubernetes.enums.AuthenticationMethod;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ListConnectedClusterUserCredentialArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListConnectedClusterUserCredentialArgs Empty = new ListConnectedClusterUserCredentialArgs();

    /**
     * The mode of client authentication.
     * 
     */
    @Import(name="authenticationMethod", required=true)
      private final Either<String,AuthenticationMethod> authenticationMethod;

    public Either<String,AuthenticationMethod> getAuthenticationMethod() {
        return this.authenticationMethod;
    }

    /**
     * Boolean value to indicate whether the request is for client side proxy or not
     * 
     */
    @Import(name="clientProxy", required=true)
      private final Boolean clientProxy;

    public Boolean getClientProxy() {
        return this.clientProxy;
    }

    /**
     * The name of the Kubernetes cluster on which get is called.
     * 
     */
    @Import(name="clusterName", required=true)
      private final String clusterName;

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListConnectedClusterUserCredentialArgs(
        Either<String,AuthenticationMethod> authenticationMethod,
        Boolean clientProxy,
        String clusterName,
        String resourceGroupName) {
        this.authenticationMethod = Objects.requireNonNull(authenticationMethod, "expected parameter 'authenticationMethod' to be non-null");
        this.clientProxy = Objects.requireNonNull(clientProxy, "expected parameter 'clientProxy' to be non-null");
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListConnectedClusterUserCredentialArgs() {
        this.authenticationMethod = null;
        this.clientProxy = null;
        this.clusterName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListConnectedClusterUserCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Either<String,AuthenticationMethod> authenticationMethod;
        private Boolean clientProxy;
        private String clusterName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListConnectedClusterUserCredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationMethod = defaults.authenticationMethod;
    	      this.clientProxy = defaults.clientProxy;
    	      this.clusterName = defaults.clusterName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder authenticationMethod(Either<String,AuthenticationMethod> authenticationMethod) {
            this.authenticationMethod = Objects.requireNonNull(authenticationMethod);
            return this;
        }
        public Builder clientProxy(Boolean clientProxy) {
            this.clientProxy = Objects.requireNonNull(clientProxy);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public ListConnectedClusterUserCredentialArgs build() {
            return new ListConnectedClusterUserCredentialArgs(authenticationMethod, clientProxy, clusterName, resourceGroupName);
        }
    }
}
