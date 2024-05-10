// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyTransformation;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationAppendImageTextImage extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyImagePolicyTransformationAppendImageTextImage Empty = new GetImagingPolicyImagePolicyTransformationAppendImageTextImage();

    @Import(name="fill")
    private @Nullable String fill;

    public Optional<String> fill() {
        return Optional.ofNullable(this.fill);
    }

    @Import(name="fillVar")
    private @Nullable String fillVar;

    public Optional<String> fillVar() {
        return Optional.ofNullable(this.fillVar);
    }

    @Import(name="size")
    private @Nullable String size;

    public Optional<String> size() {
        return Optional.ofNullable(this.size);
    }

    @Import(name="sizeVar")
    private @Nullable String sizeVar;

    public Optional<String> sizeVar() {
        return Optional.ofNullable(this.sizeVar);
    }

    @Import(name="stroke")
    private @Nullable String stroke;

    public Optional<String> stroke() {
        return Optional.ofNullable(this.stroke);
    }

    @Import(name="strokeSize")
    private @Nullable String strokeSize;

    public Optional<String> strokeSize() {
        return Optional.ofNullable(this.strokeSize);
    }

    @Import(name="strokeSizeVar")
    private @Nullable String strokeSizeVar;

    public Optional<String> strokeSizeVar() {
        return Optional.ofNullable(this.strokeSizeVar);
    }

    @Import(name="strokeVar")
    private @Nullable String strokeVar;

    public Optional<String> strokeVar() {
        return Optional.ofNullable(this.strokeVar);
    }

    @Import(name="text")
    private @Nullable String text;

    public Optional<String> text() {
        return Optional.ofNullable(this.text);
    }

    @Import(name="textVar")
    private @Nullable String textVar;

    public Optional<String> textVar() {
        return Optional.ofNullable(this.textVar);
    }

    @Import(name="transformation")
    private @Nullable GetImagingPolicyImagePolicyTransformation transformation;

    public Optional<GetImagingPolicyImagePolicyTransformation> transformation() {
        return Optional.ofNullable(this.transformation);
    }

    @Import(name="typeface")
    private @Nullable String typeface;

    public Optional<String> typeface() {
        return Optional.ofNullable(this.typeface);
    }

    @Import(name="typefaceVar")
    private @Nullable String typefaceVar;

    public Optional<String> typefaceVar() {
        return Optional.ofNullable(this.typefaceVar);
    }

    private GetImagingPolicyImagePolicyTransformationAppendImageTextImage() {}

    private GetImagingPolicyImagePolicyTransformationAppendImageTextImage(GetImagingPolicyImagePolicyTransformationAppendImageTextImage $) {
        this.fill = $.fill;
        this.fillVar = $.fillVar;
        this.size = $.size;
        this.sizeVar = $.sizeVar;
        this.stroke = $.stroke;
        this.strokeSize = $.strokeSize;
        this.strokeSizeVar = $.strokeSizeVar;
        this.strokeVar = $.strokeVar;
        this.text = $.text;
        this.textVar = $.textVar;
        this.transformation = $.transformation;
        this.typeface = $.typeface;
        this.typefaceVar = $.typefaceVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationAppendImageTextImage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationAppendImageTextImage $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationAppendImageTextImage();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationAppendImageTextImage defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationAppendImageTextImage(Objects.requireNonNull(defaults));
        }

        public Builder fill(@Nullable String fill) {
            $.fill = fill;
            return this;
        }

        public Builder fillVar(@Nullable String fillVar) {
            $.fillVar = fillVar;
            return this;
        }

        public Builder size(@Nullable String size) {
            $.size = size;
            return this;
        }

        public Builder sizeVar(@Nullable String sizeVar) {
            $.sizeVar = sizeVar;
            return this;
        }

        public Builder stroke(@Nullable String stroke) {
            $.stroke = stroke;
            return this;
        }

        public Builder strokeSize(@Nullable String strokeSize) {
            $.strokeSize = strokeSize;
            return this;
        }

        public Builder strokeSizeVar(@Nullable String strokeSizeVar) {
            $.strokeSizeVar = strokeSizeVar;
            return this;
        }

        public Builder strokeVar(@Nullable String strokeVar) {
            $.strokeVar = strokeVar;
            return this;
        }

        public Builder text(@Nullable String text) {
            $.text = text;
            return this;
        }

        public Builder textVar(@Nullable String textVar) {
            $.textVar = textVar;
            return this;
        }

        public Builder transformation(@Nullable GetImagingPolicyImagePolicyTransformation transformation) {
            $.transformation = transformation;
            return this;
        }

        public Builder typeface(@Nullable String typeface) {
            $.typeface = typeface;
            return this;
        }

        public Builder typefaceVar(@Nullable String typefaceVar) {
            $.typefaceVar = typefaceVar;
            return this;
        }

        public GetImagingPolicyImagePolicyTransformationAppendImageTextImage build() {
            return $;
        }
    }

}
