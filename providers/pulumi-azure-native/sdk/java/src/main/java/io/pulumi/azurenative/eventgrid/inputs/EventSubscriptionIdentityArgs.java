// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.azurenative.eventgrid.enums.EventSubscriptionIdentityType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The identity information with the event subscription.
 * 
 */
public final class EventSubscriptionIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventSubscriptionIdentityArgs Empty = new EventSubscriptionIdentityArgs();

    /**
     * The type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user-assigned identities. The type 'None' will remove any identity.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<Either<String,EventSubscriptionIdentityType>> type;

    public Input<Either<String,EventSubscriptionIdentityType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * The user identity associated with the resource.
     * 
     */
    @InputImport(name="userAssignedIdentity")
      private final @Nullable Input<String> userAssignedIdentity;

    public Input<String> getUserAssignedIdentity() {
        return this.userAssignedIdentity == null ? Input.empty() : this.userAssignedIdentity;
    }

    public EventSubscriptionIdentityArgs(
        @Nullable Input<Either<String,EventSubscriptionIdentityType>> type,
        @Nullable Input<String> userAssignedIdentity) {
        this.type = type;
        this.userAssignedIdentity = userAssignedIdentity;
    }

    private EventSubscriptionIdentityArgs() {
        this.type = Input.empty();
        this.userAssignedIdentity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSubscriptionIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,EventSubscriptionIdentityType>> type;
        private @Nullable Input<String> userAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSubscriptionIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentity = defaults.userAssignedIdentity;
        }

        public Builder setType(@Nullable Input<Either<String,EventSubscriptionIdentityType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,EventSubscriptionIdentityType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setUserAssignedIdentity(@Nullable Input<String> userAssignedIdentity) {
            this.userAssignedIdentity = userAssignedIdentity;
            return this;
        }

        public Builder setUserAssignedIdentity(@Nullable String userAssignedIdentity) {
            this.userAssignedIdentity = Input.ofNullable(userAssignedIdentity);
            return this;
        }
        public EventSubscriptionIdentityArgs build() {
            return new EventSubscriptionIdentityArgs(type, userAssignedIdentity);
        }
    }
}
