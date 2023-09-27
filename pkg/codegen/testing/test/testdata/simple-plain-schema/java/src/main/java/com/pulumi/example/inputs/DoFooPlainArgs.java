// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.example.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.example.inputs.Foo;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;


public final class DoFooPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final DoFooPlainArgs Empty = new DoFooPlainArgs();

    @Import(name="foo", required=true)
    private Foo foo;

    public Foo foo() {
        return this.foo;
    }

    private DoFooPlainArgs() {}

    private DoFooPlainArgs(DoFooPlainArgs $) {
        this.foo = $.foo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DoFooPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DoFooPlainArgs $;

        public Builder() {
            $ = new DoFooPlainArgs();
        }

        public Builder(DoFooPlainArgs defaults) {
            $ = new DoFooPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder foo(Foo foo) {
            $.foo = foo;
            return this;
        }

        public DoFooPlainArgs build() {
            if ($.foo == null) {
                throw new MissingRequiredPropertyException("DoFooPlainArgs", "foo");
            }
            return $;
        }
    }

}
