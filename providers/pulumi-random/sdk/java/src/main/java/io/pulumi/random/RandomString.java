// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.random;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.random.RandomStringArgs;
import io.pulumi.random.Utilities;
import io.pulumi.random.inputs.RandomStringState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="random:index/randomString:RandomString")
public class RandomString extends io.pulumi.resources.CustomResource {
    @OutputExport(name="keepers", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> keepers;

    public Output</* @Nullable */ Map<String,Object>> getKeepers() {
        return this.keepers;
    }
    @OutputExport(name="length", type=Integer.class, parameters={})
    private Output<Integer> length;

    public Output<Integer> getLength() {
        return this.length;
    }
    @OutputExport(name="lower", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> lower;

    public Output</* @Nullable */ Boolean> getLower() {
        return this.lower;
    }
    @OutputExport(name="minLower", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minLower;

    public Output</* @Nullable */ Integer> getMinLower() {
        return this.minLower;
    }
    @OutputExport(name="minNumeric", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minNumeric;

    public Output</* @Nullable */ Integer> getMinNumeric() {
        return this.minNumeric;
    }
    @OutputExport(name="minSpecial", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minSpecial;

    public Output</* @Nullable */ Integer> getMinSpecial() {
        return this.minSpecial;
    }
    @OutputExport(name="minUpper", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minUpper;

    public Output</* @Nullable */ Integer> getMinUpper() {
        return this.minUpper;
    }
    @OutputExport(name="number", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> number;

    public Output</* @Nullable */ Boolean> getNumber() {
        return this.number;
    }
    @OutputExport(name="overrideSpecial", type=String.class, parameters={})
    private Output</* @Nullable */ String> overrideSpecial;

    public Output</* @Nullable */ String> getOverrideSpecial() {
        return this.overrideSpecial;
    }
    @OutputExport(name="result", type=String.class, parameters={})
    private Output<String> result;

    public Output<String> getResult() {
        return this.result;
    }
    @OutputExport(name="special", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> special;

    public Output</* @Nullable */ Boolean> getSpecial() {
        return this.special;
    }
    @OutputExport(name="upper", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> upper;

    public Output</* @Nullable */ Boolean> getUpper() {
        return this.upper;
    }

    public RandomString(String name, RandomStringArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("random:index/randomString:RandomString", name, args == null ? RandomStringArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RandomString(String name, Input<String> id, @Nullable RandomStringState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("random:index/randomString:RandomString", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static RandomString get(String name, Input<String> id, @Nullable RandomStringState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RandomString(name, id, state, options);
    }
}
