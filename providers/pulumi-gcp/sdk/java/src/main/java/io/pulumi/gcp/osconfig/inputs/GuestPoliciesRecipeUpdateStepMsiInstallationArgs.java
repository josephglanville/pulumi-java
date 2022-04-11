// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesRecipeUpdateStepMsiInstallationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeUpdateStepMsiInstallationArgs Empty = new GuestPoliciesRecipeUpdateStepMsiInstallationArgs();

    /**
     * Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    @Import(name="allowedExitCodes")
      private final @Nullable Output<List<Integer>> allowedExitCodes;

    public Output<List<Integer>> getAllowedExitCodes() {
        return this.allowedExitCodes == null ? Codegen.empty() : this.allowedExitCodes;
    }

    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    @Import(name="artifactId", required=true)
      private final Output<String> artifactId;

    public Output<String> getArtifactId() {
        return this.artifactId;
    }

    /**
     * The flags to use when installing the MSI. Defaults to the install flag.
     * 
     */
    @Import(name="flags")
      private final @Nullable Output<List<String>> flags;

    public Output<List<String>> getFlags() {
        return this.flags == null ? Codegen.empty() : this.flags;
    }

    public GuestPoliciesRecipeUpdateStepMsiInstallationArgs(
        @Nullable Output<List<Integer>> allowedExitCodes,
        Output<String> artifactId,
        @Nullable Output<List<String>> flags) {
        this.allowedExitCodes = allowedExitCodes;
        this.artifactId = Objects.requireNonNull(artifactId, "expected parameter 'artifactId' to be non-null");
        this.flags = flags;
    }

    private GuestPoliciesRecipeUpdateStepMsiInstallationArgs() {
        this.allowedExitCodes = Codegen.empty();
        this.artifactId = Codegen.empty();
        this.flags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeUpdateStepMsiInstallationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Integer>> allowedExitCodes;
        private Output<String> artifactId;
        private @Nullable Output<List<String>> flags;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeUpdateStepMsiInstallationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedExitCodes = defaults.allowedExitCodes;
    	      this.artifactId = defaults.artifactId;
    	      this.flags = defaults.flags;
        }

        public Builder allowedExitCodes(@Nullable Output<List<Integer>> allowedExitCodes) {
            this.allowedExitCodes = allowedExitCodes;
            return this;
        }
        public Builder allowedExitCodes(@Nullable List<Integer> allowedExitCodes) {
            this.allowedExitCodes = Codegen.ofNullable(allowedExitCodes);
            return this;
        }
        public Builder allowedExitCodes(Integer... allowedExitCodes) {
            return allowedExitCodes(List.of(allowedExitCodes));
        }
        public Builder artifactId(Output<String> artifactId) {
            this.artifactId = Objects.requireNonNull(artifactId);
            return this;
        }
        public Builder artifactId(String artifactId) {
            this.artifactId = Output.of(Objects.requireNonNull(artifactId));
            return this;
        }
        public Builder flags(@Nullable Output<List<String>> flags) {
            this.flags = flags;
            return this;
        }
        public Builder flags(@Nullable List<String> flags) {
            this.flags = Codegen.ofNullable(flags);
            return this;
        }
        public Builder flags(String... flags) {
            return flags(List.of(flags));
        }        public GuestPoliciesRecipeUpdateStepMsiInstallationArgs build() {
            return new GuestPoliciesRecipeUpdateStepMsiInstallationArgs(allowedExitCodes, artifactId, flags);
        }
    }
}
