// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.enums.DataTypeState;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Common field for data type in data connectors.
 * 
 */
public final class DataConnectorDataTypeCommonArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataConnectorDataTypeCommonArgs Empty = new DataConnectorDataTypeCommonArgs();

    /**
     * Describe whether this data type connection is enabled or not.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<Either<String,DataTypeState>> state;

    public Input<Either<String,DataTypeState>> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public DataConnectorDataTypeCommonArgs(@Nullable Input<Either<String,DataTypeState>> state) {
        this.state = state;
    }

    private DataConnectorDataTypeCommonArgs() {
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataConnectorDataTypeCommonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,DataTypeState>> state;

        public Builder() {
    	      // Empty
        }

        public Builder(DataConnectorDataTypeCommonArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.state = defaults.state;
        }

        public Builder setState(@Nullable Input<Either<String,DataTypeState>> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable Either<String,DataTypeState> state) {
            this.state = Input.ofNullable(state);
            return this;
        }
        public DataConnectorDataTypeCommonArgs build() {
            return new DataConnectorDataTypeCommonArgs(state);
        }
    }
}
