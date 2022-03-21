// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatacatalogV1SystemTimestampsResponse {
    /**
     * Creation timestamp of the resource within the given system.
     * 
     */
    private final String createTime;
    /**
     * Expiration timestamp of the resource within the given system. Currently only applicable to BigQuery resources.
     * 
     */
    private final String expireTime;
    /**
     * Timestamp of the last modification of the resource or its metadata within a given system. Note: Depending on the source system, not every modification updates this timestamp. For example, BigQuery timestamps every metadata modification but not data or permission changes.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GoogleCloudDatacatalogV1SystemTimestampsResponse(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("expireTime") String expireTime,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.expireTime = expireTime;
        this.updateTime = updateTime;
    }

    /**
     * Creation timestamp of the resource within the given system.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Expiration timestamp of the resource within the given system. Currently only applicable to BigQuery resources.
     * 
    */
    public String getExpireTime() {
        return this.expireTime;
    }
    /**
     * Timestamp of the last modification of the resource or its metadata within a given system. Note: Depending on the source system, not every modification updates this timestamp. For example, BigQuery timestamps every metadata modification but not data or permission changes.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1SystemTimestampsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String expireTime;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1SystemTimestampsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.expireTime = defaults.expireTime;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GoogleCloudDatacatalogV1SystemTimestampsResponse build() {
            return new GoogleCloudDatacatalogV1SystemTimestampsResponse(createTime, expireTime, updateTime);
        }
    }
}
