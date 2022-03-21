// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeGroupRemoteAccessGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupRemoteAccessGetArgs Empty = new NodeGroupRemoteAccessGetArgs();

    /**
     * EC2 Key Pair name that provides access for SSH communication with the worker nodes in the EKS Node Group. If you specify this configuration, but do not specify `source_security_group_ids` when you create an EKS Node Group, port 22 on the worker nodes is opened to the Internet (0.0.0.0/0).
     * 
     */
    @Import(name="ec2SshKey")
      private final @Nullable Output<String> ec2SshKey;

    public Output<String> getEc2SshKey() {
        return this.ec2SshKey == null ? Output.empty() : this.ec2SshKey;
    }

    /**
     * Set of EC2 Security Group IDs to allow SSH access (port 22) from on the worker nodes. If you specify `ec2_ssh_key`, but do not specify this configuration when you create an EKS Node Group, port 22 on the worker nodes is opened to the Internet (0.0.0.0/0).
     * 
     */
    @Import(name="sourceSecurityGroupIds")
      private final @Nullable Output<List<String>> sourceSecurityGroupIds;

    public Output<List<String>> getSourceSecurityGroupIds() {
        return this.sourceSecurityGroupIds == null ? Output.empty() : this.sourceSecurityGroupIds;
    }

    public NodeGroupRemoteAccessGetArgs(
        @Nullable Output<String> ec2SshKey,
        @Nullable Output<List<String>> sourceSecurityGroupIds) {
        this.ec2SshKey = ec2SshKey;
        this.sourceSecurityGroupIds = sourceSecurityGroupIds;
    }

    private NodeGroupRemoteAccessGetArgs() {
        this.ec2SshKey = Output.empty();
        this.sourceSecurityGroupIds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupRemoteAccessGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ec2SshKey;
        private @Nullable Output<List<String>> sourceSecurityGroupIds;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupRemoteAccessGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ec2SshKey = defaults.ec2SshKey;
    	      this.sourceSecurityGroupIds = defaults.sourceSecurityGroupIds;
        }

        public Builder ec2SshKey(@Nullable Output<String> ec2SshKey) {
            this.ec2SshKey = ec2SshKey;
            return this;
        }
        public Builder ec2SshKey(@Nullable String ec2SshKey) {
            this.ec2SshKey = Output.ofNullable(ec2SshKey);
            return this;
        }
        public Builder sourceSecurityGroupIds(@Nullable Output<List<String>> sourceSecurityGroupIds) {
            this.sourceSecurityGroupIds = sourceSecurityGroupIds;
            return this;
        }
        public Builder sourceSecurityGroupIds(@Nullable List<String> sourceSecurityGroupIds) {
            this.sourceSecurityGroupIds = Output.ofNullable(sourceSecurityGroupIds);
            return this;
        }
        public Builder sourceSecurityGroupIds(String... sourceSecurityGroupIds) {
            return sourceSecurityGroupIds(List.of(sourceSecurityGroupIds));
        }        public NodeGroupRemoteAccessGetArgs build() {
            return new NodeGroupRemoteAccessGetArgs(ec2SshKey, sourceSecurityGroupIds);
        }
    }
}
