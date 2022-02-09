// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.JobInputClipResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobInputSequenceResponse {
    private final @Nullable List<JobInputClipResponse> inputs;
    private final String odataType;

    @OutputCustomType.Constructor({"inputs","odataType"})
    private JobInputSequenceResponse(
        @Nullable List<JobInputClipResponse> inputs,
        String odataType) {
        this.inputs = inputs;
        this.odataType = Objects.requireNonNull(odataType);
    }

    public List<JobInputClipResponse> getInputs() {
        return this.inputs == null ? List.of() : this.inputs;
    }
    public String getOdataType() {
        return this.odataType;
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
