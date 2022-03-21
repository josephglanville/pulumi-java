// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.docdb.inputs;

import io.pulumi.aws.docdb.inputs.GlobalClusterGlobalClusterMemberGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalClusterState extends io.pulumi.resources.ResourceArgs {

    public static final GlobalClusterState Empty = new GlobalClusterState();

    /**
     * Global Cluster Amazon Resource Name (ARN)
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Name for an automatically created database on cluster creation.
     * 
     */
    @Import(name="databaseName")
      private final @Nullable Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName == null ? Output.empty() : this.databaseName;
    }

    /**
     * If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
     * 
     */
    @Import(name="deletionProtection")
      private final @Nullable Output<Boolean> deletionProtection;

    public Output<Boolean> getDeletionProtection() {
        return this.deletionProtection == null ? Output.empty() : this.deletionProtection;
    }

    @Import(name="engine")
      private final @Nullable Output<String> engine;

    public Output<String> getEngine() {
        return this.engine == null ? Output.empty() : this.engine;
    }

    /**
     * Engine version of the global database. Upgrading the engine version will result in all cluster members being immediately updated and will.
     * * **NOTE:** Upgrading major versions is not supported.
     * 
     */
    @Import(name="engineVersion")
      private final @Nullable Output<String> engineVersion;

    public Output<String> getEngineVersion() {
        return this.engineVersion == null ? Output.empty() : this.engineVersion;
    }

    /**
     * The global cluster identifier.
     * 
     */
    @Import(name="globalClusterIdentifier")
      private final @Nullable Output<String> globalClusterIdentifier;

    public Output<String> getGlobalClusterIdentifier() {
        return this.globalClusterIdentifier == null ? Output.empty() : this.globalClusterIdentifier;
    }

    /**
     * Set of objects containing Global Cluster members.
     * 
     */
    @Import(name="globalClusterMembers")
      private final @Nullable Output<List<GlobalClusterGlobalClusterMemberGetArgs>> globalClusterMembers;

    public Output<List<GlobalClusterGlobalClusterMemberGetArgs>> getGlobalClusterMembers() {
        return this.globalClusterMembers == null ? Output.empty() : this.globalClusterMembers;
    }

    /**
     * AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed.
     * 
     */
    @Import(name="globalClusterResourceId")
      private final @Nullable Output<String> globalClusterResourceId;

    public Output<String> getGlobalClusterResourceId() {
        return this.globalClusterResourceId == null ? Output.empty() : this.globalClusterResourceId;
    }

    @Import(name="sourceDbClusterIdentifier")
      private final @Nullable Output<String> sourceDbClusterIdentifier;

    public Output<String> getSourceDbClusterIdentifier() {
        return this.sourceDbClusterIdentifier == null ? Output.empty() : this.sourceDbClusterIdentifier;
    }

    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    @Import(name="storageEncrypted")
      private final @Nullable Output<Boolean> storageEncrypted;

    public Output<Boolean> getStorageEncrypted() {
        return this.storageEncrypted == null ? Output.empty() : this.storageEncrypted;
    }

    public GlobalClusterState(
        @Nullable Output<String> arn,
        @Nullable Output<String> databaseName,
        @Nullable Output<Boolean> deletionProtection,
        @Nullable Output<String> engine,
        @Nullable Output<String> engineVersion,
        @Nullable Output<String> globalClusterIdentifier,
        @Nullable Output<List<GlobalClusterGlobalClusterMemberGetArgs>> globalClusterMembers,
        @Nullable Output<String> globalClusterResourceId,
        @Nullable Output<String> sourceDbClusterIdentifier,
        @Nullable Output<String> status,
        @Nullable Output<Boolean> storageEncrypted) {
        this.arn = arn;
        this.databaseName = databaseName;
        this.deletionProtection = deletionProtection;
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.globalClusterIdentifier = globalClusterIdentifier;
        this.globalClusterMembers = globalClusterMembers;
        this.globalClusterResourceId = globalClusterResourceId;
        this.sourceDbClusterIdentifier = sourceDbClusterIdentifier;
        this.status = status;
        this.storageEncrypted = storageEncrypted;
    }

    private GlobalClusterState() {
        this.arn = Output.empty();
        this.databaseName = Output.empty();
        this.deletionProtection = Output.empty();
        this.engine = Output.empty();
        this.engineVersion = Output.empty();
        this.globalClusterIdentifier = Output.empty();
        this.globalClusterMembers = Output.empty();
        this.globalClusterResourceId = Output.empty();
        this.sourceDbClusterIdentifier = Output.empty();
        this.status = Output.empty();
        this.storageEncrypted = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> databaseName;
        private @Nullable Output<Boolean> deletionProtection;
        private @Nullable Output<String> engine;
        private @Nullable Output<String> engineVersion;
        private @Nullable Output<String> globalClusterIdentifier;
        private @Nullable Output<List<GlobalClusterGlobalClusterMemberGetArgs>> globalClusterMembers;
        private @Nullable Output<String> globalClusterResourceId;
        private @Nullable Output<String> sourceDbClusterIdentifier;
        private @Nullable Output<String> status;
        private @Nullable Output<Boolean> storageEncrypted;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalClusterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.databaseName = defaults.databaseName;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.globalClusterIdentifier = defaults.globalClusterIdentifier;
    	      this.globalClusterMembers = defaults.globalClusterMembers;
    	      this.globalClusterResourceId = defaults.globalClusterResourceId;
    	      this.sourceDbClusterIdentifier = defaults.sourceDbClusterIdentifier;
    	      this.status = defaults.status;
    	      this.storageEncrypted = defaults.storageEncrypted;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
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
        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Builder deletionProtection(@Nullable Boolean deletionProtection) {
            this.deletionProtection = Output.ofNullable(deletionProtection);
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
        public Builder globalClusterIdentifier(@Nullable Output<String> globalClusterIdentifier) {
            this.globalClusterIdentifier = globalClusterIdentifier;
            return this;
        }
        public Builder globalClusterIdentifier(@Nullable String globalClusterIdentifier) {
            this.globalClusterIdentifier = Output.ofNullable(globalClusterIdentifier);
            return this;
        }
        public Builder globalClusterMembers(@Nullable Output<List<GlobalClusterGlobalClusterMemberGetArgs>> globalClusterMembers) {
            this.globalClusterMembers = globalClusterMembers;
            return this;
        }
        public Builder globalClusterMembers(@Nullable List<GlobalClusterGlobalClusterMemberGetArgs> globalClusterMembers) {
            this.globalClusterMembers = Output.ofNullable(globalClusterMembers);
            return this;
        }
        public Builder globalClusterMembers(GlobalClusterGlobalClusterMemberGetArgs... globalClusterMembers) {
            return globalClusterMembers(List.of(globalClusterMembers));
        }
        public Builder globalClusterResourceId(@Nullable Output<String> globalClusterResourceId) {
            this.globalClusterResourceId = globalClusterResourceId;
            return this;
        }
        public Builder globalClusterResourceId(@Nullable String globalClusterResourceId) {
            this.globalClusterResourceId = Output.ofNullable(globalClusterResourceId);
            return this;
        }
        public Builder sourceDbClusterIdentifier(@Nullable Output<String> sourceDbClusterIdentifier) {
            this.sourceDbClusterIdentifier = sourceDbClusterIdentifier;
            return this;
        }
        public Builder sourceDbClusterIdentifier(@Nullable String sourceDbClusterIdentifier) {
            this.sourceDbClusterIdentifier = Output.ofNullable(sourceDbClusterIdentifier);
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
        public Builder storageEncrypted(@Nullable Output<Boolean> storageEncrypted) {
            this.storageEncrypted = storageEncrypted;
            return this;
        }
        public Builder storageEncrypted(@Nullable Boolean storageEncrypted) {
            this.storageEncrypted = Output.ofNullable(storageEncrypted);
            return this;
        }        public GlobalClusterState build() {
            return new GlobalClusterState(arn, databaseName, deletionProtection, engine, engineVersion, globalClusterIdentifier, globalClusterMembers, globalClusterResourceId, sourceDbClusterIdentifier, status, storageEncrypted);
        }
    }
}
