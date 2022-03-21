// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcsArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcsArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcsArgs();

    /**
     * Required. Bucket of the Cloud Storage object.
     * 
     */
    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }

    /**
     * Generation number of the Cloud Storage object.
     * 
     */
    @Import(name="generation")
      private final @Nullable Output<Integer> generation;

    public Output<Integer> getGeneration() {
        return this.generation == null ? Output.empty() : this.generation;
    }

    /**
     * Required. Name of the Cloud Storage object.
     * 
     */
    @Import(name="object", required=true)
      private final Output<String> object;

    public Output<String> getObject() {
        return this.object;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcsArgs(
        Output<String> bucket,
        @Nullable Output<Integer> generation,
        Output<String> object) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.generation = generation;
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcsArgs() {
        this.bucket = Output.empty();
        this.generation = Output.empty();
        this.object = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;
        private @Nullable Output<Integer> generation;
        private Output<String> object;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.generation = defaults.generation;
    	      this.object = defaults.object;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }
        public Builder generation(@Nullable Output<Integer> generation) {
            this.generation = generation;
            return this;
        }
        public Builder generation(@Nullable Integer generation) {
            this.generation = Output.ofNullable(generation);
            return this;
        }
        public Builder object(Output<String> object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public Builder object(String object) {
            this.object = Output.of(Objects.requireNonNull(object));
            return this;
        }        public OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcsArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcsArgs(bucket, generation, object);
        }
    }
}
