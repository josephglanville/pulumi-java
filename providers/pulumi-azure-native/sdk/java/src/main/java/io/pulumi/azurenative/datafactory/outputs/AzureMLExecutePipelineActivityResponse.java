// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureMLExecutePipelineActivityResponse {
    /**
     * Whether to continue execution of other steps in the PipelineRun if a step fails. This information will be passed in the continueOnStepFailure property of the published pipeline execution request. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object continueOnStepFailure;
    /**
     * Dictionary used for changing data path assignments without retraining. Values will be passed in the dataPathAssignments property of the published pipeline execution request. Type: object with key value pairs (or Expression with resultType object).
     * 
     */
    private final @Nullable Object dataPathAssignments;
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * Run history experiment name of the pipeline run. This information will be passed in the ExperimentName property of the published pipeline execution request. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object experimentName;
    /**
     * Linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;
    /**
     * The parent Azure ML Service pipeline run id. This information will be passed in the ParentRunId property of the published pipeline execution request. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object mlParentRunId;
    /**
     * ID of the published Azure ML pipeline endpoint. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object mlPipelineEndpointId;
    /**
     * ID of the published Azure ML pipeline. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object mlPipelineId;
    /**
     * Key,Value pairs to be passed to the published Azure ML pipeline endpoint. Keys must match the names of pipeline parameters defined in the published pipeline. Values will be passed in the ParameterAssignments property of the published pipeline execution request. Type: object with key value pairs (or Expression with resultType object).
     * 
     */
    private final @Nullable Object mlPipelineParameters;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * Activity policy.
     * 
     */
    private final @Nullable ActivityPolicyResponse policy;
    /**
     * Type of activity.
     * Expected value is 'AzureMLExecutePipeline'.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;
    /**
     * Version of the published Azure ML pipeline endpoint. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object version;

    @CustomType.Constructor
    private AzureMLExecutePipelineActivityResponse(
        @CustomType.Parameter("continueOnStepFailure") @Nullable Object continueOnStepFailure,
        @CustomType.Parameter("dataPathAssignments") @Nullable Object dataPathAssignments,
        @CustomType.Parameter("dependsOn") @Nullable List<ActivityDependencyResponse> dependsOn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("experimentName") @Nullable Object experimentName,
        @CustomType.Parameter("linkedServiceName") @Nullable LinkedServiceReferenceResponse linkedServiceName,
        @CustomType.Parameter("mlParentRunId") @Nullable Object mlParentRunId,
        @CustomType.Parameter("mlPipelineEndpointId") @Nullable Object mlPipelineEndpointId,
        @CustomType.Parameter("mlPipelineId") @Nullable Object mlPipelineId,
        @CustomType.Parameter("mlPipelineParameters") @Nullable Object mlPipelineParameters,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("policy") @Nullable ActivityPolicyResponse policy,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userProperties") @Nullable List<UserPropertyResponse> userProperties,
        @CustomType.Parameter("version") @Nullable Object version) {
        this.continueOnStepFailure = continueOnStepFailure;
        this.dataPathAssignments = dataPathAssignments;
        this.dependsOn = dependsOn;
        this.description = description;
        this.experimentName = experimentName;
        this.linkedServiceName = linkedServiceName;
        this.mlParentRunId = mlParentRunId;
        this.mlPipelineEndpointId = mlPipelineEndpointId;
        this.mlPipelineId = mlPipelineId;
        this.mlPipelineParameters = mlPipelineParameters;
        this.name = name;
        this.policy = policy;
        this.type = type;
        this.userProperties = userProperties;
        this.version = version;
    }

    /**
     * Whether to continue execution of other steps in the PipelineRun if a step fails. This information will be passed in the continueOnStepFailure property of the published pipeline execution request. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getContinueOnStepFailure() {
        return Optional.ofNullable(this.continueOnStepFailure);
    }
    /**
     * Dictionary used for changing data path assignments without retraining. Values will be passed in the dataPathAssignments property of the published pipeline execution request. Type: object with key value pairs (or Expression with resultType object).
     * 
    */
    public Optional<Object> getDataPathAssignments() {
        return Optional.ofNullable(this.dataPathAssignments);
    }
    /**
     * Activity depends on condition.
     * 
    */
    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Run history experiment name of the pipeline run. This information will be passed in the ExperimentName property of the published pipeline execution request. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getExperimentName() {
        return Optional.ofNullable(this.experimentName);
    }
    /**
     * Linked service reference.
     * 
    */
    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }
    /**
     * The parent Azure ML Service pipeline run id. This information will be passed in the ParentRunId property of the published pipeline execution request. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getMlParentRunId() {
        return Optional.ofNullable(this.mlParentRunId);
    }
    /**
     * ID of the published Azure ML pipeline endpoint. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getMlPipelineEndpointId() {
        return Optional.ofNullable(this.mlPipelineEndpointId);
    }
    /**
     * ID of the published Azure ML pipeline. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getMlPipelineId() {
        return Optional.ofNullable(this.mlPipelineId);
    }
    /**
     * Key,Value pairs to be passed to the published Azure ML pipeline endpoint. Keys must match the names of pipeline parameters defined in the published pipeline. Values will be passed in the ParameterAssignments property of the published pipeline execution request. Type: object with key value pairs (or Expression with resultType object).
     * 
    */
    public Optional<Object> getMlPipelineParameters() {
        return Optional.ofNullable(this.mlPipelineParameters);
    }
    /**
     * Activity name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Activity policy.
     * 
    */
    public Optional<ActivityPolicyResponse> getPolicy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * Type of activity.
     * Expected value is 'AzureMLExecutePipeline'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Activity user properties.
     * 
    */
    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }
    /**
     * Version of the published Azure ML pipeline endpoint. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMLExecutePipelineActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object continueOnStepFailure;
        private @Nullable Object dataPathAssignments;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable Object experimentName;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable Object mlParentRunId;
        private @Nullable Object mlPipelineEndpointId;
        private @Nullable Object mlPipelineId;
        private @Nullable Object mlPipelineParameters;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;
        private @Nullable Object version;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMLExecutePipelineActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continueOnStepFailure = defaults.continueOnStepFailure;
    	      this.dataPathAssignments = defaults.dataPathAssignments;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.experimentName = defaults.experimentName;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.mlParentRunId = defaults.mlParentRunId;
    	      this.mlPipelineEndpointId = defaults.mlPipelineEndpointId;
    	      this.mlPipelineId = defaults.mlPipelineId;
    	      this.mlPipelineParameters = defaults.mlPipelineParameters;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
    	      this.version = defaults.version;
        }

        public Builder continueOnStepFailure(@Nullable Object continueOnStepFailure) {
            this.continueOnStepFailure = continueOnStepFailure;
            return this;
        }
        public Builder dataPathAssignments(@Nullable Object dataPathAssignments) {
            this.dataPathAssignments = dataPathAssignments;
            return this;
        }
        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(ActivityDependencyResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder experimentName(@Nullable Object experimentName) {
            this.experimentName = experimentName;
            return this;
        }
        public Builder linkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }
        public Builder mlParentRunId(@Nullable Object mlParentRunId) {
            this.mlParentRunId = mlParentRunId;
            return this;
        }
        public Builder mlPipelineEndpointId(@Nullable Object mlPipelineEndpointId) {
            this.mlPipelineEndpointId = mlPipelineEndpointId;
            return this;
        }
        public Builder mlPipelineId(@Nullable Object mlPipelineId) {
            this.mlPipelineId = mlPipelineId;
            return this;
        }
        public Builder mlPipelineParameters(@Nullable Object mlPipelineParameters) {
            this.mlPipelineParameters = mlPipelineParameters;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder policy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(UserPropertyResponse... userProperties) {
            return userProperties(List.of(userProperties));
        }
        public Builder version(@Nullable Object version) {
            this.version = version;
            return this;
        }        public AzureMLExecutePipelineActivityResponse build() {
            return new AzureMLExecutePipelineActivityResponse(continueOnStepFailure, dataPathAssignments, dependsOn, description, experimentName, linkedServiceName, mlParentRunId, mlPipelineEndpointId, mlPipelineId, mlPipelineParameters, name, policy, type, userProperties, version);
        }
    }
}
