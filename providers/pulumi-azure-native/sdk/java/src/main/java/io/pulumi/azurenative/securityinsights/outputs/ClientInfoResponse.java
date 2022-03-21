// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientInfoResponse {
    /**
     * The email of the client.
     * 
     */
    private final @Nullable String email;
    /**
     * The name of the client.
     * 
     */
    private final @Nullable String name;
    /**
     * The object id of the client.
     * 
     */
    private final @Nullable String objectId;
    /**
     * The user principal name of the client.
     * 
     */
    private final @Nullable String userPrincipalName;

    @CustomType.Constructor
    private ClientInfoResponse(
        @CustomType.Parameter("email") @Nullable String email,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("objectId") @Nullable String objectId,
        @CustomType.Parameter("userPrincipalName") @Nullable String userPrincipalName) {
        this.email = email;
        this.name = name;
        this.objectId = objectId;
        this.userPrincipalName = userPrincipalName;
    }

    /**
     * The email of the client.
     * 
    */
    public Optional<String> getEmail() {
        return Optional.ofNullable(this.email);
    }
    /**
     * The name of the client.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The object id of the client.
     * 
    */
    public Optional<String> getObjectId() {
        return Optional.ofNullable(this.objectId);
    }
    /**
     * The user principal name of the client.
     * 
    */
    public Optional<String> getUserPrincipalName() {
        return Optional.ofNullable(this.userPrincipalName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String email;
        private @Nullable String name;
        private @Nullable String objectId;
        private @Nullable String userPrincipalName;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.name = defaults.name;
    	      this.objectId = defaults.objectId;
    	      this.userPrincipalName = defaults.userPrincipalName;
        }

        public Builder email(@Nullable String email) {
            this.email = email;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder objectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }
        public Builder userPrincipalName(@Nullable String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }        public ClientInfoResponse build() {
            return new ClientInfoResponse(email, name, objectId, userPrincipalName);
        }
    }
}
