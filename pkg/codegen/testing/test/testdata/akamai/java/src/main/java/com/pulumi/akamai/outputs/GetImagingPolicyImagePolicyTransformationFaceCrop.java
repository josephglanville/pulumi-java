// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyTransformationFaceCrop {
    private @Nullable String algorithm;
    private @Nullable String algorithmVar;
    private @Nullable String confidence;
    private @Nullable String confidenceVar;
    private @Nullable String failGravity;
    private @Nullable String failGravityVar;
    private @Nullable String focus;
    private @Nullable String focusVar;
    private @Nullable String gravity;
    private @Nullable String gravityVar;
    private @Nullable String height;
    private @Nullable String heightVar;
    private @Nullable String padding;
    private @Nullable String paddingVar;
    private @Nullable String style;
    private @Nullable String styleVar;
    private @Nullable String width;
    private @Nullable String widthVar;

    private GetImagingPolicyImagePolicyTransformationFaceCrop() {}
    public Optional<String> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }
    public Optional<String> algorithmVar() {
        return Optional.ofNullable(this.algorithmVar);
    }
    public Optional<String> confidence() {
        return Optional.ofNullable(this.confidence);
    }
    public Optional<String> confidenceVar() {
        return Optional.ofNullable(this.confidenceVar);
    }
    public Optional<String> failGravity() {
        return Optional.ofNullable(this.failGravity);
    }
    public Optional<String> failGravityVar() {
        return Optional.ofNullable(this.failGravityVar);
    }
    public Optional<String> focus() {
        return Optional.ofNullable(this.focus);
    }
    public Optional<String> focusVar() {
        return Optional.ofNullable(this.focusVar);
    }
    public Optional<String> gravity() {
        return Optional.ofNullable(this.gravity);
    }
    public Optional<String> gravityVar() {
        return Optional.ofNullable(this.gravityVar);
    }
    public Optional<String> height() {
        return Optional.ofNullable(this.height);
    }
    public Optional<String> heightVar() {
        return Optional.ofNullable(this.heightVar);
    }
    public Optional<String> padding() {
        return Optional.ofNullable(this.padding);
    }
    public Optional<String> paddingVar() {
        return Optional.ofNullable(this.paddingVar);
    }
    public Optional<String> style() {
        return Optional.ofNullable(this.style);
    }
    public Optional<String> styleVar() {
        return Optional.ofNullable(this.styleVar);
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

    public static Builder builder(GetImagingPolicyImagePolicyTransformationFaceCrop defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String algorithm;
        private @Nullable String algorithmVar;
        private @Nullable String confidence;
        private @Nullable String confidenceVar;
        private @Nullable String failGravity;
        private @Nullable String failGravityVar;
        private @Nullable String focus;
        private @Nullable String focusVar;
        private @Nullable String gravity;
        private @Nullable String gravityVar;
        private @Nullable String height;
        private @Nullable String heightVar;
        private @Nullable String padding;
        private @Nullable String paddingVar;
        private @Nullable String style;
        private @Nullable String styleVar;
        private @Nullable String width;
        private @Nullable String widthVar;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyTransformationFaceCrop defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.algorithmVar = defaults.algorithmVar;
    	      this.confidence = defaults.confidence;
    	      this.confidenceVar = defaults.confidenceVar;
    	      this.failGravity = defaults.failGravity;
    	      this.failGravityVar = defaults.failGravityVar;
    	      this.focus = defaults.focus;
    	      this.focusVar = defaults.focusVar;
    	      this.gravity = defaults.gravity;
    	      this.gravityVar = defaults.gravityVar;
    	      this.height = defaults.height;
    	      this.heightVar = defaults.heightVar;
    	      this.padding = defaults.padding;
    	      this.paddingVar = defaults.paddingVar;
    	      this.style = defaults.style;
    	      this.styleVar = defaults.styleVar;
    	      this.width = defaults.width;
    	      this.widthVar = defaults.widthVar;
        }

        @CustomType.Setter
        public Builder algorithm(@Nullable String algorithm) {

            this.algorithm = algorithm;
            return this;
        }
        @CustomType.Setter
        public Builder algorithmVar(@Nullable String algorithmVar) {

            this.algorithmVar = algorithmVar;
            return this;
        }
        @CustomType.Setter
        public Builder confidence(@Nullable String confidence) {

            this.confidence = confidence;
            return this;
        }
        @CustomType.Setter
        public Builder confidenceVar(@Nullable String confidenceVar) {

            this.confidenceVar = confidenceVar;
            return this;
        }
        @CustomType.Setter
        public Builder failGravity(@Nullable String failGravity) {

            this.failGravity = failGravity;
            return this;
        }
        @CustomType.Setter
        public Builder failGravityVar(@Nullable String failGravityVar) {

            this.failGravityVar = failGravityVar;
            return this;
        }
        @CustomType.Setter
        public Builder focus(@Nullable String focus) {

            this.focus = focus;
            return this;
        }
        @CustomType.Setter
        public Builder focusVar(@Nullable String focusVar) {

            this.focusVar = focusVar;
            return this;
        }
        @CustomType.Setter
        public Builder gravity(@Nullable String gravity) {

            this.gravity = gravity;
            return this;
        }
        @CustomType.Setter
        public Builder gravityVar(@Nullable String gravityVar) {

            this.gravityVar = gravityVar;
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
        public Builder padding(@Nullable String padding) {

            this.padding = padding;
            return this;
        }
        @CustomType.Setter
        public Builder paddingVar(@Nullable String paddingVar) {

            this.paddingVar = paddingVar;
            return this;
        }
        @CustomType.Setter
        public Builder style(@Nullable String style) {

            this.style = style;
            return this;
        }
        @CustomType.Setter
        public Builder styleVar(@Nullable String styleVar) {

            this.styleVar = styleVar;
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
        public GetImagingPolicyImagePolicyTransformationFaceCrop build() {
            final var _resultValue = new GetImagingPolicyImagePolicyTransformationFaceCrop();
            _resultValue.algorithm = algorithm;
            _resultValue.algorithmVar = algorithmVar;
            _resultValue.confidence = confidence;
            _resultValue.confidenceVar = confidenceVar;
            _resultValue.failGravity = failGravity;
            _resultValue.failGravityVar = failGravityVar;
            _resultValue.focus = focus;
            _resultValue.focusVar = focusVar;
            _resultValue.gravity = gravity;
            _resultValue.gravityVar = gravityVar;
            _resultValue.height = height;
            _resultValue.heightVar = heightVar;
            _resultValue.padding = padding;
            _resultValue.paddingVar = paddingVar;
            _resultValue.style = style;
            _resultValue.styleVar = styleVar;
            _resultValue.width = width;
            _resultValue.widthVar = widthVar;
            return _resultValue;
        }
    }
}
