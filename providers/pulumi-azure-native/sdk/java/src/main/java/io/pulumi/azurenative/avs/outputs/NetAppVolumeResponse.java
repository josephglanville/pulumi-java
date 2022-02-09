// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetAppVolumeResponse {
    private final @Nullable String nfsFilePath;
    private final @Nullable String nfsProviderIp;

    @OutputCustomType.Constructor({"nfsFilePath","nfsProviderIp"})
    private NetAppVolumeResponse(
        @Nullable String nfsFilePath,
        @Nullable String nfsProviderIp) {
        this.nfsFilePath = nfsFilePath;
        this.nfsProviderIp = nfsProviderIp;
    }

    public Optional<String> getNfsFilePath() {
        return Optional.ofNullable(this.nfsFilePath);
    }
    public Optional<String> getNfsProviderIp() {
        return Optional.ofNullable(this.nfsProviderIp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetAppVolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nfsFilePath;
        private @Nullable String nfsProviderIp;

        public Builder() {
    	      // Empty
        }

        public Builder(NetAppVolumeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nfsFilePath = defaults.nfsFilePath;
    	      this.nfsProviderIp = defaults.nfsProviderIp;
        }

        public Builder setNfsFilePath(@Nullable String nfsFilePath) {
            this.nfsFilePath = nfsFilePath;
            return this;
        }

        public Builder setNfsProviderIp(@Nullable String nfsProviderIp) {
            this.nfsProviderIp = nfsProviderIp;
            return this;
        }

        public NetAppVolumeResponse build() {
            return new NetAppVolumeResponse(nfsFilePath, nfsProviderIp);
        }
    }
}
