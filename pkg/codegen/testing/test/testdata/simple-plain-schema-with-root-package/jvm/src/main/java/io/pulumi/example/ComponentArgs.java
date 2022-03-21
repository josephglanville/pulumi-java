// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.example.inputs.Foo;
import io.pulumi.example.inputs.FooArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ComponentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComponentArgs Empty = new ComponentArgs();

    @Import(name="a", required=true)
      private final Boolean a;

    public Boolean getA() {
        return this.a;
    }

    @Import(name="b")
      private final @Nullable Boolean b;

    public Optional<Boolean> getB() {
        return this.b == null ? Optional.empty() : Optional.ofNullable(this.b);
    }

    @Import(name="bar")
      private final @Nullable Foo bar;

    public Optional<Foo> getBar() {
        return this.bar == null ? Optional.empty() : Optional.ofNullable(this.bar);
    }

    @Import(name="baz")
      private final @Nullable List<Foo> baz;

    public List<Foo> getBaz() {
        return this.baz == null ? List.of() : this.baz;
    }

    @Import(name="c", required=true)
      private final Integer c;

    public Integer getC() {
        return this.c;
    }

    @Import(name="d")
      private final @Nullable Integer d;

    public Optional<Integer> getD() {
        return this.d == null ? Optional.empty() : Optional.ofNullable(this.d);
    }

    @Import(name="e", required=true)
      private final String e;

    public String getE() {
        return this.e;
    }

    @Import(name="f")
      private final @Nullable String f;

    public Optional<String> getF() {
        return this.f == null ? Optional.empty() : Optional.ofNullable(this.f);
    }

    @Import(name="foo")
      private final @Nullable Output<FooArgs> foo;

    public Output<FooArgs> getFoo() {
        return this.foo == null ? Output.empty() : this.foo;
    }

    public ComponentArgs(
        Boolean a,
        @Nullable Boolean b,
        @Nullable Foo bar,
        @Nullable List<Foo> baz,
        Integer c,
        @Nullable Integer d,
        String e,
        @Nullable String f,
        @Nullable Output<FooArgs> foo) {
        this.a = Objects.requireNonNull(a, "expected parameter 'a' to be non-null");
        this.b = b;
        this.bar = bar;
        this.baz = baz;
        this.c = Objects.requireNonNull(c, "expected parameter 'c' to be non-null");
        this.d = d;
        this.e = Objects.requireNonNull(e, "expected parameter 'e' to be non-null");
        this.f = f;
        this.foo = foo;
    }

    private ComponentArgs() {
        this.a = null;
        this.b = null;
        this.bar = null;
        this.baz = List.of();
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.foo = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean a;
        private @Nullable Boolean b;
        private @Nullable Foo bar;
        private @Nullable List<Foo> baz;
        private Integer c;
        private @Nullable Integer d;
        private String e;
        private @Nullable String f;
        private @Nullable Output<FooArgs> foo;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.a = defaults.a;
    	      this.b = defaults.b;
    	      this.bar = defaults.bar;
    	      this.baz = defaults.baz;
    	      this.c = defaults.c;
    	      this.d = defaults.d;
    	      this.e = defaults.e;
    	      this.f = defaults.f;
    	      this.foo = defaults.foo;
        }

        public Builder a(Boolean a) {
            this.a = Objects.requireNonNull(a);
            return this;
        }
        public Builder b(@Nullable Boolean b) {
            this.b = b;
            return this;
        }
        public Builder bar(@Nullable Foo bar) {
            this.bar = bar;
            return this;
        }
        public Builder baz(@Nullable List<Foo> baz) {
            this.baz = baz;
            return this;
        }
        public Builder baz(Foo... baz) {
            return baz(List.of(baz));
        }
        public Builder c(Integer c) {
            this.c = Objects.requireNonNull(c);
            return this;
        }
        public Builder d(@Nullable Integer d) {
            this.d = d;
            return this;
        }
        public Builder e(String e) {
            this.e = Objects.requireNonNull(e);
            return this;
        }
        public Builder f(@Nullable String f) {
            this.f = f;
            return this;
        }
        public Builder foo(@Nullable Output<FooArgs> foo) {
            this.foo = foo;
            return this;
        }
        public Builder foo(@Nullable FooArgs foo) {
            this.foo = Output.ofNullable(foo);
            return this;
        }        public ComponentArgs build() {
            return new ComponentArgs(a, b, bar, baz, c, d, e, f, foo);
        }
    }
}
