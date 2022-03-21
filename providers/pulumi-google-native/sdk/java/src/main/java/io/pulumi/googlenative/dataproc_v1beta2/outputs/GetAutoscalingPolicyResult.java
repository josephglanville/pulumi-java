// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.BasicAutoscalingAlgorithmResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.InstanceGroupAutoscalingPolicyConfigResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAutoscalingPolicyResult {
    private final BasicAutoscalingAlgorithmResponse basicAlgorithm;
    /**
     * The "resource name" of the autoscaling policy, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.autoscalingPolicies, the resource name of the policy has the following format: projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id} For projects.locations.autoscalingPolicies, the resource name of the policy has the following format: projects/{project_id}/locations/{location}/autoscalingPolicies/{policy_id}
     * 
     */
    private final String name;
    /**
     * Optional. Describes how the autoscaler will operate for secondary workers.
     * 
     */
    private final InstanceGroupAutoscalingPolicyConfigResponse secondaryWorkerConfig;
    /**
     * Describes how the autoscaler will operate for primary workers.
     * 
     */
    private final InstanceGroupAutoscalingPolicyConfigResponse workerConfig;

    @CustomType.Constructor
    private GetAutoscalingPolicyResult(
        @CustomType.Parameter("basicAlgorithm") BasicAutoscalingAlgorithmResponse basicAlgorithm,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("secondaryWorkerConfig") InstanceGroupAutoscalingPolicyConfigResponse secondaryWorkerConfig,
        @CustomType.Parameter("workerConfig") InstanceGroupAutoscalingPolicyConfigResponse workerConfig) {
        this.basicAlgorithm = basicAlgorithm;
        this.name = name;
        this.secondaryWorkerConfig = secondaryWorkerConfig;
        this.workerConfig = workerConfig;
    }

    public BasicAutoscalingAlgorithmResponse getBasicAlgorithm() {
        return this.basicAlgorithm;
    }
    /**
     * The "resource name" of the autoscaling policy, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.autoscalingPolicies, the resource name of the policy has the following format: projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id} For projects.locations.autoscalingPolicies, the resource name of the policy has the following format: projects/{project_id}/locations/{location}/autoscalingPolicies/{policy_id}
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Optional. Describes how the autoscaler will operate for secondary workers.
     * 
    */
    public InstanceGroupAutoscalingPolicyConfigResponse getSecondaryWorkerConfig() {
        return this.secondaryWorkerConfig;
    }
    /**
     * Describes how the autoscaler will operate for primary workers.
     * 
    */
    public InstanceGroupAutoscalingPolicyConfigResponse getWorkerConfig() {
        return this.workerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutoscalingPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicAutoscalingAlgorithmResponse basicAlgorithm;
        private String name;
        private InstanceGroupAutoscalingPolicyConfigResponse secondaryWorkerConfig;
        private InstanceGroupAutoscalingPolicyConfigResponse workerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAutoscalingPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicAlgorithm = defaults.basicAlgorithm;
    	      this.name = defaults.name;
    	      this.secondaryWorkerConfig = defaults.secondaryWorkerConfig;
    	      this.workerConfig = defaults.workerConfig;
        }

        public Builder basicAlgorithm(BasicAutoscalingAlgorithmResponse basicAlgorithm) {
            this.basicAlgorithm = Objects.requireNonNull(basicAlgorithm);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder secondaryWorkerConfig(InstanceGroupAutoscalingPolicyConfigResponse secondaryWorkerConfig) {
            this.secondaryWorkerConfig = Objects.requireNonNull(secondaryWorkerConfig);
            return this;
        }
        public Builder workerConfig(InstanceGroupAutoscalingPolicyConfigResponse workerConfig) {
            this.workerConfig = Objects.requireNonNull(workerConfig);
            return this;
        }        public GetAutoscalingPolicyResult build() {
            return new GetAutoscalingPolicyResult(basicAlgorithm, name, secondaryWorkerConfig, workerConfig);
        }
    }
}
