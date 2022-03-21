// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TemporaryDiskResponse {
    /**
     * Mount path of the temporary disk
     * 
     */
    private final @Nullable String mountPath;
    /**
     * Size of the temporary disk in GB
     * 
     */
    private final @Nullable Integer sizeInGB;

    @CustomType.Constructor
    private TemporaryDiskResponse(
        @CustomType.Parameter("mountPath") @Nullable String mountPath,
        @CustomType.Parameter("sizeInGB") @Nullable Integer sizeInGB) {
        this.mountPath = mountPath;
        this.sizeInGB = sizeInGB;
    }

    /**
     * Mount path of the temporary disk
     * 
    */
    public Optional<String> getMountPath() {
        return Optional.ofNullable(this.mountPath);
    }
    /**
     * Size of the temporary disk in GB
     * 
    */
    public Optional<Integer> getSizeInGB() {
        return Optional.ofNullable(this.sizeInGB);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemporaryDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String mountPath;
        private @Nullable Integer sizeInGB;

        public Builder() {
    	      // Empty
        }

        public Builder(TemporaryDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.sizeInGB = defaults.sizeInGB;
        }

        public Builder mountPath(@Nullable String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public Builder sizeInGB(@Nullable Integer sizeInGB) {
            this.sizeInGB = sizeInGB;
            return this;
        }        public TemporaryDiskResponse build() {
            return new TemporaryDiskResponse(mountPath, sizeInGB);
        }
    }
}
