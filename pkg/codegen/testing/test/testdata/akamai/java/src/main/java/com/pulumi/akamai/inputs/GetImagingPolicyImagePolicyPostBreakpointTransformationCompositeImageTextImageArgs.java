// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs Empty = new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs();

    @Import(name="fill")
    private @Nullable Output<String> fill;

    public Optional<Output<String>> fill() {
        return Optional.ofNullable(this.fill);
    }

    @Import(name="fillVar")
    private @Nullable Output<String> fillVar;

    public Optional<Output<String>> fillVar() {
        return Optional.ofNullable(this.fillVar);
    }

    @Import(name="size")
    private @Nullable Output<String> size;

    public Optional<Output<String>> size() {
        return Optional.ofNullable(this.size);
    }

    @Import(name="sizeVar")
    private @Nullable Output<String> sizeVar;

    public Optional<Output<String>> sizeVar() {
        return Optional.ofNullable(this.sizeVar);
    }

    @Import(name="stroke")
    private @Nullable Output<String> stroke;

    public Optional<Output<String>> stroke() {
        return Optional.ofNullable(this.stroke);
    }

    @Import(name="strokeSize")
    private @Nullable Output<String> strokeSize;

    public Optional<Output<String>> strokeSize() {
        return Optional.ofNullable(this.strokeSize);
    }

    @Import(name="strokeSizeVar")
    private @Nullable Output<String> strokeSizeVar;

    public Optional<Output<String>> strokeSizeVar() {
        return Optional.ofNullable(this.strokeSizeVar);
    }

    @Import(name="strokeVar")
    private @Nullable Output<String> strokeVar;

    public Optional<Output<String>> strokeVar() {
        return Optional.ofNullable(this.strokeVar);
    }

    @Import(name="text")
    private @Nullable Output<String> text;

    public Optional<Output<String>> text() {
        return Optional.ofNullable(this.text);
    }

    @Import(name="textVar")
    private @Nullable Output<String> textVar;

    public Optional<Output<String>> textVar() {
        return Optional.ofNullable(this.textVar);
    }

    @Import(name="transformation")
    private @Nullable Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs> transformation;

    public Optional<Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs>> transformation() {
        return Optional.ofNullable(this.transformation);
    }

    @Import(name="typeface")
    private @Nullable Output<String> typeface;

    public Optional<Output<String>> typeface() {
        return Optional.ofNullable(this.typeface);
    }

    @Import(name="typefaceVar")
    private @Nullable Output<String> typefaceVar;

    public Optional<Output<String>> typefaceVar() {
        return Optional.ofNullable(this.typefaceVar);
    }

    private GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs() {}

    private GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs $) {
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
    public static Builder builder(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs();
        }

        public Builder(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs defaults) {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs(Objects.requireNonNull(defaults));
        }

        public Builder fill(@Nullable Output<String> fill) {
            $.fill = fill;
            return this;
        }

        public Builder fill(String fill) {
            return fill(Output.of(fill));
        }

        public Builder fillVar(@Nullable Output<String> fillVar) {
            $.fillVar = fillVar;
            return this;
        }

        public Builder fillVar(String fillVar) {
            return fillVar(Output.of(fillVar));
        }

        public Builder size(@Nullable Output<String> size) {
            $.size = size;
            return this;
        }

        public Builder size(String size) {
            return size(Output.of(size));
        }

        public Builder sizeVar(@Nullable Output<String> sizeVar) {
            $.sizeVar = sizeVar;
            return this;
        }

        public Builder sizeVar(String sizeVar) {
            return sizeVar(Output.of(sizeVar));
        }

        public Builder stroke(@Nullable Output<String> stroke) {
            $.stroke = stroke;
            return this;
        }

        public Builder stroke(String stroke) {
            return stroke(Output.of(stroke));
        }

        public Builder strokeSize(@Nullable Output<String> strokeSize) {
            $.strokeSize = strokeSize;
            return this;
        }

        public Builder strokeSize(String strokeSize) {
            return strokeSize(Output.of(strokeSize));
        }

        public Builder strokeSizeVar(@Nullable Output<String> strokeSizeVar) {
            $.strokeSizeVar = strokeSizeVar;
            return this;
        }

        public Builder strokeSizeVar(String strokeSizeVar) {
            return strokeSizeVar(Output.of(strokeSizeVar));
        }

        public Builder strokeVar(@Nullable Output<String> strokeVar) {
            $.strokeVar = strokeVar;
            return this;
        }

        public Builder strokeVar(String strokeVar) {
            return strokeVar(Output.of(strokeVar));
        }

        public Builder text(@Nullable Output<String> text) {
            $.text = text;
            return this;
        }

        public Builder text(String text) {
            return text(Output.of(text));
        }

        public Builder textVar(@Nullable Output<String> textVar) {
            $.textVar = textVar;
            return this;
        }

        public Builder textVar(String textVar) {
            return textVar(Output.of(textVar));
        }

        public Builder transformation(@Nullable Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs> transformation) {
            $.transformation = transformation;
            return this;
        }

        public Builder transformation(GetImagingPolicyImagePolicyPostBreakpointTransformationArgs transformation) {
            return transformation(Output.of(transformation));
        }

        public Builder typeface(@Nullable Output<String> typeface) {
            $.typeface = typeface;
            return this;
        }

        public Builder typeface(String typeface) {
            return typeface(Output.of(typeface));
        }

        public Builder typefaceVar(@Nullable Output<String> typefaceVar) {
            $.typefaceVar = typefaceVar;
            return this;
        }

        public Builder typefaceVar(String typefaceVar) {
            return typefaceVar(Output.of(typefaceVar));
        }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs build() {
            return $;
        }
    }

}
