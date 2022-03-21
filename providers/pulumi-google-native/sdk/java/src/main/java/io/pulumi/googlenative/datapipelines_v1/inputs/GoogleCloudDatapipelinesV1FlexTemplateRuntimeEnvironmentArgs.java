// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datapipelines_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datapipelines_v1.enums.GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentFlexrsGoal;
import io.pulumi.googlenative.datapipelines_v1.enums.GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentIpConfiguration;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The environment values to be set at runtime for a Flex Template.
 * 
 */
public final class GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs Empty = new GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs();

    /**
     * Additional experiment flags for the job.
     * 
     */
    @Import(name="additionalExperiments")
      private final @Nullable Output<List<String>> additionalExperiments;

    public Output<List<String>> getAdditionalExperiments() {
        return this.additionalExperiments == null ? Output.empty() : this.additionalExperiments;
    }

    /**
     * Additional user labels to be specified for the job. Keys and values must follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions). An object containing a list of key/value pairs. Example: `{ "name": "wrench", "mass": "1kg", "count": "3" }`.
     * 
     */
    @Import(name="additionalUserLabels")
      private final @Nullable Output<Map<String,String>> additionalUserLabels;

    public Output<Map<String,String>> getAdditionalUserLabels() {
        return this.additionalUserLabels == null ? Output.empty() : this.additionalUserLabels;
    }

    /**
     * Whether to enable Streaming Engine for the job.
     * 
     */
    @Import(name="enableStreamingEngine")
      private final @Nullable Output<Boolean> enableStreamingEngine;

    public Output<Boolean> getEnableStreamingEngine() {
        return this.enableStreamingEngine == null ? Output.empty() : this.enableStreamingEngine;
    }

    /**
     * Set FlexRS goal for the job. https://cloud.google.com/dataflow/docs/guides/flexrs
     * 
     */
    @Import(name="flexrsGoal")
      private final @Nullable Output<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentFlexrsGoal> flexrsGoal;

    public Output<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentFlexrsGoal> getFlexrsGoal() {
        return this.flexrsGoal == null ? Output.empty() : this.flexrsGoal;
    }

    /**
     * Configuration for VM IPs.
     * 
     */
    @Import(name="ipConfiguration")
      private final @Nullable Output<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentIpConfiguration> ipConfiguration;

    public Output<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentIpConfiguration> getIpConfiguration() {
        return this.ipConfiguration == null ? Output.empty() : this.ipConfiguration;
    }

    /**
     * Name for the Cloud KMS key for the job. Key format is: projects//locations//keyRings//cryptoKeys/
     * 
     */
    @Import(name="kmsKeyName")
      private final @Nullable Output<String> kmsKeyName;

    public Output<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Output.empty() : this.kmsKeyName;
    }

    /**
     * The machine type to use for the job. Defaults to the value from the template if not specified.
     * 
     */
    @Import(name="machineType")
      private final @Nullable Output<String> machineType;

    public Output<String> getMachineType() {
        return this.machineType == null ? Output.empty() : this.machineType;
    }

    /**
     * The maximum number of Compute Engine instances to be made available to your pipeline during execution, from 1 to 1000.
     * 
     */
    @Import(name="maxWorkers")
      private final @Nullable Output<Integer> maxWorkers;

    public Output<Integer> getMaxWorkers() {
        return this.maxWorkers == null ? Output.empty() : this.maxWorkers;
    }

    /**
     * Network to which VMs will be assigned. If empty or unspecified, the service will use the network "default".
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
    }

    /**
     * The initial number of Compute Engine instances for the job.
     * 
     */
    @Import(name="numWorkers")
      private final @Nullable Output<Integer> numWorkers;

    public Output<Integer> getNumWorkers() {
        return this.numWorkers == null ? Output.empty() : this.numWorkers;
    }

    /**
     * The email address of the service account to run the job as.
     * 
     */
    @Import(name="serviceAccountEmail")
      private final @Nullable Output<String> serviceAccountEmail;

    public Output<String> getServiceAccountEmail() {
        return this.serviceAccountEmail == null ? Output.empty() : this.serviceAccountEmail;
    }

    /**
     * Subnetwork to which VMs will be assigned, if desired. You can specify a subnetwork using either a complete URL or an abbreviated path. Expected to be of the form "https://www.googleapis.com/compute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK" or "regions/REGION/subnetworks/SUBNETWORK". If the subnetwork is located in a Shared VPC network, you must use the complete URL.
     * 
     */
    @Import(name="subnetwork")
      private final @Nullable Output<String> subnetwork;

    public Output<String> getSubnetwork() {
        return this.subnetwork == null ? Output.empty() : this.subnetwork;
    }

    /**
     * The Cloud Storage path to use for temporary files. Must be a valid Cloud Storage URL, beginning with `gs://`.
     * 
     */
    @Import(name="tempLocation")
      private final @Nullable Output<String> tempLocation;

    public Output<String> getTempLocation() {
        return this.tempLocation == null ? Output.empty() : this.tempLocation;
    }

    /**
     * The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1". Mutually exclusive with worker_zone. If neither worker_region nor worker_zone is specified, defaults to the control plane region.
     * 
     */
    @Import(name="workerRegion")
      private final @Nullable Output<String> workerRegion;

    public Output<String> getWorkerRegion() {
        return this.workerRegion == null ? Output.empty() : this.workerRegion;
    }

    /**
     * The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1-a". Mutually exclusive with worker_region. If neither worker_region nor worker_zone is specified, a zone in the control plane region is chosen based on available capacity. If both `worker_zone` and `zone` are set, `worker_zone` takes precedence.
     * 
     */
    @Import(name="workerZone")
      private final @Nullable Output<String> workerZone;

    public Output<String> getWorkerZone() {
        return this.workerZone == null ? Output.empty() : this.workerZone;
    }

    /**
     * The Compute Engine [availability zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones) for launching worker instances to run your pipeline. In the future, worker_zone will take precedence.
     * 
     */
    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> getZone() {
        return this.zone == null ? Output.empty() : this.zone;
    }

    public GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs(
        @Nullable Output<List<String>> additionalExperiments,
        @Nullable Output<Map<String,String>> additionalUserLabels,
        @Nullable Output<Boolean> enableStreamingEngine,
        @Nullable Output<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentFlexrsGoal> flexrsGoal,
        @Nullable Output<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentIpConfiguration> ipConfiguration,
        @Nullable Output<String> kmsKeyName,
        @Nullable Output<String> machineType,
        @Nullable Output<Integer> maxWorkers,
        @Nullable Output<String> network,
        @Nullable Output<Integer> numWorkers,
        @Nullable Output<String> serviceAccountEmail,
        @Nullable Output<String> subnetwork,
        @Nullable Output<String> tempLocation,
        @Nullable Output<String> workerRegion,
        @Nullable Output<String> workerZone,
        @Nullable Output<String> zone) {
        this.additionalExperiments = additionalExperiments;
        this.additionalUserLabels = additionalUserLabels;
        this.enableStreamingEngine = enableStreamingEngine;
        this.flexrsGoal = flexrsGoal;
        this.ipConfiguration = ipConfiguration;
        this.kmsKeyName = kmsKeyName;
        this.machineType = machineType;
        this.maxWorkers = maxWorkers;
        this.network = network;
        this.numWorkers = numWorkers;
        this.serviceAccountEmail = serviceAccountEmail;
        this.subnetwork = subnetwork;
        this.tempLocation = tempLocation;
        this.workerRegion = workerRegion;
        this.workerZone = workerZone;
        this.zone = zone;
    }

    private GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs() {
        this.additionalExperiments = Output.empty();
        this.additionalUserLabels = Output.empty();
        this.enableStreamingEngine = Output.empty();
        this.flexrsGoal = Output.empty();
        this.ipConfiguration = Output.empty();
        this.kmsKeyName = Output.empty();
        this.machineType = Output.empty();
        this.maxWorkers = Output.empty();
        this.network = Output.empty();
        this.numWorkers = Output.empty();
        this.serviceAccountEmail = Output.empty();
        this.subnetwork = Output.empty();
        this.tempLocation = Output.empty();
        this.workerRegion = Output.empty();
        this.workerZone = Output.empty();
        this.zone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> additionalExperiments;
        private @Nullable Output<Map<String,String>> additionalUserLabels;
        private @Nullable Output<Boolean> enableStreamingEngine;
        private @Nullable Output<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentFlexrsGoal> flexrsGoal;
        private @Nullable Output<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentIpConfiguration> ipConfiguration;
        private @Nullable Output<String> kmsKeyName;
        private @Nullable Output<String> machineType;
        private @Nullable Output<Integer> maxWorkers;
        private @Nullable Output<String> network;
        private @Nullable Output<Integer> numWorkers;
        private @Nullable Output<String> serviceAccountEmail;
        private @Nullable Output<String> subnetwork;
        private @Nullable Output<String> tempLocation;
        private @Nullable Output<String> workerRegion;
        private @Nullable Output<String> workerZone;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExperiments = defaults.additionalExperiments;
    	      this.additionalUserLabels = defaults.additionalUserLabels;
    	      this.enableStreamingEngine = defaults.enableStreamingEngine;
    	      this.flexrsGoal = defaults.flexrsGoal;
    	      this.ipConfiguration = defaults.ipConfiguration;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.machineType = defaults.machineType;
    	      this.maxWorkers = defaults.maxWorkers;
    	      this.network = defaults.network;
    	      this.numWorkers = defaults.numWorkers;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.subnetwork = defaults.subnetwork;
    	      this.tempLocation = defaults.tempLocation;
    	      this.workerRegion = defaults.workerRegion;
    	      this.workerZone = defaults.workerZone;
    	      this.zone = defaults.zone;
        }

        public Builder additionalExperiments(@Nullable Output<List<String>> additionalExperiments) {
            this.additionalExperiments = additionalExperiments;
            return this;
        }
        public Builder additionalExperiments(@Nullable List<String> additionalExperiments) {
            this.additionalExperiments = Output.ofNullable(additionalExperiments);
            return this;
        }
        public Builder additionalExperiments(String... additionalExperiments) {
            return additionalExperiments(List.of(additionalExperiments));
        }
        public Builder additionalUserLabels(@Nullable Output<Map<String,String>> additionalUserLabels) {
            this.additionalUserLabels = additionalUserLabels;
            return this;
        }
        public Builder additionalUserLabels(@Nullable Map<String,String> additionalUserLabels) {
            this.additionalUserLabels = Output.ofNullable(additionalUserLabels);
            return this;
        }
        public Builder enableStreamingEngine(@Nullable Output<Boolean> enableStreamingEngine) {
            this.enableStreamingEngine = enableStreamingEngine;
            return this;
        }
        public Builder enableStreamingEngine(@Nullable Boolean enableStreamingEngine) {
            this.enableStreamingEngine = Output.ofNullable(enableStreamingEngine);
            return this;
        }
        public Builder flexrsGoal(@Nullable Output<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentFlexrsGoal> flexrsGoal) {
            this.flexrsGoal = flexrsGoal;
            return this;
        }
        public Builder flexrsGoal(@Nullable GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentFlexrsGoal flexrsGoal) {
            this.flexrsGoal = Output.ofNullable(flexrsGoal);
            return this;
        }
        public Builder ipConfiguration(@Nullable Output<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentIpConfiguration> ipConfiguration) {
            this.ipConfiguration = ipConfiguration;
            return this;
        }
        public Builder ipConfiguration(@Nullable GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentIpConfiguration ipConfiguration) {
            this.ipConfiguration = Output.ofNullable(ipConfiguration);
            return this;
        }
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }
        public Builder kmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Output.ofNullable(kmsKeyName);
            return this;
        }
        public Builder machineType(@Nullable Output<String> machineType) {
            this.machineType = machineType;
            return this;
        }
        public Builder machineType(@Nullable String machineType) {
            this.machineType = Output.ofNullable(machineType);
            return this;
        }
        public Builder maxWorkers(@Nullable Output<Integer> maxWorkers) {
            this.maxWorkers = maxWorkers;
            return this;
        }
        public Builder maxWorkers(@Nullable Integer maxWorkers) {
            this.maxWorkers = Output.ofNullable(maxWorkers);
            return this;
        }
        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Output.ofNullable(network);
            return this;
        }
        public Builder numWorkers(@Nullable Output<Integer> numWorkers) {
            this.numWorkers = numWorkers;
            return this;
        }
        public Builder numWorkers(@Nullable Integer numWorkers) {
            this.numWorkers = Output.ofNullable(numWorkers);
            return this;
        }
        public Builder serviceAccountEmail(@Nullable Output<String> serviceAccountEmail) {
            this.serviceAccountEmail = serviceAccountEmail;
            return this;
        }
        public Builder serviceAccountEmail(@Nullable String serviceAccountEmail) {
            this.serviceAccountEmail = Output.ofNullable(serviceAccountEmail);
            return this;
        }
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }
        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = Output.ofNullable(subnetwork);
            return this;
        }
        public Builder tempLocation(@Nullable Output<String> tempLocation) {
            this.tempLocation = tempLocation;
            return this;
        }
        public Builder tempLocation(@Nullable String tempLocation) {
            this.tempLocation = Output.ofNullable(tempLocation);
            return this;
        }
        public Builder workerRegion(@Nullable Output<String> workerRegion) {
            this.workerRegion = workerRegion;
            return this;
        }
        public Builder workerRegion(@Nullable String workerRegion) {
            this.workerRegion = Output.ofNullable(workerRegion);
            return this;
        }
        public Builder workerZone(@Nullable Output<String> workerZone) {
            this.workerZone = workerZone;
            return this;
        }
        public Builder workerZone(@Nullable String workerZone) {
            this.workerZone = Output.ofNullable(workerZone);
            return this;
        }
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Output.ofNullable(zone);
            return this;
        }        public GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs build() {
            return new GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs(additionalExperiments, additionalUserLabels, enableStreamingEngine, flexrsGoal, ipConfiguration, kmsKeyName, machineType, maxWorkers, network, numWorkers, serviceAccountEmail, subnetwork, tempLocation, workerRegion, workerZone, zone);
        }
    }
}
