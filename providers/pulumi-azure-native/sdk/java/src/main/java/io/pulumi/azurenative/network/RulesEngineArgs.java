// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.RulesEngineRuleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RulesEngineArgs extends io.pulumi.resources.ResourceArgs {

    public static final RulesEngineArgs Empty = new RulesEngineArgs();

    /**
     * Name of the Front Door which is globally unique.
     * 
     */
    @Import(name="frontDoorName", required=true)
      private final Output<String> frontDoorName;

    public Output<String> getFrontDoorName() {
        return this.frontDoorName;
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
     * A list of rules that define a particular Rules Engine Configuration.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<RulesEngineRuleArgs>> rules;

    public Output<List<RulesEngineRuleArgs>> getRules() {
        return this.rules == null ? Output.empty() : this.rules;
    }

    /**
     * Name of the Rules Engine which is unique within the Front Door.
     * 
     */
    @Import(name="rulesEngineName")
      private final @Nullable Output<String> rulesEngineName;

    public Output<String> getRulesEngineName() {
        return this.rulesEngineName == null ? Output.empty() : this.rulesEngineName;
    }

    public RulesEngineArgs(
        Output<String> frontDoorName,
        Output<String> resourceGroupName,
        @Nullable Output<List<RulesEngineRuleArgs>> rules,
        @Nullable Output<String> rulesEngineName) {
        this.frontDoorName = Objects.requireNonNull(frontDoorName, "expected parameter 'frontDoorName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.rules = rules;
        this.rulesEngineName = rulesEngineName;
    }

    private RulesEngineArgs() {
        this.frontDoorName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.rules = Output.empty();
        this.rulesEngineName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesEngineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> frontDoorName;
        private Output<String> resourceGroupName;
        private @Nullable Output<List<RulesEngineRuleArgs>> rules;
        private @Nullable Output<String> rulesEngineName;

        public Builder() {
    	      // Empty
        }

        public Builder(RulesEngineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frontDoorName = defaults.frontDoorName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.rules = defaults.rules;
    	      this.rulesEngineName = defaults.rulesEngineName;
        }

        public Builder frontDoorName(Output<String> frontDoorName) {
            this.frontDoorName = Objects.requireNonNull(frontDoorName);
            return this;
        }
        public Builder frontDoorName(String frontDoorName) {
            this.frontDoorName = Output.of(Objects.requireNonNull(frontDoorName));
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
        public Builder rules(@Nullable Output<List<RulesEngineRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<RulesEngineRuleArgs> rules) {
            this.rules = Output.ofNullable(rules);
            return this;
        }
        public Builder rules(RulesEngineRuleArgs... rules) {
            return rules(List.of(rules));
        }
        public Builder rulesEngineName(@Nullable Output<String> rulesEngineName) {
            this.rulesEngineName = rulesEngineName;
            return this;
        }
        public Builder rulesEngineName(@Nullable String rulesEngineName) {
            this.rulesEngineName = Output.ofNullable(rulesEngineName);
            return this;
        }        public RulesEngineArgs build() {
            return new RulesEngineArgs(frontDoorName, resourceGroupName, rules, rulesEngineName);
        }
    }
}
