// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BuildArgumentResponse extends io.pulumi.resources.InvokeArgs {

    public static final BuildArgumentResponse Empty = new BuildArgumentResponse();

    @InputImport(name="isSecret")
    private final @Nullable Boolean isSecret;

    public Optional<Boolean> getIsSecret() {
        return this.isSecret == null ? Optional.empty() : Optional.ofNullable(this.isSecret);
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    @InputImport(name="value", required=true)
    private final String value;

    public String getValue() {
        return this.value;
    }

    public BuildArgumentResponse(
        @Nullable Boolean isSecret,
        String name,
        String type,
        String value) {
        this.isSecret = isSecret == null ? false : isSecret;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private BuildArgumentResponse() {
        this.isSecret = null;
        this.name = null;
        this.type = null;
        this.value = null;
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
