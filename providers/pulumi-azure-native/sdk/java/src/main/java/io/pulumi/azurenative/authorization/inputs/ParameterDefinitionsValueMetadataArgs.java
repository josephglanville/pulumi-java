// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * General metadata for the parameter.
 * 
 */
public final class ParameterDefinitionsValueMetadataArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParameterDefinitionsValueMetadataArgs Empty = new ParameterDefinitionsValueMetadataArgs();

    /**
     * Set to true to have Azure portal create role assignments on the resource ID or resource scope value of this parameter during policy assignment. This property is useful in case you wish to assign permissions outside the assignment scope.
     * 
     */
    @InputImport(name="assignPermissions")
      private final @Nullable Input<Boolean> assignPermissions;

    public Input<Boolean> getAssignPermissions() {
        return this.assignPermissions == null ? Input.empty() : this.assignPermissions;
    }

    /**
     * The description of the parameter.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The display name for the parameter.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Used when assigning the policy definition through the portal. Provides a context aware list of values for the user to choose from.
     * 
     */
    @InputImport(name="strongType")
      private final @Nullable Input<String> strongType;

    public Input<String> getStrongType() {
        return this.strongType == null ? Input.empty() : this.strongType;
    }

    public ParameterDefinitionsValueMetadataArgs(
        @Nullable Input<Boolean> assignPermissions,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<String> strongType) {
        this.assignPermissions = assignPermissions;
        this.description = description;
        this.displayName = displayName;
        this.strongType = strongType;
    }

    private ParameterDefinitionsValueMetadataArgs() {
        this.assignPermissions = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.strongType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterDefinitionsValueMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> assignPermissions;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> strongType;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterDefinitionsValueMetadataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignPermissions = defaults.assignPermissions;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.strongType = defaults.strongType;
        }

        public Builder setAssignPermissions(@Nullable Input<Boolean> assignPermissions) {
            this.assignPermissions = assignPermissions;
            return this;
        }

        public Builder setAssignPermissions(@Nullable Boolean assignPermissions) {
            this.assignPermissions = Input.ofNullable(assignPermissions);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setStrongType(@Nullable Input<String> strongType) {
            this.strongType = strongType;
            return this;
        }

        public Builder setStrongType(@Nullable String strongType) {
            this.strongType = Input.ofNullable(strongType);
            return this;
        }
        public ParameterDefinitionsValueMetadataArgs build() {
            return new ParameterDefinitionsValueMetadataArgs(assignPermissions, description, displayName, strongType);
        }
    }
}
