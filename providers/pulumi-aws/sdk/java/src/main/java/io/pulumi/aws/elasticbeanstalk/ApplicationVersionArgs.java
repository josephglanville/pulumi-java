// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationVersionArgs Empty = new ApplicationVersionArgs();

    /**
     * Name of the Beanstalk Application the version is associated with.
     * 
     */
    @Import(name="application", required=true)
      private final Output<String> application;

    public Output<String> getApplication() {
        return this.application;
    }

    /**
     * S3 bucket that contains the Application Version source bundle.
     * 
     */
    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }

    /**
     * Short description of the Application Version.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * On delete, force an Application Version to be deleted when it may be in use by multiple Elastic Beanstalk Environments.
     * 
     */
    @Import(name="forceDelete")
      private final @Nullable Output<Boolean> forceDelete;

    public Output<Boolean> getForceDelete() {
        return this.forceDelete == null ? Output.empty() : this.forceDelete;
    }

    /**
     * S3 object that is the Application Version source bundle.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    /**
     * Unique name for the this Application Version.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Key-value map of tags for the Elastic Beanstalk Application Version. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ApplicationVersionArgs(
        Output<String> application,
        Output<String> bucket,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> forceDelete,
        Output<String> key,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags) {
        this.application = Objects.requireNonNull(application, "expected parameter 'application' to be non-null");
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.description = description;
        this.forceDelete = forceDelete;
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.name = name;
        this.tags = tags;
    }

    private ApplicationVersionArgs() {
        this.application = Output.empty();
        this.bucket = Output.empty();
        this.description = Output.empty();
        this.forceDelete = Output.empty();
        this.key = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> application;
        private Output<String> bucket;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> forceDelete;
        private Output<String> key;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.application = defaults.application;
    	      this.bucket = defaults.bucket;
    	      this.description = defaults.description;
    	      this.forceDelete = defaults.forceDelete;
    	      this.key = defaults.key;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder application(Output<String> application) {
            this.application = Objects.requireNonNull(application);
            return this;
        }
        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder forceDelete(@Nullable Output<Boolean> forceDelete) {
            this.forceDelete = forceDelete;
            return this;
        }
        public Builder forceDelete(@Nullable Boolean forceDelete) {
            this.forceDelete = Output.ofNullable(forceDelete);
            return this;
        }
        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public ApplicationVersionArgs build() {
            return new ApplicationVersionArgs(application, bucket, description, forceDelete, key, name, tags);
        }
    }
}