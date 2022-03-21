// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.machinelearningservices.enums.DatasetType;
import io.pulumi.azurenative.machinelearningservices.inputs.DatasetCreateRequestParametersArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.DatasetCreateRequestRegistrationArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.DatasetCreateRequestTimeSeriesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MachineLearningDatasetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MachineLearningDatasetArgs Empty = new MachineLearningDatasetArgs();

    /**
     * The Dataset name.
     * 
     */
    @Import(name="datasetName")
      private final @Nullable Output<String> datasetName;

    public Output<String> getDatasetName() {
        return this.datasetName == null ? Output.empty() : this.datasetName;
    }

    /**
     * Specifies dataset type.
     * 
     */
    @Import(name="datasetType", required=true)
      private final Output<Either<String,DatasetType>> datasetType;

    public Output<Either<String,DatasetType>> getDatasetType() {
        return this.datasetType;
    }

    @Import(name="parameters", required=true)
      private final Output<DatasetCreateRequestParametersArgs> parameters;

    public Output<DatasetCreateRequestParametersArgs> getParameters() {
        return this.parameters;
    }

    @Import(name="registration", required=true)
      private final Output<DatasetCreateRequestRegistrationArgs> registration;

    public Output<DatasetCreateRequestRegistrationArgs> getRegistration() {
        return this.registration;
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Skip validation that ensures data can be loaded from the dataset before registration.
     * 
     */
    @Import(name="skipValidation")
      private final @Nullable Output<Boolean> skipValidation;

    public Output<Boolean> getSkipValidation() {
        return this.skipValidation == null ? Output.empty() : this.skipValidation;
    }

    @Import(name="timeSeries")
      private final @Nullable Output<DatasetCreateRequestTimeSeriesArgs> timeSeries;

    public Output<DatasetCreateRequestTimeSeriesArgs> getTimeSeries() {
        return this.timeSeries == null ? Output.empty() : this.timeSeries;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public MachineLearningDatasetArgs(
        @Nullable Output<String> datasetName,
        Output<Either<String,DatasetType>> datasetType,
        Output<DatasetCreateRequestParametersArgs> parameters,
        Output<DatasetCreateRequestRegistrationArgs> registration,
        Output<String> resourceGroupName,
        @Nullable Output<Boolean> skipValidation,
        @Nullable Output<DatasetCreateRequestTimeSeriesArgs> timeSeries,
        Output<String> workspaceName) {
        this.datasetName = datasetName;
        this.datasetType = Objects.requireNonNull(datasetType, "expected parameter 'datasetType' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.registration = Objects.requireNonNull(registration, "expected parameter 'registration' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.skipValidation = skipValidation == null ? Output.ofNullable(false) : skipValidation;
        this.timeSeries = timeSeries;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private MachineLearningDatasetArgs() {
        this.datasetName = Output.empty();
        this.datasetType = Output.empty();
        this.parameters = Output.empty();
        this.registration = Output.empty();
        this.resourceGroupName = Output.empty();
        this.skipValidation = Output.empty();
        this.timeSeries = Output.empty();
        this.workspaceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineLearningDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> datasetName;
        private Output<Either<String,DatasetType>> datasetType;
        private Output<DatasetCreateRequestParametersArgs> parameters;
        private Output<DatasetCreateRequestRegistrationArgs> registration;
        private Output<String> resourceGroupName;
        private @Nullable Output<Boolean> skipValidation;
        private @Nullable Output<DatasetCreateRequestTimeSeriesArgs> timeSeries;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineLearningDatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetName = defaults.datasetName;
    	      this.datasetType = defaults.datasetType;
    	      this.parameters = defaults.parameters;
    	      this.registration = defaults.registration;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.skipValidation = defaults.skipValidation;
    	      this.timeSeries = defaults.timeSeries;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder datasetName(@Nullable Output<String> datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public Builder datasetName(@Nullable String datasetName) {
            this.datasetName = Output.ofNullable(datasetName);
            return this;
        }
        public Builder datasetType(Output<Either<String,DatasetType>> datasetType) {
            this.datasetType = Objects.requireNonNull(datasetType);
            return this;
        }
        public Builder datasetType(Either<String,DatasetType> datasetType) {
            this.datasetType = Output.of(Objects.requireNonNull(datasetType));
            return this;
        }
        public Builder parameters(Output<DatasetCreateRequestParametersArgs> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(DatasetCreateRequestParametersArgs parameters) {
            this.parameters = Output.of(Objects.requireNonNull(parameters));
            return this;
        }
        public Builder registration(Output<DatasetCreateRequestRegistrationArgs> registration) {
            this.registration = Objects.requireNonNull(registration);
            return this;
        }
        public Builder registration(DatasetCreateRequestRegistrationArgs registration) {
            this.registration = Output.of(Objects.requireNonNull(registration));
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
        public Builder skipValidation(@Nullable Output<Boolean> skipValidation) {
            this.skipValidation = skipValidation;
            return this;
        }
        public Builder skipValidation(@Nullable Boolean skipValidation) {
            this.skipValidation = Output.ofNullable(skipValidation);
            return this;
        }
        public Builder timeSeries(@Nullable Output<DatasetCreateRequestTimeSeriesArgs> timeSeries) {
            this.timeSeries = timeSeries;
            return this;
        }
        public Builder timeSeries(@Nullable DatasetCreateRequestTimeSeriesArgs timeSeries) {
            this.timeSeries = Output.ofNullable(timeSeries);
            return this;
        }
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public MachineLearningDatasetArgs build() {
            return new MachineLearningDatasetArgs(datasetName, datasetType, parameters, registration, resourceGroupName, skipValidation, timeSeries, workspaceName);
        }
    }
}
