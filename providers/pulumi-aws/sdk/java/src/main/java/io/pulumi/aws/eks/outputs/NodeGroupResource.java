// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.aws.eks.outputs.NodeGroupResourceAutoscalingGroup;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeGroupResource {
    /**
     * List of objects containing information about AutoScaling Groups.
     * 
     */
    private final @Nullable List<NodeGroupResourceAutoscalingGroup> autoscalingGroups;
    /**
     * Identifier of the remote access EC2 Security Group.
     * 
     */
    private final @Nullable String remoteAccessSecurityGroupId;

    @CustomType.Constructor
    private NodeGroupResource(
        @CustomType.Parameter("autoscalingGroups") @Nullable List<NodeGroupResourceAutoscalingGroup> autoscalingGroups,
        @CustomType.Parameter("remoteAccessSecurityGroupId") @Nullable String remoteAccessSecurityGroupId) {
        this.autoscalingGroups = autoscalingGroups;
        this.remoteAccessSecurityGroupId = remoteAccessSecurityGroupId;
    }

    /**
     * List of objects containing information about AutoScaling Groups.
     * 
    */
    public List<NodeGroupResourceAutoscalingGroup> getAutoscalingGroups() {
        return this.autoscalingGroups == null ? List.of() : this.autoscalingGroups;
    }
    /**
     * Identifier of the remote access EC2 Security Group.
     * 
    */
    public Optional<String> getRemoteAccessSecurityGroupId() {
        return Optional.ofNullable(this.remoteAccessSecurityGroupId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<NodeGroupResourceAutoscalingGroup> autoscalingGroups;
        private @Nullable String remoteAccessSecurityGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingGroups = defaults.autoscalingGroups;
    	      this.remoteAccessSecurityGroupId = defaults.remoteAccessSecurityGroupId;
        }

        public Builder autoscalingGroups(@Nullable List<NodeGroupResourceAutoscalingGroup> autoscalingGroups) {
            this.autoscalingGroups = autoscalingGroups;
            return this;
        }
        public Builder autoscalingGroups(NodeGroupResourceAutoscalingGroup... autoscalingGroups) {
            return autoscalingGroups(List.of(autoscalingGroups));
        }
        public Builder remoteAccessSecurityGroupId(@Nullable String remoteAccessSecurityGroupId) {
            this.remoteAccessSecurityGroupId = remoteAccessSecurityGroupId;
            return this;
        }        public NodeGroupResource build() {
            return new NodeGroupResource(autoscalingGroups, remoteAccessSecurityGroupId);
        }
    }
}
