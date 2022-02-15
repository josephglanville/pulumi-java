// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.inputs;

import io.pulumi.awsnative.datasync.enums.LocationHDFSQopConfigurationDataTransferProtection;
import io.pulumi.awsnative.datasync.enums.LocationHDFSQopConfigurationRpcProtection;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LocationHDFSQopConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final LocationHDFSQopConfiguration Empty = new LocationHDFSQopConfiguration();

    @InputImport(name="dataTransferProtection")
    private final @Nullable LocationHDFSQopConfigurationDataTransferProtection dataTransferProtection;

    public Optional<LocationHDFSQopConfigurationDataTransferProtection> getDataTransferProtection() {
        return this.dataTransferProtection == null ? Optional.empty() : Optional.ofNullable(this.dataTransferProtection);
    }

    @InputImport(name="rpcProtection")
    private final @Nullable LocationHDFSQopConfigurationRpcProtection rpcProtection;

    public Optional<LocationHDFSQopConfigurationRpcProtection> getRpcProtection() {
        return this.rpcProtection == null ? Optional.empty() : Optional.ofNullable(this.rpcProtection);
    }

    public LocationHDFSQopConfiguration(
        @Nullable LocationHDFSQopConfigurationDataTransferProtection dataTransferProtection,
        @Nullable LocationHDFSQopConfigurationRpcProtection rpcProtection) {
        this.dataTransferProtection = dataTransferProtection;
        this.rpcProtection = rpcProtection;
    }

    private LocationHDFSQopConfiguration() {
        this.dataTransferProtection = null;
        this.rpcProtection = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationHDFSQopConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LocationHDFSQopConfigurationDataTransferProtection dataTransferProtection;
        private @Nullable LocationHDFSQopConfigurationRpcProtection rpcProtection;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationHDFSQopConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataTransferProtection = defaults.dataTransferProtection;
    	      this.rpcProtection = defaults.rpcProtection;
        }

        public Builder setDataTransferProtection(@Nullable LocationHDFSQopConfigurationDataTransferProtection dataTransferProtection) {
            this.dataTransferProtection = dataTransferProtection;
            return this;
        }

        public Builder setRpcProtection(@Nullable LocationHDFSQopConfigurationRpcProtection rpcProtection) {
            this.rpcProtection = rpcProtection;
            return this;
        }

        public LocationHDFSQopConfiguration build() {
            return new LocationHDFSQopConfiguration(dataTransferProtection, rpcProtection);
        }
    }
}