// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArtifactGetArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepGetArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesRecipeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeGetArgs Empty = new GuestPoliciesRecipeGetArgs();

    /**
     * Resources available to be used in the steps in the recipe.
     * Structure is documented below.
     * 
     */
    @InputImport(name="artifacts")
      private final @Nullable Input<List<GuestPoliciesRecipeArtifactGetArgs>> artifacts;

    public Input<List<GuestPoliciesRecipeArtifactGetArgs>> getArtifacts() {
        return this.artifacts == null ? Input.empty() : this.artifacts;
    }

    /**
     * Default is INSTALLED. The desired state the agent should maintain for this recipe.
     * INSTALLED: The software recipe is installed on the instance but won't be updated to new versions.
     * INSTALLED_KEEP_UPDATED: The software recipe is installed on the instance. The recipe is updated to a higher version,
     * if a higher version of the recipe is assigned to this instance.
     * REMOVE: Remove is unsupported for software recipes and attempts to create or update a recipe to the REMOVE state is rejected.
     * Default value is `INSTALLED`.
     * Possible values are `INSTALLED`, `UPDATED`, and `REMOVED`.
     * 
     */
    @InputImport(name="desiredState")
      private final @Nullable Input<String> desiredState;

    public Input<String> getDesiredState() {
        return this.desiredState == null ? Input.empty() : this.desiredState;
    }

    /**
     * Actions to be taken for installing this recipe. On failure it stops executing steps and does not attempt another installation.
     * Any steps taken (including partially completed steps) are not rolled back.
     * Structure is documented below.
     * 
     */
    @InputImport(name="installSteps")
      private final @Nullable Input<List<GuestPoliciesRecipeInstallStepGetArgs>> installSteps;

    public Input<List<GuestPoliciesRecipeInstallStepGetArgs>> getInstallSteps() {
        return this.installSteps == null ? Input.empty() : this.installSteps;
    }

    /**
     * Unique identifier for the recipe. Only one recipe with a given name is installed on an instance.
     * Names are also used to identify resources which helps to determine whether guest policies have conflicts.
     * This means that requests to create multiple recipes with the same name and version are rejected since they
     * could potentially have conflicting assignments.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Actions to be taken for updating this recipe. On failure it stops executing steps and does not attempt another update for this recipe.
     * Any steps taken (including partially completed steps) are not rolled back.
     * Structure is documented below.
     * 
     */
    @InputImport(name="updateSteps")
      private final @Nullable Input<List<GuestPoliciesRecipeUpdateStepGetArgs>> updateSteps;

    public Input<List<GuestPoliciesRecipeUpdateStepGetArgs>> getUpdateSteps() {
        return this.updateSteps == null ? Input.empty() : this.updateSteps;
    }

    /**
     * The version of this software recipe. Version can be up to 4 period separated numbers (e.g. 12.34.56.78).
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public GuestPoliciesRecipeGetArgs(
        @Nullable Input<List<GuestPoliciesRecipeArtifactGetArgs>> artifacts,
        @Nullable Input<String> desiredState,
        @Nullable Input<List<GuestPoliciesRecipeInstallStepGetArgs>> installSteps,
        Input<String> name,
        @Nullable Input<List<GuestPoliciesRecipeUpdateStepGetArgs>> updateSteps,
        @Nullable Input<String> version) {
        this.artifacts = artifacts;
        this.desiredState = desiredState;
        this.installSteps = installSteps;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.updateSteps = updateSteps;
        this.version = version;
    }

    private GuestPoliciesRecipeGetArgs() {
        this.artifacts = Input.empty();
        this.desiredState = Input.empty();
        this.installSteps = Input.empty();
        this.name = Input.empty();
        this.updateSteps = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GuestPoliciesRecipeArtifactGetArgs>> artifacts;
        private @Nullable Input<String> desiredState;
        private @Nullable Input<List<GuestPoliciesRecipeInstallStepGetArgs>> installSteps;
        private Input<String> name;
        private @Nullable Input<List<GuestPoliciesRecipeUpdateStepGetArgs>> updateSteps;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifacts = defaults.artifacts;
    	      this.desiredState = defaults.desiredState;
    	      this.installSteps = defaults.installSteps;
    	      this.name = defaults.name;
    	      this.updateSteps = defaults.updateSteps;
    	      this.version = defaults.version;
        }

        public Builder setArtifacts(@Nullable Input<List<GuestPoliciesRecipeArtifactGetArgs>> artifacts) {
            this.artifacts = artifacts;
            return this;
        }

        public Builder setArtifacts(@Nullable List<GuestPoliciesRecipeArtifactGetArgs> artifacts) {
            this.artifacts = Input.ofNullable(artifacts);
            return this;
        }

        public Builder setDesiredState(@Nullable Input<String> desiredState) {
            this.desiredState = desiredState;
            return this;
        }

        public Builder setDesiredState(@Nullable String desiredState) {
            this.desiredState = Input.ofNullable(desiredState);
            return this;
        }

        public Builder setInstallSteps(@Nullable Input<List<GuestPoliciesRecipeInstallStepGetArgs>> installSteps) {
            this.installSteps = installSteps;
            return this;
        }

        public Builder setInstallSteps(@Nullable List<GuestPoliciesRecipeInstallStepGetArgs> installSteps) {
            this.installSteps = Input.ofNullable(installSteps);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setUpdateSteps(@Nullable Input<List<GuestPoliciesRecipeUpdateStepGetArgs>> updateSteps) {
            this.updateSteps = updateSteps;
            return this;
        }

        public Builder setUpdateSteps(@Nullable List<GuestPoliciesRecipeUpdateStepGetArgs> updateSteps) {
            this.updateSteps = Input.ofNullable(updateSteps);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public GuestPoliciesRecipeGetArgs build() {
            return new GuestPoliciesRecipeGetArgs(artifacts, desiredState, installSteps, name, updateSteps, version);
        }
    }
}
