// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotArgs Empty = new SnapshotArgs();

    /**
     * The DB Instance Identifier from which to take the snapshot.
     * 
     */
    @Import(name="dbInstanceIdentifier", required=true)
      private final Output<String> dbInstanceIdentifier;

    public Output<String> getDbInstanceIdentifier() {
        return this.dbInstanceIdentifier;
    }

    /**
     * The Identifier for the snapshot.
     * 
     */
    @Import(name="dbSnapshotIdentifier", required=true)
      private final Output<String> dbSnapshotIdentifier;

    public Output<String> getDbSnapshotIdentifier() {
        return this.dbSnapshotIdentifier;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public SnapshotArgs(
        Output<String> dbInstanceIdentifier,
        Output<String> dbSnapshotIdentifier,
        @Nullable Output<Map<String,String>> tags) {
        this.dbInstanceIdentifier = Objects.requireNonNull(dbInstanceIdentifier, "expected parameter 'dbInstanceIdentifier' to be non-null");
        this.dbSnapshotIdentifier = Objects.requireNonNull(dbSnapshotIdentifier, "expected parameter 'dbSnapshotIdentifier' to be non-null");
        this.tags = tags;
    }

    private SnapshotArgs() {
        this.dbInstanceIdentifier = Output.empty();
        this.dbSnapshotIdentifier = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dbInstanceIdentifier;
        private Output<String> dbSnapshotIdentifier;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbInstanceIdentifier = defaults.dbInstanceIdentifier;
    	      this.dbSnapshotIdentifier = defaults.dbSnapshotIdentifier;
    	      this.tags = defaults.tags;
        }

        public Builder dbInstanceIdentifier(Output<String> dbInstanceIdentifier) {
            this.dbInstanceIdentifier = Objects.requireNonNull(dbInstanceIdentifier);
            return this;
        }
        public Builder dbInstanceIdentifier(String dbInstanceIdentifier) {
            this.dbInstanceIdentifier = Output.of(Objects.requireNonNull(dbInstanceIdentifier));
            return this;
        }
        public Builder dbSnapshotIdentifier(Output<String> dbSnapshotIdentifier) {
            this.dbSnapshotIdentifier = Objects.requireNonNull(dbSnapshotIdentifier);
            return this;
        }
        public Builder dbSnapshotIdentifier(String dbSnapshotIdentifier) {
            this.dbSnapshotIdentifier = Output.of(Objects.requireNonNull(dbSnapshotIdentifier));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public SnapshotArgs build() {
            return new SnapshotArgs(dbInstanceIdentifier, dbSnapshotIdentifier, tags);
        }
    }
}