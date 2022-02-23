// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentPatchConfigYumGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentPatchConfigYumGetArgs Empty = new PatchDeploymentPatchConfigYumGetArgs();

    /**
     * List of KBs to exclude from update.
     * 
     */
    @InputImport(name="excludes")
      private final @Nullable Input<List<String>> excludes;

    public Input<List<String>> getExcludes() {
        return this.excludes == null ? Input.empty() : this.excludes;
    }

    /**
     * An exclusive list of packages to be updated. These are the only packages that will be updated.
     * If these packages are not installed, they will be ignored. This field cannot be specified with
     * any other patch configuration fields.
     * 
     */
    @InputImport(name="exclusivePackages")
      private final @Nullable Input<List<String>> exclusivePackages;

    public Input<List<String>> getExclusivePackages() {
        return this.exclusivePackages == null ? Input.empty() : this.exclusivePackages;
    }

    /**
     * Will cause patch to run yum update-minimal instead.
     * 
     */
    @InputImport(name="minimal")
      private final @Nullable Input<Boolean> minimal;

    public Input<Boolean> getMinimal() {
        return this.minimal == null ? Input.empty() : this.minimal;
    }

    /**
     * Adds the --security flag to yum update. Not supported on all platforms.
     * 
     */
    @InputImport(name="security")
      private final @Nullable Input<Boolean> security;

    public Input<Boolean> getSecurity() {
        return this.security == null ? Input.empty() : this.security;
    }

    public PatchDeploymentPatchConfigYumGetArgs(
        @Nullable Input<List<String>> excludes,
        @Nullable Input<List<String>> exclusivePackages,
        @Nullable Input<Boolean> minimal,
        @Nullable Input<Boolean> security) {
        this.excludes = excludes;
        this.exclusivePackages = exclusivePackages;
        this.minimal = minimal;
        this.security = security;
    }

    private PatchDeploymentPatchConfigYumGetArgs() {
        this.excludes = Input.empty();
        this.exclusivePackages = Input.empty();
        this.minimal = Input.empty();
        this.security = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentPatchConfigYumGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> excludes;
        private @Nullable Input<List<String>> exclusivePackages;
        private @Nullable Input<Boolean> minimal;
        private @Nullable Input<Boolean> security;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentPatchConfigYumGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludes = defaults.excludes;
    	      this.exclusivePackages = defaults.exclusivePackages;
    	      this.minimal = defaults.minimal;
    	      this.security = defaults.security;
        }

        public Builder setExcludes(@Nullable Input<List<String>> excludes) {
            this.excludes = excludes;
            return this;
        }

        public Builder setExcludes(@Nullable List<String> excludes) {
            this.excludes = Input.ofNullable(excludes);
            return this;
        }

        public Builder setExclusivePackages(@Nullable Input<List<String>> exclusivePackages) {
            this.exclusivePackages = exclusivePackages;
            return this;
        }

        public Builder setExclusivePackages(@Nullable List<String> exclusivePackages) {
            this.exclusivePackages = Input.ofNullable(exclusivePackages);
            return this;
        }

        public Builder setMinimal(@Nullable Input<Boolean> minimal) {
            this.minimal = minimal;
            return this;
        }

        public Builder setMinimal(@Nullable Boolean minimal) {
            this.minimal = Input.ofNullable(minimal);
            return this;
        }

        public Builder setSecurity(@Nullable Input<Boolean> security) {
            this.security = security;
            return this;
        }

        public Builder setSecurity(@Nullable Boolean security) {
            this.security = Input.ofNullable(security);
            return this;
        }
        public PatchDeploymentPatchConfigYumGetArgs build() {
            return new PatchDeploymentPatchConfigYumGetArgs(excludes, exclusivePackages, minimal, security);
        }
    }
}
