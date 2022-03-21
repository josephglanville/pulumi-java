// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.folder;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.folder.inputs.IamAuditConfigAuditLogConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class IamAuditConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final IamAuditConfigArgs Empty = new IamAuditConfigArgs();

    /**
     * The configuration for logging of each type of permission. This can be specified multiple times.
     * 
     */
    @Import(name="auditLogConfigs", required=true)
      private final Output<List<IamAuditConfigAuditLogConfigArgs>> auditLogConfigs;

    public Output<List<IamAuditConfigAuditLogConfigArgs>> getAuditLogConfigs() {
        return this.auditLogConfigs;
    }

    @Import(name="folder", required=true)
      private final Output<String> folder;

    public Output<String> getFolder() {
        return this.folder;
    }

    /**
     * Service which will be enabled for audit logging. The special value allServices covers all services.
     * 
     */
    @Import(name="service", required=true)
      private final Output<String> service;

    public Output<String> getService() {
        return this.service;
    }

    public IamAuditConfigArgs(
        Output<List<IamAuditConfigAuditLogConfigArgs>> auditLogConfigs,
        Output<String> folder,
        Output<String> service) {
        this.auditLogConfigs = Objects.requireNonNull(auditLogConfigs, "expected parameter 'auditLogConfigs' to be non-null");
        this.folder = Objects.requireNonNull(folder, "expected parameter 'folder' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private IamAuditConfigArgs() {
        this.auditLogConfigs = Output.empty();
        this.folder = Output.empty();
        this.service = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IamAuditConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<IamAuditConfigAuditLogConfigArgs>> auditLogConfigs;
        private Output<String> folder;
        private Output<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(IamAuditConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogConfigs = defaults.auditLogConfigs;
    	      this.folder = defaults.folder;
    	      this.service = defaults.service;
        }

        public Builder auditLogConfigs(Output<List<IamAuditConfigAuditLogConfigArgs>> auditLogConfigs) {
            this.auditLogConfigs = Objects.requireNonNull(auditLogConfigs);
            return this;
        }
        public Builder auditLogConfigs(List<IamAuditConfigAuditLogConfigArgs> auditLogConfigs) {
            this.auditLogConfigs = Output.of(Objects.requireNonNull(auditLogConfigs));
            return this;
        }
        public Builder auditLogConfigs(IamAuditConfigAuditLogConfigArgs... auditLogConfigs) {
            return auditLogConfigs(List.of(auditLogConfigs));
        }
        public Builder folder(Output<String> folder) {
            this.folder = Objects.requireNonNull(folder);
            return this;
        }
        public Builder folder(String folder) {
            this.folder = Output.of(Objects.requireNonNull(folder));
            return this;
        }
        public Builder service(Output<String> service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public Builder service(String service) {
            this.service = Output.of(Objects.requireNonNull(service));
            return this;
        }        public IamAuditConfigArgs build() {
            return new IamAuditConfigArgs(auditLogConfigs, folder, service);
        }
    }
}
