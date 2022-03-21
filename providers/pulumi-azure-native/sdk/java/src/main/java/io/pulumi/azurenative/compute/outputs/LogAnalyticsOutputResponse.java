// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LogAnalyticsOutputResponse {
    /**
     * Output file Uri path to blob container.
     * 
     */
    private final String output;

    @CustomType.Constructor
    private LogAnalyticsOutputResponse(@CustomType.Parameter("output") String output) {
        this.output = output;
    }

    /**
     * Output file Uri path to blob container.
     * 
    */
    public String getOutput() {
        return this.output;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogAnalyticsOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String output;

        public Builder() {
    	      // Empty
        }

        public Builder(LogAnalyticsOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.output = defaults.output;
        }

        public Builder output(String output) {
            this.output = Objects.requireNonNull(output);
            return this;
        }        public LogAnalyticsOutputResponse build() {
            return new LogAnalyticsOutputResponse(output);
        }
    }
}
