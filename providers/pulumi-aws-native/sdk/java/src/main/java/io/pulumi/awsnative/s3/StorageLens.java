// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.s3.StorageLensArgs;
import io.pulumi.awsnative.s3.outputs.StorageLensConfiguration;
import io.pulumi.awsnative.s3.outputs.StorageLensTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::S3::StorageLens resource is an Amazon S3 resource type that you can use to create Storage Lens configurations.
 * 
 */
@ResourceType(type="aws-native:s3:StorageLens")
public class StorageLens extends io.pulumi.resources.CustomResource {
    @OutputExport(name="storageLensConfiguration", type=StorageLensConfiguration.class, parameters={})
    private Output<StorageLensConfiguration> storageLensConfiguration;

    public Output<StorageLensConfiguration> getStorageLensConfiguration() {
        return this.storageLensConfiguration;
    }
    /**
     * A set of tags (key-value pairs) for this Amazon S3 Storage Lens configuration.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={StorageLensTag.class})
    private Output</* @Nullable */ List<StorageLensTag>> tags;

    /**
     * @return A set of tags (key-value pairs) for this Amazon S3 Storage Lens configuration.
     * 
     */
    public Output</* @Nullable */ List<StorageLensTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StorageLens(String name) {
        this(name, StorageLensArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StorageLens(String name, StorageLensArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StorageLens(String name, StorageLensArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:s3:StorageLens", name, args == null ? StorageLensArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private StorageLens(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:s3:StorageLens", name, null, makeResourceOptions(options, id));
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
    public static StorageLens get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StorageLens(name, id, options);
    }
}
