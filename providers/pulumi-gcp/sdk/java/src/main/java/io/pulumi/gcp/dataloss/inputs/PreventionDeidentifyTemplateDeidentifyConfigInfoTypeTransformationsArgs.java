// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs;
import java.util.List;
import java.util.Objects;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs();

    @InputImport(name="transformations", required=true)
    private final Input<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs>> transformations;

    public Input<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs>> getTransformations() {
        return this.transformations;
    }

    public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs(Input<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs>> transformations) {
        this.transformations = Objects.requireNonNull(transformations, "expected parameter 'transformations' to be non-null");
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs() {
        this.transformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs>> transformations;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transformations = defaults.transformations;
        }

        public Builder setTransformations(Input<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs>> transformations) {
            this.transformations = Objects.requireNonNull(transformations);
            return this;
        }

        public Builder setTransformations(List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs> transformations) {
            this.transformations = Input.of(Objects.requireNonNull(transformations));
            return this;
        }

        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs(transformations);
        }
    }
}