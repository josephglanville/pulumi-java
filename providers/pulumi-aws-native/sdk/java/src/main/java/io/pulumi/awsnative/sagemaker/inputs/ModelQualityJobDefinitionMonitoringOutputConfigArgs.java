// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.ModelQualityJobDefinitionMonitoringOutputArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The output configuration for monitoring jobs.
 * 
 */
public final class ModelQualityJobDefinitionMonitoringOutputConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelQualityJobDefinitionMonitoringOutputConfigArgs Empty = new ModelQualityJobDefinitionMonitoringOutputConfigArgs();

    /**
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Output.empty() : this.kmsKeyId;
    }

    /**
     * Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is uploaded.
     * 
     */
    @Import(name="monitoringOutputs", required=true)
      private final Output<List<ModelQualityJobDefinitionMonitoringOutputArgs>> monitoringOutputs;

    public Output<List<ModelQualityJobDefinitionMonitoringOutputArgs>> getMonitoringOutputs() {
        return this.monitoringOutputs;
    }

    public ModelQualityJobDefinitionMonitoringOutputConfigArgs(
        @Nullable Output<String> kmsKeyId,
        Output<List<ModelQualityJobDefinitionMonitoringOutputArgs>> monitoringOutputs) {
        this.kmsKeyId = kmsKeyId;
        this.monitoringOutputs = Objects.requireNonNull(monitoringOutputs, "expected parameter 'monitoringOutputs' to be non-null");
    }

    private ModelQualityJobDefinitionMonitoringOutputConfigArgs() {
        this.kmsKeyId = Output.empty();
        this.monitoringOutputs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelQualityJobDefinitionMonitoringOutputConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsKeyId;
        private Output<List<ModelQualityJobDefinitionMonitoringOutputArgs>> monitoringOutputs;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelQualityJobDefinitionMonitoringOutputConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.monitoringOutputs = defaults.monitoringOutputs;
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Output.ofNullable(kmsKeyId);
            return this;
        }
        public Builder monitoringOutputs(Output<List<ModelQualityJobDefinitionMonitoringOutputArgs>> monitoringOutputs) {
            this.monitoringOutputs = Objects.requireNonNull(monitoringOutputs);
            return this;
        }
        public Builder monitoringOutputs(List<ModelQualityJobDefinitionMonitoringOutputArgs> monitoringOutputs) {
            this.monitoringOutputs = Output.of(Objects.requireNonNull(monitoringOutputs));
            return this;
        }
        public Builder monitoringOutputs(ModelQualityJobDefinitionMonitoringOutputArgs... monitoringOutputs) {
            return monitoringOutputs(List.of(monitoringOutputs));
        }        public ModelQualityJobDefinitionMonitoringOutputConfigArgs build() {
            return new ModelQualityJobDefinitionMonitoringOutputConfigArgs(kmsKeyId, monitoringOutputs);
        }
    }
}
