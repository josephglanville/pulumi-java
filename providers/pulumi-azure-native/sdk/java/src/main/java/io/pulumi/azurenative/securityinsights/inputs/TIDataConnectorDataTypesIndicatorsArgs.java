// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.enums.DataTypeState;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Data type for indicators connection.
 * 
 */
public final class TIDataConnectorDataTypesIndicatorsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TIDataConnectorDataTypesIndicatorsArgs Empty = new TIDataConnectorDataTypesIndicatorsArgs();

    /**
     * Describe whether this data type connection is enabled or not.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<Either<String,DataTypeState>> state;

    public Output<Either<String,DataTypeState>> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    public TIDataConnectorDataTypesIndicatorsArgs(@Nullable Output<Either<String,DataTypeState>> state) {
        this.state = state;
    }

    private TIDataConnectorDataTypesIndicatorsArgs() {
        this.state = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TIDataConnectorDataTypesIndicatorsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,DataTypeState>> state;

        public Builder() {
    	      // Empty
        }

        public Builder(TIDataConnectorDataTypesIndicatorsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.state = defaults.state;
        }

        public Builder state(@Nullable Output<Either<String,DataTypeState>> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable Either<String,DataTypeState> state) {
            this.state = Output.ofNullable(state);
            return this;
        }        public TIDataConnectorDataTypesIndicatorsArgs build() {
            return new TIDataConnectorDataTypesIndicatorsArgs(state);
        }
    }
}
