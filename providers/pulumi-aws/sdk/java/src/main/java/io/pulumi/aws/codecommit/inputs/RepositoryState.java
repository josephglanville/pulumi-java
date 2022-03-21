// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codecommit.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepositoryState extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryState Empty = new RepositoryState();

    /**
     * The ARN of the repository
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The URL to use for cloning the repository over HTTPS.
     * 
     */
    @Import(name="cloneUrlHttp")
      private final @Nullable Output<String> cloneUrlHttp;

    public Output<String> getCloneUrlHttp() {
        return this.cloneUrlHttp == null ? Output.empty() : this.cloneUrlHttp;
    }

    /**
     * The URL to use for cloning the repository over SSH.
     * 
     */
    @Import(name="cloneUrlSsh")
      private final @Nullable Output<String> cloneUrlSsh;

    public Output<String> getCloneUrlSsh() {
        return this.cloneUrlSsh == null ? Output.empty() : this.cloneUrlSsh;
    }

    /**
     * The default branch of the repository. The branch specified here needs to exist.
     * 
     */
    @Import(name="defaultBranch")
      private final @Nullable Output<String> defaultBranch;

    public Output<String> getDefaultBranch() {
        return this.defaultBranch == null ? Output.empty() : this.defaultBranch;
    }

    /**
     * The description of the repository. This needs to be less than 1000 characters
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The ID of the repository
     * 
     */
    @Import(name="repositoryId")
      private final @Nullable Output<String> repositoryId;

    public Output<String> getRepositoryId() {
        return this.repositoryId == null ? Output.empty() : this.repositoryId;
    }

    /**
     * The name for the repository. This needs to be less than 100 characters.
     * 
     */
    @Import(name="repositoryName")
      private final @Nullable Output<String> repositoryName;

    public Output<String> getRepositoryName() {
        return this.repositoryName == null ? Output.empty() : this.repositoryName;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public RepositoryState(
        @Nullable Output<String> arn,
        @Nullable Output<String> cloneUrlHttp,
        @Nullable Output<String> cloneUrlSsh,
        @Nullable Output<String> defaultBranch,
        @Nullable Output<String> description,
        @Nullable Output<String> repositoryId,
        @Nullable Output<String> repositoryName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.cloneUrlHttp = cloneUrlHttp;
        this.cloneUrlSsh = cloneUrlSsh;
        this.defaultBranch = defaultBranch;
        this.description = description;
        this.repositoryId = repositoryId;
        this.repositoryName = repositoryName;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private RepositoryState() {
        this.arn = Output.empty();
        this.cloneUrlHttp = Output.empty();
        this.cloneUrlSsh = Output.empty();
        this.defaultBranch = Output.empty();
        this.description = Output.empty();
        this.repositoryId = Output.empty();
        this.repositoryName = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> cloneUrlHttp;
        private @Nullable Output<String> cloneUrlSsh;
        private @Nullable Output<String> defaultBranch;
        private @Nullable Output<String> description;
        private @Nullable Output<String> repositoryId;
        private @Nullable Output<String> repositoryName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.cloneUrlHttp = defaults.cloneUrlHttp;
    	      this.cloneUrlSsh = defaults.cloneUrlSsh;
    	      this.defaultBranch = defaults.defaultBranch;
    	      this.description = defaults.description;
    	      this.repositoryId = defaults.repositoryId;
    	      this.repositoryName = defaults.repositoryName;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder cloneUrlHttp(@Nullable Output<String> cloneUrlHttp) {
            this.cloneUrlHttp = cloneUrlHttp;
            return this;
        }
        public Builder cloneUrlHttp(@Nullable String cloneUrlHttp) {
            this.cloneUrlHttp = Output.ofNullable(cloneUrlHttp);
            return this;
        }
        public Builder cloneUrlSsh(@Nullable Output<String> cloneUrlSsh) {
            this.cloneUrlSsh = cloneUrlSsh;
            return this;
        }
        public Builder cloneUrlSsh(@Nullable String cloneUrlSsh) {
            this.cloneUrlSsh = Output.ofNullable(cloneUrlSsh);
            return this;
        }
        public Builder defaultBranch(@Nullable Output<String> defaultBranch) {
            this.defaultBranch = defaultBranch;
            return this;
        }
        public Builder defaultBranch(@Nullable String defaultBranch) {
            this.defaultBranch = Output.ofNullable(defaultBranch);
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
        public Builder repositoryId(@Nullable Output<String> repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }
        public Builder repositoryId(@Nullable String repositoryId) {
            this.repositoryId = Output.ofNullable(repositoryId);
            return this;
        }
        public Builder repositoryName(@Nullable Output<String> repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }
        public Builder repositoryName(@Nullable String repositoryName) {
            this.repositoryName = Output.ofNullable(repositoryName);
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
        }        public RepositoryState build() {
            return new RepositoryState(arn, cloneUrlHttp, cloneUrlSsh, defaultBranch, description, repositoryId, repositoryName, tags, tagsAll);
        }
    }
}
