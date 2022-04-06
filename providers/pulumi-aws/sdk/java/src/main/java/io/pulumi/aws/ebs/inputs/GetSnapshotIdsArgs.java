// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ebs.inputs;

import io.pulumi.aws.ebs.inputs.GetSnapshotIdsFilter;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSnapshotIdsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSnapshotIdsArgs Empty = new GetSnapshotIdsArgs();

    /**
     * One or more name/value pairs to filter off of. There are
     * several valid keys, for a full reference, check out
     * [describe-volumes in the AWS CLI reference][1].
     * 
     */
    @Import(name="filters")
      private final @Nullable List<GetSnapshotIdsFilter> filters;

    public List<GetSnapshotIdsFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * Returns the snapshots owned by the specified owner id. Multiple owners can be specified.
     * 
     */
    @Import(name="owners")
      private final @Nullable List<String> owners;

    public List<String> getOwners() {
        return this.owners == null ? List.of() : this.owners;
    }

    /**
     * One or more AWS accounts IDs that can create volumes from the snapshot.
     * 
     */
    @Import(name="restorableByUserIds")
      private final @Nullable List<String> restorableByUserIds;

    public List<String> getRestorableByUserIds() {
        return this.restorableByUserIds == null ? List.of() : this.restorableByUserIds;
    }

    public GetSnapshotIdsArgs(
        @Nullable List<GetSnapshotIdsFilter> filters,
        @Nullable List<String> owners,
        @Nullable List<String> restorableByUserIds) {
        this.filters = filters;
        this.owners = owners;
        this.restorableByUserIds = restorableByUserIds;
    }

    private GetSnapshotIdsArgs() {
        this.filters = List.of();
        this.owners = List.of();
        this.restorableByUserIds = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotIdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetSnapshotIdsFilter> filters;
        private @Nullable List<String> owners;
        private @Nullable List<String> restorableByUserIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotIdsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.owners = defaults.owners;
    	      this.restorableByUserIds = defaults.restorableByUserIds;
        }

        public Builder filters(@Nullable List<GetSnapshotIdsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetSnapshotIdsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder owners(@Nullable List<String> owners) {
            this.owners = owners;
            return this;
        }
        public Builder owners(String... owners) {
            return owners(List.of(owners));
        }
        public Builder restorableByUserIds(@Nullable List<String> restorableByUserIds) {
            this.restorableByUserIds = restorableByUserIds;
            return this;
        }
        public Builder restorableByUserIds(String... restorableByUserIds) {
            return restorableByUserIds(List.of(restorableByUserIds));
        }        public GetSnapshotIdsArgs build() {
            return new GetSnapshotIdsArgs(filters, owners, restorableByUserIds);
        }
    }
}