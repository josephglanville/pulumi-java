// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleHttpHeaderConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleHttpHeaderConfigArgs Empty = new ListenerRuleHttpHeaderConfigArgs();

    @InputImport(name="httpHeaderName")
      private final @Nullable Input<String> httpHeaderName;

    public Input<String> getHttpHeaderName() {
        return this.httpHeaderName == null ? Input.empty() : this.httpHeaderName;
    }

    @InputImport(name="values")
      private final @Nullable Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public ListenerRuleHttpHeaderConfigArgs(
        @Nullable Input<String> httpHeaderName,
        @Nullable Input<List<String>> values) {
        this.httpHeaderName = httpHeaderName;
        this.values = values;
    }

    private ListenerRuleHttpHeaderConfigArgs() {
        this.httpHeaderName = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleHttpHeaderConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> httpHeaderName;
        private @Nullable Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleHttpHeaderConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpHeaderName = defaults.httpHeaderName;
    	      this.values = defaults.values;
        }

        public Builder setHttpHeaderName(@Nullable Input<String> httpHeaderName) {
            this.httpHeaderName = httpHeaderName;
            return this;
        }

        public Builder setHttpHeaderName(@Nullable String httpHeaderName) {
            this.httpHeaderName = Input.ofNullable(httpHeaderName);
            return this;
        }

        public Builder setValues(@Nullable Input<List<String>> values) {
            this.values = values;
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = Input.ofNullable(values);
            return this;
        }
        public ListenerRuleHttpHeaderConfigArgs build() {
            return new ListenerRuleHttpHeaderConfigArgs(httpHeaderName, values);
        }
    }
}
