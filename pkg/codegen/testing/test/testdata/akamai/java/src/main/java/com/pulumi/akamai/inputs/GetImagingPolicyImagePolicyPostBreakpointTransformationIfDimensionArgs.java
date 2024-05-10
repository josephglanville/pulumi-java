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


public final class GetImagingPolicyImagePolicyPostBreakpointTransformationIfDimensionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyImagePolicyPostBreakpointTransformationIfDimensionArgs Empty = new GetImagingPolicyImagePolicyPostBreakpointTransformationIfDimensionArgs();

    @Import(name="default")
    private @Nullable Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs> default_;

    public Optional<Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs>> default_() {
        return Optional.ofNullable(this.default_);
    }

    @Import(name="dimension")
    private @Nullable Output<String> dimension;

    public Optional<Output<String>> dimension() {
        return Optional.ofNullable(this.dimension);
    }

    @Import(name="dimensionVar")
    private @Nullable Output<String> dimensionVar;

    public Optional<Output<String>> dimensionVar() {
        return Optional.ofNullable(this.dimensionVar);
    }

    @Import(name="equal")
    private @Nullable Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs> equal;

    public Optional<Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs>> equal() {
        return Optional.ofNullable(this.equal);
    }

    @Import(name="greaterThan")
    private @Nullable Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs> greaterThan;

    public Optional<Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs>> greaterThan() {
        return Optional.ofNullable(this.greaterThan);
    }

    @Import(name="lessThan")
    private @Nullable Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs> lessThan;

    public Optional<Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs>> lessThan() {
        return Optional.ofNullable(this.lessThan);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    @Import(name="valueVar")
    private @Nullable Output<String> valueVar;

    public Optional<Output<String>> valueVar() {
        return Optional.ofNullable(this.valueVar);
    }

    private GetImagingPolicyImagePolicyPostBreakpointTransformationIfDimensionArgs() {}

    private GetImagingPolicyImagePolicyPostBreakpointTransformationIfDimensionArgs(GetImagingPolicyImagePolicyPostBreakpointTransformationIfDimensionArgs $) {
        this.default_ = $.default_;
        this.dimension = $.dimension;
        this.dimensionVar = $.dimensionVar;
        this.equal = $.equal;
        this.greaterThan = $.greaterThan;
        this.lessThan = $.lessThan;
        this.value = $.value;
        this.valueVar = $.valueVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyPostBreakpointTransformationIfDimensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyPostBreakpointTransformationIfDimensionArgs $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationIfDimensionArgs();
        }

        public Builder(GetImagingPolicyImagePolicyPostBreakpointTransformationIfDimensionArgs defaults) {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationIfDimensionArgs(Objects.requireNonNull(defaults));
        }

        public Builder default_(@Nullable Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs> default_) {
            $.default_ = default_;
            return this;
        }

        public Builder default_(GetImagingPolicyImagePolicyPostBreakpointTransformationArgs default_) {
            return default_(Output.of(default_));
        }

        public Builder dimension(@Nullable Output<String> dimension) {
            $.dimension = dimension;
            return this;
        }

        public Builder dimension(String dimension) {
            return dimension(Output.of(dimension));
        }

        public Builder dimensionVar(@Nullable Output<String> dimensionVar) {
            $.dimensionVar = dimensionVar;
            return this;
        }

        public Builder dimensionVar(String dimensionVar) {
            return dimensionVar(Output.of(dimensionVar));
        }

        public Builder equal(@Nullable Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs> equal) {
            $.equal = equal;
            return this;
        }

        public Builder equal(GetImagingPolicyImagePolicyPostBreakpointTransformationArgs equal) {
            return equal(Output.of(equal));
        }

        public Builder greaterThan(@Nullable Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs> greaterThan) {
            $.greaterThan = greaterThan;
            return this;
        }

        public Builder greaterThan(GetImagingPolicyImagePolicyPostBreakpointTransformationArgs greaterThan) {
            return greaterThan(Output.of(greaterThan));
        }

        public Builder lessThan(@Nullable Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs> lessThan) {
            $.lessThan = lessThan;
            return this;
        }

        public Builder lessThan(GetImagingPolicyImagePolicyPostBreakpointTransformationArgs lessThan) {
            return lessThan(Output.of(lessThan));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public Builder valueVar(@Nullable Output<String> valueVar) {
            $.valueVar = valueVar;
            return this;
        }

        public Builder valueVar(String valueVar) {
            return valueVar(Output.of(valueVar));
        }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationIfDimensionArgs build() {
            return $;
        }
    }

}
