// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegistryDataAssetNativeTypeSystemTypeParentRef {
    /**
     * @return (Updatable) Key of the parent object.
     * 
     */
    private final @Nullable String parent;

    @CustomType.Constructor
    private RegistryDataAssetNativeTypeSystemTypeParentRef(@CustomType.Parameter("parent") @Nullable String parent) {
        this.parent = parent;
    }

    /**
     * @return (Updatable) Key of the parent object.
     * 
     */
    public Optional<String> parent() {
        return Optional.ofNullable(this.parent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryDataAssetNativeTypeSystemTypeParentRef defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String parent;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryDataAssetNativeTypeSystemTypeParentRef defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parent = defaults.parent;
        }

        public Builder parent(@Nullable String parent) {
            this.parent = parent;
            return this;
        }        public RegistryDataAssetNativeTypeSystemTypeParentRef build() {
            return new RegistryDataAssetNativeTypeSystemTypeParentRef(parent);
        }
    }
}
