// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class UserPoolUserPoolAddOnsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolUserPoolAddOnsGetArgs Empty = new UserPoolUserPoolAddOnsGetArgs();

    /**
     * Mode for advanced security, must be one of `OFF`, `AUDIT` or `ENFORCED`.
     * 
     */
    @Import(name="advancedSecurityMode", required=true)
      private final Output<String> advancedSecurityMode;

    public Output<String> getAdvancedSecurityMode() {
        return this.advancedSecurityMode;
    }

    public UserPoolUserPoolAddOnsGetArgs(Output<String> advancedSecurityMode) {
        this.advancedSecurityMode = Objects.requireNonNull(advancedSecurityMode, "expected parameter 'advancedSecurityMode' to be non-null");
    }

    private UserPoolUserPoolAddOnsGetArgs() {
        this.advancedSecurityMode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolUserPoolAddOnsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> advancedSecurityMode;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolUserPoolAddOnsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedSecurityMode = defaults.advancedSecurityMode;
        }

        public Builder advancedSecurityMode(Output<String> advancedSecurityMode) {
            this.advancedSecurityMode = Objects.requireNonNull(advancedSecurityMode);
            return this;
        }
        public Builder advancedSecurityMode(String advancedSecurityMode) {
            this.advancedSecurityMode = Output.of(Objects.requireNonNull(advancedSecurityMode));
            return this;
        }        public UserPoolUserPoolAddOnsGetArgs build() {
            return new UserPoolUserPoolAddOnsGetArgs(advancedSecurityMode);
        }
    }
}
