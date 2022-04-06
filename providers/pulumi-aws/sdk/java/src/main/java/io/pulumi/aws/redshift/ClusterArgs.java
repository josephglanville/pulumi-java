// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift;

import io.pulumi.aws.redshift.inputs.ClusterLoggingArgs;
import io.pulumi.aws.redshift.inputs.ClusterSnapshotCopyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * If true , major version upgrades can be applied during the maintenance window to the Amazon Redshift engine that is running on the cluster. Default is true
     * 
     */
    @Import(name="allowVersionUpgrade")
      private final @Nullable Output<Boolean> allowVersionUpgrade;

    public Output<Boolean> getAllowVersionUpgrade() {
        return this.allowVersionUpgrade == null ? Output.empty() : this.allowVersionUpgrade;
    }

    /**
     * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want with create-cluster-snapshot. Default is 1.
     * 
     */
    @Import(name="automatedSnapshotRetentionPeriod")
      private final @Nullable Output<Integer> automatedSnapshotRetentionPeriod;

    public Output<Integer> getAutomatedSnapshotRetentionPeriod() {
        return this.automatedSnapshotRetentionPeriod == null ? Output.empty() : this.automatedSnapshotRetentionPeriod;
    }

    /**
     * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. For example, if you have several EC2 instances running in a specific Availability Zone, then you might want the cluster to be provisioned in the same zone in order to decrease network latency.
     * 
     */
    @Import(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Output.empty() : this.availabilityZone;
    }

    /**
     * The Cluster Identifier. Must be a lower case
     * string.
     * 
     */
    @Import(name="clusterIdentifier", required=true)
      private final Output<String> clusterIdentifier;

    public Output<String> getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * The name of the parameter group to be associated with this cluster.
     * 
     */
    @Import(name="clusterParameterGroupName")
      private final @Nullable Output<String> clusterParameterGroupName;

    public Output<String> getClusterParameterGroupName() {
        return this.clusterParameterGroupName == null ? Output.empty() : this.clusterParameterGroupName;
    }

    /**
     * The public key for the cluster
     * 
     */
    @Import(name="clusterPublicKey")
      private final @Nullable Output<String> clusterPublicKey;

    public Output<String> getClusterPublicKey() {
        return this.clusterPublicKey == null ? Output.empty() : this.clusterPublicKey;
    }

    /**
     * The specific revision number of the database in the cluster
     * 
     */
    @Import(name="clusterRevisionNumber")
      private final @Nullable Output<String> clusterRevisionNumber;

    public Output<String> getClusterRevisionNumber() {
        return this.clusterRevisionNumber == null ? Output.empty() : this.clusterRevisionNumber;
    }

    /**
     * A list of security groups to be associated with this cluster.
     * 
     */
    @Import(name="clusterSecurityGroups")
      private final @Nullable Output<List<String>> clusterSecurityGroups;

    public Output<List<String>> getClusterSecurityGroups() {
        return this.clusterSecurityGroups == null ? Output.empty() : this.clusterSecurityGroups;
    }

    /**
     * The name of a cluster subnet group to be associated with this cluster. If this parameter is not provided the resulting cluster will be deployed outside virtual private cloud (VPC).
     * 
     */
    @Import(name="clusterSubnetGroupName")
      private final @Nullable Output<String> clusterSubnetGroupName;

    public Output<String> getClusterSubnetGroupName() {
        return this.clusterSubnetGroupName == null ? Output.empty() : this.clusterSubnetGroupName;
    }

    /**
     * The cluster type to use. Either `single-node` or `multi-node`.
     * 
     */
    @Import(name="clusterType")
      private final @Nullable Output<String> clusterType;

    public Output<String> getClusterType() {
        return this.clusterType == null ? Output.empty() : this.clusterType;
    }

    /**
     * The version of the Amazon Redshift engine software that you want to deploy on the cluster.
     * The version selected runs on all the nodes in the cluster.
     * 
     */
    @Import(name="clusterVersion")
      private final @Nullable Output<String> clusterVersion;

    public Output<String> getClusterVersion() {
        return this.clusterVersion == null ? Output.empty() : this.clusterVersion;
    }

    /**
     * The name of the first database to be created when the cluster is created.
     * If you do not provide a name, Amazon Redshift will create a default database called `dev`.
     * 
     */
    @Import(name="databaseName")
      private final @Nullable Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName == null ? Output.empty() : this.databaseName;
    }

    /**
     * The Elastic IP (EIP) address for the cluster.
     * 
     */
    @Import(name="elasticIp")
      private final @Nullable Output<String> elasticIp;

    public Output<String> getElasticIp() {
        return this.elasticIp == null ? Output.empty() : this.elasticIp;
    }

    /**
     * If true , the data in the cluster is encrypted at rest.
     * 
     */
    @Import(name="encrypted")
      private final @Nullable Output<Boolean> encrypted;

    public Output<Boolean> getEncrypted() {
        return this.encrypted == null ? Output.empty() : this.encrypted;
    }

    /**
     * The connection endpoint
     * 
     */
    @Import(name="endpoint")
      private final @Nullable Output<String> endpoint;

    public Output<String> getEndpoint() {
        return this.endpoint == null ? Output.empty() : this.endpoint;
    }

    /**
     * If true , enhanced VPC routing is enabled.
     * 
     */
    @Import(name="enhancedVpcRouting")
      private final @Nullable Output<Boolean> enhancedVpcRouting;

    public Output<Boolean> getEnhancedVpcRouting() {
        return this.enhancedVpcRouting == null ? Output.empty() : this.enhancedVpcRouting;
    }

    /**
     * The identifier of the final snapshot that is to be created immediately before deleting the cluster. If this parameter is provided, `skip_final_snapshot` must be false.
     * 
     */
    @Import(name="finalSnapshotIdentifier")
      private final @Nullable Output<String> finalSnapshotIdentifier;

    public Output<String> getFinalSnapshotIdentifier() {
        return this.finalSnapshotIdentifier == null ? Output.empty() : this.finalSnapshotIdentifier;
    }

    /**
     * A list of IAM Role ARNs to associate with the cluster. A Maximum of 10 can be associated to the cluster at any time.
     * 
     */
    @Import(name="iamRoles")
      private final @Nullable Output<List<String>> iamRoles;

    public Output<List<String>> getIamRoles() {
        return this.iamRoles == null ? Output.empty() : this.iamRoles;
    }

    /**
     * The ARN for the KMS encryption key. When specifying `kms_key_id`, `encrypted` needs to be set to true.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Output.empty() : this.kmsKeyId;
    }

    /**
     * Logging, documented below.
     * 
     */
    @Import(name="logging")
      private final @Nullable Output<ClusterLoggingArgs> logging;

    public Output<ClusterLoggingArgs> getLogging() {
        return this.logging == null ? Output.empty() : this.logging;
    }

    /**
     * Password for the master DB user.
     * Note that this may show up in logs, and it will be stored in the state file. Password must contain at least 8 chars and
     * contain at least one uppercase letter, one lowercase letter, and one number.
     * 
     */
    @Import(name="masterPassword")
      private final @Nullable Output<String> masterPassword;

    public Output<String> getMasterPassword() {
        return this.masterPassword == null ? Output.empty() : this.masterPassword;
    }

    /**
     * Username for the master DB user.
     * 
     */
    @Import(name="masterUsername")
      private final @Nullable Output<String> masterUsername;

    public Output<String> getMasterUsername() {
        return this.masterUsername == null ? Output.empty() : this.masterUsername;
    }

    /**
     * The node type to be provisioned for the cluster.
     * 
     */
    @Import(name="nodeType", required=true)
      private final Output<String> nodeType;

    public Output<String> getNodeType() {
        return this.nodeType;
    }

    /**
     * The number of compute nodes in the cluster. This parameter is required when the ClusterType parameter is specified as multi-node. Default is 1.
     * 
     */
    @Import(name="numberOfNodes")
      private final @Nullable Output<Integer> numberOfNodes;

    public Output<Integer> getNumberOfNodes() {
        return this.numberOfNodes == null ? Output.empty() : this.numberOfNodes;
    }

    /**
     * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not own, optional if you own the snapshot.
     * 
     */
    @Import(name="ownerAccount")
      private final @Nullable Output<String> ownerAccount;

    public Output<String> getOwnerAccount() {
        return this.ownerAccount == null ? Output.empty() : this.ownerAccount;
    }

    /**
     * The port number on which the cluster accepts incoming connections.
     * The cluster is accessible only via the JDBC and ODBC connection strings. Part of the connection string requires the port on which the cluster will listen for incoming connections. Default port is 5439.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    /**
     * The weekly time range (in UTC) during which automated cluster maintenance can occur.
     * Format: ddd:hh24:mi-ddd:hh24:mi
     * 
     */
    @Import(name="preferredMaintenanceWindow")
      private final @Nullable Output<String> preferredMaintenanceWindow;

    public Output<String> getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow == null ? Output.empty() : this.preferredMaintenanceWindow;
    }

    /**
     * If true, the cluster can be accessed from a public network. Default is `true`.
     * 
     */
    @Import(name="publiclyAccessible")
      private final @Nullable Output<Boolean> publiclyAccessible;

    public Output<Boolean> getPubliclyAccessible() {
        return this.publiclyAccessible == null ? Output.empty() : this.publiclyAccessible;
    }

    /**
     * Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster. If true , a final cluster snapshot is not created. If false , a final cluster snapshot is created before the cluster is deleted. Default is false.
     * 
     */
    @Import(name="skipFinalSnapshot")
      private final @Nullable Output<Boolean> skipFinalSnapshot;

    public Output<Boolean> getSkipFinalSnapshot() {
        return this.skipFinalSnapshot == null ? Output.empty() : this.skipFinalSnapshot;
    }

    /**
     * The name of the cluster the source snapshot was created from.
     * 
     */
    @Import(name="snapshotClusterIdentifier")
      private final @Nullable Output<String> snapshotClusterIdentifier;

    public Output<String> getSnapshotClusterIdentifier() {
        return this.snapshotClusterIdentifier == null ? Output.empty() : this.snapshotClusterIdentifier;
    }

    /**
     * Configuration of automatic copy of snapshots from one region to another. Documented below.
     * 
     */
    @Import(name="snapshotCopy")
      private final @Nullable Output<ClusterSnapshotCopyArgs> snapshotCopy;

    public Output<ClusterSnapshotCopyArgs> getSnapshotCopy() {
        return this.snapshotCopy == null ? Output.empty() : this.snapshotCopy;
    }

    /**
     * The name of the snapshot from which to create the new cluster.
     * 
     */
    @Import(name="snapshotIdentifier")
      private final @Nullable Output<String> snapshotIdentifier;

    public Output<String> getSnapshotIdentifier() {
        return this.snapshotIdentifier == null ? Output.empty() : this.snapshotIdentifier;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
     * 
     */
    @Import(name="vpcSecurityGroupIds")
      private final @Nullable Output<List<String>> vpcSecurityGroupIds;

    public Output<List<String>> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds == null ? Output.empty() : this.vpcSecurityGroupIds;
    }

    public ClusterArgs(
        @Nullable Output<Boolean> allowVersionUpgrade,
        @Nullable Output<Integer> automatedSnapshotRetentionPeriod,
        @Nullable Output<String> availabilityZone,
        Output<String> clusterIdentifier,
        @Nullable Output<String> clusterParameterGroupName,
        @Nullable Output<String> clusterPublicKey,
        @Nullable Output<String> clusterRevisionNumber,
        @Nullable Output<List<String>> clusterSecurityGroups,
        @Nullable Output<String> clusterSubnetGroupName,
        @Nullable Output<String> clusterType,
        @Nullable Output<String> clusterVersion,
        @Nullable Output<String> databaseName,
        @Nullable Output<String> elasticIp,
        @Nullable Output<Boolean> encrypted,
        @Nullable Output<String> endpoint,
        @Nullable Output<Boolean> enhancedVpcRouting,
        @Nullable Output<String> finalSnapshotIdentifier,
        @Nullable Output<List<String>> iamRoles,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<ClusterLoggingArgs> logging,
        @Nullable Output<String> masterPassword,
        @Nullable Output<String> masterUsername,
        Output<String> nodeType,
        @Nullable Output<Integer> numberOfNodes,
        @Nullable Output<String> ownerAccount,
        @Nullable Output<Integer> port,
        @Nullable Output<String> preferredMaintenanceWindow,
        @Nullable Output<Boolean> publiclyAccessible,
        @Nullable Output<Boolean> skipFinalSnapshot,
        @Nullable Output<String> snapshotClusterIdentifier,
        @Nullable Output<ClusterSnapshotCopyArgs> snapshotCopy,
        @Nullable Output<String> snapshotIdentifier,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<String>> vpcSecurityGroupIds) {
        this.allowVersionUpgrade = allowVersionUpgrade;
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
        this.availabilityZone = availabilityZone;
        this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
        this.clusterParameterGroupName = clusterParameterGroupName;
        this.clusterPublicKey = clusterPublicKey;
        this.clusterRevisionNumber = clusterRevisionNumber;
        this.clusterSecurityGroups = clusterSecurityGroups;
        this.clusterSubnetGroupName = clusterSubnetGroupName;
        this.clusterType = clusterType;
        this.clusterVersion = clusterVersion;
        this.databaseName = databaseName;
        this.elasticIp = elasticIp;
        this.encrypted = encrypted;
        this.endpoint = endpoint;
        this.enhancedVpcRouting = enhancedVpcRouting;
        this.finalSnapshotIdentifier = finalSnapshotIdentifier;
        this.iamRoles = iamRoles;
        this.kmsKeyId = kmsKeyId;
        this.logging = logging;
        this.masterPassword = masterPassword;
        this.masterUsername = masterUsername;
        this.nodeType = Objects.requireNonNull(nodeType, "expected parameter 'nodeType' to be non-null");
        this.numberOfNodes = numberOfNodes;
        this.ownerAccount = ownerAccount;
        this.port = port;
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        this.publiclyAccessible = publiclyAccessible;
        this.skipFinalSnapshot = skipFinalSnapshot;
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
        this.snapshotCopy = snapshotCopy;
        this.snapshotIdentifier = snapshotIdentifier;
        this.tags = tags;
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
    }

    private ClusterArgs() {
        this.allowVersionUpgrade = Output.empty();
        this.automatedSnapshotRetentionPeriod = Output.empty();
        this.availabilityZone = Output.empty();
        this.clusterIdentifier = Output.empty();
        this.clusterParameterGroupName = Output.empty();
        this.clusterPublicKey = Output.empty();
        this.clusterRevisionNumber = Output.empty();
        this.clusterSecurityGroups = Output.empty();
        this.clusterSubnetGroupName = Output.empty();
        this.clusterType = Output.empty();
        this.clusterVersion = Output.empty();
        this.databaseName = Output.empty();
        this.elasticIp = Output.empty();
        this.encrypted = Output.empty();
        this.endpoint = Output.empty();
        this.enhancedVpcRouting = Output.empty();
        this.finalSnapshotIdentifier = Output.empty();
        this.iamRoles = Output.empty();
        this.kmsKeyId = Output.empty();
        this.logging = Output.empty();
        this.masterPassword = Output.empty();
        this.masterUsername = Output.empty();
        this.nodeType = Output.empty();
        this.numberOfNodes = Output.empty();
        this.ownerAccount = Output.empty();
        this.port = Output.empty();
        this.preferredMaintenanceWindow = Output.empty();
        this.publiclyAccessible = Output.empty();
        this.skipFinalSnapshot = Output.empty();
        this.snapshotClusterIdentifier = Output.empty();
        this.snapshotCopy = Output.empty();
        this.snapshotIdentifier = Output.empty();
        this.tags = Output.empty();
        this.vpcSecurityGroupIds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowVersionUpgrade;
        private @Nullable Output<Integer> automatedSnapshotRetentionPeriod;
        private @Nullable Output<String> availabilityZone;
        private Output<String> clusterIdentifier;
        private @Nullable Output<String> clusterParameterGroupName;
        private @Nullable Output<String> clusterPublicKey;
        private @Nullable Output<String> clusterRevisionNumber;
        private @Nullable Output<List<String>> clusterSecurityGroups;
        private @Nullable Output<String> clusterSubnetGroupName;
        private @Nullable Output<String> clusterType;
        private @Nullable Output<String> clusterVersion;
        private @Nullable Output<String> databaseName;
        private @Nullable Output<String> elasticIp;
        private @Nullable Output<Boolean> encrypted;
        private @Nullable Output<String> endpoint;
        private @Nullable Output<Boolean> enhancedVpcRouting;
        private @Nullable Output<String> finalSnapshotIdentifier;
        private @Nullable Output<List<String>> iamRoles;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<ClusterLoggingArgs> logging;
        private @Nullable Output<String> masterPassword;
        private @Nullable Output<String> masterUsername;
        private Output<String> nodeType;
        private @Nullable Output<Integer> numberOfNodes;
        private @Nullable Output<String> ownerAccount;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> preferredMaintenanceWindow;
        private @Nullable Output<Boolean> publiclyAccessible;
        private @Nullable Output<Boolean> skipFinalSnapshot;
        private @Nullable Output<String> snapshotClusterIdentifier;
        private @Nullable Output<ClusterSnapshotCopyArgs> snapshotCopy;
        private @Nullable Output<String> snapshotIdentifier;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<String>> vpcSecurityGroupIds;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowVersionUpgrade = defaults.allowVersionUpgrade;
    	      this.automatedSnapshotRetentionPeriod = defaults.automatedSnapshotRetentionPeriod;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.clusterParameterGroupName = defaults.clusterParameterGroupName;
    	      this.clusterPublicKey = defaults.clusterPublicKey;
    	      this.clusterRevisionNumber = defaults.clusterRevisionNumber;
    	      this.clusterSecurityGroups = defaults.clusterSecurityGroups;
    	      this.clusterSubnetGroupName = defaults.clusterSubnetGroupName;
    	      this.clusterType = defaults.clusterType;
    	      this.clusterVersion = defaults.clusterVersion;
    	      this.databaseName = defaults.databaseName;
    	      this.elasticIp = defaults.elasticIp;
    	      this.encrypted = defaults.encrypted;
    	      this.endpoint = defaults.endpoint;
    	      this.enhancedVpcRouting = defaults.enhancedVpcRouting;
    	      this.finalSnapshotIdentifier = defaults.finalSnapshotIdentifier;
    	      this.iamRoles = defaults.iamRoles;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.logging = defaults.logging;
    	      this.masterPassword = defaults.masterPassword;
    	      this.masterUsername = defaults.masterUsername;
    	      this.nodeType = defaults.nodeType;
    	      this.numberOfNodes = defaults.numberOfNodes;
    	      this.ownerAccount = defaults.ownerAccount;
    	      this.port = defaults.port;
    	      this.preferredMaintenanceWindow = defaults.preferredMaintenanceWindow;
    	      this.publiclyAccessible = defaults.publiclyAccessible;
    	      this.skipFinalSnapshot = defaults.skipFinalSnapshot;
    	      this.snapshotClusterIdentifier = defaults.snapshotClusterIdentifier;
    	      this.snapshotCopy = defaults.snapshotCopy;
    	      this.snapshotIdentifier = defaults.snapshotIdentifier;
    	      this.tags = defaults.tags;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
        }

        public Builder allowVersionUpgrade(@Nullable Output<Boolean> allowVersionUpgrade) {
            this.allowVersionUpgrade = allowVersionUpgrade;
            return this;
        }
        public Builder allowVersionUpgrade(@Nullable Boolean allowVersionUpgrade) {
            this.allowVersionUpgrade = Output.ofNullable(allowVersionUpgrade);
            return this;
        }
        public Builder automatedSnapshotRetentionPeriod(@Nullable Output<Integer> automatedSnapshotRetentionPeriod) {
            this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
            return this;
        }
        public Builder automatedSnapshotRetentionPeriod(@Nullable Integer automatedSnapshotRetentionPeriod) {
            this.automatedSnapshotRetentionPeriod = Output.ofNullable(automatedSnapshotRetentionPeriod);
            return this;
        }
        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Output.ofNullable(availabilityZone);
            return this;
        }
        public Builder clusterIdentifier(Output<String> clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }
        public Builder clusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Output.of(Objects.requireNonNull(clusterIdentifier));
            return this;
        }
        public Builder clusterParameterGroupName(@Nullable Output<String> clusterParameterGroupName) {
            this.clusterParameterGroupName = clusterParameterGroupName;
            return this;
        }
        public Builder clusterParameterGroupName(@Nullable String clusterParameterGroupName) {
            this.clusterParameterGroupName = Output.ofNullable(clusterParameterGroupName);
            return this;
        }
        public Builder clusterPublicKey(@Nullable Output<String> clusterPublicKey) {
            this.clusterPublicKey = clusterPublicKey;
            return this;
        }
        public Builder clusterPublicKey(@Nullable String clusterPublicKey) {
            this.clusterPublicKey = Output.ofNullable(clusterPublicKey);
            return this;
        }
        public Builder clusterRevisionNumber(@Nullable Output<String> clusterRevisionNumber) {
            this.clusterRevisionNumber = clusterRevisionNumber;
            return this;
        }
        public Builder clusterRevisionNumber(@Nullable String clusterRevisionNumber) {
            this.clusterRevisionNumber = Output.ofNullable(clusterRevisionNumber);
            return this;
        }
        public Builder clusterSecurityGroups(@Nullable Output<List<String>> clusterSecurityGroups) {
            this.clusterSecurityGroups = clusterSecurityGroups;
            return this;
        }
        public Builder clusterSecurityGroups(@Nullable List<String> clusterSecurityGroups) {
            this.clusterSecurityGroups = Output.ofNullable(clusterSecurityGroups);
            return this;
        }
        public Builder clusterSecurityGroups(String... clusterSecurityGroups) {
            return clusterSecurityGroups(List.of(clusterSecurityGroups));
        }
        public Builder clusterSubnetGroupName(@Nullable Output<String> clusterSubnetGroupName) {
            this.clusterSubnetGroupName = clusterSubnetGroupName;
            return this;
        }
        public Builder clusterSubnetGroupName(@Nullable String clusterSubnetGroupName) {
            this.clusterSubnetGroupName = Output.ofNullable(clusterSubnetGroupName);
            return this;
        }
        public Builder clusterType(@Nullable Output<String> clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public Builder clusterType(@Nullable String clusterType) {
            this.clusterType = Output.ofNullable(clusterType);
            return this;
        }
        public Builder clusterVersion(@Nullable Output<String> clusterVersion) {
            this.clusterVersion = clusterVersion;
            return this;
        }
        public Builder clusterVersion(@Nullable String clusterVersion) {
            this.clusterVersion = Output.ofNullable(clusterVersion);
            return this;
        }
        public Builder databaseName(@Nullable Output<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = Output.ofNullable(databaseName);
            return this;
        }
        public Builder elasticIp(@Nullable Output<String> elasticIp) {
            this.elasticIp = elasticIp;
            return this;
        }
        public Builder elasticIp(@Nullable String elasticIp) {
            this.elasticIp = Output.ofNullable(elasticIp);
            return this;
        }
        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = Output.ofNullable(encrypted);
            return this;
        }
        public Builder endpoint(@Nullable Output<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = Output.ofNullable(endpoint);
            return this;
        }
        public Builder enhancedVpcRouting(@Nullable Output<Boolean> enhancedVpcRouting) {
            this.enhancedVpcRouting = enhancedVpcRouting;
            return this;
        }
        public Builder enhancedVpcRouting(@Nullable Boolean enhancedVpcRouting) {
            this.enhancedVpcRouting = Output.ofNullable(enhancedVpcRouting);
            return this;
        }
        public Builder finalSnapshotIdentifier(@Nullable Output<String> finalSnapshotIdentifier) {
            this.finalSnapshotIdentifier = finalSnapshotIdentifier;
            return this;
        }
        public Builder finalSnapshotIdentifier(@Nullable String finalSnapshotIdentifier) {
            this.finalSnapshotIdentifier = Output.ofNullable(finalSnapshotIdentifier);
            return this;
        }
        public Builder iamRoles(@Nullable Output<List<String>> iamRoles) {
            this.iamRoles = iamRoles;
            return this;
        }
        public Builder iamRoles(@Nullable List<String> iamRoles) {
            this.iamRoles = Output.ofNullable(iamRoles);
            return this;
        }
        public Builder iamRoles(String... iamRoles) {
            return iamRoles(List.of(iamRoles));
        }
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Output.ofNullable(kmsKeyId);
            return this;
        }
        public Builder logging(@Nullable Output<ClusterLoggingArgs> logging) {
            this.logging = logging;
            return this;
        }
        public Builder logging(@Nullable ClusterLoggingArgs logging) {
            this.logging = Output.ofNullable(logging);
            return this;
        }
        public Builder masterPassword(@Nullable Output<String> masterPassword) {
            this.masterPassword = masterPassword;
            return this;
        }
        public Builder masterPassword(@Nullable String masterPassword) {
            this.masterPassword = Output.ofNullable(masterPassword);
            return this;
        }
        public Builder masterUsername(@Nullable Output<String> masterUsername) {
            this.masterUsername = masterUsername;
            return this;
        }
        public Builder masterUsername(@Nullable String masterUsername) {
            this.masterUsername = Output.ofNullable(masterUsername);
            return this;
        }
        public Builder nodeType(Output<String> nodeType) {
            this.nodeType = Objects.requireNonNull(nodeType);
            return this;
        }
        public Builder nodeType(String nodeType) {
            this.nodeType = Output.of(Objects.requireNonNull(nodeType));
            return this;
        }
        public Builder numberOfNodes(@Nullable Output<Integer> numberOfNodes) {
            this.numberOfNodes = numberOfNodes;
            return this;
        }
        public Builder numberOfNodes(@Nullable Integer numberOfNodes) {
            this.numberOfNodes = Output.ofNullable(numberOfNodes);
            return this;
        }
        public Builder ownerAccount(@Nullable Output<String> ownerAccount) {
            this.ownerAccount = ownerAccount;
            return this;
        }
        public Builder ownerAccount(@Nullable String ownerAccount) {
            this.ownerAccount = Output.ofNullable(ownerAccount);
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Output.ofNullable(port);
            return this;
        }
        public Builder preferredMaintenanceWindow(@Nullable Output<String> preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = preferredMaintenanceWindow;
            return this;
        }
        public Builder preferredMaintenanceWindow(@Nullable String preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = Output.ofNullable(preferredMaintenanceWindow);
            return this;
        }
        public Builder publiclyAccessible(@Nullable Output<Boolean> publiclyAccessible) {
            this.publiclyAccessible = publiclyAccessible;
            return this;
        }
        public Builder publiclyAccessible(@Nullable Boolean publiclyAccessible) {
            this.publiclyAccessible = Output.ofNullable(publiclyAccessible);
            return this;
        }
        public Builder skipFinalSnapshot(@Nullable Output<Boolean> skipFinalSnapshot) {
            this.skipFinalSnapshot = skipFinalSnapshot;
            return this;
        }
        public Builder skipFinalSnapshot(@Nullable Boolean skipFinalSnapshot) {
            this.skipFinalSnapshot = Output.ofNullable(skipFinalSnapshot);
            return this;
        }
        public Builder snapshotClusterIdentifier(@Nullable Output<String> snapshotClusterIdentifier) {
            this.snapshotClusterIdentifier = snapshotClusterIdentifier;
            return this;
        }
        public Builder snapshotClusterIdentifier(@Nullable String snapshotClusterIdentifier) {
            this.snapshotClusterIdentifier = Output.ofNullable(snapshotClusterIdentifier);
            return this;
        }
        public Builder snapshotCopy(@Nullable Output<ClusterSnapshotCopyArgs> snapshotCopy) {
            this.snapshotCopy = snapshotCopy;
            return this;
        }
        public Builder snapshotCopy(@Nullable ClusterSnapshotCopyArgs snapshotCopy) {
            this.snapshotCopy = Output.ofNullable(snapshotCopy);
            return this;
        }
        public Builder snapshotIdentifier(@Nullable Output<String> snapshotIdentifier) {
            this.snapshotIdentifier = snapshotIdentifier;
            return this;
        }
        public Builder snapshotIdentifier(@Nullable String snapshotIdentifier) {
            this.snapshotIdentifier = Output.ofNullable(snapshotIdentifier);
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
        public Builder vpcSecurityGroupIds(@Nullable Output<List<String>> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }
        public Builder vpcSecurityGroupIds(@Nullable List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = Output.ofNullable(vpcSecurityGroupIds);
            return this;
        }
        public Builder vpcSecurityGroupIds(String... vpcSecurityGroupIds) {
            return vpcSecurityGroupIds(List.of(vpcSecurityGroupIds));
        }        public ClusterArgs build() {
            return new ClusterArgs(allowVersionUpgrade, automatedSnapshotRetentionPeriod, availabilityZone, clusterIdentifier, clusterParameterGroupName, clusterPublicKey, clusterRevisionNumber, clusterSecurityGroups, clusterSubnetGroupName, clusterType, clusterVersion, databaseName, elasticIp, encrypted, endpoint, enhancedVpcRouting, finalSnapshotIdentifier, iamRoles, kmsKeyId, logging, masterPassword, masterUsername, nodeType, numberOfNodes, ownerAccount, port, preferredMaintenanceWindow, publiclyAccessible, skipFinalSnapshot, snapshotClusterIdentifier, snapshotCopy, snapshotIdentifier, tags, vpcSecurityGroupIds);
        }
    }
}