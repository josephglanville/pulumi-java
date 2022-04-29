// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDeploymentSpecificationRouteLoggingPolicyExecutionLog {
    /**
     * @return Whether this policy is currently enabled.
     * 
     */
    private final Boolean isEnabled;
    /**
     * @return Specifies the log level used to control logging output of execution logs. Enabling logging at a given level also enables logging at all higher levels.
     * 
     */
    private final String logLevel;

    @CustomType.Constructor
    private GetDeploymentSpecificationRouteLoggingPolicyExecutionLog(
        @CustomType.Parameter("isEnabled") Boolean isEnabled,
        @CustomType.Parameter("logLevel") String logLevel) {
        this.isEnabled = isEnabled;
        this.logLevel = logLevel;
    }

    /**
     * @return Whether this policy is currently enabled.
     * 
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }
    /**
     * @return Specifies the log level used to control logging output of execution logs. Enabling logging at a given level also enables logging at all higher levels.
     * 
     */
    public String logLevel() {
        return this.logLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentSpecificationRouteLoggingPolicyExecutionLog defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isEnabled;
        private String logLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeploymentSpecificationRouteLoggingPolicyExecutionLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
    	      this.logLevel = defaults.logLevel;
        }

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder logLevel(String logLevel) {
            this.logLevel = Objects.requireNonNull(logLevel);
            return this;
        }        public GetDeploymentSpecificationRouteLoggingPolicyExecutionLog build() {
            return new GetDeploymentSpecificationRouteLoggingPolicyExecutionLog(isEnabled, logLevel);
        }
    }
}
