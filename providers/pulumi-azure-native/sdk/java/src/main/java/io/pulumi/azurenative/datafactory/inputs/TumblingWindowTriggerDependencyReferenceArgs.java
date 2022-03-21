// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.TriggerReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Referenced tumbling window trigger dependency.
 * 
 */
public final class TumblingWindowTriggerDependencyReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final TumblingWindowTriggerDependencyReferenceArgs Empty = new TumblingWindowTriggerDependencyReferenceArgs();

    /**
     * Timespan applied to the start time of a tumbling window when evaluating dependency.
     * 
     */
    @Import(name="offset")
      private final @Nullable Output<String> offset;

    public Output<String> getOffset() {
        return this.offset == null ? Output.empty() : this.offset;
    }

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
     * The size of the window when evaluating the dependency. If undefined the frequency of the tumbling window will be used.
     * 
     */
    @Import(name="size")
      private final @Nullable Output<String> size;

    public Output<String> getSize() {
        return this.size == null ? Output.empty() : this.size;
    }

    /**
     * The type of dependency reference.
     * Expected value is 'TumblingWindowTriggerDependencyReference'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public TumblingWindowTriggerDependencyReferenceArgs(
        @Nullable Output<String> offset,
        Output<TriggerReferenceArgs> referenceTrigger,
        @Nullable Output<String> size,
        Output<String> type) {
        this.offset = offset;
        this.referenceTrigger = Objects.requireNonNull(referenceTrigger, "expected parameter 'referenceTrigger' to be non-null");
        this.size = size;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TumblingWindowTriggerDependencyReferenceArgs() {
        this.offset = Output.empty();
        this.referenceTrigger = Output.empty();
        this.size = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TumblingWindowTriggerDependencyReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> offset;
        private Output<TriggerReferenceArgs> referenceTrigger;
        private @Nullable Output<String> size;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TumblingWindowTriggerDependencyReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offset = defaults.offset;
    	      this.referenceTrigger = defaults.referenceTrigger;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        public Builder offset(@Nullable Output<String> offset) {
            this.offset = offset;
            return this;
        }
        public Builder offset(@Nullable String offset) {
            this.offset = Output.ofNullable(offset);
            return this;
        }
        public Builder referenceTrigger(Output<TriggerReferenceArgs> referenceTrigger) {
            this.referenceTrigger = Objects.requireNonNull(referenceTrigger);
            return this;
        }
        public Builder referenceTrigger(TriggerReferenceArgs referenceTrigger) {
            this.referenceTrigger = Output.of(Objects.requireNonNull(referenceTrigger));
            return this;
        }
        public Builder size(@Nullable Output<String> size) {
            this.size = size;
            return this;
        }
        public Builder size(@Nullable String size) {
            this.size = Output.ofNullable(size);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public TumblingWindowTriggerDependencyReferenceArgs build() {
            return new TumblingWindowTriggerDependencyReferenceArgs(offset, referenceTrigger, size, type);
        }
    }
}
