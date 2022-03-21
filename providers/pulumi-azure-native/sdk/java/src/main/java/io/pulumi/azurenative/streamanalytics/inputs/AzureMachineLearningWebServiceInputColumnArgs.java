// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes an input column for the Azure Machine Learning web service endpoint.
 * 
 */
public final class AzureMachineLearningWebServiceInputColumnArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureMachineLearningWebServiceInputColumnArgs Empty = new AzureMachineLearningWebServiceInputColumnArgs();

    /**
     * The (Azure Machine Learning supported) data type of the input column. A list of valid  Azure Machine Learning data types are described at https://msdn.microsoft.com/en-us/library/azure/dn905923.aspx .
     * 
     */
    @Import(name="dataType")
      private final @Nullable Output<String> dataType;

    public Output<String> getDataType() {
        return this.dataType == null ? Output.empty() : this.dataType;
    }

    /**
     * The zero based index of the function parameter this input maps to.
     * 
     */
    @Import(name="mapTo")
      private final @Nullable Output<Integer> mapTo;

    public Output<Integer> getMapTo() {
        return this.mapTo == null ? Output.empty() : this.mapTo;
    }

    /**
     * The name of the input column.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public AzureMachineLearningWebServiceInputColumnArgs(
        @Nullable Output<String> dataType,
        @Nullable Output<Integer> mapTo,
        @Nullable Output<String> name) {
        this.dataType = dataType;
        this.mapTo = mapTo;
        this.name = name;
    }

    private AzureMachineLearningWebServiceInputColumnArgs() {
        this.dataType = Output.empty();
        this.mapTo = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMachineLearningWebServiceInputColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dataType;
        private @Nullable Output<Integer> mapTo;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMachineLearningWebServiceInputColumnArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
    	      this.mapTo = defaults.mapTo;
    	      this.name = defaults.name;
        }

        public Builder dataType(@Nullable Output<String> dataType) {
            this.dataType = dataType;
            return this;
        }
        public Builder dataType(@Nullable String dataType) {
            this.dataType = Output.ofNullable(dataType);
            return this;
        }
        public Builder mapTo(@Nullable Output<Integer> mapTo) {
            this.mapTo = mapTo;
            return this;
        }
        public Builder mapTo(@Nullable Integer mapTo) {
            this.mapTo = Output.ofNullable(mapTo);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public AzureMachineLearningWebServiceInputColumnArgs build() {
            return new AzureMachineLearningWebServiceInputColumnArgs(dataType, mapTo, name);
        }
    }
}
