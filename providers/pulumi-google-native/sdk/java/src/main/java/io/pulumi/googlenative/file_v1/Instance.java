// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.file_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.file_v1.InstanceArgs;
import io.pulumi.googlenative.file_v1.outputs.FileShareConfigResponse;
import io.pulumi.googlenative.file_v1.outputs.NetworkConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates an instance. When creating from a backup, the capacity of the new instance needs to be equal to or larger than the capacity of the backup (and also equal to or larger than the minimum capacity of the tier).
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:file/v1:Instance")
public class Instance extends io.pulumi.resources.CustomResource {
    /**
     * The time when the instance was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the instance was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The description of the instance (2048 characters or less).
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the instance (2048 characters or less).
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Server-specified ETag for the instance resource to prevent simultaneous updates from overwriting each other.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Server-specified ETag for the instance resource to prevent simultaneous updates from overwriting each other.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * File system shares on the instance. For this version, only a single file share is supported.
     * 
     */
    @Export(name="fileShares", type=List.class, parameters={FileShareConfigResponse.class})
    private Output<List<FileShareConfigResponse>> fileShares;

    /**
     * @return File system shares on the instance. For this version, only a single file share is supported.
     * 
     */
    public Output<List<FileShareConfigResponse>> getFileShares() {
        return this.fileShares;
    }
    /**
     * KMS key name used for data encryption.
     * 
     */
    @Export(name="kmsKeyName", type=String.class, parameters={})
    private Output<String> kmsKeyName;

    /**
     * @return KMS key name used for data encryption.
     * 
     */
    public Output<String> getKmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * Resource labels to represent user provided metadata.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Resource labels to represent user provided metadata.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The resource name of the instance, in the format `projects/{project}/locations/{location}/instances/{instance}`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the instance, in the format `projects/{project}/locations/{location}/instances/{instance}`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * VPC networks to which the instance is connected. For this version, only a single network is supported.
     * 
     */
    @Export(name="networks", type=List.class, parameters={NetworkConfigResponse.class})
    private Output<List<NetworkConfigResponse>> networks;

    /**
     * @return VPC networks to which the instance is connected. For this version, only a single network is supported.
     * 
     */
    public Output<List<NetworkConfigResponse>> getNetworks() {
        return this.networks;
    }
    /**
     * Reserved for future use.
     * 
     */
    @Export(name="satisfiesPzs", type=Boolean.class, parameters={})
    private Output<Boolean> satisfiesPzs;

    /**
     * @return Reserved for future use.
     * 
     */
    public Output<Boolean> getSatisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * The instance state.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The instance state.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Additional information about the instance state, if available.
     * 
     */
    @Export(name="statusMessage", type=String.class, parameters={})
    private Output<String> statusMessage;

    /**
     * @return Additional information about the instance state, if available.
     * 
     */
    public Output<String> getStatusMessage() {
        return this.statusMessage;
    }
    /**
     * field indicates all the reasons the instance is in "SUSPENDED" state.
     * 
     */
    @Export(name="suspensionReasons", type=List.class, parameters={String.class})
    private Output<List<String>> suspensionReasons;

    /**
     * @return field indicates all the reasons the instance is in "SUSPENDED" state.
     * 
     */
    public Output<List<String>> getSuspensionReasons() {
        return this.suspensionReasons;
    }
    /**
     * The service tier of the instance.
     * 
     */
    @Export(name="tier", type=String.class, parameters={})
    private Output<String> tier;

    /**
     * @return The service tier of the instance.
     * 
     */
    public Output<String> getTier() {
        return this.tier;
    }

    public interface BuilderApplicator {
        public void apply(InstanceArgs.Builder a);
    }
    private static io.pulumi.googlenative.file_v1.InstanceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.file_v1.InstanceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Instance(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:file/v1:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:file/v1:Instance", name, null, makeResourceOptions(options, id));
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
    public static Instance get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, options);
    }
}
