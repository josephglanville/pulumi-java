// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstancesInstanceAvailabilityConfig {
    /**
     * @return Whether live migration is preferred for infrastructure maintenance.  If null preference is specified, live migration will be preferred for infrastructure maintenance for applicable instances.
     * 
     */
    private final Boolean isLiveMigrationPreferred;
    /**
     * @return The lifecycle state for an instance when it is recovered after infrastructure maintenance.
     * 
     */
    private final String recoveryAction;

    @CustomType.Constructor
    private GetInstancesInstanceAvailabilityConfig(
        @CustomType.Parameter("isLiveMigrationPreferred") Boolean isLiveMigrationPreferred,
        @CustomType.Parameter("recoveryAction") String recoveryAction) {
        this.isLiveMigrationPreferred = isLiveMigrationPreferred;
        this.recoveryAction = recoveryAction;
    }

    /**
     * @return Whether live migration is preferred for infrastructure maintenance.  If null preference is specified, live migration will be preferred for infrastructure maintenance for applicable instances.
     * 
     */
    public Boolean isLiveMigrationPreferred() {
        return this.isLiveMigrationPreferred;
    }
    /**
     * @return The lifecycle state for an instance when it is recovered after infrastructure maintenance.
     * 
     */
    public String recoveryAction() {
        return this.recoveryAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstanceAvailabilityConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isLiveMigrationPreferred;
        private String recoveryAction;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstancesInstanceAvailabilityConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isLiveMigrationPreferred = defaults.isLiveMigrationPreferred;
    	      this.recoveryAction = defaults.recoveryAction;
        }

        public Builder isLiveMigrationPreferred(Boolean isLiveMigrationPreferred) {
            this.isLiveMigrationPreferred = Objects.requireNonNull(isLiveMigrationPreferred);
            return this;
        }
        public Builder recoveryAction(String recoveryAction) {
            this.recoveryAction = Objects.requireNonNull(recoveryAction);
            return this;
        }        public GetInstancesInstanceAvailabilityConfig build() {
            return new GetInstancesInstanceAvailabilityConfig(isLiveMigrationPreferred, recoveryAction);
        }
    }
}
