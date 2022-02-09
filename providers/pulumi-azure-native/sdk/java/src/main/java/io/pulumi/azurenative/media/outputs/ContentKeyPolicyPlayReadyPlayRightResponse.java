// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContentKeyPolicyPlayReadyPlayRightResponse {
    private final @Nullable Integer agcAndColorStripeRestriction;
    private final String allowPassingVideoContentToUnknownOutput;
    private final @Nullable Integer analogVideoOpl;
    private final @Nullable Integer compressedDigitalAudioOpl;
    private final @Nullable Integer compressedDigitalVideoOpl;
    private final Boolean digitalVideoOnlyContentRestriction;
    private final @Nullable ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse explicitAnalogTelevisionOutputRestriction;
    private final @Nullable String firstPlayExpiration;
    private final Boolean imageConstraintForAnalogComponentVideoRestriction;
    private final Boolean imageConstraintForAnalogComputerMonitorRestriction;
    private final @Nullable Integer scmsRestriction;
    private final @Nullable Integer uncompressedDigitalAudioOpl;
    private final @Nullable Integer uncompressedDigitalVideoOpl;

    @OutputCustomType.Constructor({"agcAndColorStripeRestriction","allowPassingVideoContentToUnknownOutput","analogVideoOpl","compressedDigitalAudioOpl","compressedDigitalVideoOpl","digitalVideoOnlyContentRestriction","explicitAnalogTelevisionOutputRestriction","firstPlayExpiration","imageConstraintForAnalogComponentVideoRestriction","imageConstraintForAnalogComputerMonitorRestriction","scmsRestriction","uncompressedDigitalAudioOpl","uncompressedDigitalVideoOpl"})
    private ContentKeyPolicyPlayReadyPlayRightResponse(
        @Nullable Integer agcAndColorStripeRestriction,
        String allowPassingVideoContentToUnknownOutput,
        @Nullable Integer analogVideoOpl,
        @Nullable Integer compressedDigitalAudioOpl,
        @Nullable Integer compressedDigitalVideoOpl,
        Boolean digitalVideoOnlyContentRestriction,
        @Nullable ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse explicitAnalogTelevisionOutputRestriction,
        @Nullable String firstPlayExpiration,
        Boolean imageConstraintForAnalogComponentVideoRestriction,
        Boolean imageConstraintForAnalogComputerMonitorRestriction,
        @Nullable Integer scmsRestriction,
        @Nullable Integer uncompressedDigitalAudioOpl,
        @Nullable Integer uncompressedDigitalVideoOpl) {
        this.agcAndColorStripeRestriction = agcAndColorStripeRestriction;
        this.allowPassingVideoContentToUnknownOutput = Objects.requireNonNull(allowPassingVideoContentToUnknownOutput);
        this.analogVideoOpl = analogVideoOpl;
        this.compressedDigitalAudioOpl = compressedDigitalAudioOpl;
        this.compressedDigitalVideoOpl = compressedDigitalVideoOpl;
        this.digitalVideoOnlyContentRestriction = Objects.requireNonNull(digitalVideoOnlyContentRestriction);
        this.explicitAnalogTelevisionOutputRestriction = explicitAnalogTelevisionOutputRestriction;
        this.firstPlayExpiration = firstPlayExpiration;
        this.imageConstraintForAnalogComponentVideoRestriction = Objects.requireNonNull(imageConstraintForAnalogComponentVideoRestriction);
        this.imageConstraintForAnalogComputerMonitorRestriction = Objects.requireNonNull(imageConstraintForAnalogComputerMonitorRestriction);
        this.scmsRestriction = scmsRestriction;
        this.uncompressedDigitalAudioOpl = uncompressedDigitalAudioOpl;
        this.uncompressedDigitalVideoOpl = uncompressedDigitalVideoOpl;
    }

    public Optional<Integer> getAgcAndColorStripeRestriction() {
        return Optional.ofNullable(this.agcAndColorStripeRestriction);
    }
    public String getAllowPassingVideoContentToUnknownOutput() {
        return this.allowPassingVideoContentToUnknownOutput;
    }
    public Optional<Integer> getAnalogVideoOpl() {
        return Optional.ofNullable(this.analogVideoOpl);
    }
    public Optional<Integer> getCompressedDigitalAudioOpl() {
        return Optional.ofNullable(this.compressedDigitalAudioOpl);
    }
    public Optional<Integer> getCompressedDigitalVideoOpl() {
        return Optional.ofNullable(this.compressedDigitalVideoOpl);
    }
    public Boolean getDigitalVideoOnlyContentRestriction() {
        return this.digitalVideoOnlyContentRestriction;
    }
    public Optional<ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse> getExplicitAnalogTelevisionOutputRestriction() {
        return Optional.ofNullable(this.explicitAnalogTelevisionOutputRestriction);
    }
    public Optional<String> getFirstPlayExpiration() {
        return Optional.ofNullable(this.firstPlayExpiration);
    }
    public Boolean getImageConstraintForAnalogComponentVideoRestriction() {
        return this.imageConstraintForAnalogComponentVideoRestriction;
    }
    public Boolean getImageConstraintForAnalogComputerMonitorRestriction() {
        return this.imageConstraintForAnalogComputerMonitorRestriction;
    }
    public Optional<Integer> getScmsRestriction() {
        return Optional.ofNullable(this.scmsRestriction);
    }
    public Optional<Integer> getUncompressedDigitalAudioOpl() {
        return Optional.ofNullable(this.uncompressedDigitalAudioOpl);
    }
    public Optional<Integer> getUncompressedDigitalVideoOpl() {
        return Optional.ofNullable(this.uncompressedDigitalVideoOpl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyPlayReadyPlayRightResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer agcAndColorStripeRestriction;
        private String allowPassingVideoContentToUnknownOutput;
        private @Nullable Integer analogVideoOpl;
        private @Nullable Integer compressedDigitalAudioOpl;
        private @Nullable Integer compressedDigitalVideoOpl;
        private Boolean digitalVideoOnlyContentRestriction;
        private @Nullable ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse explicitAnalogTelevisionOutputRestriction;
        private @Nullable String firstPlayExpiration;
        private Boolean imageConstraintForAnalogComponentVideoRestriction;
        private Boolean imageConstraintForAnalogComputerMonitorRestriction;
        private @Nullable Integer scmsRestriction;
        private @Nullable Integer uncompressedDigitalAudioOpl;
        private @Nullable Integer uncompressedDigitalVideoOpl;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyPlayReadyPlayRightResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agcAndColorStripeRestriction = defaults.agcAndColorStripeRestriction;
    	      this.allowPassingVideoContentToUnknownOutput = defaults.allowPassingVideoContentToUnknownOutput;
    	      this.analogVideoOpl = defaults.analogVideoOpl;
    	      this.compressedDigitalAudioOpl = defaults.compressedDigitalAudioOpl;
    	      this.compressedDigitalVideoOpl = defaults.compressedDigitalVideoOpl;
    	      this.digitalVideoOnlyContentRestriction = defaults.digitalVideoOnlyContentRestriction;
    	      this.explicitAnalogTelevisionOutputRestriction = defaults.explicitAnalogTelevisionOutputRestriction;
    	      this.firstPlayExpiration = defaults.firstPlayExpiration;
    	      this.imageConstraintForAnalogComponentVideoRestriction = defaults.imageConstraintForAnalogComponentVideoRestriction;
    	      this.imageConstraintForAnalogComputerMonitorRestriction = defaults.imageConstraintForAnalogComputerMonitorRestriction;
    	      this.scmsRestriction = defaults.scmsRestriction;
    	      this.uncompressedDigitalAudioOpl = defaults.uncompressedDigitalAudioOpl;
    	      this.uncompressedDigitalVideoOpl = defaults.uncompressedDigitalVideoOpl;
        }

        public Builder setAgcAndColorStripeRestriction(@Nullable Integer agcAndColorStripeRestriction) {
            this.agcAndColorStripeRestriction = agcAndColorStripeRestriction;
            return this;
        }

        public Builder setAllowPassingVideoContentToUnknownOutput(String allowPassingVideoContentToUnknownOutput) {
            this.allowPassingVideoContentToUnknownOutput = Objects.requireNonNull(allowPassingVideoContentToUnknownOutput);
            return this;
        }

        public Builder setAnalogVideoOpl(@Nullable Integer analogVideoOpl) {
            this.analogVideoOpl = analogVideoOpl;
            return this;
        }

        public Builder setCompressedDigitalAudioOpl(@Nullable Integer compressedDigitalAudioOpl) {
            this.compressedDigitalAudioOpl = compressedDigitalAudioOpl;
            return this;
        }

        public Builder setCompressedDigitalVideoOpl(@Nullable Integer compressedDigitalVideoOpl) {
            this.compressedDigitalVideoOpl = compressedDigitalVideoOpl;
            return this;
        }

        public Builder setDigitalVideoOnlyContentRestriction(Boolean digitalVideoOnlyContentRestriction) {
            this.digitalVideoOnlyContentRestriction = Objects.requireNonNull(digitalVideoOnlyContentRestriction);
            return this;
        }

        public Builder setExplicitAnalogTelevisionOutputRestriction(@Nullable ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse explicitAnalogTelevisionOutputRestriction) {
            this.explicitAnalogTelevisionOutputRestriction = explicitAnalogTelevisionOutputRestriction;
            return this;
        }

        public Builder setFirstPlayExpiration(@Nullable String firstPlayExpiration) {
            this.firstPlayExpiration = firstPlayExpiration;
            return this;
        }

        public Builder setImageConstraintForAnalogComponentVideoRestriction(Boolean imageConstraintForAnalogComponentVideoRestriction) {
            this.imageConstraintForAnalogComponentVideoRestriction = Objects.requireNonNull(imageConstraintForAnalogComponentVideoRestriction);
            return this;
        }

        public Builder setImageConstraintForAnalogComputerMonitorRestriction(Boolean imageConstraintForAnalogComputerMonitorRestriction) {
            this.imageConstraintForAnalogComputerMonitorRestriction = Objects.requireNonNull(imageConstraintForAnalogComputerMonitorRestriction);
            return this;
        }

        public Builder setScmsRestriction(@Nullable Integer scmsRestriction) {
            this.scmsRestriction = scmsRestriction;
            return this;
        }

        public Builder setUncompressedDigitalAudioOpl(@Nullable Integer uncompressedDigitalAudioOpl) {
            this.uncompressedDigitalAudioOpl = uncompressedDigitalAudioOpl;
            return this;
        }

        public Builder setUncompressedDigitalVideoOpl(@Nullable Integer uncompressedDigitalVideoOpl) {
            this.uncompressedDigitalVideoOpl = uncompressedDigitalVideoOpl;
            return this;
        }

        public ContentKeyPolicyPlayReadyPlayRightResponse build() {
            return new ContentKeyPolicyPlayReadyPlayRightResponse(agcAndColorStripeRestriction, allowPassingVideoContentToUnknownOutput, analogVideoOpl, compressedDigitalAudioOpl, compressedDigitalVideoOpl, digitalVideoOnlyContentRestriction, explicitAnalogTelevisionOutputRestriction, firstPlayExpiration, imageConstraintForAnalogComponentVideoRestriction, imageConstraintForAnalogComputerMonitorRestriction, scmsRestriction, uncompressedDigitalAudioOpl, uncompressedDigitalVideoOpl);
        }
    }
}
