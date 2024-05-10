// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyPostBreakpointTransformationRemoveColor {
    private @Nullable String color;
    private @Nullable String colorVar;
    private @Nullable String feather;
    private @Nullable String featherVar;
    private @Nullable String tolerance;
    private @Nullable String toleranceVar;

    private GetImagingPolicyImagePolicyPostBreakpointTransformationRemoveColor() {}
    public Optional<String> color() {
        return Optional.ofNullable(this.color);
    }
    public Optional<String> colorVar() {
        return Optional.ofNullable(this.colorVar);
    }
    public Optional<String> feather() {
        return Optional.ofNullable(this.feather);
    }
    public Optional<String> featherVar() {
        return Optional.ofNullable(this.featherVar);
    }
    public Optional<String> tolerance() {
        return Optional.ofNullable(this.tolerance);
    }
    public Optional<String> toleranceVar() {
        return Optional.ofNullable(this.toleranceVar);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyPostBreakpointTransformationRemoveColor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String color;
        private @Nullable String colorVar;
        private @Nullable String feather;
        private @Nullable String featherVar;
        private @Nullable String tolerance;
        private @Nullable String toleranceVar;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyPostBreakpointTransformationRemoveColor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.color = defaults.color;
    	      this.colorVar = defaults.colorVar;
    	      this.feather = defaults.feather;
    	      this.featherVar = defaults.featherVar;
    	      this.tolerance = defaults.tolerance;
    	      this.toleranceVar = defaults.toleranceVar;
        }

        @CustomType.Setter
        public Builder color(@Nullable String color) {

            this.color = color;
            return this;
        }
        @CustomType.Setter
        public Builder colorVar(@Nullable String colorVar) {

            this.colorVar = colorVar;
            return this;
        }
        @CustomType.Setter
        public Builder feather(@Nullable String feather) {

            this.feather = feather;
            return this;
        }
        @CustomType.Setter
        public Builder featherVar(@Nullable String featherVar) {

            this.featherVar = featherVar;
            return this;
        }
        @CustomType.Setter
        public Builder tolerance(@Nullable String tolerance) {

            this.tolerance = tolerance;
            return this;
        }
        @CustomType.Setter
        public Builder toleranceVar(@Nullable String toleranceVar) {

            this.toleranceVar = toleranceVar;
            return this;
        }
        public GetImagingPolicyImagePolicyPostBreakpointTransformationRemoveColor build() {
            final var _resultValue = new GetImagingPolicyImagePolicyPostBreakpointTransformationRemoveColor();
            _resultValue.color = color;
            _resultValue.colorVar = colorVar;
            _resultValue.feather = feather;
            _resultValue.featherVar = featherVar;
            _resultValue.tolerance = tolerance;
            _resultValue.toleranceVar = toleranceVar;
            return _resultValue;
        }
    }
}
