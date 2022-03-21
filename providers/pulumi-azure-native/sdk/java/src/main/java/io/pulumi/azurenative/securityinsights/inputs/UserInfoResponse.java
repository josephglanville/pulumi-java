// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * User information that made some action
 * 
 */
public final class UserInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final UserInfoResponse Empty = new UserInfoResponse();

    /**
     * The email of the user.
     * 
     */
    @Import(name="email", required=true)
      private final String email;

    public String getEmail() {
        return this.email;
    }

    /**
     * The name of the user.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The object id of the user.
     * 
     */
    @Import(name="objectId")
      private final @Nullable String objectId;

    public Optional<String> getObjectId() {
        return this.objectId == null ? Optional.empty() : Optional.ofNullable(this.objectId);
    }

    public UserInfoResponse(
        String email,
        String name,
        @Nullable String objectId) {
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.objectId = objectId;
    }

    private UserInfoResponse() {
        this.email = null;
        this.name = null;
        this.objectId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private String name;
        private @Nullable String objectId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.name = defaults.name;
    	      this.objectId = defaults.objectId;
        }

        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder objectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }        public UserInfoResponse build() {
            return new UserInfoResponse(email, name, objectId);
        }
    }
}
