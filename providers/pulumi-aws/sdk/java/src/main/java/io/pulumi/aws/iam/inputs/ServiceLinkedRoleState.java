// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceLinkedRoleState extends io.pulumi.resources.ResourceArgs {

    public static final ServiceLinkedRoleState Empty = new ServiceLinkedRoleState();

    /**
     * The Amazon Resource Name (ARN) specifying the role.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
     * 
     */
    @Import(name="awsServiceName")
      private final @Nullable Output<String> awsServiceName;

    public Output<String> getAwsServiceName() {
        return this.awsServiceName == null ? Codegen.empty() : this.awsServiceName;
    }

    /**
     * The creation date of the IAM role.
     * 
     */
    @Import(name="createDate")
      private final @Nullable Output<String> createDate;

    public Output<String> getCreateDate() {
        return this.createDate == null ? Codegen.empty() : this.createDate;
    }

    /**
     * Additional string appended to the role name. Not all AWS services support custom suffixes.
     * 
     */
    @Import(name="customSuffix")
      private final @Nullable Output<String> customSuffix;

    public Output<String> getCustomSuffix() {
        return this.customSuffix == null ? Codegen.empty() : this.customSuffix;
    }

    /**
     * The description of the role.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The name of the role.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The path of the role.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    /**
     * Key-value mapping of tags for the IAM role. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * The stable and unique string identifying the role.
     * 
     */
    @Import(name="uniqueId")
      private final @Nullable Output<String> uniqueId;

    public Output<String> getUniqueId() {
        return this.uniqueId == null ? Codegen.empty() : this.uniqueId;
    }

    public ServiceLinkedRoleState(
        @Nullable Output<String> arn,
        @Nullable Output<String> awsServiceName,
        @Nullable Output<String> createDate,
        @Nullable Output<String> customSuffix,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> path,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> uniqueId) {
        this.arn = arn;
        this.awsServiceName = awsServiceName;
        this.createDate = createDate;
        this.customSuffix = customSuffix;
        this.description = description;
        this.name = name;
        this.path = path;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.uniqueId = uniqueId;
    }

    private ServiceLinkedRoleState() {
        this.arn = Codegen.empty();
        this.awsServiceName = Codegen.empty();
        this.createDate = Codegen.empty();
        this.customSuffix = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.path = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.uniqueId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceLinkedRoleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> awsServiceName;
        private @Nullable Output<String> createDate;
        private @Nullable Output<String> customSuffix;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> path;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> uniqueId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceLinkedRoleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.awsServiceName = defaults.awsServiceName;
    	      this.createDate = defaults.createDate;
    	      this.customSuffix = defaults.customSuffix;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.uniqueId = defaults.uniqueId;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder awsServiceName(@Nullable Output<String> awsServiceName) {
            this.awsServiceName = awsServiceName;
            return this;
        }
        public Builder awsServiceName(@Nullable String awsServiceName) {
            this.awsServiceName = Codegen.ofNullable(awsServiceName);
            return this;
        }
        public Builder createDate(@Nullable Output<String> createDate) {
            this.createDate = createDate;
            return this;
        }
        public Builder createDate(@Nullable String createDate) {
            this.createDate = Codegen.ofNullable(createDate);
            return this;
        }
        public Builder customSuffix(@Nullable Output<String> customSuffix) {
            this.customSuffix = customSuffix;
            return this;
        }
        public Builder customSuffix(@Nullable String customSuffix) {
            this.customSuffix = Codegen.ofNullable(customSuffix);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder uniqueId(@Nullable Output<String> uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public Builder uniqueId(@Nullable String uniqueId) {
            this.uniqueId = Codegen.ofNullable(uniqueId);
            return this;
        }        public ServiceLinkedRoleState build() {
            return new ServiceLinkedRoleState(arn, awsServiceName, createDate, customSuffix, description, name, path, tags, tagsAll, uniqueId);
        }
    }
}
