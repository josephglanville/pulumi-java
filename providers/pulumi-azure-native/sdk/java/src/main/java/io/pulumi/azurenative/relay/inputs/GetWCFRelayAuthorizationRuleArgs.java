// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.relay.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetWCFRelayAuthorizationRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWCFRelayAuthorizationRuleArgs Empty = new GetWCFRelayAuthorizationRuleArgs();

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

    @InputImport(name="relayName", required=true)
    private final String relayName;

    public String getRelayName() {
        return this.relayName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetWCFRelayAuthorizationRuleArgs(
        String authorizationRuleName,
        String namespaceName,
        String relayName,
        String resourceGroupName) {
        this.authorizationRuleName = Objects.requireNonNull(authorizationRuleName, "expected parameter 'authorizationRuleName' to be non-null");
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.relayName = Objects.requireNonNull(relayName, "expected parameter 'relayName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetWCFRelayAuthorizationRuleArgs() {
        this.authorizationRuleName = null;
        this.namespaceName = null;
        this.relayName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWCFRelayAuthorizationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationRuleName;
        private String namespaceName;
        private String relayName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWCFRelayAuthorizationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationRuleName = defaults.authorizationRuleName;
    	      this.namespaceName = defaults.namespaceName;
    	      this.relayName = defaults.relayName;
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

        public Builder setRelayName(String relayName) {
            this.relayName = Objects.requireNonNull(relayName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetWCFRelayAuthorizationRuleArgs build() {
            return new GetWCFRelayAuthorizationRuleArgs(authorizationRuleName, namespaceName, relayName, resourceGroupName);
        }
    }
}
