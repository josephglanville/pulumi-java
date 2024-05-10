// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationRemoveColorArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyImagePolicyTransformationRemoveColorArgs Empty = new GetImagingPolicyImagePolicyTransformationRemoveColorArgs();

    @Import(name="color")
    private @Nullable Output<String> color;

    public Optional<Output<String>> color() {
        return Optional.ofNullable(this.color);
    }

    @Import(name="colorVar")
    private @Nullable Output<String> colorVar;

    public Optional<Output<String>> colorVar() {
        return Optional.ofNullable(this.colorVar);
    }

    @Import(name="feather")
    private @Nullable Output<String> feather;

    public Optional<Output<String>> feather() {
        return Optional.ofNullable(this.feather);
    }

    @Import(name="featherVar")
    private @Nullable Output<String> featherVar;

    public Optional<Output<String>> featherVar() {
        return Optional.ofNullable(this.featherVar);
    }

    @Import(name="tolerance")
    private @Nullable Output<String> tolerance;

    public Optional<Output<String>> tolerance() {
        return Optional.ofNullable(this.tolerance);
    }

    @Import(name="toleranceVar")
    private @Nullable Output<String> toleranceVar;

    public Optional<Output<String>> toleranceVar() {
        return Optional.ofNullable(this.toleranceVar);
    }

    private GetImagingPolicyImagePolicyTransformationRemoveColorArgs() {}

    private GetImagingPolicyImagePolicyTransformationRemoveColorArgs(GetImagingPolicyImagePolicyTransformationRemoveColorArgs $) {
        this.color = $.color;
        this.colorVar = $.colorVar;
        this.feather = $.feather;
        this.featherVar = $.featherVar;
        this.tolerance = $.tolerance;
        this.toleranceVar = $.toleranceVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationRemoveColorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationRemoveColorArgs $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationRemoveColorArgs();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationRemoveColorArgs defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationRemoveColorArgs(Objects.requireNonNull(defaults));
        }

        public Builder color(@Nullable Output<String> color) {
            $.color = color;
            return this;
        }

        public Builder color(String color) {
            return color(Output.of(color));
        }

        public Builder colorVar(@Nullable Output<String> colorVar) {
            $.colorVar = colorVar;
            return this;
        }

        public Builder colorVar(String colorVar) {
            return colorVar(Output.of(colorVar));
        }

        public Builder feather(@Nullable Output<String> feather) {
            $.feather = feather;
            return this;
        }

        public Builder feather(String feather) {
            return feather(Output.of(feather));
        }

        public Builder featherVar(@Nullable Output<String> featherVar) {
            $.featherVar = featherVar;
            return this;
        }

        public Builder featherVar(String featherVar) {
            return featherVar(Output.of(featherVar));
        }

        public Builder tolerance(@Nullable Output<String> tolerance) {
            $.tolerance = tolerance;
            return this;
        }

        public Builder tolerance(String tolerance) {
            return tolerance(Output.of(tolerance));
        }

        public Builder toleranceVar(@Nullable Output<String> toleranceVar) {
            $.toleranceVar = toleranceVar;
            return this;
        }

        public Builder toleranceVar(String toleranceVar) {
            return toleranceVar(Output.of(toleranceVar));
        }

        public GetImagingPolicyImagePolicyTransformationRemoveColorArgs build() {
            return $;
        }
    }

}
