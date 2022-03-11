// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Additional information about Azure File Share backup item.
 * 
 */
public final class AzureFileshareProtectedItemExtendedInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureFileshareProtectedItemExtendedInfoArgs Empty = new AzureFileshareProtectedItemExtendedInfoArgs();

    /**
     * The oldest backup copy available for this item in the service.
     * 
     */
    @InputImport(name="oldestRecoveryPoint")
      private final @Nullable Output<String> oldestRecoveryPoint;

    public Output<String> getOldestRecoveryPoint() {
        return this.oldestRecoveryPoint == null ? Output.empty() : this.oldestRecoveryPoint;
    }

    /**
     * Indicates consistency of policy object and policy applied to this backup item.
     * 
     */
    @InputImport(name="policyState")
      private final @Nullable Output<String> policyState;

    public Output<String> getPolicyState() {
        return this.policyState == null ? Output.empty() : this.policyState;
    }

    /**
     * Number of available backup copies associated with this backup item.
     * 
     */
    @InputImport(name="recoveryPointCount")
      private final @Nullable Output<Integer> recoveryPointCount;

    public Output<Integer> getRecoveryPointCount() {
        return this.recoveryPointCount == null ? Output.empty() : this.recoveryPointCount;
    }

    public AzureFileshareProtectedItemExtendedInfoArgs(
        @Nullable Output<String> oldestRecoveryPoint,
        @Nullable Output<String> policyState,
        @Nullable Output<Integer> recoveryPointCount) {
        this.oldestRecoveryPoint = oldestRecoveryPoint;
        this.policyState = policyState;
        this.recoveryPointCount = recoveryPointCount;
    }

    private AzureFileshareProtectedItemExtendedInfoArgs() {
        this.oldestRecoveryPoint = Output.empty();
        this.policyState = Output.empty();
        this.recoveryPointCount = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFileshareProtectedItemExtendedInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> oldestRecoveryPoint;
        private @Nullable Output<String> policyState;
        private @Nullable Output<Integer> recoveryPointCount;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFileshareProtectedItemExtendedInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oldestRecoveryPoint = defaults.oldestRecoveryPoint;
    	      this.policyState = defaults.policyState;
    	      this.recoveryPointCount = defaults.recoveryPointCount;
        }

        public Builder oldestRecoveryPoint(@Nullable Output<String> oldestRecoveryPoint) {
            this.oldestRecoveryPoint = oldestRecoveryPoint;
            return this;
        }

        public Builder oldestRecoveryPoint(@Nullable String oldestRecoveryPoint) {
            this.oldestRecoveryPoint = Output.ofNullable(oldestRecoveryPoint);
            return this;
        }

        public Builder policyState(@Nullable Output<String> policyState) {
            this.policyState = policyState;
            return this;
        }

        public Builder policyState(@Nullable String policyState) {
            this.policyState = Output.ofNullable(policyState);
            return this;
        }

        public Builder recoveryPointCount(@Nullable Output<Integer> recoveryPointCount) {
            this.recoveryPointCount = recoveryPointCount;
            return this;
        }

        public Builder recoveryPointCount(@Nullable Integer recoveryPointCount) {
            this.recoveryPointCount = Output.ofNullable(recoveryPointCount);
            return this;
        }
        public AzureFileshareProtectedItemExtendedInfoArgs build() {
            return new AzureFileshareProtectedItemExtendedInfoArgs(oldestRecoveryPoint, policyState, recoveryPointCount);
        }
    }
}
