// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio;

import io.pulumi.awsnative.nimblestudio.inputs.StreamingImageTagsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StreamingImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamingImageArgs Empty = new StreamingImageArgs();

    /**
     * <p>A human-readable description of the streaming image.</p>
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * <p>The ID of an EC2 machine image with which to create this streaming image.</p>
     * 
     */
    @Import(name="ec2ImageId", required=true)
      private final Output<String> ec2ImageId;

    public Output<String> getEc2ImageId() {
        return this.ec2ImageId;
    }

    /**
     * <p>A friendly name for a streaming image resource.</p>
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * <p>The studioId. </p>
     * 
     */
    @Import(name="studioId", required=true)
      private final Output<String> studioId;

    public Output<String> getStudioId() {
        return this.studioId;
    }

    @Import(name="tags")
      private final @Nullable Output<StreamingImageTagsArgs> tags;

    public Output<StreamingImageTagsArgs> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public StreamingImageArgs(
        @Nullable Output<String> description,
        Output<String> ec2ImageId,
        @Nullable Output<String> name,
        Output<String> studioId,
        @Nullable Output<StreamingImageTagsArgs> tags) {
        this.description = description;
        this.ec2ImageId = Objects.requireNonNull(ec2ImageId, "expected parameter 'ec2ImageId' to be non-null");
        this.name = name;
        this.studioId = Objects.requireNonNull(studioId, "expected parameter 'studioId' to be non-null");
        this.tags = tags;
    }

    private StreamingImageArgs() {
        this.description = Output.empty();
        this.ec2ImageId = Output.empty();
        this.name = Output.empty();
        this.studioId = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> ec2ImageId;
        private @Nullable Output<String> name;
        private Output<String> studioId;
        private @Nullable Output<StreamingImageTagsArgs> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.ec2ImageId = defaults.ec2ImageId;
    	      this.name = defaults.name;
    	      this.studioId = defaults.studioId;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder ec2ImageId(Output<String> ec2ImageId) {
            this.ec2ImageId = Objects.requireNonNull(ec2ImageId);
            return this;
        }
        public Builder ec2ImageId(String ec2ImageId) {
            this.ec2ImageId = Output.of(Objects.requireNonNull(ec2ImageId));
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
        public Builder studioId(Output<String> studioId) {
            this.studioId = Objects.requireNonNull(studioId);
            return this;
        }
        public Builder studioId(String studioId) {
            this.studioId = Output.of(Objects.requireNonNull(studioId));
            return this;
        }
        public Builder tags(@Nullable Output<StreamingImageTagsArgs> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable StreamingImageTagsArgs tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public StreamingImageArgs build() {
            return new StreamingImageArgs(description, ec2ImageId, name, studioId, tags);
        }
    }
}
