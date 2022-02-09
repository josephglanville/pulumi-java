// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSqlResourceSqlRoleAssignmentResult {
    private final String id;
    private final String name;
    private final @Nullable String principalId;
    private final @Nullable String roleDefinitionId;
    private final @Nullable String scope;
    private final String type;

    @OutputCustomType.Constructor({"id","name","principalId","roleDefinitionId","scope","type"})
    private GetSqlResourceSqlRoleAssignmentResult(
        String id,
        String name,
        @Nullable String principalId,
        @Nullable String roleDefinitionId,
        @Nullable String scope,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.principalId = principalId;
        this.roleDefinitionId = roleDefinitionId;
        this.scope = scope;
        this.type = Objects.requireNonNull(type);
    }

    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getPrincipalId() {
        return Optional.ofNullable(this.principalId);
    }
    public Optional<String> getRoleDefinitionId() {
        return Optional.ofNullable(this.roleDefinitionId);
    }
    public Optional<String> getScope() {
        return Optional.ofNullable(this.scope);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSqlResourceSqlRoleAssignmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable String principalId;
        private @Nullable String roleDefinitionId;
        private @Nullable String scope;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSqlResourceSqlRoleAssignmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.principalId = defaults.principalId;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
    	      this.scope = defaults.scope;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrincipalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }

        public Builder setRoleDefinitionId(@Nullable String roleDefinitionId) {
            this.roleDefinitionId = roleDefinitionId;
            return this;
        }

        public Builder setScope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetSqlResourceSqlRoleAssignmentResult build() {
            return new GetSqlResourceSqlRoleAssignmentResult(id, name, principalId, roleDefinitionId, scope, type);
        }
    }
}
