// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datapipelines_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datapipelines_v1.enums.PipelineState;
import io.pulumi.googlenative.datapipelines_v1.enums.PipelineType;
import io.pulumi.googlenative.datapipelines_v1.inputs.GoogleCloudDatapipelinesV1ScheduleSpecArgs;
import io.pulumi.googlenative.datapipelines_v1.inputs.GoogleCloudDatapipelinesV1WorkloadArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineArgs Empty = new PipelineArgs();

    /**
     * The display name of the pipeline. It can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), and underscores (_).
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The pipeline name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/pipelines/PIPELINE_ID`. * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), and periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects). * `LOCATION_ID` is the canonical ID for the pipeline's location. The list of available locations can be obtained by calling `google.cloud.location.Locations.ListLocations`. Note that the Data Pipelines service is not available in all regions. It depends on Cloud Scheduler, an App Engine application, so it's only available in [App Engine regions](https://cloud.google.com/about/locations#region). * `PIPELINE_ID` is the ID of the pipeline. Must be unique for the selected project and location.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Immutable. The sources of the pipeline (for example, Dataplex). The keys and values are set by the corresponding sources during pipeline creation.
     * 
     */
    @Import(name="pipelineSources")
      private final @Nullable Output<Map<String,String>> pipelineSources;

    public Output<Map<String,String>> getPipelineSources() {
        return this.pipelineSources == null ? Output.empty() : this.pipelineSources;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Internal scheduling information for a pipeline. If this information is provided, periodic jobs will be created per the schedule. If not, users are responsible for creating jobs externally.
     * 
     */
    @Import(name="scheduleInfo")
      private final @Nullable Output<GoogleCloudDatapipelinesV1ScheduleSpecArgs> scheduleInfo;

    public Output<GoogleCloudDatapipelinesV1ScheduleSpecArgs> getScheduleInfo() {
        return this.scheduleInfo == null ? Output.empty() : this.scheduleInfo;
    }

    /**
     * Optional. A service account email to be used with the Cloud Scheduler job. If not specified, the default compute engine service account will be used.
     * 
     */
    @Import(name="schedulerServiceAccountEmail")
      private final @Nullable Output<String> schedulerServiceAccountEmail;

    public Output<String> getSchedulerServiceAccountEmail() {
        return this.schedulerServiceAccountEmail == null ? Output.empty() : this.schedulerServiceAccountEmail;
    }

    /**
     * The state of the pipeline. When the pipeline is created, the state is set to 'PIPELINE_STATE_ACTIVE' by default. State changes can be requested by setting the state to stopping, paused, or resuming. State cannot be changed through UpdatePipeline requests.
     * 
     */
    @Import(name="state", required=true)
      private final Output<PipelineState> state;

    public Output<PipelineState> getState() {
        return this.state;
    }

    /**
     * The type of the pipeline. This field affects the scheduling of the pipeline and the type of metrics to show for the pipeline.
     * 
     */
    @Import(name="type", required=true)
      private final Output<PipelineType> type;

    public Output<PipelineType> getType() {
        return this.type;
    }

    /**
     * Workload information for creating new jobs.
     * 
     */
    @Import(name="workload")
      private final @Nullable Output<GoogleCloudDatapipelinesV1WorkloadArgs> workload;

    public Output<GoogleCloudDatapipelinesV1WorkloadArgs> getWorkload() {
        return this.workload == null ? Output.empty() : this.workload;
    }

    public PipelineArgs(
        Output<String> displayName,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> pipelineSources,
        @Nullable Output<String> project,
        @Nullable Output<GoogleCloudDatapipelinesV1ScheduleSpecArgs> scheduleInfo,
        @Nullable Output<String> schedulerServiceAccountEmail,
        Output<PipelineState> state,
        Output<PipelineType> type,
        @Nullable Output<GoogleCloudDatapipelinesV1WorkloadArgs> workload) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.location = location;
        this.name = name;
        this.pipelineSources = pipelineSources;
        this.project = project;
        this.scheduleInfo = scheduleInfo;
        this.schedulerServiceAccountEmail = schedulerServiceAccountEmail;
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.workload = workload;
    }

    private PipelineArgs() {
        this.displayName = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.pipelineSources = Output.empty();
        this.project = Output.empty();
        this.scheduleInfo = Output.empty();
        this.schedulerServiceAccountEmail = Output.empty();
        this.state = Output.empty();
        this.type = Output.empty();
        this.workload = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> displayName;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> pipelineSources;
        private @Nullable Output<String> project;
        private @Nullable Output<GoogleCloudDatapipelinesV1ScheduleSpecArgs> scheduleInfo;
        private @Nullable Output<String> schedulerServiceAccountEmail;
        private Output<PipelineState> state;
        private Output<PipelineType> type;
        private @Nullable Output<GoogleCloudDatapipelinesV1WorkloadArgs> workload;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.pipelineSources = defaults.pipelineSources;
    	      this.project = defaults.project;
    	      this.scheduleInfo = defaults.scheduleInfo;
    	      this.schedulerServiceAccountEmail = defaults.schedulerServiceAccountEmail;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.workload = defaults.workload;
        }

        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder pipelineSources(@Nullable Output<Map<String,String>> pipelineSources) {
            this.pipelineSources = pipelineSources;
            return this;
        }
        public Builder pipelineSources(@Nullable Map<String,String> pipelineSources) {
            this.pipelineSources = Output.ofNullable(pipelineSources);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder scheduleInfo(@Nullable Output<GoogleCloudDatapipelinesV1ScheduleSpecArgs> scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public Builder scheduleInfo(@Nullable GoogleCloudDatapipelinesV1ScheduleSpecArgs scheduleInfo) {
            this.scheduleInfo = Output.ofNullable(scheduleInfo);
            return this;
        }
        public Builder schedulerServiceAccountEmail(@Nullable Output<String> schedulerServiceAccountEmail) {
            this.schedulerServiceAccountEmail = schedulerServiceAccountEmail;
            return this;
        }
        public Builder schedulerServiceAccountEmail(@Nullable String schedulerServiceAccountEmail) {
            this.schedulerServiceAccountEmail = Output.ofNullable(schedulerServiceAccountEmail);
            return this;
        }
        public Builder state(Output<PipelineState> state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder state(PipelineState state) {
            this.state = Output.of(Objects.requireNonNull(state));
            return this;
        }
        public Builder type(Output<PipelineType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(PipelineType type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder workload(@Nullable Output<GoogleCloudDatapipelinesV1WorkloadArgs> workload) {
            this.workload = workload;
            return this;
        }
        public Builder workload(@Nullable GoogleCloudDatapipelinesV1WorkloadArgs workload) {
            this.workload = Output.ofNullable(workload);
            return this;
        }        public PipelineArgs build() {
            return new PipelineArgs(displayName, location, name, pipelineSources, project, scheduleInfo, schedulerServiceAccountEmail, state, type, workload);
        }
    }
}
