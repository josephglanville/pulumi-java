// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ivs;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ivs.PlaybackKeyPairArgs;
import io.pulumi.awsnative.ivs.outputs.PlaybackKeyPairTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::IVS::PlaybackKeyPair
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:ivs:PlaybackKeyPair")
public class PlaybackKeyPair extends io.pulumi.resources.CustomResource {
    /**
     * Key-pair identifier.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Key-pair identifier.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Key-pair identifier.
     * 
     */
    @OutputExport(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Key-pair identifier.
     * 
     */
    public Output<String> getFingerprint() {
        return this.fingerprint;
    }
    /**
     * An arbitrary string (a nickname) assigned to a playback key pair that helps the customer identify that resource. The value does not need to be unique.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return An arbitrary string (a nickname) assigned to a playback key pair that helps the customer identify that resource. The value does not need to be unique.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * The public portion of a customer-generated key pair.
     * 
     */
    @OutputExport(name="publicKeyMaterial", type=String.class, parameters={})
    private Output<String> publicKeyMaterial;

    /**
     * @return The public portion of a customer-generated key pair.
     * 
     */
    public Output<String> getPublicKeyMaterial() {
        return this.publicKeyMaterial;
    }
    /**
     * A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={PlaybackKeyPairTag.class})
    private Output</* @Nullable */ List<PlaybackKeyPairTag>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    public Output</* @Nullable */ List<PlaybackKeyPairTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(PlaybackKeyPairArgs.Builder a);
    }
    private static io.pulumi.awsnative.ivs.PlaybackKeyPairArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.ivs.PlaybackKeyPairArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PlaybackKeyPair(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PlaybackKeyPair(String name) {
        this(name, PlaybackKeyPairArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PlaybackKeyPair(String name, PlaybackKeyPairArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PlaybackKeyPair(String name, PlaybackKeyPairArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ivs:PlaybackKeyPair", name, args == null ? PlaybackKeyPairArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private PlaybackKeyPair(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ivs:PlaybackKeyPair", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static PlaybackKeyPair get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PlaybackKeyPair(name, id, options);
    }
}
