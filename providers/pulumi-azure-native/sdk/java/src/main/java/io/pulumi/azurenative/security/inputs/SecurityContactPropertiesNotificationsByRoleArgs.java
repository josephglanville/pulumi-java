// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.enums.Roles;
import io.pulumi.azurenative.security.enums.State;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines whether to send email notifications from Azure Security Center to persons with specific RBAC roles on the subscription.
 * 
 */
public final class SecurityContactPropertiesNotificationsByRoleArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityContactPropertiesNotificationsByRoleArgs Empty = new SecurityContactPropertiesNotificationsByRoleArgs();

    /**
     * Defines which RBAC roles will get email notifications from Azure Security Center. List of allowed RBAC roles:
     * 
     */
    @InputImport(name="roles")
      private final @Nullable Input<List<Either<String,Roles>>> roles;

    public Input<List<Either<String,Roles>>> getRoles() {
        return this.roles == null ? Input.empty() : this.roles;
    }

    /**
     * Defines whether to send email notifications from Azure Security Center to persons with specific RBAC roles on the subscription.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<Either<String,State>> state;

    public Input<Either<String,State>> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public SecurityContactPropertiesNotificationsByRoleArgs(
        @Nullable Input<List<Either<String,Roles>>> roles,
        @Nullable Input<Either<String,State>> state) {
        this.roles = roles;
        this.state = state;
    }

    private SecurityContactPropertiesNotificationsByRoleArgs() {
        this.roles = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityContactPropertiesNotificationsByRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Either<String,Roles>>> roles;
        private @Nullable Input<Either<String,State>> state;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityContactPropertiesNotificationsByRoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roles = defaults.roles;
    	      this.state = defaults.state;
        }

        public Builder setRoles(@Nullable Input<List<Either<String,Roles>>> roles) {
            this.roles = roles;
            return this;
        }

        public Builder setRoles(@Nullable List<Either<String,Roles>> roles) {
            this.roles = Input.ofNullable(roles);
            return this;
        }

        public Builder setState(@Nullable Input<Either<String,State>> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable Either<String,State> state) {
            this.state = Input.ofNullable(state);
            return this;
        }
        public SecurityContactPropertiesNotificationsByRoleArgs build() {
            return new SecurityContactPropertiesNotificationsByRoleArgs(roles, state);
        }
    }
}
