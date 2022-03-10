// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.aws.eks.outputs.GetNodeGroupResourceAutoscalingGroup;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetNodeGroupResource {
    /**
     * List of objects containing information about AutoScaling Groups.
     * 
     */
    private final List<GetNodeGroupResourceAutoscalingGroup> autoscalingGroups;
    /**
     * Identifier of the remote access EC2 Security Group.
     * 
     */
    private final String remoteAccessSecurityGroupId;

    @OutputCustomType.Constructor
    private GetNodeGroupResource(
        @OutputCustomType.Parameter("autoscalingGroups") List<GetNodeGroupResourceAutoscalingGroup> autoscalingGroups,
        @OutputCustomType.Parameter("remoteAccessSecurityGroupId") String remoteAccessSecurityGroupId) {
        this.autoscalingGroups = autoscalingGroups;
        this.remoteAccessSecurityGroupId = remoteAccessSecurityGroupId;
    }

    /**
     * List of objects containing information about AutoScaling Groups.
     * 
    */
    public List<GetNodeGroupResourceAutoscalingGroup> getAutoscalingGroups() {
        return this.autoscalingGroups;
    }
    /**
     * Identifier of the remote access EC2 Security Group.
     * 
    */
    public String getRemoteAccessSecurityGroupId() {
        return this.remoteAccessSecurityGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeGroupResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetNodeGroupResourceAutoscalingGroup> autoscalingGroups;
        private String remoteAccessSecurityGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodeGroupResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingGroups = defaults.autoscalingGroups;
    	      this.remoteAccessSecurityGroupId = defaults.remoteAccessSecurityGroupId;
        }

        public Builder setAutoscalingGroups(List<GetNodeGroupResourceAutoscalingGroup> autoscalingGroups) {
            this.autoscalingGroups = Objects.requireNonNull(autoscalingGroups);
            return this;
        }

        public Builder setRemoteAccessSecurityGroupId(String remoteAccessSecurityGroupId) {
            this.remoteAccessSecurityGroupId = Objects.requireNonNull(remoteAccessSecurityGroupId);
            return this;
        }
        public GetNodeGroupResource build() {
            return new GetNodeGroupResource(autoscalingGroups, remoteAccessSecurityGroupId);
        }
    }
}
