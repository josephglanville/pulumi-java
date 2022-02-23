// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta2;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudtasks_v2beta2.QueueArgs;
import io.pulumi.googlenative.cloudtasks_v2beta2.outputs.AppEngineHttpTargetResponse;
import io.pulumi.googlenative.cloudtasks_v2beta2.outputs.PullTargetResponse;
import io.pulumi.googlenative.cloudtasks_v2beta2.outputs.QueueStatsResponse;
import io.pulumi.googlenative.cloudtasks_v2beta2.outputs.RateLimitsResponse;
import io.pulumi.googlenative.cloudtasks_v2beta2.outputs.RetryConfigResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a queue. Queues created with this method allow tasks to live for a maximum of 31 days. After a task is 31 days old, the task will be deleted regardless of whether it was dispatched or not. WARNING: Using this method may have unintended side effects if you are using an App Engine `queue.yaml` or `queue.xml` file to manage your queues. Read [Overview of Queue Management and queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using this method.
 * 
 */
@ResourceType(type="google-native:cloudtasks/v2beta2:Queue")
public class Queue extends io.pulumi.resources.CustomResource {
    /**
     * App Engine HTTP target. An App Engine queue is a queue that has an AppEngineHttpTarget.
     * 
     */
    @OutputExport(name="appEngineHttpTarget", type=AppEngineHttpTargetResponse.class, parameters={})
    private Output<AppEngineHttpTargetResponse> appEngineHttpTarget;

    /**
     * @return App Engine HTTP target. An App Engine queue is a queue that has an AppEngineHttpTarget.
     * 
     */
    public Output<AppEngineHttpTargetResponse> getAppEngineHttpTarget() {
        return this.appEngineHttpTarget;
    }
    /**
     * Caller-specified and required in CreateQueue, after which it becomes output only. The queue name. The queue name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the queue's location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Caller-specified and required in CreateQueue, after which it becomes output only. The queue name. The queue name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the queue's location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Pull target. A pull queue is a queue that has a PullTarget.
     * 
     */
    @OutputExport(name="pullTarget", type=PullTargetResponse.class, parameters={})
    private Output<PullTargetResponse> pullTarget;

    /**
     * @return Pull target. A pull queue is a queue that has a PullTarget.
     * 
     */
    public Output<PullTargetResponse> getPullTarget() {
        return this.pullTarget;
    }
    /**
     * The last time this queue was purged. All tasks that were created before this time were purged. A queue can be purged using PurgeQueue, the [App Engine Task Queue SDK, or the Cloud Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-and-queues#purging_all_tasks_from_a_queue). Purge time will be truncated to the nearest microsecond. Purge time will be unset if the queue has never been purged.
     * 
     */
    @OutputExport(name="purgeTime", type=String.class, parameters={})
    private Output<String> purgeTime;

    /**
     * @return The last time this queue was purged. All tasks that were created before this time were purged. A queue can be purged using PurgeQueue, the [App Engine Task Queue SDK, or the Cloud Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-and-queues#purging_all_tasks_from_a_queue). Purge time will be truncated to the nearest microsecond. Purge time will be unset if the queue has never been purged.
     * 
     */
    public Output<String> getPurgeTime() {
        return this.purgeTime;
    }
    /**
     * Rate limits for task dispatches. rate_limits and retry_config are related because they both control task attempts however they control how tasks are attempted in different ways: * rate_limits controls the total rate of dispatches from a queue (i.e. all traffic dispatched from the queue, regardless of whether the dispatch is from a first attempt or a retry). * retry_config controls what happens to particular a task after its first attempt fails. That is, retry_config controls task retries (the second attempt, third attempt, etc).
     * 
     */
    @OutputExport(name="rateLimits", type=RateLimitsResponse.class, parameters={})
    private Output<RateLimitsResponse> rateLimits;

    /**
     * @return Rate limits for task dispatches. rate_limits and retry_config are related because they both control task attempts however they control how tasks are attempted in different ways: * rate_limits controls the total rate of dispatches from a queue (i.e. all traffic dispatched from the queue, regardless of whether the dispatch is from a first attempt or a retry). * retry_config controls what happens to particular a task after its first attempt fails. That is, retry_config controls task retries (the second attempt, third attempt, etc).
     * 
     */
    public Output<RateLimitsResponse> getRateLimits() {
        return this.rateLimits;
    }
    /**
     * Settings that determine the retry behavior. * For tasks created using Cloud Tasks: the queue-level retry settings apply to all tasks in the queue that were created using Cloud Tasks. Retry settings cannot be set on individual tasks. * For tasks created using the App Engine SDK: the queue-level retry settings apply to all tasks in the queue which do not have retry settings explicitly set on the task and were created by the App Engine SDK. See [App Engine documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
     * 
     */
    @OutputExport(name="retryConfig", type=RetryConfigResponse.class, parameters={})
    private Output<RetryConfigResponse> retryConfig;

    /**
     * @return Settings that determine the retry behavior. * For tasks created using Cloud Tasks: the queue-level retry settings apply to all tasks in the queue that were created using Cloud Tasks. Retry settings cannot be set on individual tasks. * For tasks created using the App Engine SDK: the queue-level retry settings apply to all tasks in the queue which do not have retry settings explicitly set on the task and were created by the App Engine SDK. See [App Engine documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
     * 
     */
    public Output<RetryConfigResponse> getRetryConfig() {
        return this.retryConfig;
    }
    /**
     * The state of the queue. `state` can only be changed by called PauseQueue, ResumeQueue, or uploading [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref). UpdateQueue cannot be used to change `state`.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the queue. `state` can only be changed by called PauseQueue, ResumeQueue, or uploading [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref). UpdateQueue cannot be used to change `state`.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The realtime, informational statistics for a queue. In order to receive the statistics the caller should include this field in the FieldMask.
     * 
     */
    @OutputExport(name="stats", type=QueueStatsResponse.class, parameters={})
    private Output<QueueStatsResponse> stats;

    /**
     * @return The realtime, informational statistics for a queue. In order to receive the statistics the caller should include this field in the FieldMask.
     * 
     */
    public Output<QueueStatsResponse> getStats() {
        return this.stats;
    }
    /**
     * The maximum amount of time that a task will be retained in this queue. Queues created by Cloud Tasks have a default `task_ttl` of 31 days. After a task has lived for `task_ttl`, the task will be deleted regardless of whether it was dispatched or not. The `task_ttl` for queues created via queue.yaml/xml is equal to the maximum duration because there is a [storage quota](https://cloud.google.com/appengine/quotas#Task_Queue) for these queues. To view the maximum valid duration, see the documentation for Duration.
     * 
     */
    @OutputExport(name="taskTtl", type=String.class, parameters={})
    private Output<String> taskTtl;

    /**
     * @return The maximum amount of time that a task will be retained in this queue. Queues created by Cloud Tasks have a default `task_ttl` of 31 days. After a task has lived for `task_ttl`, the task will be deleted regardless of whether it was dispatched or not. The `task_ttl` for queues created via queue.yaml/xml is equal to the maximum duration because there is a [storage quota](https://cloud.google.com/appengine/quotas#Task_Queue) for these queues. To view the maximum valid duration, see the documentation for Duration.
     * 
     */
    public Output<String> getTaskTtl() {
        return this.taskTtl;
    }
    /**
     * The task tombstone time to live (TTL). After a task is deleted or completed, the task's tombstone is retained for the length of time specified by `tombstone_ttl`. The tombstone is used by task de-duplication; another task with the same name can't be created until the tombstone has expired. For more information about task de-duplication, see the documentation for CreateTaskRequest. Queues created by Cloud Tasks have a default `tombstone_ttl` of 1 hour.
     * 
     */
    @OutputExport(name="tombstoneTtl", type=String.class, parameters={})
    private Output<String> tombstoneTtl;

    /**
     * @return The task tombstone time to live (TTL). After a task is deleted or completed, the task's tombstone is retained for the length of time specified by `tombstone_ttl`. The tombstone is used by task de-duplication; another task with the same name can't be created until the tombstone has expired. For more information about task de-duplication, see the documentation for CreateTaskRequest. Queues created by Cloud Tasks have a default `tombstone_ttl` of 1 hour.
     * 
     */
    public Output<String> getTombstoneTtl() {
        return this.tombstoneTtl;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Queue(String name) {
        this(name, QueueArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Queue(String name, @Nullable QueueArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Queue(String name, @Nullable QueueArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudtasks/v2beta2:Queue", name, args == null ? QueueArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Queue(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudtasks/v2beta2:Queue", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Queue get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Queue(name, id, options);
    }
}
