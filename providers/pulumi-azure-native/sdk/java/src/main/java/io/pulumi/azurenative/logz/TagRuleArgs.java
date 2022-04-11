// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz;

import io.pulumi.azurenative.logz.inputs.MonitoringTagRulesPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagRuleArgs Empty = new TagRuleArgs();

    /**
     * Monitor resource name
     * 
     */
    @Import(name="monitorName", required=true)
      private final Output<String> monitorName;

    public Output<String> getMonitorName() {
        return this.monitorName;
    }

    /**
     * Definition of the properties for a TagRules resource.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<MonitoringTagRulesPropertiesArgs> properties;

    public Output<MonitoringTagRulesPropertiesArgs> getProperties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="ruleSetName")
      private final @Nullable Output<String> ruleSetName;

    public Output<String> getRuleSetName() {
        return this.ruleSetName == null ? Codegen.empty() : this.ruleSetName;
    }

    public TagRuleArgs(
        Output<String> monitorName,
        @Nullable Output<MonitoringTagRulesPropertiesArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<String> ruleSetName) {
        this.monitorName = Objects.requireNonNull(monitorName, "expected parameter 'monitorName' to be non-null");
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleSetName = ruleSetName;
    }

    private TagRuleArgs() {
        this.monitorName = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.ruleSetName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> monitorName;
        private @Nullable Output<MonitoringTagRulesPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> ruleSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(TagRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monitorName = defaults.monitorName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleSetName = defaults.ruleSetName;
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
            this.properties = Codegen.ofNullable(properties);
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
            this.ruleSetName = Codegen.ofNullable(ruleSetName);
            return this;
        }        public TagRuleArgs build() {
            return new TagRuleArgs(monitorName, properties, resourceGroupName, ruleSetName);
        }
    }
}
