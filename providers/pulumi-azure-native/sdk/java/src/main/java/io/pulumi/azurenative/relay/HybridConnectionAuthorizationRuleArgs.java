// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.relay;

import io.pulumi.azurenative.relay.enums.AccessRights;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HybridConnectionAuthorizationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final HybridConnectionAuthorizationRuleArgs Empty = new HybridConnectionAuthorizationRuleArgs();

    /**
     * The authorization rule name.
     * 
     */
    @InputImport(name="authorizationRuleName")
      private final @Nullable Output<String> authorizationRuleName;

    public Output<String> getAuthorizationRuleName() {
        return this.authorizationRuleName == null ? Output.empty() : this.authorizationRuleName;
    }

    /**
     * The hybrid connection name.
     * 
     */
    @InputImport(name="hybridConnectionName", required=true)
      private final Output<String> hybridConnectionName;

    public Output<String> getHybridConnectionName() {
        return this.hybridConnectionName;
    }

    /**
     * The namespace name
     * 
     */
    @InputImport(name="namespaceName", required=true)
      private final Output<String> namespaceName;

    public Output<String> getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The rights associated with the rule.
     * 
     */
    @InputImport(name="rights", required=true)
      private final Output<List<AccessRights>> rights;

    public Output<List<AccessRights>> getRights() {
        return this.rights;
    }

    public HybridConnectionAuthorizationRuleArgs(
        @Nullable Output<String> authorizationRuleName,
        Output<String> hybridConnectionName,
        Output<String> namespaceName,
        Output<String> resourceGroupName,
        Output<List<AccessRights>> rights) {
        this.authorizationRuleName = authorizationRuleName;
        this.hybridConnectionName = Objects.requireNonNull(hybridConnectionName, "expected parameter 'hybridConnectionName' to be non-null");
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.rights = Objects.requireNonNull(rights, "expected parameter 'rights' to be non-null");
    }

    private HybridConnectionAuthorizationRuleArgs() {
        this.authorizationRuleName = Output.empty();
        this.hybridConnectionName = Output.empty();
        this.namespaceName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.rights = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HybridConnectionAuthorizationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authorizationRuleName;
        private Output<String> hybridConnectionName;
        private Output<String> namespaceName;
        private Output<String> resourceGroupName;
        private Output<List<AccessRights>> rights;

        public Builder() {
    	      // Empty
        }

        public Builder(HybridConnectionAuthorizationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationRuleName = defaults.authorizationRuleName;
    	      this.hybridConnectionName = defaults.hybridConnectionName;
    	      this.namespaceName = defaults.namespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.rights = defaults.rights;
        }

        public Builder authorizationRuleName(@Nullable Output<String> authorizationRuleName) {
            this.authorizationRuleName = authorizationRuleName;
            return this;
        }

        public Builder authorizationRuleName(@Nullable String authorizationRuleName) {
            this.authorizationRuleName = Output.ofNullable(authorizationRuleName);
            return this;
        }

        public Builder hybridConnectionName(Output<String> hybridConnectionName) {
            this.hybridConnectionName = Objects.requireNonNull(hybridConnectionName);
            return this;
        }

        public Builder hybridConnectionName(String hybridConnectionName) {
            this.hybridConnectionName = Output.of(Objects.requireNonNull(hybridConnectionName));
            return this;
        }

        public Builder namespaceName(Output<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Output.of(Objects.requireNonNull(namespaceName));
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

        public Builder rights(Output<List<AccessRights>> rights) {
            this.rights = Objects.requireNonNull(rights);
            return this;
        }

        public Builder rights(List<AccessRights> rights) {
            this.rights = Output.of(Objects.requireNonNull(rights));
            return this;
        }
        public HybridConnectionAuthorizationRuleArgs build() {
            return new HybridConnectionAuthorizationRuleArgs(authorizationRuleName, hybridConnectionName, namespaceName, resourceGroupName, rights);
        }
    }
}
