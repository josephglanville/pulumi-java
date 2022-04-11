// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.inputs;

import io.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionGetArgs;
import io.pulumi.aws.macie2.inputs.ClassificationJobScheduleFrequencyGetArgs;
import io.pulumi.aws.macie2.inputs.ClassificationJobUserPausedDetailGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClassificationJobState extends io.pulumi.resources.ResourceArgs {

    public static final ClassificationJobState Empty = new ClassificationJobState();

    /**
     * The date and time, in UTC and extended RFC 3339 format, when the job was created.
     * 
     */
    @Import(name="createdAt")
      private final @Nullable Output<String> createdAt;

    public Output<String> getCreatedAt() {
        return this.createdAt == null ? Codegen.empty() : this.createdAt;
    }

    /**
     * The custom data identifiers to use for data analysis and classification.
     * 
     */
    @Import(name="customDataIdentifierIds")
      private final @Nullable Output<List<String>> customDataIdentifierIds;

    public Output<List<String>> getCustomDataIdentifierIds() {
        return this.customDataIdentifierIds == null ? Codegen.empty() : this.customDataIdentifierIds;
    }

    /**
     * A custom description of the job. The description can contain as many as 200 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Specifies whether to analyze all existing, eligible objects immediately after the job is created.
     * 
     */
    @Import(name="initialRun")
      private final @Nullable Output<Boolean> initialRun;

    public Output<Boolean> getInitialRun() {
        return this.initialRun == null ? Codegen.empty() : this.initialRun;
    }

    @Import(name="jobArn")
      private final @Nullable Output<String> jobArn;

    public Output<String> getJobArn() {
        return this.jobArn == null ? Codegen.empty() : this.jobArn;
    }

    @Import(name="jobId")
      private final @Nullable Output<String> jobId;

    public Output<String> getJobId() {
        return this.jobId == null ? Codegen.empty() : this.jobId;
    }

    /**
     * The status for the job. Valid values are: `CANCELLED`, `RUNNING` and `USER_PAUSED`
     * 
     */
    @Import(name="jobStatus")
      private final @Nullable Output<String> jobStatus;

    public Output<String> getJobStatus() {
        return this.jobStatus == null ? Codegen.empty() : this.jobStatus;
    }

    /**
     * The schedule for running the job. Valid values are: `ONE_TIME` - Run the job only once. If you specify this value, don't specify a value for the `schedule_frequency` property. `SCHEDULED` - Run the job on a daily, weekly, or monthly basis. If you specify this value, use the `schedule_frequency` property to define the recurrence pattern for the job.
     * 
     */
    @Import(name="jobType")
      private final @Nullable Output<String> jobType;

    public Output<String> getJobType() {
        return this.jobType == null ? Codegen.empty() : this.jobType;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> getNamePrefix() {
        return this.namePrefix == null ? Codegen.empty() : this.namePrefix;
    }

    /**
     * The S3 buckets that contain the objects to analyze, and the scope of that analysis. (documented below)
     * 
     */
    @Import(name="s3JobDefinition")
      private final @Nullable Output<ClassificationJobS3JobDefinitionGetArgs> s3JobDefinition;

    public Output<ClassificationJobS3JobDefinitionGetArgs> getS3JobDefinition() {
        return this.s3JobDefinition == null ? Codegen.empty() : this.s3JobDefinition;
    }

    /**
     * The sampling depth, as a percentage, to apply when processing objects. This value determines the percentage of eligible objects that the job analyzes. If this value is less than 100, Amazon Macie selects the objects to analyze at random, up to the specified percentage, and analyzes all the data in those objects.
     * 
     */
    @Import(name="samplingPercentage")
      private final @Nullable Output<Integer> samplingPercentage;

    public Output<Integer> getSamplingPercentage() {
        return this.samplingPercentage == null ? Codegen.empty() : this.samplingPercentage;
    }

    /**
     * The recurrence pattern for running the job. To run the job only once, don't specify a value for this property and set the value for the `job_type` property to `ONE_TIME`. (documented below)
     * 
     */
    @Import(name="scheduleFrequency")
      private final @Nullable Output<ClassificationJobScheduleFrequencyGetArgs> scheduleFrequency;

    public Output<ClassificationJobScheduleFrequencyGetArgs> getScheduleFrequency() {
        return this.scheduleFrequency == null ? Codegen.empty() : this.scheduleFrequency;
    }

    /**
     * A map of key-value pairs that specifies the tags to associate with the job. A job can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * If the current status of the job is `USER_PAUSED`, specifies when the job was paused and when the job or job run will expire and be cancelled if it isn't resumed. This value is present only if the value for `job-status` is `USER_PAUSED`.
     * 
     */
    @Import(name="userPausedDetails")
      private final @Nullable Output<List<ClassificationJobUserPausedDetailGetArgs>> userPausedDetails;

    public Output<List<ClassificationJobUserPausedDetailGetArgs>> getUserPausedDetails() {
        return this.userPausedDetails == null ? Codegen.empty() : this.userPausedDetails;
    }

    public ClassificationJobState(
        @Nullable Output<String> createdAt,
        @Nullable Output<List<String>> customDataIdentifierIds,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> initialRun,
        @Nullable Output<String> jobArn,
        @Nullable Output<String> jobId,
        @Nullable Output<String> jobStatus,
        @Nullable Output<String> jobType,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<ClassificationJobS3JobDefinitionGetArgs> s3JobDefinition,
        @Nullable Output<Integer> samplingPercentage,
        @Nullable Output<ClassificationJobScheduleFrequencyGetArgs> scheduleFrequency,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<List<ClassificationJobUserPausedDetailGetArgs>> userPausedDetails) {
        this.createdAt = createdAt;
        this.customDataIdentifierIds = customDataIdentifierIds;
        this.description = description;
        this.initialRun = initialRun;
        this.jobArn = jobArn;
        this.jobId = jobId;
        this.jobStatus = jobStatus;
        this.jobType = jobType;
        this.name = name;
        this.namePrefix = namePrefix;
        this.s3JobDefinition = s3JobDefinition;
        this.samplingPercentage = samplingPercentage;
        this.scheduleFrequency = scheduleFrequency;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.userPausedDetails = userPausedDetails;
    }

    private ClassificationJobState() {
        this.createdAt = Codegen.empty();
        this.customDataIdentifierIds = Codegen.empty();
        this.description = Codegen.empty();
        this.initialRun = Codegen.empty();
        this.jobArn = Codegen.empty();
        this.jobId = Codegen.empty();
        this.jobStatus = Codegen.empty();
        this.jobType = Codegen.empty();
        this.name = Codegen.empty();
        this.namePrefix = Codegen.empty();
        this.s3JobDefinition = Codegen.empty();
        this.samplingPercentage = Codegen.empty();
        this.scheduleFrequency = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.userPausedDetails = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> createdAt;
        private @Nullable Output<List<String>> customDataIdentifierIds;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> initialRun;
        private @Nullable Output<String> jobArn;
        private @Nullable Output<String> jobId;
        private @Nullable Output<String> jobStatus;
        private @Nullable Output<String> jobType;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<ClassificationJobS3JobDefinitionGetArgs> s3JobDefinition;
        private @Nullable Output<Integer> samplingPercentage;
        private @Nullable Output<ClassificationJobScheduleFrequencyGetArgs> scheduleFrequency;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<List<ClassificationJobUserPausedDetailGetArgs>> userPausedDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.customDataIdentifierIds = defaults.customDataIdentifierIds;
    	      this.description = defaults.description;
    	      this.initialRun = defaults.initialRun;
    	      this.jobArn = defaults.jobArn;
    	      this.jobId = defaults.jobId;
    	      this.jobStatus = defaults.jobStatus;
    	      this.jobType = defaults.jobType;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.s3JobDefinition = defaults.s3JobDefinition;
    	      this.samplingPercentage = defaults.samplingPercentage;
    	      this.scheduleFrequency = defaults.scheduleFrequency;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.userPausedDetails = defaults.userPausedDetails;
        }

        public Builder createdAt(@Nullable Output<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = Codegen.ofNullable(createdAt);
            return this;
        }
        public Builder customDataIdentifierIds(@Nullable Output<List<String>> customDataIdentifierIds) {
            this.customDataIdentifierIds = customDataIdentifierIds;
            return this;
        }
        public Builder customDataIdentifierIds(@Nullable List<String> customDataIdentifierIds) {
            this.customDataIdentifierIds = Codegen.ofNullable(customDataIdentifierIds);
            return this;
        }
        public Builder customDataIdentifierIds(String... customDataIdentifierIds) {
            return customDataIdentifierIds(List.of(customDataIdentifierIds));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder initialRun(@Nullable Output<Boolean> initialRun) {
            this.initialRun = initialRun;
            return this;
        }
        public Builder initialRun(@Nullable Boolean initialRun) {
            this.initialRun = Codegen.ofNullable(initialRun);
            return this;
        }
        public Builder jobArn(@Nullable Output<String> jobArn) {
            this.jobArn = jobArn;
            return this;
        }
        public Builder jobArn(@Nullable String jobArn) {
            this.jobArn = Codegen.ofNullable(jobArn);
            return this;
        }
        public Builder jobId(@Nullable Output<String> jobId) {
            this.jobId = jobId;
            return this;
        }
        public Builder jobId(@Nullable String jobId) {
            this.jobId = Codegen.ofNullable(jobId);
            return this;
        }
        public Builder jobStatus(@Nullable Output<String> jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public Builder jobStatus(@Nullable String jobStatus) {
            this.jobStatus = Codegen.ofNullable(jobStatus);
            return this;
        }
        public Builder jobType(@Nullable Output<String> jobType) {
            this.jobType = jobType;
            return this;
        }
        public Builder jobType(@Nullable String jobType) {
            this.jobType = Codegen.ofNullable(jobType);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Codegen.ofNullable(namePrefix);
            return this;
        }
        public Builder s3JobDefinition(@Nullable Output<ClassificationJobS3JobDefinitionGetArgs> s3JobDefinition) {
            this.s3JobDefinition = s3JobDefinition;
            return this;
        }
        public Builder s3JobDefinition(@Nullable ClassificationJobS3JobDefinitionGetArgs s3JobDefinition) {
            this.s3JobDefinition = Codegen.ofNullable(s3JobDefinition);
            return this;
        }
        public Builder samplingPercentage(@Nullable Output<Integer> samplingPercentage) {
            this.samplingPercentage = samplingPercentage;
            return this;
        }
        public Builder samplingPercentage(@Nullable Integer samplingPercentage) {
            this.samplingPercentage = Codegen.ofNullable(samplingPercentage);
            return this;
        }
        public Builder scheduleFrequency(@Nullable Output<ClassificationJobScheduleFrequencyGetArgs> scheduleFrequency) {
            this.scheduleFrequency = scheduleFrequency;
            return this;
        }
        public Builder scheduleFrequency(@Nullable ClassificationJobScheduleFrequencyGetArgs scheduleFrequency) {
            this.scheduleFrequency = Codegen.ofNullable(scheduleFrequency);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder userPausedDetails(@Nullable Output<List<ClassificationJobUserPausedDetailGetArgs>> userPausedDetails) {
            this.userPausedDetails = userPausedDetails;
            return this;
        }
        public Builder userPausedDetails(@Nullable List<ClassificationJobUserPausedDetailGetArgs> userPausedDetails) {
            this.userPausedDetails = Codegen.ofNullable(userPausedDetails);
            return this;
        }
        public Builder userPausedDetails(ClassificationJobUserPausedDetailGetArgs... userPausedDetails) {
            return userPausedDetails(List.of(userPausedDetails));
        }        public ClassificationJobState build() {
            return new ClassificationJobState(createdAt, customDataIdentifierIds, description, initialRun, jobArn, jobId, jobStatus, jobType, name, namePrefix, s3JobDefinition, samplingPercentage, scheduleFrequency, tags, tagsAll, userPausedDetails);
        }
    }
}
