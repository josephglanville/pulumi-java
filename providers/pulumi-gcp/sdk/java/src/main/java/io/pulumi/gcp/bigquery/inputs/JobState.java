// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.bigquery.inputs.JobCopyGetArgs;
import io.pulumi.gcp.bigquery.inputs.JobExtractGetArgs;
import io.pulumi.gcp.bigquery.inputs.JobLoadGetArgs;
import io.pulumi.gcp.bigquery.inputs.JobQueryGetArgs;
import io.pulumi.gcp.bigquery.inputs.JobStatusGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobState extends io.pulumi.resources.ResourceArgs {

    public static final JobState Empty = new JobState();

    /**
     * Copies a table.
     * Structure is documented below.
     * 
     */
    @InputImport(name="copy")
      private final @Nullable Input<JobCopyGetArgs> copy;

    public Input<JobCopyGetArgs> getCopy() {
        return this.copy == null ? Input.empty() : this.copy;
    }

    /**
     * Configures an extract job.
     * Structure is documented below.
     * 
     */
    @InputImport(name="extract")
      private final @Nullable Input<JobExtractGetArgs> extract;

    public Input<JobExtractGetArgs> getExtract() {
        return this.extract == null ? Input.empty() : this.extract;
    }

    /**
     * The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length is 1,024 characters.
     * 
     */
    @InputImport(name="jobId")
      private final @Nullable Input<String> jobId;

    public Input<String> getJobId() {
        return this.jobId == null ? Input.empty() : this.jobId;
    }

    /**
     * Job timeout in milliseconds. If this time limit is exceeded, BigQuery may attempt to terminate the job.
     * 
     */
    @InputImport(name="jobTimeoutMs")
      private final @Nullable Input<String> jobTimeoutMs;

    public Input<String> getJobTimeoutMs() {
        return this.jobTimeoutMs == null ? Input.empty() : this.jobTimeoutMs;
    }

    /**
     * The type of the job.
     * 
     */
    @InputImport(name="jobType")
      private final @Nullable Input<String> jobType;

    public Input<String> getJobType() {
        return this.jobType == null ? Input.empty() : this.jobType;
    }

    /**
     * The labels associated with this job. You can use these to organize and group your jobs.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Configures a load job.
     * Structure is documented below.
     * 
     */
    @InputImport(name="load")
      private final @Nullable Input<JobLoadGetArgs> load;

    public Input<JobLoadGetArgs> getLoad() {
        return this.load == null ? Input.empty() : this.load;
    }

    /**
     * The geographic location of the job. The default value is US.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Configures a query job.
     * Structure is documented below.
     * 
     */
    @InputImport(name="query")
      private final @Nullable Input<JobQueryGetArgs> query;

    public Input<JobQueryGetArgs> getQuery() {
        return this.query == null ? Input.empty() : this.query;
    }

    /**
     * The status of this job. Examine this value when polling an asynchronous job to see if the job is complete.
     * 
     */
    @InputImport(name="statuses")
      private final @Nullable Input<List<JobStatusGetArgs>> statuses;

    public Input<List<JobStatusGetArgs>> getStatuses() {
        return this.statuses == null ? Input.empty() : this.statuses;
    }

    /**
     * Email address of the user who ran the job.
     * 
     */
    @InputImport(name="userEmail")
      private final @Nullable Input<String> userEmail;

    public Input<String> getUserEmail() {
        return this.userEmail == null ? Input.empty() : this.userEmail;
    }

    public JobState(
        @Nullable Input<JobCopyGetArgs> copy,
        @Nullable Input<JobExtractGetArgs> extract,
        @Nullable Input<String> jobId,
        @Nullable Input<String> jobTimeoutMs,
        @Nullable Input<String> jobType,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<JobLoadGetArgs> load,
        @Nullable Input<String> location,
        @Nullable Input<String> project,
        @Nullable Input<JobQueryGetArgs> query,
        @Nullable Input<List<JobStatusGetArgs>> statuses,
        @Nullable Input<String> userEmail) {
        this.copy = copy;
        this.extract = extract;
        this.jobId = jobId;
        this.jobTimeoutMs = jobTimeoutMs;
        this.jobType = jobType;
        this.labels = labels;
        this.load = load;
        this.location = location;
        this.project = project;
        this.query = query;
        this.statuses = statuses;
        this.userEmail = userEmail;
    }

    private JobState() {
        this.copy = Input.empty();
        this.extract = Input.empty();
        this.jobId = Input.empty();
        this.jobTimeoutMs = Input.empty();
        this.jobType = Input.empty();
        this.labels = Input.empty();
        this.load = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
        this.query = Input.empty();
        this.statuses = Input.empty();
        this.userEmail = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<JobCopyGetArgs> copy;
        private @Nullable Input<JobExtractGetArgs> extract;
        private @Nullable Input<String> jobId;
        private @Nullable Input<String> jobTimeoutMs;
        private @Nullable Input<String> jobType;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<JobLoadGetArgs> load;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;
        private @Nullable Input<JobQueryGetArgs> query;
        private @Nullable Input<List<JobStatusGetArgs>> statuses;
        private @Nullable Input<String> userEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(JobState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copy = defaults.copy;
    	      this.extract = defaults.extract;
    	      this.jobId = defaults.jobId;
    	      this.jobTimeoutMs = defaults.jobTimeoutMs;
    	      this.jobType = defaults.jobType;
    	      this.labels = defaults.labels;
    	      this.load = defaults.load;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.query = defaults.query;
    	      this.statuses = defaults.statuses;
    	      this.userEmail = defaults.userEmail;
        }

        public Builder setCopy(@Nullable Input<JobCopyGetArgs> copy) {
            this.copy = copy;
            return this;
        }

        public Builder setCopy(@Nullable JobCopyGetArgs copy) {
            this.copy = Input.ofNullable(copy);
            return this;
        }

        public Builder setExtract(@Nullable Input<JobExtractGetArgs> extract) {
            this.extract = extract;
            return this;
        }

        public Builder setExtract(@Nullable JobExtractGetArgs extract) {
            this.extract = Input.ofNullable(extract);
            return this;
        }

        public Builder setJobId(@Nullable Input<String> jobId) {
            this.jobId = jobId;
            return this;
        }

        public Builder setJobId(@Nullable String jobId) {
            this.jobId = Input.ofNullable(jobId);
            return this;
        }

        public Builder setJobTimeoutMs(@Nullable Input<String> jobTimeoutMs) {
            this.jobTimeoutMs = jobTimeoutMs;
            return this;
        }

        public Builder setJobTimeoutMs(@Nullable String jobTimeoutMs) {
            this.jobTimeoutMs = Input.ofNullable(jobTimeoutMs);
            return this;
        }

        public Builder setJobType(@Nullable Input<String> jobType) {
            this.jobType = jobType;
            return this;
        }

        public Builder setJobType(@Nullable String jobType) {
            this.jobType = Input.ofNullable(jobType);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLoad(@Nullable Input<JobLoadGetArgs> load) {
            this.load = load;
            return this;
        }

        public Builder setLoad(@Nullable JobLoadGetArgs load) {
            this.load = Input.ofNullable(load);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setQuery(@Nullable Input<JobQueryGetArgs> query) {
            this.query = query;
            return this;
        }

        public Builder setQuery(@Nullable JobQueryGetArgs query) {
            this.query = Input.ofNullable(query);
            return this;
        }

        public Builder setStatuses(@Nullable Input<List<JobStatusGetArgs>> statuses) {
            this.statuses = statuses;
            return this;
        }

        public Builder setStatuses(@Nullable List<JobStatusGetArgs> statuses) {
            this.statuses = Input.ofNullable(statuses);
            return this;
        }

        public Builder setUserEmail(@Nullable Input<String> userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public Builder setUserEmail(@Nullable String userEmail) {
            this.userEmail = Input.ofNullable(userEmail);
            return this;
        }
        public JobState build() {
            return new JobState(copy, extract, jobId, jobTimeoutMs, jobType, labels, load, location, project, query, statuses, userEmail);
        }
    }
}
