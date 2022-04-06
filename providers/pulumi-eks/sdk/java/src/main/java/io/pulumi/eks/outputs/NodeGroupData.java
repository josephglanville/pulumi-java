// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.eks.outputs;

import io.pulumi.aws.cloudformation.Stack;
import io.pulumi.aws.ec2.SecurityGroup;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class NodeGroupData {
    /**
     * The AutoScalingGroup name for the node group.
     * 
     */
    private final String autoScalingGroupName;
    /**
     * The CloudFormation Stack which defines the Node AutoScalingGroup.
     * 
     */
    private final Stack cfnStack;
    /**
     * The additional security groups for the node group that captures user-specific rules.
     * 
     */
    private final List<SecurityGroup> extraNodeSecurityGroups;
    /**
     * The security group for the node group to communicate with the cluster.
     * 
     */
    private final SecurityGroup nodeSecurityGroup;

    @CustomType.Constructor
    private NodeGroupData(
        @CustomType.Parameter("autoScalingGroupName") String autoScalingGroupName,
        @CustomType.Parameter("cfnStack") Stack cfnStack,
        @CustomType.Parameter("extraNodeSecurityGroups") List<SecurityGroup> extraNodeSecurityGroups,
        @CustomType.Parameter("nodeSecurityGroup") SecurityGroup nodeSecurityGroup) {
        this.autoScalingGroupName = autoScalingGroupName;
        this.cfnStack = cfnStack;
        this.extraNodeSecurityGroups = extraNodeSecurityGroups;
        this.nodeSecurityGroup = nodeSecurityGroup;
    }

    /**
     * The AutoScalingGroup name for the node group.
     * 
    */
    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }
    /**
     * The CloudFormation Stack which defines the Node AutoScalingGroup.
     * 
    */
    public Stack getCfnStack() {
        return this.cfnStack;
    }
    /**
     * The additional security groups for the node group that captures user-specific rules.
     * 
    */
    public List<SecurityGroup> getExtraNodeSecurityGroups() {
        return this.extraNodeSecurityGroups;
    }
    /**
     * The security group for the node group to communicate with the cluster.
     * 
    */
    public SecurityGroup getNodeSecurityGroup() {
        return this.nodeSecurityGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoScalingGroupName;
        private Stack cfnStack;
        private List<SecurityGroup> extraNodeSecurityGroups;
        private SecurityGroup nodeSecurityGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScalingGroupName = defaults.autoScalingGroupName;
    	      this.cfnStack = defaults.cfnStack;
    	      this.extraNodeSecurityGroups = defaults.extraNodeSecurityGroups;
    	      this.nodeSecurityGroup = defaults.nodeSecurityGroup;
        }

        public Builder autoScalingGroupName(String autoScalingGroupName) {
            this.autoScalingGroupName = Objects.requireNonNull(autoScalingGroupName);
            return this;
        }
        public Builder cfnStack(Stack cfnStack) {
            this.cfnStack = Objects.requireNonNull(cfnStack);
            return this;
        }
        public Builder extraNodeSecurityGroups(List<SecurityGroup> extraNodeSecurityGroups) {
            this.extraNodeSecurityGroups = Objects.requireNonNull(extraNodeSecurityGroups);
            return this;
        }
        public Builder extraNodeSecurityGroups(SecurityGroup... extraNodeSecurityGroups) {
            return extraNodeSecurityGroups(List.of(extraNodeSecurityGroups));
        }
        public Builder nodeSecurityGroup(SecurityGroup nodeSecurityGroup) {
            this.nodeSecurityGroup = Objects.requireNonNull(nodeSecurityGroup);
            return this;
        }        public NodeGroupData build() {
            return new NodeGroupData(autoScalingGroupName, cfnStack, extraNodeSecurityGroups, nodeSecurityGroup);
        }
    }
}