// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Long term policy schedule.
 * 
 */
public final class LongTermSchedulePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final LongTermSchedulePolicyArgs Empty = new LongTermSchedulePolicyArgs();

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'LongTermSchedulePolicy'.
     * 
     */
    @Import(name="schedulePolicyType", required=true)
      private final Output<String> schedulePolicyType;

    public Output<String> getSchedulePolicyType() {
        return this.schedulePolicyType;
    }

    public LongTermSchedulePolicyArgs(Output<String> schedulePolicyType) {
        this.schedulePolicyType = Objects.requireNonNull(schedulePolicyType, "expected parameter 'schedulePolicyType' to be non-null");
    }

    private LongTermSchedulePolicyArgs() {
        this.schedulePolicyType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LongTermSchedulePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> schedulePolicyType;

        public Builder() {
    	      // Empty
        }

        public Builder(LongTermSchedulePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedulePolicyType = defaults.schedulePolicyType;
        }

        public Builder schedulePolicyType(Output<String> schedulePolicyType) {
            this.schedulePolicyType = Objects.requireNonNull(schedulePolicyType);
            return this;
        }
        public Builder schedulePolicyType(String schedulePolicyType) {
            this.schedulePolicyType = Output.of(Objects.requireNonNull(schedulePolicyType));
            return this;
        }        public LongTermSchedulePolicyArgs build() {
            return new LongTermSchedulePolicyArgs(schedulePolicyType);
        }
    }
}
