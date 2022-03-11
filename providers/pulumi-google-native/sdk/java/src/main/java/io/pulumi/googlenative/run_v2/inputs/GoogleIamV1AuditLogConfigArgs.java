// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.run_v2.enums.GoogleIamV1AuditLogConfigLogType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Provides the configuration for logging a type of permissions. Example: { "audit_log_configs": [ { "log_type": "DATA_READ", "exempted_members": [ "user:jose@example.com" ] }, { "log_type": "DATA_WRITE" } ] } This enables 'DATA_READ' and 'DATA_WRITE' logging, while exempting jose@example.com from DATA_READ logging.
 * 
 */
public final class GoogleIamV1AuditLogConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleIamV1AuditLogConfigArgs Empty = new GoogleIamV1AuditLogConfigArgs();

    /**
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * 
     */
    @InputImport(name="exemptedMembers")
      private final @Nullable Output<List<String>> exemptedMembers;

    public Output<List<String>> getExemptedMembers() {
        return this.exemptedMembers == null ? Output.empty() : this.exemptedMembers;
    }

    /**
     * The log type that this config enables.
     * 
     */
    @InputImport(name="logType")
      private final @Nullable Output<GoogleIamV1AuditLogConfigLogType> logType;

    public Output<GoogleIamV1AuditLogConfigLogType> getLogType() {
        return this.logType == null ? Output.empty() : this.logType;
    }

    public GoogleIamV1AuditLogConfigArgs(
        @Nullable Output<List<String>> exemptedMembers,
        @Nullable Output<GoogleIamV1AuditLogConfigLogType> logType) {
        this.exemptedMembers = exemptedMembers;
        this.logType = logType;
    }

    private GoogleIamV1AuditLogConfigArgs() {
        this.exemptedMembers = Output.empty();
        this.logType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleIamV1AuditLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> exemptedMembers;
        private @Nullable Output<GoogleIamV1AuditLogConfigLogType> logType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleIamV1AuditLogConfigArgs defaults) {
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

        public Builder logType(@Nullable Output<GoogleIamV1AuditLogConfigLogType> logType) {
            this.logType = logType;
            return this;
        }

        public Builder logType(@Nullable GoogleIamV1AuditLogConfigLogType logType) {
            this.logType = Output.ofNullable(logType);
            return this;
        }
        public GoogleIamV1AuditLogConfigArgs build() {
            return new GoogleIamV1AuditLogConfigArgs(exemptedMembers, logType);
        }
    }
}
