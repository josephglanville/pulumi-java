// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.filestore.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFileSharesNfsExportOptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFileSharesNfsExportOptionArgs Empty = new InstanceFileSharesNfsExportOptionArgs();

    /**
     * Either READ_ONLY, for allowing only read requests on the exported directory,
     * or READ_WRITE, for allowing both read and write requests. The default is READ_WRITE.
     * Default value is `READ_WRITE`.
     * Possible values are `READ_ONLY` and `READ_WRITE`.
     * 
     */
    @Import(name="accessMode")
      private final @Nullable Output<String> accessMode;

    public Output<String> getAccessMode() {
        return this.accessMode == null ? Output.empty() : this.accessMode;
    }

    /**
     * An integer representing the anonymous group id with a default value of 65534.
     * Anon_gid may only be set with squashMode of ROOT_SQUASH. An error will be returned
     * if this field is specified for other squashMode settings.
     * 
     */
    @Import(name="anonGid")
      private final @Nullable Output<Integer> anonGid;

    public Output<Integer> getAnonGid() {
        return this.anonGid == null ? Output.empty() : this.anonGid;
    }

    /**
     * An integer representing the anonymous user id with a default value of 65534.
     * Anon_uid may only be set with squashMode of ROOT_SQUASH. An error will be returned
     * if this field is specified for other squashMode settings.
     * 
     */
    @Import(name="anonUid")
      private final @Nullable Output<Integer> anonUid;

    public Output<Integer> getAnonUid() {
        return this.anonUid == null ? Output.empty() : this.anonUid;
    }

    /**
     * List of either IPv4 addresses, or ranges in CIDR notation which may mount the file share.
     * Overlapping IP ranges are not allowed, both within and across NfsExportOptions. An error will be returned.
     * The limit is 64 IP ranges/addresses for each FileShareConfig among all NfsExportOptions.
     * 
     */
    @Import(name="ipRanges")
      private final @Nullable Output<List<String>> ipRanges;

    public Output<List<String>> getIpRanges() {
        return this.ipRanges == null ? Output.empty() : this.ipRanges;
    }

    /**
     * Either NO_ROOT_SQUASH, for allowing root access on the exported directory, or ROOT_SQUASH,
     * for not allowing root access. The default is NO_ROOT_SQUASH.
     * Default value is `NO_ROOT_SQUASH`.
     * Possible values are `NO_ROOT_SQUASH` and `ROOT_SQUASH`.
     * 
     */
    @Import(name="squashMode")
      private final @Nullable Output<String> squashMode;

    public Output<String> getSquashMode() {
        return this.squashMode == null ? Output.empty() : this.squashMode;
    }

    public InstanceFileSharesNfsExportOptionArgs(
        @Nullable Output<String> accessMode,
        @Nullable Output<Integer> anonGid,
        @Nullable Output<Integer> anonUid,
        @Nullable Output<List<String>> ipRanges,
        @Nullable Output<String> squashMode) {
        this.accessMode = accessMode;
        this.anonGid = anonGid;
        this.anonUid = anonUid;
        this.ipRanges = ipRanges;
        this.squashMode = squashMode;
    }

    private InstanceFileSharesNfsExportOptionArgs() {
        this.accessMode = Output.empty();
        this.anonGid = Output.empty();
        this.anonUid = Output.empty();
        this.ipRanges = Output.empty();
        this.squashMode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFileSharesNfsExportOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessMode;
        private @Nullable Output<Integer> anonGid;
        private @Nullable Output<Integer> anonUid;
        private @Nullable Output<List<String>> ipRanges;
        private @Nullable Output<String> squashMode;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFileSharesNfsExportOptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessMode = defaults.accessMode;
    	      this.anonGid = defaults.anonGid;
    	      this.anonUid = defaults.anonUid;
    	      this.ipRanges = defaults.ipRanges;
    	      this.squashMode = defaults.squashMode;
        }

        public Builder accessMode(@Nullable Output<String> accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public Builder accessMode(@Nullable String accessMode) {
            this.accessMode = Output.ofNullable(accessMode);
            return this;
        }
        public Builder anonGid(@Nullable Output<Integer> anonGid) {
            this.anonGid = anonGid;
            return this;
        }
        public Builder anonGid(@Nullable Integer anonGid) {
            this.anonGid = Output.ofNullable(anonGid);
            return this;
        }
        public Builder anonUid(@Nullable Output<Integer> anonUid) {
            this.anonUid = anonUid;
            return this;
        }
        public Builder anonUid(@Nullable Integer anonUid) {
            this.anonUid = Output.ofNullable(anonUid);
            return this;
        }
        public Builder ipRanges(@Nullable Output<List<String>> ipRanges) {
            this.ipRanges = ipRanges;
            return this;
        }
        public Builder ipRanges(@Nullable List<String> ipRanges) {
            this.ipRanges = Output.ofNullable(ipRanges);
            return this;
        }
        public Builder ipRanges(String... ipRanges) {
            return ipRanges(List.of(ipRanges));
        }
        public Builder squashMode(@Nullable Output<String> squashMode) {
            this.squashMode = squashMode;
            return this;
        }
        public Builder squashMode(@Nullable String squashMode) {
            this.squashMode = Output.ofNullable(squashMode);
            return this;
        }        public InstanceFileSharesNfsExportOptionArgs build() {
            return new InstanceFileSharesNfsExportOptionArgs(accessMode, anonGid, anonUid, ipRanges, squashMode);
        }
    }
}
