// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyPostBreakpointTransformationHsv {
    private @Nullable String hue;
    private @Nullable String hueVar;
    private @Nullable String saturation;
    private @Nullable String saturationVar;
    private @Nullable String value;
    private @Nullable String valueVar;

    private GetImagingPolicyImagePolicyPostBreakpointTransformationHsv() {}
    public Optional<String> hue() {
        return Optional.ofNullable(this.hue);
    }
    public Optional<String> hueVar() {
        return Optional.ofNullable(this.hueVar);
    }
    public Optional<String> saturation() {
        return Optional.ofNullable(this.saturation);
    }
    public Optional<String> saturationVar() {
        return Optional.ofNullable(this.saturationVar);
    }
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }
    public Optional<String> valueVar() {
        return Optional.ofNullable(this.valueVar);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyPostBreakpointTransformationHsv defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String hue;
        private @Nullable String hueVar;
        private @Nullable String saturation;
        private @Nullable String saturationVar;
        private @Nullable String value;
        private @Nullable String valueVar;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyPostBreakpointTransformationHsv defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hue = defaults.hue;
    	      this.hueVar = defaults.hueVar;
    	      this.saturation = defaults.saturation;
    	      this.saturationVar = defaults.saturationVar;
    	      this.value = defaults.value;
    	      this.valueVar = defaults.valueVar;
        }

        @CustomType.Setter
        public Builder hue(@Nullable String hue) {

            this.hue = hue;
            return this;
        }
        @CustomType.Setter
        public Builder hueVar(@Nullable String hueVar) {

            this.hueVar = hueVar;
            return this;
        }
        @CustomType.Setter
        public Builder saturation(@Nullable String saturation) {

            this.saturation = saturation;
            return this;
        }
        @CustomType.Setter
        public Builder saturationVar(@Nullable String saturationVar) {

            this.saturationVar = saturationVar;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        @CustomType.Setter
        public Builder valueVar(@Nullable String valueVar) {

            this.valueVar = valueVar;
            return this;
        }
        public GetImagingPolicyImagePolicyPostBreakpointTransformationHsv build() {
            final var _resultValue = new GetImagingPolicyImagePolicyPostBreakpointTransformationHsv();
            _resultValue.hue = hue;
            _resultValue.hueVar = hueVar;
            _resultValue.saturation = saturation;
            _resultValue.saturationVar = saturationVar;
            _resultValue.value = value;
            _resultValue.valueVar = valueVar;
            return _resultValue;
        }
    }
}
