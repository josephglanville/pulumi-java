// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.RetentionDurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Simple policy retention.
 * 
 */
public final class SimpleRetentionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SimpleRetentionPolicyArgs Empty = new SimpleRetentionPolicyArgs();

    /**
     * Retention duration of the protection policy.
     * 
     */
    @InputImport(name="retentionDuration")
      private final @Nullable Output<RetentionDurationArgs> retentionDuration;

    public Output<RetentionDurationArgs> getRetentionDuration() {
        return this.retentionDuration == null ? Output.empty() : this.retentionDuration;
    }

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'SimpleRetentionPolicy'.
     * 
     */
    @InputImport(name="retentionPolicyType", required=true)
      private final Output<String> retentionPolicyType;

    public Output<String> getRetentionPolicyType() {
        return this.retentionPolicyType;
    }

    public SimpleRetentionPolicyArgs(
        @Nullable Output<RetentionDurationArgs> retentionDuration,
        Output<String> retentionPolicyType) {
        this.retentionDuration = retentionDuration;
        this.retentionPolicyType = Objects.requireNonNull(retentionPolicyType, "expected parameter 'retentionPolicyType' to be non-null");
    }

    private SimpleRetentionPolicyArgs() {
        this.retentionDuration = Output.empty();
        this.retentionPolicyType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SimpleRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RetentionDurationArgs> retentionDuration;
        private Output<String> retentionPolicyType;

        public Builder() {
    	      // Empty
        }

        public Builder(SimpleRetentionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retentionDuration = defaults.retentionDuration;
    	      this.retentionPolicyType = defaults.retentionPolicyType;
        }

        public Builder retentionDuration(@Nullable Output<RetentionDurationArgs> retentionDuration) {
            this.retentionDuration = retentionDuration;
            return this;
        }

        public Builder retentionDuration(@Nullable RetentionDurationArgs retentionDuration) {
            this.retentionDuration = Output.ofNullable(retentionDuration);
            return this;
        }

        public Builder retentionPolicyType(Output<String> retentionPolicyType) {
            this.retentionPolicyType = Objects.requireNonNull(retentionPolicyType);
            return this;
        }

        public Builder retentionPolicyType(String retentionPolicyType) {
            this.retentionPolicyType = Output.of(Objects.requireNonNull(retentionPolicyType));
            return this;
        }
        public SimpleRetentionPolicyArgs build() {
            return new SimpleRetentionPolicyArgs(retentionDuration, retentionPolicyType);
        }
    }
}
