// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AssignmentLockSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AssignmentLockSettingsResponse Empty = new AssignmentLockSettingsResponse();

    @InputImport(name="excludedActions")
    private final @Nullable List<String> excludedActions;

    public List<String> getExcludedActions() {
        return this.excludedActions == null ? List.of() : this.excludedActions;
    }

    @InputImport(name="excludedPrincipals")
    private final @Nullable List<String> excludedPrincipals;

    public List<String> getExcludedPrincipals() {
        return this.excludedPrincipals == null ? List.of() : this.excludedPrincipals;
    }

    @InputImport(name="mode")
    private final @Nullable String mode;

    public Optional<String> getMode() {
        return this.mode == null ? Optional.empty() : Optional.ofNullable(this.mode);
    }

    public AssignmentLockSettingsResponse(
        @Nullable List<String> excludedActions,
        @Nullable List<String> excludedPrincipals,
        @Nullable String mode) {
        this.excludedActions = excludedActions;
        this.excludedPrincipals = excludedPrincipals;
        this.mode = mode;
    }

    private AssignmentLockSettingsResponse() {
        this.excludedActions = List.of();
        this.excludedPrincipals = List.of();
        this.mode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentLockSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> excludedActions;
        private @Nullable List<String> excludedPrincipals;
        private @Nullable String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentLockSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedActions = defaults.excludedActions;
    	      this.excludedPrincipals = defaults.excludedPrincipals;
    	      this.mode = defaults.mode;
        }

        public Builder setExcludedActions(@Nullable List<String> excludedActions) {
            this.excludedActions = excludedActions;
            return this;
        }

        public Builder setExcludedPrincipals(@Nullable List<String> excludedPrincipals) {
            this.excludedPrincipals = excludedPrincipals;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public AssignmentLockSettingsResponse build() {
            return new AssignmentLockSettingsResponse(excludedActions, excludedPrincipals, mode);
        }
    }
}
