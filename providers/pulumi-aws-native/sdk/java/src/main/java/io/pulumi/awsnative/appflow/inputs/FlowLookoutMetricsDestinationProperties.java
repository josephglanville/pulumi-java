// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowLookoutMetricsDestinationProperties extends io.pulumi.resources.InvokeArgs {

    public static final FlowLookoutMetricsDestinationProperties Empty = new FlowLookoutMetricsDestinationProperties();

    @InputImport(name="object")
    private final @Nullable String object;

    public Optional<String> getObject() {
        return this.object == null ? Optional.empty() : Optional.ofNullable(this.object);
    }

    public FlowLookoutMetricsDestinationProperties(@Nullable String object) {
        this.object = object;
    }

    private FlowLookoutMetricsDestinationProperties() {
        this.object = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowLookoutMetricsDestinationProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowLookoutMetricsDestinationProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.object = defaults.object;
        }

        public Builder setObject(@Nullable String object) {
            this.object = object;
            return this;
        }

        public FlowLookoutMetricsDestinationProperties build() {
            return new FlowLookoutMetricsDestinationProperties(object);
        }
    }
}