// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Self referenced tumbling window trigger dependency.
 * 
 */
public final class SelfDependencyTumblingWindowTriggerReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SelfDependencyTumblingWindowTriggerReferenceArgs Empty = new SelfDependencyTumblingWindowTriggerReferenceArgs();

    /**
     * Timespan applied to the start time of a tumbling window when evaluating dependency.
     * 
     */
    @Import(name="offset", required=true)
      private final Output<String> offset;

    public Output<String> getOffset() {
        return this.offset;
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
     * Expected value is 'SelfDependencyTumblingWindowTriggerReference'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public SelfDependencyTumblingWindowTriggerReferenceArgs(
        Output<String> offset,
        @Nullable Output<String> size,
        Output<String> type) {
        this.offset = Objects.requireNonNull(offset, "expected parameter 'offset' to be non-null");
        this.size = size;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SelfDependencyTumblingWindowTriggerReferenceArgs() {
        this.offset = Output.empty();
        this.size = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelfDependencyTumblingWindowTriggerReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> offset;
        private @Nullable Output<String> size;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SelfDependencyTumblingWindowTriggerReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offset = defaults.offset;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        public Builder offset(Output<String> offset) {
            this.offset = Objects.requireNonNull(offset);
            return this;
        }
        public Builder offset(String offset) {
            this.offset = Output.of(Objects.requireNonNull(offset));
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
        }        public SelfDependencyTumblingWindowTriggerReferenceArgs build() {
            return new SelfDependencyTumblingWindowTriggerReferenceArgs(offset, size, type);
        }
    }
}
