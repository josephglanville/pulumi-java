// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.DistributionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This represents a particular package that is distributed over various channels. e.g. glibc (aka libc6) is distributed by many, at various versions.
 * 
 */
public final class PackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackageArgs Empty = new PackageArgs();

    /**
     * The various channels by which a package is distributed.
     * 
     */
    @Import(name="distribution")
      private final @Nullable Output<List<DistributionArgs>> distribution;

    public Output<List<DistributionArgs>> getDistribution() {
        return this.distribution == null ? Output.empty() : this.distribution;
    }

    /**
     * The name of the package.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public PackageArgs(
        @Nullable Output<List<DistributionArgs>> distribution,
        @Nullable Output<String> name) {
        this.distribution = distribution;
        this.name = name;
    }

    private PackageArgs() {
        this.distribution = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DistributionArgs>> distribution;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distribution = defaults.distribution;
    	      this.name = defaults.name;
        }

        public Builder distribution(@Nullable Output<List<DistributionArgs>> distribution) {
            this.distribution = distribution;
            return this;
        }
        public Builder distribution(@Nullable List<DistributionArgs> distribution) {
            this.distribution = Output.ofNullable(distribution);
            return this;
        }
        public Builder distribution(DistributionArgs... distribution) {
            return distribution(List.of(distribution));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public PackageArgs build() {
            return new PackageArgs(distribution, name);
        }
    }
}
