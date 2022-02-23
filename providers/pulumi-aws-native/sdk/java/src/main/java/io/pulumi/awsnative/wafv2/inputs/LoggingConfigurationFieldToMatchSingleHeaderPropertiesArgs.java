// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Inspect a single header. Provide the name of the header to inspect, for example, User-Agent or Referer. This setting isn't case sensitive.
 * 
 */
public final class LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs Empty = new LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs();

    /**
     * The name of the query header to inspect.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs(Input<String> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs build() {
            return new LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs(name);
        }
    }
}
