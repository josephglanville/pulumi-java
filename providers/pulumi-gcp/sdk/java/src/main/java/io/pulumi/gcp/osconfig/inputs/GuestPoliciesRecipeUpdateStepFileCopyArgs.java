// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesRecipeUpdateStepFileCopyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeUpdateStepFileCopyArgs Empty = new GuestPoliciesRecipeUpdateStepFileCopyArgs();

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
     * Directory to extract archive to. Defaults to / on Linux or C:\ on Windows.
     * 
     */
    @Import(name="destination", required=true)
      private final Output<String> destination;

    public Output<String> getDestination() {
        return this.destination;
    }

    /**
     * Whether to allow this step to overwrite existing files.If this is false and the file already exists the file
     * is not overwritten and the step is considered a success. Defaults to false.
     * 
     */
    @Import(name="overwrite")
      private final @Nullable Output<Boolean> overwrite;

    public Output<Boolean> getOverwrite() {
        return this.overwrite == null ? Output.empty() : this.overwrite;
    }

    /**
     * Consists of three octal digits which represent, in order, the permissions of the owner, group, and other users
     * for the file (similarly to the numeric mode used in the linux chmod utility). Each digit represents a three bit
     * number with the 4 bit corresponding to the read permissions, the 2 bit corresponds to the write bit, and the one
     * bit corresponds to the execute permission. Default behavior is 755.
     * Below are some examples of permissions and their associated values:
     * read, write, and execute: 7 read and execute: 5 read and write: 6 read only: 4
     * 
     */
    @Import(name="permissions")
      private final @Nullable Output<String> permissions;

    public Output<String> getPermissions() {
        return this.permissions == null ? Output.empty() : this.permissions;
    }

    public GuestPoliciesRecipeUpdateStepFileCopyArgs(
        Output<String> artifactId,
        Output<String> destination,
        @Nullable Output<Boolean> overwrite,
        @Nullable Output<String> permissions) {
        this.artifactId = Objects.requireNonNull(artifactId, "expected parameter 'artifactId' to be non-null");
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.overwrite = overwrite;
        this.permissions = permissions;
    }

    private GuestPoliciesRecipeUpdateStepFileCopyArgs() {
        this.artifactId = Output.empty();
        this.destination = Output.empty();
        this.overwrite = Output.empty();
        this.permissions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeUpdateStepFileCopyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> artifactId;
        private Output<String> destination;
        private @Nullable Output<Boolean> overwrite;
        private @Nullable Output<String> permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeUpdateStepFileCopyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactId = defaults.artifactId;
    	      this.destination = defaults.destination;
    	      this.overwrite = defaults.overwrite;
    	      this.permissions = defaults.permissions;
        }

        public Builder artifactId(Output<String> artifactId) {
            this.artifactId = Objects.requireNonNull(artifactId);
            return this;
        }
        public Builder artifactId(String artifactId) {
            this.artifactId = Output.of(Objects.requireNonNull(artifactId));
            return this;
        }
        public Builder destination(Output<String> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder destination(String destination) {
            this.destination = Output.of(Objects.requireNonNull(destination));
            return this;
        }
        public Builder overwrite(@Nullable Output<Boolean> overwrite) {
            this.overwrite = overwrite;
            return this;
        }
        public Builder overwrite(@Nullable Boolean overwrite) {
            this.overwrite = Output.ofNullable(overwrite);
            return this;
        }
        public Builder permissions(@Nullable Output<String> permissions) {
            this.permissions = permissions;
            return this;
        }
        public Builder permissions(@Nullable String permissions) {
            this.permissions = Output.ofNullable(permissions);
            return this;
        }        public GuestPoliciesRecipeUpdateStepFileCopyArgs build() {
            return new GuestPoliciesRecipeUpdateStepFileCopyArgs(artifactId, destination, overwrite, permissions);
        }
    }
}
