// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class LightHouseAuthorizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LightHouseAuthorizationArgs Empty = new LightHouseAuthorizationArgs();

    @InputImport(name="principalId", required=true)
    private final Input<String> principalId;

    public Input<String> getPrincipalId() {
        return this.principalId;
    }

    @InputImport(name="roleDefinitionId", required=true)
    private final Input<String> roleDefinitionId;

    public Input<String> getRoleDefinitionId() {
        return this.roleDefinitionId;
    }

    public LightHouseAuthorizationArgs(
        Input<String> principalId,
        Input<String> roleDefinitionId) {
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId, "expected parameter 'roleDefinitionId' to be non-null");
    }

    private LightHouseAuthorizationArgs() {
        this.principalId = Input.empty();
        this.roleDefinitionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LightHouseAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> principalId;
        private Input<String> roleDefinitionId;

        public Builder() {
    	      // Empty
        }

        public Builder(LightHouseAuthorizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
        }

        public Builder setPrincipalId(Input<String> principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Input.of(Objects.requireNonNull(principalId));
            return this;
        }

        public Builder setRoleDefinitionId(Input<String> roleDefinitionId) {
            this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
            return this;
        }

        public Builder setRoleDefinitionId(String roleDefinitionId) {
            this.roleDefinitionId = Input.of(Objects.requireNonNull(roleDefinitionId));
            return this;
        }

        public LightHouseAuthorizationArgs build() {
            return new LightHouseAuthorizationArgs(principalId, roleDefinitionId);
        }
    }
}
