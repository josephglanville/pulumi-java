// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Represents the change that you want to make to the instance properties.
 * 
 */
public final class InstancePropertiesPatchResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstancePropertiesPatchResponse Empty = new InstancePropertiesPatchResponse();

    /**
     * The label key-value pairs that you want to patch onto the instance.
     * 
     */
    @Import(name="labels", required=true)
      private final Map<String,String> labels;

    public Map<String,String> getLabels() {
        return this.labels;
    }

    /**
     * The metadata key-value pairs that you want to patch onto the instance. For more information, see Project and instance metadata.
     * 
     */
    @Import(name="metadata", required=true)
      private final Map<String,String> metadata;

    public Map<String,String> getMetadata() {
        return this.metadata;
    }

    public InstancePropertiesPatchResponse(
        Map<String,String> labels,
        Map<String,String> metadata) {
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
    }

    private InstancePropertiesPatchResponse() {
        this.labels = Map.of();
        this.metadata = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstancePropertiesPatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> labels;
        private Map<String,String> metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(InstancePropertiesPatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
    	      this.metadata = defaults.metadata;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }        public InstancePropertiesPatchResponse build() {
            return new InstancePropertiesPatchResponse(labels, metadata);
        }
    }
}
