// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.AdminRuleKind;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AdminRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AdminRuleArgs Empty = new AdminRuleArgs();

    /**
     * The name of the network manager security Configuration.
     * 
     */
    @Import(name="configurationName", required=true)
      private final Output<String> configurationName;

    public Output<String> getConfigurationName() {
        return this.configurationName;
    }

    /**
     * Whether the rule is custom or default.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<Either<String,AdminRuleKind>> kind;

    public Output<Either<String,AdminRuleKind>> getKind() {
        return this.kind;
    }

    /**
     * The name of the network manager.
     * 
     */
    @Import(name="networkManagerName", required=true)
      private final Output<String> networkManagerName;

    public Output<String> getNetworkManagerName() {
        return this.networkManagerName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the network manager security Configuration rule collection.
     * 
     */
    @Import(name="ruleCollectionName", required=true)
      private final Output<String> ruleCollectionName;

    public Output<String> getRuleCollectionName() {
        return this.ruleCollectionName;
    }

    /**
     * The name of the rule.
     * 
     */
    @Import(name="ruleName")
      private final @Nullable Output<String> ruleName;

    public Output<String> getRuleName() {
        return this.ruleName == null ? Output.empty() : this.ruleName;
    }

    public AdminRuleArgs(
        Output<String> configurationName,
        Output<Either<String,AdminRuleKind>> kind,
        Output<String> networkManagerName,
        Output<String> resourceGroupName,
        Output<String> ruleCollectionName,
        @Nullable Output<String> ruleName) {
        this.configurationName = Objects.requireNonNull(configurationName, "expected parameter 'configurationName' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.networkManagerName = Objects.requireNonNull(networkManagerName, "expected parameter 'networkManagerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleCollectionName = Objects.requireNonNull(ruleCollectionName, "expected parameter 'ruleCollectionName' to be non-null");
        this.ruleName = ruleName;
    }

    private AdminRuleArgs() {
        this.configurationName = Output.empty();
        this.kind = Output.empty();
        this.networkManagerName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.ruleCollectionName = Output.empty();
        this.ruleName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdminRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> configurationName;
        private Output<Either<String,AdminRuleKind>> kind;
        private Output<String> networkManagerName;
        private Output<String> resourceGroupName;
        private Output<String> ruleCollectionName;
        private @Nullable Output<String> ruleName;

        public Builder() {
    	      // Empty
        }

        public Builder(AdminRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationName = defaults.configurationName;
    	      this.kind = defaults.kind;
    	      this.networkManagerName = defaults.networkManagerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleCollectionName = defaults.ruleCollectionName;
    	      this.ruleName = defaults.ruleName;
        }

        public Builder configurationName(Output<String> configurationName) {
            this.configurationName = Objects.requireNonNull(configurationName);
            return this;
        }
        public Builder configurationName(String configurationName) {
            this.configurationName = Output.of(Objects.requireNonNull(configurationName));
            return this;
        }
        public Builder kind(Output<Either<String,AdminRuleKind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(Either<String,AdminRuleKind> kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder networkManagerName(Output<String> networkManagerName) {
            this.networkManagerName = Objects.requireNonNull(networkManagerName);
            return this;
        }
        public Builder networkManagerName(String networkManagerName) {
            this.networkManagerName = Output.of(Objects.requireNonNull(networkManagerName));
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
        public Builder ruleCollectionName(Output<String> ruleCollectionName) {
            this.ruleCollectionName = Objects.requireNonNull(ruleCollectionName);
            return this;
        }
        public Builder ruleCollectionName(String ruleCollectionName) {
            this.ruleCollectionName = Output.of(Objects.requireNonNull(ruleCollectionName));
            return this;
        }
        public Builder ruleName(@Nullable Output<String> ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public Builder ruleName(@Nullable String ruleName) {
            this.ruleName = Output.ofNullable(ruleName);
            return this;
        }        public AdminRuleArgs build() {
            return new AdminRuleArgs(configurationName, kind, networkManagerName, resourceGroupName, ruleCollectionName, ruleName);
        }
    }
}
