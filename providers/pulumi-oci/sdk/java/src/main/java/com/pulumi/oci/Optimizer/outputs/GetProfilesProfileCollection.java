// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Optimizer.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Optimizer.outputs.GetProfilesProfileCollectionItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetProfilesProfileCollection {
    /**
     * @return The list of tags specified in the current profile override.
     * 
     */
    private final List<GetProfilesProfileCollectionItem> items;

    @CustomType.Constructor
    private GetProfilesProfileCollection(@CustomType.Parameter("items") List<GetProfilesProfileCollectionItem> items) {
        this.items = items;
    }

    /**
     * @return The list of tags specified in the current profile override.
     * 
     */
    public List<GetProfilesProfileCollectionItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProfilesProfileCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetProfilesProfileCollectionItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProfilesProfileCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetProfilesProfileCollectionItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetProfilesProfileCollectionItem... items) {
            return items(List.of(items));
        }        public GetProfilesProfileCollection build() {
            return new GetProfilesProfileCollection(items);
        }
    }
}
