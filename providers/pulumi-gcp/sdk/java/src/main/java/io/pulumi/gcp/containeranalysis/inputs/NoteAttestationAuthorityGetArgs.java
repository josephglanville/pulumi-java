// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.containeranalysis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.containeranalysis.inputs.NoteAttestationAuthorityHintGetArgs;
import java.util.Objects;


public final class NoteAttestationAuthorityGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NoteAttestationAuthorityGetArgs Empty = new NoteAttestationAuthorityGetArgs();

    /**
     * This submessage provides human-readable hints about the purpose of
     * the AttestationAuthority. Because the name of a Note acts as its
     * resource reference, it is important to disambiguate the canonical
     * name of the Note (which might be a UUID for security purposes)
     * from "readable" names more suitable for debug output. Note that
     * these hints should NOT be used to look up AttestationAuthorities
     * in security sensitive contexts, such as when looking up
     * Attestations to verify.
     * Structure is documented below.
     * 
     */
    @Import(name="hint", required=true)
      private final Output<NoteAttestationAuthorityHintGetArgs> hint;

    public Output<NoteAttestationAuthorityHintGetArgs> getHint() {
        return this.hint;
    }

    public NoteAttestationAuthorityGetArgs(Output<NoteAttestationAuthorityHintGetArgs> hint) {
        this.hint = Objects.requireNonNull(hint, "expected parameter 'hint' to be non-null");
    }

    private NoteAttestationAuthorityGetArgs() {
        this.hint = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NoteAttestationAuthorityGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<NoteAttestationAuthorityHintGetArgs> hint;

        public Builder() {
    	      // Empty
        }

        public Builder(NoteAttestationAuthorityGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hint = defaults.hint;
        }

        public Builder hint(Output<NoteAttestationAuthorityHintGetArgs> hint) {
            this.hint = Objects.requireNonNull(hint);
            return this;
        }
        public Builder hint(NoteAttestationAuthorityHintGetArgs hint) {
            this.hint = Output.of(Objects.requireNonNull(hint));
            return this;
        }        public NoteAttestationAuthorityGetArgs build() {
            return new NoteAttestationAuthorityGetArgs(hint);
        }
    }
}
