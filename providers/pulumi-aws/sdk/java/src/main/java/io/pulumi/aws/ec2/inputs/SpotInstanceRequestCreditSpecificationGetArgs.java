// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotInstanceRequestCreditSpecificationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotInstanceRequestCreditSpecificationGetArgs Empty = new SpotInstanceRequestCreditSpecificationGetArgs();

    /**
     * Credit option for CPU usage. Valid values include `standard` or `unlimited`. T3 instances are launched as unlimited by default. T2 instances are launched as standard by default.
     * 
     */
    @Import(name="cpuCredits")
      private final @Nullable Output<String> cpuCredits;

    public Output<String> getCpuCredits() {
        return this.cpuCredits == null ? Codegen.empty() : this.cpuCredits;
    }

    public SpotInstanceRequestCreditSpecificationGetArgs(@Nullable Output<String> cpuCredits) {
        this.cpuCredits = cpuCredits;
    }

    private SpotInstanceRequestCreditSpecificationGetArgs() {
        this.cpuCredits = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotInstanceRequestCreditSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cpuCredits;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotInstanceRequestCreditSpecificationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCredits = defaults.cpuCredits;
        }

        public Builder cpuCredits(@Nullable Output<String> cpuCredits) {
            this.cpuCredits = cpuCredits;
            return this;
        }
        public Builder cpuCredits(@Nullable String cpuCredits) {
            this.cpuCredits = Codegen.ofNullable(cpuCredits);
            return this;
        }        public SpotInstanceRequestCreditSpecificationGetArgs build() {
            return new SpotInstanceRequestCreditSpecificationGetArgs(cpuCredits);
        }
    }
}
