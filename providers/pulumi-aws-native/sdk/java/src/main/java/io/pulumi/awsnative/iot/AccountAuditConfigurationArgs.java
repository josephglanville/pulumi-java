// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.iot.inputs.AccountAuditConfigurationAuditCheckConfigurationsArgs;
import io.pulumi.awsnative.iot.inputs.AccountAuditConfigurationAuditNotificationTargetConfigurationsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountAuditConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountAuditConfigurationArgs Empty = new AccountAuditConfigurationArgs();

    /**
     * Your 12-digit account ID (used as the primary identifier for the CloudFormation resource).
     * 
     */
    @InputImport(name="accountId", required=true)
      private final Input<String> accountId;

    public Input<String> getAccountId() {
        return this.accountId;
    }

    @InputImport(name="auditCheckConfigurations", required=true)
      private final Input<AccountAuditConfigurationAuditCheckConfigurationsArgs> auditCheckConfigurations;

    public Input<AccountAuditConfigurationAuditCheckConfigurationsArgs> getAuditCheckConfigurations() {
        return this.auditCheckConfigurations;
    }

    @InputImport(name="auditNotificationTargetConfigurations")
      private final @Nullable Input<AccountAuditConfigurationAuditNotificationTargetConfigurationsArgs> auditNotificationTargetConfigurations;

    public Input<AccountAuditConfigurationAuditNotificationTargetConfigurationsArgs> getAuditNotificationTargetConfigurations() {
        return this.auditNotificationTargetConfigurations == null ? Input.empty() : this.auditNotificationTargetConfigurations;
    }

    /**
     * The ARN of the role that grants permission to AWS IoT to access information about your devices, policies, certificates and other items as required when performing an audit.
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    public AccountAuditConfigurationArgs(
        Input<String> accountId,
        Input<AccountAuditConfigurationAuditCheckConfigurationsArgs> auditCheckConfigurations,
        @Nullable Input<AccountAuditConfigurationAuditNotificationTargetConfigurationsArgs> auditNotificationTargetConfigurations,
        Input<String> roleArn) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.auditCheckConfigurations = Objects.requireNonNull(auditCheckConfigurations, "expected parameter 'auditCheckConfigurations' to be non-null");
        this.auditNotificationTargetConfigurations = auditNotificationTargetConfigurations;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private AccountAuditConfigurationArgs() {
        this.accountId = Input.empty();
        this.auditCheckConfigurations = Input.empty();
        this.auditNotificationTargetConfigurations = Input.empty();
        this.roleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountAuditConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountId;
        private Input<AccountAuditConfigurationAuditCheckConfigurationsArgs> auditCheckConfigurations;
        private @Nullable Input<AccountAuditConfigurationAuditNotificationTargetConfigurationsArgs> auditNotificationTargetConfigurations;
        private Input<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountAuditConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.auditCheckConfigurations = defaults.auditCheckConfigurations;
    	      this.auditNotificationTargetConfigurations = defaults.auditNotificationTargetConfigurations;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setAccountId(Input<String> accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public Builder setAccountId(String accountId) {
            this.accountId = Input.of(Objects.requireNonNull(accountId));
            return this;
        }

        public Builder setAuditCheckConfigurations(Input<AccountAuditConfigurationAuditCheckConfigurationsArgs> auditCheckConfigurations) {
            this.auditCheckConfigurations = Objects.requireNonNull(auditCheckConfigurations);
            return this;
        }

        public Builder setAuditCheckConfigurations(AccountAuditConfigurationAuditCheckConfigurationsArgs auditCheckConfigurations) {
            this.auditCheckConfigurations = Input.of(Objects.requireNonNull(auditCheckConfigurations));
            return this;
        }

        public Builder setAuditNotificationTargetConfigurations(@Nullable Input<AccountAuditConfigurationAuditNotificationTargetConfigurationsArgs> auditNotificationTargetConfigurations) {
            this.auditNotificationTargetConfigurations = auditNotificationTargetConfigurations;
            return this;
        }

        public Builder setAuditNotificationTargetConfigurations(@Nullable AccountAuditConfigurationAuditNotificationTargetConfigurationsArgs auditNotificationTargetConfigurations) {
            this.auditNotificationTargetConfigurations = Input.ofNullable(auditNotificationTargetConfigurations);
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public AccountAuditConfigurationArgs build() {
            return new AccountAuditConfigurationArgs(accountId, auditCheckConfigurations, auditNotificationTargetConfigurations, roleArn);
        }
    }
}
