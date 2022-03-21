// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.azurenative.labservices.outputs.EnvironmentDetailsResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GetGlobalUserEnvironmentResult {
    /**
     * Details of the environment
     * 
     */
    private final EnvironmentDetailsResponse environment;

    @CustomType.Constructor
    private GetGlobalUserEnvironmentResult(@CustomType.Parameter("environment") EnvironmentDetailsResponse environment) {
        this.environment = environment;
    }

    /**
     * Details of the environment
     * 
    */
    public EnvironmentDetailsResponse getEnvironment() {
        return this.environment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalUserEnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentDetailsResponse environment;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalUserEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environment = defaults.environment;
        }

        public Builder environment(EnvironmentDetailsResponse environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }        public GetGlobalUserEnvironmentResult build() {
            return new GetGlobalUserEnvironmentResult(environment);
        }
    }
}
