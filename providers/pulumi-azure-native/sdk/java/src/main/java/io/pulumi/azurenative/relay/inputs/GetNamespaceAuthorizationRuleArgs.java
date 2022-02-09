// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.relay.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetNamespaceAuthorizationRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNamespaceAuthorizationRuleArgs Empty = new GetNamespaceAuthorizationRuleArgs();

    @InputImport(name="authorizationRuleName", required=true)
    private final String authorizationRuleName;

    public String getAuthorizationRuleName() {
        return this.authorizationRuleName;
    }

    @InputImport(name="namespaceName", required=true)
    private final String namespaceName;

    public String getNamespaceName() {
        return this.namespaceName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetNamespaceAuthorizationRuleArgs(
        String authorizationRuleName,
        String namespaceName,
        String resourceGroupName) {
        this.authorizationRuleName = Objects.requireNonNull(authorizationRuleName, "expected parameter 'authorizationRuleName' to be non-null");
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetNamespaceAuthorizationRuleArgs() {
        this.authorizationRuleName = null;
        this.namespaceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceAuthorizationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationRuleName;
        private String namespaceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamespaceAuthorizationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationRuleName = defaults.authorizationRuleName;
    	      this.namespaceName = defaults.namespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAuthorizationRuleName(String authorizationRuleName) {
            this.authorizationRuleName = Objects.requireNonNull(authorizationRuleName);
            return this;
        }

        public Builder setNamespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetNamespaceAuthorizationRuleArgs build() {
            return new GetNamespaceAuthorizationRuleArgs(authorizationRuleName, namespaceName, resourceGroupName);
        }
    }
}
