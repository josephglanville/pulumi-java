// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.example;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class BasicResourceV2Args extends com.pulumi.resources.ResourceArgs {

    public static final BasicResourceV2Args Empty = new BasicResourceV2Args();

    @Import(name="bar", required=true)
    private Output<String> bar;

    public Output<String> bar() {
        return this.bar;
    }

    private BasicResourceV2Args() {}

    private BasicResourceV2Args(BasicResourceV2Args $) {
        this.bar = $.bar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BasicResourceV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicResourceV2Args $;

        public Builder() {
            $ = new BasicResourceV2Args();
        }

        public Builder(BasicResourceV2Args defaults) {
            $ = new BasicResourceV2Args(Objects.requireNonNull(defaults));
        }

        public Builder bar(Output<String> bar) {
            $.bar = bar;
            return this;
        }

        public Builder bar(String bar) {
            return bar(Output.of(bar));
        }

        public BasicResourceV2Args build() {
            if ($.bar == null) {
                throw new MissingRequiredPropertyException("BasicResourceV2Args", "bar");
            }
            return $;
        }
    }

}
