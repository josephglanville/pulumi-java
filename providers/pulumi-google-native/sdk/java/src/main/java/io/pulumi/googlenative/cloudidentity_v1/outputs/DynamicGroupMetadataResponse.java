// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.cloudidentity_v1.outputs.DynamicGroupQueryResponse;
import io.pulumi.googlenative.cloudidentity_v1.outputs.DynamicGroupStatusResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DynamicGroupMetadataResponse {
    /**
     * Memberships will be the union of all queries. Only one entry with USER resource is currently supported. Customers can create up to 100 dynamic groups.
     * 
     */
    private final List<DynamicGroupQueryResponse> queries;
    /**
     * Status of the dynamic group.
     * 
     */
    private final DynamicGroupStatusResponse status;

    @CustomType.Constructor
    private DynamicGroupMetadataResponse(
        @CustomType.Parameter("queries") List<DynamicGroupQueryResponse> queries,
        @CustomType.Parameter("status") DynamicGroupStatusResponse status) {
        this.queries = queries;
        this.status = status;
    }

    /**
     * Memberships will be the union of all queries. Only one entry with USER resource is currently supported. Customers can create up to 100 dynamic groups.
     * 
    */
    public List<DynamicGroupQueryResponse> getQueries() {
        return this.queries;
    }
    /**
     * Status of the dynamic group.
     * 
    */
    public DynamicGroupStatusResponse getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicGroupMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DynamicGroupQueryResponse> queries;
        private DynamicGroupStatusResponse status;

        public Builder() {
    	      // Empty
        }

        public Builder(DynamicGroupMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queries = defaults.queries;
    	      this.status = defaults.status;
        }

        public Builder queries(List<DynamicGroupQueryResponse> queries) {
            this.queries = Objects.requireNonNull(queries);
            return this;
        }
        public Builder queries(DynamicGroupQueryResponse... queries) {
            return queries(List.of(queries));
        }
        public Builder status(DynamicGroupStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public DynamicGroupMetadataResponse build() {
            return new DynamicGroupMetadataResponse(queries, status);
        }
    }
}
