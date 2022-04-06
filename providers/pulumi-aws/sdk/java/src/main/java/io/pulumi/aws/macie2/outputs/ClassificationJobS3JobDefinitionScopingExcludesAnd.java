// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.outputs;

import io.pulumi.aws.macie2.outputs.ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTerm;
import io.pulumi.aws.macie2.outputs.ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTerm;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClassificationJobS3JobDefinitionScopingExcludesAnd {
    /**
     * A property-based condition that defines a property, operator, and one or more values for including or excluding an object from the job.  (documented below)
     * 
     */
    private final @Nullable ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTerm simpleScopeTerm;
    /**
     * A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or excluding an object from the job.  (documented below)
     * 
     */
    private final @Nullable ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTerm tagScopeTerm;

    @CustomType.Constructor
    private ClassificationJobS3JobDefinitionScopingExcludesAnd(
        @CustomType.Parameter("simpleScopeTerm") @Nullable ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTerm simpleScopeTerm,
        @CustomType.Parameter("tagScopeTerm") @Nullable ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTerm tagScopeTerm) {
        this.simpleScopeTerm = simpleScopeTerm;
        this.tagScopeTerm = tagScopeTerm;
    }

    /**
     * A property-based condition that defines a property, operator, and one or more values for including or excluding an object from the job.  (documented below)
     * 
    */
    public Optional<ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTerm> getSimpleScopeTerm() {
        return Optional.ofNullable(this.simpleScopeTerm);
    }
    /**
     * A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or excluding an object from the job.  (documented below)
     * 
    */
    public Optional<ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTerm> getTagScopeTerm() {
        return Optional.ofNullable(this.tagScopeTerm);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionScopingExcludesAnd defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTerm simpleScopeTerm;
        private @Nullable ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTerm tagScopeTerm;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionScopingExcludesAnd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.simpleScopeTerm = defaults.simpleScopeTerm;
    	      this.tagScopeTerm = defaults.tagScopeTerm;
        }

        public Builder simpleScopeTerm(@Nullable ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTerm simpleScopeTerm) {
            this.simpleScopeTerm = simpleScopeTerm;
            return this;
        }
        public Builder tagScopeTerm(@Nullable ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTerm tagScopeTerm) {
            this.tagScopeTerm = tagScopeTerm;
            return this;
        }        public ClassificationJobS3JobDefinitionScopingExcludesAnd build() {
            return new ClassificationJobS3JobDefinitionScopingExcludesAnd(simpleScopeTerm, tagScopeTerm);
        }
    }
}