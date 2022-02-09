// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRoleDefinitionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRoleDefinitionArgs Empty = new GetRoleDefinitionArgs();

    @InputImport(name="roleDefinitionId", required=true)
    private final String roleDefinitionId;

    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
    }

    @InputImport(name="scope", required=true)
    private final String scope;

    public String getScope() {
        return this.scope;
    }

    public GetRoleDefinitionArgs(
        String roleDefinitionId,
        String scope) {
        this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId, "expected parameter 'roleDefinitionId' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private GetRoleDefinitionArgs() {
        this.roleDefinitionId = null;
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String roleDefinitionId;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRoleDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleDefinitionId = defaults.roleDefinitionId;
    	      this.scope = defaults.scope;
        }

        public Builder setRoleDefinitionId(String roleDefinitionId) {
            this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public GetRoleDefinitionArgs build() {
            return new GetRoleDefinitionArgs(roleDefinitionId, scope);
        }
    }
}
