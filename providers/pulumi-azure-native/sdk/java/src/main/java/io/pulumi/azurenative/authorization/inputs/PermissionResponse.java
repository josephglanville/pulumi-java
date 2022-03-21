// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Role definition permissions.
 * 
 */
public final class PermissionResponse extends io.pulumi.resources.InvokeArgs {

    public static final PermissionResponse Empty = new PermissionResponse();

    /**
     * Allowed actions.
     * 
     */
    @Import(name="actions")
      private final @Nullable List<String> actions;

    public List<String> getActions() {
        return this.actions == null ? List.of() : this.actions;
    }

    /**
     * Allowed Data actions.
     * 
     */
    @Import(name="dataActions")
      private final @Nullable List<String> dataActions;

    public List<String> getDataActions() {
        return this.dataActions == null ? List.of() : this.dataActions;
    }

    /**
     * Denied actions.
     * 
     */
    @Import(name="notActions")
      private final @Nullable List<String> notActions;

    public List<String> getNotActions() {
        return this.notActions == null ? List.of() : this.notActions;
    }

    /**
     * Denied Data actions.
     * 
     */
    @Import(name="notDataActions")
      private final @Nullable List<String> notDataActions;

    public List<String> getNotDataActions() {
        return this.notDataActions == null ? List.of() : this.notDataActions;
    }

    public PermissionResponse(
        @Nullable List<String> actions,
        @Nullable List<String> dataActions,
        @Nullable List<String> notActions,
        @Nullable List<String> notDataActions) {
        this.actions = actions;
        this.dataActions = dataActions;
        this.notActions = notActions;
        this.notDataActions = notDataActions;
    }

    private PermissionResponse() {
        this.actions = List.of();
        this.dataActions = List.of();
        this.notActions = List.of();
        this.notDataActions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> actions;
        private @Nullable List<String> dataActions;
        private @Nullable List<String> notActions;
        private @Nullable List<String> notDataActions;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.dataActions = defaults.dataActions;
    	      this.notActions = defaults.notActions;
    	      this.notDataActions = defaults.notDataActions;
        }

        public Builder actions(@Nullable List<String> actions) {
            this.actions = actions;
            return this;
        }
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }
        public Builder dataActions(@Nullable List<String> dataActions) {
            this.dataActions = dataActions;
            return this;
        }
        public Builder dataActions(String... dataActions) {
            return dataActions(List.of(dataActions));
        }
        public Builder notActions(@Nullable List<String> notActions) {
            this.notActions = notActions;
            return this;
        }
        public Builder notActions(String... notActions) {
            return notActions(List.of(notActions));
        }
        public Builder notDataActions(@Nullable List<String> notDataActions) {
            this.notDataActions = notDataActions;
            return this;
        }
        public Builder notDataActions(String... notDataActions) {
            return notDataActions(List.of(notDataActions));
        }        public PermissionResponse build() {
            return new PermissionResponse(actions, dataActions, notActions, notDataActions);
        }
    }
}
