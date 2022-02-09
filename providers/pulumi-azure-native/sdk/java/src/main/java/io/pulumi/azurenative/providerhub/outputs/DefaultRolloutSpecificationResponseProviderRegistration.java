// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.azurenative.providerhub.outputs.ProviderRegistrationResponseProperties;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DefaultRolloutSpecificationResponseProviderRegistration {
    private final String id;
    private final String name;
    private final @Nullable ProviderRegistrationResponseProperties properties;
    private final String type;

    @OutputCustomType.Constructor({"id","name","properties","type"})
    private DefaultRolloutSpecificationResponseProviderRegistration(
        String id,
        String name,
        @Nullable ProviderRegistrationResponseProperties properties,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.properties = properties;
        this.type = Objects.requireNonNull(type);
    }

    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public Optional<ProviderRegistrationResponseProperties> getProperties() {
        return Optional.ofNullable(this.properties);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultRolloutSpecificationResponseProviderRegistration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable ProviderRegistrationResponseProperties properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultRolloutSpecificationResponseProviderRegistration defaults) {
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

        public Builder setProperties(@Nullable ProviderRegistrationResponseProperties properties) {
            this.properties = properties;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public DefaultRolloutSpecificationResponseProviderRegistration build() {
            return new DefaultRolloutSpecificationResponseProviderRegistration(id, name, properties, type);
        }
    }
}
