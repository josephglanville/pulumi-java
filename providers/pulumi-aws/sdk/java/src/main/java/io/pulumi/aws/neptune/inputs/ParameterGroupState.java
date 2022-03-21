// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.neptune.inputs;

import io.pulumi.aws.neptune.inputs.ParameterGroupParameterGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ParameterGroupState extends io.pulumi.resources.ResourceArgs {

    public static final ParameterGroupState Empty = new ParameterGroupState();

    /**
     * The Neptune parameter group Amazon Resource Name (ARN).
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The description of the Neptune parameter group. Defaults to "Managed by Pulumi".
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The family of the Neptune parameter group.
     * 
     */
    @Import(name="family")
      private final @Nullable Output<String> family;

    public Output<String> getFamily() {
        return this.family == null ? Output.empty() : this.family;
    }

    /**
     * The name of the Neptune parameter.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A list of Neptune parameters to apply.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<List<ParameterGroupParameterGetArgs>> parameters;

    public Output<List<ParameterGroupParameterGetArgs>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    public ParameterGroupState(
        @Nullable Output<String> arn,
        @Nullable Output<String> description,
        @Nullable Output<String> family,
        @Nullable Output<String> name,
        @Nullable Output<List<ParameterGroupParameterGetArgs>> parameters,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.description = description;
        this.family = family;
        this.name = name;
        this.parameters = parameters;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ParameterGroupState() {
        this.arn = Output.empty();
        this.description = Output.empty();
        this.family = Output.empty();
        this.name = Output.empty();
        this.parameters = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> description;
        private @Nullable Output<String> family;
        private @Nullable Output<String> name;
        private @Nullable Output<List<ParameterGroupParameterGetArgs>> parameters;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
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
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder family(@Nullable Output<String> family) {
            this.family = family;
            return this;
        }
        public Builder family(@Nullable String family) {
            this.family = Output.ofNullable(family);
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
        public Builder parameters(@Nullable Output<List<ParameterGroupParameterGetArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable List<ParameterGroupParameterGetArgs> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }
        public Builder parameters(ParameterGroupParameterGetArgs... parameters) {
            return parameters(List.of(parameters));
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
        }        public ParameterGroupState build() {
            return new ParameterGroupState(arn, description, family, name, parameters, tags, tagsAll);
        }
    }
}
