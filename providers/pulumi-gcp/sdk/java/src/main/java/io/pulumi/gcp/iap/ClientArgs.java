// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ClientArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClientArgs Empty = new ClientArgs();

    /**
     * Identifier of the brand to which this client
     * is attached to. The format is
     * `projects/{project_number}/brands/{brand_id}/identityAwareProxyClients/{client_id}`.
     * 
     */
    @Import(name="brand", required=true)
      private final Output<String> brand;

    public Output<String> getBrand() {
        return this.brand;
    }

    /**
     * Human-friendly name given to the OAuth client.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    public ClientArgs(
        Output<String> brand,
        Output<String> displayName) {
        this.brand = Objects.requireNonNull(brand, "expected parameter 'brand' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
    }

    private ClientArgs() {
        this.brand = Output.empty();
        this.displayName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> brand;
        private Output<String> displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brand = defaults.brand;
    	      this.displayName = defaults.displayName;
        }

        public Builder brand(Output<String> brand) {
            this.brand = Objects.requireNonNull(brand);
            return this;
        }
        public Builder brand(String brand) {
            this.brand = Output.of(Objects.requireNonNull(brand));
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }        public ClientArgs build() {
            return new ClientArgs(brand, displayName);
        }
    }
}
