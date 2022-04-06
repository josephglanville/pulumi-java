// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ClassificationJobS3JobDefinitionBucketDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClassificationJobS3JobDefinitionBucketDefinitionArgs Empty = new ClassificationJobS3JobDefinitionBucketDefinitionArgs();

    /**
     * The unique identifier for the AWS account that owns the buckets.
     * 
     */
    @Import(name="accountId", required=true)
      private final Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId;
    }

    /**
     * An array that lists the names of the buckets.
     * 
     */
    @Import(name="buckets", required=true)
      private final Output<List<String>> buckets;

    public Output<List<String>> getBuckets() {
        return this.buckets;
    }

    public ClassificationJobS3JobDefinitionBucketDefinitionArgs(
        Output<String> accountId,
        Output<List<String>> buckets) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.buckets = Objects.requireNonNull(buckets, "expected parameter 'buckets' to be non-null");
    }

    private ClassificationJobS3JobDefinitionBucketDefinitionArgs() {
        this.accountId = Output.empty();
        this.buckets = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionBucketDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountId;
        private Output<List<String>> buckets;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionBucketDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.buckets = defaults.buckets;
        }

        public Builder accountId(Output<String> accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder accountId(String accountId) {
            this.accountId = Output.of(Objects.requireNonNull(accountId));
            return this;
        }
        public Builder buckets(Output<List<String>> buckets) {
            this.buckets = Objects.requireNonNull(buckets);
            return this;
        }
        public Builder buckets(List<String> buckets) {
            this.buckets = Output.of(Objects.requireNonNull(buckets));
            return this;
        }
        public Builder buckets(String... buckets) {
            return buckets(List.of(buckets));
        }        public ClassificationJobS3JobDefinitionBucketDefinitionArgs build() {
            return new ClassificationJobS3JobDefinitionBucketDefinitionArgs(accountId, buckets);
        }
    }
}