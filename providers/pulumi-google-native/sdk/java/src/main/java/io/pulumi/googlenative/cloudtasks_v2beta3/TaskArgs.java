// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta3;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.cloudtasks_v2beta3.enums.TaskResponseView;
import io.pulumi.googlenative.cloudtasks_v2beta3.inputs.AppEngineHttpRequestArgs;
import io.pulumi.googlenative.cloudtasks_v2beta3.inputs.HttpRequestArgs;
import io.pulumi.googlenative.cloudtasks_v2beta3.inputs.PullMessageArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskArgs Empty = new TaskArgs();

    /**
     * HTTP request that is sent to the App Engine app handler. An App Engine task is a task that has AppEngineHttpRequest set.
     * 
     */
    @Import(name="appEngineHttpRequest")
      private final @Nullable Output<AppEngineHttpRequestArgs> appEngineHttpRequest;

    public Output<AppEngineHttpRequestArgs> getAppEngineHttpRequest() {
        return this.appEngineHttpRequest == null ? Codegen.empty() : this.appEngineHttpRequest;
    }

    /**
     * The deadline for requests sent to the worker. If the worker does not respond by this deadline then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. Cloud Tasks will retry the task according to the RetryConfig. Note that when the request is cancelled, Cloud Tasks will stop listening for the response, but whether the worker stops processing depends on the worker. For example, if the worker is stuck, it may not react to cancelled requests. The default and maximum values depend on the type of request: * For HTTP tasks, the default is 10 minutes. The deadline must be in the interval [15 seconds, 30 minutes]. * For App Engine tasks, 0 indicates that the request has the default deadline. The default deadline depends on the [scaling type](https://cloud.google.com/appengine/docs/standard/go/how-instances-are-managed#instance_scaling) of the service: 10 minutes for standard apps with automatic scaling, 24 hours for standard apps with manual and basic scaling, and 60 minutes for flex apps. If the request deadline is set, it must be in the interval [15 seconds, 24 hours 15 seconds]. Regardless of the task's `dispatch_deadline`, the app handler will not run for longer than than the service's timeout. We recommend setting the `dispatch_deadline` to at most a few seconds more than the app handler's timeout. For more information see [Timeouts](https://cloud.google.com/tasks/docs/creating-appengine-handlers#timeouts). `dispatch_deadline` will be truncated to the nearest millisecond. The deadline is an approximate deadline.
     * 
     */
    @Import(name="dispatchDeadline")
      private final @Nullable Output<String> dispatchDeadline;

    public Output<String> getDispatchDeadline() {
        return this.dispatchDeadline == null ? Codegen.empty() : this.dispatchDeadline;
    }

    /**
     * HTTP request that is sent to the task's target. An HTTP task is a task that has HttpRequest set.
     * 
     */
    @Import(name="httpRequest")
      private final @Nullable Output<HttpRequestArgs> httpRequest;

    public Output<HttpRequestArgs> getHttpRequest() {
        return this.httpRequest == null ? Codegen.empty() : this.httpRequest;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Optionally caller-specified in CreateTask. The task name. The task name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the task's location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters. * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Pull Message contained in a task in a PULL queue type. This payload type cannot be explicitly set through Cloud Tasks API. Its purpose, currently is to provide backward compatibility with App Engine Task Queue [pull](https://cloud.google.com/appengine/docs/standard/java/taskqueue/pull/) queues to provide a way to inspect contents of pull tasks through the CloudTasks.GetTask.
     * 
     */
    @Import(name="pullMessage")
      private final @Nullable Output<PullMessageArgs> pullMessage;

    public Output<PullMessageArgs> getPullMessage() {
        return this.pullMessage == null ? Codegen.empty() : this.pullMessage;
    }

    @Import(name="queueId", required=true)
      private final Output<String> queueId;

    public Output<String> getQueueId() {
        return this.queueId;
    }

    /**
     * The response_view specifies which subset of the Task will be returned. By default response_view is BASIC; not all information is retrieved by default because some data, such as payloads, might be desirable to return only when needed because of its large size or because of the sensitivity of data that it contains. Authorization for FULL requires `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/) permission on the Task resource.
     * 
     */
    @Import(name="responseView")
      private final @Nullable Output<TaskResponseView> responseView;

    public Output<TaskResponseView> getResponseView() {
        return this.responseView == null ? Codegen.empty() : this.responseView;
    }

    /**
     * The time when the task is scheduled to be attempted. For App Engine queues, this is when the task will be attempted or retried. `schedule_time` will be truncated to the nearest microsecond.
     * 
     */
    @Import(name="scheduleTime")
      private final @Nullable Output<String> scheduleTime;

    public Output<String> getScheduleTime() {
        return this.scheduleTime == null ? Codegen.empty() : this.scheduleTime;
    }

    public TaskArgs(
        @Nullable Output<AppEngineHttpRequestArgs> appEngineHttpRequest,
        @Nullable Output<String> dispatchDeadline,
        @Nullable Output<HttpRequestArgs> httpRequest,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<PullMessageArgs> pullMessage,
        Output<String> queueId,
        @Nullable Output<TaskResponseView> responseView,
        @Nullable Output<String> scheduleTime) {
        this.appEngineHttpRequest = appEngineHttpRequest;
        this.dispatchDeadline = dispatchDeadline;
        this.httpRequest = httpRequest;
        this.location = location;
        this.name = name;
        this.project = project;
        this.pullMessage = pullMessage;
        this.queueId = Objects.requireNonNull(queueId, "expected parameter 'queueId' to be non-null");
        this.responseView = responseView;
        this.scheduleTime = scheduleTime;
    }

    private TaskArgs() {
        this.appEngineHttpRequest = Codegen.empty();
        this.dispatchDeadline = Codegen.empty();
        this.httpRequest = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.pullMessage = Codegen.empty();
        this.queueId = Codegen.empty();
        this.responseView = Codegen.empty();
        this.scheduleTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AppEngineHttpRequestArgs> appEngineHttpRequest;
        private @Nullable Output<String> dispatchDeadline;
        private @Nullable Output<HttpRequestArgs> httpRequest;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<PullMessageArgs> pullMessage;
        private Output<String> queueId;
        private @Nullable Output<TaskResponseView> responseView;
        private @Nullable Output<String> scheduleTime;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineHttpRequest = defaults.appEngineHttpRequest;
    	      this.dispatchDeadline = defaults.dispatchDeadline;
    	      this.httpRequest = defaults.httpRequest;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pullMessage = defaults.pullMessage;
    	      this.queueId = defaults.queueId;
    	      this.responseView = defaults.responseView;
    	      this.scheduleTime = defaults.scheduleTime;
        }

        public Builder appEngineHttpRequest(@Nullable Output<AppEngineHttpRequestArgs> appEngineHttpRequest) {
            this.appEngineHttpRequest = appEngineHttpRequest;
            return this;
        }
        public Builder appEngineHttpRequest(@Nullable AppEngineHttpRequestArgs appEngineHttpRequest) {
            this.appEngineHttpRequest = Codegen.ofNullable(appEngineHttpRequest);
            return this;
        }
        public Builder dispatchDeadline(@Nullable Output<String> dispatchDeadline) {
            this.dispatchDeadline = dispatchDeadline;
            return this;
        }
        public Builder dispatchDeadline(@Nullable String dispatchDeadline) {
            this.dispatchDeadline = Codegen.ofNullable(dispatchDeadline);
            return this;
        }
        public Builder httpRequest(@Nullable Output<HttpRequestArgs> httpRequest) {
            this.httpRequest = httpRequest;
            return this;
        }
        public Builder httpRequest(@Nullable HttpRequestArgs httpRequest) {
            this.httpRequest = Codegen.ofNullable(httpRequest);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder pullMessage(@Nullable Output<PullMessageArgs> pullMessage) {
            this.pullMessage = pullMessage;
            return this;
        }
        public Builder pullMessage(@Nullable PullMessageArgs pullMessage) {
            this.pullMessage = Codegen.ofNullable(pullMessage);
            return this;
        }
        public Builder queueId(Output<String> queueId) {
            this.queueId = Objects.requireNonNull(queueId);
            return this;
        }
        public Builder queueId(String queueId) {
            this.queueId = Output.of(Objects.requireNonNull(queueId));
            return this;
        }
        public Builder responseView(@Nullable Output<TaskResponseView> responseView) {
            this.responseView = responseView;
            return this;
        }
        public Builder responseView(@Nullable TaskResponseView responseView) {
            this.responseView = Codegen.ofNullable(responseView);
            return this;
        }
        public Builder scheduleTime(@Nullable Output<String> scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public Builder scheduleTime(@Nullable String scheduleTime) {
            this.scheduleTime = Codegen.ofNullable(scheduleTime);
            return this;
        }        public TaskArgs build() {
            return new TaskArgs(appEngineHttpRequest, dispatchDeadline, httpRequest, location, name, project, pullMessage, queueId, responseView, scheduleTime);
        }
    }
}
