// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceConfigurationsInstanceConfigurationInstanceDetailLaunchDetailAvailabilityConfig {
    /**
     * @return The lifecycle state for an instance when it is recovered after infrastructure maintenance.
     * 
     */
    private final String recoveryAction;

    @CustomType.Constructor
    private GetInstanceConfigurationsInstanceConfigurationInstanceDetailLaunchDetailAvailabilityConfig(@CustomType.Parameter("recoveryAction") String recoveryAction) {
        this.recoveryAction = recoveryAction;
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

    public static Builder builder(GetInstanceConfigurationsInstanceConfigurationInstanceDetailLaunchDetailAvailabilityConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String recoveryAction;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceConfigurationsInstanceConfigurationInstanceDetailLaunchDetailAvailabilityConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recoveryAction = defaults.recoveryAction;
        }

        public Builder recoveryAction(String recoveryAction) {
            this.recoveryAction = Objects.requireNonNull(recoveryAction);
            return this;
        }        public GetInstanceConfigurationsInstanceConfigurationInstanceDetailLaunchDetailAvailabilityConfig build() {
            return new GetInstanceConfigurationsInstanceConfigurationInstanceDetailLaunchDetailAvailabilityConfig(recoveryAction);
        }
    }
}
