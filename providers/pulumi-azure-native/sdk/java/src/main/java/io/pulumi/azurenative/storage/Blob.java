// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storage.BlobArgs;
import io.pulumi.azurenative.storage.enums.BlobAccessTier;
import io.pulumi.azurenative.storage.enums.BlobType;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:storage:Blob")
public class Blob extends io.pulumi.resources.CustomResource {
    @OutputExport(name="accessTier", type=BlobAccessTier.class, parameters={})
    private Output<BlobAccessTier> accessTier;

    public Output<BlobAccessTier> getAccessTier() {
        return this.accessTier;
    }
    @OutputExport(name="contentMd5", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentMd5;

    public Output</* @Nullable */ String> getContentMd5() {
        return this.contentMd5;
    }
    @OutputExport(name="contentType", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentType;

    public Output</* @Nullable */ String> getContentType() {
        return this.contentType;
    }
    @OutputExport(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> metadata;

    public Output<Map<String,String>> getMetadata() {
        return this.metadata;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="type", type=BlobType.class, parameters={})
    private Output<BlobType> type;

    public Output<BlobType> getType() {
        return this.type;
    }
    @OutputExport(name="url", type=String.class, parameters={})
    private Output<String> url;

    public Output<String> getUrl() {
        return this.url;
    }

    public Blob(String name, BlobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:Blob", name, args == null ? BlobArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Blob(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:Blob", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Blob get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Blob(name, id, options);
    }
}
