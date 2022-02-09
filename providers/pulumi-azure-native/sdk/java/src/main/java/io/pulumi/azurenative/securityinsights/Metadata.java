// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.MetadataArgs;
import io.pulumi.azurenative.securityinsights.outputs.MetadataAuthorResponse;
import io.pulumi.azurenative.securityinsights.outputs.MetadataCategoriesResponse;
import io.pulumi.azurenative.securityinsights.outputs.MetadataDependenciesResponse;
import io.pulumi.azurenative.securityinsights.outputs.MetadataSourceResponse;
import io.pulumi.azurenative.securityinsights.outputs.MetadataSupportResponse;
import io.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:securityinsights:Metadata")
public class Metadata extends io.pulumi.resources.CustomResource {
    @OutputExport(name="author", type=MetadataAuthorResponse.class, parameters={})
    private Output</* @Nullable */ MetadataAuthorResponse> author;

    public Output</* @Nullable */ MetadataAuthorResponse> getAuthor() {
        return this.author;
    }
    @OutputExport(name="categories", type=MetadataCategoriesResponse.class, parameters={})
    private Output</* @Nullable */ MetadataCategoriesResponse> categories;

    public Output</* @Nullable */ MetadataCategoriesResponse> getCategories() {
        return this.categories;
    }
    @OutputExport(name="contentId", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentId;

    public Output</* @Nullable */ String> getContentId() {
        return this.contentId;
    }
    @OutputExport(name="dependencies", type=MetadataDependenciesResponse.class, parameters={})
    private Output</* @Nullable */ MetadataDependenciesResponse> dependencies;

    public Output</* @Nullable */ MetadataDependenciesResponse> getDependencies() {
        return this.dependencies;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="firstPublishDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> firstPublishDate;

    public Output</* @Nullable */ String> getFirstPublishDate() {
        return this.firstPublishDate;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    @OutputExport(name="lastPublishDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastPublishDate;

    public Output</* @Nullable */ String> getLastPublishDate() {
        return this.lastPublishDate;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="parentId", type=String.class, parameters={})
    private Output<String> parentId;

    public Output<String> getParentId() {
        return this.parentId;
    }
    @OutputExport(name="providers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> providers;

    public Output</* @Nullable */ List<String>> getProviders() {
        return this.providers;
    }
    @OutputExport(name="source", type=MetadataSourceResponse.class, parameters={})
    private Output</* @Nullable */ MetadataSourceResponse> source;

    public Output</* @Nullable */ MetadataSourceResponse> getSource() {
        return this.source;
    }
    @OutputExport(name="support", type=MetadataSupportResponse.class, parameters={})
    private Output</* @Nullable */ MetadataSupportResponse> support;

    public Output</* @Nullable */ MetadataSupportResponse> getSupport() {
        return this.support;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    public Output</* @Nullable */ String> getVersion() {
        return this.version;
    }

    public Metadata(String name, MetadataArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:Metadata", name, args == null ? MetadataArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Metadata(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:Metadata", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20210301preview:Metadata").build()),
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20210901preview:Metadata").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Metadata get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Metadata(name, id, options);
    }
}
