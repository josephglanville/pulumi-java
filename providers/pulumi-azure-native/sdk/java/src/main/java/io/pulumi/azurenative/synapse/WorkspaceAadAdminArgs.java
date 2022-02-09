// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkspaceAadAdminArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceAadAdminArgs Empty = new WorkspaceAadAdminArgs();

    @InputImport(name="administratorType")
    private final @Nullable Input<String> administratorType;

    public Input<String> getAdministratorType() {
        return this.administratorType == null ? Input.empty() : this.administratorType;
    }

    @InputImport(name="login")
    private final @Nullable Input<String> login;

    public Input<String> getLogin() {
        return this.login == null ? Input.empty() : this.login;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="sid")
    private final @Nullable Input<String> sid;

    public Input<String> getSid() {
        return this.sid == null ? Input.empty() : this.sid;
    }

    @InputImport(name="tenantId")
    private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    @InputImport(name="workspaceName", required=true)
    private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public WorkspaceAadAdminArgs(
        @Nullable Input<String> administratorType,
        @Nullable Input<String> login,
        Input<String> resourceGroupName,
        @Nullable Input<String> sid,
        @Nullable Input<String> tenantId,
        Input<String> workspaceName) {
        this.administratorType = administratorType;
        this.login = login;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sid = sid;
        this.tenantId = tenantId;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private WorkspaceAadAdminArgs() {
        this.administratorType = Input.empty();
        this.login = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sid = Input.empty();
        this.tenantId = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceAadAdminArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> administratorType;
        private @Nullable Input<String> login;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> sid;
        private @Nullable Input<String> tenantId;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceAadAdminArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorType = defaults.administratorType;
    	      this.login = defaults.login;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sid = defaults.sid;
    	      this.tenantId = defaults.tenantId;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setAdministratorType(@Nullable Input<String> administratorType) {
            this.administratorType = administratorType;
            return this;
        }

        public Builder setAdministratorType(@Nullable String administratorType) {
            this.administratorType = Input.ofNullable(administratorType);
            return this;
        }

        public Builder setLogin(@Nullable Input<String> login) {
            this.login = login;
            return this;
        }

        public Builder setLogin(@Nullable String login) {
            this.login = Input.ofNullable(login);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSid(@Nullable Input<String> sid) {
            this.sid = sid;
            return this;
        }

        public Builder setSid(@Nullable String sid) {
            this.sid = Input.ofNullable(sid);
            return this;
        }

        public Builder setTenantId(@Nullable Input<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = Input.ofNullable(tenantId);
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }

        public WorkspaceAadAdminArgs build() {
            return new WorkspaceAadAdminArgs(administratorType, login, resourceGroupName, sid, tenantId, workspaceName);
        }
    }
}
