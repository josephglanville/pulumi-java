// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListFirewallPolicyIdpsSignaturesFilterValueResult {
    private final @Nullable List<String> filterValues;

    @OutputCustomType.Constructor({"filterValues"})
    private ListFirewallPolicyIdpsSignaturesFilterValueResult(@Nullable List<String> filterValues) {
        this.filterValues = filterValues;
    }

    public List<String> getFilterValues() {
        return this.filterValues == null ? List.of() : this.filterValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListFirewallPolicyIdpsSignaturesFilterValueResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> filterValues;

        public Builder() {
    	      // Empty
        }

        public Builder(ListFirewallPolicyIdpsSignaturesFilterValueResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterValues = defaults.filterValues;
        }

        public Builder setFilterValues(@Nullable List<String> filterValues) {
            this.filterValues = filterValues;
            return this;
        }

        public ListFirewallPolicyIdpsSignaturesFilterValueResult build() {
            return new ListFirewallPolicyIdpsSignaturesFilterValueResult(filterValues);
        }
    }
}