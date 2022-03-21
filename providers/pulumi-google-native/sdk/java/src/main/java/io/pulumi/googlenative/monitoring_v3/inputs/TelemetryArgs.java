// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for how to query telemetry on a Service.
 * 
 */
public final class TelemetryArgs extends io.pulumi.resources.ResourceArgs {

    public static final TelemetryArgs Empty = new TelemetryArgs();

    /**
     * The full name of the resource that defines this service. Formatted as described in https://cloud.google.com/apis/design/resource_names.
     * 
     */
    @Import(name="resourceName")
      private final @Nullable Output<String> resourceName;

    public Output<String> getPropResourceName() {
        return this.resourceName == null ? Output.empty() : this.resourceName;
    }

    public TelemetryArgs(@Nullable Output<String> resourceName) {
        this.resourceName = resourceName;
    }

    private TelemetryArgs() {
        this.resourceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TelemetryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(TelemetryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceName = defaults.resourceName;
        }

        public Builder resourceName(@Nullable Output<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = Output.ofNullable(resourceName);
            return this;
        }        public TelemetryArgs build() {
            return new TelemetryArgs(resourceName);
        }
    }
}
