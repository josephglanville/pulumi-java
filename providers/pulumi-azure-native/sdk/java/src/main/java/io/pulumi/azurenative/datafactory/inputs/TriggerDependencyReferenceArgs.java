// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.TriggerReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TriggerDependencyReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerDependencyReferenceArgs Empty = new TriggerDependencyReferenceArgs();

    @InputImport(name="referenceTrigger", required=true)
    private final Input<TriggerReferenceArgs> referenceTrigger;

    public Input<TriggerReferenceArgs> getReferenceTrigger() {
        return this.referenceTrigger;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public TriggerDependencyReferenceArgs(
        Input<TriggerReferenceArgs> referenceTrigger,
        Input<String> type) {
        this.referenceTrigger = Objects.requireNonNull(referenceTrigger, "expected parameter 'referenceTrigger' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TriggerDependencyReferenceArgs() {
        this.referenceTrigger = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerDependencyReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<TriggerReferenceArgs> referenceTrigger;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerDependencyReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.referenceTrigger = defaults.referenceTrigger;
    	      this.type = defaults.type;
        }

        public Builder setReferenceTrigger(Input<TriggerReferenceArgs> referenceTrigger) {
            this.referenceTrigger = Objects.requireNonNull(referenceTrigger);
            return this;
        }

        public Builder setReferenceTrigger(TriggerReferenceArgs referenceTrigger) {
            this.referenceTrigger = Input.of(Objects.requireNonNull(referenceTrigger));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public TriggerDependencyReferenceArgs build() {
            return new TriggerDependencyReferenceArgs(referenceTrigger, type);
        }
    }
}