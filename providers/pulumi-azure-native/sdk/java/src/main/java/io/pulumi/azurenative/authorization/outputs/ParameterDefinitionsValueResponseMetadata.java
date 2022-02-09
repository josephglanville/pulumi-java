// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ParameterDefinitionsValueResponseMetadata {
    private final @Nullable Boolean assignPermissions;
    private final @Nullable String description;
    private final @Nullable String displayName;
    private final @Nullable String strongType;

    @OutputCustomType.Constructor({"assignPermissions","description","displayName","strongType"})
    private ParameterDefinitionsValueResponseMetadata(
        @Nullable Boolean assignPermissions,
        @Nullable String description,
        @Nullable String displayName,
        @Nullable String strongType) {
        this.assignPermissions = assignPermissions;
        this.description = description;
        this.displayName = displayName;
        this.strongType = strongType;
    }

    public Optional<Boolean> getAssignPermissions() {
        return Optional.ofNullable(this.assignPermissions);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    public Optional<String> getStrongType() {
        return Optional.ofNullable(this.strongType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterDefinitionsValueResponseMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean assignPermissions;
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable String strongType;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterDefinitionsValueResponseMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignPermissions = defaults.assignPermissions;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.strongType = defaults.strongType;
        }

        public Builder setAssignPermissions(@Nullable Boolean assignPermissions) {
            this.assignPermissions = assignPermissions;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setStrongType(@Nullable String strongType) {
            this.strongType = strongType;
            return this;
        }

        public ParameterDefinitionsValueResponseMetadata build() {
            return new ParameterDefinitionsValueResponseMetadata(assignPermissions, description, displayName, strongType);
        }
    }
}
