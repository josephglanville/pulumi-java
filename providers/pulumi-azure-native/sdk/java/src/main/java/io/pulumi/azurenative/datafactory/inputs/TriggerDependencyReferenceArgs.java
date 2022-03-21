// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.TriggerReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Trigger referenced dependency.
 * 
 */
public final class TriggerDependencyReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerDependencyReferenceArgs Empty = new TriggerDependencyReferenceArgs();

    /**
     * Referenced trigger.
     * 
     */
    @Import(name="referenceTrigger", required=true)
      private final Output<TriggerReferenceArgs> referenceTrigger;

    public Output<TriggerReferenceArgs> getReferenceTrigger() {
        return this.referenceTrigger;
    }

    /**
     * The type of dependency reference.
     * Expected value is 'TriggerDependencyReference'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public TriggerDependencyReferenceArgs(
        Output<TriggerReferenceArgs> referenceTrigger,
        Output<String> type) {
        this.referenceTrigger = Objects.requireNonNull(referenceTrigger, "expected parameter 'referenceTrigger' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TriggerDependencyReferenceArgs() {
        this.referenceTrigger = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerDependencyReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<TriggerReferenceArgs> referenceTrigger;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerDependencyReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.referenceTrigger = defaults.referenceTrigger;
    	      this.type = defaults.type;
        }

        public Builder referenceTrigger(Output<TriggerReferenceArgs> referenceTrigger) {
            this.referenceTrigger = Objects.requireNonNull(referenceTrigger);
            return this;
        }
        public Builder referenceTrigger(TriggerReferenceArgs referenceTrigger) {
            this.referenceTrigger = Output.of(Objects.requireNonNull(referenceTrigger));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public TriggerDependencyReferenceArgs build() {
            return new TriggerDependencyReferenceArgs(referenceTrigger, type);
        }
    }
}
