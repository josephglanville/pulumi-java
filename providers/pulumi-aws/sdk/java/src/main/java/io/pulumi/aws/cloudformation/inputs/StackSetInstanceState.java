// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudformation.inputs;

import io.pulumi.aws.cloudformation.inputs.StackSetInstanceDeploymentTargetsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StackSetInstanceState extends io.pulumi.resources.ResourceArgs {

    public static final StackSetInstanceState Empty = new StackSetInstanceState();

    /**
     * Target AWS Account ID to create a Stack based on the StackSet. Defaults to current account.
     * 
     */
    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId == null ? Output.empty() : this.accountId;
    }

    /**
     * The AWS Organizations accounts to which StackSets deploys. StackSets doesn't deploy stack instances to the organization management account, even if the organization management account is in your organization or in an OU in your organization. Drift detection is not possible for this argument. See deployment_targets below.
     * 
     */
    @Import(name="deploymentTargets")
      private final @Nullable Output<StackSetInstanceDeploymentTargetsGetArgs> deploymentTargets;

    public Output<StackSetInstanceDeploymentTargetsGetArgs> getDeploymentTargets() {
        return this.deploymentTargets == null ? Output.empty() : this.deploymentTargets;
    }

    /**
     * The organization root ID or organizational unit (OU) IDs specified for `deployment_targets`.
     * 
     */
    @Import(name="organizationalUnitId")
      private final @Nullable Output<String> organizationalUnitId;

    public Output<String> getOrganizationalUnitId() {
        return this.organizationalUnitId == null ? Output.empty() : this.organizationalUnitId;
    }

    /**
     * Key-value map of input parameters to override from the StackSet for this Instance.
     * 
     */
    @Import(name="parameterOverrides")
      private final @Nullable Output<Map<String,String>> parameterOverrides;

    public Output<Map<String,String>> getParameterOverrides() {
        return this.parameterOverrides == null ? Output.empty() : this.parameterOverrides;
    }

    /**
     * Target AWS Region to create a Stack based on the StackSet. Defaults to current region.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * During resource destroy, remove Instance from StackSet while keeping the Stack and its associated resources. Must be enabled in the state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new StackSet. Defaults to `false`.
     * 
     */
    @Import(name="retainStack")
      private final @Nullable Output<Boolean> retainStack;

    public Output<Boolean> getRetainStack() {
        return this.retainStack == null ? Output.empty() : this.retainStack;
    }

    /**
     * Stack identifier
     * 
     */
    @Import(name="stackId")
      private final @Nullable Output<String> stackId;

    public Output<String> getStackId() {
        return this.stackId == null ? Output.empty() : this.stackId;
    }

    /**
     * Name of the StackSet.
     * 
     */
    @Import(name="stackSetName")
      private final @Nullable Output<String> stackSetName;

    public Output<String> getStackSetName() {
        return this.stackSetName == null ? Output.empty() : this.stackSetName;
    }

    public StackSetInstanceState(
        @Nullable Output<String> accountId,
        @Nullable Output<StackSetInstanceDeploymentTargetsGetArgs> deploymentTargets,
        @Nullable Output<String> organizationalUnitId,
        @Nullable Output<Map<String,String>> parameterOverrides,
        @Nullable Output<String> region,
        @Nullable Output<Boolean> retainStack,
        @Nullable Output<String> stackId,
        @Nullable Output<String> stackSetName) {
        this.accountId = accountId;
        this.deploymentTargets = deploymentTargets;
        this.organizationalUnitId = organizationalUnitId;
        this.parameterOverrides = parameterOverrides;
        this.region = region;
        this.retainStack = retainStack;
        this.stackId = stackId;
        this.stackSetName = stackSetName;
    }

    private StackSetInstanceState() {
        this.accountId = Output.empty();
        this.deploymentTargets = Output.empty();
        this.organizationalUnitId = Output.empty();
        this.parameterOverrides = Output.empty();
        this.region = Output.empty();
        this.retainStack = Output.empty();
        this.stackId = Output.empty();
        this.stackSetName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackSetInstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private @Nullable Output<StackSetInstanceDeploymentTargetsGetArgs> deploymentTargets;
        private @Nullable Output<String> organizationalUnitId;
        private @Nullable Output<Map<String,String>> parameterOverrides;
        private @Nullable Output<String> region;
        private @Nullable Output<Boolean> retainStack;
        private @Nullable Output<String> stackId;
        private @Nullable Output<String> stackSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(StackSetInstanceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.deploymentTargets = defaults.deploymentTargets;
    	      this.organizationalUnitId = defaults.organizationalUnitId;
    	      this.parameterOverrides = defaults.parameterOverrides;
    	      this.region = defaults.region;
    	      this.retainStack = defaults.retainStack;
    	      this.stackId = defaults.stackId;
    	      this.stackSetName = defaults.stackSetName;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountId(@Nullable String accountId) {
            this.accountId = Output.ofNullable(accountId);
            return this;
        }
        public Builder deploymentTargets(@Nullable Output<StackSetInstanceDeploymentTargetsGetArgs> deploymentTargets) {
            this.deploymentTargets = deploymentTargets;
            return this;
        }
        public Builder deploymentTargets(@Nullable StackSetInstanceDeploymentTargetsGetArgs deploymentTargets) {
            this.deploymentTargets = Output.ofNullable(deploymentTargets);
            return this;
        }
        public Builder organizationalUnitId(@Nullable Output<String> organizationalUnitId) {
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }
        public Builder organizationalUnitId(@Nullable String organizationalUnitId) {
            this.organizationalUnitId = Output.ofNullable(organizationalUnitId);
            return this;
        }
        public Builder parameterOverrides(@Nullable Output<Map<String,String>> parameterOverrides) {
            this.parameterOverrides = parameterOverrides;
            return this;
        }
        public Builder parameterOverrides(@Nullable Map<String,String> parameterOverrides) {
            this.parameterOverrides = Output.ofNullable(parameterOverrides);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }
        public Builder retainStack(@Nullable Output<Boolean> retainStack) {
            this.retainStack = retainStack;
            return this;
        }
        public Builder retainStack(@Nullable Boolean retainStack) {
            this.retainStack = Output.ofNullable(retainStack);
            return this;
        }
        public Builder stackId(@Nullable Output<String> stackId) {
            this.stackId = stackId;
            return this;
        }
        public Builder stackId(@Nullable String stackId) {
            this.stackId = Output.ofNullable(stackId);
            return this;
        }
        public Builder stackSetName(@Nullable Output<String> stackSetName) {
            this.stackSetName = stackSetName;
            return this;
        }
        public Builder stackSetName(@Nullable String stackSetName) {
            this.stackSetName = Output.ofNullable(stackSetName);
            return this;
        }        public StackSetInstanceState build() {
            return new StackSetInstanceState(accountId, deploymentTargets, organizationalUnitId, parameterOverrides, region, retainStack, stackId, stackSetName);
        }
    }
}