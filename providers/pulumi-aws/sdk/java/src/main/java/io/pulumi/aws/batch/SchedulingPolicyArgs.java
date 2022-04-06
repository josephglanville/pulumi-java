// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch;

import io.pulumi.aws.batch.inputs.SchedulingPolicyFairSharePolicyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SchedulingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchedulingPolicyArgs Empty = new SchedulingPolicyArgs();

    @Import(name="fairSharePolicy")
      private final @Nullable Output<SchedulingPolicyFairSharePolicyArgs> fairSharePolicy;

    public Output<SchedulingPolicyFairSharePolicyArgs> getFairSharePolicy() {
        return this.fairSharePolicy == null ? Output.empty() : this.fairSharePolicy;
    }

    /**
     * Specifies the name of the scheduling policy.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Key-value map of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public SchedulingPolicyArgs(
        @Nullable Output<SchedulingPolicyFairSharePolicyArgs> fairSharePolicy,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.fairSharePolicy = fairSharePolicy;
        this.name = name;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private SchedulingPolicyArgs() {
        this.fairSharePolicy = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SchedulingPolicyFairSharePolicyArgs> fairSharePolicy;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fairSharePolicy = defaults.fairSharePolicy;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder fairSharePolicy(@Nullable Output<SchedulingPolicyFairSharePolicyArgs> fairSharePolicy) {
            this.fairSharePolicy = fairSharePolicy;
            return this;
        }
        public Builder fairSharePolicy(@Nullable SchedulingPolicyFairSharePolicyArgs fairSharePolicy) {
            this.fairSharePolicy = Output.ofNullable(fairSharePolicy);
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
        }        public SchedulingPolicyArgs build() {
            return new SchedulingPolicyArgs(fairSharePolicy, name, tags, tagsAll);
        }
    }
}