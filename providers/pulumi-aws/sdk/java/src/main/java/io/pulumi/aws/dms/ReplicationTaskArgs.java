// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dms;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReplicationTaskArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationTaskArgs Empty = new ReplicationTaskArgs();

    /**
     * Indicates when you want a change data capture (CDC) operation to start. The value can be in date, checkpoint, or LSN/SCN format depending on the source engine. For more information, see [Determining a CDC native start point](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Task.CDC.html#CHAP_Task.CDC.StartPoint.Native).
     * 
     */
    @Import(name="cdcStartPosition")
      private final @Nullable Output<String> cdcStartPosition;

    public Output<String> getCdcStartPosition() {
        return this.cdcStartPosition == null ? Output.empty() : this.cdcStartPosition;
    }

    /**
     * The Unix timestamp integer for the start of the Change Data Capture (CDC) operation.
     * 
     */
    @Import(name="cdcStartTime")
      private final @Nullable Output<String> cdcStartTime;

    public Output<String> getCdcStartTime() {
        return this.cdcStartTime == null ? Output.empty() : this.cdcStartTime;
    }

    /**
     * The migration type. Can be one of `full-load | cdc | full-load-and-cdc`.
     * 
     */
    @Import(name="migrationType", required=true)
      private final Output<String> migrationType;

    public Output<String> getMigrationType() {
        return this.migrationType;
    }

    /**
     * The Amazon Resource Name (ARN) of the replication instance.
     * 
     */
    @Import(name="replicationInstanceArn", required=true)
      private final Output<String> replicationInstanceArn;

    public Output<String> getReplicationInstanceArn() {
        return this.replicationInstanceArn;
    }

    /**
     * The replication task identifier.
     * 
     */
    @Import(name="replicationTaskId", required=true)
      private final Output<String> replicationTaskId;

    public Output<String> getReplicationTaskId() {
        return this.replicationTaskId;
    }

    /**
     * An escaped JSON string that contains the task settings. For a complete list of task settings, see [Task Settings for AWS Database Migration Service Tasks](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html).
     * 
     */
    @Import(name="replicationTaskSettings")
      private final @Nullable Output<String> replicationTaskSettings;

    public Output<String> getReplicationTaskSettings() {
        return this.replicationTaskSettings == null ? Output.empty() : this.replicationTaskSettings;
    }

    /**
     * The Amazon Resource Name (ARN) string that uniquely identifies the source endpoint.
     * 
     */
    @Import(name="sourceEndpointArn", required=true)
      private final Output<String> sourceEndpointArn;

    public Output<String> getSourceEndpointArn() {
        return this.sourceEndpointArn;
    }

    /**
     * An escaped JSON string that contains the table mappings. For information on table mapping see [Using Table Mapping with an AWS Database Migration Service Task to Select and Filter Data](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
     * 
     */
    @Import(name="tableMappings", required=true)
      private final Output<String> tableMappings;

    public Output<String> getTableMappings() {
        return this.tableMappings;
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
     * The Amazon Resource Name (ARN) string that uniquely identifies the target endpoint.
     * 
     */
    @Import(name="targetEndpointArn", required=true)
      private final Output<String> targetEndpointArn;

    public Output<String> getTargetEndpointArn() {
        return this.targetEndpointArn;
    }

    public ReplicationTaskArgs(
        @Nullable Output<String> cdcStartPosition,
        @Nullable Output<String> cdcStartTime,
        Output<String> migrationType,
        Output<String> replicationInstanceArn,
        Output<String> replicationTaskId,
        @Nullable Output<String> replicationTaskSettings,
        Output<String> sourceEndpointArn,
        Output<String> tableMappings,
        @Nullable Output<Map<String,String>> tags,
        Output<String> targetEndpointArn) {
        this.cdcStartPosition = cdcStartPosition;
        this.cdcStartTime = cdcStartTime;
        this.migrationType = Objects.requireNonNull(migrationType, "expected parameter 'migrationType' to be non-null");
        this.replicationInstanceArn = Objects.requireNonNull(replicationInstanceArn, "expected parameter 'replicationInstanceArn' to be non-null");
        this.replicationTaskId = Objects.requireNonNull(replicationTaskId, "expected parameter 'replicationTaskId' to be non-null");
        this.replicationTaskSettings = replicationTaskSettings;
        this.sourceEndpointArn = Objects.requireNonNull(sourceEndpointArn, "expected parameter 'sourceEndpointArn' to be non-null");
        this.tableMappings = Objects.requireNonNull(tableMappings, "expected parameter 'tableMappings' to be non-null");
        this.tags = tags;
        this.targetEndpointArn = Objects.requireNonNull(targetEndpointArn, "expected parameter 'targetEndpointArn' to be non-null");
    }

    private ReplicationTaskArgs() {
        this.cdcStartPosition = Output.empty();
        this.cdcStartTime = Output.empty();
        this.migrationType = Output.empty();
        this.replicationInstanceArn = Output.empty();
        this.replicationTaskId = Output.empty();
        this.replicationTaskSettings = Output.empty();
        this.sourceEndpointArn = Output.empty();
        this.tableMappings = Output.empty();
        this.tags = Output.empty();
        this.targetEndpointArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cdcStartPosition;
        private @Nullable Output<String> cdcStartTime;
        private Output<String> migrationType;
        private Output<String> replicationInstanceArn;
        private Output<String> replicationTaskId;
        private @Nullable Output<String> replicationTaskSettings;
        private Output<String> sourceEndpointArn;
        private Output<String> tableMappings;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> targetEndpointArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationTaskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cdcStartPosition = defaults.cdcStartPosition;
    	      this.cdcStartTime = defaults.cdcStartTime;
    	      this.migrationType = defaults.migrationType;
    	      this.replicationInstanceArn = defaults.replicationInstanceArn;
    	      this.replicationTaskId = defaults.replicationTaskId;
    	      this.replicationTaskSettings = defaults.replicationTaskSettings;
    	      this.sourceEndpointArn = defaults.sourceEndpointArn;
    	      this.tableMappings = defaults.tableMappings;
    	      this.tags = defaults.tags;
    	      this.targetEndpointArn = defaults.targetEndpointArn;
        }

        public Builder cdcStartPosition(@Nullable Output<String> cdcStartPosition) {
            this.cdcStartPosition = cdcStartPosition;
            return this;
        }
        public Builder cdcStartPosition(@Nullable String cdcStartPosition) {
            this.cdcStartPosition = Output.ofNullable(cdcStartPosition);
            return this;
        }
        public Builder cdcStartTime(@Nullable Output<String> cdcStartTime) {
            this.cdcStartTime = cdcStartTime;
            return this;
        }
        public Builder cdcStartTime(@Nullable String cdcStartTime) {
            this.cdcStartTime = Output.ofNullable(cdcStartTime);
            return this;
        }
        public Builder migrationType(Output<String> migrationType) {
            this.migrationType = Objects.requireNonNull(migrationType);
            return this;
        }
        public Builder migrationType(String migrationType) {
            this.migrationType = Output.of(Objects.requireNonNull(migrationType));
            return this;
        }
        public Builder replicationInstanceArn(Output<String> replicationInstanceArn) {
            this.replicationInstanceArn = Objects.requireNonNull(replicationInstanceArn);
            return this;
        }
        public Builder replicationInstanceArn(String replicationInstanceArn) {
            this.replicationInstanceArn = Output.of(Objects.requireNonNull(replicationInstanceArn));
            return this;
        }
        public Builder replicationTaskId(Output<String> replicationTaskId) {
            this.replicationTaskId = Objects.requireNonNull(replicationTaskId);
            return this;
        }
        public Builder replicationTaskId(String replicationTaskId) {
            this.replicationTaskId = Output.of(Objects.requireNonNull(replicationTaskId));
            return this;
        }
        public Builder replicationTaskSettings(@Nullable Output<String> replicationTaskSettings) {
            this.replicationTaskSettings = replicationTaskSettings;
            return this;
        }
        public Builder replicationTaskSettings(@Nullable String replicationTaskSettings) {
            this.replicationTaskSettings = Output.ofNullable(replicationTaskSettings);
            return this;
        }
        public Builder sourceEndpointArn(Output<String> sourceEndpointArn) {
            this.sourceEndpointArn = Objects.requireNonNull(sourceEndpointArn);
            return this;
        }
        public Builder sourceEndpointArn(String sourceEndpointArn) {
            this.sourceEndpointArn = Output.of(Objects.requireNonNull(sourceEndpointArn));
            return this;
        }
        public Builder tableMappings(Output<String> tableMappings) {
            this.tableMappings = Objects.requireNonNull(tableMappings);
            return this;
        }
        public Builder tableMappings(String tableMappings) {
            this.tableMappings = Output.of(Objects.requireNonNull(tableMappings));
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
        public Builder targetEndpointArn(Output<String> targetEndpointArn) {
            this.targetEndpointArn = Objects.requireNonNull(targetEndpointArn);
            return this;
        }
        public Builder targetEndpointArn(String targetEndpointArn) {
            this.targetEndpointArn = Output.of(Objects.requireNonNull(targetEndpointArn));
            return this;
        }        public ReplicationTaskArgs build() {
            return new ReplicationTaskArgs(cdcStartPosition, cdcStartTime, migrationType, replicationInstanceArn, replicationTaskId, replicationTaskSettings, sourceEndpointArn, tableMappings, tags, targetEndpointArn);
        }
    }
}