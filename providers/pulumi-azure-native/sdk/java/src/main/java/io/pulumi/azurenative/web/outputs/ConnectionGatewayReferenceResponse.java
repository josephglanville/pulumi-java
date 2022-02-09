// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectionGatewayReferenceResponse {
    private final @Nullable String id;
    private final @Nullable String location;
    private final @Nullable String name;
    private final @Nullable String type;

    @OutputCustomType.Constructor({"id","location","name","type"})
    private ConnectionGatewayReferenceResponse(
        @Nullable String id,
        @Nullable String location,
        @Nullable String name,
        @Nullable String type) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.type = type;
    }

    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionGatewayReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String location;
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionGatewayReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public ConnectionGatewayReferenceResponse build() {
            return new ConnectionGatewayReferenceResponse(id, location, name, type);
        }
    }
}
