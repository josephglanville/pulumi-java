// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.inputs;

import io.pulumi.azurenative.blueprint.enums.AssignmentLockMode;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines how resources deployed by a blueprint assignment are locked.
 * 
 */
public final class AssignmentLockSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssignmentLockSettingsArgs Empty = new AssignmentLockSettingsArgs();

    /**
     * List of management operations that are excluded from blueprint locks. Up to 200 actions are permitted. If the lock mode is set to 'AllResourcesReadOnly', then the following actions are automatically appended to 'excludedActions': '*{@literal /}read', 'Microsoft.Network/virtualNetworks/subnets/join/action' and 'Microsoft.Authorization/locks/delete'. If the lock mode is set to 'AllResourcesDoNotDelete', then the following actions are automatically appended to 'excludedActions': 'Microsoft.Authorization/locks/delete'. Duplicate actions will get removed.
     * 
     */
    @InputImport(name="excludedActions")
      private final @Nullable Input<List<String>> excludedActions;

    public Input<List<String>> getExcludedActions() {
        return this.excludedActions == null ? Input.empty() : this.excludedActions;
    }

    /**
     * List of AAD principals excluded from blueprint locks. Up to 5 principals are permitted.
     * 
     */
    @InputImport(name="excludedPrincipals")
      private final @Nullable Input<List<String>> excludedPrincipals;

    public Input<List<String>> getExcludedPrincipals() {
        return this.excludedPrincipals == null ? Input.empty() : this.excludedPrincipals;
    }

    /**
     * Lock mode.
     * 
     */
    @InputImport(name="mode")
      private final @Nullable Input<Either<String,AssignmentLockMode>> mode;

    public Input<Either<String,AssignmentLockMode>> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    public AssignmentLockSettingsArgs(
        @Nullable Input<List<String>> excludedActions,
        @Nullable Input<List<String>> excludedPrincipals,
        @Nullable Input<Either<String,AssignmentLockMode>> mode) {
        this.excludedActions = excludedActions;
        this.excludedPrincipals = excludedPrincipals;
        this.mode = mode;
    }

    private AssignmentLockSettingsArgs() {
        this.excludedActions = Input.empty();
        this.excludedPrincipals = Input.empty();
        this.mode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentLockSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> excludedActions;
        private @Nullable Input<List<String>> excludedPrincipals;
        private @Nullable Input<Either<String,AssignmentLockMode>> mode;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentLockSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedActions = defaults.excludedActions;
    	      this.excludedPrincipals = defaults.excludedPrincipals;
    	      this.mode = defaults.mode;
        }

        public Builder setExcludedActions(@Nullable Input<List<String>> excludedActions) {
            this.excludedActions = excludedActions;
            return this;
        }

        public Builder setExcludedActions(@Nullable List<String> excludedActions) {
            this.excludedActions = Input.ofNullable(excludedActions);
            return this;
        }

        public Builder setExcludedPrincipals(@Nullable Input<List<String>> excludedPrincipals) {
            this.excludedPrincipals = excludedPrincipals;
            return this;
        }

        public Builder setExcludedPrincipals(@Nullable List<String> excludedPrincipals) {
            this.excludedPrincipals = Input.ofNullable(excludedPrincipals);
            return this;
        }

        public Builder setMode(@Nullable Input<Either<String,AssignmentLockMode>> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable Either<String,AssignmentLockMode> mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }
        public AssignmentLockSettingsArgs build() {
            return new AssignmentLockSettingsArgs(excludedActions, excludedPrincipals, mode);
        }
    }
}
