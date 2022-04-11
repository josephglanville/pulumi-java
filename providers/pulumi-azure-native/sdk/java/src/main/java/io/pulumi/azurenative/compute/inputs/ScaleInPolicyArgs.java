// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.VirtualMachineScaleSetScaleInRules;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a scale-in policy for a virtual machine scale set.
 * 
 */
public final class ScaleInPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScaleInPolicyArgs Empty = new ScaleInPolicyArgs();

    /**
     * The rules to be followed when scaling-in a virtual machine scale set. <br><br> Possible values are: <br><br> **Default** When a virtual machine scale set is scaled in, the scale set will first be balanced across zones if it is a zonal scale set. Then, it will be balanced across Fault Domains as far as possible. Within each Fault Domain, the virtual machines chosen for removal will be the newest ones that are not protected from scale-in. <br><br> **OldestVM** When a virtual machine scale set is being scaled-in, the oldest virtual machines that are not protected from scale-in will be chosen for removal. For zonal virtual machine scale sets, the scale set will first be balanced across zones. Within each zone, the oldest virtual machines that are not protected will be chosen for removal. <br><br> **NewestVM** When a virtual machine scale set is being scaled-in, the newest virtual machines that are not protected from scale-in will be chosen for removal. For zonal virtual machine scale sets, the scale set will first be balanced across zones. Within each zone, the newest virtual machines that are not protected will be chosen for removal. <br><br>
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<Either<String,VirtualMachineScaleSetScaleInRules>>> rules;

    public Output<List<Either<String,VirtualMachineScaleSetScaleInRules>>> getRules() {
        return this.rules == null ? Codegen.empty() : this.rules;
    }

    public ScaleInPolicyArgs(@Nullable Output<List<Either<String,VirtualMachineScaleSetScaleInRules>>> rules) {
        this.rules = rules;
    }

    private ScaleInPolicyArgs() {
        this.rules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleInPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Either<String,VirtualMachineScaleSetScaleInRules>>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleInPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder rules(@Nullable Output<List<Either<String,VirtualMachineScaleSetScaleInRules>>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<Either<String,VirtualMachineScaleSetScaleInRules>> rules) {
            this.rules = Codegen.ofNullable(rules);
            return this;
        }
        public Builder rules(Either<String,VirtualMachineScaleSetScaleInRules>... rules) {
            return rules(List.of(rules));
        }        public ScaleInPolicyArgs build() {
            return new ScaleInPolicyArgs(rules);
        }
    }
}
