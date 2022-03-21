// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The policy describes the baseline against which VM instance boot integrity is measured.
 * 
 */
public final class ShieldedVmIntegrityPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ShieldedVmIntegrityPolicyArgs Empty = new ShieldedVmIntegrityPolicyArgs();

    /**
     * Updates the integrity policy baseline using the measurements from the VM instance's most recent boot.
     * 
     */
    @Import(name="updateAutoLearnPolicy")
      private final @Nullable Output<Boolean> updateAutoLearnPolicy;

    public Output<Boolean> getUpdateAutoLearnPolicy() {
        return this.updateAutoLearnPolicy == null ? Output.empty() : this.updateAutoLearnPolicy;
    }

    public ShieldedVmIntegrityPolicyArgs(@Nullable Output<Boolean> updateAutoLearnPolicy) {
        this.updateAutoLearnPolicy = updateAutoLearnPolicy;
    }

    private ShieldedVmIntegrityPolicyArgs() {
        this.updateAutoLearnPolicy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShieldedVmIntegrityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> updateAutoLearnPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ShieldedVmIntegrityPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.updateAutoLearnPolicy = defaults.updateAutoLearnPolicy;
        }

        public Builder updateAutoLearnPolicy(@Nullable Output<Boolean> updateAutoLearnPolicy) {
            this.updateAutoLearnPolicy = updateAutoLearnPolicy;
            return this;
        }
        public Builder updateAutoLearnPolicy(@Nullable Boolean updateAutoLearnPolicy) {
            this.updateAutoLearnPolicy = Output.ofNullable(updateAutoLearnPolicy);
            return this;
        }        public ShieldedVmIntegrityPolicyArgs build() {
            return new ShieldedVmIntegrityPolicyArgs(updateAutoLearnPolicy);
        }
    }
}
