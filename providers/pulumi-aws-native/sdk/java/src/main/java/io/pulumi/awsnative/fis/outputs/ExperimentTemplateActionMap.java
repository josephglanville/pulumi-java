// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.fis.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class ExperimentTemplateActionMap {
    @OutputCustomType.Constructor({})
    private ExperimentTemplateActionMap() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentTemplateActionMap defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentTemplateActionMap defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public ExperimentTemplateActionMap build() {
            return new ExperimentTemplateActionMap();
        }
    }
}