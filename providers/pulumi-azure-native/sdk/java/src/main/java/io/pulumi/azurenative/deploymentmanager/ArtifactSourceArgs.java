// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager;

import io.pulumi.azurenative.deploymentmanager.inputs.SasAuthenticationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ArtifactSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ArtifactSourceArgs Empty = new ArtifactSourceArgs();

    /**
     * The path from the location that the 'authentication' property [say, a SAS URI to the blob container] refers to, to the location of the artifacts. This can be used to differentiate different versions of the artifacts. Or, different types of artifacts like binaries or templates. The location referenced by the authentication property concatenated with this optional artifactRoot path forms the artifact source location where the artifacts are expected to be found.
     * 
     */
    @Import(name="artifactRoot")
      private final @Nullable Output<String> artifactRoot;

    public Output<String> getArtifactRoot() {
        return this.artifactRoot == null ? Codegen.empty() : this.artifactRoot;
    }

    /**
     * The name of the artifact source.
     * 
     */
    @Import(name="artifactSourceName")
      private final @Nullable Output<String> artifactSourceName;

    public Output<String> getArtifactSourceName() {
        return this.artifactSourceName == null ? Codegen.empty() : this.artifactSourceName;
    }

    /**
     * The authentication method to use to access the artifact source.
     * 
     */
    @Import(name="authentication", required=true)
      private final Output<SasAuthenticationArgs> authentication;

    public Output<SasAuthenticationArgs> getAuthentication() {
        return this.authentication;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The type of artifact source used.
     * 
     */
    @Import(name="sourceType", required=true)
      private final Output<String> sourceType;

    public Output<String> getSourceType() {
        return this.sourceType;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ArtifactSourceArgs(
        @Nullable Output<String> artifactRoot,
        @Nullable Output<String> artifactSourceName,
        Output<SasAuthenticationArgs> authentication,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        Output<String> sourceType,
        @Nullable Output<Map<String,String>> tags) {
        this.artifactRoot = artifactRoot;
        this.artifactSourceName = artifactSourceName;
        this.authentication = Objects.requireNonNull(authentication, "expected parameter 'authentication' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sourceType = Objects.requireNonNull(sourceType, "expected parameter 'sourceType' to be non-null");
        this.tags = tags;
    }

    private ArtifactSourceArgs() {
        this.artifactRoot = Codegen.empty();
        this.artifactSourceName = Codegen.empty();
        this.authentication = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sourceType = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArtifactSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> artifactRoot;
        private @Nullable Output<String> artifactSourceName;
        private Output<SasAuthenticationArgs> authentication;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private Output<String> sourceType;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ArtifactSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactRoot = defaults.artifactRoot;
    	      this.artifactSourceName = defaults.artifactSourceName;
    	      this.authentication = defaults.authentication;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sourceType = defaults.sourceType;
    	      this.tags = defaults.tags;
        }

        public Builder artifactRoot(@Nullable Output<String> artifactRoot) {
            this.artifactRoot = artifactRoot;
            return this;
        }
        public Builder artifactRoot(@Nullable String artifactRoot) {
            this.artifactRoot = Codegen.ofNullable(artifactRoot);
            return this;
        }
        public Builder artifactSourceName(@Nullable Output<String> artifactSourceName) {
            this.artifactSourceName = artifactSourceName;
            return this;
        }
        public Builder artifactSourceName(@Nullable String artifactSourceName) {
            this.artifactSourceName = Codegen.ofNullable(artifactSourceName);
            return this;
        }
        public Builder authentication(Output<SasAuthenticationArgs> authentication) {
            this.authentication = Objects.requireNonNull(authentication);
            return this;
        }
        public Builder authentication(SasAuthenticationArgs authentication) {
            this.authentication = Output.of(Objects.requireNonNull(authentication));
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
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder sourceType(Output<String> sourceType) {
            this.sourceType = Objects.requireNonNull(sourceType);
            return this;
        }
        public Builder sourceType(String sourceType) {
            this.sourceType = Output.of(Objects.requireNonNull(sourceType));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ArtifactSourceArgs build() {
            return new ArtifactSourceArgs(artifactRoot, artifactSourceName, authentication, location, resourceGroupName, sourceType, tags);
        }
    }
}
