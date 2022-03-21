// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information on the client (user or application) that made some action
 * 
 */
public final class ClientInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClientInfoResponse Empty = new ClientInfoResponse();

    /**
     * The email of the client.
     * 
     */
    @Import(name="email")
      private final @Nullable String email;

    public Optional<String> getEmail() {
        return this.email == null ? Optional.empty() : Optional.ofNullable(this.email);
    }

    /**
     * The name of the client.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The object id of the client.
     * 
     */
    @Import(name="objectId")
      private final @Nullable String objectId;

    public Optional<String> getObjectId() {
        return this.objectId == null ? Optional.empty() : Optional.ofNullable(this.objectId);
    }

    /**
     * The user principal name of the client.
     * 
     */
    @Import(name="userPrincipalName")
      private final @Nullable String userPrincipalName;

    public Optional<String> getUserPrincipalName() {
        return this.userPrincipalName == null ? Optional.empty() : Optional.ofNullable(this.userPrincipalName);
    }

    public ClientInfoResponse(
        @Nullable String email,
        @Nullable String name,
        @Nullable String objectId,
        @Nullable String userPrincipalName) {
        this.email = email;
        this.name = name;
        this.objectId = objectId;
        this.userPrincipalName = userPrincipalName;
    }

    private ClientInfoResponse() {
        this.email = null;
        this.name = null;
        this.objectId = null;
        this.userPrincipalName = null;
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
