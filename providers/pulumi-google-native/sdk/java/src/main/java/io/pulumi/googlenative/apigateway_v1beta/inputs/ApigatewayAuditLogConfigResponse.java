// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Provides the configuration for logging a type of permissions. Example: { "audit_log_configs": [ { "log_type": "DATA_READ", "exempted_members": [ "user:jose@example.com" ] }, { "log_type": "DATA_WRITE" } ] } This enables 'DATA_READ' and 'DATA_WRITE' logging, while exempting jose@example.com from DATA_READ logging.
 * 
 */
public final class ApigatewayAuditLogConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApigatewayAuditLogConfigResponse Empty = new ApigatewayAuditLogConfigResponse();

    /**
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * 
     */
    @Import(name="exemptedMembers", required=true)
      private final List<String> exemptedMembers;

    public List<String> getExemptedMembers() {
        return this.exemptedMembers;
    }

    /**
     * The log type that this config enables.
     * 
     */
    @Import(name="logType", required=true)
      private final String logType;

    public String getLogType() {
        return this.logType;
    }

    public ApigatewayAuditLogConfigResponse(
        List<String> exemptedMembers,
        String logType) {
        this.exemptedMembers = Objects.requireNonNull(exemptedMembers, "expected parameter 'exemptedMembers' to be non-null");
        this.logType = Objects.requireNonNull(logType, "expected parameter 'logType' to be non-null");
    }

    private ApigatewayAuditLogConfigResponse() {
        this.exemptedMembers = List.of();
        this.logType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApigatewayAuditLogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> exemptedMembers;
        private String logType;

        public Builder() {
    	      // Empty
        }

        public Builder(ApigatewayAuditLogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exemptedMembers = defaults.exemptedMembers;
    	      this.logType = defaults.logType;
        }

        public Builder exemptedMembers(List<String> exemptedMembers) {
            this.exemptedMembers = Objects.requireNonNull(exemptedMembers);
            return this;
        }
        public Builder exemptedMembers(String... exemptedMembers) {
            return exemptedMembers(List.of(exemptedMembers));
        }
        public Builder logType(String logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }        public ApigatewayAuditLogConfigResponse build() {
            return new ApigatewayAuditLogConfigResponse(exemptedMembers, logType);
        }
    }
}
