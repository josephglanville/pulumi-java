// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyTransformationMonoHue {
    private @Nullable String hue;
    private @Nullable String hueVar;

    private GetImagingPolicyImagePolicyTransformationMonoHue() {}
    public Optional<String> hue() {
        return Optional.ofNullable(this.hue);
    }
    public Optional<String> hueVar() {
        return Optional.ofNullable(this.hueVar);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyTransformationMonoHue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String hue;
        private @Nullable String hueVar;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyTransformationMonoHue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hue = defaults.hue;
    	      this.hueVar = defaults.hueVar;
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
        public GetImagingPolicyImagePolicyTransformationMonoHue build() {
            final var _resultValue = new GetImagingPolicyImagePolicyTransformationMonoHue();
            _resultValue.hue = hue;
            _resultValue.hueVar = hueVar;
            return _resultValue;
        }
    }
}
