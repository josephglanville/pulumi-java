// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.BackupScheduleArgs;
import io.pulumi.azurenative.dataprotection.inputs.TaggingCriteriaArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Schedule based trigger context
 * 
 */
public final class ScheduleBasedTriggerContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduleBasedTriggerContextArgs Empty = new ScheduleBasedTriggerContextArgs();

    /**
     * Type of the specific object - used for deserializing
     * Expected value is 'ScheduleBasedTriggerContext'.
     * 
     */
    @InputImport(name="objectType", required=true)
      private final Input<String> objectType;

    public Input<String> getObjectType() {
        return this.objectType;
    }

    /**
     * Schedule for this backup
     * 
     */
    @InputImport(name="schedule", required=true)
      private final Input<BackupScheduleArgs> schedule;

    public Input<BackupScheduleArgs> getSchedule() {
        return this.schedule;
    }

    /**
     * List of tags that can be applicable for given schedule.
     * 
     */
    @InputImport(name="taggingCriteria", required=true)
      private final Input<List<TaggingCriteriaArgs>> taggingCriteria;

    public Input<List<TaggingCriteriaArgs>> getTaggingCriteria() {
        return this.taggingCriteria;
    }

    public ScheduleBasedTriggerContextArgs(
        Input<String> objectType,
        Input<BackupScheduleArgs> schedule,
        Input<List<TaggingCriteriaArgs>> taggingCriteria) {
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
        this.taggingCriteria = Objects.requireNonNull(taggingCriteria, "expected parameter 'taggingCriteria' to be non-null");
    }

    private ScheduleBasedTriggerContextArgs() {
        this.objectType = Input.empty();
        this.schedule = Input.empty();
        this.taggingCriteria = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleBasedTriggerContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> objectType;
        private Input<BackupScheduleArgs> schedule;
        private Input<List<TaggingCriteriaArgs>> taggingCriteria;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleBasedTriggerContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectType = defaults.objectType;
    	      this.schedule = defaults.schedule;
    	      this.taggingCriteria = defaults.taggingCriteria;
        }

        public Builder setObjectType(Input<String> objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }

        public Builder setObjectType(String objectType) {
            this.objectType = Input.of(Objects.requireNonNull(objectType));
            return this;
        }

        public Builder setSchedule(Input<BackupScheduleArgs> schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public Builder setSchedule(BackupScheduleArgs schedule) {
            this.schedule = Input.of(Objects.requireNonNull(schedule));
            return this;
        }

        public Builder setTaggingCriteria(Input<List<TaggingCriteriaArgs>> taggingCriteria) {
            this.taggingCriteria = Objects.requireNonNull(taggingCriteria);
            return this;
        }

        public Builder setTaggingCriteria(List<TaggingCriteriaArgs> taggingCriteria) {
            this.taggingCriteria = Input.of(Objects.requireNonNull(taggingCriteria));
            return this;
        }
        public ScheduleBasedTriggerContextArgs build() {
            return new ScheduleBasedTriggerContextArgs(objectType, schedule, taggingCriteria);
        }
    }
}
