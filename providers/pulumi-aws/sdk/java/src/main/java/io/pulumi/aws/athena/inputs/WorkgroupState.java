// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.athena.inputs;

import io.pulumi.aws.athena.inputs.WorkgroupConfigurationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkgroupState extends io.pulumi.resources.ResourceArgs {

    public static final WorkgroupState Empty = new WorkgroupState();

    /**
     * Amazon Resource Name (ARN) of the workgroup
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Configuration block with various settings for the workgroup. Documented below.
     * 
     */
    @Import(name="configuration")
      private final @Nullable Output<WorkgroupConfigurationGetArgs> configuration;

    public Output<WorkgroupConfigurationGetArgs> getConfiguration() {
        return this.configuration == null ? Output.empty() : this.configuration;
    }

    /**
     * Description of the workgroup.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
     * 
     */
    @Import(name="forceDestroy")
      private final @Nullable Output<Boolean> forceDestroy;

    public Output<Boolean> getForceDestroy() {
        return this.forceDestroy == null ? Output.empty() : this.forceDestroy;
    }

    /**
     * Name of the workgroup.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * State of the workgroup. Valid values are `DISABLED` or `ENABLED`. Defaults to `ENABLED`.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    /**
     * Key-value map of resource tags for the workgroup. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public WorkgroupState(
        @Nullable Output<String> arn,
        @Nullable Output<WorkgroupConfigurationGetArgs> configuration,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> forceDestroy,
        @Nullable Output<String> name,
        @Nullable Output<String> state,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.configuration = configuration;
        this.description = description;
        this.forceDestroy = forceDestroy;
        this.name = name;
        this.state = state;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private WorkgroupState() {
        this.arn = Output.empty();
        this.configuration = Output.empty();
        this.description = Output.empty();
        this.forceDestroy = Output.empty();
        this.name = Output.empty();
        this.state = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkgroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<WorkgroupConfigurationGetArgs> configuration;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> forceDestroy;
        private @Nullable Output<String> name;
        private @Nullable Output<String> state;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkgroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.configuration = defaults.configuration;
    	      this.description = defaults.description;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
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
        public Builder configuration(@Nullable Output<WorkgroupConfigurationGetArgs> configuration) {
            this.configuration = configuration;
            return this;
        }
        public Builder configuration(@Nullable WorkgroupConfigurationGetArgs configuration) {
            this.configuration = Output.ofNullable(configuration);
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
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }
        public Builder forceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Output.ofNullable(forceDestroy);
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
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Output.ofNullable(state);
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
        }        public WorkgroupState build() {
            return new WorkgroupState(arn, configuration, description, forceDestroy, name, state, tags, tagsAll);
        }
    }
}