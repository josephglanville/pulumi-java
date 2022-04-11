// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v2.ParticipantArgs;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new participant in a conversation.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:dialogflow/v2:Participant")
public class Participant extends io.pulumi.resources.CustomResource {
    /**
     * Optional. Key-value filters on the metadata of documents returned by article suggestion. If specified, article suggestion only returns suggested documents that match all filters in their Document.metadata. Multiple values for a metadata key should be concatenated by comma. For example, filters to match all documents that have 'US' or 'CA' in their market metadata values and 'agent' in their user metadata values will be ```documents_metadata_filters { key: "market" value: "US,CA" } documents_metadata_filters { key: "user" value: "agent" }```
     * 
     */
    @Export(name="documentsMetadataFilters", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> documentsMetadataFilters;

    /**
     * @return Optional. Key-value filters on the metadata of documents returned by article suggestion. If specified, article suggestion only returns suggested documents that match all filters in their Document.metadata. Multiple values for a metadata key should be concatenated by comma. For example, filters to match all documents that have 'US' or 'CA' in their market metadata values and 'agent' in their user metadata values will be ```documents_metadata_filters { key: "market" value: "US,CA" } documents_metadata_filters { key: "user" value: "agent" }```
     * 
     */
    public Output<Map<String,String>> getDocumentsMetadataFilters() {
        return this.documentsMetadataFilters;
    }
    /**
     * Optional. The unique identifier of this participant. Format: `projects//locations//conversations//participants/`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Optional. The unique identifier of this participant. Format: `projects//locations//conversations//participants/`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Immutable. The role this participant plays in the conversation. This field must be set during participant creation and is then immutable.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return Immutable. The role this participant plays in the conversation. This field must be set during participant creation and is then immutable.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }
    /**
     * Optional. Label applied to streams representing this participant in SIPREC XML metadata and SDP. This is used to assign transcriptions from that media stream to this participant. This field can be updated.
     * 
     */
    @Export(name="sipRecordingMediaLabel", type=String.class, parameters={})
    private Output<String> sipRecordingMediaLabel;

    /**
     * @return Optional. Label applied to streams representing this participant in SIPREC XML metadata and SDP. This is used to assign transcriptions from that media stream to this participant. This field can be updated.
     * 
     */
    public Output<String> getSipRecordingMediaLabel() {
        return this.sipRecordingMediaLabel;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Participant(String name) {
        this(name, ParticipantArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Participant(String name, ParticipantArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Participant(String name, ParticipantArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2:Participant", name, args == null ? ParticipantArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Participant(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2:Participant", name, null, makeResourceOptions(options, id));
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
    public static Participant get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Participant(name, id, options);
    }
}
