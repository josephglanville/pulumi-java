// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.healthcare_v1beta1.ConsentArtifactArgs;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.ImageResponse;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.SignatureResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new Consent artifact in the parent consent store.
 * 
 */
@ResourceType(type="google-native:healthcare/v1beta1:ConsentArtifact")
public class ConsentArtifact extends io.pulumi.resources.CustomResource {
    /**
     * Optional. Screenshots, PDFs, or other binary information documenting the user's consent.
     * 
     */
    @OutputExport(name="consentContentScreenshots", type=List.class, parameters={ImageResponse.class})
    private Output<List<ImageResponse>> consentContentScreenshots;

    /**
     * @return Optional. Screenshots, PDFs, or other binary information documenting the user's consent.
     * 
     */
    public Output<List<ImageResponse>> getConsentContentScreenshots() {
        return this.consentContentScreenshots;
    }
    /**
     * Optional. An string indicating the version of the consent information shown to the user.
     * 
     */
    @OutputExport(name="consentContentVersion", type=String.class, parameters={})
    private Output<String> consentContentVersion;

    /**
     * @return Optional. An string indicating the version of the consent information shown to the user.
     * 
     */
    public Output<String> getConsentContentVersion() {
        return this.consentContentVersion;
    }
    /**
     * Optional. A signature from a guardian.
     * 
     */
    @OutputExport(name="guardianSignature", type=SignatureResponse.class, parameters={})
    private Output<SignatureResponse> guardianSignature;

    /**
     * @return Optional. A signature from a guardian.
     * 
     */
    public Output<SignatureResponse> getGuardianSignature() {
        return this.guardianSignature;
    }
    /**
     * Optional. Metadata associated with the Consent artifact. For example, the consent locale or user agent version.
     * 
     */
    @OutputExport(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> metadata;

    /**
     * @return Optional. Metadata associated with the Consent artifact. For example, the consent locale or user agent version.
     * 
     */
    public Output<Map<String,String>> getMetadata() {
        return this.metadata;
    }
    /**
     * Resource name of the Consent artifact, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`. Cannot be changed after creation.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the Consent artifact, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`. Cannot be changed after creation.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * User's UUID provided by the client.
     * 
     */
    @OutputExport(name="userId", type=String.class, parameters={})
    private Output<String> userId;

    /**
     * @return User's UUID provided by the client.
     * 
     */
    public Output<String> getUserId() {
        return this.userId;
    }
    /**
     * Optional. User's signature.
     * 
     */
    @OutputExport(name="userSignature", type=SignatureResponse.class, parameters={})
    private Output<SignatureResponse> userSignature;

    /**
     * @return Optional. User's signature.
     * 
     */
    public Output<SignatureResponse> getUserSignature() {
        return this.userSignature;
    }
    /**
     * Optional. A signature from a witness.
     * 
     */
    @OutputExport(name="witnessSignature", type=SignatureResponse.class, parameters={})
    private Output<SignatureResponse> witnessSignature;

    /**
     * @return Optional. A signature from a witness.
     * 
     */
    public Output<SignatureResponse> getWitnessSignature() {
        return this.witnessSignature;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConsentArtifact(String name) {
        this(name, ConsentArtifactArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConsentArtifact(String name, ConsentArtifactArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConsentArtifact(String name, ConsentArtifactArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:healthcare/v1beta1:ConsentArtifact", name, args == null ? ConsentArtifactArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ConsentArtifact(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:healthcare/v1beta1:ConsentArtifact", name, null, makeResourceOptions(options, id));
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
    public static ConsentArtifact get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConsentArtifact(name, id, options);
    }
}
