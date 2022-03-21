// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The details of the identity used for CMK
 * 
 */
public final class CmkKekIdentityResponse extends io.pulumi.resources.InvokeArgs {

    public static final CmkKekIdentityResponse Empty = new CmkKekIdentityResponse();

    /**
     * Indicate that system assigned identity should be used. Mutually exclusive with 'userAssignedIdentity' field
     * 
     */
    @Import(name="useSystemAssignedIdentity")
      private final @Nullable Boolean useSystemAssignedIdentity;

    public Optional<Boolean> getUseSystemAssignedIdentity() {
        return this.useSystemAssignedIdentity == null ? Optional.empty() : Optional.ofNullable(this.useSystemAssignedIdentity);
    }

    /**
     * The user assigned identity to be used to grant permissions in case the type of identity used is UserAssigned
     * 
     */
    @Import(name="userAssignedIdentity")
      private final @Nullable String userAssignedIdentity;

    public Optional<String> getUserAssignedIdentity() {
        return this.userAssignedIdentity == null ? Optional.empty() : Optional.ofNullable(this.userAssignedIdentity);
    }

    public CmkKekIdentityResponse(
        @Nullable Boolean useSystemAssignedIdentity,
        @Nullable String userAssignedIdentity) {
        this.useSystemAssignedIdentity = useSystemAssignedIdentity;
        this.userAssignedIdentity = userAssignedIdentity;
    }

    private CmkKekIdentityResponse() {
        this.useSystemAssignedIdentity = null;
        this.userAssignedIdentity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CmkKekIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean useSystemAssignedIdentity;
        private @Nullable String userAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(CmkKekIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.useSystemAssignedIdentity = defaults.useSystemAssignedIdentity;
    	      this.userAssignedIdentity = defaults.userAssignedIdentity;
        }

        public Builder useSystemAssignedIdentity(@Nullable Boolean useSystemAssignedIdentity) {
            this.useSystemAssignedIdentity = useSystemAssignedIdentity;
            return this;
        }
        public Builder userAssignedIdentity(@Nullable String userAssignedIdentity) {
            this.userAssignedIdentity = userAssignedIdentity;
            return this;
        }        public CmkKekIdentityResponse build() {
            return new CmkKekIdentityResponse(useSystemAssignedIdentity, userAssignedIdentity);
        }
    }
}
