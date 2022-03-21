// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.outputs;

import io.pulumi.aws.macie2.outputs.ClassificationJobS3JobDefinitionBucketDefinition;
import io.pulumi.aws.macie2.outputs.ClassificationJobS3JobDefinitionScoping;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClassificationJobS3JobDefinition {
    /**
     * An array of objects, one for each AWS account that owns buckets to analyze. Each object specifies the account ID for an account and one or more buckets to analyze for the account. (documented below)
     * 
     */
    private final @Nullable List<ClassificationJobS3JobDefinitionBucketDefinition> bucketDefinitions;
    /**
     * The property- and tag-based conditions that determine which objects to include or exclude from the analysis. (documented below)
     * 
     */
    private final @Nullable ClassificationJobS3JobDefinitionScoping scoping;

    @CustomType.Constructor
    private ClassificationJobS3JobDefinition(
        @CustomType.Parameter("bucketDefinitions") @Nullable List<ClassificationJobS3JobDefinitionBucketDefinition> bucketDefinitions,
        @CustomType.Parameter("scoping") @Nullable ClassificationJobS3JobDefinitionScoping scoping) {
        this.bucketDefinitions = bucketDefinitions;
        this.scoping = scoping;
    }

    /**
     * An array of objects, one for each AWS account that owns buckets to analyze. Each object specifies the account ID for an account and one or more buckets to analyze for the account. (documented below)
     * 
    */
    public List<ClassificationJobS3JobDefinitionBucketDefinition> getBucketDefinitions() {
        return this.bucketDefinitions == null ? List.of() : this.bucketDefinitions;
    }
    /**
     * The property- and tag-based conditions that determine which objects to include or exclude from the analysis. (documented below)
     * 
    */
    public Optional<ClassificationJobS3JobDefinitionScoping> getScoping() {
        return Optional.ofNullable(this.scoping);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ClassificationJobS3JobDefinitionBucketDefinition> bucketDefinitions;
        private @Nullable ClassificationJobS3JobDefinitionScoping scoping;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketDefinitions = defaults.bucketDefinitions;
    	      this.scoping = defaults.scoping;
        }

        public Builder bucketDefinitions(@Nullable List<ClassificationJobS3JobDefinitionBucketDefinition> bucketDefinitions) {
            this.bucketDefinitions = bucketDefinitions;
            return this;
        }
        public Builder bucketDefinitions(ClassificationJobS3JobDefinitionBucketDefinition... bucketDefinitions) {
            return bucketDefinitions(List.of(bucketDefinitions));
        }
        public Builder scoping(@Nullable ClassificationJobS3JobDefinitionScoping scoping) {
            this.scoping = scoping;
            return this;
        }        public ClassificationJobS3JobDefinition build() {
            return new ClassificationJobS3JobDefinition(bucketDefinitions, scoping);
        }
    }
}
