// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetClientArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetClientArgs Empty = new GetClientArgs();

    /**
     * The name of the brand.
     * 
     */
    @Import(name="brand", required=true)
      private final String brand;

    public String getBrand() {
        return this.brand;
    }

    /**
     * The client_id of the brand.
     * 
     */
    @Import(name="clientId", required=true)
      private final String clientId;

    public String getClientId() {
        return this.clientId;
    }

    public GetClientArgs(
        String brand,
        String clientId) {
        this.brand = Objects.requireNonNull(brand, "expected parameter 'brand' to be non-null");
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
    }

    private GetClientArgs() {
        this.brand = null;
        this.clientId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String brand;
        private String clientId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClientArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brand = defaults.brand;
    	      this.clientId = defaults.clientId;
        }

        public Builder brand(String brand) {
            this.brand = Objects.requireNonNull(brand);
            return this;
        }
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }        public GetClientArgs build() {
            return new GetClientArgs(brand, clientId);
        }
    }
}
