// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mypkg.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FuncWithDefaultValueArgs extends com.pulumi.resources.InvokeArgs {

    public static final FuncWithDefaultValueArgs Empty = new FuncWithDefaultValueArgs();

    @Import(name="a", required=true)
    private Output<String> a;

    public Output<String> a() {
        return this.a;
    }

    @Import(name="b")
    private @Nullable Output<String> b;

    public Optional<Output<String>> b() {
        return Optional.ofNullable(this.b);
    }

    private FuncWithDefaultValueArgs() {}

    private FuncWithDefaultValueArgs(FuncWithDefaultValueArgs $) {
        this.a = $.a;
        this.b = $.b;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FuncWithDefaultValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FuncWithDefaultValueArgs $;

        public Builder() {
            $ = new FuncWithDefaultValueArgs();
        }

        public Builder(FuncWithDefaultValueArgs defaults) {
            $ = new FuncWithDefaultValueArgs(Objects.requireNonNull(defaults));
        }

        public Builder a(Output<String> a) {
            $.a = a;
            return this;
        }

        public Builder a(String a) {
            return a(Output.of(a));
        }

        public Builder b(@Nullable Output<String> b) {
            $.b = b;
            return this;
        }

        public Builder b(String b) {
            return b(Output.of(b));
        }

        public FuncWithDefaultValueArgs build() {
            if ($.a == null) {
                throw new MissingRequiredPropertyException("FuncWithDefaultValueArgs", "a");
            }
            $.b = Codegen.stringProp("b").output().arg($.b).def("b-default").getNullable();
            return $;
        }
    }

}
