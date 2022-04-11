// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.apimanagement.enums.AppType;
import io.pulumi.azurenative.apimanagement.enums.Confirmation;
import io.pulumi.azurenative.apimanagement.enums.UserState;
import io.pulumi.azurenative.apimanagement.inputs.UserIdentityContractArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * Determines the type of application which send the create user request. Default is legacy portal.
     * 
     */
    @Import(name="appType")
      private final @Nullable Output<Either<String,AppType>> appType;

    public Output<Either<String,AppType>> getAppType() {
        return this.appType == null ? Codegen.empty() : this.appType;
    }

    /**
     * Determines the type of confirmation e-mail that will be sent to the newly created user.
     * 
     */
    @Import(name="confirmation")
      private final @Nullable Output<Either<String,Confirmation>> confirmation;

    public Output<Either<String,Confirmation>> getConfirmation() {
        return this.confirmation == null ? Codegen.empty() : this.confirmation;
    }

    /**
     * Email address. Must not be empty and must be unique within the service instance.
     * 
     */
    @Import(name="email", required=true)
      private final Output<String> email;

    public Output<String> getEmail() {
        return this.email;
    }

    /**
     * First name.
     * 
     */
    @Import(name="firstName", required=true)
      private final Output<String> firstName;

    public Output<String> getFirstName() {
        return this.firstName;
    }

    /**
     * Collection of user identities.
     * 
     */
    @Import(name="identities")
      private final @Nullable Output<List<UserIdentityContractArgs>> identities;

    public Output<List<UserIdentityContractArgs>> getIdentities() {
        return this.identities == null ? Codegen.empty() : this.identities;
    }

    /**
     * Last name.
     * 
     */
    @Import(name="lastName", required=true)
      private final Output<String> lastName;

    public Output<String> getLastName() {
        return this.lastName;
    }

    /**
     * Optional note about a user set by the administrator.
     * 
     */
    @Import(name="note")
      private final @Nullable Output<String> note;

    public Output<String> getNote() {
        return this.note == null ? Codegen.empty() : this.note;
    }

    /**
     * Send an Email notification to the User.
     * 
     */
    @Import(name="notify")
      private final @Nullable Output<Boolean> notify;

    public Output<Boolean> getNotify() {
        return this.notify == null ? Codegen.empty() : this.notify;
    }

    /**
     * User Password. If no value is provided, a default password is generated.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * Account state. Specifies whether the user is active or not. Blocked users are unable to sign into the developer portal or call any APIs of subscribed products. Default state is Active.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<Either<String,UserState>> state;

    public Output<Either<String,UserState>> getState() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    /**
     * User identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="userId")
      private final @Nullable Output<String> userId;

    public Output<String> getUserId() {
        return this.userId == null ? Codegen.empty() : this.userId;
    }

    public UserArgs(
        @Nullable Output<Either<String,AppType>> appType,
        @Nullable Output<Either<String,Confirmation>> confirmation,
        Output<String> email,
        Output<String> firstName,
        @Nullable Output<List<UserIdentityContractArgs>> identities,
        Output<String> lastName,
        @Nullable Output<String> note,
        @Nullable Output<Boolean> notify,
        @Nullable Output<String> password,
        Output<String> resourceGroupName,
        Output<String> serviceName,
        @Nullable Output<Either<String,UserState>> state,
        @Nullable Output<String> userId) {
        this.appType = appType;
        this.confirmation = confirmation;
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.firstName = Objects.requireNonNull(firstName, "expected parameter 'firstName' to be non-null");
        this.identities = identities;
        this.lastName = Objects.requireNonNull(lastName, "expected parameter 'lastName' to be non-null");
        this.note = note;
        this.notify = notify;
        this.password = password;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.state = state == null ? Output.ofLeft("active") : state;
        this.userId = userId;
    }

    private UserArgs() {
        this.appType = Codegen.empty();
        this.confirmation = Codegen.empty();
        this.email = Codegen.empty();
        this.firstName = Codegen.empty();
        this.identities = Codegen.empty();
        this.lastName = Codegen.empty();
        this.note = Codegen.empty();
        this.notify = Codegen.empty();
        this.password = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serviceName = Codegen.empty();
        this.state = Codegen.empty();
        this.userId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,AppType>> appType;
        private @Nullable Output<Either<String,Confirmation>> confirmation;
        private Output<String> email;
        private Output<String> firstName;
        private @Nullable Output<List<UserIdentityContractArgs>> identities;
        private Output<String> lastName;
        private @Nullable Output<String> note;
        private @Nullable Output<Boolean> notify;
        private @Nullable Output<String> password;
        private Output<String> resourceGroupName;
        private Output<String> serviceName;
        private @Nullable Output<Either<String,UserState>> state;
        private @Nullable Output<String> userId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appType = defaults.appType;
    	      this.confirmation = defaults.confirmation;
    	      this.email = defaults.email;
    	      this.firstName = defaults.firstName;
    	      this.identities = defaults.identities;
    	      this.lastName = defaults.lastName;
    	      this.note = defaults.note;
    	      this.notify = defaults.notify;
    	      this.password = defaults.password;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.state = defaults.state;
    	      this.userId = defaults.userId;
        }

        public Builder appType(@Nullable Output<Either<String,AppType>> appType) {
            this.appType = appType;
            return this;
        }
        public Builder appType(@Nullable Either<String,AppType> appType) {
            this.appType = Codegen.ofNullable(appType);
            return this;
        }
        public Builder confirmation(@Nullable Output<Either<String,Confirmation>> confirmation) {
            this.confirmation = confirmation;
            return this;
        }
        public Builder confirmation(@Nullable Either<String,Confirmation> confirmation) {
            this.confirmation = Codegen.ofNullable(confirmation);
            return this;
        }
        public Builder email(Output<String> email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder email(String email) {
            this.email = Output.of(Objects.requireNonNull(email));
            return this;
        }
        public Builder firstName(Output<String> firstName) {
            this.firstName = Objects.requireNonNull(firstName);
            return this;
        }
        public Builder firstName(String firstName) {
            this.firstName = Output.of(Objects.requireNonNull(firstName));
            return this;
        }
        public Builder identities(@Nullable Output<List<UserIdentityContractArgs>> identities) {
            this.identities = identities;
            return this;
        }
        public Builder identities(@Nullable List<UserIdentityContractArgs> identities) {
            this.identities = Codegen.ofNullable(identities);
            return this;
        }
        public Builder identities(UserIdentityContractArgs... identities) {
            return identities(List.of(identities));
        }
        public Builder lastName(Output<String> lastName) {
            this.lastName = Objects.requireNonNull(lastName);
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = Output.of(Objects.requireNonNull(lastName));
            return this;
        }
        public Builder note(@Nullable Output<String> note) {
            this.note = note;
            return this;
        }
        public Builder note(@Nullable String note) {
            this.note = Codegen.ofNullable(note);
            return this;
        }
        public Builder notify(@Nullable Output<Boolean> notify) {
            this.notify = notify;
            return this;
        }
        public Builder notify(@Nullable Boolean notify) {
            this.notify = Codegen.ofNullable(notify);
            return this;
        }
        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Codegen.ofNullable(password);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public Builder state(@Nullable Output<Either<String,UserState>> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable Either<String,UserState> state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }
        public Builder userId(@Nullable Output<String> userId) {
            this.userId = userId;
            return this;
        }
        public Builder userId(@Nullable String userId) {
            this.userId = Codegen.ofNullable(userId);
            return this;
        }        public UserArgs build() {
            return new UserArgs(appType, confirmation, email, firstName, identities, lastName, note, notify, password, resourceGroupName, serviceName, state, userId);
        }
    }
}
