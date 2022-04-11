// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualGatewayState extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewayState Empty = new VirtualGatewayState();

    /**
     * The ARN of the virtual gateway.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The creation date of the virtual gateway.
     * 
     */
    @Import(name="createdDate")
      private final @Nullable Output<String> createdDate;

    public Output<String> getCreatedDate() {
        return this.createdDate == null ? Codegen.empty() : this.createdDate;
    }

    /**
     * The last update date of the virtual gateway.
     * 
     */
    @Import(name="lastUpdatedDate")
      private final @Nullable Output<String> lastUpdatedDate;

    public Output<String> getLastUpdatedDate() {
        return this.lastUpdatedDate == null ? Codegen.empty() : this.lastUpdatedDate;
    }

    /**
     * The name of the service mesh in which to create the virtual gateway. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="meshName")
      private final @Nullable Output<String> meshName;

    public Output<String> getMeshName() {
        return this.meshName == null ? Codegen.empty() : this.meshName;
    }

    /**
     * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
     * 
     */
    @Import(name="meshOwner")
      private final @Nullable Output<String> meshOwner;

    public Output<String> getMeshOwner() {
        return this.meshOwner == null ? Codegen.empty() : this.meshOwner;
    }

    /**
     * The name to use for the virtual gateway. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The resource owner's AWS account ID.
     * 
     */
    @Import(name="resourceOwner")
      private final @Nullable Output<String> resourceOwner;

    public Output<String> getResourceOwner() {
        return this.resourceOwner == null ? Codegen.empty() : this.resourceOwner;
    }

    /**
     * The virtual gateway specification to apply.
     * 
     */
    @Import(name="spec")
      private final @Nullable Output<VirtualGatewaySpecGetArgs> spec;

    public Output<VirtualGatewaySpecGetArgs> getSpec() {
        return this.spec == null ? Codegen.empty() : this.spec;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public VirtualGatewayState(
        @Nullable Output<String> arn,
        @Nullable Output<String> createdDate,
        @Nullable Output<String> lastUpdatedDate,
        @Nullable Output<String> meshName,
        @Nullable Output<String> meshOwner,
        @Nullable Output<String> name,
        @Nullable Output<String> resourceOwner,
        @Nullable Output<VirtualGatewaySpecGetArgs> spec,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.createdDate = createdDate;
        this.lastUpdatedDate = lastUpdatedDate;
        this.meshName = meshName;
        this.meshOwner = meshOwner;
        this.name = name;
        this.resourceOwner = resourceOwner;
        this.spec = spec;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private VirtualGatewayState() {
        this.arn = Codegen.empty();
        this.createdDate = Codegen.empty();
        this.lastUpdatedDate = Codegen.empty();
        this.meshName = Codegen.empty();
        this.meshOwner = Codegen.empty();
        this.name = Codegen.empty();
        this.resourceOwner = Codegen.empty();
        this.spec = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewayState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> createdDate;
        private @Nullable Output<String> lastUpdatedDate;
        private @Nullable Output<String> meshName;
        private @Nullable Output<String> meshOwner;
        private @Nullable Output<String> name;
        private @Nullable Output<String> resourceOwner;
        private @Nullable Output<VirtualGatewaySpecGetArgs> spec;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewayState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdDate = defaults.createdDate;
    	      this.lastUpdatedDate = defaults.lastUpdatedDate;
    	      this.meshName = defaults.meshName;
    	      this.meshOwner = defaults.meshOwner;
    	      this.name = defaults.name;
    	      this.resourceOwner = defaults.resourceOwner;
    	      this.spec = defaults.spec;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder createdDate(@Nullable Output<String> createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public Builder createdDate(@Nullable String createdDate) {
            this.createdDate = Codegen.ofNullable(createdDate);
            return this;
        }
        public Builder lastUpdatedDate(@Nullable Output<String> lastUpdatedDate) {
            this.lastUpdatedDate = lastUpdatedDate;
            return this;
        }
        public Builder lastUpdatedDate(@Nullable String lastUpdatedDate) {
            this.lastUpdatedDate = Codegen.ofNullable(lastUpdatedDate);
            return this;
        }
        public Builder meshName(@Nullable Output<String> meshName) {
            this.meshName = meshName;
            return this;
        }
        public Builder meshName(@Nullable String meshName) {
            this.meshName = Codegen.ofNullable(meshName);
            return this;
        }
        public Builder meshOwner(@Nullable Output<String> meshOwner) {
            this.meshOwner = meshOwner;
            return this;
        }
        public Builder meshOwner(@Nullable String meshOwner) {
            this.meshOwner = Codegen.ofNullable(meshOwner);
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
        public Builder resourceOwner(@Nullable Output<String> resourceOwner) {
            this.resourceOwner = resourceOwner;
            return this;
        }
        public Builder resourceOwner(@Nullable String resourceOwner) {
            this.resourceOwner = Codegen.ofNullable(resourceOwner);
            return this;
        }
        public Builder spec(@Nullable Output<VirtualGatewaySpecGetArgs> spec) {
            this.spec = spec;
            return this;
        }
        public Builder spec(@Nullable VirtualGatewaySpecGetArgs spec) {
            this.spec = Codegen.ofNullable(spec);
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
        }        public VirtualGatewayState build() {
            return new VirtualGatewayState(arn, createdDate, lastUpdatedDate, meshName, meshOwner, name, resourceOwner, spec, tags, tagsAll);
        }
    }
}
