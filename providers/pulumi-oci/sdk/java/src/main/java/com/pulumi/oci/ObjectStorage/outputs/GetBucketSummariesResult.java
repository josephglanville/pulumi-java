// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ObjectStorage.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.ObjectStorage.outputs.GetBucketSummariesBucketSummary;
import com.pulumi.oci.ObjectStorage.outputs.GetBucketSummariesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetBucketSummariesResult {
    /**
     * @return The list of bucket_summaries.
     * 
     */
    private final List<GetBucketSummariesBucketSummary> bucketSummaries;
    /**
     * @return The compartment ID in which the bucket is authorized.
     * 
     */
    private final String compartmentId;
    private final @Nullable List<GetBucketSummariesFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The Object Storage namespace in which the bucket resides.
     * 
     */
    private final String namespace;

    @CustomType.Constructor
    private GetBucketSummariesResult(
        @CustomType.Parameter("bucketSummaries") List<GetBucketSummariesBucketSummary> bucketSummaries,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("filters") @Nullable List<GetBucketSummariesFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("namespace") String namespace) {
        this.bucketSummaries = bucketSummaries;
        this.compartmentId = compartmentId;
        this.filters = filters;
        this.id = id;
        this.namespace = namespace;
    }

    /**
     * @return The list of bucket_summaries.
     * 
     */
    public List<GetBucketSummariesBucketSummary> bucketSummaries() {
        return this.bucketSummaries;
    }
    /**
     * @return The compartment ID in which the bucket is authorized.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    public List<GetBucketSummariesFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Object Storage namespace in which the bucket resides.
     * 
     */
    public String namespace() {
        return this.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketSummariesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetBucketSummariesBucketSummary> bucketSummaries;
        private String compartmentId;
        private @Nullable List<GetBucketSummariesFilter> filters;
        private String id;
        private String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketSummariesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketSummaries = defaults.bucketSummaries;
    	      this.compartmentId = defaults.compartmentId;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.namespace = defaults.namespace;
        }

        public Builder bucketSummaries(List<GetBucketSummariesBucketSummary> bucketSummaries) {
            this.bucketSummaries = Objects.requireNonNull(bucketSummaries);
            return this;
        }
        public Builder bucketSummaries(GetBucketSummariesBucketSummary... bucketSummaries) {
            return bucketSummaries(List.of(bucketSummaries));
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder filters(@Nullable List<GetBucketSummariesFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetBucketSummariesFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }        public GetBucketSummariesResult build() {
            return new GetBucketSummariesResult(bucketSummaries, compartmentId, filters, id, namespace);
        }
    }
}
