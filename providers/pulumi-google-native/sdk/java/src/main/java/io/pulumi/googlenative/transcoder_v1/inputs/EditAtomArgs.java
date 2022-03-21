// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Edit atom.
 * 
 */
public final class EditAtomArgs extends io.pulumi.resources.ResourceArgs {

    public static final EditAtomArgs Empty = new EditAtomArgs();

    /**
     * End time in seconds for the atom, relative to the input file timeline. When `end_time_offset` is not specified, the `inputs` are used until the end of the atom.
     * 
     */
    @Import(name="endTimeOffset")
      private final @Nullable Output<String> endTimeOffset;

    public Output<String> getEndTimeOffset() {
        return this.endTimeOffset == null ? Output.empty() : this.endTimeOffset;
    }

    /**
     * List of `Input.key`s identifying files that should be used in this atom. The listed `inputs` must have the same timeline.
     * 
     */
    @Import(name="inputs")
      private final @Nullable Output<List<String>> inputs;

    public Output<List<String>> getInputs() {
        return this.inputs == null ? Output.empty() : this.inputs;
    }

    /**
     * A unique key for this atom. Must be specified when using advanced mapping.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Output.empty() : this.key;
    }

    /**
     * Start time in seconds for the atom, relative to the input file timeline. The default is `0s`.
     * 
     */
    @Import(name="startTimeOffset")
      private final @Nullable Output<String> startTimeOffset;

    public Output<String> getStartTimeOffset() {
        return this.startTimeOffset == null ? Output.empty() : this.startTimeOffset;
    }

    public EditAtomArgs(
        @Nullable Output<String> endTimeOffset,
        @Nullable Output<List<String>> inputs,
        @Nullable Output<String> key,
        @Nullable Output<String> startTimeOffset) {
        this.endTimeOffset = endTimeOffset;
        this.inputs = inputs;
        this.key = key;
        this.startTimeOffset = startTimeOffset;
    }

    private EditAtomArgs() {
        this.endTimeOffset = Output.empty();
        this.inputs = Output.empty();
        this.key = Output.empty();
        this.startTimeOffset = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EditAtomArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> endTimeOffset;
        private @Nullable Output<List<String>> inputs;
        private @Nullable Output<String> key;
        private @Nullable Output<String> startTimeOffset;

        public Builder() {
    	      // Empty
        }

        public Builder(EditAtomArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTimeOffset = defaults.endTimeOffset;
    	      this.inputs = defaults.inputs;
    	      this.key = defaults.key;
    	      this.startTimeOffset = defaults.startTimeOffset;
        }

        public Builder endTimeOffset(@Nullable Output<String> endTimeOffset) {
            this.endTimeOffset = endTimeOffset;
            return this;
        }
        public Builder endTimeOffset(@Nullable String endTimeOffset) {
            this.endTimeOffset = Output.ofNullable(endTimeOffset);
            return this;
        }
        public Builder inputs(@Nullable Output<List<String>> inputs) {
            this.inputs = inputs;
            return this;
        }
        public Builder inputs(@Nullable List<String> inputs) {
            this.inputs = Output.ofNullable(inputs);
            return this;
        }
        public Builder inputs(String... inputs) {
            return inputs(List.of(inputs));
        }
        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Output.ofNullable(key);
            return this;
        }
        public Builder startTimeOffset(@Nullable Output<String> startTimeOffset) {
            this.startTimeOffset = startTimeOffset;
            return this;
        }
        public Builder startTimeOffset(@Nullable String startTimeOffset) {
            this.startTimeOffset = Output.ofNullable(startTimeOffset);
            return this;
        }        public EditAtomArgs build() {
            return new EditAtomArgs(endTimeOffset, inputs, key, startTimeOffset);
        }
    }
}
