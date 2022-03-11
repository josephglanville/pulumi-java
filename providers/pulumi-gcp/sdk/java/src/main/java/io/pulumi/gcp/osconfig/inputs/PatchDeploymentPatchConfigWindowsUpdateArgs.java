// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentPatchConfigWindowsUpdateArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentPatchConfigWindowsUpdateArgs Empty = new PatchDeploymentPatchConfigWindowsUpdateArgs();

    /**
     * Only apply updates of these windows update classifications. If empty, all updates are applied.
     * Each value may be one of `CRITICAL`, `SECURITY`, `DEFINITION`, `DRIVER`, `FEATURE_PACK`, `SERVICE_PACK`, `TOOL`, `UPDATE_ROLLUP`, and `UPDATE`.
     * 
     */
    @InputImport(name="classifications")
      private final @Nullable Output<List<String>> classifications;

    public Output<List<String>> getClassifications() {
        return this.classifications == null ? Output.empty() : this.classifications;
    }

    /**
     * List of KBs to exclude from update.
     * 
     */
    @InputImport(name="excludes")
      private final @Nullable Output<List<String>> excludes;

    public Output<List<String>> getExcludes() {
        return this.excludes == null ? Output.empty() : this.excludes;
    }

    /**
     * An exclusive list of kbs to be updated. These are the only patches that will be updated.
     * This field must not be used with other patch configurations.
     * 
     */
    @InputImport(name="exclusivePatches")
      private final @Nullable Output<List<String>> exclusivePatches;

    public Output<List<String>> getExclusivePatches() {
        return this.exclusivePatches == null ? Output.empty() : this.exclusivePatches;
    }

    public PatchDeploymentPatchConfigWindowsUpdateArgs(
        @Nullable Output<List<String>> classifications,
        @Nullable Output<List<String>> excludes,
        @Nullable Output<List<String>> exclusivePatches) {
        this.classifications = classifications;
        this.excludes = excludes;
        this.exclusivePatches = exclusivePatches;
    }

    private PatchDeploymentPatchConfigWindowsUpdateArgs() {
        this.classifications = Output.empty();
        this.excludes = Output.empty();
        this.exclusivePatches = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentPatchConfigWindowsUpdateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> classifications;
        private @Nullable Output<List<String>> excludes;
        private @Nullable Output<List<String>> exclusivePatches;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentPatchConfigWindowsUpdateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classifications = defaults.classifications;
    	      this.excludes = defaults.excludes;
    	      this.exclusivePatches = defaults.exclusivePatches;
        }

        public Builder classifications(@Nullable Output<List<String>> classifications) {
            this.classifications = classifications;
            return this;
        }

        public Builder classifications(@Nullable List<String> classifications) {
            this.classifications = Output.ofNullable(classifications);
            return this;
        }

        public Builder excludes(@Nullable Output<List<String>> excludes) {
            this.excludes = excludes;
            return this;
        }

        public Builder excludes(@Nullable List<String> excludes) {
            this.excludes = Output.ofNullable(excludes);
            return this;
        }

        public Builder exclusivePatches(@Nullable Output<List<String>> exclusivePatches) {
            this.exclusivePatches = exclusivePatches;
            return this;
        }

        public Builder exclusivePatches(@Nullable List<String> exclusivePatches) {
            this.exclusivePatches = Output.ofNullable(exclusivePatches);
            return this;
        }
        public PatchDeploymentPatchConfigWindowsUpdateArgs build() {
            return new PatchDeploymentPatchConfigWindowsUpdateArgs(classifications, excludes, exclusivePatches);
        }
    }
}
