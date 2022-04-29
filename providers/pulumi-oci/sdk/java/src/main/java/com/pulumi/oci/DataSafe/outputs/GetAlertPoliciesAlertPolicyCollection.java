// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataSafe.outputs.GetAlertPoliciesAlertPolicyCollectionItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAlertPoliciesAlertPolicyCollection {
    private final List<GetAlertPoliciesAlertPolicyCollectionItem> items;

    @CustomType.Constructor
    private GetAlertPoliciesAlertPolicyCollection(@CustomType.Parameter("items") List<GetAlertPoliciesAlertPolicyCollectionItem> items) {
        this.items = items;
    }

    public List<GetAlertPoliciesAlertPolicyCollectionItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertPoliciesAlertPolicyCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetAlertPoliciesAlertPolicyCollectionItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAlertPoliciesAlertPolicyCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetAlertPoliciesAlertPolicyCollectionItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetAlertPoliciesAlertPolicyCollectionItem... items) {
            return items(List.of(items));
        }        public GetAlertPoliciesAlertPolicyCollection build() {
            return new GetAlertPoliciesAlertPolicyCollection(items);
        }
    }
}
