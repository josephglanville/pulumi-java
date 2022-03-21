// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSnapshotArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSnapshotArgs Empty = new GetSnapshotArgs();

    /**
     * Returns the list of snapshots created by the specific db_instance
     * 
     */
    @Import(name="dbInstanceIdentifier")
      private final @Nullable String dbInstanceIdentifier;

    public Optional<String> getDbInstanceIdentifier() {
        return this.dbInstanceIdentifier == null ? Optional.empty() : Optional.ofNullable(this.dbInstanceIdentifier);
    }

    /**
     * Returns information on a specific snapshot_id.
     * 
     */
    @Import(name="dbSnapshotIdentifier")
      private final @Nullable String dbSnapshotIdentifier;

    public Optional<String> getDbSnapshotIdentifier() {
        return this.dbSnapshotIdentifier == null ? Optional.empty() : Optional.ofNullable(this.dbSnapshotIdentifier);
    }

    /**
     * Set this value to true to include manual DB snapshots that are public and can be
     * copied or restored by any AWS account, otherwise set this value to false. The default is `false`.
     * 
     */
    @Import(name="includePublic")
      private final @Nullable Boolean includePublic;

    public Optional<Boolean> getIncludePublic() {
        return this.includePublic == null ? Optional.empty() : Optional.ofNullable(this.includePublic);
    }

    /**
     * Set this value to true to include shared manual DB snapshots from other
     * AWS accounts that this AWS account has been given permission to copy or restore, otherwise set this value to false.
     * The default is `false`.
     * 
     */
    @Import(name="includeShared")
      private final @Nullable Boolean includeShared;

    public Optional<Boolean> getIncludeShared() {
        return this.includeShared == null ? Optional.empty() : Optional.ofNullable(this.includeShared);
    }

    /**
     * If more than one result is returned, use the most
     * recent Snapshot.
     * 
     */
    @Import(name="mostRecent")
      private final @Nullable Boolean mostRecent;

    public Optional<Boolean> getMostRecent() {
        return this.mostRecent == null ? Optional.empty() : Optional.ofNullable(this.mostRecent);
    }

    /**
     * The type of snapshots to be returned. If you don't specify a SnapshotType
     * value, then both automated and manual snapshots are returned. Shared and public DB snapshots are not
     * included in the returned results by default. Possible values are, `automated`, `manual`, `shared`, `public` and `awsbackup`.
     * 
     */
    @Import(name="snapshotType")
      private final @Nullable String snapshotType;

    public Optional<String> getSnapshotType() {
        return this.snapshotType == null ? Optional.empty() : Optional.ofNullable(this.snapshotType);
    }

    public GetSnapshotArgs(
        @Nullable String dbInstanceIdentifier,
        @Nullable String dbSnapshotIdentifier,
        @Nullable Boolean includePublic,
        @Nullable Boolean includeShared,
        @Nullable Boolean mostRecent,
        @Nullable String snapshotType) {
        this.dbInstanceIdentifier = dbInstanceIdentifier;
        this.dbSnapshotIdentifier = dbSnapshotIdentifier;
        this.includePublic = includePublic;
        this.includeShared = includeShared;
        this.mostRecent = mostRecent;
        this.snapshotType = snapshotType;
    }

    private GetSnapshotArgs() {
        this.dbInstanceIdentifier = null;
        this.dbSnapshotIdentifier = null;
        this.includePublic = null;
        this.includeShared = null;
        this.mostRecent = null;
        this.snapshotType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dbInstanceIdentifier;
        private @Nullable String dbSnapshotIdentifier;
        private @Nullable Boolean includePublic;
        private @Nullable Boolean includeShared;
        private @Nullable Boolean mostRecent;
        private @Nullable String snapshotType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbInstanceIdentifier = defaults.dbInstanceIdentifier;
    	      this.dbSnapshotIdentifier = defaults.dbSnapshotIdentifier;
    	      this.includePublic = defaults.includePublic;
    	      this.includeShared = defaults.includeShared;
    	      this.mostRecent = defaults.mostRecent;
    	      this.snapshotType = defaults.snapshotType;
        }

        public Builder dbInstanceIdentifier(@Nullable String dbInstanceIdentifier) {
            this.dbInstanceIdentifier = dbInstanceIdentifier;
            return this;
        }
        public Builder dbSnapshotIdentifier(@Nullable String dbSnapshotIdentifier) {
            this.dbSnapshotIdentifier = dbSnapshotIdentifier;
            return this;
        }
        public Builder includePublic(@Nullable Boolean includePublic) {
            this.includePublic = includePublic;
            return this;
        }
        public Builder includeShared(@Nullable Boolean includeShared) {
            this.includeShared = includeShared;
            return this;
        }
        public Builder mostRecent(@Nullable Boolean mostRecent) {
            this.mostRecent = mostRecent;
            return this;
        }
        public Builder snapshotType(@Nullable String snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }        public GetSnapshotArgs build() {
            return new GetSnapshotArgs(dbInstanceIdentifier, dbSnapshotIdentifier, includePublic, includeShared, mostRecent, snapshotType);
        }
    }
}
