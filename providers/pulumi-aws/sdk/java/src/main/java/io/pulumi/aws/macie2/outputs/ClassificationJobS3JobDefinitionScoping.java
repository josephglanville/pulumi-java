// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.outputs;

import io.pulumi.aws.macie2.outputs.ClassificationJobS3JobDefinitionScopingExcludes;
import io.pulumi.aws.macie2.outputs.ClassificationJobS3JobDefinitionScopingIncludes;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClassificationJobS3JobDefinitionScoping {
    /**
     * The property- or tag-based conditions that determine which objects to exclude from the analysis. (documented below)
     * 
     */
    private final @Nullable ClassificationJobS3JobDefinitionScopingExcludes excludes;
    /**
     * The property- or tag-based conditions that determine which objects to include in the analysis. (documented below)
     * 
     */
    private final @Nullable ClassificationJobS3JobDefinitionScopingIncludes includes;

    @OutputCustomType.Constructor
    private ClassificationJobS3JobDefinitionScoping(
        @OutputCustomType.Parameter("excludes") @Nullable ClassificationJobS3JobDefinitionScopingExcludes excludes,
        @OutputCustomType.Parameter("includes") @Nullable ClassificationJobS3JobDefinitionScopingIncludes includes) {
        this.excludes = excludes;
        this.includes = includes;
    }

    /**
     * The property- or tag-based conditions that determine which objects to exclude from the analysis. (documented below)
     * 
    */
    public Optional<ClassificationJobS3JobDefinitionScopingExcludes> getExcludes() {
        return Optional.ofNullable(this.excludes);
    }
    /**
     * The property- or tag-based conditions that determine which objects to include in the analysis. (documented below)
     * 
    */
    public Optional<ClassificationJobS3JobDefinitionScopingIncludes> getIncludes() {
        return Optional.ofNullable(this.includes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionScoping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClassificationJobS3JobDefinitionScopingExcludes excludes;
        private @Nullable ClassificationJobS3JobDefinitionScopingIncludes includes;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionScoping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludes = defaults.excludes;
    	      this.includes = defaults.includes;
        }

        public Builder setExcludes(@Nullable ClassificationJobS3JobDefinitionScopingExcludes excludes) {
            this.excludes = excludes;
            return this;
        }

        public Builder setIncludes(@Nullable ClassificationJobS3JobDefinitionScopingIncludes includes) {
            this.includes = includes;
            return this;
        }
        public ClassificationJobS3JobDefinitionScoping build() {
            return new ClassificationJobS3JobDefinitionScoping(excludes, includes);
        }
    }
}
