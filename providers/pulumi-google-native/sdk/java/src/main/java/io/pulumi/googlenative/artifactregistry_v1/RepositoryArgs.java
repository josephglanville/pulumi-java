// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.artifactregistry_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.artifactregistry_v1.enums.RepositoryFormat;
import io.pulumi.googlenative.artifactregistry_v1.inputs.MavenRepositoryConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryArgs Empty = new RepositoryArgs();

    /**
     * The time when the repository was created.
     * 
     */
    @InputImport(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime == null ? Output.empty() : this.createTime;
    }

    /**
     * The user-provided description of the repository.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The format of packages that are stored in the repository.
     * 
     */
    @InputImport(name="format")
      private final @Nullable Output<RepositoryFormat> format;

    public Output<RepositoryFormat> getFormat() {
        return this.format == null ? Output.empty() : this.format;
    }

    /**
     * The Cloud KMS resource name of the customer managed encryption key that’s used to encrypt the contents of the Repository. Has the form: `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`. This value may not be changed after the Repository has been created.
     * 
     */
    @InputImport(name="kmsKeyName")
      private final @Nullable Output<String> kmsKeyName;

    public Output<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Output.empty() : this.kmsKeyName;
    }

    /**
     * Labels with user-defined metadata. This field may contain up to 64 entries. Label keys and values may be no longer than 63 characters. Label keys must begin with a lowercase letter and may only contain lowercase letters, numeric characters, underscores, and dashes.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    @InputImport(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Maven repository config contains repository level configuration for the repositories of maven type.
     * 
     */
    @InputImport(name="mavenConfig")
      private final @Nullable Output<MavenRepositoryConfigArgs> mavenConfig;

    public Output<MavenRepositoryConfigArgs> getMavenConfig() {
        return this.mavenConfig == null ? Output.empty() : this.mavenConfig;
    }

    /**
     * The name of the repository, for example: "projects/p1/locations/us-central1/repositories/repo1".
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @InputImport(name="repositoryId")
      private final @Nullable Output<String> repositoryId;

    public Output<String> getRepositoryId() {
        return this.repositoryId == null ? Output.empty() : this.repositoryId;
    }

    /**
     * The time when the repository was last updated.
     * 
     */
    @InputImport(name="updateTime")
      private final @Nullable Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime == null ? Output.empty() : this.updateTime;
    }

    public RepositoryArgs(
        @Nullable Output<String> createTime,
        @Nullable Output<String> description,
        @Nullable Output<RepositoryFormat> format,
        @Nullable Output<String> kmsKeyName,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<MavenRepositoryConfigArgs> mavenConfig,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> repositoryId,
        @Nullable Output<String> updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.format = format;
        this.kmsKeyName = kmsKeyName;
        this.labels = labels;
        this.location = location;
        this.mavenConfig = mavenConfig;
        this.name = name;
        this.project = project;
        this.repositoryId = repositoryId;
        this.updateTime = updateTime;
    }

    private RepositoryArgs() {
        this.createTime = Output.empty();
        this.description = Output.empty();
        this.format = Output.empty();
        this.kmsKeyName = Output.empty();
        this.labels = Output.empty();
        this.location = Output.empty();
        this.mavenConfig = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.repositoryId = Output.empty();
        this.updateTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> description;
        private @Nullable Output<RepositoryFormat> format;
        private @Nullable Output<String> kmsKeyName;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<MavenRepositoryConfigArgs> mavenConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> repositoryId;
        private @Nullable Output<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.format = defaults.format;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.mavenConfig = defaults.mavenConfig;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.repositoryId = defaults.repositoryId;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder createTime(@Nullable String createTime) {
            this.createTime = Output.ofNullable(createTime);
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

        public Builder format(@Nullable Output<RepositoryFormat> format) {
            this.format = format;
            return this;
        }

        public Builder format(@Nullable RepositoryFormat format) {
            this.format = Output.ofNullable(format);
            return this;
        }

        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }

        public Builder kmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Output.ofNullable(kmsKeyName);
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder mavenConfig(@Nullable Output<MavenRepositoryConfigArgs> mavenConfig) {
            this.mavenConfig = mavenConfig;
            return this;
        }

        public Builder mavenConfig(@Nullable MavenRepositoryConfigArgs mavenConfig) {
            this.mavenConfig = Output.ofNullable(mavenConfig);
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

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
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

        public Builder updateTime(@Nullable Output<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Output.ofNullable(updateTime);
            return this;
        }
        public RepositoryArgs build() {
            return new RepositoryArgs(createTime, description, format, kmsKeyName, labels, location, mavenConfig, name, project, repositoryId, updateTime);
        }
    }
}
