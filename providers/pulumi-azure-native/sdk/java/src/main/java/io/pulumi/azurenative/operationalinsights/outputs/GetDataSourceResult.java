// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDataSourceResult {
    private final @Nullable String etag;
    private final String id;
    private final String kind;
    private final String name;
    private final Object properties;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"etag","id","kind","name","properties","tags","type"})
    private GetDataSourceResult(
        @Nullable String etag,
        String id,
        String kind,
        String name,
        Object properties,
        @Nullable Map<String,String> tags,
        String type) {
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    public String getId() {
        return this.id;
    }
    public String getKind() {
        return this.kind;
    }
    public String getName() {
        return this.name;
    }
    public Object getProperties() {
        return this.properties;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataSourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private String id;
        private String kind;
        private String name;
        private Object properties;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataSourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
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

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetDataSourceResult build() {
            return new GetDataSourceResult(etag, id, kind, name, properties, tags, type);
        }
    }
}
