// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleSetArgs Empty = new RuleSetArgs();

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @Import(name="profileName", required=true)
      private final Output<String> profileName;

    public Output<String> getProfileName() {
        return this.profileName;
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
     * Name of the rule set under the profile which is unique globally
     * 
     */
    @Import(name="ruleSetName")
      private final @Nullable Output<String> ruleSetName;

    public Output<String> getRuleSetName() {
        return this.ruleSetName == null ? Output.empty() : this.ruleSetName;
    }

    public RuleSetArgs(
        Output<String> profileName,
        Output<String> resourceGroupName,
        @Nullable Output<String> ruleSetName) {
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleSetName = ruleSetName;
    }

    private RuleSetArgs() {
        this.profileName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.ruleSetName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> profileName;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> ruleSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleSetName = defaults.ruleSetName;
        }

        public Builder profileName(Output<String> profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }
        public Builder profileName(String profileName) {
            this.profileName = Output.of(Objects.requireNonNull(profileName));
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
        public Builder ruleSetName(@Nullable Output<String> ruleSetName) {
            this.ruleSetName = ruleSetName;
            return this;
        }
        public Builder ruleSetName(@Nullable String ruleSetName) {
            this.ruleSetName = Output.ofNullable(ruleSetName);
            return this;
        }        public RuleSetArgs build() {
            return new RuleSetArgs(profileName, resourceGroupName, ruleSetName);
        }
    }
}
