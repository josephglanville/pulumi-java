// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder;

import io.pulumi.awsnative.imagebuilder.inputs.DistributionConfigurationDistributionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionConfigurationArgs Empty = new DistributionConfigurationArgs();

    /**
     * The description of the distribution configuration.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The distributions of the distribution configuration.
     * 
     */
    @Import(name="distributions", required=true)
      private final Output<List<DistributionConfigurationDistributionArgs>> distributions;

    public Output<List<DistributionConfigurationDistributionArgs>> getDistributions() {
        return this.distributions;
    }

    /**
     * The name of the distribution configuration.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The tags associated with the component.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Object> tags;

    public Output<Object> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public DistributionConfigurationArgs(
        @Nullable Output<String> description,
        Output<List<DistributionConfigurationDistributionArgs>> distributions,
        @Nullable Output<String> name,
        @Nullable Output<Object> tags) {
        this.description = description;
        this.distributions = Objects.requireNonNull(distributions, "expected parameter 'distributions' to be non-null");
        this.name = name;
        this.tags = tags;
    }

    private DistributionConfigurationArgs() {
        this.description = Output.empty();
        this.distributions = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
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
        private @Nullable Output<Object> tags;

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
            this.description = Output.ofNullable(description);
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
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<Object> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Object tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public DistributionConfigurationArgs build() {
            return new DistributionConfigurationArgs(description, distributions, name, tags);
        }
    }
}
