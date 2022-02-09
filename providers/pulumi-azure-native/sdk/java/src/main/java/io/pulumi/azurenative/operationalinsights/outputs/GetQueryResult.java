// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.azurenative.operationalinsights.outputs.LogAnalyticsQueryPackQueryPropertiesResponseRelated;
import io.pulumi.azurenative.operationalinsights.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetQueryResult {
    private final String author;
    private final String body;
    private final @Nullable String description;
    private final String displayName;
    private final String id;
    private final String name;
    private final Object properties;
    private final @Nullable LogAnalyticsQueryPackQueryPropertiesResponseRelated related;
    private final SystemDataResponse systemData;
    private final @Nullable Map<String,List<String>> tags;
    private final String timeCreated;
    private final String timeModified;
    private final String type;

    @OutputCustomType.Constructor({"author","body","description","displayName","id","name","properties","related","systemData","tags","timeCreated","timeModified","type"})
    private GetQueryResult(
        String author,
        String body,
        @Nullable String description,
        String displayName,
        String id,
        String name,
        Object properties,
        @Nullable LogAnalyticsQueryPackQueryPropertiesResponseRelated related,
        SystemDataResponse systemData,
        @Nullable Map<String,List<String>> tags,
        String timeCreated,
        String timeModified,
        String type) {
        this.author = Objects.requireNonNull(author);
        this.body = Objects.requireNonNull(body);
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.related = related;
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.timeCreated = Objects.requireNonNull(timeCreated);
        this.timeModified = Objects.requireNonNull(timeModified);
        this.type = Objects.requireNonNull(type);
    }

    public String getAuthor() {
        return this.author;
    }
    public String getBody() {
        return this.body;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public String getDisplayName() {
        return this.displayName;
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public Object getProperties() {
        return this.properties;
    }
    public Optional<LogAnalyticsQueryPackQueryPropertiesResponseRelated> getRelated() {
        return Optional.ofNullable(this.related);
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public Map<String,List<String>> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getTimeCreated() {
        return this.timeCreated;
    }
    public String getTimeModified() {
        return this.timeModified;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String author;
        private String body;
        private @Nullable String description;
        private String displayName;
        private String id;
        private String name;
        private Object properties;
        private @Nullable LogAnalyticsQueryPackQueryPropertiesResponseRelated related;
        private SystemDataResponse systemData;
        private @Nullable Map<String,List<String>> tags;
        private String timeCreated;
        private String timeModified;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQueryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.author = defaults.author;
    	      this.body = defaults.body;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.related = defaults.related;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeModified = defaults.timeModified;
    	      this.type = defaults.type;
        }

        public Builder setAuthor(String author) {
            this.author = Objects.requireNonNull(author);
            return this;
        }

        public Builder setBody(String body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(Object properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setRelated(@Nullable LogAnalyticsQueryPackQueryPropertiesResponseRelated related) {
            this.related = related;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,List<String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTimeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }

        public Builder setTimeModified(String timeModified) {
            this.timeModified = Objects.requireNonNull(timeModified);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetQueryResult build() {
            return new GetQueryResult(author, body, description, displayName, id, name, properties, related, systemData, tags, timeCreated, timeModified, type);
        }
    }
}
