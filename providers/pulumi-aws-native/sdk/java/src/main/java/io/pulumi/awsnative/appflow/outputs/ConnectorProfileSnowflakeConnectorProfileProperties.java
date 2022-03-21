// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorProfileSnowflakeConnectorProfileProperties {
    /**
     * The name of the account.
     * 
     */
    private final @Nullable String accountName;
    /**
     * The name of the Amazon S3 bucket associated with Snowﬂake.
     * 
     */
    private final String bucketName;
    /**
     * The bucket prefix that refers to the Amazon S3 bucket associated with Snowﬂake.
     * 
     */
    private final @Nullable String bucketPrefix;
    /**
     * The Snowﬂake Private Link service name to be used for private data transfers.
     * 
     */
    private final @Nullable String privateLinkServiceName;
    /**
     * The region of the Snowﬂake account.
     * 
     */
    private final @Nullable String region;
    /**
     * The name of the Amazon S3 stage that was created while setting up an Amazon S3 stage in the
     * Snowﬂake account. This is written in the following format: < Database>< Schema><Stage Name>.
     * 
     */
    private final String stage;
    /**
     * The name of the Snowﬂake warehouse.
     * 
     */
    private final String warehouse;

    @CustomType.Constructor
    private ConnectorProfileSnowflakeConnectorProfileProperties(
        @CustomType.Parameter("accountName") @Nullable String accountName,
        @CustomType.Parameter("bucketName") String bucketName,
        @CustomType.Parameter("bucketPrefix") @Nullable String bucketPrefix,
        @CustomType.Parameter("privateLinkServiceName") @Nullable String privateLinkServiceName,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("stage") String stage,
        @CustomType.Parameter("warehouse") String warehouse) {
        this.accountName = accountName;
        this.bucketName = bucketName;
        this.bucketPrefix = bucketPrefix;
        this.privateLinkServiceName = privateLinkServiceName;
        this.region = region;
        this.stage = stage;
        this.warehouse = warehouse;
    }

    /**
     * The name of the account.
     * 
    */
    public Optional<String> getAccountName() {
        return Optional.ofNullable(this.accountName);
    }
    /**
     * The name of the Amazon S3 bucket associated with Snowﬂake.
     * 
    */
    public String getBucketName() {
        return this.bucketName;
    }
    /**
     * The bucket prefix that refers to the Amazon S3 bucket associated with Snowﬂake.
     * 
    */
    public Optional<String> getBucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }
    /**
     * The Snowﬂake Private Link service name to be used for private data transfers.
     * 
    */
    public Optional<String> getPrivateLinkServiceName() {
        return Optional.ofNullable(this.privateLinkServiceName);
    }
    /**
     * The region of the Snowﬂake account.
     * 
    */
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }
    /**
     * The name of the Amazon S3 stage that was created while setting up an Amazon S3 stage in the
     * Snowﬂake account. This is written in the following format: < Database>< Schema><Stage Name>.
     * 
    */
    public String getStage() {
        return this.stage;
    }
    /**
     * The name of the Snowﬂake warehouse.
     * 
    */
    public String getWarehouse() {
        return this.warehouse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileSnowflakeConnectorProfileProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountName;
        private String bucketName;
        private @Nullable String bucketPrefix;
        private @Nullable String privateLinkServiceName;
        private @Nullable String region;
        private String stage;
        private String warehouse;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileSnowflakeConnectorProfileProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.privateLinkServiceName = defaults.privateLinkServiceName;
    	      this.region = defaults.region;
    	      this.stage = defaults.stage;
    	      this.warehouse = defaults.warehouse;
        }

        public Builder accountName(@Nullable String accountName) {
            this.accountName = accountName;
            return this;
        }
        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        public Builder bucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }
        public Builder privateLinkServiceName(@Nullable String privateLinkServiceName) {
            this.privateLinkServiceName = privateLinkServiceName;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public Builder stage(String stage) {
            this.stage = Objects.requireNonNull(stage);
            return this;
        }
        public Builder warehouse(String warehouse) {
            this.warehouse = Objects.requireNonNull(warehouse);
            return this;
        }        public ConnectorProfileSnowflakeConnectorProfileProperties build() {
            return new ConnectorProfileSnowflakeConnectorProfileProperties(accountName, bucketName, bucketPrefix, privateLinkServiceName, region, stage, warehouse);
        }
    }
}
