// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationHsvArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyImagePolicyTransformationHsvArgs Empty = new GetImagingPolicyImagePolicyTransformationHsvArgs();

    @Import(name="hue")
    private @Nullable Output<String> hue;

    public Optional<Output<String>> hue() {
        return Optional.ofNullable(this.hue);
    }

    @Import(name="hueVar")
    private @Nullable Output<String> hueVar;

    public Optional<Output<String>> hueVar() {
        return Optional.ofNullable(this.hueVar);
    }

    @Import(name="saturation")
    private @Nullable Output<String> saturation;

    public Optional<Output<String>> saturation() {
        return Optional.ofNullable(this.saturation);
    }

    @Import(name="saturationVar")
    private @Nullable Output<String> saturationVar;

    public Optional<Output<String>> saturationVar() {
        return Optional.ofNullable(this.saturationVar);
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

    private GetImagingPolicyImagePolicyTransformationHsvArgs() {}

    private GetImagingPolicyImagePolicyTransformationHsvArgs(GetImagingPolicyImagePolicyTransformationHsvArgs $) {
        this.hue = $.hue;
        this.hueVar = $.hueVar;
        this.saturation = $.saturation;
        this.saturationVar = $.saturationVar;
        this.value = $.value;
        this.valueVar = $.valueVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationHsvArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationHsvArgs $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationHsvArgs();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationHsvArgs defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationHsvArgs(Objects.requireNonNull(defaults));
        }

        public Builder hue(@Nullable Output<String> hue) {
            $.hue = hue;
            return this;
        }

        public Builder hue(String hue) {
            return hue(Output.of(hue));
        }

        public Builder hueVar(@Nullable Output<String> hueVar) {
            $.hueVar = hueVar;
            return this;
        }

        public Builder hueVar(String hueVar) {
            return hueVar(Output.of(hueVar));
        }

        public Builder saturation(@Nullable Output<String> saturation) {
            $.saturation = saturation;
            return this;
        }

        public Builder saturation(String saturation) {
            return saturation(Output.of(saturation));
        }

        public Builder saturationVar(@Nullable Output<String> saturationVar) {
            $.saturationVar = saturationVar;
            return this;
        }

        public Builder saturationVar(String saturationVar) {
            return saturationVar(Output.of(saturationVar));
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

        public GetImagingPolicyImagePolicyTransformationHsvArgs build() {
            return $;
        }
    }

}
