// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for the cluster used to run model monitoring jobs.
 * 
 */
public final class MonitoringScheduleClusterConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringScheduleClusterConfigArgs Empty = new MonitoringScheduleClusterConfigArgs();

    /**
     * The number of ML compute instances to use in the model monitoring job. For distributed processing jobs, specify a value greater than 1. The default value is 1.
     * 
     */
    @InputImport(name="instanceCount", required=true)
      private final Output<Integer> instanceCount;

    public Output<Integer> getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * The ML compute instance type for the processing job.
     * 
     */
    @InputImport(name="instanceType", required=true)
      private final Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType;
    }

    /**
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance(s) that run the model monitoring job.
     * 
     */
    @InputImport(name="volumeKmsKeyId")
      private final @Nullable Output<String> volumeKmsKeyId;

    public Output<String> getVolumeKmsKeyId() {
        return this.volumeKmsKeyId == null ? Output.empty() : this.volumeKmsKeyId;
    }

    /**
     * The size of the ML storage volume, in gigabytes, that you want to provision. You must specify sufficient ML storage for your scenario.
     * 
     */
    @InputImport(name="volumeSizeInGB", required=true)
      private final Output<Integer> volumeSizeInGB;

    public Output<Integer> getVolumeSizeInGB() {
        return this.volumeSizeInGB;
    }

    public MonitoringScheduleClusterConfigArgs(
        Output<Integer> instanceCount,
        Output<String> instanceType,
        @Nullable Output<String> volumeKmsKeyId,
        Output<Integer> volumeSizeInGB) {
        this.instanceCount = Objects.requireNonNull(instanceCount, "expected parameter 'instanceCount' to be non-null");
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.volumeKmsKeyId = volumeKmsKeyId;
        this.volumeSizeInGB = Objects.requireNonNull(volumeSizeInGB, "expected parameter 'volumeSizeInGB' to be non-null");
    }

    private MonitoringScheduleClusterConfigArgs() {
        this.instanceCount = Output.empty();
        this.instanceType = Output.empty();
        this.volumeKmsKeyId = Output.empty();
        this.volumeSizeInGB = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> instanceCount;
        private Output<String> instanceType;
        private @Nullable Output<String> volumeKmsKeyId;
        private Output<Integer> volumeSizeInGB;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleClusterConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceType = defaults.instanceType;
    	      this.volumeKmsKeyId = defaults.volumeKmsKeyId;
    	      this.volumeSizeInGB = defaults.volumeSizeInGB;
        }

        public Builder instanceCount(Output<Integer> instanceCount) {
            this.instanceCount = Objects.requireNonNull(instanceCount);
            return this;
        }

        public Builder instanceCount(Integer instanceCount) {
            this.instanceCount = Output.of(Objects.requireNonNull(instanceCount));
            return this;
        }

        public Builder instanceType(Output<String> instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = Output.of(Objects.requireNonNull(instanceType));
            return this;
        }

        public Builder volumeKmsKeyId(@Nullable Output<String> volumeKmsKeyId) {
            this.volumeKmsKeyId = volumeKmsKeyId;
            return this;
        }

        public Builder volumeKmsKeyId(@Nullable String volumeKmsKeyId) {
            this.volumeKmsKeyId = Output.ofNullable(volumeKmsKeyId);
            return this;
        }

        public Builder volumeSizeInGB(Output<Integer> volumeSizeInGB) {
            this.volumeSizeInGB = Objects.requireNonNull(volumeSizeInGB);
            return this;
        }

        public Builder volumeSizeInGB(Integer volumeSizeInGB) {
            this.volumeSizeInGB = Output.of(Objects.requireNonNull(volumeSizeInGB));
            return this;
        }
        public MonitoringScheduleClusterConfigArgs build() {
            return new MonitoringScheduleClusterConfigArgs(instanceCount, instanceType, volumeKmsKeyId, volumeSizeInGB);
        }
    }
}
