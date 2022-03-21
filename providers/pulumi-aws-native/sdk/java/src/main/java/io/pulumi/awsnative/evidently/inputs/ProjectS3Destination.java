// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectS3Destination extends io.pulumi.resources.InvokeArgs {

    public static final ProjectS3Destination Empty = new ProjectS3Destination();

    @Import(name="bucketName", required=true)
      private final String bucketName;

    public String getBucketName() {
        return this.bucketName;
    }

    @Import(name="prefix")
      private final @Nullable String prefix;

    public Optional<String> getPrefix() {
        return this.prefix == null ? Optional.empty() : Optional.ofNullable(this.prefix);
    }

    public ProjectS3Destination(
        String bucketName,
        @Nullable String prefix) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.prefix = prefix;
    }

    private ProjectS3Destination() {
        this.bucketName = null;
        this.prefix = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectS3Destination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private @Nullable String prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectS3Destination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.prefix = defaults.prefix;
        }

        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }        public ProjectS3Destination build() {
            return new ProjectS3Destination(bucketName, prefix);
        }
    }
}
