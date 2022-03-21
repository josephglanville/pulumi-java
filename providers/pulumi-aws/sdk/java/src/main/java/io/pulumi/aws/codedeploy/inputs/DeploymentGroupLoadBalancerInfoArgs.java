// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoElbInfoArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupInfoArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentGroupLoadBalancerInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupLoadBalancerInfoArgs Empty = new DeploymentGroupLoadBalancerInfoArgs();

    /**
     * The Classic Elastic Load Balancer to use in a deployment. Conflicts with `target_group_info` and `target_group_pair_info`.
     * 
     */
    @Import(name="elbInfos")
      private final @Nullable Output<List<DeploymentGroupLoadBalancerInfoElbInfoArgs>> elbInfos;

    public Output<List<DeploymentGroupLoadBalancerInfoElbInfoArgs>> getElbInfos() {
        return this.elbInfos == null ? Output.empty() : this.elbInfos;
    }

    /**
     * The (Application/Network Load Balancer) target group to use in a deployment. Conflicts with `elb_info` and `target_group_pair_info`.
     * 
     */
    @Import(name="targetGroupInfos")
      private final @Nullable Output<List<DeploymentGroupLoadBalancerInfoTargetGroupInfoArgs>> targetGroupInfos;

    public Output<List<DeploymentGroupLoadBalancerInfoTargetGroupInfoArgs>> getTargetGroupInfos() {
        return this.targetGroupInfos == null ? Output.empty() : this.targetGroupInfos;
    }

    /**
     * The (Application/Network Load Balancer) target group pair to use in a deployment. Conflicts with `elb_info` and `target_group_info`.
     * 
     */
    @Import(name="targetGroupPairInfo")
      private final @Nullable Output<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs> targetGroupPairInfo;

    public Output<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs> getTargetGroupPairInfo() {
        return this.targetGroupPairInfo == null ? Output.empty() : this.targetGroupPairInfo;
    }

    public DeploymentGroupLoadBalancerInfoArgs(
        @Nullable Output<List<DeploymentGroupLoadBalancerInfoElbInfoArgs>> elbInfos,
        @Nullable Output<List<DeploymentGroupLoadBalancerInfoTargetGroupInfoArgs>> targetGroupInfos,
        @Nullable Output<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs> targetGroupPairInfo) {
        this.elbInfos = elbInfos;
        this.targetGroupInfos = targetGroupInfos;
        this.targetGroupPairInfo = targetGroupPairInfo;
    }

    private DeploymentGroupLoadBalancerInfoArgs() {
        this.elbInfos = Output.empty();
        this.targetGroupInfos = Output.empty();
        this.targetGroupPairInfo = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupLoadBalancerInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DeploymentGroupLoadBalancerInfoElbInfoArgs>> elbInfos;
        private @Nullable Output<List<DeploymentGroupLoadBalancerInfoTargetGroupInfoArgs>> targetGroupInfos;
        private @Nullable Output<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs> targetGroupPairInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupLoadBalancerInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elbInfos = defaults.elbInfos;
    	      this.targetGroupInfos = defaults.targetGroupInfos;
    	      this.targetGroupPairInfo = defaults.targetGroupPairInfo;
        }

        public Builder elbInfos(@Nullable Output<List<DeploymentGroupLoadBalancerInfoElbInfoArgs>> elbInfos) {
            this.elbInfos = elbInfos;
            return this;
        }
        public Builder elbInfos(@Nullable List<DeploymentGroupLoadBalancerInfoElbInfoArgs> elbInfos) {
            this.elbInfos = Output.ofNullable(elbInfos);
            return this;
        }
        public Builder elbInfos(DeploymentGroupLoadBalancerInfoElbInfoArgs... elbInfos) {
            return elbInfos(List.of(elbInfos));
        }
        public Builder targetGroupInfos(@Nullable Output<List<DeploymentGroupLoadBalancerInfoTargetGroupInfoArgs>> targetGroupInfos) {
            this.targetGroupInfos = targetGroupInfos;
            return this;
        }
        public Builder targetGroupInfos(@Nullable List<DeploymentGroupLoadBalancerInfoTargetGroupInfoArgs> targetGroupInfos) {
            this.targetGroupInfos = Output.ofNullable(targetGroupInfos);
            return this;
        }
        public Builder targetGroupInfos(DeploymentGroupLoadBalancerInfoTargetGroupInfoArgs... targetGroupInfos) {
            return targetGroupInfos(List.of(targetGroupInfos));
        }
        public Builder targetGroupPairInfo(@Nullable Output<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs> targetGroupPairInfo) {
            this.targetGroupPairInfo = targetGroupPairInfo;
            return this;
        }
        public Builder targetGroupPairInfo(@Nullable DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs targetGroupPairInfo) {
            this.targetGroupPairInfo = Output.ofNullable(targetGroupPairInfo);
            return this;
        }        public DeploymentGroupLoadBalancerInfoArgs build() {
            return new DeploymentGroupLoadBalancerInfoArgs(elbInfos, targetGroupInfos, targetGroupPairInfo);
        }
    }
}
