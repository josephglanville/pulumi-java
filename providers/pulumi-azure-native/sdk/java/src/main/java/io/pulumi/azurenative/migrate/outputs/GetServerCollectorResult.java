// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.azurenative.migrate.outputs.CollectorPropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetServerCollectorResult {
    private final @Nullable String eTag;
    private final String id;
    private final String name;
    private final CollectorPropertiesResponse properties;
    private final String type;

    @OutputCustomType.Constructor({"eTag","id","name","properties","type"})
    private GetServerCollectorResult(
        @Nullable String eTag,
        String id,
        String name,
        CollectorPropertiesResponse properties,
        String type) {
        this.eTag = eTag;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getETag() {
        return Optional.ofNullable(this.eTag);
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public CollectorPropertiesResponse getProperties() {
        return this.properties;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerCollectorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eTag;
        private String id;
        private String name;
        private CollectorPropertiesResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerCollectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setETag(@Nullable String eTag) {
            this.eTag = eTag;
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

        public Builder setProperties(CollectorPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetServerCollectorResult build() {
            return new GetServerCollectorResult(eTag, id, name, properties, type);
        }
    }
}
