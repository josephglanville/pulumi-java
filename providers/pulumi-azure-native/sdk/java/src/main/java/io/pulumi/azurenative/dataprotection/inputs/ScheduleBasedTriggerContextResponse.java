// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.BackupScheduleResponse;
import io.pulumi.azurenative.dataprotection.inputs.TaggingCriteriaResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Schedule based trigger context
 * 
 */
public final class ScheduleBasedTriggerContextResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScheduleBasedTriggerContextResponse Empty = new ScheduleBasedTriggerContextResponse();

    /**
     * Type of the specific object - used for deserializing
     * Expected value is 'ScheduleBasedTriggerContext'.
     * 
     */
    @Import(name="objectType", required=true)
      private final String objectType;

    public String getObjectType() {
        return this.objectType;
    }

    /**
     * Schedule for this backup
     * 
     */
    @Import(name="schedule", required=true)
      private final BackupScheduleResponse schedule;

    public BackupScheduleResponse getSchedule() {
        return this.schedule;
    }

    /**
     * List of tags that can be applicable for given schedule.
     * 
     */
    @Import(name="taggingCriteria", required=true)
      private final List<TaggingCriteriaResponse> taggingCriteria;

    public List<TaggingCriteriaResponse> getTaggingCriteria() {
        return this.taggingCriteria;
    }

    public ScheduleBasedTriggerContextResponse(
        String objectType,
        BackupScheduleResponse schedule,
        List<TaggingCriteriaResponse> taggingCriteria) {
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
        this.taggingCriteria = Objects.requireNonNull(taggingCriteria, "expected parameter 'taggingCriteria' to be non-null");
    }

    private ScheduleBasedTriggerContextResponse() {
        this.objectType = null;
        this.schedule = null;
        this.taggingCriteria = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleBasedTriggerContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String objectType;
        private BackupScheduleResponse schedule;
        private List<TaggingCriteriaResponse> taggingCriteria;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleBasedTriggerContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectType = defaults.objectType;
    	      this.schedule = defaults.schedule;
    	      this.taggingCriteria = defaults.taggingCriteria;
        }

        public Builder objectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public Builder schedule(BackupScheduleResponse schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public Builder taggingCriteria(List<TaggingCriteriaResponse> taggingCriteria) {
            this.taggingCriteria = Objects.requireNonNull(taggingCriteria);
            return this;
        }
        public Builder taggingCriteria(TaggingCriteriaResponse... taggingCriteria) {
            return taggingCriteria(List.of(taggingCriteria));
        }        public ScheduleBasedTriggerContextResponse build() {
            return new ScheduleBasedTriggerContextResponse(objectType, schedule, taggingCriteria);
        }
    }
}
