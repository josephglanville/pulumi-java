// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationVersionState extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationVersionState Empty = new ApplicationVersionState();

    /**
     * Name of the Beanstalk Application the version is associated with.
     * 
     */
    @Import(name="application")
      private final @Nullable Output<String> application;

    public Output<String> getApplication() {
        return this.application == null ? Output.empty() : this.application;
    }

    /**
     * ARN assigned by AWS for this Elastic Beanstalk Application.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * S3 bucket that contains the Application Version source bundle.
     * 
     */
    @Import(name="bucket")
      private final @Nullable Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket == null ? Output.empty() : this.bucket;
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
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Output.empty() : this.key;
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

    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public ApplicationVersionState(
        @Nullable Output<String> application,
        @Nullable Output<String> arn,
        @Nullable Output<String> bucket,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> forceDelete,
        @Nullable Output<String> key,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.application = application;
        this.arn = arn;
        this.bucket = bucket;
        this.description = description;
        this.forceDelete = forceDelete;
        this.key = key;
        this.name = name;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ApplicationVersionState() {
        this.application = Output.empty();
        this.arn = Output.empty();
        this.bucket = Output.empty();
        this.description = Output.empty();
        this.forceDelete = Output.empty();
        this.key = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationVersionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> application;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> bucket;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> forceDelete;
        private @Nullable Output<String> key;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationVersionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.application = defaults.application;
    	      this.arn = defaults.arn;
    	      this.bucket = defaults.bucket;
    	      this.description = defaults.description;
    	      this.forceDelete = defaults.forceDelete;
    	      this.key = defaults.key;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder application(@Nullable Output<String> application) {
            this.application = application;
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder bucket(@Nullable Output<String> bucket) {
            this.bucket = bucket;
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
        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Output.ofNullable(key);
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
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }        public ApplicationVersionState build() {
            return new ApplicationVersionState(application, arn, bucket, description, forceDelete, key, name, tags, tagsAll);
        }
    }
}
