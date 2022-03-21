// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectSecondaryArtifactGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectSecondaryArtifactGetArgs Empty = new ProjectSecondaryArtifactGetArgs();

    /**
     * Artifact identifier. Must be the same specified inside the AWS CodeBuild build specification.
     * 
     */
    @Import(name="artifactIdentifier", required=true)
      private final Output<String> artifactIdentifier;

    public Output<String> getArtifactIdentifier() {
        return this.artifactIdentifier;
    }

    /**
     * Specifies the bucket owner's access for objects that another account uploads to their Amazon S3 bucket. By default, only the account that uploads the objects to the bucket has access to these objects. This property allows you to give the bucket owner access to these objects. Valid values are `NONE`, `READ_ONLY`, and `FULL`. your CodeBuild service role must have the `s3:PutBucketAcl` permission. This permission allows CodeBuild to modify the access control list for the bucket.
     * 
     */
    @Import(name="bucketOwnerAccess")
      private final @Nullable Output<String> bucketOwnerAccess;

    public Output<String> getBucketOwnerAccess() {
        return this.bucketOwnerAccess == null ? Output.empty() : this.bucketOwnerAccess;
    }

    /**
     * Whether to disable encrypting output artifacts. If `type` is set to `NO_ARTIFACTS`, this value is ignored. Defaults to `false`.
     * 
     */
    @Import(name="encryptionDisabled")
      private final @Nullable Output<Boolean> encryptionDisabled;

    public Output<Boolean> getEncryptionDisabled() {
        return this.encryptionDisabled == null ? Output.empty() : this.encryptionDisabled;
    }

    /**
     * Location of the source code from git or s3.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Namespace to use in storing build artifacts. If `type` is set to `S3`, then valid values are `BUILD_ID` or `NONE`.
     * 
     */
    @Import(name="namespaceType")
      private final @Nullable Output<String> namespaceType;

    public Output<String> getNamespaceType() {
        return this.namespaceType == null ? Output.empty() : this.namespaceType;
    }

    /**
     * Whether a name specified in the build specification overrides the artifact name.
     * 
     */
    @Import(name="overrideArtifactName")
      private final @Nullable Output<Boolean> overrideArtifactName;

    public Output<Boolean> getOverrideArtifactName() {
        return this.overrideArtifactName == null ? Output.empty() : this.overrideArtifactName;
    }

    /**
     * Type of build output artifact to create. If `type` is set to `S3`, valid values are `NONE`, `ZIP`
     * 
     */
    @Import(name="packaging")
      private final @Nullable Output<String> packaging;

    public Output<String> getPackaging() {
        return this.packaging == null ? Output.empty() : this.packaging;
    }

    /**
     * If `type` is set to `S3`, this is the path to the output artifact.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Output.empty() : this.path;
    }

    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ProjectSecondaryArtifactGetArgs(
        Output<String> artifactIdentifier,
        @Nullable Output<String> bucketOwnerAccess,
        @Nullable Output<Boolean> encryptionDisabled,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> namespaceType,
        @Nullable Output<Boolean> overrideArtifactName,
        @Nullable Output<String> packaging,
        @Nullable Output<String> path,
        Output<String> type) {
        this.artifactIdentifier = Objects.requireNonNull(artifactIdentifier, "expected parameter 'artifactIdentifier' to be non-null");
        this.bucketOwnerAccess = bucketOwnerAccess;
        this.encryptionDisabled = encryptionDisabled;
        this.location = location;
        this.name = name;
        this.namespaceType = namespaceType;
        this.overrideArtifactName = overrideArtifactName;
        this.packaging = packaging;
        this.path = path;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ProjectSecondaryArtifactGetArgs() {
        this.artifactIdentifier = Output.empty();
        this.bucketOwnerAccess = Output.empty();
        this.encryptionDisabled = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.namespaceType = Output.empty();
        this.overrideArtifactName = Output.empty();
        this.packaging = Output.empty();
        this.path = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSecondaryArtifactGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> artifactIdentifier;
        private @Nullable Output<String> bucketOwnerAccess;
        private @Nullable Output<Boolean> encryptionDisabled;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namespaceType;
        private @Nullable Output<Boolean> overrideArtifactName;
        private @Nullable Output<String> packaging;
        private @Nullable Output<String> path;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectSecondaryArtifactGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactIdentifier = defaults.artifactIdentifier;
    	      this.bucketOwnerAccess = defaults.bucketOwnerAccess;
    	      this.encryptionDisabled = defaults.encryptionDisabled;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.namespaceType = defaults.namespaceType;
    	      this.overrideArtifactName = defaults.overrideArtifactName;
    	      this.packaging = defaults.packaging;
    	      this.path = defaults.path;
    	      this.type = defaults.type;
        }

        public Builder artifactIdentifier(Output<String> artifactIdentifier) {
            this.artifactIdentifier = Objects.requireNonNull(artifactIdentifier);
            return this;
        }
        public Builder artifactIdentifier(String artifactIdentifier) {
            this.artifactIdentifier = Output.of(Objects.requireNonNull(artifactIdentifier));
            return this;
        }
        public Builder bucketOwnerAccess(@Nullable Output<String> bucketOwnerAccess) {
            this.bucketOwnerAccess = bucketOwnerAccess;
            return this;
        }
        public Builder bucketOwnerAccess(@Nullable String bucketOwnerAccess) {
            this.bucketOwnerAccess = Output.ofNullable(bucketOwnerAccess);
            return this;
        }
        public Builder encryptionDisabled(@Nullable Output<Boolean> encryptionDisabled) {
            this.encryptionDisabled = encryptionDisabled;
            return this;
        }
        public Builder encryptionDisabled(@Nullable Boolean encryptionDisabled) {
            this.encryptionDisabled = Output.ofNullable(encryptionDisabled);
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
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder namespaceType(@Nullable Output<String> namespaceType) {
            this.namespaceType = namespaceType;
            return this;
        }
        public Builder namespaceType(@Nullable String namespaceType) {
            this.namespaceType = Output.ofNullable(namespaceType);
            return this;
        }
        public Builder overrideArtifactName(@Nullable Output<Boolean> overrideArtifactName) {
            this.overrideArtifactName = overrideArtifactName;
            return this;
        }
        public Builder overrideArtifactName(@Nullable Boolean overrideArtifactName) {
            this.overrideArtifactName = Output.ofNullable(overrideArtifactName);
            return this;
        }
        public Builder packaging(@Nullable Output<String> packaging) {
            this.packaging = packaging;
            return this;
        }
        public Builder packaging(@Nullable String packaging) {
            this.packaging = Output.ofNullable(packaging);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Output.ofNullable(path);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public ProjectSecondaryArtifactGetArgs build() {
            return new ProjectSecondaryArtifactGetArgs(artifactIdentifier, bucketOwnerAccess, encryptionDisabled, location, name, namespaceType, overrideArtifactName, packaging, path, type);
        }
    }
}
