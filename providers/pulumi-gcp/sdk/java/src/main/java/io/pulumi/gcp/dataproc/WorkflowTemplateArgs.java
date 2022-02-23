// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateArgs Empty = new WorkflowTemplateArgs();

    /**
     * (Beta only) Optional. Timeout duration for the DAG of jobs. You can use "s", "m", "h", and "d" suffixes for second, minute, hour, and day duration values, respectively. The timeout duration must be from 10 minutes ("10m") to 24 hours ("24h" or "1d"). The timer begins when the first job is submitted. If the workflow is running at the end of the timeout period, any remaining jobs are cancelled, the workflow is ended, and if the workflow was running on a (/dataproc/docs/concepts/workflows/using-workflows#configuring_or_selecting_a_cluster), the cluster is deleted.
     * 
     */
    @InputImport(name="dagTimeout")
      private final @Nullable Input<String> dagTimeout;

    public Input<String> getDagTimeout() {
        return this.dagTimeout == null ? Input.empty() : this.dagTimeout;
    }

    /**
     * Required. The Directed Acyclic Graph of Jobs to submit.
     * 
     */
    @InputImport(name="jobs", required=true)
      private final Input<List<WorkflowTemplateJobArgs>> jobs;

    public Input<List<WorkflowTemplateJobArgs>> getJobs() {
        return this.jobs;
    }

    /**
     * Optional. The labels to associate with this cluster. Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: {0,63} No more than 32 labels can be associated with a given cluster.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The location for the resource
     * 
     */
    @InputImport(name="location", required=true)
      private final Input<String> location;

    public Input<String> getLocation() {
        return this.location;
    }

    /**
     * Required. Parameter name. The parameter name is used as the key, and paired with the parameter value, which are passed to the template when the template is instantiated. The name must contain only capital letters (A-Z), numbers (0-9), and underscores (_), and must not start with a number. The maximum length is 40 characters.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided when the template is instantiated.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<List<WorkflowTemplateParameterArgs>> parameters;

    public Input<List<WorkflowTemplateParameterArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Required. WorkflowTemplate scheduling information.
     * 
     */
    @InputImport(name="placement", required=true)
      private final Input<WorkflowTemplatePlacementArgs> placement;

    public Input<WorkflowTemplatePlacementArgs> getPlacement() {
        return this.placement;
    }

    /**
     * The project for the resource
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Optional. Used to perform a consistent read-modify-write. This field should be left blank for a `CreateWorkflowTemplate` request. It is required for an `UpdateWorkflowTemplate` request, and must match the current server version. A typical update template flow would fetch the current template with a `GetWorkflowTemplate` request, which will return the current template with the `version` field filled in with the current server version. The user updates other fields in the template, then returns it as part of the `UpdateWorkflowTemplate` request.
     * 
     * @deprecated
     * version is not useful as a configurable field, and will be removed in the future.
     * 
     */
    @Deprecated /* version is not useful as a configurable field, and will be removed in the future. */
    @InputImport(name="version")
      private final @Nullable Input<Integer> version;

    @Deprecated /* version is not useful as a configurable field, and will be removed in the future. */
    public Input<Integer> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public WorkflowTemplateArgs(
        @Nullable Input<String> dagTimeout,
        Input<List<WorkflowTemplateJobArgs>> jobs,
        @Nullable Input<Map<String,String>> labels,
        Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<List<WorkflowTemplateParameterArgs>> parameters,
        Input<WorkflowTemplatePlacementArgs> placement,
        @Nullable Input<String> project,
        @Nullable Input<Integer> version) {
        this.dagTimeout = dagTimeout;
        this.jobs = Objects.requireNonNull(jobs, "expected parameter 'jobs' to be non-null");
        this.labels = labels;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.name = name;
        this.parameters = parameters;
        this.placement = Objects.requireNonNull(placement, "expected parameter 'placement' to be non-null");
        this.project = project;
        this.version = version;
    }

    private WorkflowTemplateArgs() {
        this.dagTimeout = Input.empty();
        this.jobs = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.parameters = Input.empty();
        this.placement = Input.empty();
        this.project = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dagTimeout;
        private Input<List<WorkflowTemplateJobArgs>> jobs;
        private @Nullable Input<Map<String,String>> labels;
        private Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<List<WorkflowTemplateParameterArgs>> parameters;
        private Input<WorkflowTemplatePlacementArgs> placement;
        private @Nullable Input<String> project;
        private @Nullable Input<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dagTimeout = defaults.dagTimeout;
    	      this.jobs = defaults.jobs;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.placement = defaults.placement;
    	      this.project = defaults.project;
    	      this.version = defaults.version;
        }

        public Builder setDagTimeout(@Nullable Input<String> dagTimeout) {
            this.dagTimeout = dagTimeout;
            return this;
        }

        public Builder setDagTimeout(@Nullable String dagTimeout) {
            this.dagTimeout = Input.ofNullable(dagTimeout);
            return this;
        }

        public Builder setJobs(Input<List<WorkflowTemplateJobArgs>> jobs) {
            this.jobs = Objects.requireNonNull(jobs);
            return this;
        }

        public Builder setJobs(List<WorkflowTemplateJobArgs> jobs) {
            this.jobs = Input.of(Objects.requireNonNull(jobs));
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

        public Builder setLocation(Input<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Input.of(Objects.requireNonNull(location));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setParameters(@Nullable Input<List<WorkflowTemplateParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable List<WorkflowTemplateParameterArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setPlacement(Input<WorkflowTemplatePlacementArgs> placement) {
            this.placement = Objects.requireNonNull(placement);
            return this;
        }

        public Builder setPlacement(WorkflowTemplatePlacementArgs placement) {
            this.placement = Input.of(Objects.requireNonNull(placement));
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

        public Builder setVersion(@Nullable Input<Integer> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable Integer version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public WorkflowTemplateArgs build() {
            return new WorkflowTemplateArgs(dagTimeout, jobs, labels, location, name, parameters, placement, project, version);
        }
    }
}
