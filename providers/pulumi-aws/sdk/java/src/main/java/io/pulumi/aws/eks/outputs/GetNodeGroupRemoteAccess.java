// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetNodeGroupRemoteAccess {
    /**
     * EC2 Key Pair name that provides access for SSH communication with the worker nodes in the EKS Node Group.
     * 
     */
    private final String ec2SshKey;
    /**
     * Set of EC2 Security Group IDs to allow SSH access (port 22) from on the worker nodes.
     * 
     */
    private final List<String> sourceSecurityGroupIds;

    @OutputCustomType.Constructor
    private GetNodeGroupRemoteAccess(
        @OutputCustomType.Parameter("ec2SshKey") String ec2SshKey,
        @OutputCustomType.Parameter("sourceSecurityGroupIds") List<String> sourceSecurityGroupIds) {
        this.ec2SshKey = ec2SshKey;
        this.sourceSecurityGroupIds = sourceSecurityGroupIds;
    }

    /**
     * EC2 Key Pair name that provides access for SSH communication with the worker nodes in the EKS Node Group.
     * 
    */
    public String getEc2SshKey() {
        return this.ec2SshKey;
    }
    /**
     * Set of EC2 Security Group IDs to allow SSH access (port 22) from on the worker nodes.
     * 
    */
    public List<String> getSourceSecurityGroupIds() {
        return this.sourceSecurityGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeGroupRemoteAccess defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ec2SshKey;
        private List<String> sourceSecurityGroupIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodeGroupRemoteAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ec2SshKey = defaults.ec2SshKey;
    	      this.sourceSecurityGroupIds = defaults.sourceSecurityGroupIds;
        }

        public Builder setEc2SshKey(String ec2SshKey) {
            this.ec2SshKey = Objects.requireNonNull(ec2SshKey);
            return this;
        }

        public Builder setSourceSecurityGroupIds(List<String> sourceSecurityGroupIds) {
            this.sourceSecurityGroupIds = Objects.requireNonNull(sourceSecurityGroupIds);
            return this;
        }
        public GetNodeGroupRemoteAccess build() {
            return new GetNodeGroupRemoteAccess(ec2SshKey, sourceSecurityGroupIds);
        }
    }
}
