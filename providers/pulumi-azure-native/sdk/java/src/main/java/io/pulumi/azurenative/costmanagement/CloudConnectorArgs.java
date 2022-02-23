// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement;

import io.pulumi.azurenative.costmanagement.enums.ConnectorBillingModel;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CloudConnectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudConnectorArgs Empty = new CloudConnectorArgs();

    /**
     * Connector billing model
     * 
     */
    @InputImport(name="billingModel")
      private final @Nullable Input<Either<String,ConnectorBillingModel>> billingModel;

    public Input<Either<String,ConnectorBillingModel>> getBillingModel() {
        return this.billingModel == null ? Input.empty() : this.billingModel;
    }

    /**
     * Connector Name.
     * 
     */
    @InputImport(name="connectorName")
      private final @Nullable Input<String> connectorName;

    public Input<String> getConnectorName() {
        return this.connectorName == null ? Input.empty() : this.connectorName;
    }

    /**
     * Credentials authentication key (eg AWS ARN)
     * 
     */
    @InputImport(name="credentialsKey")
      private final @Nullable Input<String> credentialsKey;

    public Input<String> getCredentialsKey() {
        return this.credentialsKey == null ? Input.empty() : this.credentialsKey;
    }

    /**
     * Credentials secret (eg AWS ExternalId)
     * 
     */
    @InputImport(name="credentialsSecret")
      private final @Nullable Input<String> credentialsSecret;

    public Input<String> getCredentialsSecret() {
        return this.credentialsSecret == null ? Input.empty() : this.credentialsSecret;
    }

    /**
     * Default ManagementGroupId
     * 
     */
    @InputImport(name="defaultManagementGroupId")
      private final @Nullable Input<String> defaultManagementGroupId;

    public Input<String> getDefaultManagementGroupId() {
        return this.defaultManagementGroupId == null ? Input.empty() : this.defaultManagementGroupId;
    }

    /**
     * Connector DisplayName
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Connector kind (eg aws)
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Identifying source report. (For AWS this is a CUR report name, defined with Daily and with Resources)
     * 
     */
    @InputImport(name="reportId")
      private final @Nullable Input<String> reportId;

    public Input<String> getReportId() {
        return this.reportId == null ? Input.empty() : this.reportId;
    }

    /**
     * Billing SubscriptionId
     * 
     */
    @InputImport(name="subscriptionId")
      private final @Nullable Input<String> subscriptionId;

    public Input<String> getSubscriptionId() {
        return this.subscriptionId == null ? Input.empty() : this.subscriptionId;
    }

    public CloudConnectorArgs(
        @Nullable Input<Either<String,ConnectorBillingModel>> billingModel,
        @Nullable Input<String> connectorName,
        @Nullable Input<String> credentialsKey,
        @Nullable Input<String> credentialsSecret,
        @Nullable Input<String> defaultManagementGroupId,
        @Nullable Input<String> displayName,
        @Nullable Input<String> kind,
        @Nullable Input<String> reportId,
        @Nullable Input<String> subscriptionId) {
        this.billingModel = billingModel;
        this.connectorName = connectorName;
        this.credentialsKey = credentialsKey;
        this.credentialsSecret = credentialsSecret;
        this.defaultManagementGroupId = defaultManagementGroupId;
        this.displayName = displayName;
        this.kind = kind;
        this.reportId = reportId;
        this.subscriptionId = subscriptionId;
    }

    private CloudConnectorArgs() {
        this.billingModel = Input.empty();
        this.connectorName = Input.empty();
        this.credentialsKey = Input.empty();
        this.credentialsSecret = Input.empty();
        this.defaultManagementGroupId = Input.empty();
        this.displayName = Input.empty();
        this.kind = Input.empty();
        this.reportId = Input.empty();
        this.subscriptionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ConnectorBillingModel>> billingModel;
        private @Nullable Input<String> connectorName;
        private @Nullable Input<String> credentialsKey;
        private @Nullable Input<String> credentialsSecret;
        private @Nullable Input<String> defaultManagementGroupId;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> reportId;
        private @Nullable Input<String> subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingModel = defaults.billingModel;
    	      this.connectorName = defaults.connectorName;
    	      this.credentialsKey = defaults.credentialsKey;
    	      this.credentialsSecret = defaults.credentialsSecret;
    	      this.defaultManagementGroupId = defaults.defaultManagementGroupId;
    	      this.displayName = defaults.displayName;
    	      this.kind = defaults.kind;
    	      this.reportId = defaults.reportId;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder setBillingModel(@Nullable Input<Either<String,ConnectorBillingModel>> billingModel) {
            this.billingModel = billingModel;
            return this;
        }

        public Builder setBillingModel(@Nullable Either<String,ConnectorBillingModel> billingModel) {
            this.billingModel = Input.ofNullable(billingModel);
            return this;
        }

        public Builder setConnectorName(@Nullable Input<String> connectorName) {
            this.connectorName = connectorName;
            return this;
        }

        public Builder setConnectorName(@Nullable String connectorName) {
            this.connectorName = Input.ofNullable(connectorName);
            return this;
        }

        public Builder setCredentialsKey(@Nullable Input<String> credentialsKey) {
            this.credentialsKey = credentialsKey;
            return this;
        }

        public Builder setCredentialsKey(@Nullable String credentialsKey) {
            this.credentialsKey = Input.ofNullable(credentialsKey);
            return this;
        }

        public Builder setCredentialsSecret(@Nullable Input<String> credentialsSecret) {
            this.credentialsSecret = credentialsSecret;
            return this;
        }

        public Builder setCredentialsSecret(@Nullable String credentialsSecret) {
            this.credentialsSecret = Input.ofNullable(credentialsSecret);
            return this;
        }

        public Builder setDefaultManagementGroupId(@Nullable Input<String> defaultManagementGroupId) {
            this.defaultManagementGroupId = defaultManagementGroupId;
            return this;
        }

        public Builder setDefaultManagementGroupId(@Nullable String defaultManagementGroupId) {
            this.defaultManagementGroupId = Input.ofNullable(defaultManagementGroupId);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setReportId(@Nullable Input<String> reportId) {
            this.reportId = reportId;
            return this;
        }

        public Builder setReportId(@Nullable String reportId) {
            this.reportId = Input.ofNullable(reportId);
            return this;
        }

        public Builder setSubscriptionId(@Nullable Input<String> subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder setSubscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = Input.ofNullable(subscriptionId);
            return this;
        }
        public CloudConnectorArgs build() {
            return new CloudConnectorArgs(billingModel, connectorName, credentialsKey, credentialsSecret, defaultManagementGroupId, displayName, kind, reportId, subscriptionId);
        }
    }
}
