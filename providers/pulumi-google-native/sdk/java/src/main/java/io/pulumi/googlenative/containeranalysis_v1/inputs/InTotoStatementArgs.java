// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1.inputs.InTotoProvenanceArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.SlsaProvenanceArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.SubjectArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Spec defined at https://github.com/in-toto/attestation/tree/main/spec#statement The serialized InTotoStatement will be stored as Envelope.payload. Envelope.payloadType is always "application/vnd.in-toto+json".
 * 
 */
public final class InTotoStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final InTotoStatementArgs Empty = new InTotoStatementArgs();

    /**
     * "https://slsa.dev/provenance/v0.1" for SlsaProvenance.
     * 
     */
    @Import(name="predicateType")
      private final @Nullable Output<String> predicateType;

    public Output<String> getPredicateType() {
        return this.predicateType == null ? Output.empty() : this.predicateType;
    }

    @Import(name="provenance")
      private final @Nullable Output<InTotoProvenanceArgs> provenance;

    public Output<InTotoProvenanceArgs> getProvenance() {
        return this.provenance == null ? Output.empty() : this.provenance;
    }

    @Import(name="slsaProvenance")
      private final @Nullable Output<SlsaProvenanceArgs> slsaProvenance;

    public Output<SlsaProvenanceArgs> getSlsaProvenance() {
        return this.slsaProvenance == null ? Output.empty() : this.slsaProvenance;
    }

    @Import(name="subject")
      private final @Nullable Output<List<SubjectArgs>> subject;

    public Output<List<SubjectArgs>> getSubject() {
        return this.subject == null ? Output.empty() : this.subject;
    }

    /**
     * Always "https://in-toto.io/Statement/v0.1".
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public InTotoStatementArgs(
        @Nullable Output<String> predicateType,
        @Nullable Output<InTotoProvenanceArgs> provenance,
        @Nullable Output<SlsaProvenanceArgs> slsaProvenance,
        @Nullable Output<List<SubjectArgs>> subject,
        @Nullable Output<String> type) {
        this.predicateType = predicateType;
        this.provenance = provenance;
        this.slsaProvenance = slsaProvenance;
        this.subject = subject;
        this.type = type;
    }

    private InTotoStatementArgs() {
        this.predicateType = Output.empty();
        this.provenance = Output.empty();
        this.slsaProvenance = Output.empty();
        this.subject = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InTotoStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> predicateType;
        private @Nullable Output<InTotoProvenanceArgs> provenance;
        private @Nullable Output<SlsaProvenanceArgs> slsaProvenance;
        private @Nullable Output<List<SubjectArgs>> subject;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InTotoStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predicateType = defaults.predicateType;
    	      this.provenance = defaults.provenance;
    	      this.slsaProvenance = defaults.slsaProvenance;
    	      this.subject = defaults.subject;
    	      this.type = defaults.type;
        }

        public Builder predicateType(@Nullable Output<String> predicateType) {
            this.predicateType = predicateType;
            return this;
        }
        public Builder predicateType(@Nullable String predicateType) {
            this.predicateType = Output.ofNullable(predicateType);
            return this;
        }
        public Builder provenance(@Nullable Output<InTotoProvenanceArgs> provenance) {
            this.provenance = provenance;
            return this;
        }
        public Builder provenance(@Nullable InTotoProvenanceArgs provenance) {
            this.provenance = Output.ofNullable(provenance);
            return this;
        }
        public Builder slsaProvenance(@Nullable Output<SlsaProvenanceArgs> slsaProvenance) {
            this.slsaProvenance = slsaProvenance;
            return this;
        }
        public Builder slsaProvenance(@Nullable SlsaProvenanceArgs slsaProvenance) {
            this.slsaProvenance = Output.ofNullable(slsaProvenance);
            return this;
        }
        public Builder subject(@Nullable Output<List<SubjectArgs>> subject) {
            this.subject = subject;
            return this;
        }
        public Builder subject(@Nullable List<SubjectArgs> subject) {
            this.subject = Output.ofNullable(subject);
            return this;
        }
        public Builder subject(SubjectArgs... subject) {
            return subject(List.of(subject));
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public InTotoStatementArgs build() {
            return new InTotoStatementArgs(predicateType, provenance, slsaProvenance, subject, type);
        }
    }
}
