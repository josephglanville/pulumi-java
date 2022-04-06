// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoveryreadiness.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReadinessCheckState extends io.pulumi.resources.ResourceArgs {

    public static final ReadinessCheckState Empty = new ReadinessCheckState();

    /**
     * ARN of the readiness_check
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Unique name describing the readiness check.
     * 
     */
    @Import(name="readinessCheckName")
      private final @Nullable Output<String> readinessCheckName;

    public Output<String> getReadinessCheckName() {
        return this.readinessCheckName == null ? Output.empty() : this.readinessCheckName;
    }

    /**
     * Name describing the resource set that will be monitored for readiness.
     * 
     */
    @Import(name="resourceSetName")
      private final @Nullable Output<String> resourceSetName;

    public Output<String> getResourceSetName() {
        return this.resourceSetName == null ? Output.empty() : this.resourceSetName;
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public ReadinessCheckState(
        @Nullable Output<String> arn,
        @Nullable Output<String> readinessCheckName,
        @Nullable Output<String> resourceSetName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.readinessCheckName = readinessCheckName;
        this.resourceSetName = resourceSetName;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ReadinessCheckState() {
        this.arn = Output.empty();
        this.readinessCheckName = Output.empty();
        this.resourceSetName = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReadinessCheckState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> readinessCheckName;
        private @Nullable Output<String> resourceSetName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ReadinessCheckState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.readinessCheckName = defaults.readinessCheckName;
    	      this.resourceSetName = defaults.resourceSetName;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
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
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }        public ReadinessCheckState build() {
            return new ReadinessCheckState(arn, readinessCheckName, resourceSetName, tags, tagsAll);
        }
    }
}