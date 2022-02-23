// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Additional information on Azure IaaS VM specific backup item.
 * 
 */
public final class AzureIaaSVMProtectedItemExtendedInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureIaaSVMProtectedItemExtendedInfoArgs Empty = new AzureIaaSVMProtectedItemExtendedInfoArgs();

    /**
     * The oldest backup copy available for this backup item.
     * 
     */
    @InputImport(name="oldestRecoveryPoint")
      private final @Nullable Input<String> oldestRecoveryPoint;

    public Input<String> getOldestRecoveryPoint() {
        return this.oldestRecoveryPoint == null ? Input.empty() : this.oldestRecoveryPoint;
    }

    /**
     * Specifies if backup policy associated with the backup item is inconsistent.
     * 
     */
    @InputImport(name="policyInconsistent")
      private final @Nullable Input<Boolean> policyInconsistent;

    public Input<Boolean> getPolicyInconsistent() {
        return this.policyInconsistent == null ? Input.empty() : this.policyInconsistent;
    }

    /**
     * Number of backup copies available for this backup item.
     * 
     */
    @InputImport(name="recoveryPointCount")
      private final @Nullable Input<Integer> recoveryPointCount;

    public Input<Integer> getRecoveryPointCount() {
        return this.recoveryPointCount == null ? Input.empty() : this.recoveryPointCount;
    }

    public AzureIaaSVMProtectedItemExtendedInfoArgs(
        @Nullable Input<String> oldestRecoveryPoint,
        @Nullable Input<Boolean> policyInconsistent,
        @Nullable Input<Integer> recoveryPointCount) {
        this.oldestRecoveryPoint = oldestRecoveryPoint;
        this.policyInconsistent = policyInconsistent;
        this.recoveryPointCount = recoveryPointCount;
    }

    private AzureIaaSVMProtectedItemExtendedInfoArgs() {
        this.oldestRecoveryPoint = Input.empty();
        this.policyInconsistent = Input.empty();
        this.recoveryPointCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureIaaSVMProtectedItemExtendedInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> oldestRecoveryPoint;
        private @Nullable Input<Boolean> policyInconsistent;
        private @Nullable Input<Integer> recoveryPointCount;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureIaaSVMProtectedItemExtendedInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oldestRecoveryPoint = defaults.oldestRecoveryPoint;
    	      this.policyInconsistent = defaults.policyInconsistent;
    	      this.recoveryPointCount = defaults.recoveryPointCount;
        }

        public Builder setOldestRecoveryPoint(@Nullable Input<String> oldestRecoveryPoint) {
            this.oldestRecoveryPoint = oldestRecoveryPoint;
            return this;
        }

        public Builder setOldestRecoveryPoint(@Nullable String oldestRecoveryPoint) {
            this.oldestRecoveryPoint = Input.ofNullable(oldestRecoveryPoint);
            return this;
        }

        public Builder setPolicyInconsistent(@Nullable Input<Boolean> policyInconsistent) {
            this.policyInconsistent = policyInconsistent;
            return this;
        }

        public Builder setPolicyInconsistent(@Nullable Boolean policyInconsistent) {
            this.policyInconsistent = Input.ofNullable(policyInconsistent);
            return this;
        }

        public Builder setRecoveryPointCount(@Nullable Input<Integer> recoveryPointCount) {
            this.recoveryPointCount = recoveryPointCount;
            return this;
        }

        public Builder setRecoveryPointCount(@Nullable Integer recoveryPointCount) {
            this.recoveryPointCount = Input.ofNullable(recoveryPointCount);
            return this;
        }
        public AzureIaaSVMProtectedItemExtendedInfoArgs build() {
            return new AzureIaaSVMProtectedItemExtendedInfoArgs(oldestRecoveryPoint, policyInconsistent, recoveryPointCount);
        }
    }
}
