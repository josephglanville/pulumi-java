// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.ModelBiasJobDefinitionMonitoringOutputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The output configuration for monitoring jobs.
 * 
 */
public final class ModelBiasJobDefinitionMonitoringOutputConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelBiasJobDefinitionMonitoringOutputConfigArgs Empty = new ModelBiasJobDefinitionMonitoringOutputConfigArgs();

    /**
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
     * 
     */
    @InputImport(name="kmsKeyId")
      private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is uploaded.
     * 
     */
    @InputImport(name="monitoringOutputs", required=true)
      private final Input<List<ModelBiasJobDefinitionMonitoringOutputArgs>> monitoringOutputs;

    public Input<List<ModelBiasJobDefinitionMonitoringOutputArgs>> getMonitoringOutputs() {
        return this.monitoringOutputs;
    }

    public ModelBiasJobDefinitionMonitoringOutputConfigArgs(
        @Nullable Input<String> kmsKeyId,
        Input<List<ModelBiasJobDefinitionMonitoringOutputArgs>> monitoringOutputs) {
        this.kmsKeyId = kmsKeyId;
        this.monitoringOutputs = Objects.requireNonNull(monitoringOutputs, "expected parameter 'monitoringOutputs' to be non-null");
    }

    private ModelBiasJobDefinitionMonitoringOutputConfigArgs() {
        this.kmsKeyId = Input.empty();
        this.monitoringOutputs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelBiasJobDefinitionMonitoringOutputConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kmsKeyId;
        private Input<List<ModelBiasJobDefinitionMonitoringOutputArgs>> monitoringOutputs;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelBiasJobDefinitionMonitoringOutputConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.monitoringOutputs = defaults.monitoringOutputs;
        }

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder setMonitoringOutputs(Input<List<ModelBiasJobDefinitionMonitoringOutputArgs>> monitoringOutputs) {
            this.monitoringOutputs = Objects.requireNonNull(monitoringOutputs);
            return this;
        }

        public Builder setMonitoringOutputs(List<ModelBiasJobDefinitionMonitoringOutputArgs> monitoringOutputs) {
            this.monitoringOutputs = Input.of(Objects.requireNonNull(monitoringOutputs));
            return this;
        }
        public ModelBiasJobDefinitionMonitoringOutputConfigArgs build() {
            return new ModelBiasJobDefinitionMonitoringOutputConfigArgs(kmsKeyId, monitoringOutputs);
        }
    }
}
