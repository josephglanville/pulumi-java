// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.SyncMigrationDatabaseErrorEventResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseErrorResponse {
    private final @Nullable String errorMessage;
    private final @Nullable List<SyncMigrationDatabaseErrorEventResponse> events;
    private final String id;
    private final String resultType;

    @OutputCustomType.Constructor({"errorMessage","events","id","resultType"})
    private MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseErrorResponse(
        @Nullable String errorMessage,
        @Nullable List<SyncMigrationDatabaseErrorEventResponse> events,
        String id,
        String resultType) {
        this.errorMessage = errorMessage;
        this.events = events;
        this.id = Objects.requireNonNull(id);
        this.resultType = Objects.requireNonNull(resultType);
    }

    public Optional<String> getErrorMessage() {
        return Optional.ofNullable(this.errorMessage);
    }
    public List<SyncMigrationDatabaseErrorEventResponse> getEvents() {
        return this.events == null ? List.of() : this.events;
    }
    public String getId() {
        return this.id;
    }
    public String getResultType() {
        return this.resultType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String errorMessage;
        private @Nullable List<SyncMigrationDatabaseErrorEventResponse> events;
        private String id;
        private String resultType;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorMessage = defaults.errorMessage;
    	      this.events = defaults.events;
    	      this.id = defaults.id;
    	      this.resultType = defaults.resultType;
        }

        public Builder setErrorMessage(@Nullable String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public Builder setEvents(@Nullable List<SyncMigrationDatabaseErrorEventResponse> events) {
            this.events = events;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setResultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }

        public MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseErrorResponse build() {
            return new MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseErrorResponse(errorMessage, events, id, resultType);
        }
    }
}
