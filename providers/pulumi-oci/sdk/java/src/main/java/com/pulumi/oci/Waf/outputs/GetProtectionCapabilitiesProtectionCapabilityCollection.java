// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waf.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Waf.outputs.GetProtectionCapabilitiesProtectionCapabilityCollectionItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetProtectionCapabilitiesProtectionCapabilityCollection {
    /**
     * @return List of protection capabilities.
     * 
     */
    private final List<GetProtectionCapabilitiesProtectionCapabilityCollectionItem> items;

    @CustomType.Constructor
    private GetProtectionCapabilitiesProtectionCapabilityCollection(@CustomType.Parameter("items") List<GetProtectionCapabilitiesProtectionCapabilityCollectionItem> items) {
        this.items = items;
    }

    /**
     * @return List of protection capabilities.
     * 
     */
    public List<GetProtectionCapabilitiesProtectionCapabilityCollectionItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProtectionCapabilitiesProtectionCapabilityCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetProtectionCapabilitiesProtectionCapabilityCollectionItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProtectionCapabilitiesProtectionCapabilityCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetProtectionCapabilitiesProtectionCapabilityCollectionItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetProtectionCapabilitiesProtectionCapabilityCollectionItem... items) {
            return items(List.of(items));
        }        public GetProtectionCapabilitiesProtectionCapabilityCollection build() {
            return new GetProtectionCapabilitiesProtectionCapabilityCollection(items);
        }
    }
}
