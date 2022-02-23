// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.Input;
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
      private final Input<Integer> instanceCount;

    public Input<Integer> getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * The ML compute instance type for the processing job.
     * 
     */
    @InputImport(name="instanceType", required=true)
      private final Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType;
    }

    /**
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance(s) that run the model monitoring job.
     * 
     */
    @InputImport(name="volumeKmsKeyId")
      private final @Nullable Input<String> volumeKmsKeyId;

    public Input<String> getVolumeKmsKeyId() {
        return this.volumeKmsKeyId == null ? Input.empty() : this.volumeKmsKeyId;
    }

    /**
     * The size of the ML storage volume, in gigabytes, that you want to provision. You must specify sufficient ML storage for your scenario.
     * 
     */
    @InputImport(name="volumeSizeInGB", required=true)
      private final Input<Integer> volumeSizeInGB;

    public Input<Integer> getVolumeSizeInGB() {
        return this.volumeSizeInGB;
    }

    public MonitoringScheduleClusterConfigArgs(
        Input<Integer> instanceCount,
        Input<String> instanceType,
        @Nullable Input<String> volumeKmsKeyId,
        Input<Integer> volumeSizeInGB) {
        this.instanceCount = Objects.requireNonNull(instanceCount, "expected parameter 'instanceCount' to be non-null");
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.volumeKmsKeyId = volumeKmsKeyId;
        this.volumeSizeInGB = Objects.requireNonNull(volumeSizeInGB, "expected parameter 'volumeSizeInGB' to be non-null");
    }

    private MonitoringScheduleClusterConfigArgs() {
        this.instanceCount = Input.empty();
        this.instanceType = Input.empty();
        this.volumeKmsKeyId = Input.empty();
        this.volumeSizeInGB = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> instanceCount;
        private Input<String> instanceType;
        private @Nullable Input<String> volumeKmsKeyId;
        private Input<Integer> volumeSizeInGB;

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

        public Builder setInstanceCount(Input<Integer> instanceCount) {
            this.instanceCount = Objects.requireNonNull(instanceCount);
            return this;
        }

        public Builder setInstanceCount(Integer instanceCount) {
            this.instanceCount = Input.of(Objects.requireNonNull(instanceCount));
            return this;
        }

        public Builder setInstanceType(Input<String> instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Input.of(Objects.requireNonNull(instanceType));
            return this;
        }

        public Builder setVolumeKmsKeyId(@Nullable Input<String> volumeKmsKeyId) {
            this.volumeKmsKeyId = volumeKmsKeyId;
            return this;
        }

        public Builder setVolumeKmsKeyId(@Nullable String volumeKmsKeyId) {
            this.volumeKmsKeyId = Input.ofNullable(volumeKmsKeyId);
            return this;
        }

        public Builder setVolumeSizeInGB(Input<Integer> volumeSizeInGB) {
            this.volumeSizeInGB = Objects.requireNonNull(volumeSizeInGB);
            return this;
        }

        public Builder setVolumeSizeInGB(Integer volumeSizeInGB) {
            this.volumeSizeInGB = Input.of(Objects.requireNonNull(volumeSizeInGB));
            return this;
        }
        public MonitoringScheduleClusterConfigArgs build() {
            return new MonitoringScheduleClusterConfigArgs(instanceCount, instanceType, volumeKmsKeyId, volumeSizeInGB);
        }
    }
}
