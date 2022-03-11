// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectBuildBatchConfigRestrictionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectBuildBatchConfigRestrictionsGetArgs Empty = new ProjectBuildBatchConfigRestrictionsGetArgs();

    /**
     * An array of strings that specify the compute types that are allowed for the batch build. See [Build environment compute types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html) in the AWS CodeBuild User Guide for these values.
     * 
     */
    @InputImport(name="computeTypesAlloweds")
      private final @Nullable Output<List<String>> computeTypesAlloweds;

    public Output<List<String>> getComputeTypesAlloweds() {
        return this.computeTypesAlloweds == null ? Output.empty() : this.computeTypesAlloweds;
    }

    /**
     * Specifies the maximum number of builds allowed.
     * 
     */
    @InputImport(name="maximumBuildsAllowed")
      private final @Nullable Output<Integer> maximumBuildsAllowed;

    public Output<Integer> getMaximumBuildsAllowed() {
        return this.maximumBuildsAllowed == null ? Output.empty() : this.maximumBuildsAllowed;
    }

    public ProjectBuildBatchConfigRestrictionsGetArgs(
        @Nullable Output<List<String>> computeTypesAlloweds,
        @Nullable Output<Integer> maximumBuildsAllowed) {
        this.computeTypesAlloweds = computeTypesAlloweds;
        this.maximumBuildsAllowed = maximumBuildsAllowed;
    }

    private ProjectBuildBatchConfigRestrictionsGetArgs() {
        this.computeTypesAlloweds = Output.empty();
        this.maximumBuildsAllowed = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectBuildBatchConfigRestrictionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> computeTypesAlloweds;
        private @Nullable Output<Integer> maximumBuildsAllowed;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectBuildBatchConfigRestrictionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeTypesAlloweds = defaults.computeTypesAlloweds;
    	      this.maximumBuildsAllowed = defaults.maximumBuildsAllowed;
        }

        public Builder computeTypesAlloweds(@Nullable Output<List<String>> computeTypesAlloweds) {
            this.computeTypesAlloweds = computeTypesAlloweds;
            return this;
        }

        public Builder computeTypesAlloweds(@Nullable List<String> computeTypesAlloweds) {
            this.computeTypesAlloweds = Output.ofNullable(computeTypesAlloweds);
            return this;
        }

        public Builder maximumBuildsAllowed(@Nullable Output<Integer> maximumBuildsAllowed) {
            this.maximumBuildsAllowed = maximumBuildsAllowed;
            return this;
        }

        public Builder maximumBuildsAllowed(@Nullable Integer maximumBuildsAllowed) {
            this.maximumBuildsAllowed = Output.ofNullable(maximumBuildsAllowed);
            return this;
        }
        public ProjectBuildBatchConfigRestrictionsGetArgs build() {
            return new ProjectBuildBatchConfigRestrictionsGetArgs(computeTypesAlloweds, maximumBuildsAllowed);
        }
    }
}
