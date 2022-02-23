// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleQueryStringKeyValue;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerRuleQueryStringConfig extends io.pulumi.resources.InvokeArgs {

    public static final ListenerRuleQueryStringConfig Empty = new ListenerRuleQueryStringConfig();

    @InputImport(name="values")
      private final @Nullable List<ListenerRuleQueryStringKeyValue> values;

    public List<ListenerRuleQueryStringKeyValue> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public ListenerRuleQueryStringConfig(@Nullable List<ListenerRuleQueryStringKeyValue> values) {
        this.values = values;
    }

    private ListenerRuleQueryStringConfig() {
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleQueryStringConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ListenerRuleQueryStringKeyValue> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleQueryStringConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        public Builder setValues(@Nullable List<ListenerRuleQueryStringKeyValue> values) {
            this.values = values;
            return this;
        }
        public ListenerRuleQueryStringConfig build() {
            return new ListenerRuleQueryStringConfig(values);
        }
    }
}
