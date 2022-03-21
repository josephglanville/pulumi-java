// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * This submessage provides human-readable hints about the purpose of the authority. Because the name of a note acts as its resource reference, it is important to disambiguate the canonical name of the Note (which might be a UUID for security purposes) from "readable" names more suitable for debug output. Note that these hints should not be used to look up authorities in security sensitive contexts, such as when looking up attestations to verify.
 * 
 */
public final class DSSEHintArgs extends io.pulumi.resources.ResourceArgs {

    public static final DSSEHintArgs Empty = new DSSEHintArgs();

    /**
     * The human readable name of this attestation authority, for example "cloudbuild-prod".
     * 
     */
    @Import(name="humanReadableName", required=true)
      private final Output<String> humanReadableName;

    public Output<String> getHumanReadableName() {
        return this.humanReadableName;
    }

    public DSSEHintArgs(Output<String> humanReadableName) {
        this.humanReadableName = Objects.requireNonNull(humanReadableName, "expected parameter 'humanReadableName' to be non-null");
    }

    private DSSEHintArgs() {
        this.humanReadableName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DSSEHintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> humanReadableName;

        public Builder() {
    	      // Empty
        }

        public Builder(DSSEHintArgs defaults) {
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
        }        public DSSEHintArgs build() {
            return new DSSEHintArgs(humanReadableName);
        }
    }
}
