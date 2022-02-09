// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.azurenative.operationalinsights.inputs.TagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SavedSearchArgs extends io.pulumi.resources.ResourceArgs {

    public static final SavedSearchArgs Empty = new SavedSearchArgs();

    @InputImport(name="category", required=true)
    private final Input<String> category;

    public Input<String> getCategory() {
        return this.category;
    }

    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    @InputImport(name="functionAlias")
    private final @Nullable Input<String> functionAlias;

    public Input<String> getFunctionAlias() {
        return this.functionAlias == null ? Input.empty() : this.functionAlias;
    }

    @InputImport(name="functionParameters")
    private final @Nullable Input<String> functionParameters;

    public Input<String> getFunctionParameters() {
        return this.functionParameters == null ? Input.empty() : this.functionParameters;
    }

    @InputImport(name="query", required=true)
    private final Input<String> query;

    public Input<String> getQuery() {
        return this.query;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="savedSearchId")
    private final @Nullable Input<String> savedSearchId;

    public Input<String> getSavedSearchId() {
        return this.savedSearchId == null ? Input.empty() : this.savedSearchId;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<TagArgs>> tags;

    public Input<List<TagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="version")
    private final @Nullable Input<Double> version;

    public Input<Double> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    @InputImport(name="workspaceName", required=true)
    private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public SavedSearchArgs(
        Input<String> category,
        Input<String> displayName,
        @Nullable Input<String> functionAlias,
        @Nullable Input<String> functionParameters,
        Input<String> query,
        Input<String> resourceGroupName,
        @Nullable Input<String> savedSearchId,
        @Nullable Input<List<TagArgs>> tags,
        @Nullable Input<Double> version,
        Input<String> workspaceName) {
        this.category = Objects.requireNonNull(category, "expected parameter 'category' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.functionAlias = functionAlias;
        this.functionParameters = functionParameters;
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.savedSearchId = savedSearchId;
        this.tags = tags;
        this.version = version;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private SavedSearchArgs() {
        this.category = Input.empty();
        this.displayName = Input.empty();
        this.functionAlias = Input.empty();
        this.functionParameters = Input.empty();
        this.query = Input.empty();
        this.resourceGroupName = Input.empty();
        this.savedSearchId = Input.empty();
        this.tags = Input.empty();
        this.version = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SavedSearchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> category;
        private Input<String> displayName;
        private @Nullable Input<String> functionAlias;
        private @Nullable Input<String> functionParameters;
        private Input<String> query;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> savedSearchId;
        private @Nullable Input<List<TagArgs>> tags;
        private @Nullable Input<Double> version;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(SavedSearchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.displayName = defaults.displayName;
    	      this.functionAlias = defaults.functionAlias;
    	      this.functionParameters = defaults.functionParameters;
    	      this.query = defaults.query;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.savedSearchId = defaults.savedSearchId;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setCategory(Input<String> category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }

        public Builder setCategory(String category) {
            this.category = Input.of(Objects.requireNonNull(category));
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setFunctionAlias(@Nullable Input<String> functionAlias) {
            this.functionAlias = functionAlias;
            return this;
        }

        public Builder setFunctionAlias(@Nullable String functionAlias) {
            this.functionAlias = Input.ofNullable(functionAlias);
            return this;
        }

        public Builder setFunctionParameters(@Nullable Input<String> functionParameters) {
            this.functionParameters = functionParameters;
            return this;
        }

        public Builder setFunctionParameters(@Nullable String functionParameters) {
            this.functionParameters = Input.ofNullable(functionParameters);
            return this;
        }

        public Builder setQuery(Input<String> query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder setQuery(String query) {
            this.query = Input.of(Objects.requireNonNull(query));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSavedSearchId(@Nullable Input<String> savedSearchId) {
            this.savedSearchId = savedSearchId;
            return this;
        }

        public Builder setSavedSearchId(@Nullable String savedSearchId) {
            this.savedSearchId = Input.ofNullable(savedSearchId);
            return this;
        }

        public Builder setTags(@Nullable Input<List<TagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<TagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVersion(@Nullable Input<Double> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable Double version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }

        public SavedSearchArgs build() {
            return new SavedSearchArgs(category, displayName, functionAlias, functionParameters, query, resourceGroupName, savedSearchId, tags, version, workspaceName);
        }
    }
}
