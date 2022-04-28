// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.example;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.example.inputs.FooArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ComponentArgs extends ResourceArgs {

    public static final ComponentArgs Empty = new ComponentArgs();

    @Import(name="a", required=true)
    private Boolean a;

    public Boolean a() {
        return this.a;
    }

    @Import(name="b")
    private @Nullable Boolean b;

    public Optional<Boolean> b() {
        return Optional.ofNullable(this.b);
    }

    @Import(name="bar")
    private @Nullable FooArgs bar;

    public Optional<FooArgs> bar() {
        return Optional.ofNullable(this.bar);
    }

    @Import(name="baz")
    private @Nullable List<FooArgs> baz;

    public Optional<List<FooArgs>> baz() {
        return Optional.ofNullable(this.baz);
    }

    @Import(name="bazMap")
    private @Nullable Map<String,FooArgs> bazMap;

    public Optional<Map<String,FooArgs>> bazMap() {
        return Optional.ofNullable(this.bazMap);
    }

    @Import(name="c", required=true)
    private Integer c;

    public Integer c() {
        return this.c;
    }

    @Import(name="d")
    private @Nullable Integer d;

    public Optional<Integer> d() {
        return Optional.ofNullable(this.d);
    }

    @Import(name="e", required=true)
    private String e;

    public String e() {
        return this.e;
    }

    @Import(name="f")
    private @Nullable String f;

    public Optional<String> f() {
        return Optional.ofNullable(this.f);
    }

    @Import(name="foo")
    private @Nullable Output<FooArgs> foo;

    public Optional<Output<FooArgs>> foo() {
        return Optional.ofNullable(this.foo);
    }

    private ComponentArgs() {}

    private ComponentArgs(ComponentArgs $) {
        this.a = $.a;
        this.b = $.b;
        this.bar = $.bar;
        this.baz = $.baz;
        this.bazMap = $.bazMap;
        this.c = $.c;
        this.d = $.d;
        this.e = $.e;
        this.f = $.f;
        this.foo = $.foo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComponentArgs $;

        public Builder() {
            $ = new ComponentArgs();
        }

        public Builder(ComponentArgs defaults) {
            $ = new ComponentArgs(Objects.requireNonNull(defaults));
        }

        public Builder a(Boolean a) {
            $.a = a;
            return this;
        }

        public Builder b(@Nullable Boolean b) {
            $.b = b;
            return this;
        }

        public Builder bar(@Nullable FooArgs bar) {
            $.bar = bar;
            return this;
        }

        public Builder baz(@Nullable List<FooArgs> baz) {
            $.baz = baz;
            return this;
        }

        public Builder baz(FooArgs... baz) {
            return baz(List.of(baz));
        }

        public Builder bazMap(@Nullable Map<String,FooArgs> bazMap) {
            $.bazMap = bazMap;
            return this;
        }

        public Builder c(Integer c) {
            $.c = c;
            return this;
        }

        public Builder d(@Nullable Integer d) {
            $.d = d;
            return this;
        }

        public Builder e(String e) {
            $.e = e;
            return this;
        }

        public Builder f(@Nullable String f) {
            $.f = f;
            return this;
        }

        public Builder foo(@Nullable Output<FooArgs> foo) {
            $.foo = foo;
            return this;
        }

        public Builder foo(FooArgs foo) {
            return foo(Output.of(foo));
        }

        public ComponentArgs build() {
            $.a = Objects.requireNonNull($.a, "expected parameter 'a' to be non-null");
            $.c = Objects.requireNonNull($.c, "expected parameter 'c' to be non-null");
            $.e = Objects.requireNonNull($.e, "expected parameter 'e' to be non-null");
            return $;
        }
    }

}
