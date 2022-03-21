// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowState extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowState Empty = new WorkflowState();

    /**
     * Amazon Resource Name (ARN) of Glue Workflow
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * A map of default run properties for this workflow. These properties are passed to all jobs associated to the workflow.
     * 
     */
    @Import(name="defaultRunProperties")
      private final @Nullable Output<Map<String,Object>> defaultRunProperties;

    public Output<Map<String,Object>> getDefaultRunProperties() {
        return this.defaultRunProperties == null ? Output.empty() : this.defaultRunProperties;
    }

    /**
     * Description of the workflow.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Prevents exceeding the maximum number of concurrent runs of any of the component jobs. If you leave this parameter blank, there is no limit to the number of concurrent workflow runs.
     * 
     */
    @Import(name="maxConcurrentRuns")
      private final @Nullable Output<Integer> maxConcurrentRuns;

    public Output<Integer> getMaxConcurrentRuns() {
        return this.maxConcurrentRuns == null ? Output.empty() : this.maxConcurrentRuns;
    }

    /**
     * The name you assign to this workflow.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public WorkflowState(
        @Nullable Output<String> arn,
        @Nullable Output<Map<String,Object>> defaultRunProperties,
        @Nullable Output<String> description,
        @Nullable Output<Integer> maxConcurrentRuns,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.defaultRunProperties = defaultRunProperties;
        this.description = description;
        this.maxConcurrentRuns = maxConcurrentRuns;
        this.name = name;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private WorkflowState() {
        this.arn = Output.empty();
        this.defaultRunProperties = Output.empty();
        this.description = Output.empty();
        this.maxConcurrentRuns = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<Map<String,Object>> defaultRunProperties;
        private @Nullable Output<String> description;
        private @Nullable Output<Integer> maxConcurrentRuns;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.defaultRunProperties = defaults.defaultRunProperties;
    	      this.description = defaults.description;
    	      this.maxConcurrentRuns = defaults.maxConcurrentRuns;
    	      this.name = defaults.name;
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
        public Builder defaultRunProperties(@Nullable Output<Map<String,Object>> defaultRunProperties) {
            this.defaultRunProperties = defaultRunProperties;
            return this;
        }
        public Builder defaultRunProperties(@Nullable Map<String,Object> defaultRunProperties) {
            this.defaultRunProperties = Output.ofNullable(defaultRunProperties);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder maxConcurrentRuns(@Nullable Output<Integer> maxConcurrentRuns) {
            this.maxConcurrentRuns = maxConcurrentRuns;
            return this;
        }
        public Builder maxConcurrentRuns(@Nullable Integer maxConcurrentRuns) {
            this.maxConcurrentRuns = Output.ofNullable(maxConcurrentRuns);
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
        }        public WorkflowState build() {
            return new WorkflowState(arn, defaultRunProperties, description, maxConcurrentRuns, name, tags, tagsAll);
        }
    }
}
