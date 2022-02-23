// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.azurenative.sql.enums.JobTargetGroupMembershipType;
import io.pulumi.azurenative.sql.enums.JobTargetType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A job target, for example a specific database or a container of databases that is evaluated during job execution.
 * 
 */
public final class JobTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobTargetArgs Empty = new JobTargetArgs();

    /**
     * The target database name.
     * 
     */
    @InputImport(name="databaseName")
      private final @Nullable Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName == null ? Input.empty() : this.databaseName;
    }

    /**
     * The target elastic pool name.
     * 
     */
    @InputImport(name="elasticPoolName")
      private final @Nullable Input<String> elasticPoolName;

    public Input<String> getElasticPoolName() {
        return this.elasticPoolName == null ? Input.empty() : this.elasticPoolName;
    }

    /**
     * Whether the target is included or excluded from the group.
     * 
     */
    @InputImport(name="membershipType")
      private final @Nullable Input<JobTargetGroupMembershipType> membershipType;

    public Input<JobTargetGroupMembershipType> getMembershipType() {
        return this.membershipType == null ? Input.empty() : this.membershipType;
    }

    /**
     * The resource ID of the credential that is used during job execution to connect to the target and determine the list of databases inside the target.
     * 
     */
    @InputImport(name="refreshCredential")
      private final @Nullable Input<String> refreshCredential;

    public Input<String> getRefreshCredential() {
        return this.refreshCredential == null ? Input.empty() : this.refreshCredential;
    }

    /**
     * The target server name.
     * 
     */
    @InputImport(name="serverName")
      private final @Nullable Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName == null ? Input.empty() : this.serverName;
    }

    /**
     * The target shard map.
     * 
     */
    @InputImport(name="shardMapName")
      private final @Nullable Input<String> shardMapName;

    public Input<String> getShardMapName() {
        return this.shardMapName == null ? Input.empty() : this.shardMapName;
    }

    /**
     * The target type.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<Either<String,JobTargetType>> type;

    public Input<Either<String,JobTargetType>> getType() {
        return this.type;
    }

    public JobTargetArgs(
        @Nullable Input<String> databaseName,
        @Nullable Input<String> elasticPoolName,
        @Nullable Input<JobTargetGroupMembershipType> membershipType,
        @Nullable Input<String> refreshCredential,
        @Nullable Input<String> serverName,
        @Nullable Input<String> shardMapName,
        Input<Either<String,JobTargetType>> type) {
        this.databaseName = databaseName;
        this.elasticPoolName = elasticPoolName;
        this.membershipType = membershipType == null ? Input.ofNullable(io.pulumi.azurenative.sql.enums.JobTargetGroupMembershipType.Include) : membershipType;
        this.refreshCredential = refreshCredential;
        this.serverName = serverName;
        this.shardMapName = shardMapName;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private JobTargetArgs() {
        this.databaseName = Input.empty();
        this.elasticPoolName = Input.empty();
        this.membershipType = Input.empty();
        this.refreshCredential = Input.empty();
        this.serverName = Input.empty();
        this.shardMapName = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> databaseName;
        private @Nullable Input<String> elasticPoolName;
        private @Nullable Input<JobTargetGroupMembershipType> membershipType;
        private @Nullable Input<String> refreshCredential;
        private @Nullable Input<String> serverName;
        private @Nullable Input<String> shardMapName;
        private Input<Either<String,JobTargetType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.elasticPoolName = defaults.elasticPoolName;
    	      this.membershipType = defaults.membershipType;
    	      this.refreshCredential = defaults.refreshCredential;
    	      this.serverName = defaults.serverName;
    	      this.shardMapName = defaults.shardMapName;
    	      this.type = defaults.type;
        }

        public Builder setDatabaseName(@Nullable Input<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder setDatabaseName(@Nullable String databaseName) {
            this.databaseName = Input.ofNullable(databaseName);
            return this;
        }

        public Builder setElasticPoolName(@Nullable Input<String> elasticPoolName) {
            this.elasticPoolName = elasticPoolName;
            return this;
        }

        public Builder setElasticPoolName(@Nullable String elasticPoolName) {
            this.elasticPoolName = Input.ofNullable(elasticPoolName);
            return this;
        }

        public Builder setMembershipType(@Nullable Input<JobTargetGroupMembershipType> membershipType) {
            this.membershipType = membershipType;
            return this;
        }

        public Builder setMembershipType(@Nullable JobTargetGroupMembershipType membershipType) {
            this.membershipType = Input.ofNullable(membershipType);
            return this;
        }

        public Builder setRefreshCredential(@Nullable Input<String> refreshCredential) {
            this.refreshCredential = refreshCredential;
            return this;
        }

        public Builder setRefreshCredential(@Nullable String refreshCredential) {
            this.refreshCredential = Input.ofNullable(refreshCredential);
            return this;
        }

        public Builder setServerName(@Nullable Input<String> serverName) {
            this.serverName = serverName;
            return this;
        }

        public Builder setServerName(@Nullable String serverName) {
            this.serverName = Input.ofNullable(serverName);
            return this;
        }

        public Builder setShardMapName(@Nullable Input<String> shardMapName) {
            this.shardMapName = shardMapName;
            return this;
        }

        public Builder setShardMapName(@Nullable String shardMapName) {
            this.shardMapName = Input.ofNullable(shardMapName);
            return this;
        }

        public Builder setType(Input<Either<String,JobTargetType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(Either<String,JobTargetType> type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public JobTargetArgs build() {
            return new JobTargetArgs(databaseName, elasticPoolName, membershipType, refreshCredential, serverName, shardMapName, type);
        }
    }
}
