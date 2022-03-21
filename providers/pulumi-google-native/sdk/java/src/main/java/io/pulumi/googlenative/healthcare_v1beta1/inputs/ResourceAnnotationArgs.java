// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Resource level annotation.
 * 
 */
public final class ResourceAnnotationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceAnnotationArgs Empty = new ResourceAnnotationArgs();

    /**
     * A description of the annotation record.
     * 
     */
    @Import(name="label")
      private final @Nullable Output<String> label;

    public Output<String> getLabel() {
        return this.label == null ? Output.empty() : this.label;
    }

    public ResourceAnnotationArgs(@Nullable Output<String> label) {
        this.label = label;
    }

    private ResourceAnnotationArgs() {
        this.label = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceAnnotationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> label;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceAnnotationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
        }

        public Builder label(@Nullable Output<String> label) {
            this.label = label;
            return this;
        }
        public Builder label(@Nullable String label) {
            this.label = Output.ofNullable(label);
            return this;
        }        public ResourceAnnotationArgs build() {
            return new ResourceAnnotationArgs(label);
        }
    }
}
