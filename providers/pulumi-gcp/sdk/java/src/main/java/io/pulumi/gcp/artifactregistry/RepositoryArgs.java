// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.artifactregistry;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryArgs Empty = new RepositoryArgs();

    /**
     * The user-provided description of the repository.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The format of packages that are stored in the repository. You can only create
     * alpha formats if you are a member of the [alpha user group](https://cloud.google.com/artifact-registry/docs/supported-formats#alpha-access).
     * - DOCKER
     * - MAVEN ([Preview](https://cloud.google.com/products#product-launch-stages))
     * - NPM ([Preview](https://cloud.google.com/products#product-launch-stages))
     * - PYTHON ([Preview](https://cloud.google.com/products#product-launch-stages))
     * - APT ([alpha](https://cloud.google.com/products#product-launch-stages))
     * - YUM ([alpha](https://cloud.google.com/products#product-launch-stages))
     * - HELM ([alpha](https://cloud.google.com/products#product-launch-stages))
     * 
     */
    @InputImport(name="format", required=true)
      private final Input<String> format;

    public Input<String> getFormat() {
        return this.format;
    }

    /**
     * The Cloud KMS resource name of the customer managed encryption key that’s
     * used to encrypt the contents of the Repository. Has the form:
     * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`.
     * This value may not be changed after the Repository has been created.
     * 
     */
    @InputImport(name="kmsKeyName")
      private final @Nullable Input<String> kmsKeyName;

    public Input<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Input.empty() : this.kmsKeyName;
    }

    /**
     * Labels with user-defined metadata.
     * This field may contain up to 64 entries. Label keys and values may be no
     * longer than 63 characters. Label keys must begin with a lowercase letter
     * and may only contain lowercase letters, numeric characters, underscores,
     * and dashes.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The name of the location this repository is located in.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The last part of the repository name, for example:
     * "repo1"
     * 
     */
    @InputImport(name="repositoryId", required=true)
      private final Input<String> repositoryId;

    public Input<String> getRepositoryId() {
        return this.repositoryId;
    }

    public RepositoryArgs(
        @Nullable Input<String> description,
        Input<String> format,
        @Nullable Input<String> kmsKeyName,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> project,
        Input<String> repositoryId) {
        this.description = description;
        this.format = Objects.requireNonNull(format, "expected parameter 'format' to be non-null");
        this.kmsKeyName = kmsKeyName;
        this.labels = labels;
        this.location = location;
        this.project = project;
        this.repositoryId = Objects.requireNonNull(repositoryId, "expected parameter 'repositoryId' to be non-null");
    }

    private RepositoryArgs() {
        this.description = Input.empty();
        this.format = Input.empty();
        this.kmsKeyName = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
        this.repositoryId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> format;
        private @Nullable Input<String> kmsKeyName;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;
        private Input<String> repositoryId;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.format = defaults.format;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.repositoryId = defaults.repositoryId;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFormat(Input<String> format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }

        public Builder setFormat(String format) {
            this.format = Input.of(Objects.requireNonNull(format));
            return this;
        }

        public Builder setKmsKeyName(@Nullable Input<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }

        public Builder setKmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Input.ofNullable(kmsKeyName);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRepositoryId(Input<String> repositoryId) {
            this.repositoryId = Objects.requireNonNull(repositoryId);
            return this;
        }

        public Builder setRepositoryId(String repositoryId) {
            this.repositoryId = Input.of(Objects.requireNonNull(repositoryId));
            return this;
        }
        public RepositoryArgs build() {
            return new RepositoryArgs(description, format, kmsKeyName, labels, location, project, repositoryId);
        }
    }
}
