// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.azurenative.authorization.outputs.PermissionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRoleDefinitionResult {
    private final @Nullable List<String> assignableScopes;
    private final @Nullable String description;
    private final String id;
    private final String name;
    private final @Nullable List<PermissionResponse> permissions;
    private final @Nullable String roleName;
    private final @Nullable String roleType;
    private final String type;

    @OutputCustomType.Constructor({"assignableScopes","description","id","name","permissions","roleName","roleType","type"})
    private GetRoleDefinitionResult(
        @Nullable List<String> assignableScopes,
        @Nullable String description,
        String id,
        String name,
        @Nullable List<PermissionResponse> permissions,
        @Nullable String roleName,
        @Nullable String roleType,
        String type) {
        this.assignableScopes = assignableScopes;
        this.description = description;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.permissions = permissions;
        this.roleName = roleName;
        this.roleType = roleType;
        this.type = Objects.requireNonNull(type);
    }

    public List<String> getAssignableScopes() {
        return this.assignableScopes == null ? List.of() : this.assignableScopes;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public List<PermissionResponse> getPermissions() {
        return this.permissions == null ? List.of() : this.permissions;
    }
    public Optional<String> getRoleName() {
        return Optional.ofNullable(this.roleName);
    }
    public Optional<String> getRoleType() {
        return Optional.ofNullable(this.roleType);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> assignableScopes;
        private @Nullable String description;
        private String id;
        private String name;
        private @Nullable List<PermissionResponse> permissions;
        private @Nullable String roleName;
        private @Nullable String roleType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRoleDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignableScopes = defaults.assignableScopes;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.permissions = defaults.permissions;
    	      this.roleName = defaults.roleName;
    	      this.roleType = defaults.roleType;
    	      this.type = defaults.type;
        }

        public Builder setAssignableScopes(@Nullable List<String> assignableScopes) {
            this.assignableScopes = assignableScopes;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPermissions(@Nullable List<PermissionResponse> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setRoleName(@Nullable String roleName) {
            this.roleName = roleName;
            return this;
        }

        public Builder setRoleType(@Nullable String roleType) {
            this.roleType = roleType;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetRoleDefinitionResult build() {
            return new GetRoleDefinitionResult(assignableScopes, description, id, name, permissions, roleName, roleType, type);
        }
    }
}
