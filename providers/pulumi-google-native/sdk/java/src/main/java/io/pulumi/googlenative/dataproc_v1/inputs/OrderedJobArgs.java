// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dataproc_v1.inputs.HadoopJobArgs;
import io.pulumi.googlenative.dataproc_v1.inputs.HiveJobArgs;
import io.pulumi.googlenative.dataproc_v1.inputs.JobSchedulingArgs;
import io.pulumi.googlenative.dataproc_v1.inputs.PigJobArgs;
import io.pulumi.googlenative.dataproc_v1.inputs.PrestoJobArgs;
import io.pulumi.googlenative.dataproc_v1.inputs.PySparkJobArgs;
import io.pulumi.googlenative.dataproc_v1.inputs.SparkJobArgs;
import io.pulumi.googlenative.dataproc_v1.inputs.SparkRJobArgs;
import io.pulumi.googlenative.dataproc_v1.inputs.SparkSqlJobArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A job executed by the workflow.
 * 
 */
public final class OrderedJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrderedJobArgs Empty = new OrderedJobArgs();

    /**
     * Optional. Job is a Hadoop job.
     * 
     */
    @Import(name="hadoopJob")
      private final @Nullable Output<HadoopJobArgs> hadoopJob;

    public Output<HadoopJobArgs> getHadoopJob() {
        return this.hadoopJob == null ? Output.empty() : this.hadoopJob;
    }

    /**
     * Optional. Job is a Hive job.
     * 
     */
    @Import(name="hiveJob")
      private final @Nullable Output<HiveJobArgs> hiveJob;

    public Output<HiveJobArgs> getHiveJob() {
        return this.hiveJob == null ? Output.empty() : this.hiveJob;
    }

    /**
     * Optional. The labels to associate with this job.Label keys must be between 1 and 63 characters long, and must conform to the following regular expression: \p{Ll}\p{Lo}{0,62}Label values must be between 1 and 63 characters long, and must conform to the following regular expression: \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels can be associated with a given job.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * Optional. Job is a Pig job.
     * 
     */
    @Import(name="pigJob")
      private final @Nullable Output<PigJobArgs> pigJob;

    public Output<PigJobArgs> getPigJob() {
        return this.pigJob == null ? Output.empty() : this.pigJob;
    }

    /**
     * Optional. The optional list of prerequisite job step_ids. If not specified, the job will start at the beginning of workflow.
     * 
     */
    @Import(name="prerequisiteStepIds")
      private final @Nullable Output<List<String>> prerequisiteStepIds;

    public Output<List<String>> getPrerequisiteStepIds() {
        return this.prerequisiteStepIds == null ? Output.empty() : this.prerequisiteStepIds;
    }

    /**
     * Optional. Job is a Presto job.
     * 
     */
    @Import(name="prestoJob")
      private final @Nullable Output<PrestoJobArgs> prestoJob;

    public Output<PrestoJobArgs> getPrestoJob() {
        return this.prestoJob == null ? Output.empty() : this.prestoJob;
    }

    /**
     * Optional. Job is a PySpark job.
     * 
     */
    @Import(name="pysparkJob")
      private final @Nullable Output<PySparkJobArgs> pysparkJob;

    public Output<PySparkJobArgs> getPysparkJob() {
        return this.pysparkJob == null ? Output.empty() : this.pysparkJob;
    }

    /**
     * Optional. Job scheduling configuration.
     * 
     */
    @Import(name="scheduling")
      private final @Nullable Output<JobSchedulingArgs> scheduling;

    public Output<JobSchedulingArgs> getScheduling() {
        return this.scheduling == null ? Output.empty() : this.scheduling;
    }

    /**
     * Optional. Job is a Spark job.
     * 
     */
    @Import(name="sparkJob")
      private final @Nullable Output<SparkJobArgs> sparkJob;

    public Output<SparkJobArgs> getSparkJob() {
        return this.sparkJob == null ? Output.empty() : this.sparkJob;
    }

    /**
     * Optional. Job is a SparkR job.
     * 
     */
    @Import(name="sparkRJob")
      private final @Nullable Output<SparkRJobArgs> sparkRJob;

    public Output<SparkRJobArgs> getSparkRJob() {
        return this.sparkRJob == null ? Output.empty() : this.sparkRJob;
    }

    /**
     * Optional. Job is a SparkSql job.
     * 
     */
    @Import(name="sparkSqlJob")
      private final @Nullable Output<SparkSqlJobArgs> sparkSqlJob;

    public Output<SparkSqlJobArgs> getSparkSqlJob() {
        return this.sparkSqlJob == null ? Output.empty() : this.sparkSqlJob;
    }

    /**
     * The step id. The id must be unique among all jobs within the template.The step id is used as prefix for job id, as job goog-dataproc-workflow-step-id label, and in prerequisiteStepIds field from other steps.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters.
     * 
     */
    @Import(name="stepId", required=true)
      private final Output<String> stepId;

    public Output<String> getStepId() {
        return this.stepId;
    }

    public OrderedJobArgs(
        @Nullable Output<HadoopJobArgs> hadoopJob,
        @Nullable Output<HiveJobArgs> hiveJob,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<PigJobArgs> pigJob,
        @Nullable Output<List<String>> prerequisiteStepIds,
        @Nullable Output<PrestoJobArgs> prestoJob,
        @Nullable Output<PySparkJobArgs> pysparkJob,
        @Nullable Output<JobSchedulingArgs> scheduling,
        @Nullable Output<SparkJobArgs> sparkJob,
        @Nullable Output<SparkRJobArgs> sparkRJob,
        @Nullable Output<SparkSqlJobArgs> sparkSqlJob,
        Output<String> stepId) {
        this.hadoopJob = hadoopJob;
        this.hiveJob = hiveJob;
        this.labels = labels;
        this.pigJob = pigJob;
        this.prerequisiteStepIds = prerequisiteStepIds;
        this.prestoJob = prestoJob;
        this.pysparkJob = pysparkJob;
        this.scheduling = scheduling;
        this.sparkJob = sparkJob;
        this.sparkRJob = sparkRJob;
        this.sparkSqlJob = sparkSqlJob;
        this.stepId = Objects.requireNonNull(stepId, "expected parameter 'stepId' to be non-null");
    }

    private OrderedJobArgs() {
        this.hadoopJob = Output.empty();
        this.hiveJob = Output.empty();
        this.labels = Output.empty();
        this.pigJob = Output.empty();
        this.prerequisiteStepIds = Output.empty();
        this.prestoJob = Output.empty();
        this.pysparkJob = Output.empty();
        this.scheduling = Output.empty();
        this.sparkJob = Output.empty();
        this.sparkRJob = Output.empty();
        this.sparkSqlJob = Output.empty();
        this.stepId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrderedJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<HadoopJobArgs> hadoopJob;
        private @Nullable Output<HiveJobArgs> hiveJob;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<PigJobArgs> pigJob;
        private @Nullable Output<List<String>> prerequisiteStepIds;
        private @Nullable Output<PrestoJobArgs> prestoJob;
        private @Nullable Output<PySparkJobArgs> pysparkJob;
        private @Nullable Output<JobSchedulingArgs> scheduling;
        private @Nullable Output<SparkJobArgs> sparkJob;
        private @Nullable Output<SparkRJobArgs> sparkRJob;
        private @Nullable Output<SparkSqlJobArgs> sparkSqlJob;
        private Output<String> stepId;

        public Builder() {
    	      // Empty
        }

        public Builder(OrderedJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hadoopJob = defaults.hadoopJob;
    	      this.hiveJob = defaults.hiveJob;
    	      this.labels = defaults.labels;
    	      this.pigJob = defaults.pigJob;
    	      this.prerequisiteStepIds = defaults.prerequisiteStepIds;
    	      this.prestoJob = defaults.prestoJob;
    	      this.pysparkJob = defaults.pysparkJob;
    	      this.scheduling = defaults.scheduling;
    	      this.sparkJob = defaults.sparkJob;
    	      this.sparkRJob = defaults.sparkRJob;
    	      this.sparkSqlJob = defaults.sparkSqlJob;
    	      this.stepId = defaults.stepId;
        }

        public Builder hadoopJob(@Nullable Output<HadoopJobArgs> hadoopJob) {
            this.hadoopJob = hadoopJob;
            return this;
        }
        public Builder hadoopJob(@Nullable HadoopJobArgs hadoopJob) {
            this.hadoopJob = Output.ofNullable(hadoopJob);
            return this;
        }
        public Builder hiveJob(@Nullable Output<HiveJobArgs> hiveJob) {
            this.hiveJob = hiveJob;
            return this;
        }
        public Builder hiveJob(@Nullable HiveJobArgs hiveJob) {
            this.hiveJob = Output.ofNullable(hiveJob);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder pigJob(@Nullable Output<PigJobArgs> pigJob) {
            this.pigJob = pigJob;
            return this;
        }
        public Builder pigJob(@Nullable PigJobArgs pigJob) {
            this.pigJob = Output.ofNullable(pigJob);
            return this;
        }
        public Builder prerequisiteStepIds(@Nullable Output<List<String>> prerequisiteStepIds) {
            this.prerequisiteStepIds = prerequisiteStepIds;
            return this;
        }
        public Builder prerequisiteStepIds(@Nullable List<String> prerequisiteStepIds) {
            this.prerequisiteStepIds = Output.ofNullable(prerequisiteStepIds);
            return this;
        }
        public Builder prerequisiteStepIds(String... prerequisiteStepIds) {
            return prerequisiteStepIds(List.of(prerequisiteStepIds));
        }
        public Builder prestoJob(@Nullable Output<PrestoJobArgs> prestoJob) {
            this.prestoJob = prestoJob;
            return this;
        }
        public Builder prestoJob(@Nullable PrestoJobArgs prestoJob) {
            this.prestoJob = Output.ofNullable(prestoJob);
            return this;
        }
        public Builder pysparkJob(@Nullable Output<PySparkJobArgs> pysparkJob) {
            this.pysparkJob = pysparkJob;
            return this;
        }
        public Builder pysparkJob(@Nullable PySparkJobArgs pysparkJob) {
            this.pysparkJob = Output.ofNullable(pysparkJob);
            return this;
        }
        public Builder scheduling(@Nullable Output<JobSchedulingArgs> scheduling) {
            this.scheduling = scheduling;
            return this;
        }
        public Builder scheduling(@Nullable JobSchedulingArgs scheduling) {
            this.scheduling = Output.ofNullable(scheduling);
            return this;
        }
        public Builder sparkJob(@Nullable Output<SparkJobArgs> sparkJob) {
            this.sparkJob = sparkJob;
            return this;
        }
        public Builder sparkJob(@Nullable SparkJobArgs sparkJob) {
            this.sparkJob = Output.ofNullable(sparkJob);
            return this;
        }
        public Builder sparkRJob(@Nullable Output<SparkRJobArgs> sparkRJob) {
            this.sparkRJob = sparkRJob;
            return this;
        }
        public Builder sparkRJob(@Nullable SparkRJobArgs sparkRJob) {
            this.sparkRJob = Output.ofNullable(sparkRJob);
            return this;
        }
        public Builder sparkSqlJob(@Nullable Output<SparkSqlJobArgs> sparkSqlJob) {
            this.sparkSqlJob = sparkSqlJob;
            return this;
        }
        public Builder sparkSqlJob(@Nullable SparkSqlJobArgs sparkSqlJob) {
            this.sparkSqlJob = Output.ofNullable(sparkSqlJob);
            return this;
        }
        public Builder stepId(Output<String> stepId) {
            this.stepId = Objects.requireNonNull(stepId);
            return this;
        }
        public Builder stepId(String stepId) {
            this.stepId = Output.of(Objects.requireNonNull(stepId));
            return this;
        }        public OrderedJobArgs build() {
            return new OrderedJobArgs(hadoopJob, hiveJob, labels, pigJob, prerequisiteStepIds, prestoJob, pysparkJob, scheduling, sparkJob, sparkRJob, sparkSqlJob, stepId);
        }
    }
}
