// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.athena;

import io.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkgroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkgroupArgs Empty = new WorkgroupArgs();

    /**
     * Configuration block with various settings for the workgroup. Documented below.
     * 
     */
    @Import(name="configuration")
      private final @Nullable Output<WorkgroupConfigurationArgs> configuration;

    public Output<WorkgroupConfigurationArgs> getConfiguration() {
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

    public WorkgroupArgs(
        @Nullable Output<WorkgroupConfigurationArgs> configuration,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> forceDestroy,
        @Nullable Output<String> name,
        @Nullable Output<String> state,
        @Nullable Output<Map<String,String>> tags) {
        this.configuration = configuration;
        this.description = description;
        this.forceDestroy = forceDestroy;
        this.name = name;
        this.state = state;
        this.tags = tags;
    }

    private WorkgroupArgs() {
        this.configuration = Output.empty();
        this.description = Output.empty();
        this.forceDestroy = Output.empty();
        this.name = Output.empty();
        this.state = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkgroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WorkgroupConfigurationArgs> configuration;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> forceDestroy;
        private @Nullable Output<String> name;
        private @Nullable Output<String> state;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkgroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.description = defaults.description;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
        }

        public Builder configuration(@Nullable Output<WorkgroupConfigurationArgs> configuration) {
            this.configuration = configuration;
            return this;
        }
        public Builder configuration(@Nullable WorkgroupConfigurationArgs configuration) {
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
        }        public WorkgroupArgs build() {
            return new WorkgroupArgs(configuration, description, forceDestroy, name, state, tags);
        }
    }
}