// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectFileSystemLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectFileSystemLocationArgs Empty = new ProjectFileSystemLocationArgs();

    /**
     * The name used to access a file system created by Amazon EFS. CodeBuild creates an environment variable by appending the identifier in all capital letters to CODEBUILD\_. For example, if you specify my-efs for identifier, a new environment variable is create named CODEBUILD_MY-EFS.
     * 
     */
    @Import(name="identifier")
      private final @Nullable Output<String> identifier;

    public Output<String> getIdentifier() {
        return this.identifier == null ? Codegen.empty() : this.identifier;
    }

    /**
     * A string that specifies the location of the file system created by Amazon EFS. Its format is `efs-dns-name:/directory-path`.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The mount options for a file system created by AWS EFS.
     * 
     */
    @Import(name="mountOptions")
      private final @Nullable Output<String> mountOptions;

    public Output<String> getMountOptions() {
        return this.mountOptions == null ? Codegen.empty() : this.mountOptions;
    }

    /**
     * The location in the container where you mount the file system.
     * 
     */
    @Import(name="mountPoint")
      private final @Nullable Output<String> mountPoint;

    public Output<String> getMountPoint() {
        return this.mountPoint == null ? Codegen.empty() : this.mountPoint;
    }

    /**
     * Authorization type to use. The only valid value is `OAUTH`. This data type is deprecated and is no longer accurate or used. Use the `aws.codebuild.SourceCredential` resource instead.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public ProjectFileSystemLocationArgs(
        @Nullable Output<String> identifier,
        @Nullable Output<String> location,
        @Nullable Output<String> mountOptions,
        @Nullable Output<String> mountPoint,
        @Nullable Output<String> type) {
        this.identifier = identifier;
        this.location = location;
        this.mountOptions = mountOptions;
        this.mountPoint = mountPoint;
        this.type = type;
    }

    private ProjectFileSystemLocationArgs() {
        this.identifier = Codegen.empty();
        this.location = Codegen.empty();
        this.mountOptions = Codegen.empty();
        this.mountPoint = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectFileSystemLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> identifier;
        private @Nullable Output<String> location;
        private @Nullable Output<String> mountOptions;
        private @Nullable Output<String> mountPoint;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectFileSystemLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifier = defaults.identifier;
    	      this.location = defaults.location;
    	      this.mountOptions = defaults.mountOptions;
    	      this.mountPoint = defaults.mountPoint;
    	      this.type = defaults.type;
        }

        public Builder identifier(@Nullable Output<String> identifier) {
            this.identifier = identifier;
            return this;
        }
        public Builder identifier(@Nullable String identifier) {
            this.identifier = Codegen.ofNullable(identifier);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder mountOptions(@Nullable Output<String> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }
        public Builder mountOptions(@Nullable String mountOptions) {
            this.mountOptions = Codegen.ofNullable(mountOptions);
            return this;
        }
        public Builder mountPoint(@Nullable Output<String> mountPoint) {
            this.mountPoint = mountPoint;
            return this;
        }
        public Builder mountPoint(@Nullable String mountPoint) {
            this.mountPoint = Codegen.ofNullable(mountPoint);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public ProjectFileSystemLocationArgs build() {
            return new ProjectFileSystemLocationArgs(identifier, location, mountOptions, mountPoint, type);
        }
    }
}
