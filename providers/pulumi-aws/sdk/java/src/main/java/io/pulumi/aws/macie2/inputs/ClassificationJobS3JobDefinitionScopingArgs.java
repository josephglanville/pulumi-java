// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.inputs;

import io.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingExcludesArgs;
import io.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClassificationJobS3JobDefinitionScopingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClassificationJobS3JobDefinitionScopingArgs Empty = new ClassificationJobS3JobDefinitionScopingArgs();

    /**
     * The property- or tag-based conditions that determine which objects to exclude from the analysis. (documented below)
     * 
     */
    @Import(name="excludes")
      private final @Nullable Output<ClassificationJobS3JobDefinitionScopingExcludesArgs> excludes;

    public Output<ClassificationJobS3JobDefinitionScopingExcludesArgs> getExcludes() {
        return this.excludes == null ? Output.empty() : this.excludes;
    }

    /**
     * The property- or tag-based conditions that determine which objects to include in the analysis. (documented below)
     * 
     */
    @Import(name="includes")
      private final @Nullable Output<ClassificationJobS3JobDefinitionScopingIncludesArgs> includes;

    public Output<ClassificationJobS3JobDefinitionScopingIncludesArgs> getIncludes() {
        return this.includes == null ? Output.empty() : this.includes;
    }

    public ClassificationJobS3JobDefinitionScopingArgs(
        @Nullable Output<ClassificationJobS3JobDefinitionScopingExcludesArgs> excludes,
        @Nullable Output<ClassificationJobS3JobDefinitionScopingIncludesArgs> includes) {
        this.excludes = excludes;
        this.includes = includes;
    }

    private ClassificationJobS3JobDefinitionScopingArgs() {
        this.excludes = Output.empty();
        this.includes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionScopingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ClassificationJobS3JobDefinitionScopingExcludesArgs> excludes;
        private @Nullable Output<ClassificationJobS3JobDefinitionScopingIncludesArgs> includes;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionScopingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludes = defaults.excludes;
    	      this.includes = defaults.includes;
        }

        public Builder excludes(@Nullable Output<ClassificationJobS3JobDefinitionScopingExcludesArgs> excludes) {
            this.excludes = excludes;
            return this;
        }
        public Builder excludes(@Nullable ClassificationJobS3JobDefinitionScopingExcludesArgs excludes) {
            this.excludes = Output.ofNullable(excludes);
            return this;
        }
        public Builder includes(@Nullable Output<ClassificationJobS3JobDefinitionScopingIncludesArgs> includes) {
            this.includes = includes;
            return this;
        }
        public Builder includes(@Nullable ClassificationJobS3JobDefinitionScopingIncludesArgs includes) {
            this.includes = Output.ofNullable(includes);
            return this;
        }        public ClassificationJobS3JobDefinitionScopingArgs build() {
            return new ClassificationJobS3JobDefinitionScopingArgs(excludes, includes);
        }
    }
}
