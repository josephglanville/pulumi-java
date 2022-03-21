// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NFSVolumeSource {
    /**
     * Path that is exported by the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * 
     */
    private final String path;
    /**
     * ReadOnly here will force the NFS export to be mounted with read-only permissions. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * 
     */
    private final @Nullable Boolean readOnly;
    /**
     * Server is the hostname or IP address of the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * 
     */
    private final String server;

    @CustomType.Constructor
    private NFSVolumeSource(
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("readOnly") @Nullable Boolean readOnly,
        @CustomType.Parameter("server") String server) {
        this.path = path;
        this.readOnly = readOnly;
        this.server = server;
    }

    /**
     * Path that is exported by the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * 
    */
    public String getPath() {
        return this.path;
    }
    /**
     * ReadOnly here will force the NFS export to be mounted with read-only permissions. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * 
    */
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * Server is the hostname or IP address of the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * 
    */
    public String getServer() {
        return this.server;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NFSVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String path;
        private @Nullable Boolean readOnly;
        private String server;

        public Builder() {
    	      // Empty
        }

        public Builder(NFSVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.readOnly = defaults.readOnly;
    	      this.server = defaults.server;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Builder server(String server) {
            this.server = Objects.requireNonNull(server);
            return this;
        }        public NFSVolumeSource build() {
            return new NFSVolumeSource(path, readOnly, server);
        }
    }
}
