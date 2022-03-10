// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LocationHdfsQopConfiguration {
    /**
     * The data transfer protection setting configured on the HDFS cluster. This setting corresponds to your dfs.data.transfer.protection setting in the hdfs-site.xml file on your Hadoop cluster. Valid values are `DISABLED`, `AUTHENTICATION`, `INTEGRITY` and `PRIVACY`.
     * 
     */
    private final @Nullable String dataTransferProtection;
    /**
     * The RPC protection setting configured on the HDFS cluster. This setting corresponds to your hadoop.rpc.protection setting in your core-site.xml file on your Hadoop cluster. Valid values are `DISABLED`, `AUTHENTICATION`, `INTEGRITY` and `PRIVACY`.
     * 
     */
    private final @Nullable String rpcProtection;

    @OutputCustomType.Constructor
    private LocationHdfsQopConfiguration(
        @OutputCustomType.Parameter("dataTransferProtection") @Nullable String dataTransferProtection,
        @OutputCustomType.Parameter("rpcProtection") @Nullable String rpcProtection) {
        this.dataTransferProtection = dataTransferProtection;
        this.rpcProtection = rpcProtection;
    }

    /**
     * The data transfer protection setting configured on the HDFS cluster. This setting corresponds to your dfs.data.transfer.protection setting in the hdfs-site.xml file on your Hadoop cluster. Valid values are `DISABLED`, `AUTHENTICATION`, `INTEGRITY` and `PRIVACY`.
     * 
    */
    public Optional<String> getDataTransferProtection() {
        return Optional.ofNullable(this.dataTransferProtection);
    }
    /**
     * The RPC protection setting configured on the HDFS cluster. This setting corresponds to your hadoop.rpc.protection setting in your core-site.xml file on your Hadoop cluster. Valid values are `DISABLED`, `AUTHENTICATION`, `INTEGRITY` and `PRIVACY`.
     * 
    */
    public Optional<String> getRpcProtection() {
        return Optional.ofNullable(this.rpcProtection);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationHdfsQopConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataTransferProtection;
        private @Nullable String rpcProtection;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationHdfsQopConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataTransferProtection = defaults.dataTransferProtection;
    	      this.rpcProtection = defaults.rpcProtection;
        }

        public Builder setDataTransferProtection(@Nullable String dataTransferProtection) {
            this.dataTransferProtection = dataTransferProtection;
            return this;
        }

        public Builder setRpcProtection(@Nullable String rpcProtection) {
            this.rpcProtection = rpcProtection;
            return this;
        }
        public LocationHdfsQopConfiguration build() {
            return new LocationHdfsQopConfiguration(dataTransferProtection, rpcProtection);
        }
    }
}
