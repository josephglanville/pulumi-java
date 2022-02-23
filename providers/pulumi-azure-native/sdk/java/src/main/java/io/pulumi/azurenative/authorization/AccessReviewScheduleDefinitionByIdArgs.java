// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.authorization.enums.AccessReviewRecurrenceRangeType;
import io.pulumi.azurenative.authorization.enums.DefaultDecisionType;
import io.pulumi.azurenative.authorization.inputs.AccessReviewInstanceArgs;
import io.pulumi.azurenative.authorization.inputs.AccessReviewReviewerArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessReviewScheduleDefinitionByIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessReviewScheduleDefinitionByIdArgs Empty = new AccessReviewScheduleDefinitionByIdArgs();

    /**
     * Flag to indicate whether auto-apply capability, to automatically change the target object access resource, is enabled. If not enabled, a user must, after the review completes, apply the access review.
     * 
     */
    @InputImport(name="autoApplyDecisionsEnabled")
      private final @Nullable Input<Boolean> autoApplyDecisionsEnabled;

    public Input<Boolean> getAutoApplyDecisionsEnabled() {
        return this.autoApplyDecisionsEnabled == null ? Input.empty() : this.autoApplyDecisionsEnabled;
    }

    /**
     * This is the collection of backup reviewers.
     * 
     */
    @InputImport(name="backupReviewers")
      private final @Nullable Input<List<AccessReviewReviewerArgs>> backupReviewers;

    public Input<List<AccessReviewReviewerArgs>> getBackupReviewers() {
        return this.backupReviewers == null ? Input.empty() : this.backupReviewers;
    }

    /**
     * This specifies the behavior for the autoReview feature when an access review completes.
     * 
     */
    @InputImport(name="defaultDecision")
      private final @Nullable Input<Either<String,DefaultDecisionType>> defaultDecision;

    public Input<Either<String,DefaultDecisionType>> getDefaultDecision() {
        return this.defaultDecision == null ? Input.empty() : this.defaultDecision;
    }

    /**
     * Flag to indicate whether reviewers are required to provide a justification when reviewing access.
     * 
     */
    @InputImport(name="defaultDecisionEnabled")
      private final @Nullable Input<Boolean> defaultDecisionEnabled;

    public Input<Boolean> getDefaultDecisionEnabled() {
        return this.defaultDecisionEnabled == null ? Input.empty() : this.defaultDecisionEnabled;
    }

    /**
     * The description provided by the access review creator and visible to admins.
     * 
     */
    @InputImport(name="descriptionForAdmins")
      private final @Nullable Input<String> descriptionForAdmins;

    public Input<String> getDescriptionForAdmins() {
        return this.descriptionForAdmins == null ? Input.empty() : this.descriptionForAdmins;
    }

    /**
     * The description provided by the access review creator to be shown to reviewers.
     * 
     */
    @InputImport(name="descriptionForReviewers")
      private final @Nullable Input<String> descriptionForReviewers;

    public Input<String> getDescriptionForReviewers() {
        return this.descriptionForReviewers == null ? Input.empty() : this.descriptionForReviewers;
    }

    /**
     * The display name for the schedule definition.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The DateTime when the review is scheduled to end. Required if type is endDate
     * 
     */
    @InputImport(name="endDate")
      private final @Nullable Input<String> endDate;

    public Input<String> getEndDate() {
        return this.endDate == null ? Input.empty() : this.endDate;
    }

    /**
     * Duration users are inactive for. The value should be in ISO  8601 format (http://en.wikipedia.org/wiki/ISO_8601#Durations).This code can be used to convert TimeSpan to a valid interval string: XmlConvert.ToString(new TimeSpan(hours, minutes, seconds))
     * 
     */
    @InputImport(name="inactiveDuration")
      private final @Nullable Input<String> inactiveDuration;

    public Input<String> getInactiveDuration() {
        return this.inactiveDuration == null ? Input.empty() : this.inactiveDuration;
    }

    /**
     * The duration in days for an instance.
     * 
     */
    @InputImport(name="instanceDurationInDays")
      private final @Nullable Input<Integer> instanceDurationInDays;

    public Input<Integer> getInstanceDurationInDays() {
        return this.instanceDurationInDays == null ? Input.empty() : this.instanceDurationInDays;
    }

    /**
     * This is the collection of instances returned when one does an expand on it.
     * 
     */
    @InputImport(name="instances")
      private final @Nullable Input<List<AccessReviewInstanceArgs>> instances;

    public Input<List<AccessReviewInstanceArgs>> getInstances() {
        return this.instances == null ? Input.empty() : this.instances;
    }

    /**
     * The interval for recurrence. For a quarterly review, the interval is 3 for type : absoluteMonthly.
     * 
     */
    @InputImport(name="interval")
      private final @Nullable Input<Integer> interval;

    public Input<Integer> getInterval() {
        return this.interval == null ? Input.empty() : this.interval;
    }

    /**
     * Flag to indicate whether the reviewer is required to pass justification when recording a decision.
     * 
     */
    @InputImport(name="justificationRequiredOnApproval")
      private final @Nullable Input<Boolean> justificationRequiredOnApproval;

    public Input<Boolean> getJustificationRequiredOnApproval() {
        return this.justificationRequiredOnApproval == null ? Input.empty() : this.justificationRequiredOnApproval;
    }

    /**
     * Flag to indicate whether sending mails to reviewers and the review creator is enabled.
     * 
     */
    @InputImport(name="mailNotificationsEnabled")
      private final @Nullable Input<Boolean> mailNotificationsEnabled;

    public Input<Boolean> getMailNotificationsEnabled() {
        return this.mailNotificationsEnabled == null ? Input.empty() : this.mailNotificationsEnabled;
    }

    /**
     * The number of times to repeat the access review. Required and must be positive if type is numbered.
     * 
     */
    @InputImport(name="numberOfOccurrences")
      private final @Nullable Input<Integer> numberOfOccurrences;

    public Input<Integer> getNumberOfOccurrences() {
        return this.numberOfOccurrences == null ? Input.empty() : this.numberOfOccurrences;
    }

    /**
     * Flag to indicate whether showing recommendations to reviewers is enabled.
     * 
     */
    @InputImport(name="recommendationsEnabled")
      private final @Nullable Input<Boolean> recommendationsEnabled;

    public Input<Boolean> getRecommendationsEnabled() {
        return this.recommendationsEnabled == null ? Input.empty() : this.recommendationsEnabled;
    }

    /**
     * Flag to indicate whether sending reminder emails to reviewers are enabled.
     * 
     */
    @InputImport(name="reminderNotificationsEnabled")
      private final @Nullable Input<Boolean> reminderNotificationsEnabled;

    public Input<Boolean> getReminderNotificationsEnabled() {
        return this.reminderNotificationsEnabled == null ? Input.empty() : this.reminderNotificationsEnabled;
    }

    /**
     * This is the collection of reviewers.
     * 
     */
    @InputImport(name="reviewers")
      private final @Nullable Input<List<AccessReviewReviewerArgs>> reviewers;

    public Input<List<AccessReviewReviewerArgs>> getReviewers() {
        return this.reviewers == null ? Input.empty() : this.reviewers;
    }

    /**
     * The id of the access review schedule definition.
     * 
     */
    @InputImport(name="scheduleDefinitionId")
      private final @Nullable Input<String> scheduleDefinitionId;

    public Input<String> getScheduleDefinitionId() {
        return this.scheduleDefinitionId == null ? Input.empty() : this.scheduleDefinitionId;
    }

    /**
     * The DateTime when the review is scheduled to be start. This could be a date in the future. Required on create.
     * 
     */
    @InputImport(name="startDate")
      private final @Nullable Input<String> startDate;

    public Input<String> getStartDate() {
        return this.startDate == null ? Input.empty() : this.startDate;
    }

    /**
     * The recurrence range type. The possible values are: endDate, noEnd, numbered.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<Either<String,AccessReviewRecurrenceRangeType>> type;

    public Input<Either<String,AccessReviewRecurrenceRangeType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public AccessReviewScheduleDefinitionByIdArgs(
        @Nullable Input<Boolean> autoApplyDecisionsEnabled,
        @Nullable Input<List<AccessReviewReviewerArgs>> backupReviewers,
        @Nullable Input<Either<String,DefaultDecisionType>> defaultDecision,
        @Nullable Input<Boolean> defaultDecisionEnabled,
        @Nullable Input<String> descriptionForAdmins,
        @Nullable Input<String> descriptionForReviewers,
        @Nullable Input<String> displayName,
        @Nullable Input<String> endDate,
        @Nullable Input<String> inactiveDuration,
        @Nullable Input<Integer> instanceDurationInDays,
        @Nullable Input<List<AccessReviewInstanceArgs>> instances,
        @Nullable Input<Integer> interval,
        @Nullable Input<Boolean> justificationRequiredOnApproval,
        @Nullable Input<Boolean> mailNotificationsEnabled,
        @Nullable Input<Integer> numberOfOccurrences,
        @Nullable Input<Boolean> recommendationsEnabled,
        @Nullable Input<Boolean> reminderNotificationsEnabled,
        @Nullable Input<List<AccessReviewReviewerArgs>> reviewers,
        @Nullable Input<String> scheduleDefinitionId,
        @Nullable Input<String> startDate,
        @Nullable Input<Either<String,AccessReviewRecurrenceRangeType>> type) {
        this.autoApplyDecisionsEnabled = autoApplyDecisionsEnabled;
        this.backupReviewers = backupReviewers;
        this.defaultDecision = defaultDecision;
        this.defaultDecisionEnabled = defaultDecisionEnabled;
        this.descriptionForAdmins = descriptionForAdmins;
        this.descriptionForReviewers = descriptionForReviewers;
        this.displayName = displayName;
        this.endDate = endDate;
        this.inactiveDuration = inactiveDuration;
        this.instanceDurationInDays = instanceDurationInDays;
        this.instances = instances;
        this.interval = interval;
        this.justificationRequiredOnApproval = justificationRequiredOnApproval;
        this.mailNotificationsEnabled = mailNotificationsEnabled;
        this.numberOfOccurrences = numberOfOccurrences;
        this.recommendationsEnabled = recommendationsEnabled;
        this.reminderNotificationsEnabled = reminderNotificationsEnabled;
        this.reviewers = reviewers;
        this.scheduleDefinitionId = scheduleDefinitionId;
        this.startDate = startDate;
        this.type = type;
    }

    private AccessReviewScheduleDefinitionByIdArgs() {
        this.autoApplyDecisionsEnabled = Input.empty();
        this.backupReviewers = Input.empty();
        this.defaultDecision = Input.empty();
        this.defaultDecisionEnabled = Input.empty();
        this.descriptionForAdmins = Input.empty();
        this.descriptionForReviewers = Input.empty();
        this.displayName = Input.empty();
        this.endDate = Input.empty();
        this.inactiveDuration = Input.empty();
        this.instanceDurationInDays = Input.empty();
        this.instances = Input.empty();
        this.interval = Input.empty();
        this.justificationRequiredOnApproval = Input.empty();
        this.mailNotificationsEnabled = Input.empty();
        this.numberOfOccurrences = Input.empty();
        this.recommendationsEnabled = Input.empty();
        this.reminderNotificationsEnabled = Input.empty();
        this.reviewers = Input.empty();
        this.scheduleDefinitionId = Input.empty();
        this.startDate = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessReviewScheduleDefinitionByIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoApplyDecisionsEnabled;
        private @Nullable Input<List<AccessReviewReviewerArgs>> backupReviewers;
        private @Nullable Input<Either<String,DefaultDecisionType>> defaultDecision;
        private @Nullable Input<Boolean> defaultDecisionEnabled;
        private @Nullable Input<String> descriptionForAdmins;
        private @Nullable Input<String> descriptionForReviewers;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> endDate;
        private @Nullable Input<String> inactiveDuration;
        private @Nullable Input<Integer> instanceDurationInDays;
        private @Nullable Input<List<AccessReviewInstanceArgs>> instances;
        private @Nullable Input<Integer> interval;
        private @Nullable Input<Boolean> justificationRequiredOnApproval;
        private @Nullable Input<Boolean> mailNotificationsEnabled;
        private @Nullable Input<Integer> numberOfOccurrences;
        private @Nullable Input<Boolean> recommendationsEnabled;
        private @Nullable Input<Boolean> reminderNotificationsEnabled;
        private @Nullable Input<List<AccessReviewReviewerArgs>> reviewers;
        private @Nullable Input<String> scheduleDefinitionId;
        private @Nullable Input<String> startDate;
        private @Nullable Input<Either<String,AccessReviewRecurrenceRangeType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessReviewScheduleDefinitionByIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoApplyDecisionsEnabled = defaults.autoApplyDecisionsEnabled;
    	      this.backupReviewers = defaults.backupReviewers;
    	      this.defaultDecision = defaults.defaultDecision;
    	      this.defaultDecisionEnabled = defaults.defaultDecisionEnabled;
    	      this.descriptionForAdmins = defaults.descriptionForAdmins;
    	      this.descriptionForReviewers = defaults.descriptionForReviewers;
    	      this.displayName = defaults.displayName;
    	      this.endDate = defaults.endDate;
    	      this.inactiveDuration = defaults.inactiveDuration;
    	      this.instanceDurationInDays = defaults.instanceDurationInDays;
    	      this.instances = defaults.instances;
    	      this.interval = defaults.interval;
    	      this.justificationRequiredOnApproval = defaults.justificationRequiredOnApproval;
    	      this.mailNotificationsEnabled = defaults.mailNotificationsEnabled;
    	      this.numberOfOccurrences = defaults.numberOfOccurrences;
    	      this.recommendationsEnabled = defaults.recommendationsEnabled;
    	      this.reminderNotificationsEnabled = defaults.reminderNotificationsEnabled;
    	      this.reviewers = defaults.reviewers;
    	      this.scheduleDefinitionId = defaults.scheduleDefinitionId;
    	      this.startDate = defaults.startDate;
    	      this.type = defaults.type;
        }

        public Builder setAutoApplyDecisionsEnabled(@Nullable Input<Boolean> autoApplyDecisionsEnabled) {
            this.autoApplyDecisionsEnabled = autoApplyDecisionsEnabled;
            return this;
        }

        public Builder setAutoApplyDecisionsEnabled(@Nullable Boolean autoApplyDecisionsEnabled) {
            this.autoApplyDecisionsEnabled = Input.ofNullable(autoApplyDecisionsEnabled);
            return this;
        }

        public Builder setBackupReviewers(@Nullable Input<List<AccessReviewReviewerArgs>> backupReviewers) {
            this.backupReviewers = backupReviewers;
            return this;
        }

        public Builder setBackupReviewers(@Nullable List<AccessReviewReviewerArgs> backupReviewers) {
            this.backupReviewers = Input.ofNullable(backupReviewers);
            return this;
        }

        public Builder setDefaultDecision(@Nullable Input<Either<String,DefaultDecisionType>> defaultDecision) {
            this.defaultDecision = defaultDecision;
            return this;
        }

        public Builder setDefaultDecision(@Nullable Either<String,DefaultDecisionType> defaultDecision) {
            this.defaultDecision = Input.ofNullable(defaultDecision);
            return this;
        }

        public Builder setDefaultDecisionEnabled(@Nullable Input<Boolean> defaultDecisionEnabled) {
            this.defaultDecisionEnabled = defaultDecisionEnabled;
            return this;
        }

        public Builder setDefaultDecisionEnabled(@Nullable Boolean defaultDecisionEnabled) {
            this.defaultDecisionEnabled = Input.ofNullable(defaultDecisionEnabled);
            return this;
        }

        public Builder setDescriptionForAdmins(@Nullable Input<String> descriptionForAdmins) {
            this.descriptionForAdmins = descriptionForAdmins;
            return this;
        }

        public Builder setDescriptionForAdmins(@Nullable String descriptionForAdmins) {
            this.descriptionForAdmins = Input.ofNullable(descriptionForAdmins);
            return this;
        }

        public Builder setDescriptionForReviewers(@Nullable Input<String> descriptionForReviewers) {
            this.descriptionForReviewers = descriptionForReviewers;
            return this;
        }

        public Builder setDescriptionForReviewers(@Nullable String descriptionForReviewers) {
            this.descriptionForReviewers = Input.ofNullable(descriptionForReviewers);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setEndDate(@Nullable Input<String> endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder setEndDate(@Nullable String endDate) {
            this.endDate = Input.ofNullable(endDate);
            return this;
        }

        public Builder setInactiveDuration(@Nullable Input<String> inactiveDuration) {
            this.inactiveDuration = inactiveDuration;
            return this;
        }

        public Builder setInactiveDuration(@Nullable String inactiveDuration) {
            this.inactiveDuration = Input.ofNullable(inactiveDuration);
            return this;
        }

        public Builder setInstanceDurationInDays(@Nullable Input<Integer> instanceDurationInDays) {
            this.instanceDurationInDays = instanceDurationInDays;
            return this;
        }

        public Builder setInstanceDurationInDays(@Nullable Integer instanceDurationInDays) {
            this.instanceDurationInDays = Input.ofNullable(instanceDurationInDays);
            return this;
        }

        public Builder setInstances(@Nullable Input<List<AccessReviewInstanceArgs>> instances) {
            this.instances = instances;
            return this;
        }

        public Builder setInstances(@Nullable List<AccessReviewInstanceArgs> instances) {
            this.instances = Input.ofNullable(instances);
            return this;
        }

        public Builder setInterval(@Nullable Input<Integer> interval) {
            this.interval = interval;
            return this;
        }

        public Builder setInterval(@Nullable Integer interval) {
            this.interval = Input.ofNullable(interval);
            return this;
        }

        public Builder setJustificationRequiredOnApproval(@Nullable Input<Boolean> justificationRequiredOnApproval) {
            this.justificationRequiredOnApproval = justificationRequiredOnApproval;
            return this;
        }

        public Builder setJustificationRequiredOnApproval(@Nullable Boolean justificationRequiredOnApproval) {
            this.justificationRequiredOnApproval = Input.ofNullable(justificationRequiredOnApproval);
            return this;
        }

        public Builder setMailNotificationsEnabled(@Nullable Input<Boolean> mailNotificationsEnabled) {
            this.mailNotificationsEnabled = mailNotificationsEnabled;
            return this;
        }

        public Builder setMailNotificationsEnabled(@Nullable Boolean mailNotificationsEnabled) {
            this.mailNotificationsEnabled = Input.ofNullable(mailNotificationsEnabled);
            return this;
        }

        public Builder setNumberOfOccurrences(@Nullable Input<Integer> numberOfOccurrences) {
            this.numberOfOccurrences = numberOfOccurrences;
            return this;
        }

        public Builder setNumberOfOccurrences(@Nullable Integer numberOfOccurrences) {
            this.numberOfOccurrences = Input.ofNullable(numberOfOccurrences);
            return this;
        }

        public Builder setRecommendationsEnabled(@Nullable Input<Boolean> recommendationsEnabled) {
            this.recommendationsEnabled = recommendationsEnabled;
            return this;
        }

        public Builder setRecommendationsEnabled(@Nullable Boolean recommendationsEnabled) {
            this.recommendationsEnabled = Input.ofNullable(recommendationsEnabled);
            return this;
        }

        public Builder setReminderNotificationsEnabled(@Nullable Input<Boolean> reminderNotificationsEnabled) {
            this.reminderNotificationsEnabled = reminderNotificationsEnabled;
            return this;
        }

        public Builder setReminderNotificationsEnabled(@Nullable Boolean reminderNotificationsEnabled) {
            this.reminderNotificationsEnabled = Input.ofNullable(reminderNotificationsEnabled);
            return this;
        }

        public Builder setReviewers(@Nullable Input<List<AccessReviewReviewerArgs>> reviewers) {
            this.reviewers = reviewers;
            return this;
        }

        public Builder setReviewers(@Nullable List<AccessReviewReviewerArgs> reviewers) {
            this.reviewers = Input.ofNullable(reviewers);
            return this;
        }

        public Builder setScheduleDefinitionId(@Nullable Input<String> scheduleDefinitionId) {
            this.scheduleDefinitionId = scheduleDefinitionId;
            return this;
        }

        public Builder setScheduleDefinitionId(@Nullable String scheduleDefinitionId) {
            this.scheduleDefinitionId = Input.ofNullable(scheduleDefinitionId);
            return this;
        }

        public Builder setStartDate(@Nullable Input<String> startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setStartDate(@Nullable String startDate) {
            this.startDate = Input.ofNullable(startDate);
            return this;
        }

        public Builder setType(@Nullable Input<Either<String,AccessReviewRecurrenceRangeType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,AccessReviewRecurrenceRangeType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public AccessReviewScheduleDefinitionByIdArgs build() {
            return new AccessReviewScheduleDefinitionByIdArgs(autoApplyDecisionsEnabled, backupReviewers, defaultDecision, defaultDecisionEnabled, descriptionForAdmins, descriptionForReviewers, displayName, endDate, inactiveDuration, instanceDurationInDays, instances, interval, justificationRequiredOnApproval, mailNotificationsEnabled, numberOfOccurrences, recommendationsEnabled, reminderNotificationsEnabled, reviewers, scheduleDefinitionId, startDate, type);
        }
    }
}
