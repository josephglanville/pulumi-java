// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The bandwidth for the link.
 * 
 */
public final class LinkBandwidth extends io.pulumi.resources.InvokeArgs {

    public static final LinkBandwidth Empty = new LinkBandwidth();

    /**
     * Download speed in Mbps.
     * 
     */
    @Import(name="downloadSpeed")
      private final @Nullable Integer downloadSpeed;

    public Optional<Integer> getDownloadSpeed() {
        return this.downloadSpeed == null ? Optional.empty() : Optional.ofNullable(this.downloadSpeed);
    }

    /**
     * Upload speed in Mbps.
     * 
     */
    @Import(name="uploadSpeed")
      private final @Nullable Integer uploadSpeed;

    public Optional<Integer> getUploadSpeed() {
        return this.uploadSpeed == null ? Optional.empty() : Optional.ofNullable(this.uploadSpeed);
    }

    public LinkBandwidth(
        @Nullable Integer downloadSpeed,
        @Nullable Integer uploadSpeed) {
        this.downloadSpeed = downloadSpeed;
        this.uploadSpeed = uploadSpeed;
    }

    private LinkBandwidth() {
        this.downloadSpeed = null;
        this.uploadSpeed = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkBandwidth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer downloadSpeed;
        private @Nullable Integer uploadSpeed;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkBandwidth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.downloadSpeed = defaults.downloadSpeed;
    	      this.uploadSpeed = defaults.uploadSpeed;
        }

        public Builder downloadSpeed(@Nullable Integer downloadSpeed) {
            this.downloadSpeed = downloadSpeed;
            return this;
        }
        public Builder uploadSpeed(@Nullable Integer uploadSpeed) {
            this.uploadSpeed = uploadSpeed;
            return this;
        }        public LinkBandwidth build() {
            return new LinkBandwidth(downloadSpeed, uploadSpeed);
        }
    }
}
