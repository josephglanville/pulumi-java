// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines whether to send email notifications from Azure Security Center to persons with specific RBAC roles on the subscription.
 * 
 */
public final class SecurityContactPropertiesResponseNotificationsByRole extends io.pulumi.resources.InvokeArgs {

    public static final SecurityContactPropertiesResponseNotificationsByRole Empty = new SecurityContactPropertiesResponseNotificationsByRole();

    /**
     * Defines which RBAC roles will get email notifications from Azure Security Center. List of allowed RBAC roles:
     * 
     */
    @InputImport(name="roles")
      private final @Nullable List<String> roles;

    public List<String> getRoles() {
        return this.roles == null ? List.of() : this.roles;
    }

    /**
     * Defines whether to send email notifications from Azure Security Center to persons with specific RBAC roles on the subscription.
     * 
     */
    @InputImport(name="state")
      private final @Nullable String state;

    public Optional<String> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    public SecurityContactPropertiesResponseNotificationsByRole(
        @Nullable List<String> roles,
        @Nullable String state) {
        this.roles = roles;
        this.state = state;
    }

    private SecurityContactPropertiesResponseNotificationsByRole() {
        this.roles = List.of();
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityContactPropertiesResponseNotificationsByRole defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> roles;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityContactPropertiesResponseNotificationsByRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roles = defaults.roles;
    	      this.state = defaults.state;
        }

        public Builder setRoles(@Nullable List<String> roles) {
            this.roles = roles;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }
        public SecurityContactPropertiesResponseNotificationsByRole build() {
            return new SecurityContactPropertiesResponseNotificationsByRole(roles, state);
        }
    }
}
