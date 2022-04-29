// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceShapeConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceShapeConfigArgs Empty = new InstanceShapeConfigArgs();

    /**
     * (Updatable) The baseline OCPU utilization for a subcore burstable VM instance. Leave this attribute blank for a non-burstable instance, or explicitly specify non-burstable with `BASELINE_1_1`.
     * 
     */
    @Import(name="baselineOcpuUtilization")
    private @Nullable Output<String> baselineOcpuUtilization;

    /**
     * @return (Updatable) The baseline OCPU utilization for a subcore burstable VM instance. Leave this attribute blank for a non-burstable instance, or explicitly specify non-burstable with `BASELINE_1_1`.
     * 
     */
    public Optional<Output<String>> baselineOcpuUtilization() {
        return Optional.ofNullable(this.baselineOcpuUtilization);
    }

    /**
     * A short description of the instance&#39;s graphics processing unit (GPU).
     * 
     */
    @Import(name="gpuDescription")
    private @Nullable Output<String> gpuDescription;

    /**
     * @return A short description of the instance&#39;s graphics processing unit (GPU).
     * 
     */
    public Optional<Output<String>> gpuDescription() {
        return Optional.ofNullable(this.gpuDescription);
    }

    /**
     * The number of GPUs available to the instance.
     * 
     */
    @Import(name="gpus")
    private @Nullable Output<Integer> gpus;

    /**
     * @return The number of GPUs available to the instance.
     * 
     */
    public Optional<Output<Integer>> gpus() {
        return Optional.ofNullable(this.gpus);
    }

    /**
     * A short description of the local disks available to this instance.
     * 
     */
    @Import(name="localDiskDescription")
    private @Nullable Output<String> localDiskDescription;

    /**
     * @return A short description of the local disks available to this instance.
     * 
     */
    public Optional<Output<String>> localDiskDescription() {
        return Optional.ofNullable(this.localDiskDescription);
    }

    /**
     * The number of local disks available to the instance.
     * 
     */
    @Import(name="localDisks")
    private @Nullable Output<Integer> localDisks;

    /**
     * @return The number of local disks available to the instance.
     * 
     */
    public Optional<Output<Integer>> localDisks() {
        return Optional.ofNullable(this.localDisks);
    }

    /**
     * The aggregate size of all local disks, in gigabytes.
     * 
     */
    @Import(name="localDisksTotalSizeInGbs")
    private @Nullable Output<Double> localDisksTotalSizeInGbs;

    /**
     * @return The aggregate size of all local disks, in gigabytes.
     * 
     */
    public Optional<Output<Double>> localDisksTotalSizeInGbs() {
        return Optional.ofNullable(this.localDisksTotalSizeInGbs);
    }

    /**
     * The maximum number of VNIC attachments for the instance.
     * 
     */
    @Import(name="maxVnicAttachments")
    private @Nullable Output<Integer> maxVnicAttachments;

    /**
     * @return The maximum number of VNIC attachments for the instance.
     * 
     */
    public Optional<Output<Integer>> maxVnicAttachments() {
        return Optional.ofNullable(this.maxVnicAttachments);
    }

    /**
     * (Updatable) The total amount of memory available to the instance, in gigabytes.
     * 
     */
    @Import(name="memoryInGbs")
    private @Nullable Output<Double> memoryInGbs;

    /**
     * @return (Updatable) The total amount of memory available to the instance, in gigabytes.
     * 
     */
    public Optional<Output<Double>> memoryInGbs() {
        return Optional.ofNullable(this.memoryInGbs);
    }

    /**
     * The networking bandwidth available to the instance, in gigabits per second.
     * 
     */
    @Import(name="networkingBandwidthInGbps")
    private @Nullable Output<Double> networkingBandwidthInGbps;

    /**
     * @return The networking bandwidth available to the instance, in gigabits per second.
     * 
     */
    public Optional<Output<Double>> networkingBandwidthInGbps() {
        return Optional.ofNullable(this.networkingBandwidthInGbps);
    }

    /**
     * (Updatable) The total number of OCPUs available to the instance.
     * 
     */
    @Import(name="ocpus")
    private @Nullable Output<Double> ocpus;

    /**
     * @return (Updatable) The total number of OCPUs available to the instance.
     * 
     */
    public Optional<Output<Double>> ocpus() {
        return Optional.ofNullable(this.ocpus);
    }

    /**
     * A short description of the instance&#39;s processor (CPU).
     * 
     */
    @Import(name="processorDescription")
    private @Nullable Output<String> processorDescription;

    /**
     * @return A short description of the instance&#39;s processor (CPU).
     * 
     */
    public Optional<Output<String>> processorDescription() {
        return Optional.ofNullable(this.processorDescription);
    }

    private InstanceShapeConfigArgs() {}

    private InstanceShapeConfigArgs(InstanceShapeConfigArgs $) {
        this.baselineOcpuUtilization = $.baselineOcpuUtilization;
        this.gpuDescription = $.gpuDescription;
        this.gpus = $.gpus;
        this.localDiskDescription = $.localDiskDescription;
        this.localDisks = $.localDisks;
        this.localDisksTotalSizeInGbs = $.localDisksTotalSizeInGbs;
        this.maxVnicAttachments = $.maxVnicAttachments;
        this.memoryInGbs = $.memoryInGbs;
        this.networkingBandwidthInGbps = $.networkingBandwidthInGbps;
        this.ocpus = $.ocpus;
        this.processorDescription = $.processorDescription;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceShapeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceShapeConfigArgs $;

        public Builder() {
            $ = new InstanceShapeConfigArgs();
        }

        public Builder(InstanceShapeConfigArgs defaults) {
            $ = new InstanceShapeConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baselineOcpuUtilization (Updatable) The baseline OCPU utilization for a subcore burstable VM instance. Leave this attribute blank for a non-burstable instance, or explicitly specify non-burstable with `BASELINE_1_1`.
         * 
         * @return builder
         * 
         */
        public Builder baselineOcpuUtilization(@Nullable Output<String> baselineOcpuUtilization) {
            $.baselineOcpuUtilization = baselineOcpuUtilization;
            return this;
        }

        /**
         * @param baselineOcpuUtilization (Updatable) The baseline OCPU utilization for a subcore burstable VM instance. Leave this attribute blank for a non-burstable instance, or explicitly specify non-burstable with `BASELINE_1_1`.
         * 
         * @return builder
         * 
         */
        public Builder baselineOcpuUtilization(String baselineOcpuUtilization) {
            return baselineOcpuUtilization(Output.of(baselineOcpuUtilization));
        }

        /**
         * @param gpuDescription A short description of the instance&#39;s graphics processing unit (GPU).
         * 
         * @return builder
         * 
         */
        public Builder gpuDescription(@Nullable Output<String> gpuDescription) {
            $.gpuDescription = gpuDescription;
            return this;
        }

        /**
         * @param gpuDescription A short description of the instance&#39;s graphics processing unit (GPU).
         * 
         * @return builder
         * 
         */
        public Builder gpuDescription(String gpuDescription) {
            return gpuDescription(Output.of(gpuDescription));
        }

        /**
         * @param gpus The number of GPUs available to the instance.
         * 
         * @return builder
         * 
         */
        public Builder gpus(@Nullable Output<Integer> gpus) {
            $.gpus = gpus;
            return this;
        }

        /**
         * @param gpus The number of GPUs available to the instance.
         * 
         * @return builder
         * 
         */
        public Builder gpus(Integer gpus) {
            return gpus(Output.of(gpus));
        }

        /**
         * @param localDiskDescription A short description of the local disks available to this instance.
         * 
         * @return builder
         * 
         */
        public Builder localDiskDescription(@Nullable Output<String> localDiskDescription) {
            $.localDiskDescription = localDiskDescription;
            return this;
        }

        /**
         * @param localDiskDescription A short description of the local disks available to this instance.
         * 
         * @return builder
         * 
         */
        public Builder localDiskDescription(String localDiskDescription) {
            return localDiskDescription(Output.of(localDiskDescription));
        }

        /**
         * @param localDisks The number of local disks available to the instance.
         * 
         * @return builder
         * 
         */
        public Builder localDisks(@Nullable Output<Integer> localDisks) {
            $.localDisks = localDisks;
            return this;
        }

        /**
         * @param localDisks The number of local disks available to the instance.
         * 
         * @return builder
         * 
         */
        public Builder localDisks(Integer localDisks) {
            return localDisks(Output.of(localDisks));
        }

        /**
         * @param localDisksTotalSizeInGbs The aggregate size of all local disks, in gigabytes.
         * 
         * @return builder
         * 
         */
        public Builder localDisksTotalSizeInGbs(@Nullable Output<Double> localDisksTotalSizeInGbs) {
            $.localDisksTotalSizeInGbs = localDisksTotalSizeInGbs;
            return this;
        }

        /**
         * @param localDisksTotalSizeInGbs The aggregate size of all local disks, in gigabytes.
         * 
         * @return builder
         * 
         */
        public Builder localDisksTotalSizeInGbs(Double localDisksTotalSizeInGbs) {
            return localDisksTotalSizeInGbs(Output.of(localDisksTotalSizeInGbs));
        }

        /**
         * @param maxVnicAttachments The maximum number of VNIC attachments for the instance.
         * 
         * @return builder
         * 
         */
        public Builder maxVnicAttachments(@Nullable Output<Integer> maxVnicAttachments) {
            $.maxVnicAttachments = maxVnicAttachments;
            return this;
        }

        /**
         * @param maxVnicAttachments The maximum number of VNIC attachments for the instance.
         * 
         * @return builder
         * 
         */
        public Builder maxVnicAttachments(Integer maxVnicAttachments) {
            return maxVnicAttachments(Output.of(maxVnicAttachments));
        }

        /**
         * @param memoryInGbs (Updatable) The total amount of memory available to the instance, in gigabytes.
         * 
         * @return builder
         * 
         */
        public Builder memoryInGbs(@Nullable Output<Double> memoryInGbs) {
            $.memoryInGbs = memoryInGbs;
            return this;
        }

        /**
         * @param memoryInGbs (Updatable) The total amount of memory available to the instance, in gigabytes.
         * 
         * @return builder
         * 
         */
        public Builder memoryInGbs(Double memoryInGbs) {
            return memoryInGbs(Output.of(memoryInGbs));
        }

        /**
         * @param networkingBandwidthInGbps The networking bandwidth available to the instance, in gigabits per second.
         * 
         * @return builder
         * 
         */
        public Builder networkingBandwidthInGbps(@Nullable Output<Double> networkingBandwidthInGbps) {
            $.networkingBandwidthInGbps = networkingBandwidthInGbps;
            return this;
        }

        /**
         * @param networkingBandwidthInGbps The networking bandwidth available to the instance, in gigabits per second.
         * 
         * @return builder
         * 
         */
        public Builder networkingBandwidthInGbps(Double networkingBandwidthInGbps) {
            return networkingBandwidthInGbps(Output.of(networkingBandwidthInGbps));
        }

        /**
         * @param ocpus (Updatable) The total number of OCPUs available to the instance.
         * 
         * @return builder
         * 
         */
        public Builder ocpus(@Nullable Output<Double> ocpus) {
            $.ocpus = ocpus;
            return this;
        }

        /**
         * @param ocpus (Updatable) The total number of OCPUs available to the instance.
         * 
         * @return builder
         * 
         */
        public Builder ocpus(Double ocpus) {
            return ocpus(Output.of(ocpus));
        }

        /**
         * @param processorDescription A short description of the instance&#39;s processor (CPU).
         * 
         * @return builder
         * 
         */
        public Builder processorDescription(@Nullable Output<String> processorDescription) {
            $.processorDescription = processorDescription;
            return this;
        }

        /**
         * @param processorDescription A short description of the instance&#39;s processor (CPU).
         * 
         * @return builder
         * 
         */
        public Builder processorDescription(String processorDescription) {
            return processorDescription(Output.of(processorDescription));
        }

        public InstanceShapeConfigArgs build() {
            return $;
        }
    }

}
