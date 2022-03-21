// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityContactPropertiesResponseNotificationsByRole {
    /**
     * Defines which RBAC roles will get email notifications from Azure Security Center. List of allowed RBAC roles:
     * 
     */
    private final @Nullable List<String> roles;
    /**
     * Defines whether to send email notifications from Azure Security Center to persons with specific RBAC roles on the subscription.
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private SecurityContactPropertiesResponseNotificationsByRole(
        @CustomType.Parameter("roles") @Nullable List<String> roles,
        @CustomType.Parameter("state") @Nullable String state) {
        this.roles = roles;
        this.state = state;
    }

    /**
     * Defines which RBAC roles will get email notifications from Azure Security Center. List of allowed RBAC roles:
     * 
    */
    public List<String> getRoles() {
        return this.roles == null ? List.of() : this.roles;
    }
    /**
     * Defines whether to send email notifications from Azure Security Center to persons with specific RBAC roles on the subscription.
     * 
    */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
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

        public Builder roles(@Nullable List<String> roles) {
            this.roles = roles;
            return this;
        }
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public SecurityContactPropertiesResponseNotificationsByRole build() {
            return new SecurityContactPropertiesResponseNotificationsByRole(roles, state);
        }
    }
}
