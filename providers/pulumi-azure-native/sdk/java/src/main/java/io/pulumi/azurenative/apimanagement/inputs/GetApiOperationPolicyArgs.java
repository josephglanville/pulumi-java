// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApiOperationPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetApiOperationPolicyArgs Empty = new GetApiOperationPolicyArgs();

    /**
     * API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * 
     */
    @InputImport(name="apiId", required=true)
      private final String apiId;

    public String getApiId() {
        return this.apiId;
    }

    /**
     * Policy Export Format.
     * 
     */
    @InputImport(name="format")
      private final @Nullable String format;

    public Optional<String> getFormat() {
        return this.format == null ? Optional.empty() : Optional.ofNullable(this.format);
    }

    /**
     * Operation identifier within an API. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="operationId", required=true)
      private final String operationId;

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * The identifier of the Policy.
     * 
     */
    @InputImport(name="policyId", required=true)
      private final String policyId;

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
      private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetApiOperationPolicyArgs(
        String apiId,
        @Nullable String format,
        String operationId,
        String policyId,
        String resourceGroupName,
        String serviceName) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.format = format;
        this.operationId = Objects.requireNonNull(operationId, "expected parameter 'operationId' to be non-null");
        this.policyId = Objects.requireNonNull(policyId, "expected parameter 'policyId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetApiOperationPolicyArgs() {
        this.apiId = null;
        this.format = null;
        this.operationId = null;
        this.policyId = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiOperationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiId;
        private @Nullable String format;
        private String operationId;
        private String policyId;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiOperationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.format = defaults.format;
    	      this.operationId = defaults.operationId;
    	      this.policyId = defaults.policyId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setApiId(String apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder setFormat(@Nullable String format) {
            this.format = format;
            return this;
        }

        public Builder setOperationId(String operationId) {
            this.operationId = Objects.requireNonNull(operationId);
            return this;
        }

        public Builder setPolicyId(String policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public GetApiOperationPolicyArgs build() {
            return new GetApiOperationPolicyArgs(apiId, format, operationId, policyId, resourceGroupName, serviceName);
        }
    }
}
