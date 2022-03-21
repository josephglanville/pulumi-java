// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WindowsFileSystemAuditLogConfiguration {
    /**
     * The Amazon Resource Name (ARN) for the destination of the audit logs. The destination can be any Amazon CloudWatch Logs log group ARN or Amazon Kinesis Data Firehose delivery stream ARN. Can be specified when `file_access_audit_log_level` and `file_share_access_audit_log_level` are not set to `DISABLED`. The name of the Amazon CloudWatch Logs log group must begin with the `/aws/fsx` prefix. The name of the Amazon Kinesis Data Firehouse delivery stream must begin with the `aws-fsx` prefix. If you do not provide a destination in `audit_log_destionation`, Amazon FSx will create and use a log stream in the CloudWatch Logs /aws/fsx/windows log group.
     * 
     */
    private final @Nullable String auditLogDestination;
    /**
     * Sets which attempt type is logged by Amazon FSx for file and folder accesses. Valid values are `SUCCESS_ONLY`, `FAILURE_ONLY`, `SUCCESS_AND_FAILURE`, and `DISABLED`. Default value is `DISABLED`.
     * 
     */
    private final @Nullable String fileAccessAuditLogLevel;
    /**
     * Sets which attempt type is logged by Amazon FSx for file share accesses. Valid values are `SUCCESS_ONLY`, `FAILURE_ONLY`, `SUCCESS_AND_FAILURE`, and `DISABLED`. Default value is `DISABLED`.
     * 
     */
    private final @Nullable String fileShareAccessAuditLogLevel;

    @CustomType.Constructor
    private WindowsFileSystemAuditLogConfiguration(
        @CustomType.Parameter("auditLogDestination") @Nullable String auditLogDestination,
        @CustomType.Parameter("fileAccessAuditLogLevel") @Nullable String fileAccessAuditLogLevel,
        @CustomType.Parameter("fileShareAccessAuditLogLevel") @Nullable String fileShareAccessAuditLogLevel) {
        this.auditLogDestination = auditLogDestination;
        this.fileAccessAuditLogLevel = fileAccessAuditLogLevel;
        this.fileShareAccessAuditLogLevel = fileShareAccessAuditLogLevel;
    }

    /**
     * The Amazon Resource Name (ARN) for the destination of the audit logs. The destination can be any Amazon CloudWatch Logs log group ARN or Amazon Kinesis Data Firehose delivery stream ARN. Can be specified when `file_access_audit_log_level` and `file_share_access_audit_log_level` are not set to `DISABLED`. The name of the Amazon CloudWatch Logs log group must begin with the `/aws/fsx` prefix. The name of the Amazon Kinesis Data Firehouse delivery stream must begin with the `aws-fsx` prefix. If you do not provide a destination in `audit_log_destionation`, Amazon FSx will create and use a log stream in the CloudWatch Logs /aws/fsx/windows log group.
     * 
    */
    public Optional<String> getAuditLogDestination() {
        return Optional.ofNullable(this.auditLogDestination);
    }
    /**
     * Sets which attempt type is logged by Amazon FSx for file and folder accesses. Valid values are `SUCCESS_ONLY`, `FAILURE_ONLY`, `SUCCESS_AND_FAILURE`, and `DISABLED`. Default value is `DISABLED`.
     * 
    */
    public Optional<String> getFileAccessAuditLogLevel() {
        return Optional.ofNullable(this.fileAccessAuditLogLevel);
    }
    /**
     * Sets which attempt type is logged by Amazon FSx for file share accesses. Valid values are `SUCCESS_ONLY`, `FAILURE_ONLY`, `SUCCESS_AND_FAILURE`, and `DISABLED`. Default value is `DISABLED`.
     * 
    */
    public Optional<String> getFileShareAccessAuditLogLevel() {
        return Optional.ofNullable(this.fileShareAccessAuditLogLevel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsFileSystemAuditLogConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String auditLogDestination;
        private @Nullable String fileAccessAuditLogLevel;
        private @Nullable String fileShareAccessAuditLogLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsFileSystemAuditLogConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogDestination = defaults.auditLogDestination;
    	      this.fileAccessAuditLogLevel = defaults.fileAccessAuditLogLevel;
    	      this.fileShareAccessAuditLogLevel = defaults.fileShareAccessAuditLogLevel;
        }

        public Builder auditLogDestination(@Nullable String auditLogDestination) {
            this.auditLogDestination = auditLogDestination;
            return this;
        }
        public Builder fileAccessAuditLogLevel(@Nullable String fileAccessAuditLogLevel) {
            this.fileAccessAuditLogLevel = fileAccessAuditLogLevel;
            return this;
        }
        public Builder fileShareAccessAuditLogLevel(@Nullable String fileShareAccessAuditLogLevel) {
            this.fileShareAccessAuditLogLevel = fileShareAccessAuditLogLevel;
            return this;
        }        public WindowsFileSystemAuditLogConfiguration build() {
            return new WindowsFileSystemAuditLogConfiguration(auditLogDestination, fileAccessAuditLogLevel, fileShareAccessAuditLogLevel);
        }
    }
}
