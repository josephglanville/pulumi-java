// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.organizations.inputs.GetIAMPolicyAuditConfig;
import io.pulumi.gcp.organizations.inputs.GetIAMPolicyBinding;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIAMPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIAMPolicyArgs Empty = new GetIAMPolicyArgs();

    /**
     * A nested configuration block that defines logging additional configuration for your project. This field is only supported on `gcp.projects.IAMPolicy`, `gcp.folder.IAMPolicy` and `gcp.organizations.IAMPolicy`.
     * 
     */
    @InputImport(name="auditConfigs")
      private final @Nullable List<GetIAMPolicyAuditConfig> auditConfigs;

    public List<GetIAMPolicyAuditConfig> getAuditConfigs() {
        return this.auditConfigs == null ? List.of() : this.auditConfigs;
    }

    /**
     * A nested configuration block (described below)
     * defining a binding to be included in the policy document. Multiple
     * `binding` arguments are supported.
     * 
     */
    @InputImport(name="bindings")
      private final @Nullable List<GetIAMPolicyBinding> bindings;

    public List<GetIAMPolicyBinding> getBindings() {
        return this.bindings == null ? List.of() : this.bindings;
    }

    public GetIAMPolicyArgs(
        @Nullable List<GetIAMPolicyAuditConfig> auditConfigs,
        @Nullable List<GetIAMPolicyBinding> bindings) {
        this.auditConfigs = auditConfigs;
        this.bindings = bindings;
    }

    private GetIAMPolicyArgs() {
        this.auditConfigs = List.of();
        this.bindings = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIAMPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetIAMPolicyAuditConfig> auditConfigs;
        private @Nullable List<GetIAMPolicyBinding> bindings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIAMPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditConfigs = defaults.auditConfigs;
    	      this.bindings = defaults.bindings;
        }

        public Builder setAuditConfigs(@Nullable List<GetIAMPolicyAuditConfig> auditConfigs) {
            this.auditConfigs = auditConfigs;
            return this;
        }

        public Builder setBindings(@Nullable List<GetIAMPolicyBinding> bindings) {
            this.bindings = bindings;
            return this;
        }
        public GetIAMPolicyArgs build() {
            return new GetIAMPolicyArgs(auditConfigs, bindings);
        }
    }
}
