// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp;

import io.pulumi.azurenative.netapp.enums.QosType;
import io.pulumi.azurenative.netapp.enums.ServiceLevel;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final PoolArgs Empty = new PoolArgs();

    /**
     * The name of the NetApp account
     * 
     */
    @InputImport(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the capacity pool
     * 
     */
    @InputImport(name="poolName")
      private final @Nullable Output<String> poolName;

    public Output<String> getPoolName() {
        return this.poolName == null ? Output.empty() : this.poolName;
    }

    /**
     * The qos type of the pool
     * 
     */
    @InputImport(name="qosType")
      private final @Nullable Output<Either<String,QosType>> qosType;

    public Output<Either<String,QosType>> getQosType() {
        return this.qosType == null ? Output.empty() : this.qosType;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The service level of the file system
     * 
     */
    @InputImport(name="serviceLevel", required=true)
      private final Output<Either<String,ServiceLevel>> serviceLevel;

    public Output<Either<String,ServiceLevel>> getServiceLevel() {
        return this.serviceLevel;
    }

    /**
     * Provisioned size of the pool (in bytes). Allowed values are in 4TiB chunks (value must be multiply of 4398046511104).
     * 
     */
    @InputImport(name="size", required=true)
      private final Output<Double> size;

    public Output<Double> getSize() {
        return this.size;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public PoolArgs(
        Output<String> accountName,
        @Nullable Output<String> location,
        @Nullable Output<String> poolName,
        @Nullable Output<Either<String,QosType>> qosType,
        Output<String> resourceGroupName,
        Output<Either<String,ServiceLevel>> serviceLevel,
        Output<Double> size,
        @Nullable Output<Map<String,String>> tags) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.location = location;
        this.poolName = poolName;
        this.qosType = qosType == null ? Output.ofLeft("Auto") : qosType;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceLevel = serviceLevel == null ? Output.ofLeft("Premium") : Objects.requireNonNull(serviceLevel, "expected parameter 'serviceLevel' to be non-null");
        this.size = Objects.requireNonNull(size, "expected parameter 'size' to be non-null");
        this.tags = tags;
    }

    private PoolArgs() {
        this.accountName = Output.empty();
        this.location = Output.empty();
        this.poolName = Output.empty();
        this.qosType = Output.empty();
        this.resourceGroupName = Output.empty();
        this.serviceLevel = Output.empty();
        this.size = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> location;
        private @Nullable Output<String> poolName;
        private @Nullable Output<Either<String,QosType>> qosType;
        private Output<String> resourceGroupName;
        private Output<Either<String,ServiceLevel>> serviceLevel;
        private Output<Double> size;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.location = defaults.location;
    	      this.poolName = defaults.poolName;
    	      this.qosType = defaults.qosType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceLevel = defaults.serviceLevel;
    	      this.size = defaults.size;
    	      this.tags = defaults.tags;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder poolName(@Nullable Output<String> poolName) {
            this.poolName = poolName;
            return this;
        }

        public Builder poolName(@Nullable String poolName) {
            this.poolName = Output.ofNullable(poolName);
            return this;
        }

        public Builder qosType(@Nullable Output<Either<String,QosType>> qosType) {
            this.qosType = qosType;
            return this;
        }

        public Builder qosType(@Nullable Either<String,QosType> qosType) {
            this.qosType = Output.ofNullable(qosType);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder serviceLevel(Output<Either<String,ServiceLevel>> serviceLevel) {
            this.serviceLevel = Objects.requireNonNull(serviceLevel);
            return this;
        }

        public Builder serviceLevel(Either<String,ServiceLevel> serviceLevel) {
            this.serviceLevel = Output.of(Objects.requireNonNull(serviceLevel));
            return this;
        }

        public Builder size(Output<Double> size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder size(Double size) {
            this.size = Output.of(Objects.requireNonNull(size));
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public PoolArgs build() {
            return new PoolArgs(accountName, location, poolName, qosType, resourceGroupName, serviceLevel, size, tags);
        }
    }
}
