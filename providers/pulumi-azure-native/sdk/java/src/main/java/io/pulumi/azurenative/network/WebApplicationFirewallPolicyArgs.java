// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.ManagedRulesDefinitionArgs;
import io.pulumi.azurenative.network.inputs.PolicySettingsArgs;
import io.pulumi.azurenative.network.inputs.WebApplicationFirewallCustomRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebApplicationFirewallPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebApplicationFirewallPolicyArgs Empty = new WebApplicationFirewallPolicyArgs();

    /**
     * The custom rules inside the policy.
     * 
     */
    @InputImport(name="customRules")
      private final @Nullable Input<List<WebApplicationFirewallCustomRuleArgs>> customRules;

    public Input<List<WebApplicationFirewallCustomRuleArgs>> getCustomRules() {
        return this.customRules == null ? Input.empty() : this.customRules;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Describes the managedRules structure.
     * 
     */
    @InputImport(name="managedRules", required=true)
      private final Input<ManagedRulesDefinitionArgs> managedRules;

    public Input<ManagedRulesDefinitionArgs> getManagedRules() {
        return this.managedRules;
    }

    /**
     * The name of the policy.
     * 
     */
    @InputImport(name="policyName")
      private final @Nullable Input<String> policyName;

    public Input<String> getPolicyName() {
        return this.policyName == null ? Input.empty() : this.policyName;
    }

    /**
     * The PolicySettings for policy.
     * 
     */
    @InputImport(name="policySettings")
      private final @Nullable Input<PolicySettingsArgs> policySettings;

    public Input<PolicySettingsArgs> getPolicySettings() {
        return this.policySettings == null ? Input.empty() : this.policySettings;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public WebApplicationFirewallPolicyArgs(
        @Nullable Input<List<WebApplicationFirewallCustomRuleArgs>> customRules,
        @Nullable Input<String> id,
        @Nullable Input<String> location,
        Input<ManagedRulesDefinitionArgs> managedRules,
        @Nullable Input<String> policyName,
        @Nullable Input<PolicySettingsArgs> policySettings,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.customRules = customRules;
        this.id = id;
        this.location = location;
        this.managedRules = Objects.requireNonNull(managedRules, "expected parameter 'managedRules' to be non-null");
        this.policyName = policyName;
        this.policySettings = policySettings;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private WebApplicationFirewallPolicyArgs() {
        this.customRules = Input.empty();
        this.id = Input.empty();
        this.location = Input.empty();
        this.managedRules = Input.empty();
        this.policyName = Input.empty();
        this.policySettings = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebApplicationFirewallPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<WebApplicationFirewallCustomRuleArgs>> customRules;
        private @Nullable Input<String> id;
        private @Nullable Input<String> location;
        private Input<ManagedRulesDefinitionArgs> managedRules;
        private @Nullable Input<String> policyName;
        private @Nullable Input<PolicySettingsArgs> policySettings;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(WebApplicationFirewallPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRules = defaults.customRules;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.managedRules = defaults.managedRules;
    	      this.policyName = defaults.policyName;
    	      this.policySettings = defaults.policySettings;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setCustomRules(@Nullable Input<List<WebApplicationFirewallCustomRuleArgs>> customRules) {
            this.customRules = customRules;
            return this;
        }

        public Builder setCustomRules(@Nullable List<WebApplicationFirewallCustomRuleArgs> customRules) {
            this.customRules = Input.ofNullable(customRules);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
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

        public Builder setManagedRules(Input<ManagedRulesDefinitionArgs> managedRules) {
            this.managedRules = Objects.requireNonNull(managedRules);
            return this;
        }

        public Builder setManagedRules(ManagedRulesDefinitionArgs managedRules) {
            this.managedRules = Input.of(Objects.requireNonNull(managedRules));
            return this;
        }

        public Builder setPolicyName(@Nullable Input<String> policyName) {
            this.policyName = policyName;
            return this;
        }

        public Builder setPolicyName(@Nullable String policyName) {
            this.policyName = Input.ofNullable(policyName);
            return this;
        }

        public Builder setPolicySettings(@Nullable Input<PolicySettingsArgs> policySettings) {
            this.policySettings = policySettings;
            return this;
        }

        public Builder setPolicySettings(@Nullable PolicySettingsArgs policySettings) {
            this.policySettings = Input.ofNullable(policySettings);
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public WebApplicationFirewallPolicyArgs build() {
            return new WebApplicationFirewallPolicyArgs(customRules, id, location, managedRules, policyName, policySettings, resourceGroupName, tags);
        }
    }
}
