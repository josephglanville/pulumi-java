// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.CustomRuleListArgs;
import io.pulumi.azurenative.network.inputs.FrontDoorPolicySettingsArgs;
import io.pulumi.azurenative.network.inputs.ManagedRuleSetListArgs;
import io.pulumi.azurenative.network.inputs.SkuArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * Describes custom rules inside the policy.
     * 
     */
    @Import(name="customRules")
      private final @Nullable Output<CustomRuleListArgs> customRules;

    public Output<CustomRuleListArgs> getCustomRules() {
        return this.customRules == null ? Output.empty() : this.customRules;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Describes managed rules inside the policy.
     * 
     */
    @Import(name="managedRules")
      private final @Nullable Output<ManagedRuleSetListArgs> managedRules;

    public Output<ManagedRuleSetListArgs> getManagedRules() {
        return this.managedRules == null ? Output.empty() : this.managedRules;
    }

    /**
     * The name of the Web Application Firewall Policy.
     * 
     */
    @Import(name="policyName")
      private final @Nullable Output<String> policyName;

    public Output<String> getPolicyName() {
        return this.policyName == null ? Output.empty() : this.policyName;
    }

    /**
     * Describes settings for the policy.
     * 
     */
    @Import(name="policySettings")
      private final @Nullable Output<FrontDoorPolicySettingsArgs> policySettings;

    public Output<FrontDoorPolicySettingsArgs> getPolicySettings() {
        return this.policySettings == null ? Output.empty() : this.policySettings;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The pricing tier of web application firewall policy. Defaults to Classic_AzureFrontDoor if not specified.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<SkuArgs> sku;

    public Output<SkuArgs> getSku() {
        return this.sku == null ? Output.empty() : this.sku;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public PolicyArgs(
        @Nullable Output<CustomRuleListArgs> customRules,
        @Nullable Output<String> location,
        @Nullable Output<ManagedRuleSetListArgs> managedRules,
        @Nullable Output<String> policyName,
        @Nullable Output<FrontDoorPolicySettingsArgs> policySettings,
        Output<String> resourceGroupName,
        @Nullable Output<SkuArgs> sku,
        @Nullable Output<Map<String,String>> tags) {
        this.customRules = customRules;
        this.location = location;
        this.managedRules = managedRules;
        this.policyName = policyName;
        this.policySettings = policySettings;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
    }

    private PolicyArgs() {
        this.customRules = Output.empty();
        this.location = Output.empty();
        this.managedRules = Output.empty();
        this.policyName = Output.empty();
        this.policySettings = Output.empty();
        this.resourceGroupName = Output.empty();
        this.sku = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CustomRuleListArgs> customRules;
        private @Nullable Output<String> location;
        private @Nullable Output<ManagedRuleSetListArgs> managedRules;
        private @Nullable Output<String> policyName;
        private @Nullable Output<FrontDoorPolicySettingsArgs> policySettings;
        private Output<String> resourceGroupName;
        private @Nullable Output<SkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRules = defaults.customRules;
    	      this.location = defaults.location;
    	      this.managedRules = defaults.managedRules;
    	      this.policyName = defaults.policyName;
    	      this.policySettings = defaults.policySettings;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder customRules(@Nullable Output<CustomRuleListArgs> customRules) {
            this.customRules = customRules;
            return this;
        }
        public Builder customRules(@Nullable CustomRuleListArgs customRules) {
            this.customRules = Output.ofNullable(customRules);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder managedRules(@Nullable Output<ManagedRuleSetListArgs> managedRules) {
            this.managedRules = managedRules;
            return this;
        }
        public Builder managedRules(@Nullable ManagedRuleSetListArgs managedRules) {
            this.managedRules = Output.ofNullable(managedRules);
            return this;
        }
        public Builder policyName(@Nullable Output<String> policyName) {
            this.policyName = policyName;
            return this;
        }
        public Builder policyName(@Nullable String policyName) {
            this.policyName = Output.ofNullable(policyName);
            return this;
        }
        public Builder policySettings(@Nullable Output<FrontDoorPolicySettingsArgs> policySettings) {
            this.policySettings = policySettings;
            return this;
        }
        public Builder policySettings(@Nullable FrontDoorPolicySettingsArgs policySettings) {
            this.policySettings = Output.ofNullable(policySettings);
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
        public Builder sku(@Nullable Output<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }
        public Builder sku(@Nullable SkuArgs sku) {
            this.sku = Output.ofNullable(sku);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public PolicyArgs build() {
            return new PolicyArgs(customRules, location, managedRules, policyName, policySettings, resourceGroupName, sku, tags);
        }
    }
}
