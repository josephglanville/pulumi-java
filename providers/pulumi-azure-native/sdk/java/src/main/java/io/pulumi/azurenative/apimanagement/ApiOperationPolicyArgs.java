// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.apimanagement.enums.PolicyContentFormat;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiOperationPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiOperationPolicyArgs Empty = new ApiOperationPolicyArgs();

    /**
     * API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * 
     */
    @Import(name="apiId", required=true)
      private final Output<String> apiId;

    public Output<String> getApiId() {
        return this.apiId;
    }

    /**
     * Format of the policyContent.
     * 
     */
    @Import(name="format")
      private final @Nullable Output<Either<String,PolicyContentFormat>> format;

    public Output<Either<String,PolicyContentFormat>> getFormat() {
        return this.format == null ? Output.empty() : this.format;
    }

    /**
     * Operation identifier within an API. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="operationId", required=true)
      private final Output<String> operationId;

    public Output<String> getOperationId() {
        return this.operationId;
    }

    /**
     * The identifier of the Policy.
     * 
     */
    @Import(name="policyId")
      private final @Nullable Output<String> policyId;

    public Output<String> getPolicyId() {
        return this.policyId == null ? Output.empty() : this.policyId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * Contents of the Policy as defined by the format.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public ApiOperationPolicyArgs(
        Output<String> apiId,
        @Nullable Output<Either<String,PolicyContentFormat>> format,
        Output<String> operationId,
        @Nullable Output<String> policyId,
        Output<String> resourceGroupName,
        Output<String> serviceName,
        Output<String> value) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.format = format == null ? Output.ofLeft("xml") : format;
        this.operationId = Objects.requireNonNull(operationId, "expected parameter 'operationId' to be non-null");
        this.policyId = policyId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ApiOperationPolicyArgs() {
        this.apiId = Output.empty();
        this.format = Output.empty();
        this.operationId = Output.empty();
        this.policyId = Output.empty();
        this.resourceGroupName = Output.empty();
        this.serviceName = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiOperationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> apiId;
        private @Nullable Output<Either<String,PolicyContentFormat>> format;
        private Output<String> operationId;
        private @Nullable Output<String> policyId;
        private Output<String> resourceGroupName;
        private Output<String> serviceName;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiOperationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.format = defaults.format;
    	      this.operationId = defaults.operationId;
    	      this.policyId = defaults.policyId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.value = defaults.value;
        }

        public Builder apiId(Output<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }
        public Builder apiId(String apiId) {
            this.apiId = Output.of(Objects.requireNonNull(apiId));
            return this;
        }
        public Builder format(@Nullable Output<Either<String,PolicyContentFormat>> format) {
            this.format = format;
            return this;
        }
        public Builder format(@Nullable Either<String,PolicyContentFormat> format) {
            this.format = Output.ofNullable(format);
            return this;
        }
        public Builder operationId(Output<String> operationId) {
            this.operationId = Objects.requireNonNull(operationId);
            return this;
        }
        public Builder operationId(String operationId) {
            this.operationId = Output.of(Objects.requireNonNull(operationId));
            return this;
        }
        public Builder policyId(@Nullable Output<String> policyId) {
            this.policyId = policyId;
            return this;
        }
        public Builder policyId(@Nullable String policyId) {
            this.policyId = Output.ofNullable(policyId);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public ApiOperationPolicyArgs build() {
            return new ApiOperationPolicyArgs(apiId, format, operationId, policyId, resourceGroupName, serviceName, value);
        }
    }
}
