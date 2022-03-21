// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OSPolicyResourceFileGcsResponse {
    /**
     * Bucket of the Cloud Storage object.
     * 
     */
    private final String bucket;
    /**
     * Generation number of the Cloud Storage object.
     * 
     */
    private final String generation;
    /**
     * Name of the Cloud Storage object.
     * 
     */
    private final String object;

    @CustomType.Constructor
    private OSPolicyResourceFileGcsResponse(
        @CustomType.Parameter("bucket") String bucket,
        @CustomType.Parameter("generation") String generation,
        @CustomType.Parameter("object") String object) {
        this.bucket = bucket;
        this.generation = generation;
        this.object = object;
    }

    /**
     * Bucket of the Cloud Storage object.
     * 
    */
    public String getBucket() {
        return this.bucket;
    }
    /**
     * Generation number of the Cloud Storage object.
     * 
    */
    public String getGeneration() {
        return this.generation;
    }
    /**
     * Name of the Cloud Storage object.
     * 
    */
    public String getObject() {
        return this.object;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceFileGcsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String generation;
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceFileGcsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.generation = defaults.generation;
    	      this.object = defaults.object;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder generation(String generation) {
            this.generation = Objects.requireNonNull(generation);
            return this;
        }
        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }        public OSPolicyResourceFileGcsResponse build() {
            return new OSPolicyResourceFileGcsResponse(bucket, generation, object);
        }
    }
}
