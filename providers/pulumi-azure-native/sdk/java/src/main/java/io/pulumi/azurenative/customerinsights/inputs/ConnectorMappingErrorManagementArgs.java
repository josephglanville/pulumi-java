// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.azurenative.customerinsights.enums.ErrorManagementTypes;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The error management.
 * 
 */
public final class ConnectorMappingErrorManagementArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorMappingErrorManagementArgs Empty = new ConnectorMappingErrorManagementArgs();

    /**
     * The error limit allowed while importing data.
     * 
     */
    @InputImport(name="errorLimit")
      private final @Nullable Input<Integer> errorLimit;

    public Input<Integer> getErrorLimit() {
        return this.errorLimit == null ? Input.empty() : this.errorLimit;
    }

    /**
     * The type of error management to use for the mapping.
     * 
     */
    @InputImport(name="errorManagementType", required=true)
      private final Input<ErrorManagementTypes> errorManagementType;

    public Input<ErrorManagementTypes> getErrorManagementType() {
        return this.errorManagementType;
    }

    public ConnectorMappingErrorManagementArgs(
        @Nullable Input<Integer> errorLimit,
        Input<ErrorManagementTypes> errorManagementType) {
        this.errorLimit = errorLimit;
        this.errorManagementType = Objects.requireNonNull(errorManagementType, "expected parameter 'errorManagementType' to be non-null");
    }

    private ConnectorMappingErrorManagementArgs() {
        this.errorLimit = Input.empty();
        this.errorManagementType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorMappingErrorManagementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> errorLimit;
        private Input<ErrorManagementTypes> errorManagementType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorMappingErrorManagementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorLimit = defaults.errorLimit;
    	      this.errorManagementType = defaults.errorManagementType;
        }

        public Builder setErrorLimit(@Nullable Input<Integer> errorLimit) {
            this.errorLimit = errorLimit;
            return this;
        }

        public Builder setErrorLimit(@Nullable Integer errorLimit) {
            this.errorLimit = Input.ofNullable(errorLimit);
            return this;
        }

        public Builder setErrorManagementType(Input<ErrorManagementTypes> errorManagementType) {
            this.errorManagementType = Objects.requireNonNull(errorManagementType);
            return this;
        }

        public Builder setErrorManagementType(ErrorManagementTypes errorManagementType) {
            this.errorManagementType = Input.of(Objects.requireNonNull(errorManagementType));
            return this;
        }
        public ConnectorMappingErrorManagementArgs build() {
            return new ConnectorMappingErrorManagementArgs(errorLimit, errorManagementType);
        }
    }
}
