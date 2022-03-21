// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Azure Active Directory Application
 * 
 */
public final class AzureActiveDirectoryAppArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureActiveDirectoryAppArgs Empty = new AzureActiveDirectoryAppArgs();

    /**
     * Key used to authenticate to the Azure Active Directory Application
     * 
     */
    @Import(name="appKey", required=true)
      private final Output<String> appKey;

    public Output<String> getAppKey() {
        return this.appKey;
    }

    /**
     * Application ID of the Azure Active Directory Application
     * 
     */
    @Import(name="applicationId", required=true)
      private final Output<String> applicationId;

    public Output<String> getApplicationId() {
        return this.applicationId;
    }

    /**
     * Tenant id of the customer
     * 
     */
    @Import(name="tenantId", required=true)
      private final Output<String> tenantId;

    public Output<String> getTenantId() {
        return this.tenantId;
    }

    public AzureActiveDirectoryAppArgs(
        Output<String> appKey,
        Output<String> applicationId,
        Output<String> tenantId) {
        this.appKey = Objects.requireNonNull(appKey, "expected parameter 'appKey' to be non-null");
        this.applicationId = Objects.requireNonNull(applicationId, "expected parameter 'applicationId' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
    }

    private AzureActiveDirectoryAppArgs() {
        this.appKey = Output.empty();
        this.applicationId = Output.empty();
        this.tenantId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureActiveDirectoryAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> appKey;
        private Output<String> applicationId;
        private Output<String> tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureActiveDirectoryAppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appKey = defaults.appKey;
    	      this.applicationId = defaults.applicationId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder appKey(Output<String> appKey) {
            this.appKey = Objects.requireNonNull(appKey);
            return this;
        }
        public Builder appKey(String appKey) {
            this.appKey = Output.of(Objects.requireNonNull(appKey));
            return this;
        }
        public Builder applicationId(Output<String> applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }
        public Builder applicationId(String applicationId) {
            this.applicationId = Output.of(Objects.requireNonNull(applicationId));
            return this;
        }
        public Builder tenantId(Output<String> tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Output.of(Objects.requireNonNull(tenantId));
            return this;
        }        public AzureActiveDirectoryAppArgs build() {
            return new AzureActiveDirectoryAppArgs(appKey, applicationId, tenantId);
        }
    }
}
