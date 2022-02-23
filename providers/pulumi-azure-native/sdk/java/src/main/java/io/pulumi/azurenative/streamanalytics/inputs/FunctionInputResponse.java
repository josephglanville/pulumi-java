// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes one input parameter of a function.
 * 
 */
public final class FunctionInputResponse extends io.pulumi.resources.InvokeArgs {

    public static final FunctionInputResponse Empty = new FunctionInputResponse();

    /**
     * The (Azure Stream Analytics supported) data type of the function input parameter. A list of valid Azure Stream Analytics data types are described at https://msdn.microsoft.com/en-us/library/azure/dn835065.aspx
     * 
     */
    @InputImport(name="dataType")
      private final @Nullable String dataType;

    public Optional<String> getDataType() {
        return this.dataType == null ? Optional.empty() : Optional.ofNullable(this.dataType);
    }

    /**
     * A flag indicating if the parameter is a configuration parameter. True if this input parameter is expected to be a constant. Default is false.
     * 
     */
    @InputImport(name="isConfigurationParameter")
      private final @Nullable Boolean isConfigurationParameter;

    public Optional<Boolean> getIsConfigurationParameter() {
        return this.isConfigurationParameter == null ? Optional.empty() : Optional.ofNullable(this.isConfigurationParameter);
    }

    public FunctionInputResponse(
        @Nullable String dataType,
        @Nullable Boolean isConfigurationParameter) {
        this.dataType = dataType;
        this.isConfigurationParameter = isConfigurationParameter;
    }

    private FunctionInputResponse() {
        this.dataType = null;
        this.isConfigurationParameter = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataType;
        private @Nullable Boolean isConfigurationParameter;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
    	      this.isConfigurationParameter = defaults.isConfigurationParameter;
        }

        public Builder setDataType(@Nullable String dataType) {
            this.dataType = dataType;
            return this;
        }

        public Builder setIsConfigurationParameter(@Nullable Boolean isConfigurationParameter) {
            this.isConfigurationParameter = isConfigurationParameter;
            return this;
        }
        public FunctionInputResponse build() {
            return new FunctionInputResponse(dataType, isConfigurationParameter);
        }
    }
}
