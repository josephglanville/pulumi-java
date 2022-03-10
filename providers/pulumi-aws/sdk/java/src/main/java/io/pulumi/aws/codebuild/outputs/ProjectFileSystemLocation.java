// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProjectFileSystemLocation {
    /**
     * The name used to access a file system created by Amazon EFS. CodeBuild creates an environment variable by appending the identifier in all capital letters to CODEBUILD\_. For example, if you specify my-efs for identifier, a new environment variable is create named CODEBUILD_MY-EFS.
     * 
     */
    private final @Nullable String identifier;
    /**
     * A string that specifies the location of the file system created by Amazon EFS. Its format is `efs-dns-name:/directory-path`.
     * 
     */
    private final @Nullable String location;
    /**
     * The mount options for a file system created by AWS EFS.
     * 
     */
    private final @Nullable String mountOptions;
    /**
     * The location in the container where you mount the file system.
     * 
     */
    private final @Nullable String mountPoint;
    /**
     * Authorization type to use. The only valid value is `OAUTH`. This data type is deprecated and is no longer accurate or used. Use the `aws.codebuild.SourceCredential` resource instead.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor
    private ProjectFileSystemLocation(
        @OutputCustomType.Parameter("identifier") @Nullable String identifier,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("mountOptions") @Nullable String mountOptions,
        @OutputCustomType.Parameter("mountPoint") @Nullable String mountPoint,
        @OutputCustomType.Parameter("type") @Nullable String type) {
        this.identifier = identifier;
        this.location = location;
        this.mountOptions = mountOptions;
        this.mountPoint = mountPoint;
        this.type = type;
    }

    /**
     * The name used to access a file system created by Amazon EFS. CodeBuild creates an environment variable by appending the identifier in all capital letters to CODEBUILD\_. For example, if you specify my-efs for identifier, a new environment variable is create named CODEBUILD_MY-EFS.
     * 
    */
    public Optional<String> getIdentifier() {
        return Optional.ofNullable(this.identifier);
    }
    /**
     * A string that specifies the location of the file system created by Amazon EFS. Its format is `efs-dns-name:/directory-path`.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The mount options for a file system created by AWS EFS.
     * 
    */
    public Optional<String> getMountOptions() {
        return Optional.ofNullable(this.mountOptions);
    }
    /**
     * The location in the container where you mount the file system.
     * 
    */
    public Optional<String> getMountPoint() {
        return Optional.ofNullable(this.mountPoint);
    }
    /**
     * Authorization type to use. The only valid value is `OAUTH`. This data type is deprecated and is no longer accurate or used. Use the `aws.codebuild.SourceCredential` resource instead.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectFileSystemLocation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String identifier;
        private @Nullable String location;
        private @Nullable String mountOptions;
        private @Nullable String mountPoint;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectFileSystemLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifier = defaults.identifier;
    	      this.location = defaults.location;
    	      this.mountOptions = defaults.mountOptions;
    	      this.mountPoint = defaults.mountPoint;
    	      this.type = defaults.type;
        }

        public Builder setIdentifier(@Nullable String identifier) {
            this.identifier = identifier;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMountOptions(@Nullable String mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        public Builder setMountPoint(@Nullable String mountPoint) {
            this.mountPoint = mountPoint;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ProjectFileSystemLocation build() {
            return new ProjectFileSystemLocation(identifier, location, mountOptions, mountPoint, type);
        }
    }
}
