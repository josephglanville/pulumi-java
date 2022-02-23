// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1beta1a;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.pubsub_v1beta1a.SubscriptionArgs;
import io.pulumi.googlenative.pubsub_v1beta1a.outputs.PushConfigResponse;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a subscription on a given topic for a given subscriber. If the subscription already exists, returns ALREADY_EXISTS. If the corresponding topic doesn't exist, returns NOT_FOUND. If the name is not provided in the request, the server will assign a random name for this subscription on the same project as the topic.
 * 
 */
@ResourceType(type="google-native:pubsub/v1beta1a:Subscription")
public class Subscription extends io.pulumi.resources.CustomResource {
    /**
     * For either push or pull delivery, the value is the maximum time after a subscriber receives a message before the subscriber should acknowledge or Nack the message. If the Ack deadline for a message passes without an Ack or a Nack, the Pub/Sub system will eventually redeliver the message. If a subscriber acknowledges after the deadline, the Pub/Sub system may accept the Ack, but it is possible that the message has been already delivered again. Multiple Acks to the message are allowed and will succeed. For push delivery, this value is used to set the request timeout for the call to the push endpoint. For pull delivery, this value is used as the initial value for the Ack deadline. It may be overridden for each message using its corresponding ack_id with ModifyAckDeadline. While a message is outstanding (i.e. it has been delivered to a pull subscriber and the subscriber has not yet Acked or Nacked), the Pub/Sub system will not deliver that message to another pull subscriber (on a best-effort basis).
     * 
     */
    @OutputExport(name="ackDeadlineSeconds", type=Integer.class, parameters={})
    private Output<Integer> ackDeadlineSeconds;

    /**
     * @return For either push or pull delivery, the value is the maximum time after a subscriber receives a message before the subscriber should acknowledge or Nack the message. If the Ack deadline for a message passes without an Ack or a Nack, the Pub/Sub system will eventually redeliver the message. If a subscriber acknowledges after the deadline, the Pub/Sub system may accept the Ack, but it is possible that the message has been already delivered again. Multiple Acks to the message are allowed and will succeed. For push delivery, this value is used to set the request timeout for the call to the push endpoint. For pull delivery, this value is used as the initial value for the Ack deadline. It may be overridden for each message using its corresponding ack_id with ModifyAckDeadline. While a message is outstanding (i.e. it has been delivered to a pull subscriber and the subscriber has not yet Acked or Nacked), the Pub/Sub system will not deliver that message to another pull subscriber (on a best-effort basis).
     * 
     */
    public Output<Integer> getAckDeadlineSeconds() {
        return this.ackDeadlineSeconds;
    }
    /**
     * Name of the subscription.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the subscription.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * If push delivery is used with this subscription, this field is used to configure it.
     * 
     */
    @OutputExport(name="pushConfig", type=PushConfigResponse.class, parameters={})
    private Output<PushConfigResponse> pushConfig;

    /**
     * @return If push delivery is used with this subscription, this field is used to configure it.
     * 
     */
    public Output<PushConfigResponse> getPushConfig() {
        return this.pushConfig;
    }
    /**
     * The name of the topic from which this subscription is receiving messages.
     * 
     */
    @OutputExport(name="topic", type=String.class, parameters={})
    private Output<String> topic;

    /**
     * @return The name of the topic from which this subscription is receiving messages.
     * 
     */
    public Output<String> getTopic() {
        return this.topic;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Subscription(String name) {
        this(name, SubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Subscription(String name, @Nullable SubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Subscription(String name, @Nullable SubscriptionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:pubsub/v1beta1a:Subscription", name, args == null ? SubscriptionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Subscription(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:pubsub/v1beta1a:Subscription", name, null, makeResourceOptions(options, id));
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
    public static Subscription get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Subscription(name, id, options);
    }
}
