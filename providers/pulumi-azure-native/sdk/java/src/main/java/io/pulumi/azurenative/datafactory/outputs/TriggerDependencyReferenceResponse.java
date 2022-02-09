// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.TriggerReferenceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TriggerDependencyReferenceResponse {
    private final TriggerReferenceResponse referenceTrigger;
    private final String type;

    @OutputCustomType.Constructor({"referenceTrigger","type"})
    private TriggerDependencyReferenceResponse(
        TriggerReferenceResponse referenceTrigger,
        String type) {
        this.referenceTrigger = Objects.requireNonNull(referenceTrigger);
        this.type = Objects.requireNonNull(type);
    }

    public TriggerReferenceResponse getReferenceTrigger() {
        return this.referenceTrigger;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerDependencyReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerReferenceResponse referenceTrigger;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerDependencyReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.referenceTrigger = defaults.referenceTrigger;
    	      this.type = defaults.type;
        }

        public Builder setReferenceTrigger(TriggerReferenceResponse referenceTrigger) {
            this.referenceTrigger = Objects.requireNonNull(referenceTrigger);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public TriggerDependencyReferenceResponse build() {
            return new TriggerDependencyReferenceResponse(referenceTrigger, type);
        }
    }
}
