// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.urnid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.util.Objects;


public final class TestArgs extends com.pulumi.resources.InvokeArgs {

    public static final TestArgs Empty = new TestArgs();

    @Import(name="id", required=true)
    private Output<Double> id;

    public Output<Double> id() {
        return this.id;
    }

    @Import(name="urn", required=true)
    private Output<Double> urn;

    public Output<Double> urn() {
        return this.urn;
    }

    private TestArgs() {}

    private TestArgs(TestArgs $) {
        this.id = $.id;
        this.urn = $.urn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TestArgs $;

        public Builder() {
            $ = new TestArgs();
        }

        public Builder(TestArgs defaults) {
            $ = new TestArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(Output<Double> id) {
            $.id = id;
            return this;
        }

        public Builder id(Double id) {
            return id(Output.of(id));
        }

        public Builder urn(Output<Double> urn) {
            $.urn = urn;
            return this;
        }

        public Builder urn(Double urn) {
            return urn(Output.of(urn));
        }

        public TestArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("TestArgs", "id");
            }
            if ($.urn == null) {
                throw new MissingRequiredPropertyException("TestArgs", "urn");
            }
            return $;
        }
    }

}
