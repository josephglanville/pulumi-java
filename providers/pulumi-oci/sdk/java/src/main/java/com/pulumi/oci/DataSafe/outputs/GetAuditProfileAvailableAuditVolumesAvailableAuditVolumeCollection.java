// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataSafe.outputs.GetAuditProfileAvailableAuditVolumesAvailableAuditVolumeCollectionItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAuditProfileAvailableAuditVolumesAvailableAuditVolumeCollection {
    /**
     * @return Array of available audit volume summary.
     * 
     */
    private final List<GetAuditProfileAvailableAuditVolumesAvailableAuditVolumeCollectionItem> items;

    @CustomType.Constructor
    private GetAuditProfileAvailableAuditVolumesAvailableAuditVolumeCollection(@CustomType.Parameter("items") List<GetAuditProfileAvailableAuditVolumesAvailableAuditVolumeCollectionItem> items) {
        this.items = items;
    }

    /**
     * @return Array of available audit volume summary.
     * 
     */
    public List<GetAuditProfileAvailableAuditVolumesAvailableAuditVolumeCollectionItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuditProfileAvailableAuditVolumesAvailableAuditVolumeCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetAuditProfileAvailableAuditVolumesAvailableAuditVolumeCollectionItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAuditProfileAvailableAuditVolumesAvailableAuditVolumeCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetAuditProfileAvailableAuditVolumesAvailableAuditVolumeCollectionItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetAuditProfileAvailableAuditVolumesAvailableAuditVolumeCollectionItem... items) {
            return items(List.of(items));
        }        public GetAuditProfileAvailableAuditVolumesAvailableAuditVolumeCollection build() {
            return new GetAuditProfileAvailableAuditVolumesAvailableAuditVolumeCollection(items);
        }
    }
}
