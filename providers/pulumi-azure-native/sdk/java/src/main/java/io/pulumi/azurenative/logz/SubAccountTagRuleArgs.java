// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz;

import io.pulumi.azurenative.logz.inputs.MonitoringTagRulesPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubAccountTagRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubAccountTagRuleArgs Empty = new SubAccountTagRuleArgs();

    /**
     * Monitor resource name
     * 
     */
    @InputImport(name="monitorName", required=true)
      private final Output<String> monitorName;

    public Output<String> getMonitorName() {
        return this.monitorName;
    }

    /**
     * Definition of the properties for a TagRules resource.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Output<MonitoringTagRulesPropertiesArgs> properties;

    public Output<MonitoringTagRulesPropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="ruleSetName")
      private final @Nullable Output<String> ruleSetName;

    public Output<String> getRuleSetName() {
        return this.ruleSetName == null ? Output.empty() : this.ruleSetName;
    }

    /**
     * Sub Account resource name
     * 
     */
    @InputImport(name="subAccountName", required=true)
      private final Output<String> subAccountName;

    public Output<String> getSubAccountName() {
        return this.subAccountName;
    }

    public SubAccountTagRuleArgs(
        Output<String> monitorName,
        @Nullable Output<MonitoringTagRulesPropertiesArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<String> ruleSetName,
        Output<String> subAccountName) {
        this.monitorName = Objects.requireNonNull(monitorName, "expected parameter 'monitorName' to be non-null");
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleSetName = ruleSetName;
        this.subAccountName = Objects.requireNonNull(subAccountName, "expected parameter 'subAccountName' to be non-null");
    }

    private SubAccountTagRuleArgs() {
        this.monitorName = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
        this.ruleSetName = Output.empty();
        this.subAccountName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubAccountTagRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> monitorName;
        private @Nullable Output<MonitoringTagRulesPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> ruleSetName;
        private Output<String> subAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(SubAccountTagRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monitorName = defaults.monitorName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleSetName = defaults.ruleSetName;
    	      this.subAccountName = defaults.subAccountName;
        }

        public Builder monitorName(Output<String> monitorName) {
            this.monitorName = Objects.requireNonNull(monitorName);
            return this;
        }

        public Builder monitorName(String monitorName) {
            this.monitorName = Output.of(Objects.requireNonNull(monitorName));
            return this;
        }

        public Builder properties(@Nullable Output<MonitoringTagRulesPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable MonitoringTagRulesPropertiesArgs properties) {
            this.properties = Output.ofNullable(properties);
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
        }

        public Builder subAccountName(Output<String> subAccountName) {
            this.subAccountName = Objects.requireNonNull(subAccountName);
            return this;
        }

        public Builder subAccountName(String subAccountName) {
            this.subAccountName = Output.of(Objects.requireNonNull(subAccountName));
            return this;
        }
        public SubAccountTagRuleArgs build() {
            return new SubAccountTagRuleArgs(monitorName, properties, resourceGroupName, ruleSetName, subAccountName);
        }
    }
}
