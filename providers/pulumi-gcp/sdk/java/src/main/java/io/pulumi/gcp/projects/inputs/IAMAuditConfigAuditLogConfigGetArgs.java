// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IAMAuditConfigAuditLogConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final IAMAuditConfigAuditLogConfigGetArgs Empty = new IAMAuditConfigAuditLogConfigGetArgs();

    /**
     * Identities that do not cause logging for this type of permission.  The format is the same as that for `members`.
     * 
     */
    @InputImport(name="exemptedMembers")
      private final @Nullable Output<List<String>> exemptedMembers;

    public Output<List<String>> getExemptedMembers() {
        return this.exemptedMembers == null ? Output.empty() : this.exemptedMembers;
    }

    /**
     * Permission type for which logging is to be configured.  Must be one of `DATA_READ`, `DATA_WRITE`, or `ADMIN_READ`.
     * 
     */
    @InputImport(name="logType", required=true)
      private final Output<String> logType;

    public Output<String> getLogType() {
        return this.logType;
    }

    public IAMAuditConfigAuditLogConfigGetArgs(
        @Nullable Output<List<String>> exemptedMembers,
        Output<String> logType) {
        this.exemptedMembers = exemptedMembers;
        this.logType = Objects.requireNonNull(logType, "expected parameter 'logType' to be non-null");
    }

    private IAMAuditConfigAuditLogConfigGetArgs() {
        this.exemptedMembers = Output.empty();
        this.logType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IAMAuditConfigAuditLogConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> exemptedMembers;
        private Output<String> logType;

        public Builder() {
    	      // Empty
        }

        public Builder(IAMAuditConfigAuditLogConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exemptedMembers = defaults.exemptedMembers;
    	      this.logType = defaults.logType;
        }

        public Builder exemptedMembers(@Nullable Output<List<String>> exemptedMembers) {
            this.exemptedMembers = exemptedMembers;
            return this;
        }

        public Builder exemptedMembers(@Nullable List<String> exemptedMembers) {
            this.exemptedMembers = Output.ofNullable(exemptedMembers);
            return this;
        }

        public Builder logType(Output<String> logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }

        public Builder logType(String logType) {
            this.logType = Output.of(Objects.requireNonNull(logType));
            return this;
        }
        public IAMAuditConfigAuditLogConfigGetArgs build() {
            return new IAMAuditConfigAuditLogConfigGetArgs(exemptedMembers, logType);
        }
    }
}
