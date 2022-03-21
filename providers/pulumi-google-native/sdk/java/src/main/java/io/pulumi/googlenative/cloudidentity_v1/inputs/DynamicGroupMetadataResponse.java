// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.cloudidentity_v1.inputs.DynamicGroupQueryResponse;
import io.pulumi.googlenative.cloudidentity_v1.inputs.DynamicGroupStatusResponse;
import java.util.List;
import java.util.Objects;


/**
 * Dynamic group metadata like queries and status.
 * 
 */
public final class DynamicGroupMetadataResponse extends io.pulumi.resources.InvokeArgs {

    public static final DynamicGroupMetadataResponse Empty = new DynamicGroupMetadataResponse();

    /**
     * Memberships will be the union of all queries. Only one entry with USER resource is currently supported. Customers can create up to 100 dynamic groups.
     * 
     */
    @Import(name="queries", required=true)
      private final List<DynamicGroupQueryResponse> queries;

    public List<DynamicGroupQueryResponse> getQueries() {
        return this.queries;
    }

    /**
     * Status of the dynamic group.
     * 
     */
    @Import(name="status", required=true)
      private final DynamicGroupStatusResponse status;

    public DynamicGroupStatusResponse getStatus() {
        return this.status;
    }

    public DynamicGroupMetadataResponse(
        List<DynamicGroupQueryResponse> queries,
        DynamicGroupStatusResponse status) {
        this.queries = Objects.requireNonNull(queries, "expected parameter 'queries' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private DynamicGroupMetadataResponse() {
        this.queries = List.of();
        this.status = null;
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
