// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes an output column for the Azure Machine Learning web service endpoint.
 * 
 */
public final class AzureMachineLearningWebServiceOutputColumnArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureMachineLearningWebServiceOutputColumnArgs Empty = new AzureMachineLearningWebServiceOutputColumnArgs();

    /**
     * The (Azure Machine Learning supported) data type of the output column. A list of valid  Azure Machine Learning data types are described at https://msdn.microsoft.com/en-us/library/azure/dn905923.aspx .
     * 
     */
    @InputImport(name="dataType")
      private final @Nullable Output<String> dataType;

    public Output<String> getDataType() {
        return this.dataType == null ? Output.empty() : this.dataType;
    }

    /**
     * The name of the output column.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public AzureMachineLearningWebServiceOutputColumnArgs(
        @Nullable Output<String> dataType,
        @Nullable Output<String> name) {
        this.dataType = dataType;
        this.name = name;
    }

    private AzureMachineLearningWebServiceOutputColumnArgs() {
        this.dataType = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMachineLearningWebServiceOutputColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dataType;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMachineLearningWebServiceOutputColumnArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
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

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public AzureMachineLearningWebServiceOutputColumnArgs build() {
            return new AzureMachineLearningWebServiceOutputColumnArgs(dataType, name);
        }
    }
}
