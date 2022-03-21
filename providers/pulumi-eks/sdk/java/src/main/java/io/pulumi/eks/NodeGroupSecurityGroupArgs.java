// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.eks;

import io.pulumi.aws.ec2.SecurityGroup;
import io.pulumi.aws.eks.Cluster;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeGroupSecurityGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupSecurityGroupArgs Empty = new NodeGroupSecurityGroupArgs();

    /**
     * The security group associated with the EKS cluster.
     * 
     */
    @Import(name="clusterSecurityGroup", required=true)
      private final Output<SecurityGroup> clusterSecurityGroup;

    public Output<SecurityGroup> getClusterSecurityGroup() {
        return this.clusterSecurityGroup;
    }

    /**
     * The EKS cluster associated with the worker node group
     * 
     */
    @Import(name="eksCluster", required=true)
      private final Output<Cluster> eksCluster;

    public Output<Cluster> getEksCluster() {
        return this.eksCluster;
    }

    /**
     * Key-value mapping of tags to apply to this security group.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The VPC in which to create the worker node group.
     * 
     */
    @Import(name="vpcId", required=true)
      private final Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId;
    }

    public NodeGroupSecurityGroupArgs(
        Output<SecurityGroup> clusterSecurityGroup,
        Output<Cluster> eksCluster,
        @Nullable Output<Map<String,String>> tags,
        Output<String> vpcId) {
        this.clusterSecurityGroup = Objects.requireNonNull(clusterSecurityGroup, "expected parameter 'clusterSecurityGroup' to be non-null");
        this.eksCluster = Objects.requireNonNull(eksCluster, "expected parameter 'eksCluster' to be non-null");
        this.tags = tags;
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private NodeGroupSecurityGroupArgs() {
        this.clusterSecurityGroup = Output.empty();
        this.eksCluster = Output.empty();
        this.tags = Output.empty();
        this.vpcId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupSecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<SecurityGroup> clusterSecurityGroup;
        private Output<Cluster> eksCluster;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupSecurityGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterSecurityGroup = defaults.clusterSecurityGroup;
    	      this.eksCluster = defaults.eksCluster;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder clusterSecurityGroup(Output<SecurityGroup> clusterSecurityGroup) {
            this.clusterSecurityGroup = Objects.requireNonNull(clusterSecurityGroup);
            return this;
        }
        public Builder clusterSecurityGroup(SecurityGroup clusterSecurityGroup) {
            this.clusterSecurityGroup = Output.of(Objects.requireNonNull(clusterSecurityGroup));
            return this;
        }
        public Builder eksCluster(Output<Cluster> eksCluster) {
            this.eksCluster = Objects.requireNonNull(eksCluster);
            return this;
        }
        public Builder eksCluster(Cluster eksCluster) {
            this.eksCluster = Output.of(Objects.requireNonNull(eksCluster));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder vpcId(Output<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Output.of(Objects.requireNonNull(vpcId));
            return this;
        }        public NodeGroupSecurityGroupArgs build() {
            return new NodeGroupSecurityGroupArgs(clusterSecurityGroup, eksCluster, tags, vpcId);
        }
    }
}
