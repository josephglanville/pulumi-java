// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.logging.FolderBucketConfigArgs;
import io.pulumi.gcp.logging.inputs.FolderBucketConfigState;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:logging/folderBucketConfig:FolderBucketConfig")
public class FolderBucketConfig extends io.pulumi.resources.CustomResource {
    @OutputExport(name="bucketId", type=String.class, parameters={})
    private Output<String> bucketId;

    public Output<String> getBucketId() {
        return this.bucketId;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    public Output<String> getDescription() {
        return this.description;
    }
    @OutputExport(name="folder", type=String.class, parameters={})
    private Output<String> folder;

    public Output<String> getFolder() {
        return this.folder;
    }
    @OutputExport(name="lifecycleState", type=String.class, parameters={})
    private Output<String> lifecycleState;

    public Output<String> getLifecycleState() {
        return this.lifecycleState;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="retentionDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> retentionDays;

    public Output</* @Nullable */ Integer> getRetentionDays() {
        return this.retentionDays;
    }

    public FolderBucketConfig(String name, FolderBucketConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:logging/folderBucketConfig:FolderBucketConfig", name, args == null ? FolderBucketConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FolderBucketConfig(String name, Input<String> id, @Nullable FolderBucketConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:logging/folderBucketConfig:FolderBucketConfig", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static FolderBucketConfig get(String name, Input<String> id, @Nullable FolderBucketConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FolderBucketConfig(name, id, state, options);
    }
}