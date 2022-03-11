// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceRestoreToPointInTimeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceRestoreToPointInTimeGetArgs Empty = new InstanceRestoreToPointInTimeGetArgs();

    /**
     * The date and time to restore from. Value must be a time in Universal Coordinated Time (UTC) format and must be before the latest restorable time for the DB instance. Cannot be specified with `use_latest_restorable_time`.
     * 
     */
    @InputImport(name="restoreTime")
      private final @Nullable Output<String> restoreTime;

    public Output<String> getRestoreTime() {
        return this.restoreTime == null ? Output.empty() : this.restoreTime;
    }

    /**
     * The identifier of the source DB instance from which to restore. Must match the identifier of an existing DB instance. Required if `source_dbi_resource_id` is not specified.
     * 
     */
    @InputImport(name="sourceDbInstanceIdentifier")
      private final @Nullable Output<String> sourceDbInstanceIdentifier;

    public Output<String> getSourceDbInstanceIdentifier() {
        return this.sourceDbInstanceIdentifier == null ? Output.empty() : this.sourceDbInstanceIdentifier;
    }

    /**
     * The resource ID of the source DB instance from which to restore. Required if `source_db_instance_identifier` is not specified.
     * 
     */
    @InputImport(name="sourceDbiResourceId")
      private final @Nullable Output<String> sourceDbiResourceId;

    public Output<String> getSourceDbiResourceId() {
        return this.sourceDbiResourceId == null ? Output.empty() : this.sourceDbiResourceId;
    }

    /**
     * A boolean value that indicates whether the DB instance is restored from the latest backup time. Defaults to `false`. Cannot be specified with `restore_time`.
     * 
     */
    @InputImport(name="useLatestRestorableTime")
      private final @Nullable Output<Boolean> useLatestRestorableTime;

    public Output<Boolean> getUseLatestRestorableTime() {
        return this.useLatestRestorableTime == null ? Output.empty() : this.useLatestRestorableTime;
    }

    public InstanceRestoreToPointInTimeGetArgs(
        @Nullable Output<String> restoreTime,
        @Nullable Output<String> sourceDbInstanceIdentifier,
        @Nullable Output<String> sourceDbiResourceId,
        @Nullable Output<Boolean> useLatestRestorableTime) {
        this.restoreTime = restoreTime;
        this.sourceDbInstanceIdentifier = sourceDbInstanceIdentifier;
        this.sourceDbiResourceId = sourceDbiResourceId;
        this.useLatestRestorableTime = useLatestRestorableTime;
    }

    private InstanceRestoreToPointInTimeGetArgs() {
        this.restoreTime = Output.empty();
        this.sourceDbInstanceIdentifier = Output.empty();
        this.sourceDbiResourceId = Output.empty();
        this.useLatestRestorableTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceRestoreToPointInTimeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> restoreTime;
        private @Nullable Output<String> sourceDbInstanceIdentifier;
        private @Nullable Output<String> sourceDbiResourceId;
        private @Nullable Output<Boolean> useLatestRestorableTime;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceRestoreToPointInTimeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.restoreTime = defaults.restoreTime;
    	      this.sourceDbInstanceIdentifier = defaults.sourceDbInstanceIdentifier;
    	      this.sourceDbiResourceId = defaults.sourceDbiResourceId;
    	      this.useLatestRestorableTime = defaults.useLatestRestorableTime;
        }

        public Builder restoreTime(@Nullable Output<String> restoreTime) {
            this.restoreTime = restoreTime;
            return this;
        }

        public Builder restoreTime(@Nullable String restoreTime) {
            this.restoreTime = Output.ofNullable(restoreTime);
            return this;
        }

        public Builder sourceDbInstanceIdentifier(@Nullable Output<String> sourceDbInstanceIdentifier) {
            this.sourceDbInstanceIdentifier = sourceDbInstanceIdentifier;
            return this;
        }

        public Builder sourceDbInstanceIdentifier(@Nullable String sourceDbInstanceIdentifier) {
            this.sourceDbInstanceIdentifier = Output.ofNullable(sourceDbInstanceIdentifier);
            return this;
        }

        public Builder sourceDbiResourceId(@Nullable Output<String> sourceDbiResourceId) {
            this.sourceDbiResourceId = sourceDbiResourceId;
            return this;
        }

        public Builder sourceDbiResourceId(@Nullable String sourceDbiResourceId) {
            this.sourceDbiResourceId = Output.ofNullable(sourceDbiResourceId);
            return this;
        }

        public Builder useLatestRestorableTime(@Nullable Output<Boolean> useLatestRestorableTime) {
            this.useLatestRestorableTime = useLatestRestorableTime;
            return this;
        }

        public Builder useLatestRestorableTime(@Nullable Boolean useLatestRestorableTime) {
            this.useLatestRestorableTime = Output.ofNullable(useLatestRestorableTime);
            return this;
        }
        public InstanceRestoreToPointInTimeGetArgs build() {
            return new InstanceRestoreToPointInTimeGetArgs(restoreTime, sourceDbInstanceIdentifier, sourceDbiResourceId, useLatestRestorableTime);
        }
    }
}
