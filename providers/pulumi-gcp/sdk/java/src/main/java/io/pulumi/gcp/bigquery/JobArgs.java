// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.bigquery.inputs.JobCopyArgs;
import io.pulumi.gcp.bigquery.inputs.JobExtractArgs;
import io.pulumi.gcp.bigquery.inputs.JobLoadArgs;
import io.pulumi.gcp.bigquery.inputs.JobQueryArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * Copies a table.
     * Structure is documented below.
     * 
     */
    @InputImport(name="copy")
      private final @Nullable Input<JobCopyArgs> copy;

    public Input<JobCopyArgs> getCopy() {
        return this.copy == null ? Input.empty() : this.copy;
    }

    /**
     * Configures an extract job.
     * Structure is documented below.
     * 
     */
    @InputImport(name="extract")
      private final @Nullable Input<JobExtractArgs> extract;

    public Input<JobExtractArgs> getExtract() {
        return this.extract == null ? Input.empty() : this.extract;
    }

    /**
     * The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length is 1,024 characters.
     * 
     */
    @InputImport(name="jobId", required=true)
      private final Input<String> jobId;

    public Input<String> getJobId() {
        return this.jobId;
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
      private final @Nullable Input<JobLoadArgs> load;

    public Input<JobLoadArgs> getLoad() {
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
      private final @Nullable Input<JobQueryArgs> query;

    public Input<JobQueryArgs> getQuery() {
        return this.query == null ? Input.empty() : this.query;
    }

    public JobArgs(
        @Nullable Input<JobCopyArgs> copy,
        @Nullable Input<JobExtractArgs> extract,
        Input<String> jobId,
        @Nullable Input<String> jobTimeoutMs,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<JobLoadArgs> load,
        @Nullable Input<String> location,
        @Nullable Input<String> project,
        @Nullable Input<JobQueryArgs> query) {
        this.copy = copy;
        this.extract = extract;
        this.jobId = Objects.requireNonNull(jobId, "expected parameter 'jobId' to be non-null");
        this.jobTimeoutMs = jobTimeoutMs;
        this.labels = labels;
        this.load = load;
        this.location = location;
        this.project = project;
        this.query = query;
    }

    private JobArgs() {
        this.copy = Input.empty();
        this.extract = Input.empty();
        this.jobId = Input.empty();
        this.jobTimeoutMs = Input.empty();
        this.labels = Input.empty();
        this.load = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
        this.query = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<JobCopyArgs> copy;
        private @Nullable Input<JobExtractArgs> extract;
        private Input<String> jobId;
        private @Nullable Input<String> jobTimeoutMs;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<JobLoadArgs> load;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;
        private @Nullable Input<JobQueryArgs> query;

        public Builder() {
    	      // Empty
        }

        public Builder(JobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copy = defaults.copy;
    	      this.extract = defaults.extract;
    	      this.jobId = defaults.jobId;
    	      this.jobTimeoutMs = defaults.jobTimeoutMs;
    	      this.labels = defaults.labels;
    	      this.load = defaults.load;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.query = defaults.query;
        }

        public Builder setCopy(@Nullable Input<JobCopyArgs> copy) {
            this.copy = copy;
            return this;
        }

        public Builder setCopy(@Nullable JobCopyArgs copy) {
            this.copy = Input.ofNullable(copy);
            return this;
        }

        public Builder setExtract(@Nullable Input<JobExtractArgs> extract) {
            this.extract = extract;
            return this;
        }

        public Builder setExtract(@Nullable JobExtractArgs extract) {
            this.extract = Input.ofNullable(extract);
            return this;
        }

        public Builder setJobId(Input<String> jobId) {
            this.jobId = Objects.requireNonNull(jobId);
            return this;
        }

        public Builder setJobId(String jobId) {
            this.jobId = Input.of(Objects.requireNonNull(jobId));
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

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLoad(@Nullable Input<JobLoadArgs> load) {
            this.load = load;
            return this;
        }

        public Builder setLoad(@Nullable JobLoadArgs load) {
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

        public Builder setQuery(@Nullable Input<JobQueryArgs> query) {
            this.query = query;
            return this;
        }

        public Builder setQuery(@Nullable JobQueryArgs query) {
            this.query = Input.ofNullable(query);
            return this;
        }
        public JobArgs build() {
            return new JobArgs(copy, extract, jobId, jobTimeoutMs, labels, load, location, project, query);
        }
    }
}
