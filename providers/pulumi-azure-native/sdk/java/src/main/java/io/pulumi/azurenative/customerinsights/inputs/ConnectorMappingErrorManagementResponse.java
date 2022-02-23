// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The error management.
 * 
 */
public final class ConnectorMappingErrorManagementResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectorMappingErrorManagementResponse Empty = new ConnectorMappingErrorManagementResponse();

    /**
     * The error limit allowed while importing data.
     * 
     */
    @InputImport(name="errorLimit")
      private final @Nullable Integer errorLimit;

    public Optional<Integer> getErrorLimit() {
        return this.errorLimit == null ? Optional.empty() : Optional.ofNullable(this.errorLimit);
    }

    /**
     * The type of error management to use for the mapping.
     * 
     */
    @InputImport(name="errorManagementType", required=true)
      private final String errorManagementType;

    public String getErrorManagementType() {
        return this.errorManagementType;
    }

    public ConnectorMappingErrorManagementResponse(
        @Nullable Integer errorLimit,
        String errorManagementType) {
        this.errorLimit = errorLimit;
        this.errorManagementType = Objects.requireNonNull(errorManagementType, "expected parameter 'errorManagementType' to be non-null");
    }

    private ConnectorMappingErrorManagementResponse() {
        this.errorLimit = null;
        this.errorManagementType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorMappingErrorManagementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer errorLimit;
        private String errorManagementType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorMappingErrorManagementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorLimit = defaults.errorLimit;
    	      this.errorManagementType = defaults.errorManagementType;
        }

        public Builder setErrorLimit(@Nullable Integer errorLimit) {
            this.errorLimit = errorLimit;
            return this;
        }

        public Builder setErrorManagementType(String errorManagementType) {
            this.errorManagementType = Objects.requireNonNull(errorManagementType);
            return this;
        }
        public ConnectorMappingErrorManagementResponse build() {
            return new ConnectorMappingErrorManagementResponse(errorLimit, errorManagementType);
        }
    }
}
