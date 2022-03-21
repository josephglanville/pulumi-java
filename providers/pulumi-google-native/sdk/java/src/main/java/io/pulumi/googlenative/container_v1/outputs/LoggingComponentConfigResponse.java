// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class LoggingComponentConfigResponse {
    /**
     * Select components to collect logs. An empty set would disable all logging.
     * 
     */
    private final List<String> enableComponents;

    @CustomType.Constructor
    private LoggingComponentConfigResponse(@CustomType.Parameter("enableComponents") List<String> enableComponents) {
        this.enableComponents = enableComponents;
    }

    /**
     * Select components to collect logs. An empty set would disable all logging.
     * 
    */
    public List<String> getEnableComponents() {
        return this.enableComponents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingComponentConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> enableComponents;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingComponentConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableComponents = defaults.enableComponents;
        }

        public Builder enableComponents(List<String> enableComponents) {
            this.enableComponents = Objects.requireNonNull(enableComponents);
            return this;
        }
        public Builder enableComponents(String... enableComponents) {
            return enableComponents(List.of(enableComponents));
        }        public LoggingComponentConfigResponse build() {
            return new LoggingComponentConfigResponse(enableComponents);
        }
    }
}
