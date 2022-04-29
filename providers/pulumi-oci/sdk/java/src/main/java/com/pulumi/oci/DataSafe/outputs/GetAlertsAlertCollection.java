// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataSafe.outputs.GetAlertsAlertCollectionItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAlertsAlertCollection {
    private final List<GetAlertsAlertCollectionItem> items;

    @CustomType.Constructor
    private GetAlertsAlertCollection(@CustomType.Parameter("items") List<GetAlertsAlertCollectionItem> items) {
        this.items = items;
    }

    public List<GetAlertsAlertCollectionItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertsAlertCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetAlertsAlertCollectionItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAlertsAlertCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetAlertsAlertCollectionItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetAlertsAlertCollectionItem... items) {
            return items(List.of(items));
        }        public GetAlertsAlertCollection build() {
            return new GetAlertsAlertCollection(items);
        }
    }
}
