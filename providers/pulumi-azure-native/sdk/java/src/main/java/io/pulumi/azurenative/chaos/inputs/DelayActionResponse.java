// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Model that represents a delay action.
 * 
 */
public final class DelayActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final DelayActionResponse Empty = new DelayActionResponse();

    /**
     * ISO8601 formatted string that represents a duration.
     * 
     */
    @InputImport(name="duration", required=true)
      private final String duration;

    public String getDuration() {
        return this.duration;
    }

    /**
     * String that represents a Capability URN.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Enum that discriminates between action models.
     * Expected value is 'delay'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public DelayActionResponse(
        String duration,
        String name,
        String type) {
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DelayActionResponse() {
        this.duration = null;
        this.name = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DelayActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String duration;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DelayActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setDuration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public DelayActionResponse build() {
            return new DelayActionResponse(duration, name, type);
        }
    }
}
