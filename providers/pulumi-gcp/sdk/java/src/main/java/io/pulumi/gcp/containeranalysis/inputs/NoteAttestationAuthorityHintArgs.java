// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.containeranalysis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class NoteAttestationAuthorityHintArgs extends io.pulumi.resources.ResourceArgs {

    public static final NoteAttestationAuthorityHintArgs Empty = new NoteAttestationAuthorityHintArgs();

    /**
     * The human readable name of this Attestation Authority, for
     * example "qa".
     * 
     */
    @Import(name="humanReadableName", required=true)
      private final Output<String> humanReadableName;

    public Output<String> getHumanReadableName() {
        return this.humanReadableName;
    }

    public NoteAttestationAuthorityHintArgs(Output<String> humanReadableName) {
        this.humanReadableName = Objects.requireNonNull(humanReadableName, "expected parameter 'humanReadableName' to be non-null");
    }

    private NoteAttestationAuthorityHintArgs() {
        this.humanReadableName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NoteAttestationAuthorityHintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> humanReadableName;

        public Builder() {
    	      // Empty
        }

        public Builder(NoteAttestationAuthorityHintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.humanReadableName = defaults.humanReadableName;
        }

        public Builder humanReadableName(Output<String> humanReadableName) {
            this.humanReadableName = Objects.requireNonNull(humanReadableName);
            return this;
        }
        public Builder humanReadableName(String humanReadableName) {
            this.humanReadableName = Output.of(Objects.requireNonNull(humanReadableName));
            return this;
        }        public NoteAttestationAuthorityHintArgs build() {
            return new NoteAttestationAuthorityHintArgs(humanReadableName);
        }
    }
}
