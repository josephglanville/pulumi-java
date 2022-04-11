// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultServiceAccountsState extends io.pulumi.resources.ResourceArgs {

    public static final DefaultServiceAccountsState Empty = new DefaultServiceAccountsState();

    /**
     * The action to be performed in the default service accounts. Valid values are: `DEPRIVILEGE`, `DELETE`, `DISABLE`. Note that `DEPRIVILEGE` action will ignore the REVERT configuration in the restore_policy
     * 
     */
    @Import(name="action")
      private final @Nullable Output<String> action;

    public Output<String> getAction() {
        return this.action == null ? Codegen.empty() : this.action;
    }

    /**
     * The project ID where service accounts are created.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The action to be performed in the default service accounts on the resource destroy.
     * Valid values are NONE, REVERT and REVERT_AND_IGNORE_FAILURE. It is applied for any action but in the DEPRIVILEGE.
     * If set to REVERT it attempts to restore all default SAs but the DEPRIVILEGE action.
     * If set to REVERT_AND_IGNORE_FAILURE it is the same behavior as REVERT but ignores errors returned by the API.
     * 
     */
    @Import(name="restorePolicy")
      private final @Nullable Output<String> restorePolicy;

    public Output<String> getRestorePolicy() {
        return this.restorePolicy == null ? Codegen.empty() : this.restorePolicy;
    }

    /**
     * The Service Accounts changed by this resource. It is used for `REVERT` the `action` on the destroy.
     * 
     */
    @Import(name="serviceAccounts")
      private final @Nullable Output<Map<String,Object>> serviceAccounts;

    public Output<Map<String,Object>> getServiceAccounts() {
        return this.serviceAccounts == null ? Codegen.empty() : this.serviceAccounts;
    }

    public DefaultServiceAccountsState(
        @Nullable Output<String> action,
        @Nullable Output<String> project,
        @Nullable Output<String> restorePolicy,
        @Nullable Output<Map<String,Object>> serviceAccounts) {
        this.action = action;
        this.project = project;
        this.restorePolicy = restorePolicy;
        this.serviceAccounts = serviceAccounts;
    }

    private DefaultServiceAccountsState() {
        this.action = Codegen.empty();
        this.project = Codegen.empty();
        this.restorePolicy = Codegen.empty();
        this.serviceAccounts = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultServiceAccountsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> action;
        private @Nullable Output<String> project;
        private @Nullable Output<String> restorePolicy;
        private @Nullable Output<Map<String,Object>> serviceAccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultServiceAccountsState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.project = defaults.project;
    	      this.restorePolicy = defaults.restorePolicy;
    	      this.serviceAccounts = defaults.serviceAccounts;
        }

        public Builder action(@Nullable Output<String> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable String action) {
            this.action = Codegen.ofNullable(action);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder restorePolicy(@Nullable Output<String> restorePolicy) {
            this.restorePolicy = restorePolicy;
            return this;
        }
        public Builder restorePolicy(@Nullable String restorePolicy) {
            this.restorePolicy = Codegen.ofNullable(restorePolicy);
            return this;
        }
        public Builder serviceAccounts(@Nullable Output<Map<String,Object>> serviceAccounts) {
            this.serviceAccounts = serviceAccounts;
            return this;
        }
        public Builder serviceAccounts(@Nullable Map<String,Object> serviceAccounts) {
            this.serviceAccounts = Codegen.ofNullable(serviceAccounts);
            return this;
        }        public DefaultServiceAccountsState build() {
            return new DefaultServiceAccountsState(action, project, restorePolicy, serviceAccounts);
        }
    }
}
