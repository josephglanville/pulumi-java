// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.CloudHealthcareSourceArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * AnnotationSource holds the source information of the annotation.
 * 
 */
public final class AnnotationSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnnotationSourceArgs Empty = new AnnotationSourceArgs();

    /**
     * Cloud Healthcare API resource.
     * 
     */
    @InputImport(name="cloudHealthcareSource")
      private final @Nullable Output<CloudHealthcareSourceArgs> cloudHealthcareSource;

    public Output<CloudHealthcareSourceArgs> getCloudHealthcareSource() {
        return this.cloudHealthcareSource == null ? Output.empty() : this.cloudHealthcareSource;
    }

    public AnnotationSourceArgs(@Nullable Output<CloudHealthcareSourceArgs> cloudHealthcareSource) {
        this.cloudHealthcareSource = cloudHealthcareSource;
    }

    private AnnotationSourceArgs() {
        this.cloudHealthcareSource = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnnotationSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CloudHealthcareSourceArgs> cloudHealthcareSource;

        public Builder() {
    	      // Empty
        }

        public Builder(AnnotationSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudHealthcareSource = defaults.cloudHealthcareSource;
        }

        public Builder cloudHealthcareSource(@Nullable Output<CloudHealthcareSourceArgs> cloudHealthcareSource) {
            this.cloudHealthcareSource = cloudHealthcareSource;
            return this;
        }

        public Builder cloudHealthcareSource(@Nullable CloudHealthcareSourceArgs cloudHealthcareSource) {
            this.cloudHealthcareSource = Output.ofNullable(cloudHealthcareSource);
            return this;
        }
        public AnnotationSourceArgs build() {
            return new AnnotationSourceArgs(cloudHealthcareSource);
        }
    }
}
