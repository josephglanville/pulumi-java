// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PerInstanceConfigState extends io.pulumi.resources.ResourceArgs {

    public static final PerInstanceConfigState Empty = new PerInstanceConfigState();

    /**
     * The instance group manager this instance config is part of.
     * 
     */
    @Import(name="instanceGroupManager")
      private final @Nullable Output<String> instanceGroupManager;

    public Output<String> getInstanceGroupManager() {
        return this.instanceGroupManager == null ? Output.empty() : this.instanceGroupManager;
    }

    /**
     * The minimal action to perform on the instance during an update.
     * Default is `NONE`. Possible values are:
     * * REPLACE
     * * RESTART
     * * REFRESH
     * * NONE
     * 
     */
    @Import(name="minimalAction")
      private final @Nullable Output<String> minimalAction;

    public Output<String> getMinimalAction() {
        return this.minimalAction == null ? Output.empty() : this.minimalAction;
    }

    /**
     * The most disruptive action to perform on the instance during an update.
     * Default is `REPLACE`. Possible values are:
     * * REPLACE
     * * RESTART
     * * REFRESH
     * * NONE
     * 
     */
    @Import(name="mostDisruptiveAllowedAction")
      private final @Nullable Output<String> mostDisruptiveAllowedAction;

    public Output<String> getMostDisruptiveAllowedAction() {
        return this.mostDisruptiveAllowedAction == null ? Output.empty() : this.mostDisruptiveAllowedAction;
    }

    /**
     * The name for this per-instance config and its corresponding instance.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The preserved state for this instance.
     * Structure is documented below.
     * 
     */
    @Import(name="preservedState")
      private final @Nullable Output<PerInstanceConfigPreservedStateGetArgs> preservedState;

    public Output<PerInstanceConfigPreservedStateGetArgs> getPreservedState() {
        return this.preservedState == null ? Output.empty() : this.preservedState;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * When true, deleting this config will immediately remove any specified state from the underlying instance.
     * When false, deleting this config will *not* immediately remove any state from the underlying instance.
     * State will be removed on the next instance recreation or update.
     * 
     */
    @Import(name="removeInstanceStateOnDestroy")
      private final @Nullable Output<Boolean> removeInstanceStateOnDestroy;

    public Output<Boolean> getRemoveInstanceStateOnDestroy() {
        return this.removeInstanceStateOnDestroy == null ? Output.empty() : this.removeInstanceStateOnDestroy;
    }

    /**
     * Zone where the containing instance group manager is located
     * 
     */
    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> getZone() {
        return this.zone == null ? Output.empty() : this.zone;
    }

    public PerInstanceConfigState(
        @Nullable Output<String> instanceGroupManager,
        @Nullable Output<String> minimalAction,
        @Nullable Output<String> mostDisruptiveAllowedAction,
        @Nullable Output<String> name,
        @Nullable Output<PerInstanceConfigPreservedStateGetArgs> preservedState,
        @Nullable Output<String> project,
        @Nullable Output<Boolean> removeInstanceStateOnDestroy,
        @Nullable Output<String> zone) {
        this.instanceGroupManager = instanceGroupManager;
        this.minimalAction = minimalAction;
        this.mostDisruptiveAllowedAction = mostDisruptiveAllowedAction;
        this.name = name;
        this.preservedState = preservedState;
        this.project = project;
        this.removeInstanceStateOnDestroy = removeInstanceStateOnDestroy;
        this.zone = zone;
    }

    private PerInstanceConfigState() {
        this.instanceGroupManager = Output.empty();
        this.minimalAction = Output.empty();
        this.mostDisruptiveAllowedAction = Output.empty();
        this.name = Output.empty();
        this.preservedState = Output.empty();
        this.project = Output.empty();
        this.removeInstanceStateOnDestroy = Output.empty();
        this.zone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PerInstanceConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> instanceGroupManager;
        private @Nullable Output<String> minimalAction;
        private @Nullable Output<String> mostDisruptiveAllowedAction;
        private @Nullable Output<String> name;
        private @Nullable Output<PerInstanceConfigPreservedStateGetArgs> preservedState;
        private @Nullable Output<String> project;
        private @Nullable Output<Boolean> removeInstanceStateOnDestroy;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(PerInstanceConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceGroupManager = defaults.instanceGroupManager;
    	      this.minimalAction = defaults.minimalAction;
    	      this.mostDisruptiveAllowedAction = defaults.mostDisruptiveAllowedAction;
    	      this.name = defaults.name;
    	      this.preservedState = defaults.preservedState;
    	      this.project = defaults.project;
    	      this.removeInstanceStateOnDestroy = defaults.removeInstanceStateOnDestroy;
    	      this.zone = defaults.zone;
        }

        public Builder instanceGroupManager(@Nullable Output<String> instanceGroupManager) {
            this.instanceGroupManager = instanceGroupManager;
            return this;
        }
        public Builder instanceGroupManager(@Nullable String instanceGroupManager) {
            this.instanceGroupManager = Output.ofNullable(instanceGroupManager);
            return this;
        }
        public Builder minimalAction(@Nullable Output<String> minimalAction) {
            this.minimalAction = minimalAction;
            return this;
        }
        public Builder minimalAction(@Nullable String minimalAction) {
            this.minimalAction = Output.ofNullable(minimalAction);
            return this;
        }
        public Builder mostDisruptiveAllowedAction(@Nullable Output<String> mostDisruptiveAllowedAction) {
            this.mostDisruptiveAllowedAction = mostDisruptiveAllowedAction;
            return this;
        }
        public Builder mostDisruptiveAllowedAction(@Nullable String mostDisruptiveAllowedAction) {
            this.mostDisruptiveAllowedAction = Output.ofNullable(mostDisruptiveAllowedAction);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder preservedState(@Nullable Output<PerInstanceConfigPreservedStateGetArgs> preservedState) {
            this.preservedState = preservedState;
            return this;
        }
        public Builder preservedState(@Nullable PerInstanceConfigPreservedStateGetArgs preservedState) {
            this.preservedState = Output.ofNullable(preservedState);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder removeInstanceStateOnDestroy(@Nullable Output<Boolean> removeInstanceStateOnDestroy) {
            this.removeInstanceStateOnDestroy = removeInstanceStateOnDestroy;
            return this;
        }
        public Builder removeInstanceStateOnDestroy(@Nullable Boolean removeInstanceStateOnDestroy) {
            this.removeInstanceStateOnDestroy = Output.ofNullable(removeInstanceStateOnDestroy);
            return this;
        }
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Output.ofNullable(zone);
            return this;
        }        public PerInstanceConfigState build() {
            return new PerInstanceConfigState(instanceGroupManager, minimalAction, mostDisruptiveAllowedAction, name, preservedState, project, removeInstanceStateOnDestroy, zone);
        }
    }
}
