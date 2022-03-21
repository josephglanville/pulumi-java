// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RestoreResponse {
    /**
     * The relative resource name of the metastore service backup to restore from, in the following form:projects/{project_id}/locations/{location_id}/services/{service_id}/backups/{backup_id}.
     * 
     */
    private final String backup;
    /**
     * The restore details containing the revision of the service to be restored to, in format of JSON.
     * 
     */
    private final String details;
    /**
     * The time when the restore ended.
     * 
     */
    private final String endTime;
    /**
     * The time when the restore started.
     * 
     */
    private final String startTime;
    /**
     * The current state of the restore.
     * 
     */
    private final String state;
    /**
     * The type of restore.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private RestoreResponse(
        @CustomType.Parameter("backup") String backup,
        @CustomType.Parameter("details") String details,
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("type") String type) {
        this.backup = backup;
        this.details = details;
        this.endTime = endTime;
        this.startTime = startTime;
        this.state = state;
        this.type = type;
    }

    /**
     * The relative resource name of the metastore service backup to restore from, in the following form:projects/{project_id}/locations/{location_id}/services/{service_id}/backups/{backup_id}.
     * 
    */
    public String getBackup() {
        return this.backup;
    }
    /**
     * The restore details containing the revision of the service to be restored to, in format of JSON.
     * 
    */
    public String getDetails() {
        return this.details;
    }
    /**
     * The time when the restore ended.
     * 
    */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * The time when the restore started.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * The current state of the restore.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The type of restore.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestoreResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backup;
        private String details;
        private String endTime;
        private String startTime;
        private String state;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RestoreResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backup = defaults.backup;
    	      this.details = defaults.details;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder backup(String backup) {
            this.backup = Objects.requireNonNull(backup);
            return this;
        }
        public Builder details(String details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public RestoreResponse build() {
            return new RestoreResponse(backup, details, endTime, startTime, state, type);
        }
    }
}
