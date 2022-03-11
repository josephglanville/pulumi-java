// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.EnvelopeSignatureArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MUST match https://github.com/secure-systems-lab/dsse/blob/master/envelope.proto. An authenticated message of arbitrary type.
 * 
 */
public final class EnvelopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvelopeArgs Empty = new EnvelopeArgs();

    /**
     * The bytes being signed
     * 
     */
    @InputImport(name="payload")
      private final @Nullable Output<String> payload;

    public Output<String> getPayload() {
        return this.payload == null ? Output.empty() : this.payload;
    }

    /**
     * The type of payload being signed
     * 
     */
    @InputImport(name="payloadType")
      private final @Nullable Output<String> payloadType;

    public Output<String> getPayloadType() {
        return this.payloadType == null ? Output.empty() : this.payloadType;
    }

    /**
     * The signatures over the payload
     * 
     */
    @InputImport(name="signatures")
      private final @Nullable Output<List<EnvelopeSignatureArgs>> signatures;

    public Output<List<EnvelopeSignatureArgs>> getSignatures() {
        return this.signatures == null ? Output.empty() : this.signatures;
    }

    public EnvelopeArgs(
        @Nullable Output<String> payload,
        @Nullable Output<String> payloadType,
        @Nullable Output<List<EnvelopeSignatureArgs>> signatures) {
        this.payload = payload;
        this.payloadType = payloadType;
        this.signatures = signatures;
    }

    private EnvelopeArgs() {
        this.payload = Output.empty();
        this.payloadType = Output.empty();
        this.signatures = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvelopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> payload;
        private @Nullable Output<String> payloadType;
        private @Nullable Output<List<EnvelopeSignatureArgs>> signatures;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvelopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payload = defaults.payload;
    	      this.payloadType = defaults.payloadType;
    	      this.signatures = defaults.signatures;
        }

        public Builder payload(@Nullable Output<String> payload) {
            this.payload = payload;
            return this;
        }

        public Builder payload(@Nullable String payload) {
            this.payload = Output.ofNullable(payload);
            return this;
        }

        public Builder payloadType(@Nullable Output<String> payloadType) {
            this.payloadType = payloadType;
            return this;
        }

        public Builder payloadType(@Nullable String payloadType) {
            this.payloadType = Output.ofNullable(payloadType);
            return this;
        }

        public Builder signatures(@Nullable Output<List<EnvelopeSignatureArgs>> signatures) {
            this.signatures = signatures;
            return this;
        }

        public Builder signatures(@Nullable List<EnvelopeSignatureArgs> signatures) {
            this.signatures = Output.ofNullable(signatures);
            return this;
        }
        public EnvelopeArgs build() {
            return new EnvelopeArgs(payload, payloadType, signatures);
        }
    }
}
