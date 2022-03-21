// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness;

import io.pulumi.awsnative.route53recoveryreadiness.inputs.ReadinessCheckTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReadinessCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReadinessCheckArgs Empty = new ReadinessCheckArgs();

    /**
     * Name of the ReadinessCheck to create.
     * 
     */
    @Import(name="readinessCheckName")
      private final @Nullable Output<String> readinessCheckName;

    public Output<String> getReadinessCheckName() {
        return this.readinessCheckName == null ? Output.empty() : this.readinessCheckName;
    }

    /**
     * The name of the resource set to check.
     * 
     */
    @Import(name="resourceSetName")
      private final @Nullable Output<String> resourceSetName;

    public Output<String> getResourceSetName() {
        return this.resourceSetName == null ? Output.empty() : this.resourceSetName;
    }

    /**
     * A collection of tags associated with a resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<ReadinessCheckTagArgs>> tags;

    public Output<List<ReadinessCheckTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ReadinessCheckArgs(
        @Nullable Output<String> readinessCheckName,
        @Nullable Output<String> resourceSetName,
        @Nullable Output<List<ReadinessCheckTagArgs>> tags) {
        this.readinessCheckName = readinessCheckName;
        this.resourceSetName = resourceSetName;
        this.tags = tags;
    }

    private ReadinessCheckArgs() {
        this.readinessCheckName = Output.empty();
        this.resourceSetName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReadinessCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> readinessCheckName;
        private @Nullable Output<String> resourceSetName;
        private @Nullable Output<List<ReadinessCheckTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ReadinessCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.readinessCheckName = defaults.readinessCheckName;
    	      this.resourceSetName = defaults.resourceSetName;
    	      this.tags = defaults.tags;
        }

        public Builder readinessCheckName(@Nullable Output<String> readinessCheckName) {
            this.readinessCheckName = readinessCheckName;
            return this;
        }
        public Builder readinessCheckName(@Nullable String readinessCheckName) {
            this.readinessCheckName = Output.ofNullable(readinessCheckName);
            return this;
        }
        public Builder resourceSetName(@Nullable Output<String> resourceSetName) {
            this.resourceSetName = resourceSetName;
            return this;
        }
        public Builder resourceSetName(@Nullable String resourceSetName) {
            this.resourceSetName = Output.ofNullable(resourceSetName);
            return this;
        }
        public Builder tags(@Nullable Output<List<ReadinessCheckTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<ReadinessCheckTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(ReadinessCheckTagArgs... tags) {
            return tags(List.of(tags));
        }        public ReadinessCheckArgs build() {
            return new ReadinessCheckArgs(readinessCheckName, resourceSetName, tags);
        }
    }
}
