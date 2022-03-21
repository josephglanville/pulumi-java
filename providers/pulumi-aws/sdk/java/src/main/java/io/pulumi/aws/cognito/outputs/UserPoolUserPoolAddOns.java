// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UserPoolUserPoolAddOns {
    /**
     * Mode for advanced security, must be one of `OFF`, `AUDIT` or `ENFORCED`.
     * 
     */
    private final String advancedSecurityMode;

    @CustomType.Constructor
    private UserPoolUserPoolAddOns(@CustomType.Parameter("advancedSecurityMode") String advancedSecurityMode) {
        this.advancedSecurityMode = advancedSecurityMode;
    }

    /**
     * Mode for advanced security, must be one of `OFF`, `AUDIT` or `ENFORCED`.
     * 
    */
    public String getAdvancedSecurityMode() {
        return this.advancedSecurityMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolUserPoolAddOns defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String advancedSecurityMode;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolUserPoolAddOns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedSecurityMode = defaults.advancedSecurityMode;
        }

        public Builder advancedSecurityMode(String advancedSecurityMode) {
            this.advancedSecurityMode = Objects.requireNonNull(advancedSecurityMode);
            return this;
        }        public UserPoolUserPoolAddOns build() {
            return new UserPoolUserPoolAddOns(advancedSecurityMode);
        }
    }
}
