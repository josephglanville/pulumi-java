// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.inputs;

import io.pulumi.azurenative.storsimple.inputs.VolumeFailoverMetadataResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The metadata of the volume container, that is being considered as part of a failover set.
 * 
 */
public final class VolumeContainerFailoverMetadataResponse extends io.pulumi.resources.InvokeArgs {

    public static final VolumeContainerFailoverMetadataResponse Empty = new VolumeContainerFailoverMetadataResponse();

    /**
     * The path ID of the volume container.
     * 
     */
    @Import(name="volumeContainerId")
      private final @Nullable String volumeContainerId;

    public Optional<String> getVolumeContainerId() {
        return this.volumeContainerId == null ? Optional.empty() : Optional.ofNullable(this.volumeContainerId);
    }

    /**
     * The list of metadata of volumes inside the volume container, which contains valid cloud snapshots.
     * 
     */
    @Import(name="volumes")
      private final @Nullable List<VolumeFailoverMetadataResponse> volumes;

    public List<VolumeFailoverMetadataResponse> getVolumes() {
        return this.volumes == null ? List.of() : this.volumes;
    }

    public VolumeContainerFailoverMetadataResponse(
        @Nullable String volumeContainerId,
        @Nullable List<VolumeFailoverMetadataResponse> volumes) {
        this.volumeContainerId = volumeContainerId;
        this.volumes = volumes;
    }

    private VolumeContainerFailoverMetadataResponse() {
        this.volumeContainerId = null;
        this.volumes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeContainerFailoverMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String volumeContainerId;
        private @Nullable List<VolumeFailoverMetadataResponse> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeContainerFailoverMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.volumeContainerId = defaults.volumeContainerId;
    	      this.volumes = defaults.volumes;
        }

        public Builder volumeContainerId(@Nullable String volumeContainerId) {
            this.volumeContainerId = volumeContainerId;
            return this;
        }
        public Builder volumes(@Nullable List<VolumeFailoverMetadataResponse> volumes) {
            this.volumes = volumes;
            return this;
        }
        public Builder volumes(VolumeFailoverMetadataResponse... volumes) {
            return volumes(List.of(volumes));
        }        public VolumeContainerFailoverMetadataResponse build() {
            return new VolumeContainerFailoverMetadataResponse(volumeContainerId, volumes);
        }
    }
}
