// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SecurityPolicyAdvancedOptionsConfigResponse {
    private final String jsonParsing;
    private final String logLevel;

    @CustomType.Constructor
    private SecurityPolicyAdvancedOptionsConfigResponse(
        @CustomType.Parameter("jsonParsing") String jsonParsing,
        @CustomType.Parameter("logLevel") String logLevel) {
        this.jsonParsing = jsonParsing;
        this.logLevel = logLevel;
    }

    public String getJsonParsing() {
        return this.jsonParsing;
    }
    public String getLogLevel() {
        return this.logLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyAdvancedOptionsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jsonParsing;
        private String logLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyAdvancedOptionsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jsonParsing = defaults.jsonParsing;
    	      this.logLevel = defaults.logLevel;
        }

        public Builder jsonParsing(String jsonParsing) {
            this.jsonParsing = Objects.requireNonNull(jsonParsing);
            return this;
        }
        public Builder logLevel(String logLevel) {
            this.logLevel = Objects.requireNonNull(logLevel);
            return this;
        }        public SecurityPolicyAdvancedOptionsConfigResponse build() {
            return new SecurityPolicyAdvancedOptionsConfigResponse(jsonParsing, logLevel);
        }
    }
}
