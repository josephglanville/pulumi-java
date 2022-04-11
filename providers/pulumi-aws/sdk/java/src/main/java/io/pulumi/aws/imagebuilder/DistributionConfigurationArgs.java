// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder;

import io.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionConfigurationArgs Empty = new DistributionConfigurationArgs();

    /**
     * Description of the container distribution configuration.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * One or more configuration blocks with distribution settings. Detailed below.
     * 
     */
    @Import(name="distributions", required=true)
      private final Output<List<DistributionConfigurationDistributionArgs>> distributions;

    public Output<List<DistributionConfigurationDistributionArgs>> getDistributions() {
        return this.distributions;
    }

    /**
     * Name to apply to the distributed AMI.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Key-value map of resource tags for the distribution configuration. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public DistributionConfigurationArgs(
        @Nullable Output<String> description,
        Output<List<DistributionConfigurationDistributionArgs>> distributions,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags) {
        this.description = description;
        this.distributions = Objects.requireNonNull(distributions, "expected parameter 'distributions' to be non-null");
        this.name = name;
        this.tags = tags;
    }

    private DistributionConfigurationArgs() {
        this.description = Codegen.empty();
        this.distributions = Codegen.empty();
        this.name = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<List<DistributionConfigurationDistributionArgs>> distributions;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.distributions = defaults.distributions;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder distributions(Output<List<DistributionConfigurationDistributionArgs>> distributions) {
            this.distributions = Objects.requireNonNull(distributions);
            return this;
        }
        public Builder distributions(List<DistributionConfigurationDistributionArgs> distributions) {
            this.distributions = Output.of(Objects.requireNonNull(distributions));
            return this;
        }
        public Builder distributions(DistributionConfigurationDistributionArgs... distributions) {
            return distributions(List.of(distributions));
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
        }        public DistributionConfigurationArgs build() {
            return new DistributionConfigurationArgs(description, distributions, name, tags);
        }
    }
}
