// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerRuleHttpRequestMethodConfig extends io.pulumi.resources.InvokeArgs {

    public static final ListenerRuleHttpRequestMethodConfig Empty = new ListenerRuleHttpRequestMethodConfig();

    @InputImport(name="values")
      private final @Nullable List<String> values;

    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public ListenerRuleHttpRequestMethodConfig(@Nullable List<String> values) {
        this.values = values;
    }

    private ListenerRuleHttpRequestMethodConfig() {
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleHttpRequestMethodConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleHttpRequestMethodConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public ListenerRuleHttpRequestMethodConfig build() {
            return new ListenerRuleHttpRequestMethodConfig(values);
        }
    }
}
