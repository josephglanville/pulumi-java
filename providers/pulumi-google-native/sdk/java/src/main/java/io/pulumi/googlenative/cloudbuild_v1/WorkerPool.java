// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudbuild_v1.WorkerPoolArgs;
import io.pulumi.googlenative.cloudbuild_v1.outputs.PrivatePoolV1ConfigResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a `WorkerPool`.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:cloudbuild/v1:WorkerPool")
public class WorkerPool extends io.pulumi.resources.CustomResource {
    /**
     * User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
     */
    @Export(name="annotations", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> annotations;

    /**
     * @return User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
     */
    public Output<Map<String,String>> getAnnotations() {
        return this.annotations;
    }
    /**
     * Time at which the request to create the `WorkerPool` was received.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time at which the request to create the `WorkerPool` was received.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Time at which the request to delete the `WorkerPool` was received.
     * 
     */
    @Export(name="deleteTime", type=String.class, parameters={})
    private Output<String> deleteTime;

    /**
     * @return Time at which the request to delete the `WorkerPool` was received.
     * 
     */
    public Output<String> getDeleteTime() {
        return this.deleteTime;
    }
    /**
     * A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Checksum computed by the server. May be sent on update and delete requests to ensure that the client has an up-to-date value before proceeding.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Checksum computed by the server. May be sent on update and delete requests to ensure that the client has an up-to-date value before proceeding.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The resource name of the `WorkerPool`, with format `projects/{project}/locations/{location}/workerPools/{worker_pool}`. The value of `{worker_pool}` is provided by `worker_pool_id` in `CreateWorkerPool` request and the value of `{location}` is determined by the endpoint accessed.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the `WorkerPool`, with format `projects/{project}/locations/{location}/workerPools/{worker_pool}`. The value of `{worker_pool}` is provided by `worker_pool_id` in `CreateWorkerPool` request and the value of `{location}` is determined by the endpoint accessed.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Legacy Private Pool configuration.
     * 
     */
    @Export(name="privatePoolV1Config", type=PrivatePoolV1ConfigResponse.class, parameters={})
    private Output<PrivatePoolV1ConfigResponse> privatePoolV1Config;

    /**
     * @return Legacy Private Pool configuration.
     * 
     */
    public Output<PrivatePoolV1ConfigResponse> getPrivatePoolV1Config() {
        return this.privatePoolV1Config;
    }
    /**
     * `WorkerPool` state.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return `WorkerPool` state.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * A unique identifier for the `WorkerPool`.
     * 
     */
    @Export(name="uid", type=String.class, parameters={})
    private Output<String> uid;

    /**
     * @return A unique identifier for the `WorkerPool`.
     * 
     */
    public Output<String> getUid() {
        return this.uid;
    }
    /**
     * Time at which the request to update the `WorkerPool` was received.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Time at which the request to update the `WorkerPool` was received.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkerPool(String name) {
        this(name, WorkerPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkerPool(String name, WorkerPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkerPool(String name, WorkerPoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudbuild/v1:WorkerPool", name, args == null ? WorkerPoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WorkerPool(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudbuild/v1:WorkerPool", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static WorkerPool get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WorkerPool(name, id, options);
    }
}
