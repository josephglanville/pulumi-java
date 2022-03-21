// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionConfigurationState extends io.pulumi.resources.ResourceArgs {

    public static final DistributionConfigurationState Empty = new DistributionConfigurationState();

    /**
     * (Required) Amazon Resource Name (ARN) of the distribution configuration.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Date the distribution configuration was created.
     * 
     */
    @Import(name="dateCreated")
      private final @Nullable Output<String> dateCreated;

    public Output<String> getDateCreated() {
        return this.dateCreated == null ? Output.empty() : this.dateCreated;
    }

    /**
     * Date the distribution configuration was updated.
     * 
     */
    @Import(name="dateUpdated")
      private final @Nullable Output<String> dateUpdated;

    public Output<String> getDateUpdated() {
        return this.dateUpdated == null ? Output.empty() : this.dateUpdated;
    }

    /**
     * Description of the container distribution configuration.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * One or more configuration blocks with distribution settings. Detailed below.
     * 
     */
    @Import(name="distributions")
      private final @Nullable Output<List<DistributionConfigurationDistributionGetArgs>> distributions;

    public Output<List<DistributionConfigurationDistributionGetArgs>> getDistributions() {
        return this.distributions == null ? Output.empty() : this.distributions;
    }

    /**
     * Name to apply to the distributed AMI.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Key-value map of resource tags for the distribution configuration. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    public DistributionConfigurationState(
        @Nullable Output<String> arn,
        @Nullable Output<String> dateCreated,
        @Nullable Output<String> dateUpdated,
        @Nullable Output<String> description,
        @Nullable Output<List<DistributionConfigurationDistributionGetArgs>> distributions,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.description = description;
        this.distributions = distributions;
        this.name = name;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private DistributionConfigurationState() {
        this.arn = Output.empty();
        this.dateCreated = Output.empty();
        this.dateUpdated = Output.empty();
        this.description = Output.empty();
        this.distributions = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> dateCreated;
        private @Nullable Output<String> dateUpdated;
        private @Nullable Output<String> description;
        private @Nullable Output<List<DistributionConfigurationDistributionGetArgs>> distributions;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dateCreated = defaults.dateCreated;
    	      this.dateUpdated = defaults.dateUpdated;
    	      this.description = defaults.description;
    	      this.distributions = defaults.distributions;
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
        public Builder dateCreated(@Nullable Output<String> dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }
        public Builder dateCreated(@Nullable String dateCreated) {
            this.dateCreated = Output.ofNullable(dateCreated);
            return this;
        }
        public Builder dateUpdated(@Nullable Output<String> dateUpdated) {
            this.dateUpdated = dateUpdated;
            return this;
        }
        public Builder dateUpdated(@Nullable String dateUpdated) {
            this.dateUpdated = Output.ofNullable(dateUpdated);
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
        public Builder distributions(@Nullable Output<List<DistributionConfigurationDistributionGetArgs>> distributions) {
            this.distributions = distributions;
            return this;
        }
        public Builder distributions(@Nullable List<DistributionConfigurationDistributionGetArgs> distributions) {
            this.distributions = Output.ofNullable(distributions);
            return this;
        }
        public Builder distributions(DistributionConfigurationDistributionGetArgs... distributions) {
            return distributions(List.of(distributions));
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
        }        public DistributionConfigurationState build() {
            return new DistributionConfigurationState(arn, dateCreated, dateUpdated, description, distributions, name, tags, tagsAll);
        }
    }
}
