// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRegistryFoldersFolderSummaryCollectionItemParentRef {
    /**
     * @return Key of the parent object.
     * 
     */
    private final String parent;

    @CustomType.Constructor
    private GetRegistryFoldersFolderSummaryCollectionItemParentRef(@CustomType.Parameter("parent") String parent) {
        this.parent = parent;
    }

    /**
     * @return Key of the parent object.
     * 
     */
    public String parent() {
        return this.parent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryFoldersFolderSummaryCollectionItemParentRef defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String parent;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryFoldersFolderSummaryCollectionItemParentRef defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parent = defaults.parent;
        }

        public Builder parent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }        public GetRegistryFoldersFolderSummaryCollectionItemParentRef build() {
            return new GetRegistryFoldersFolderSummaryCollectionItemParentRef(parent);
        }
    }
}
