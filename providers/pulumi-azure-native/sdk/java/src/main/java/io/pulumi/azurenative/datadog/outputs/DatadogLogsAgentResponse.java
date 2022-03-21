// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datadog.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatadogLogsAgentResponse {
    /**
     * The transport.
     * 
     */
    private final @Nullable String transport;

    @CustomType.Constructor
    private DatadogLogsAgentResponse(@CustomType.Parameter("transport") @Nullable String transport) {
        this.transport = transport;
    }

    /**
     * The transport.
     * 
    */
    public Optional<String> getTransport() {
        return Optional.ofNullable(this.transport);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatadogLogsAgentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String transport;

        public Builder() {
    	      // Empty
        }

        public Builder(DatadogLogsAgentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transport = defaults.transport;
        }

        public Builder transport(@Nullable String transport) {
            this.transport = transport;
            return this;
        }        public DatadogLogsAgentResponse build() {
            return new DatadogLogsAgentResponse(transport);
        }
    }
}
