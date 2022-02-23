// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudidentity.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudidentity.inputs.GetGroupsGroupGroupKey;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class GetGroupsGroup extends io.pulumi.resources.InvokeArgs {

    public static final GetGroupsGroup Empty = new GetGroupsGroup();

    @InputImport(name="createTime", required=true)
      private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    @InputImport(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    @InputImport(name="displayName", required=true)
      private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    @InputImport(name="groupKeys", required=true)
      private final List<GetGroupsGroupGroupKey> groupKeys;

    public List<GetGroupsGroupGroupKey> getGroupKeys() {
        return this.groupKeys;
    }

    @InputImport(name="initialGroupConfig", required=true)
      private final String initialGroupConfig;

    public String getInitialGroupConfig() {
        return this.initialGroupConfig;
    }

    @InputImport(name="labels", required=true)
      private final Map<String,String> labels;

    public Map<String,String> getLabels() {
        return this.labels;
    }

    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The parent resource under which to list all Groups. Must be of the form identitysources/{identity_source_id} for external- identity-mapped groups or customers/{customer_id} for Google Groups.
     * 
     */
    @InputImport(name="parent", required=true)
      private final String parent;

    public String getParent() {
        return this.parent;
    }

    @InputImport(name="updateTime", required=true)
      private final String updateTime;

    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetGroupsGroup(
        String createTime,
        String description,
        String displayName,
        List<GetGroupsGroupGroupKey> groupKeys,
        String initialGroupConfig,
        Map<String,String> labels,
        String name,
        String parent,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.groupKeys = Objects.requireNonNull(groupKeys, "expected parameter 'groupKeys' to be non-null");
        this.initialGroupConfig = Objects.requireNonNull(initialGroupConfig, "expected parameter 'initialGroupConfig' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
        this.updateTime = Objects.requireNonNull(updateTime, "expected parameter 'updateTime' to be non-null");
    }

    private GetGroupsGroup() {
        this.createTime = null;
        this.description = null;
        this.displayName = null;
        this.groupKeys = List.of();
        this.initialGroupConfig = null;
        this.labels = Map.of();
        this.name = null;
        this.parent = null;
        this.updateTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupsGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String displayName;
        private List<GetGroupsGroupGroupKey> groupKeys;
        private String initialGroupConfig;
        private Map<String,String> labels;
        private String name;
        private String parent;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.groupKeys = defaults.groupKeys;
    	      this.initialGroupConfig = defaults.initialGroupConfig;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setGroupKeys(List<GetGroupsGroupGroupKey> groupKeys) {
            this.groupKeys = Objects.requireNonNull(groupKeys);
            return this;
        }

        public Builder setInitialGroupConfig(String initialGroupConfig) {
            this.initialGroupConfig = Objects.requireNonNull(initialGroupConfig);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetGroupsGroup build() {
            return new GetGroupsGroup(createTime, description, displayName, groupKeys, initialGroupConfig, labels, name, parent, updateTime);
        }
    }
}
