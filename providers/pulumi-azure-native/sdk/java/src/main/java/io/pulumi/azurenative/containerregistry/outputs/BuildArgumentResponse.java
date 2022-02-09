// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BuildArgumentResponse {
    private final @Nullable Boolean isSecret;
    private final String name;
    private final String type;
    private final String value;

    @OutputCustomType.Constructor({"isSecret","name","type","value"})
    private BuildArgumentResponse(
        @Nullable Boolean isSecret,
        String name,
        String type,
        String value) {
        this.isSecret = isSecret;
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
        this.value = Objects.requireNonNull(value);
    }

    public Optional<Boolean> getIsSecret() {
        return Optional.ofNullable(this.isSecret);
    }
    public String getName() {
        return this.name;
    }
    public String getType() {
        return this.type;
    }
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildArgumentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isSecret;
        private String name;
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildArgumentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isSecret = defaults.isSecret;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setIsSecret(@Nullable Boolean isSecret) {
            this.isSecret = isSecret;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public BuildArgumentResponse build() {
            return new BuildArgumentResponse(isSecret, name, type, value);
        }
    }
}
