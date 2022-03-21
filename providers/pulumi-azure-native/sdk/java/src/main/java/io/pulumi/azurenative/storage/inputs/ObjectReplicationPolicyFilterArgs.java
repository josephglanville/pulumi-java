// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Filters limit replication to a subset of blobs within the storage account. A logical OR is performed on values in the filter. If multiple filters are defined, a logical AND is performed on all filters.
 * 
 */
public final class ObjectReplicationPolicyFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectReplicationPolicyFilterArgs Empty = new ObjectReplicationPolicyFilterArgs();

    /**
     * Blobs created after the time will be replicated to the destination. It must be in datetime format 'yyyy-MM-ddTHH:mm:ssZ'. Example: 2020-02-19T16:05:00Z
     * 
     */
    @Import(name="minCreationTime")
      private final @Nullable Output<String> minCreationTime;

    public Output<String> getMinCreationTime() {
        return this.minCreationTime == null ? Output.empty() : this.minCreationTime;
    }

    /**
     * Optional. Filters the results to replicate only blobs whose names begin with the specified prefix.
     * 
     */
    @Import(name="prefixMatch")
      private final @Nullable Output<List<String>> prefixMatch;

    public Output<List<String>> getPrefixMatch() {
        return this.prefixMatch == null ? Output.empty() : this.prefixMatch;
    }

    public ObjectReplicationPolicyFilterArgs(
        @Nullable Output<String> minCreationTime,
        @Nullable Output<List<String>> prefixMatch) {
        this.minCreationTime = minCreationTime;
        this.prefixMatch = prefixMatch;
    }

    private ObjectReplicationPolicyFilterArgs() {
        this.minCreationTime = Output.empty();
        this.prefixMatch = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectReplicationPolicyFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> minCreationTime;
        private @Nullable Output<List<String>> prefixMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectReplicationPolicyFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minCreationTime = defaults.minCreationTime;
    	      this.prefixMatch = defaults.prefixMatch;
        }

        public Builder minCreationTime(@Nullable Output<String> minCreationTime) {
            this.minCreationTime = minCreationTime;
            return this;
        }
        public Builder minCreationTime(@Nullable String minCreationTime) {
            this.minCreationTime = Output.ofNullable(minCreationTime);
            return this;
        }
        public Builder prefixMatch(@Nullable Output<List<String>> prefixMatch) {
            this.prefixMatch = prefixMatch;
            return this;
        }
        public Builder prefixMatch(@Nullable List<String> prefixMatch) {
            this.prefixMatch = Output.ofNullable(prefixMatch);
            return this;
        }
        public Builder prefixMatch(String... prefixMatch) {
            return prefixMatch(List.of(prefixMatch));
        }        public ObjectReplicationPolicyFilterArgs build() {
            return new ObjectReplicationPolicyFilterArgs(minCreationTime, prefixMatch);
        }
    }
}
