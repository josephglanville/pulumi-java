// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationUnsharpMaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyImagePolicyTransformationUnsharpMaskArgs Empty = new GetImagingPolicyImagePolicyTransformationUnsharpMaskArgs();

    @Import(name="gain")
    private @Nullable Output<String> gain;

    public Optional<Output<String>> gain() {
        return Optional.ofNullable(this.gain);
    }

    @Import(name="gainVar")
    private @Nullable Output<String> gainVar;

    public Optional<Output<String>> gainVar() {
        return Optional.ofNullable(this.gainVar);
    }

    @Import(name="sigma")
    private @Nullable Output<String> sigma;

    public Optional<Output<String>> sigma() {
        return Optional.ofNullable(this.sigma);
    }

    @Import(name="sigmaVar")
    private @Nullable Output<String> sigmaVar;

    public Optional<Output<String>> sigmaVar() {
        return Optional.ofNullable(this.sigmaVar);
    }

    @Import(name="threshold")
    private @Nullable Output<String> threshold;

    public Optional<Output<String>> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    @Import(name="thresholdVar")
    private @Nullable Output<String> thresholdVar;

    public Optional<Output<String>> thresholdVar() {
        return Optional.ofNullable(this.thresholdVar);
    }

    private GetImagingPolicyImagePolicyTransformationUnsharpMaskArgs() {}

    private GetImagingPolicyImagePolicyTransformationUnsharpMaskArgs(GetImagingPolicyImagePolicyTransformationUnsharpMaskArgs $) {
        this.gain = $.gain;
        this.gainVar = $.gainVar;
        this.sigma = $.sigma;
        this.sigmaVar = $.sigmaVar;
        this.threshold = $.threshold;
        this.thresholdVar = $.thresholdVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationUnsharpMaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationUnsharpMaskArgs $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationUnsharpMaskArgs();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationUnsharpMaskArgs defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationUnsharpMaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder gain(@Nullable Output<String> gain) {
            $.gain = gain;
            return this;
        }

        public Builder gain(String gain) {
            return gain(Output.of(gain));
        }

        public Builder gainVar(@Nullable Output<String> gainVar) {
            $.gainVar = gainVar;
            return this;
        }

        public Builder gainVar(String gainVar) {
            return gainVar(Output.of(gainVar));
        }

        public Builder sigma(@Nullable Output<String> sigma) {
            $.sigma = sigma;
            return this;
        }

        public Builder sigma(String sigma) {
            return sigma(Output.of(sigma));
        }

        public Builder sigmaVar(@Nullable Output<String> sigmaVar) {
            $.sigmaVar = sigmaVar;
            return this;
        }

        public Builder sigmaVar(String sigmaVar) {
            return sigmaVar(Output.of(sigmaVar));
        }

        public Builder threshold(@Nullable Output<String> threshold) {
            $.threshold = threshold;
            return this;
        }

        public Builder threshold(String threshold) {
            return threshold(Output.of(threshold));
        }

        public Builder thresholdVar(@Nullable Output<String> thresholdVar) {
            $.thresholdVar = thresholdVar;
            return this;
        }

        public Builder thresholdVar(String thresholdVar) {
            return thresholdVar(Output.of(thresholdVar));
        }

        public GetImagingPolicyImagePolicyTransformationUnsharpMaskArgs build() {
            return $;
        }
    }

}
