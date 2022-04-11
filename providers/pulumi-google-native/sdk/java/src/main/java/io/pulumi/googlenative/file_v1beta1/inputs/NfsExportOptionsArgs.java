// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.file_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.file_v1beta1.enums.NfsExportOptionsAccessMode;
import io.pulumi.googlenative.file_v1beta1.enums.NfsExportOptionsSquashMode;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NFS export options specifications.
 * 
 */
public final class NfsExportOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final NfsExportOptionsArgs Empty = new NfsExportOptionsArgs();

    /**
     * Either READ_ONLY, for allowing only read requests on the exported directory, or READ_WRITE, for allowing both read and write requests. The default is READ_WRITE.
     * 
     */
    @Import(name="accessMode")
      private final @Nullable Output<NfsExportOptionsAccessMode> accessMode;

    public Output<NfsExportOptionsAccessMode> getAccessMode() {
        return this.accessMode == null ? Codegen.empty() : this.accessMode;
    }

    /**
     * An integer representing the anonymous group id with a default value of 65534. Anon_gid may only be set with squash_mode of ROOT_SQUASH. An error will be returned if this field is specified for other squash_mode settings.
     * 
     */
    @Import(name="anonGid")
      private final @Nullable Output<String> anonGid;

    public Output<String> getAnonGid() {
        return this.anonGid == null ? Codegen.empty() : this.anonGid;
    }

    /**
     * An integer representing the anonymous user id with a default value of 65534. Anon_uid may only be set with squash_mode of ROOT_SQUASH. An error will be returned if this field is specified for other squash_mode settings.
     * 
     */
    @Import(name="anonUid")
      private final @Nullable Output<String> anonUid;

    public Output<String> getAnonUid() {
        return this.anonUid == null ? Codegen.empty() : this.anonUid;
    }

    /**
     * List of either an IPv4 addresses in the format `{octet1}.{octet2}.{octet3}.{octet4}` or CIDR ranges in the format `{octet1}.{octet2}.{octet3}.{octet4}/{mask size}` which may mount the file share. Overlapping IP ranges are not allowed, both within and across NfsExportOptions. An error will be returned. The limit is 64 IP ranges/addresses for each FileShareConfig among all NfsExportOptions.
     * 
     */
    @Import(name="ipRanges")
      private final @Nullable Output<List<String>> ipRanges;

    public Output<List<String>> getIpRanges() {
        return this.ipRanges == null ? Codegen.empty() : this.ipRanges;
    }

    /**
     * Either NO_ROOT_SQUASH, for allowing root access on the exported directory, or ROOT_SQUASH, for not allowing root access. The default is NO_ROOT_SQUASH.
     * 
     */
    @Import(name="squashMode")
      private final @Nullable Output<NfsExportOptionsSquashMode> squashMode;

    public Output<NfsExportOptionsSquashMode> getSquashMode() {
        return this.squashMode == null ? Codegen.empty() : this.squashMode;
    }

    public NfsExportOptionsArgs(
        @Nullable Output<NfsExportOptionsAccessMode> accessMode,
        @Nullable Output<String> anonGid,
        @Nullable Output<String> anonUid,
        @Nullable Output<List<String>> ipRanges,
        @Nullable Output<NfsExportOptionsSquashMode> squashMode) {
        this.accessMode = accessMode;
        this.anonGid = anonGid;
        this.anonUid = anonUid;
        this.ipRanges = ipRanges;
        this.squashMode = squashMode;
    }

    private NfsExportOptionsArgs() {
        this.accessMode = Codegen.empty();
        this.anonGid = Codegen.empty();
        this.anonUid = Codegen.empty();
        this.ipRanges = Codegen.empty();
        this.squashMode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NfsExportOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<NfsExportOptionsAccessMode> accessMode;
        private @Nullable Output<String> anonGid;
        private @Nullable Output<String> anonUid;
        private @Nullable Output<List<String>> ipRanges;
        private @Nullable Output<NfsExportOptionsSquashMode> squashMode;

        public Builder() {
    	      // Empty
        }

        public Builder(NfsExportOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessMode = defaults.accessMode;
    	      this.anonGid = defaults.anonGid;
    	      this.anonUid = defaults.anonUid;
    	      this.ipRanges = defaults.ipRanges;
    	      this.squashMode = defaults.squashMode;
        }

        public Builder accessMode(@Nullable Output<NfsExportOptionsAccessMode> accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public Builder accessMode(@Nullable NfsExportOptionsAccessMode accessMode) {
            this.accessMode = Codegen.ofNullable(accessMode);
            return this;
        }
        public Builder anonGid(@Nullable Output<String> anonGid) {
            this.anonGid = anonGid;
            return this;
        }
        public Builder anonGid(@Nullable String anonGid) {
            this.anonGid = Codegen.ofNullable(anonGid);
            return this;
        }
        public Builder anonUid(@Nullable Output<String> anonUid) {
            this.anonUid = anonUid;
            return this;
        }
        public Builder anonUid(@Nullable String anonUid) {
            this.anonUid = Codegen.ofNullable(anonUid);
            return this;
        }
        public Builder ipRanges(@Nullable Output<List<String>> ipRanges) {
            this.ipRanges = ipRanges;
            return this;
        }
        public Builder ipRanges(@Nullable List<String> ipRanges) {
            this.ipRanges = Codegen.ofNullable(ipRanges);
            return this;
        }
        public Builder ipRanges(String... ipRanges) {
            return ipRanges(List.of(ipRanges));
        }
        public Builder squashMode(@Nullable Output<NfsExportOptionsSquashMode> squashMode) {
            this.squashMode = squashMode;
            return this;
        }
        public Builder squashMode(@Nullable NfsExportOptionsSquashMode squashMode) {
            this.squashMode = Codegen.ofNullable(squashMode);
            return this;
        }        public NfsExportOptionsArgs build() {
            return new NfsExportOptionsArgs(accessMode, anonGid, anonUid, ipRanges, squashMode);
        }
    }
}
