// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.enums.KeyType;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetUserSharedAccessTokenArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetUserSharedAccessTokenArgs Empty = new GetUserSharedAccessTokenArgs();

    /**
     * The Expiry time of the Token. Maximum token expiry time is set to 30 days. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    @Import(name="expiry", required=true)
      private final String expiry;

    public String getExpiry() {
        return this.expiry;
    }

    /**
     * The Key to be used to generate token for user.
     * 
     */
    @Import(name="keyType", required=true)
      private final KeyType keyType;

    public KeyType getKeyType() {
        return this.keyType;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * User identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="userId", required=true)
      private final String userId;

    public String getUserId() {
        return this.userId;
    }

    public GetUserSharedAccessTokenArgs(
        String expiry,
        KeyType keyType,
        String resourceGroupName,
        String serviceName,
        String userId) {
        this.expiry = Objects.requireNonNull(expiry, "expected parameter 'expiry' to be non-null");
        this.keyType = keyType == null ? io.pulumi.azurenative.apimanagement.enums.KeyType.Primary : Objects.requireNonNull(keyType, "expected parameter 'keyType' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
    }

    private GetUserSharedAccessTokenArgs() {
        this.expiry = null;
        this.keyType = null;
        this.resourceGroupName = null;
        this.serviceName = null;
        this.userId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserSharedAccessTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expiry;
        private KeyType keyType;
        private String resourceGroupName;
        private String serviceName;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserSharedAccessTokenArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiry = defaults.expiry;
    	      this.keyType = defaults.keyType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.userId = defaults.userId;
        }

        public Builder expiry(String expiry) {
            this.expiry = Objects.requireNonNull(expiry);
            return this;
        }
        public Builder keyType(KeyType keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }        public GetUserSharedAccessTokenArgs build() {
            return new GetUserSharedAccessTokenArgs(expiry, keyType, resourceGroupName, serviceName, userId);
        }
    }
}
