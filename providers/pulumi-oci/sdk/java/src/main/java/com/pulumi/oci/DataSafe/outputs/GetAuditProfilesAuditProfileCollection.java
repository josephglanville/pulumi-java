// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataSafe.outputs.GetAuditProfilesAuditProfileCollectionItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAuditProfilesAuditProfileCollection {
    private final List<GetAuditProfilesAuditProfileCollectionItem> items;

    @CustomType.Constructor
    private GetAuditProfilesAuditProfileCollection(@CustomType.Parameter("items") List<GetAuditProfilesAuditProfileCollectionItem> items) {
        this.items = items;
    }

    public List<GetAuditProfilesAuditProfileCollectionItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuditProfilesAuditProfileCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetAuditProfilesAuditProfileCollectionItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAuditProfilesAuditProfileCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetAuditProfilesAuditProfileCollectionItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetAuditProfilesAuditProfileCollectionItem... items) {
            return items(List.of(items));
        }        public GetAuditProfilesAuditProfileCollection build() {
            return new GetAuditProfilesAuditProfileCollection(items);
        }
    }
}
