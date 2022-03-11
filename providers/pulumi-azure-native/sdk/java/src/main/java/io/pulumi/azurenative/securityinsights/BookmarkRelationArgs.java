// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BookmarkRelationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BookmarkRelationArgs Empty = new BookmarkRelationArgs();

    /**
     * Bookmark ID
     * 
     */
    @InputImport(name="bookmarkId", required=true)
      private final Output<String> bookmarkId;

    public Output<String> getBookmarkId() {
        return this.bookmarkId;
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @InputImport(name="operationalInsightsResourceProvider", required=true)
      private final Output<String> operationalInsightsResourceProvider;

    public Output<String> getOperationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The resource ID of the related resource
     * 
     */
    @InputImport(name="relatedResourceId", required=true)
      private final Output<String> relatedResourceId;

    public Output<String> getRelatedResourceId() {
        return this.relatedResourceId;
    }

    /**
     * Relation Name
     * 
     */
    @InputImport(name="relationName")
      private final @Nullable Output<String> relationName;

    public Output<String> getRelationName() {
        return this.relationName == null ? Output.empty() : this.relationName;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public BookmarkRelationArgs(
        Output<String> bookmarkId,
        Output<String> operationalInsightsResourceProvider,
        Output<String> relatedResourceId,
        @Nullable Output<String> relationName,
        Output<String> resourceGroupName,
        Output<String> workspaceName) {
        this.bookmarkId = Objects.requireNonNull(bookmarkId, "expected parameter 'bookmarkId' to be non-null");
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.relatedResourceId = Objects.requireNonNull(relatedResourceId, "expected parameter 'relatedResourceId' to be non-null");
        this.relationName = relationName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private BookmarkRelationArgs() {
        this.bookmarkId = Output.empty();
        this.operationalInsightsResourceProvider = Output.empty();
        this.relatedResourceId = Output.empty();
        this.relationName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.workspaceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BookmarkRelationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bookmarkId;
        private Output<String> operationalInsightsResourceProvider;
        private Output<String> relatedResourceId;
        private @Nullable Output<String> relationName;
        private Output<String> resourceGroupName;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(BookmarkRelationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bookmarkId = defaults.bookmarkId;
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.relatedResourceId = defaults.relatedResourceId;
    	      this.relationName = defaults.relationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder bookmarkId(Output<String> bookmarkId) {
            this.bookmarkId = Objects.requireNonNull(bookmarkId);
            return this;
        }

        public Builder bookmarkId(String bookmarkId) {
            this.bookmarkId = Output.of(Objects.requireNonNull(bookmarkId));
            return this;
        }

        public Builder operationalInsightsResourceProvider(Output<String> operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider);
            return this;
        }

        public Builder operationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Output.of(Objects.requireNonNull(operationalInsightsResourceProvider));
            return this;
        }

        public Builder relatedResourceId(Output<String> relatedResourceId) {
            this.relatedResourceId = Objects.requireNonNull(relatedResourceId);
            return this;
        }

        public Builder relatedResourceId(String relatedResourceId) {
            this.relatedResourceId = Output.of(Objects.requireNonNull(relatedResourceId));
            return this;
        }

        public Builder relationName(@Nullable Output<String> relationName) {
            this.relationName = relationName;
            return this;
        }

        public Builder relationName(@Nullable String relationName) {
            this.relationName = Output.ofNullable(relationName);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }
        public BookmarkRelationArgs build() {
            return new BookmarkRelationArgs(bookmarkId, operationalInsightsResourceProvider, relatedResourceId, relationName, resourceGroupName, workspaceName);
        }
    }
}
