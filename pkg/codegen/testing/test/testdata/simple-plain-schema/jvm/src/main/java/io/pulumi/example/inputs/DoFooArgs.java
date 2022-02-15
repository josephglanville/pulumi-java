// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.example.inputs.Foo;
import java.util.Objects;


public final class DoFooArgs extends io.pulumi.resources.InvokeArgs {

    public static final DoFooArgs Empty = new DoFooArgs();

    @InputImport(name="foo", required=true)
    private final Foo foo;

    public Foo getFoo() {
        return this.foo;
    }

    public DoFooArgs(Foo foo) {
        this.foo = Objects.requireNonNull(foo, "expected parameter 'foo' to be non-null");
    }

    private DoFooArgs() {
        this.foo = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DoFooArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Foo foo;

        public Builder() {
    	      // Empty
        }

        public Builder(DoFooArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.foo = defaults.foo;
        }

        public Builder setFoo(Foo foo) {
            this.foo = Objects.requireNonNull(foo);
            return this;
        }

        public DoFooArgs build() {
            return new DoFooArgs(foo);
        }
    }
}