// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.UniqueKeyResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class UniqueKeyPolicyResponse {
    /**
     * List of unique keys on that enforces uniqueness constraint on documents in the collection in the Azure Cosmos DB service.
     * 
     */
    private final @Nullable List<UniqueKeyResponse> uniqueKeys;

    @CustomType.Constructor
    private UniqueKeyPolicyResponse(@CustomType.Parameter("uniqueKeys") @Nullable List<UniqueKeyResponse> uniqueKeys) {
        this.uniqueKeys = uniqueKeys;
    }

    /**
     * List of unique keys on that enforces uniqueness constraint on documents in the collection in the Azure Cosmos DB service.
     * 
    */
    public List<UniqueKeyResponse> getUniqueKeys() {
        return this.uniqueKeys == null ? List.of() : this.uniqueKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UniqueKeyPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<UniqueKeyResponse> uniqueKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(UniqueKeyPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uniqueKeys = defaults.uniqueKeys;
        }

        public Builder uniqueKeys(@Nullable List<UniqueKeyResponse> uniqueKeys) {
            this.uniqueKeys = uniqueKeys;
            return this;
        }
        public Builder uniqueKeys(UniqueKeyResponse... uniqueKeys) {
            return uniqueKeys(List.of(uniqueKeys));
        }        public UniqueKeyPolicyResponse build() {
            return new UniqueKeyPolicyResponse(uniqueKeys);
        }
    }
}
