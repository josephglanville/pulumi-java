// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.BookmarkArgs;
import io.pulumi.azurenative.securityinsights.outputs.IncidentInfoResponse;
import io.pulumi.azurenative.securityinsights.outputs.UserInfoResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a bookmark in Azure Security Insights.
 * API Version: 2020-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:securityinsights:Bookmark 73e01a99-5cd7-4139-a149-9f2736ff2ab5 /subscriptions/d0cfe6b2-9ac0-4464-9919-dccaee2e48c0/resourceGroups/myRg/providers/Microsoft.OperationalInsights/workspaces/myWorkspace/providers/Microsoft.SecurityInsights/bookmarks/73e01a99-5cd7-4139-a149-9f2736ff2ab5 
 * ```
 * 
 */
@ResourceType(type="azure-native:securityinsights:Bookmark")
public class Bookmark extends io.pulumi.resources.CustomResource {
    /**
     * The time the bookmark was created
     * 
     */
    @Export(name="created", type=String.class, parameters={})
    private Output</* @Nullable */ String> created;

    /**
     * @return The time the bookmark was created
     * 
     */
    public Output</* @Nullable */ String> getCreated() {
        return this.created;
    }
    /**
     * Describes a user that created the bookmark
     * 
     */
    @Export(name="createdBy", type=UserInfoResponse.class, parameters={})
    private Output</* @Nullable */ UserInfoResponse> createdBy;

    /**
     * @return Describes a user that created the bookmark
     * 
     */
    public Output</* @Nullable */ UserInfoResponse> getCreatedBy() {
        return this.createdBy;
    }
    /**
     * The display name of the bookmark
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name of the bookmark
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Etag of the azure resource
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Etag of the azure resource
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * The bookmark event time
     * 
     */
    @Export(name="eventTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventTime;

    /**
     * @return The bookmark event time
     * 
     */
    public Output</* @Nullable */ String> getEventTime() {
        return this.eventTime;
    }
    /**
     * Describes an incident that relates to bookmark
     * 
     */
    @Export(name="incidentInfo", type=IncidentInfoResponse.class, parameters={})
    private Output</* @Nullable */ IncidentInfoResponse> incidentInfo;

    /**
     * @return Describes an incident that relates to bookmark
     * 
     */
    public Output</* @Nullable */ IncidentInfoResponse> getIncidentInfo() {
        return this.incidentInfo;
    }
    /**
     * List of labels relevant to this bookmark
     * 
     */
    @Export(name="labels", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> labels;

    /**
     * @return List of labels relevant to this bookmark
     * 
     */
    public Output</* @Nullable */ List<String>> getLabels() {
        return this.labels;
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The notes of the bookmark
     * 
     */
    @Export(name="notes", type=String.class, parameters={})
    private Output</* @Nullable */ String> notes;

    /**
     * @return The notes of the bookmark
     * 
     */
    public Output</* @Nullable */ String> getNotes() {
        return this.notes;
    }
    /**
     * The query of the bookmark.
     * 
     */
    @Export(name="query", type=String.class, parameters={})
    private Output<String> query;

    /**
     * @return The query of the bookmark.
     * 
     */
    public Output<String> getQuery() {
        return this.query;
    }
    /**
     * The end time for the query
     * 
     */
    @Export(name="queryEndTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> queryEndTime;

    /**
     * @return The end time for the query
     * 
     */
    public Output</* @Nullable */ String> getQueryEndTime() {
        return this.queryEndTime;
    }
    /**
     * The query result of the bookmark.
     * 
     */
    @Export(name="queryResult", type=String.class, parameters={})
    private Output</* @Nullable */ String> queryResult;

    /**
     * @return The query result of the bookmark.
     * 
     */
    public Output</* @Nullable */ String> getQueryResult() {
        return this.queryResult;
    }
    /**
     * The start time for the query
     * 
     */
    @Export(name="queryStartTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> queryStartTime;

    /**
     * @return The start time for the query
     * 
     */
    public Output</* @Nullable */ String> getQueryStartTime() {
        return this.queryStartTime;
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The last time the bookmark was updated
     * 
     */
    @Export(name="updated", type=String.class, parameters={})
    private Output</* @Nullable */ String> updated;

    /**
     * @return The last time the bookmark was updated
     * 
     */
    public Output</* @Nullable */ String> getUpdated() {
        return this.updated;
    }
    /**
     * Describes a user that updated the bookmark
     * 
     */
    @Export(name="updatedBy", type=UserInfoResponse.class, parameters={})
    private Output</* @Nullable */ UserInfoResponse> updatedBy;

    /**
     * @return Describes a user that updated the bookmark
     * 
     */
    public Output</* @Nullable */ UserInfoResponse> getUpdatedBy() {
        return this.updatedBy;
    }

    public interface BuilderApplicator {
        public void apply(BookmarkArgs.Builder a);
    }
    private static io.pulumi.azurenative.securityinsights.BookmarkArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.securityinsights.BookmarkArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Bookmark(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Bookmark(String name) {
        this(name, BookmarkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Bookmark(String name, BookmarkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Bookmark(String name, BookmarkArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:Bookmark", name, args == null ? BookmarkArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Bookmark(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:Bookmark", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:securityinsights/v20190101preview:Bookmark").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20200101:Bookmark").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210901preview:Bookmark").build())
            ))
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
    public static Bookmark get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Bookmark(name, id, options);
    }
}
