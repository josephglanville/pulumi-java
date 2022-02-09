// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.azurenative.providerhub.outputs.DefaultRolloutResponseProperties;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetDefaultRolloutResult {
    private final String id;
    private final String name;
    private final DefaultRolloutResponseProperties properties;
    private final String type;

    @OutputCustomType.Constructor({"id","name","properties","type"})
    private GetDefaultRolloutResult(
        String id,
        String name,
        DefaultRolloutResponseProperties properties,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.type = Objects.requireNonNull(type);
    }

    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public DefaultRolloutResponseProperties getProperties() {
        return this.properties;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDefaultRolloutResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private DefaultRolloutResponseProperties properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDefaultRolloutResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(DefaultRolloutResponseProperties properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetDefaultRolloutResult build() {
            return new GetDefaultRolloutResult(id, name, properties, type);
        }
    }
}
