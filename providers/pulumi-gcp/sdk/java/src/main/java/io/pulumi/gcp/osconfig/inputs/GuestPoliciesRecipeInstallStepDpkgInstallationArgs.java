// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GuestPoliciesRecipeInstallStepDpkgInstallationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeInstallStepDpkgInstallationArgs Empty = new GuestPoliciesRecipeInstallStepDpkgInstallationArgs();

    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    @InputImport(name="artifactId", required=true)
      private final Input<String> artifactId;

    public Input<String> getArtifactId() {
        return this.artifactId;
    }

    public GuestPoliciesRecipeInstallStepDpkgInstallationArgs(Input<String> artifactId) {
        this.artifactId = Objects.requireNonNull(artifactId, "expected parameter 'artifactId' to be non-null");
    }

    private GuestPoliciesRecipeInstallStepDpkgInstallationArgs() {
        this.artifactId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeInstallStepDpkgInstallationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> artifactId;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeInstallStepDpkgInstallationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactId = defaults.artifactId;
        }

        public Builder setArtifactId(Input<String> artifactId) {
            this.artifactId = Objects.requireNonNull(artifactId);
            return this;
        }

        public Builder setArtifactId(String artifactId) {
            this.artifactId = Input.of(Objects.requireNonNull(artifactId));
            return this;
        }
        public GuestPoliciesRecipeInstallStepDpkgInstallationArgs build() {
            return new GuestPoliciesRecipeInstallStepDpkgInstallationArgs(artifactId);
        }
    }
}
