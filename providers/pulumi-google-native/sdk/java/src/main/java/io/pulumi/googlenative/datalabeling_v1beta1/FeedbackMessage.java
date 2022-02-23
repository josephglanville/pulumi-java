// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datalabeling_v1beta1.FeedbackMessageArgs;
import io.pulumi.googlenative.datalabeling_v1beta1.outputs.GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse;
import io.pulumi.googlenative.datalabeling_v1beta1.outputs.GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Create a FeedbackMessage object.
 * 
 */
@ResourceType(type="google-native:datalabeling/v1beta1:FeedbackMessage")
public class FeedbackMessage extends io.pulumi.resources.CustomResource {
    /**
     * String content of the feedback. Maximum of 10000 characters.
     * 
     */
    @OutputExport(name="body", type=String.class, parameters={})
    private Output<String> body;

    /**
     * @return String content of the feedback. Maximum of 10000 characters.
     * 
     */
    public Output<String> getBody() {
        return this.body;
    }
    /**
     * Create time.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Create time.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The image storing this feedback if the feedback is an image representing operator's comments.
     * 
     */
    @OutputExport(name="image", type=String.class, parameters={})
    private Output<String> image;

    /**
     * @return The image storing this feedback if the feedback is an image representing operator's comments.
     * 
     */
    public Output<String> getImage() {
        return this.image;
    }
    /**
     * Name of the feedback message in a feedback thread. Format: 'project/{project_id}/datasets/{dataset_id}/annotatedDatasets/{annotated_dataset_id}/feedbackThreads/{feedback_thread_id}/feedbackMessage/{feedback_message_id}'
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the feedback message in a feedback thread. Format: 'project/{project_id}/datasets/{dataset_id}/annotatedDatasets/{annotated_dataset_id}/feedbackThreads/{feedback_thread_id}/feedbackMessage/{feedback_message_id}'
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="operatorFeedbackMetadata", type=GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse.class, parameters={})
    private Output<GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse> operatorFeedbackMetadata;

    public Output<GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse> getOperatorFeedbackMetadata() {
        return this.operatorFeedbackMetadata;
    }
    @OutputExport(name="requesterFeedbackMetadata", type=GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataResponse.class, parameters={})
    private Output<GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataResponse> requesterFeedbackMetadata;

    public Output<GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataResponse> getRequesterFeedbackMetadata() {
        return this.requesterFeedbackMetadata;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FeedbackMessage(String name) {
        this(name, FeedbackMessageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FeedbackMessage(String name, FeedbackMessageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FeedbackMessage(String name, FeedbackMessageArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datalabeling/v1beta1:FeedbackMessage", name, args == null ? FeedbackMessageArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FeedbackMessage(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datalabeling/v1beta1:FeedbackMessage", name, null, makeResourceOptions(options, id));
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
    public static FeedbackMessage get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FeedbackMessage(name, id, options);
    }
}
