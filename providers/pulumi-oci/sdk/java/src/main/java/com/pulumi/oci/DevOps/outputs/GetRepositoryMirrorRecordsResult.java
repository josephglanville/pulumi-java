// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DevOps.outputs.GetRepositoryMirrorRecordsFilter;
import com.pulumi.oci.DevOps.outputs.GetRepositoryMirrorRecordsRepositoryMirrorRecordCollection;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetRepositoryMirrorRecordsResult {
    private final @Nullable List<GetRepositoryMirrorRecordsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String repositoryId;
    /**
     * @return The list of repository_mirror_record_collection.
     * 
     */
    private final List<GetRepositoryMirrorRecordsRepositoryMirrorRecordCollection> repositoryMirrorRecordCollections;

    @CustomType.Constructor
    private GetRepositoryMirrorRecordsResult(
        @CustomType.Parameter("filters") @Nullable List<GetRepositoryMirrorRecordsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("repositoryId") String repositoryId,
        @CustomType.Parameter("repositoryMirrorRecordCollections") List<GetRepositoryMirrorRecordsRepositoryMirrorRecordCollection> repositoryMirrorRecordCollections) {
        this.filters = filters;
        this.id = id;
        this.repositoryId = repositoryId;
        this.repositoryMirrorRecordCollections = repositoryMirrorRecordCollections;
    }

    public List<GetRepositoryMirrorRecordsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String repositoryId() {
        return this.repositoryId;
    }
    /**
     * @return The list of repository_mirror_record_collection.
     * 
     */
    public List<GetRepositoryMirrorRecordsRepositoryMirrorRecordCollection> repositoryMirrorRecordCollections() {
        return this.repositoryMirrorRecordCollections;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryMirrorRecordsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetRepositoryMirrorRecordsFilter> filters;
        private String id;
        private String repositoryId;
        private List<GetRepositoryMirrorRecordsRepositoryMirrorRecordCollection> repositoryMirrorRecordCollections;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepositoryMirrorRecordsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.repositoryId = defaults.repositoryId;
    	      this.repositoryMirrorRecordCollections = defaults.repositoryMirrorRecordCollections;
        }

        public Builder filters(@Nullable List<GetRepositoryMirrorRecordsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetRepositoryMirrorRecordsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = Objects.requireNonNull(repositoryId);
            return this;
        }
        public Builder repositoryMirrorRecordCollections(List<GetRepositoryMirrorRecordsRepositoryMirrorRecordCollection> repositoryMirrorRecordCollections) {
            this.repositoryMirrorRecordCollections = Objects.requireNonNull(repositoryMirrorRecordCollections);
            return this;
        }
        public Builder repositoryMirrorRecordCollections(GetRepositoryMirrorRecordsRepositoryMirrorRecordCollection... repositoryMirrorRecordCollections) {
            return repositoryMirrorRecordCollections(List.of(repositoryMirrorRecordCollections));
        }        public GetRepositoryMirrorRecordsResult build() {
            return new GetRepositoryMirrorRecordsResult(filters, id, repositoryId, repositoryMirrorRecordCollections);
        }
    }
}
