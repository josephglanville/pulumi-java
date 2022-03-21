// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEventHubAuthorizationRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEventHubAuthorizationRuleArgs Empty = new GetEventHubAuthorizationRuleArgs();

    /**
     * The authorization rule name.
     * 
     */
    @Import(name="authorizationRuleName", required=true)
      private final String authorizationRuleName;

    public String getAuthorizationRuleName() {
        return this.authorizationRuleName;
    }

    /**
     * The Event Hub name
     * 
     */
    @Import(name="eventHubName", required=true)
      private final String eventHubName;

    public String getEventHubName() {
        return this.eventHubName;
    }

    /**
     * The Namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
      private final String namespaceName;

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the resource group within the azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetEventHubAuthorizationRuleArgs(
        String authorizationRuleName,
        String eventHubName,
        String namespaceName,
        String resourceGroupName) {
        this.authorizationRuleName = Objects.requireNonNull(authorizationRuleName, "expected parameter 'authorizationRuleName' to be non-null");
        this.eventHubName = Objects.requireNonNull(eventHubName, "expected parameter 'eventHubName' to be non-null");
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetEventHubAuthorizationRuleArgs() {
        this.authorizationRuleName = null;
        this.eventHubName = null;
        this.namespaceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventHubAuthorizationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationRuleName;
        private String eventHubName;
        private String namespaceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventHubAuthorizationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationRuleName = defaults.authorizationRuleName;
    	      this.eventHubName = defaults.eventHubName;
    	      this.namespaceName = defaults.namespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder authorizationRuleName(String authorizationRuleName) {
            this.authorizationRuleName = Objects.requireNonNull(authorizationRuleName);
            return this;
        }
        public Builder eventHubName(String eventHubName) {
            this.eventHubName = Objects.requireNonNull(eventHubName);
            return this;
        }
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetEventHubAuthorizationRuleArgs build() {
            return new GetEventHubAuthorizationRuleArgs(authorizationRuleName, eventHubName, namespaceName, resourceGroupName);
        }
    }
}
