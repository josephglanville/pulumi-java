// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomServiceTelemetryGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomServiceTelemetryGetArgs Empty = new CustomServiceTelemetryGetArgs();

    /**
     * The full name of the resource that defines this service.
     * Formatted as described in
     * https://cloud.google.com/apis/design/resource_names.
     * 
     */
    @InputImport(name="resourceName")
      private final @Nullable Output<String> resourceName;

    public Output<String> getPropResourceName() {
        return this.resourceName == null ? Output.empty() : this.resourceName;
    }

    public CustomServiceTelemetryGetArgs(@Nullable Output<String> resourceName) {
        this.resourceName = resourceName;
    }

    private CustomServiceTelemetryGetArgs() {
        this.resourceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomServiceTelemetryGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomServiceTelemetryGetArgs defaults) {
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
        }
        public CustomServiceTelemetryGetArgs build() {
            return new CustomServiceTelemetryGetArgs(resourceName);
        }
    }
}
