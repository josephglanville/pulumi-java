// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.outputs;

import com.pulumi.azurenative.documentdb.outputs.CompositePathResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class IndexingPolicyResponse {
    /**
     * @return List of composite path list
     * 
     */
    private @Nullable List<List<CompositePathResponse>> compositeIndexes;

    private IndexingPolicyResponse() {}
    /**
     * @return List of composite path list
     * 
     */
    public List<List<CompositePathResponse>> compositeIndexes() {
        return this.compositeIndexes == null ? List.of() : this.compositeIndexes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexingPolicyResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<List<CompositePathResponse>> compositeIndexes;
        public Builder() {}
        public Builder(IndexingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compositeIndexes = defaults.compositeIndexes;
        }

        @CustomType.Setter
        public Builder compositeIndexes(@Nullable List<List<CompositePathResponse>> compositeIndexes) {

            this.compositeIndexes = compositeIndexes;
            return this;
        }
        public IndexingPolicyResponse build() {
            final var o = new IndexingPolicyResponse();
            o.compositeIndexes = compositeIndexes;
            return o;
        }
    }
}
