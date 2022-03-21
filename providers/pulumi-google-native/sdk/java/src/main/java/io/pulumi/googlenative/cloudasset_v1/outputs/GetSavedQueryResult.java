// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudasset_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.cloudasset_v1.outputs.QueryContentResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSavedQueryResult {
    /**
     * The query content.
     * 
     */
    private final QueryContentResponse content;
    /**
     * The create time of this saved query.
     * 
     */
    private final String createTime;
    /**
     * The account's email address who has created this saved query.
     * 
     */
    private final String creator;
    /**
     * The description of this saved query. This value should be fewer than 255 characters.
     * 
     */
    private final String description;
    /**
     * Labels applied on the resource. This value should not contain more than 10 entries. The key and value of each entry must be non-empty and fewer than 64 characters.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The last update time of this saved query.
     * 
     */
    private final String lastUpdateTime;
    /**
     * The account's email address who has updated this saved query most recently.
     * 
     */
    private final String lastUpdater;
    /**
     * The resource name of the saved query. The format must be: * projects/project_number/savedQueries/saved_query_id * folders/folder_number/savedQueries/saved_query_id * organizations/organization_number/savedQueries/saved_query_id
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetSavedQueryResult(
        @CustomType.Parameter("content") QueryContentResponse content,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("creator") String creator,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("lastUpdateTime") String lastUpdateTime,
        @CustomType.Parameter("lastUpdater") String lastUpdater,
        @CustomType.Parameter("name") String name) {
        this.content = content;
        this.createTime = createTime;
        this.creator = creator;
        this.description = description;
        this.labels = labels;
        this.lastUpdateTime = lastUpdateTime;
        this.lastUpdater = lastUpdater;
        this.name = name;
    }

    /**
     * The query content.
     * 
    */
    public QueryContentResponse getContent() {
        return this.content;
    }
    /**
     * The create time of this saved query.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The account's email address who has created this saved query.
     * 
    */
    public String getCreator() {
        return this.creator;
    }
    /**
     * The description of this saved query. This value should be fewer than 255 characters.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Labels applied on the resource. This value should not contain more than 10 entries. The key and value of each entry must be non-empty and fewer than 64 characters.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The last update time of this saved query.
     * 
    */
    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }
    /**
     * The account's email address who has updated this saved query most recently.
     * 
    */
    public String getLastUpdater() {
        return this.lastUpdater;
    }
    /**
     * The resource name of the saved query. The format must be: * projects/project_number/savedQueries/saved_query_id * folders/folder_number/savedQueries/saved_query_id * organizations/organization_number/savedQueries/saved_query_id
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSavedQueryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueryContentResponse content;
        private String createTime;
        private String creator;
        private String description;
        private Map<String,String> labels;
        private String lastUpdateTime;
        private String lastUpdater;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSavedQueryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.createTime = defaults.createTime;
    	      this.creator = defaults.creator;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.lastUpdateTime = defaults.lastUpdateTime;
    	      this.lastUpdater = defaults.lastUpdater;
    	      this.name = defaults.name;
        }

        public Builder content(QueryContentResponse content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder creator(String creator) {
            this.creator = Objects.requireNonNull(creator);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder lastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = Objects.requireNonNull(lastUpdateTime);
            return this;
        }
        public Builder lastUpdater(String lastUpdater) {
            this.lastUpdater = Objects.requireNonNull(lastUpdater);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetSavedQueryResult build() {
            return new GetSavedQueryResult(content, createTime, creator, description, labels, lastUpdateTime, lastUpdater, name);
        }
    }
}
