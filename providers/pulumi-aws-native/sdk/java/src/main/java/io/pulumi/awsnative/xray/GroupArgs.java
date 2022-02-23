// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.xray;

import io.pulumi.awsnative.xray.inputs.GroupInsightsConfigurationArgs;
import io.pulumi.awsnative.xray.inputs.TagsItemPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupArgs Empty = new GroupArgs();

    /**
     * The filter expression defining criteria by which to group traces.
     * 
     */
    @InputImport(name="filterExpression")
      private final @Nullable Input<String> filterExpression;

    public Input<String> getFilterExpression() {
        return this.filterExpression == null ? Input.empty() : this.filterExpression;
    }

    /**
     * The case-sensitive name of the new group. Names must be unique.
     * 
     */
    @InputImport(name="groupName")
      private final @Nullable Input<String> groupName;

    public Input<String> getGroupName() {
        return this.groupName == null ? Input.empty() : this.groupName;
    }

    @InputImport(name="insightsConfiguration")
      private final @Nullable Input<GroupInsightsConfigurationArgs> insightsConfiguration;

    public Input<GroupInsightsConfigurationArgs> getInsightsConfiguration() {
        return this.insightsConfiguration == null ? Input.empty() : this.insightsConfiguration;
    }

    @InputImport(name="tags")
      private final @Nullable Input<List<TagsItemPropertiesArgs>> tags;

    public Input<List<TagsItemPropertiesArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public GroupArgs(
        @Nullable Input<String> filterExpression,
        @Nullable Input<String> groupName,
        @Nullable Input<GroupInsightsConfigurationArgs> insightsConfiguration,
        @Nullable Input<List<TagsItemPropertiesArgs>> tags) {
        this.filterExpression = filterExpression;
        this.groupName = groupName;
        this.insightsConfiguration = insightsConfiguration;
        this.tags = tags;
    }

    private GroupArgs() {
        this.filterExpression = Input.empty();
        this.groupName = Input.empty();
        this.insightsConfiguration = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> filterExpression;
        private @Nullable Input<String> groupName;
        private @Nullable Input<GroupInsightsConfigurationArgs> insightsConfiguration;
        private @Nullable Input<List<TagsItemPropertiesArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterExpression = defaults.filterExpression;
    	      this.groupName = defaults.groupName;
    	      this.insightsConfiguration = defaults.insightsConfiguration;
    	      this.tags = defaults.tags;
        }

        public Builder setFilterExpression(@Nullable Input<String> filterExpression) {
            this.filterExpression = filterExpression;
            return this;
        }

        public Builder setFilterExpression(@Nullable String filterExpression) {
            this.filterExpression = Input.ofNullable(filterExpression);
            return this;
        }

        public Builder setGroupName(@Nullable Input<String> groupName) {
            this.groupName = groupName;
            return this;
        }

        public Builder setGroupName(@Nullable String groupName) {
            this.groupName = Input.ofNullable(groupName);
            return this;
        }

        public Builder setInsightsConfiguration(@Nullable Input<GroupInsightsConfigurationArgs> insightsConfiguration) {
            this.insightsConfiguration = insightsConfiguration;
            return this;
        }

        public Builder setInsightsConfiguration(@Nullable GroupInsightsConfigurationArgs insightsConfiguration) {
            this.insightsConfiguration = Input.ofNullable(insightsConfiguration);
            return this;
        }

        public Builder setTags(@Nullable Input<List<TagsItemPropertiesArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<TagsItemPropertiesArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public GroupArgs build() {
            return new GroupArgs(filterExpression, groupName, insightsConfiguration, tags);
        }
    }
}
