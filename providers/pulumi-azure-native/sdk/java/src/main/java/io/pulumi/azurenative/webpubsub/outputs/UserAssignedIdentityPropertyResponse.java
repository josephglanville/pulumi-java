// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UserAssignedIdentityPropertyResponse {
    private final String clientId;
    private final String principalId;

    @OutputCustomType.Constructor({"clientId","principalId"})
    private UserAssignedIdentityPropertyResponse(
        String clientId,
        String principalId) {
        this.clientId = Objects.requireNonNull(clientId);
        this.principalId = Objects.requireNonNull(principalId);
    }

    public String getClientId() {
        return this.clientId;
    }
    public String getPrincipalId() {
        return this.principalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAssignedIdentityPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAssignedIdentityPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public UserAssignedIdentityPropertyResponse build() {
            return new UserAssignedIdentityPropertyResponse(clientId, principalId);
        }
    }
}
