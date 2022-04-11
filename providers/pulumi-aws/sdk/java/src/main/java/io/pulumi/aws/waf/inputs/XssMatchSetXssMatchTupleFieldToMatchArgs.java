// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class XssMatchSetXssMatchTupleFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final XssMatchSetXssMatchTupleFieldToMatchArgs Empty = new XssMatchSetXssMatchTupleFieldToMatchArgs();

    /**
     * When `type` is `HEADER`, enter the name of the header that you want to search, e.g., `User-Agent` or `Referer`.
     * If `type` is any other value, omit this field.
     * 
     */
    @Import(name="data")
      private final @Nullable Output<String> data;

    public Output<String> getData() {
        return this.data == null ? Codegen.empty() : this.data;
    }

    /**
     * The part of the web request that you want AWS WAF to search for a specified string.
     * e.g., `HEADER`, `METHOD` or `BODY`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_FieldToMatch.html)
     * for all supported values.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public XssMatchSetXssMatchTupleFieldToMatchArgs(
        @Nullable Output<String> data,
        Output<String> type) {
        this.data = data;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private XssMatchSetXssMatchTupleFieldToMatchArgs() {
        this.data = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(XssMatchSetXssMatchTupleFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> data;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(XssMatchSetXssMatchTupleFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.type = defaults.type;
        }

        public Builder data(@Nullable Output<String> data) {
            this.data = data;
            return this;
        }
        public Builder data(@Nullable String data) {
            this.data = Codegen.ofNullable(data);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public XssMatchSetXssMatchTupleFieldToMatchArgs build() {
            return new XssMatchSetXssMatchTupleFieldToMatchArgs(data, type);
        }
    }
}
