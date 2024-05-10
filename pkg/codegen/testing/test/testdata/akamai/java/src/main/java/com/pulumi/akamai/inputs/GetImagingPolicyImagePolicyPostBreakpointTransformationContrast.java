// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyPostBreakpointTransformationContrast extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyImagePolicyPostBreakpointTransformationContrast Empty = new GetImagingPolicyImagePolicyPostBreakpointTransformationContrast();

    @Import(name="brightness")
    private @Nullable String brightness;

    public Optional<String> brightness() {
        return Optional.ofNullable(this.brightness);
    }

    @Import(name="brightnessVar")
    private @Nullable String brightnessVar;

    public Optional<String> brightnessVar() {
        return Optional.ofNullable(this.brightnessVar);
    }

    @Import(name="contrast")
    private @Nullable String contrast;

    public Optional<String> contrast() {
        return Optional.ofNullable(this.contrast);
    }

    @Import(name="contrastVar")
    private @Nullable String contrastVar;

    public Optional<String> contrastVar() {
        return Optional.ofNullable(this.contrastVar);
    }

    private GetImagingPolicyImagePolicyPostBreakpointTransformationContrast() {}

    private GetImagingPolicyImagePolicyPostBreakpointTransformationContrast(GetImagingPolicyImagePolicyPostBreakpointTransformationContrast $) {
        this.brightness = $.brightness;
        this.brightnessVar = $.brightnessVar;
        this.contrast = $.contrast;
        this.contrastVar = $.contrastVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyPostBreakpointTransformationContrast defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyPostBreakpointTransformationContrast $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationContrast();
        }

        public Builder(GetImagingPolicyImagePolicyPostBreakpointTransformationContrast defaults) {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationContrast(Objects.requireNonNull(defaults));
        }

        public Builder brightness(@Nullable String brightness) {
            $.brightness = brightness;
            return this;
        }

        public Builder brightnessVar(@Nullable String brightnessVar) {
            $.brightnessVar = brightnessVar;
            return this;
        }

        public Builder contrast(@Nullable String contrast) {
            $.contrast = contrast;
            return this;
        }

        public Builder contrastVar(@Nullable String contrastVar) {
            $.contrastVar = contrastVar;
            return this;
        }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationContrast build() {
            return $;
        }
    }

}
