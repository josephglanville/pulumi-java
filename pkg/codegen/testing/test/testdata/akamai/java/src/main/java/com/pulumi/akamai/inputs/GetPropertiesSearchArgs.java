// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetPropertiesSearchArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertiesSearchArgs Empty = new GetPropertiesSearchArgs();

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private GetPropertiesSearchArgs() {}

    private GetPropertiesSearchArgs(GetPropertiesSearchArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertiesSearchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertiesSearchArgs $;

        public Builder() {
            $ = new GetPropertiesSearchArgs();
        }

        public Builder(GetPropertiesSearchArgs defaults) {
            $ = new GetPropertiesSearchArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GetPropertiesSearchArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("GetPropertiesSearchArgs", "key");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("GetPropertiesSearchArgs", "value");
            }
            return $;
        }
    }

}
