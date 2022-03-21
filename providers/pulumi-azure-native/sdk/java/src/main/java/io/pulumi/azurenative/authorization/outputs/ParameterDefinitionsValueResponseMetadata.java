// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ParameterDefinitionsValueResponseMetadata {
    /**
     * Set to true to have Azure portal create role assignments on the resource ID or resource scope value of this parameter during policy assignment. This property is useful in case you wish to assign permissions outside the assignment scope.
     * 
     */
    private final @Nullable Boolean assignPermissions;
    /**
     * The description of the parameter.
     * 
     */
    private final @Nullable String description;
    /**
     * The display name for the parameter.
     * 
     */
    private final @Nullable String displayName;
    /**
     * Used when assigning the policy definition through the portal. Provides a context aware list of values for the user to choose from.
     * 
     */
    private final @Nullable String strongType;

    @CustomType.Constructor
    private ParameterDefinitionsValueResponseMetadata(
        @CustomType.Parameter("assignPermissions") @Nullable Boolean assignPermissions,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("strongType") @Nullable String strongType) {
        this.assignPermissions = assignPermissions;
        this.description = description;
        this.displayName = displayName;
        this.strongType = strongType;
    }

    /**
     * Set to true to have Azure portal create role assignments on the resource ID or resource scope value of this parameter during policy assignment. This property is useful in case you wish to assign permissions outside the assignment scope.
     * 
    */
    public Optional<Boolean> getAssignPermissions() {
        return Optional.ofNullable(this.assignPermissions);
    }
    /**
     * The description of the parameter.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The display name for the parameter.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Used when assigning the policy definition through the portal. Provides a context aware list of values for the user to choose from.
     * 
    */
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

        public Builder assignPermissions(@Nullable Boolean assignPermissions) {
            this.assignPermissions = assignPermissions;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder strongType(@Nullable String strongType) {
            this.strongType = strongType;
            return this;
        }        public ParameterDefinitionsValueResponseMetadata build() {
            return new ParameterDefinitionsValueResponseMetadata(assignPermissions, description, displayName, strongType);
        }
    }
}
