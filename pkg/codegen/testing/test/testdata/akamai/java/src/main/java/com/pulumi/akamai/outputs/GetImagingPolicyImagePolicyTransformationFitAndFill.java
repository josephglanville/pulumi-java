// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformation;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyTransformationFitAndFill {
    private @Nullable GetImagingPolicyImagePolicyTransformation fillTransformation;
    private @Nullable String height;
    private @Nullable String heightVar;
    private @Nullable String width;
    private @Nullable String widthVar;

    private GetImagingPolicyImagePolicyTransformationFitAndFill() {}
    public Optional<GetImagingPolicyImagePolicyTransformation> fillTransformation() {
        return Optional.ofNullable(this.fillTransformation);
    }
    public Optional<String> height() {
        return Optional.ofNullable(this.height);
    }
    public Optional<String> heightVar() {
        return Optional.ofNullable(this.heightVar);
    }
    public Optional<String> width() {
        return Optional.ofNullable(this.width);
    }
    public Optional<String> widthVar() {
        return Optional.ofNullable(this.widthVar);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyTransformationFitAndFill defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetImagingPolicyImagePolicyTransformation fillTransformation;
        private @Nullable String height;
        private @Nullable String heightVar;
        private @Nullable String width;
        private @Nullable String widthVar;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyTransformationFitAndFill defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fillTransformation = defaults.fillTransformation;
    	      this.height = defaults.height;
    	      this.heightVar = defaults.heightVar;
    	      this.width = defaults.width;
    	      this.widthVar = defaults.widthVar;
        }

        @CustomType.Setter
        public Builder fillTransformation(@Nullable GetImagingPolicyImagePolicyTransformation fillTransformation) {

            this.fillTransformation = fillTransformation;
            return this;
        }
        @CustomType.Setter
        public Builder height(@Nullable String height) {

            this.height = height;
            return this;
        }
        @CustomType.Setter
        public Builder heightVar(@Nullable String heightVar) {

            this.heightVar = heightVar;
            return this;
        }
        @CustomType.Setter
        public Builder width(@Nullable String width) {

            this.width = width;
            return this;
        }
        @CustomType.Setter
        public Builder widthVar(@Nullable String widthVar) {

            this.widthVar = widthVar;
            return this;
        }
        public GetImagingPolicyImagePolicyTransformationFitAndFill build() {
            final var _resultValue = new GetImagingPolicyImagePolicyTransformationFitAndFill();
            _resultValue.fillTransformation = fillTransformation;
            _resultValue.height = height;
            _resultValue.heightVar = heightVar;
            _resultValue.width = width;
            _resultValue.widthVar = widthVar;
            return _resultValue;
        }
    }
}
