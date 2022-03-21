// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.notebooks_v1.outputs.DataprocParametersResponse;
import io.pulumi.googlenative.notebooks_v1.outputs.SchedulerAcceleratorConfigResponse;
import io.pulumi.googlenative.notebooks_v1.outputs.VertexAIParametersResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class ExecutionTemplateResponse {
    /**
     * Configuration (count and accelerator type) for hardware running notebook execution.
     * 
     */
    private final SchedulerAcceleratorConfigResponse acceleratorConfig;
    /**
     * Container Image URI to a DLVM Example: 'gcr.io/deeplearning-platform-release/base-cu100' More examples can be found at: https://cloud.google.com/ai-platform/deep-learning-containers/docs/choosing-container
     * 
     */
    private final String containerImageUri;
    /**
     * Parameters used in Dataproc JobType executions.
     * 
     */
    private final DataprocParametersResponse dataprocParameters;
    /**
     * Path to the notebook file to execute. Must be in a Google Cloud Storage bucket. Format: `gs://{bucket_name}/{folder}/{notebook_file_name}` Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook.ipynb`
     * 
     */
    private final String inputNotebookFile;
    /**
     * The type of Job to be used on this execution.
     * 
     */
    private final String jobType;
    /**
     * Name of the kernel spec to use. This must be specified if the kernel spec name on the execution target does not match the name in the input notebook file.
     * 
     */
    private final String kernelSpec;
    /**
     * Labels for execution. If execution is scheduled, a field included will be 'nbs-scheduled'. Otherwise, it is an immediate execution, and an included field will be 'nbs-immediate'. Use fields to efficiently index between various types of executions.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Specifies the type of virtual machine to use for your training job's master worker. You must specify this field when `scaleTier` is set to `CUSTOM`. You can use certain Compute Engine machine types directly in this field. The following types are supported: - `n1-standard-4` - `n1-standard-8` - `n1-standard-16` - `n1-standard-32` - `n1-standard-64` - `n1-standard-96` - `n1-highmem-2` - `n1-highmem-4` - `n1-highmem-8` - `n1-highmem-16` - `n1-highmem-32` - `n1-highmem-64` - `n1-highmem-96` - `n1-highcpu-16` - `n1-highcpu-32` - `n1-highcpu-64` - `n1-highcpu-96` Alternatively, you can use the following legacy machine types: - `standard` - `large_model` - `complex_model_s` - `complex_model_m` - `complex_model_l` - `standard_gpu` - `complex_model_m_gpu` - `complex_model_l_gpu` - `standard_p100` - `complex_model_m_p100` - `standard_v100` - `large_model_v100` - `complex_model_m_v100` - `complex_model_l_v100` Finally, if you want to use a TPU for training, specify `cloud_tpu` in this field. Learn more about the [special configuration options for training with TPU](https://cloud.google.com/ai-platform/training/docs/using-tpus#configuring_a_custom_tpu_machine).
     * 
     */
    private final String masterType;
    /**
     * Path to the notebook folder to write to. Must be in a Google Cloud Storage bucket path. Format: `gs://{bucket_name}/{folder}` Ex: `gs://notebook_user/scheduled_notebooks`
     * 
     */
    private final String outputNotebookFolder;
    /**
     * Parameters used within the 'input_notebook_file' notebook.
     * 
     */
    private final String parameters;
    /**
     * Parameters to be overridden in the notebook during execution. Ref https://papermill.readthedocs.io/en/latest/usage-parameterize.html on how to specifying parameters in the input notebook and pass them here in an YAML file. Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook_params.yaml`
     * 
     */
    private final String paramsYamlFile;
    /**
     * The email address of a service account to use when running the execution. You must have the `iam.serviceAccounts.actAs` permission for the specified service account.
     * 
     */
    private final String serviceAccount;
    /**
     * Parameters used in Vertex AI JobType executions.
     * 
     */
    private final VertexAIParametersResponse vertexAiParameters;

    @CustomType.Constructor
    private ExecutionTemplateResponse(
        @CustomType.Parameter("acceleratorConfig") SchedulerAcceleratorConfigResponse acceleratorConfig,
        @CustomType.Parameter("containerImageUri") String containerImageUri,
        @CustomType.Parameter("dataprocParameters") DataprocParametersResponse dataprocParameters,
        @CustomType.Parameter("inputNotebookFile") String inputNotebookFile,
        @CustomType.Parameter("jobType") String jobType,
        @CustomType.Parameter("kernelSpec") String kernelSpec,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("masterType") String masterType,
        @CustomType.Parameter("outputNotebookFolder") String outputNotebookFolder,
        @CustomType.Parameter("parameters") String parameters,
        @CustomType.Parameter("paramsYamlFile") String paramsYamlFile,
        @CustomType.Parameter("serviceAccount") String serviceAccount,
        @CustomType.Parameter("vertexAiParameters") VertexAIParametersResponse vertexAiParameters) {
        this.acceleratorConfig = acceleratorConfig;
        this.containerImageUri = containerImageUri;
        this.dataprocParameters = dataprocParameters;
        this.inputNotebookFile = inputNotebookFile;
        this.jobType = jobType;
        this.kernelSpec = kernelSpec;
        this.labels = labels;
        this.masterType = masterType;
        this.outputNotebookFolder = outputNotebookFolder;
        this.parameters = parameters;
        this.paramsYamlFile = paramsYamlFile;
        this.serviceAccount = serviceAccount;
        this.vertexAiParameters = vertexAiParameters;
    }

    /**
     * Configuration (count and accelerator type) for hardware running notebook execution.
     * 
    */
    public SchedulerAcceleratorConfigResponse getAcceleratorConfig() {
        return this.acceleratorConfig;
    }
    /**
     * Container Image URI to a DLVM Example: 'gcr.io/deeplearning-platform-release/base-cu100' More examples can be found at: https://cloud.google.com/ai-platform/deep-learning-containers/docs/choosing-container
     * 
    */
    public String getContainerImageUri() {
        return this.containerImageUri;
    }
    /**
     * Parameters used in Dataproc JobType executions.
     * 
    */
    public DataprocParametersResponse getDataprocParameters() {
        return this.dataprocParameters;
    }
    /**
     * Path to the notebook file to execute. Must be in a Google Cloud Storage bucket. Format: `gs://{bucket_name}/{folder}/{notebook_file_name}` Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook.ipynb`
     * 
    */
    public String getInputNotebookFile() {
        return this.inputNotebookFile;
    }
    /**
     * The type of Job to be used on this execution.
     * 
    */
    public String getJobType() {
        return this.jobType;
    }
    /**
     * Name of the kernel spec to use. This must be specified if the kernel spec name on the execution target does not match the name in the input notebook file.
     * 
    */
    public String getKernelSpec() {
        return this.kernelSpec;
    }
    /**
     * Labels for execution. If execution is scheduled, a field included will be 'nbs-scheduled'. Otherwise, it is an immediate execution, and an included field will be 'nbs-immediate'. Use fields to efficiently index between various types of executions.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Specifies the type of virtual machine to use for your training job's master worker. You must specify this field when `scaleTier` is set to `CUSTOM`. You can use certain Compute Engine machine types directly in this field. The following types are supported: - `n1-standard-4` - `n1-standard-8` - `n1-standard-16` - `n1-standard-32` - `n1-standard-64` - `n1-standard-96` - `n1-highmem-2` - `n1-highmem-4` - `n1-highmem-8` - `n1-highmem-16` - `n1-highmem-32` - `n1-highmem-64` - `n1-highmem-96` - `n1-highcpu-16` - `n1-highcpu-32` - `n1-highcpu-64` - `n1-highcpu-96` Alternatively, you can use the following legacy machine types: - `standard` - `large_model` - `complex_model_s` - `complex_model_m` - `complex_model_l` - `standard_gpu` - `complex_model_m_gpu` - `complex_model_l_gpu` - `standard_p100` - `complex_model_m_p100` - `standard_v100` - `large_model_v100` - `complex_model_m_v100` - `complex_model_l_v100` Finally, if you want to use a TPU for training, specify `cloud_tpu` in this field. Learn more about the [special configuration options for training with TPU](https://cloud.google.com/ai-platform/training/docs/using-tpus#configuring_a_custom_tpu_machine).
     * 
    */
    public String getMasterType() {
        return this.masterType;
    }
    /**
     * Path to the notebook folder to write to. Must be in a Google Cloud Storage bucket path. Format: `gs://{bucket_name}/{folder}` Ex: `gs://notebook_user/scheduled_notebooks`
     * 
    */
    public String getOutputNotebookFolder() {
        return this.outputNotebookFolder;
    }
    /**
     * Parameters used within the 'input_notebook_file' notebook.
     * 
    */
    public String getParameters() {
        return this.parameters;
    }
    /**
     * Parameters to be overridden in the notebook during execution. Ref https://papermill.readthedocs.io/en/latest/usage-parameterize.html on how to specifying parameters in the input notebook and pass them here in an YAML file. Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook_params.yaml`
     * 
    */
    public String getParamsYamlFile() {
        return this.paramsYamlFile;
    }
    /**
     * The email address of a service account to use when running the execution. You must have the `iam.serviceAccounts.actAs` permission for the specified service account.
     * 
    */
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Parameters used in Vertex AI JobType executions.
     * 
    */
    public VertexAIParametersResponse getVertexAiParameters() {
        return this.vertexAiParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionTemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchedulerAcceleratorConfigResponse acceleratorConfig;
        private String containerImageUri;
        private DataprocParametersResponse dataprocParameters;
        private String inputNotebookFile;
        private String jobType;
        private String kernelSpec;
        private Map<String,String> labels;
        private String masterType;
        private String outputNotebookFolder;
        private String parameters;
        private String paramsYamlFile;
        private String serviceAccount;
        private VertexAIParametersResponse vertexAiParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecutionTemplateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorConfig = defaults.acceleratorConfig;
    	      this.containerImageUri = defaults.containerImageUri;
    	      this.dataprocParameters = defaults.dataprocParameters;
    	      this.inputNotebookFile = defaults.inputNotebookFile;
    	      this.jobType = defaults.jobType;
    	      this.kernelSpec = defaults.kernelSpec;
    	      this.labels = defaults.labels;
    	      this.masterType = defaults.masterType;
    	      this.outputNotebookFolder = defaults.outputNotebookFolder;
    	      this.parameters = defaults.parameters;
    	      this.paramsYamlFile = defaults.paramsYamlFile;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.vertexAiParameters = defaults.vertexAiParameters;
        }

        public Builder acceleratorConfig(SchedulerAcceleratorConfigResponse acceleratorConfig) {
            this.acceleratorConfig = Objects.requireNonNull(acceleratorConfig);
            return this;
        }
        public Builder containerImageUri(String containerImageUri) {
            this.containerImageUri = Objects.requireNonNull(containerImageUri);
            return this;
        }
        public Builder dataprocParameters(DataprocParametersResponse dataprocParameters) {
            this.dataprocParameters = Objects.requireNonNull(dataprocParameters);
            return this;
        }
        public Builder inputNotebookFile(String inputNotebookFile) {
            this.inputNotebookFile = Objects.requireNonNull(inputNotebookFile);
            return this;
        }
        public Builder jobType(String jobType) {
            this.jobType = Objects.requireNonNull(jobType);
            return this;
        }
        public Builder kernelSpec(String kernelSpec) {
            this.kernelSpec = Objects.requireNonNull(kernelSpec);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder masterType(String masterType) {
            this.masterType = Objects.requireNonNull(masterType);
            return this;
        }
        public Builder outputNotebookFolder(String outputNotebookFolder) {
            this.outputNotebookFolder = Objects.requireNonNull(outputNotebookFolder);
            return this;
        }
        public Builder parameters(String parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder paramsYamlFile(String paramsYamlFile) {
            this.paramsYamlFile = Objects.requireNonNull(paramsYamlFile);
            return this;
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder vertexAiParameters(VertexAIParametersResponse vertexAiParameters) {
            this.vertexAiParameters = Objects.requireNonNull(vertexAiParameters);
            return this;
        }        public ExecutionTemplateResponse build() {
            return new ExecutionTemplateResponse(acceleratorConfig, containerImageUri, dataprocParameters, inputNotebookFile, jobType, kernelSpec, labels, masterType, outputNotebookFolder, parameters, paramsYamlFile, serviceAccount, vertexAiParameters);
        }
    }
}
