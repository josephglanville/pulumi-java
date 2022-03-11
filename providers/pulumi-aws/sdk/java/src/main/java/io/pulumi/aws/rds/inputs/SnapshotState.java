// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotState extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotState Empty = new SnapshotState();

    /**
     * Specifies the allocated storage size in gigabytes (GB).
     * 
     */
    @InputImport(name="allocatedStorage")
      private final @Nullable Output<Integer> allocatedStorage;

    public Output<Integer> getAllocatedStorage() {
        return this.allocatedStorage == null ? Output.empty() : this.allocatedStorage;
    }

    /**
     * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
     * 
     */
    @InputImport(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Output.empty() : this.availabilityZone;
    }

    /**
     * The DB Instance Identifier from which to take the snapshot.
     * 
     */
    @InputImport(name="dbInstanceIdentifier")
      private final @Nullable Output<String> dbInstanceIdentifier;

    public Output<String> getDbInstanceIdentifier() {
        return this.dbInstanceIdentifier == null ? Output.empty() : this.dbInstanceIdentifier;
    }

    /**
     * The Amazon Resource Name (ARN) for the DB snapshot.
     * 
     */
    @InputImport(name="dbSnapshotArn")
      private final @Nullable Output<String> dbSnapshotArn;

    public Output<String> getDbSnapshotArn() {
        return this.dbSnapshotArn == null ? Output.empty() : this.dbSnapshotArn;
    }

    /**
     * The Identifier for the snapshot.
     * 
     */
    @InputImport(name="dbSnapshotIdentifier")
      private final @Nullable Output<String> dbSnapshotIdentifier;

    public Output<String> getDbSnapshotIdentifier() {
        return this.dbSnapshotIdentifier == null ? Output.empty() : this.dbSnapshotIdentifier;
    }

    /**
     * Specifies whether the DB snapshot is encrypted.
     * 
     */
    @InputImport(name="encrypted")
      private final @Nullable Output<Boolean> encrypted;

    public Output<Boolean> getEncrypted() {
        return this.encrypted == null ? Output.empty() : this.encrypted;
    }

    /**
     * Specifies the name of the database engine.
     * 
     */
    @InputImport(name="engine")
      private final @Nullable Output<String> engine;

    public Output<String> getEngine() {
        return this.engine == null ? Output.empty() : this.engine;
    }

    /**
     * Specifies the version of the database engine.
     * 
     */
    @InputImport(name="engineVersion")
      private final @Nullable Output<String> engineVersion;

    public Output<String> getEngineVersion() {
        return this.engineVersion == null ? Output.empty() : this.engineVersion;
    }

    /**
     * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     * 
     */
    @InputImport(name="iops")
      private final @Nullable Output<Integer> iops;

    public Output<Integer> getIops() {
        return this.iops == null ? Output.empty() : this.iops;
    }

    /**
     * The ARN for the KMS encryption key.
     * 
     */
    @InputImport(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Output.empty() : this.kmsKeyId;
    }

    /**
     * License model information for the restored DB instance.
     * 
     */
    @InputImport(name="licenseModel")
      private final @Nullable Output<String> licenseModel;

    public Output<String> getLicenseModel() {
        return this.licenseModel == null ? Output.empty() : this.licenseModel;
    }

    /**
     * Provides the option group name for the DB snapshot.
     * 
     */
    @InputImport(name="optionGroupName")
      private final @Nullable Output<String> optionGroupName;

    public Output<String> getOptionGroupName() {
        return this.optionGroupName == null ? Output.empty() : this.optionGroupName;
    }

    @InputImport(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    @InputImport(name="snapshotType")
      private final @Nullable Output<String> snapshotType;

    public Output<String> getSnapshotType() {
        return this.snapshotType == null ? Output.empty() : this.snapshotType;
    }

    /**
     * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
     * 
     */
    @InputImport(name="sourceDbSnapshotIdentifier")
      private final @Nullable Output<String> sourceDbSnapshotIdentifier;

    public Output<String> getSourceDbSnapshotIdentifier() {
        return this.sourceDbSnapshotIdentifier == null ? Output.empty() : this.sourceDbSnapshotIdentifier;
    }

    /**
     * The region that the DB snapshot was created in or copied from.
     * 
     */
    @InputImport(name="sourceRegion")
      private final @Nullable Output<String> sourceRegion;

    public Output<String> getSourceRegion() {
        return this.sourceRegion == null ? Output.empty() : this.sourceRegion;
    }

    /**
     * Specifies the status of this DB snapshot.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * Specifies the storage type associated with DB snapshot.
     * 
     */
    @InputImport(name="storageType")
      private final @Nullable Output<String> storageType;

    public Output<String> getStorageType() {
        return this.storageType == null ? Output.empty() : this.storageType;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * Provides the VPC ID associated with the DB snapshot.
     * 
     */
    @InputImport(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId == null ? Output.empty() : this.vpcId;
    }

    public SnapshotState(
        @Nullable Output<Integer> allocatedStorage,
        @Nullable Output<String> availabilityZone,
        @Nullable Output<String> dbInstanceIdentifier,
        @Nullable Output<String> dbSnapshotArn,
        @Nullable Output<String> dbSnapshotIdentifier,
        @Nullable Output<Boolean> encrypted,
        @Nullable Output<String> engine,
        @Nullable Output<String> engineVersion,
        @Nullable Output<Integer> iops,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<String> licenseModel,
        @Nullable Output<String> optionGroupName,
        @Nullable Output<Integer> port,
        @Nullable Output<String> snapshotType,
        @Nullable Output<String> sourceDbSnapshotIdentifier,
        @Nullable Output<String> sourceRegion,
        @Nullable Output<String> status,
        @Nullable Output<String> storageType,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> vpcId) {
        this.allocatedStorage = allocatedStorage;
        this.availabilityZone = availabilityZone;
        this.dbInstanceIdentifier = dbInstanceIdentifier;
        this.dbSnapshotArn = dbSnapshotArn;
        this.dbSnapshotIdentifier = dbSnapshotIdentifier;
        this.encrypted = encrypted;
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.iops = iops;
        this.kmsKeyId = kmsKeyId;
        this.licenseModel = licenseModel;
        this.optionGroupName = optionGroupName;
        this.port = port;
        this.snapshotType = snapshotType;
        this.sourceDbSnapshotIdentifier = sourceDbSnapshotIdentifier;
        this.sourceRegion = sourceRegion;
        this.status = status;
        this.storageType = storageType;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpcId = vpcId;
    }

    private SnapshotState() {
        this.allocatedStorage = Output.empty();
        this.availabilityZone = Output.empty();
        this.dbInstanceIdentifier = Output.empty();
        this.dbSnapshotArn = Output.empty();
        this.dbSnapshotIdentifier = Output.empty();
        this.encrypted = Output.empty();
        this.engine = Output.empty();
        this.engineVersion = Output.empty();
        this.iops = Output.empty();
        this.kmsKeyId = Output.empty();
        this.licenseModel = Output.empty();
        this.optionGroupName = Output.empty();
        this.port = Output.empty();
        this.snapshotType = Output.empty();
        this.sourceDbSnapshotIdentifier = Output.empty();
        this.sourceRegion = Output.empty();
        this.status = Output.empty();
        this.storageType = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.vpcId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> allocatedStorage;
        private @Nullable Output<String> availabilityZone;
        private @Nullable Output<String> dbInstanceIdentifier;
        private @Nullable Output<String> dbSnapshotArn;
        private @Nullable Output<String> dbSnapshotIdentifier;
        private @Nullable Output<Boolean> encrypted;
        private @Nullable Output<String> engine;
        private @Nullable Output<String> engineVersion;
        private @Nullable Output<Integer> iops;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<String> licenseModel;
        private @Nullable Output<String> optionGroupName;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> snapshotType;
        private @Nullable Output<String> sourceDbSnapshotIdentifier;
        private @Nullable Output<String> sourceRegion;
        private @Nullable Output<String> status;
        private @Nullable Output<String> storageType;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedStorage = defaults.allocatedStorage;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.dbInstanceIdentifier = defaults.dbInstanceIdentifier;
    	      this.dbSnapshotArn = defaults.dbSnapshotArn;
    	      this.dbSnapshotIdentifier = defaults.dbSnapshotIdentifier;
    	      this.encrypted = defaults.encrypted;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.iops = defaults.iops;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.licenseModel = defaults.licenseModel;
    	      this.optionGroupName = defaults.optionGroupName;
    	      this.port = defaults.port;
    	      this.snapshotType = defaults.snapshotType;
    	      this.sourceDbSnapshotIdentifier = defaults.sourceDbSnapshotIdentifier;
    	      this.sourceRegion = defaults.sourceRegion;
    	      this.status = defaults.status;
    	      this.storageType = defaults.storageType;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder allocatedStorage(@Nullable Output<Integer> allocatedStorage) {
            this.allocatedStorage = allocatedStorage;
            return this;
        }

        public Builder allocatedStorage(@Nullable Integer allocatedStorage) {
            this.allocatedStorage = Output.ofNullable(allocatedStorage);
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

        public Builder dbInstanceIdentifier(@Nullable Output<String> dbInstanceIdentifier) {
            this.dbInstanceIdentifier = dbInstanceIdentifier;
            return this;
        }

        public Builder dbInstanceIdentifier(@Nullable String dbInstanceIdentifier) {
            this.dbInstanceIdentifier = Output.ofNullable(dbInstanceIdentifier);
            return this;
        }

        public Builder dbSnapshotArn(@Nullable Output<String> dbSnapshotArn) {
            this.dbSnapshotArn = dbSnapshotArn;
            return this;
        }

        public Builder dbSnapshotArn(@Nullable String dbSnapshotArn) {
            this.dbSnapshotArn = Output.ofNullable(dbSnapshotArn);
            return this;
        }

        public Builder dbSnapshotIdentifier(@Nullable Output<String> dbSnapshotIdentifier) {
            this.dbSnapshotIdentifier = dbSnapshotIdentifier;
            return this;
        }

        public Builder dbSnapshotIdentifier(@Nullable String dbSnapshotIdentifier) {
            this.dbSnapshotIdentifier = Output.ofNullable(dbSnapshotIdentifier);
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

        public Builder iops(@Nullable Output<Integer> iops) {
            this.iops = iops;
            return this;
        }

        public Builder iops(@Nullable Integer iops) {
            this.iops = Output.ofNullable(iops);
            return this;
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Output.ofNullable(kmsKeyId);
            return this;
        }

        public Builder licenseModel(@Nullable Output<String> licenseModel) {
            this.licenseModel = licenseModel;
            return this;
        }

        public Builder licenseModel(@Nullable String licenseModel) {
            this.licenseModel = Output.ofNullable(licenseModel);
            return this;
        }

        public Builder optionGroupName(@Nullable Output<String> optionGroupName) {
            this.optionGroupName = optionGroupName;
            return this;
        }

        public Builder optionGroupName(@Nullable String optionGroupName) {
            this.optionGroupName = Output.ofNullable(optionGroupName);
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

        public Builder snapshotType(@Nullable Output<String> snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }

        public Builder snapshotType(@Nullable String snapshotType) {
            this.snapshotType = Output.ofNullable(snapshotType);
            return this;
        }

        public Builder sourceDbSnapshotIdentifier(@Nullable Output<String> sourceDbSnapshotIdentifier) {
            this.sourceDbSnapshotIdentifier = sourceDbSnapshotIdentifier;
            return this;
        }

        public Builder sourceDbSnapshotIdentifier(@Nullable String sourceDbSnapshotIdentifier) {
            this.sourceDbSnapshotIdentifier = Output.ofNullable(sourceDbSnapshotIdentifier);
            return this;
        }

        public Builder sourceRegion(@Nullable Output<String> sourceRegion) {
            this.sourceRegion = sourceRegion;
            return this;
        }

        public Builder sourceRegion(@Nullable String sourceRegion) {
            this.sourceRegion = Output.ofNullable(sourceRegion);
            return this;
        }

        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }

        public Builder storageType(@Nullable Output<String> storageType) {
            this.storageType = storageType;
            return this;
        }

        public Builder storageType(@Nullable String storageType) {
            this.storageType = Output.ofNullable(storageType);
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

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }

        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Output.ofNullable(vpcId);
            return this;
        }
        public SnapshotState build() {
            return new SnapshotState(allocatedStorage, availabilityZone, dbInstanceIdentifier, dbSnapshotArn, dbSnapshotIdentifier, encrypted, engine, engineVersion, iops, kmsKeyId, licenseModel, optionGroupName, port, snapshotType, sourceDbSnapshotIdentifier, sourceRegion, status, storageType, tags, tagsAll, vpcId);
        }
    }
}
