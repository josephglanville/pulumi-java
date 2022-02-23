// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.pubsub.TopicArgs;
import io.pulumi.gcp.pubsub.inputs.TopicState;
import io.pulumi.gcp.pubsub.outputs.TopicMessageStoragePolicy;
import io.pulumi.gcp.pubsub.outputs.TopicSchemaSettings;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A named resource to which messages are sent by publishers.
 * 
 * To get more information about Topic, see:
 * 
 * * [API documentation](https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.topics)
 * * How-to Guides
 *     * [Managing Topics](https://cloud.google.com/pubsub/docs/admin#managing_topics)
 * 
 * > **Note:** You can retrieve the email of the Google Managed Pub/Sub Service Account used for forwarding
 * by using the `gcp.projects.ServiceIdentity` resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Topic can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:pubsub/topic:Topic default projects/{{project}}/topics/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:pubsub/topic:Topic default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:pubsub/topic:Topic default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:pubsub/topic:Topic")
public class Topic extends io.pulumi.resources.CustomResource {
    /**
     * The resource name of the Cloud KMS CryptoKey to be used to protect access
     * to messages published on this topic. Your project's PubSub service account
     * (`service-{{PROJECT_NUMBER}}@gcp-sa-pubsub.iam.gserviceaccount.com`) must have
     * `roles/cloudkms.cryptoKeyEncrypterDecrypter` to use this feature.
     * The expected format is `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`
     * 
     */
    @OutputExport(name="kmsKeyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyName;

    /**
     * @return The resource name of the Cloud KMS CryptoKey to be used to protect access
     * to messages published on this topic. Your project's PubSub service account
     * (`service-{{PROJECT_NUMBER}}@gcp-sa-pubsub.iam.gserviceaccount.com`) must have
     * `roles/cloudkms.cryptoKeyEncrypterDecrypter` to use this feature.
     * The expected format is `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`
     * 
     */
    public Output</* @Nullable */ String> getKmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * A set of key/value label pairs to assign to this Topic.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return A set of key/value label pairs to assign to this Topic.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Indicates the minimum duration to retain a message after it is published
     * to the topic. If this field is set, messages published to the topic in
     * the last messageRetentionDuration are always available to subscribers.
     * For instance, it allows any attached subscription to seek to a timestamp
     * that is up to messageRetentionDuration in the past. If this field is not
     * set, message retention is controlled by settings on individual subscriptions.
     * Cannot be more than 7 days or less than 10 minutes.
     * 
     */
    @OutputExport(name="messageRetentionDuration", type=String.class, parameters={})
    private Output</* @Nullable */ String> messageRetentionDuration;

    /**
     * @return Indicates the minimum duration to retain a message after it is published
     * to the topic. If this field is set, messages published to the topic in
     * the last messageRetentionDuration are always available to subscribers.
     * For instance, it allows any attached subscription to seek to a timestamp
     * that is up to messageRetentionDuration in the past. If this field is not
     * set, message retention is controlled by settings on individual subscriptions.
     * Cannot be more than 7 days or less than 10 minutes.
     * 
     */
    public Output</* @Nullable */ String> getMessageRetentionDuration() {
        return this.messageRetentionDuration;
    }
    /**
     * Policy constraining the set of Google Cloud Platform regions where
     * messages published to the topic may be stored. If not present, then no
     * constraints are in effect.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="messageStoragePolicy", type=TopicMessageStoragePolicy.class, parameters={})
    private Output<TopicMessageStoragePolicy> messageStoragePolicy;

    /**
     * @return Policy constraining the set of Google Cloud Platform regions where
     * messages published to the topic may be stored. If not present, then no
     * constraints are in effect.
     * Structure is documented below.
     * 
     */
    public Output<TopicMessageStoragePolicy> getMessageStoragePolicy() {
        return this.messageStoragePolicy;
    }
    /**
     * Name of the topic.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the topic.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Settings for validating messages published against a schema.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="schemaSettings", type=TopicSchemaSettings.class, parameters={})
    private Output<TopicSchemaSettings> schemaSettings;

    /**
     * @return Settings for validating messages published against a schema.
     * Structure is documented below.
     * 
     */
    public Output<TopicSchemaSettings> getSchemaSettings() {
        return this.schemaSettings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Topic(String name) {
        this(name, TopicArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Topic(String name, @Nullable TopicArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Topic(String name, @Nullable TopicArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:pubsub/topic:Topic", name, args == null ? TopicArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Topic(String name, Input<String> id, @Nullable TopicState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:pubsub/topic:Topic", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Topic get(String name, Input<String> id, @Nullable TopicState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Topic(name, id, state, options);
    }
}
