// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.neptune;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterInstanceArgs Empty = new ClusterInstanceArgs();

    /**
     * Specifies whether any instance modifications
     * are applied immediately, or during the next maintenance window. Default is`false`.
     * 
     */
    @Import(name="applyImmediately")
      private final @Nullable Output<Boolean> applyImmediately;

    public Output<Boolean> getApplyImmediately() {
        return this.applyImmediately == null ? Output.empty() : this.applyImmediately;
    }

    /**
     * Indicates that minor engine upgrades will be applied automatically to the instance during the maintenance window. Default is `true`.
     * 
     */
    @Import(name="autoMinorVersionUpgrade")
      private final @Nullable Output<Boolean> autoMinorVersionUpgrade;

    public Output<Boolean> getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade == null ? Output.empty() : this.autoMinorVersionUpgrade;
    }

    /**
     * The EC2 Availability Zone that the neptune instance is created in.
     * 
     */
    @Import(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Output.empty() : this.availabilityZone;
    }

    /**
     * The identifier of the `aws.neptune.Cluster` in which to launch this instance.
     * 
     */
    @Import(name="clusterIdentifier", required=true)
      private final Output<String> clusterIdentifier;

    public Output<String> getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * The name of the database engine to be used for the neptune instance. Defaults to `neptune`. Valid Values: `neptune`.
     * 
     */
    @Import(name="engine")
      private final @Nullable Output<String> engine;

    public Output<String> getEngine() {
        return this.engine == null ? Output.empty() : this.engine;
    }

    /**
     * The neptune engine version.
     * 
     */
    @Import(name="engineVersion")
      private final @Nullable Output<String> engineVersion;

    public Output<String> getEngineVersion() {
        return this.engineVersion == null ? Output.empty() : this.engineVersion;
    }

    /**
     * The identifier for the neptune instance, if omitted, this provider will assign a random, unique identifier.
     * 
     */
    @Import(name="identifier")
      private final @Nullable Output<String> identifier;

    public Output<String> getIdentifier() {
        return this.identifier == null ? Output.empty() : this.identifier;
    }

    /**
     * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
     * 
     */
    @Import(name="identifierPrefix")
      private final @Nullable Output<String> identifierPrefix;

    public Output<String> getIdentifierPrefix() {
        return this.identifierPrefix == null ? Output.empty() : this.identifierPrefix;
    }

    /**
     * The instance class to use.
     * 
     */
    @Import(name="instanceClass", required=true)
      private final Output<String> instanceClass;

    public Output<String> getInstanceClass() {
        return this.instanceClass;
    }

    /**
     * The name of the neptune parameter group to associate with this instance.
     * 
     */
    @Import(name="neptuneParameterGroupName")
      private final @Nullable Output<String> neptuneParameterGroupName;

    public Output<String> getNeptuneParameterGroupName() {
        return this.neptuneParameterGroupName == null ? Output.empty() : this.neptuneParameterGroupName;
    }

    /**
     * A subnet group to associate with this neptune instance. **NOTE:** This must match the `neptune_subnet_group_name` of the attached `aws.neptune.Cluster`.
     * 
     */
    @Import(name="neptuneSubnetGroupName")
      private final @Nullable Output<String> neptuneSubnetGroupName;

    public Output<String> getNeptuneSubnetGroupName() {
        return this.neptuneSubnetGroupName == null ? Output.empty() : this.neptuneSubnetGroupName;
    }

    /**
     * The port on which the DB accepts connections. Defaults to `8182`.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    /**
     * The daily time range during which automated backups are created if automated backups are enabled. Eg: "04:00-09:00"
     * 
     */
    @Import(name="preferredBackupWindow")
      private final @Nullable Output<String> preferredBackupWindow;

    public Output<String> getPreferredBackupWindow() {
        return this.preferredBackupWindow == null ? Output.empty() : this.preferredBackupWindow;
    }

    /**
     * The window to perform maintenance in.
     * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
     * 
     */
    @Import(name="preferredMaintenanceWindow")
      private final @Nullable Output<String> preferredMaintenanceWindow;

    public Output<String> getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow == null ? Output.empty() : this.preferredMaintenanceWindow;
    }

    /**
     * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
     * 
     */
    @Import(name="promotionTier")
      private final @Nullable Output<Integer> promotionTier;

    public Output<Integer> getPromotionTier() {
        return this.promotionTier == null ? Output.empty() : this.promotionTier;
    }

    /**
     * Bool to control if instance is publicly accessible. Default is `false`.
     * 
     */
    @Import(name="publiclyAccessible")
      private final @Nullable Output<Boolean> publiclyAccessible;

    public Output<Boolean> getPubliclyAccessible() {
        return this.publiclyAccessible == null ? Output.empty() : this.publiclyAccessible;
    }

    /**
     * A map of tags to assign to the instance. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ClusterInstanceArgs(
        @Nullable Output<Boolean> applyImmediately,
        @Nullable Output<Boolean> autoMinorVersionUpgrade,
        @Nullable Output<String> availabilityZone,
        Output<String> clusterIdentifier,
        @Nullable Output<String> engine,
        @Nullable Output<String> engineVersion,
        @Nullable Output<String> identifier,
        @Nullable Output<String> identifierPrefix,
        Output<String> instanceClass,
        @Nullable Output<String> neptuneParameterGroupName,
        @Nullable Output<String> neptuneSubnetGroupName,
        @Nullable Output<Integer> port,
        @Nullable Output<String> preferredBackupWindow,
        @Nullable Output<String> preferredMaintenanceWindow,
        @Nullable Output<Integer> promotionTier,
        @Nullable Output<Boolean> publiclyAccessible,
        @Nullable Output<Map<String,String>> tags) {
        this.applyImmediately = applyImmediately;
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        this.availabilityZone = availabilityZone;
        this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.identifier = identifier;
        this.identifierPrefix = identifierPrefix;
        this.instanceClass = Objects.requireNonNull(instanceClass, "expected parameter 'instanceClass' to be non-null");
        this.neptuneParameterGroupName = neptuneParameterGroupName;
        this.neptuneSubnetGroupName = neptuneSubnetGroupName;
        this.port = port;
        this.preferredBackupWindow = preferredBackupWindow;
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        this.promotionTier = promotionTier;
        this.publiclyAccessible = publiclyAccessible;
        this.tags = tags;
    }

    private ClusterInstanceArgs() {
        this.applyImmediately = Output.empty();
        this.autoMinorVersionUpgrade = Output.empty();
        this.availabilityZone = Output.empty();
        this.clusterIdentifier = Output.empty();
        this.engine = Output.empty();
        this.engineVersion = Output.empty();
        this.identifier = Output.empty();
        this.identifierPrefix = Output.empty();
        this.instanceClass = Output.empty();
        this.neptuneParameterGroupName = Output.empty();
        this.neptuneSubnetGroupName = Output.empty();
        this.port = Output.empty();
        this.preferredBackupWindow = Output.empty();
        this.preferredMaintenanceWindow = Output.empty();
        this.promotionTier = Output.empty();
        this.publiclyAccessible = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> applyImmediately;
        private @Nullable Output<Boolean> autoMinorVersionUpgrade;
        private @Nullable Output<String> availabilityZone;
        private Output<String> clusterIdentifier;
        private @Nullable Output<String> engine;
        private @Nullable Output<String> engineVersion;
        private @Nullable Output<String> identifier;
        private @Nullable Output<String> identifierPrefix;
        private Output<String> instanceClass;
        private @Nullable Output<String> neptuneParameterGroupName;
        private @Nullable Output<String> neptuneSubnetGroupName;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> preferredBackupWindow;
        private @Nullable Output<String> preferredMaintenanceWindow;
        private @Nullable Output<Integer> promotionTier;
        private @Nullable Output<Boolean> publiclyAccessible;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyImmediately = defaults.applyImmediately;
    	      this.autoMinorVersionUpgrade = defaults.autoMinorVersionUpgrade;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.identifier = defaults.identifier;
    	      this.identifierPrefix = defaults.identifierPrefix;
    	      this.instanceClass = defaults.instanceClass;
    	      this.neptuneParameterGroupName = defaults.neptuneParameterGroupName;
    	      this.neptuneSubnetGroupName = defaults.neptuneSubnetGroupName;
    	      this.port = defaults.port;
    	      this.preferredBackupWindow = defaults.preferredBackupWindow;
    	      this.preferredMaintenanceWindow = defaults.preferredMaintenanceWindow;
    	      this.promotionTier = defaults.promotionTier;
    	      this.publiclyAccessible = defaults.publiclyAccessible;
    	      this.tags = defaults.tags;
        }

        public Builder applyImmediately(@Nullable Output<Boolean> applyImmediately) {
            this.applyImmediately = applyImmediately;
            return this;
        }
        public Builder applyImmediately(@Nullable Boolean applyImmediately) {
            this.applyImmediately = Output.ofNullable(applyImmediately);
            return this;
        }
        public Builder autoMinorVersionUpgrade(@Nullable Output<Boolean> autoMinorVersionUpgrade) {
            this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
            return this;
        }
        public Builder autoMinorVersionUpgrade(@Nullable Boolean autoMinorVersionUpgrade) {
            this.autoMinorVersionUpgrade = Output.ofNullable(autoMinorVersionUpgrade);
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
        public Builder engine(@Nullable Output<String> engine) {
            this.engine = engine;
            return this;
        }
        public Builder engine(@Nullable String engine) {
            this.engine = Output.ofNullable(engine);
            return this;
        }
        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public Builder engineVersion(@Nullable String engineVersion) {
            this.engineVersion = Output.ofNullable(engineVersion);
            return this;
        }
        public Builder identifier(@Nullable Output<String> identifier) {
            this.identifier = identifier;
            return this;
        }
        public Builder identifier(@Nullable String identifier) {
            this.identifier = Output.ofNullable(identifier);
            return this;
        }
        public Builder identifierPrefix(@Nullable Output<String> identifierPrefix) {
            this.identifierPrefix = identifierPrefix;
            return this;
        }
        public Builder identifierPrefix(@Nullable String identifierPrefix) {
            this.identifierPrefix = Output.ofNullable(identifierPrefix);
            return this;
        }
        public Builder instanceClass(Output<String> instanceClass) {
            this.instanceClass = Objects.requireNonNull(instanceClass);
            return this;
        }
        public Builder instanceClass(String instanceClass) {
            this.instanceClass = Output.of(Objects.requireNonNull(instanceClass));
            return this;
        }
        public Builder neptuneParameterGroupName(@Nullable Output<String> neptuneParameterGroupName) {
            this.neptuneParameterGroupName = neptuneParameterGroupName;
            return this;
        }
        public Builder neptuneParameterGroupName(@Nullable String neptuneParameterGroupName) {
            this.neptuneParameterGroupName = Output.ofNullable(neptuneParameterGroupName);
            return this;
        }
        public Builder neptuneSubnetGroupName(@Nullable Output<String> neptuneSubnetGroupName) {
            this.neptuneSubnetGroupName = neptuneSubnetGroupName;
            return this;
        }
        public Builder neptuneSubnetGroupName(@Nullable String neptuneSubnetGroupName) {
            this.neptuneSubnetGroupName = Output.ofNullable(neptuneSubnetGroupName);
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
        public Builder preferredBackupWindow(@Nullable Output<String> preferredBackupWindow) {
            this.preferredBackupWindow = preferredBackupWindow;
            return this;
        }
        public Builder preferredBackupWindow(@Nullable String preferredBackupWindow) {
            this.preferredBackupWindow = Output.ofNullable(preferredBackupWindow);
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
        public Builder promotionTier(@Nullable Output<Integer> promotionTier) {
            this.promotionTier = promotionTier;
            return this;
        }
        public Builder promotionTier(@Nullable Integer promotionTier) {
            this.promotionTier = Output.ofNullable(promotionTier);
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
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public ClusterInstanceArgs build() {
            return new ClusterInstanceArgs(applyImmediately, autoMinorVersionUpgrade, availabilityZone, clusterIdentifier, engine, engineVersion, identifier, identifierPrefix, instanceClass, neptuneParameterGroupName, neptuneSubnetGroupName, port, preferredBackupWindow, preferredMaintenanceWindow, promotionTier, publiclyAccessible, tags);
        }
    }
}