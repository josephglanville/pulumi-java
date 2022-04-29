// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CloudGuard.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.CloudGuard.outputs.GetGuardTargetsTargetCollectionItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGuardTargetsTargetCollection {
    private final List<GetGuardTargetsTargetCollectionItem> items;

    @CustomType.Constructor
    private GetGuardTargetsTargetCollection(@CustomType.Parameter("items") List<GetGuardTargetsTargetCollectionItem> items) {
        this.items = items;
    }

    public List<GetGuardTargetsTargetCollectionItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGuardTargetsTargetCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetGuardTargetsTargetCollectionItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGuardTargetsTargetCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetGuardTargetsTargetCollectionItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetGuardTargetsTargetCollectionItem... items) {
            return items(List.of(items));
        }        public GetGuardTargetsTargetCollection build() {
            return new GetGuardTargetsTargetCollection(items);
        }
    }
}
