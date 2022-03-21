// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse Empty = new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse();

    /**
     * Migration end time
     * 
     */
    @Import(name="endedOn", required=true)
      private final String endedOn;

    public String getEndedOn() {
        return this.endedOn;
    }

    /**
     * Result identifier
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Result type
     * Expected value is 'MigrationLevelOutput'.
     * 
     */
    @Import(name="resultType", required=true)
      private final String resultType;

    public String getResultType() {
        return this.resultType;
    }

    /**
     * Source server name
     * 
     */
    @Import(name="sourceServer", required=true)
      private final String sourceServer;

    public String getSourceServer() {
        return this.sourceServer;
    }

    /**
     * Source server version
     * 
     */
    @Import(name="sourceServerVersion", required=true)
      private final String sourceServerVersion;

    public String getSourceServerVersion() {
        return this.sourceServerVersion;
    }

    /**
     * Migration start time
     * 
     */
    @Import(name="startedOn", required=true)
      private final String startedOn;

    public String getStartedOn() {
        return this.startedOn;
    }

    /**
     * Target server name
     * 
     */
    @Import(name="targetServer", required=true)
      private final String targetServer;

    public String getTargetServer() {
        return this.targetServer;
    }

    /**
     * Target server version
     * 
     */
    @Import(name="targetServerVersion", required=true)
      private final String targetServerVersion;

    public String getTargetServerVersion() {
        return this.targetServerVersion;
    }

    public MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse(
        String endedOn,
        String id,
        String resultType,
        String sourceServer,
        String sourceServerVersion,
        String startedOn,
        String targetServer,
        String targetServerVersion) {
        this.endedOn = Objects.requireNonNull(endedOn, "expected parameter 'endedOn' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.resultType = Objects.requireNonNull(resultType, "expected parameter 'resultType' to be non-null");
        this.sourceServer = Objects.requireNonNull(sourceServer, "expected parameter 'sourceServer' to be non-null");
        this.sourceServerVersion = Objects.requireNonNull(sourceServerVersion, "expected parameter 'sourceServerVersion' to be non-null");
        this.startedOn = Objects.requireNonNull(startedOn, "expected parameter 'startedOn' to be non-null");
        this.targetServer = Objects.requireNonNull(targetServer, "expected parameter 'targetServer' to be non-null");
        this.targetServerVersion = Objects.requireNonNull(targetServerVersion, "expected parameter 'targetServerVersion' to be non-null");
    }

    private MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse() {
        this.endedOn = null;
        this.id = null;
        this.resultType = null;
        this.sourceServer = null;
        this.sourceServerVersion = null;
        this.startedOn = null;
        this.targetServer = null;
        this.targetServerVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endedOn;
        private String id;
        private String resultType;
        private String sourceServer;
        private String sourceServerVersion;
        private String startedOn;
        private String targetServer;
        private String targetServerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endedOn = defaults.endedOn;
    	      this.id = defaults.id;
    	      this.resultType = defaults.resultType;
    	      this.sourceServer = defaults.sourceServer;
    	      this.sourceServerVersion = defaults.sourceServerVersion;
    	      this.startedOn = defaults.startedOn;
    	      this.targetServer = defaults.targetServer;
    	      this.targetServerVersion = defaults.targetServerVersion;
        }

        public Builder endedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder resultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }
        public Builder sourceServer(String sourceServer) {
            this.sourceServer = Objects.requireNonNull(sourceServer);
            return this;
        }
        public Builder sourceServerVersion(String sourceServerVersion) {
            this.sourceServerVersion = Objects.requireNonNull(sourceServerVersion);
            return this;
        }
        public Builder startedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }
        public Builder targetServer(String targetServer) {
            this.targetServer = Objects.requireNonNull(targetServer);
            return this;
        }
        public Builder targetServerVersion(String targetServerVersion) {
            this.targetServerVersion = Objects.requireNonNull(targetServerVersion);
            return this;
        }        public MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse build() {
            return new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse(endedOn, id, resultType, sourceServer, sourceServerVersion, startedOn, targetServer, targetServerVersion);
        }
    }
}
