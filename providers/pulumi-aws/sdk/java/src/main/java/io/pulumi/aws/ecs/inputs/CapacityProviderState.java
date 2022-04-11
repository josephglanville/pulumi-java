// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CapacityProviderState extends io.pulumi.resources.ResourceArgs {

    public static final CapacityProviderState Empty = new CapacityProviderState();

    /**
     * ARN that identifies the capacity provider.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Configuration block for the provider for the ECS auto scaling group. Detailed below.
     * 
     */
    @Import(name="autoScalingGroupProvider")
      private final @Nullable Output<CapacityProviderAutoScalingGroupProviderGetArgs> autoScalingGroupProvider;

    public Output<CapacityProviderAutoScalingGroupProviderGetArgs> getAutoScalingGroupProvider() {
        return this.autoScalingGroupProvider == null ? Codegen.empty() : this.autoScalingGroupProvider;
    }

    /**
     * Name of the capacity provider.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public CapacityProviderState(
        @Nullable Output<String> arn,
        @Nullable Output<CapacityProviderAutoScalingGroupProviderGetArgs> autoScalingGroupProvider,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.autoScalingGroupProvider = autoScalingGroupProvider;
        this.name = name;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private CapacityProviderState() {
        this.arn = Codegen.empty();
        this.autoScalingGroupProvider = Codegen.empty();
        this.name = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityProviderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<CapacityProviderAutoScalingGroupProviderGetArgs> autoScalingGroupProvider;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityProviderState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.autoScalingGroupProvider = defaults.autoScalingGroupProvider;
    	      this.name = defaults.name;
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
        public Builder autoScalingGroupProvider(@Nullable Output<CapacityProviderAutoScalingGroupProviderGetArgs> autoScalingGroupProvider) {
            this.autoScalingGroupProvider = autoScalingGroupProvider;
            return this;
        }
        public Builder autoScalingGroupProvider(@Nullable CapacityProviderAutoScalingGroupProviderGetArgs autoScalingGroupProvider) {
            this.autoScalingGroupProvider = Codegen.ofNullable(autoScalingGroupProvider);
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
        }        public CapacityProviderState build() {
            return new CapacityProviderState(arn, autoScalingGroupProvider, name, tags, tagsAll);
        }
    }
}
