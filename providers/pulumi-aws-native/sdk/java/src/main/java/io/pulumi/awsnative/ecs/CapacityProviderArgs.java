// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs;

import io.pulumi.awsnative.ecs.inputs.CapacityProviderAutoScalingGroupProviderArgs;
import io.pulumi.awsnative.ecs.inputs.CapacityProviderTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CapacityProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final CapacityProviderArgs Empty = new CapacityProviderArgs();

    @Import(name="autoScalingGroupProvider", required=true)
      private final Output<CapacityProviderAutoScalingGroupProviderArgs> autoScalingGroupProvider;

    public Output<CapacityProviderAutoScalingGroupProviderArgs> getAutoScalingGroupProvider() {
        return this.autoScalingGroupProvider;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="tags")
      private final @Nullable Output<List<CapacityProviderTagArgs>> tags;

    public Output<List<CapacityProviderTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public CapacityProviderArgs(
        Output<CapacityProviderAutoScalingGroupProviderArgs> autoScalingGroupProvider,
        @Nullable Output<String> name,
        @Nullable Output<List<CapacityProviderTagArgs>> tags) {
        this.autoScalingGroupProvider = Objects.requireNonNull(autoScalingGroupProvider, "expected parameter 'autoScalingGroupProvider' to be non-null");
        this.name = name;
        this.tags = tags;
    }

    private CapacityProviderArgs() {
        this.autoScalingGroupProvider = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<CapacityProviderAutoScalingGroupProviderArgs> autoScalingGroupProvider;
        private @Nullable Output<String> name;
        private @Nullable Output<List<CapacityProviderTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScalingGroupProvider = defaults.autoScalingGroupProvider;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder autoScalingGroupProvider(Output<CapacityProviderAutoScalingGroupProviderArgs> autoScalingGroupProvider) {
            this.autoScalingGroupProvider = Objects.requireNonNull(autoScalingGroupProvider);
            return this;
        }
        public Builder autoScalingGroupProvider(CapacityProviderAutoScalingGroupProviderArgs autoScalingGroupProvider) {
            this.autoScalingGroupProvider = Output.of(Objects.requireNonNull(autoScalingGroupProvider));
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
        public Builder tags(@Nullable Output<List<CapacityProviderTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<CapacityProviderTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(CapacityProviderTagArgs... tags) {
            return tags(List.of(tags));
        }        public CapacityProviderArgs build() {
            return new CapacityProviderArgs(autoScalingGroupProvider, name, tags);
        }
    }
}
