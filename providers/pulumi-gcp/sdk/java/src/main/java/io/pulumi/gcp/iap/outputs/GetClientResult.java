// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClientResult {
    private final String brand;
    private final String clientId;
    private final String displayName;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String secret;

    @CustomType.Constructor
    private GetClientResult(
        @CustomType.Parameter("brand") String brand,
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("secret") String secret) {
        this.brand = brand;
        this.clientId = clientId;
        this.displayName = displayName;
        this.id = id;
        this.secret = secret;
    }

    public String getBrand() {
        return this.brand;
    }
    public String getClientId() {
        return this.clientId;
    }
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getSecret() {
        return this.secret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String brand;
        private String clientId;
        private String displayName;
        private String id;
        private String secret;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClientResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brand = defaults.brand;
    	      this.clientId = defaults.clientId;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.secret = defaults.secret;
        }

        public Builder brand(String brand) {
            this.brand = Objects.requireNonNull(brand);
            return this;
        }
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder secret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }        public GetClientResult build() {
            return new GetClientResult(brand, clientId, displayName, id, secret);
        }
    }
}
