// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.JobInputClipResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A Sequence contains an ordered list of Clips where each clip is a JobInput.  The Sequence will be treated as a single input.
 * 
 */
public final class JobInputSequenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobInputSequenceResponse Empty = new JobInputSequenceResponse();

    /**
     * JobInputs that make up the timeline.
     * 
     */
    @InputImport(name="inputs")
      private final @Nullable List<JobInputClipResponse> inputs;

    public List<JobInputClipResponse> getInputs() {
        return this.inputs == null ? List.of() : this.inputs;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.JobInputSequence'.
     * 
     */
    @InputImport(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    public JobInputSequenceResponse(
        @Nullable List<JobInputClipResponse> inputs,
        String odataType) {
        this.inputs = inputs;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private JobInputSequenceResponse() {
        this.inputs = List.of();
        this.odataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobInputSequenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<JobInputClipResponse> inputs;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(JobInputSequenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputs = defaults.inputs;
    	      this.odataType = defaults.odataType;
        }

        public Builder setInputs(@Nullable List<JobInputClipResponse> inputs) {
            this.inputs = inputs;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public JobInputSequenceResponse build() {
            return new JobInputSequenceResponse(inputs, odataType);
        }
    }
}
