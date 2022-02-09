// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ResourceGuardOperationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceGuardOperationResponse Empty = new ResourceGuardOperationResponse();

    @InputImport(name="requestResourceType", required=true)
    private final String requestResourceType;

    public String getRequestResourceType() {
        return this.requestResourceType;
    }

    @InputImport(name="vaultCriticalOperation", required=true)
    private final String vaultCriticalOperation;

    public String getVaultCriticalOperation() {
        return this.vaultCriticalOperation;
    }

    public ResourceGuardOperationResponse(
        String requestResourceType,
        String vaultCriticalOperation) {
        this.requestResourceType = Objects.requireNonNull(requestResourceType, "expected parameter 'requestResourceType' to be non-null");
        this.vaultCriticalOperation = Objects.requireNonNull(vaultCriticalOperation, "expected parameter 'vaultCriticalOperation' to be non-null");
    }

    private ResourceGuardOperationResponse() {
        this.requestResourceType = null;
        this.vaultCriticalOperation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceGuardOperationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String requestResourceType;
        private String vaultCriticalOperation;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceGuardOperationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestResourceType = defaults.requestResourceType;
    	      this.vaultCriticalOperation = defaults.vaultCriticalOperation;
        }

        public Builder setRequestResourceType(String requestResourceType) {
            this.requestResourceType = Objects.requireNonNull(requestResourceType);
            return this;
        }

        public Builder setVaultCriticalOperation(String vaultCriticalOperation) {
            this.vaultCriticalOperation = Objects.requireNonNull(vaultCriticalOperation);
            return this;
        }

        public ResourceGuardOperationResponse build() {
            return new ResourceGuardOperationResponse(requestResourceType, vaultCriticalOperation);
        }
    }
}
