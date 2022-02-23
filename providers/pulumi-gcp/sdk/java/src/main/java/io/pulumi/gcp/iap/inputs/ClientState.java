// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClientState extends io.pulumi.resources.ResourceArgs {

    public static final ClientState Empty = new ClientState();

    /**
     * Identifier of the brand to which this client
     * is attached to. The format is
     * `projects/{project_number}/brands/{brand_id}/identityAwareProxyClients/{client_id}`.
     * 
     */
    @InputImport(name="brand")
      private final @Nullable Input<String> brand;

    public Input<String> getBrand() {
        return this.brand == null ? Input.empty() : this.brand;
    }

    /**
     * Output only. Unique identifier of the OAuth client.
     * 
     */
    @InputImport(name="clientId")
      private final @Nullable Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId == null ? Input.empty() : this.clientId;
    }

    /**
     * Human-friendly name given to the OAuth client.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Output only. Client secret of the OAuth client.
     * 
     */
    @InputImport(name="secret")
      private final @Nullable Input<String> secret;

    public Input<String> getSecret() {
        return this.secret == null ? Input.empty() : this.secret;
    }

    public ClientState(
        @Nullable Input<String> brand,
        @Nullable Input<String> clientId,
        @Nullable Input<String> displayName,
        @Nullable Input<String> secret) {
        this.brand = brand;
        this.clientId = clientId;
        this.displayName = displayName;
        this.secret = secret;
    }

    private ClientState() {
        this.brand = Input.empty();
        this.clientId = Input.empty();
        this.displayName = Input.empty();
        this.secret = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> brand;
        private @Nullable Input<String> clientId;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> secret;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brand = defaults.brand;
    	      this.clientId = defaults.clientId;
    	      this.displayName = defaults.displayName;
    	      this.secret = defaults.secret;
        }

        public Builder setBrand(@Nullable Input<String> brand) {
            this.brand = brand;
            return this;
        }

        public Builder setBrand(@Nullable String brand) {
            this.brand = Input.ofNullable(brand);
            return this;
        }

        public Builder setClientId(@Nullable Input<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = Input.ofNullable(clientId);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setSecret(@Nullable Input<String> secret) {
            this.secret = secret;
            return this;
        }

        public Builder setSecret(@Nullable String secret) {
            this.secret = Input.ofNullable(secret);
            return this;
        }
        public ClientState build() {
            return new ClientState(brand, clientId, displayName, secret);
        }
    }
}
