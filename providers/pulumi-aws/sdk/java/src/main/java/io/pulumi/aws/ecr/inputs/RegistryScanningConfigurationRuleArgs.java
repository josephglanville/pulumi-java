// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.inputs;

import io.pulumi.aws.ecr.inputs.RegistryScanningConfigurationRuleRepositoryFilterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RegistryScanningConfigurationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistryScanningConfigurationRuleArgs Empty = new RegistryScanningConfigurationRuleArgs();

    /**
     * One or more repository filter blocks, containing a `filter` (required string filtering repositories, see pattern regex [here](https://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_ScanningRepositoryFilter.html)) and a `filter_type` (required string, currently only `WILDCARD` is supported).
     * 
     */
    @Import(name="repositoryFilters", required=true)
      private final Output<List<RegistryScanningConfigurationRuleRepositoryFilterArgs>> repositoryFilters;

    public Output<List<RegistryScanningConfigurationRuleRepositoryFilterArgs>> getRepositoryFilters() {
        return this.repositoryFilters;
    }

    /**
     * The frequency that scans are performed at for a private registry. Can be `SCAN_ON_PUSH`, `CONTINUOUS_SCAN`, or `MANUAL`.
     * 
     */
    @Import(name="scanFrequency", required=true)
      private final Output<String> scanFrequency;

    public Output<String> getScanFrequency() {
        return this.scanFrequency;
    }

    public RegistryScanningConfigurationRuleArgs(
        Output<List<RegistryScanningConfigurationRuleRepositoryFilterArgs>> repositoryFilters,
        Output<String> scanFrequency) {
        this.repositoryFilters = Objects.requireNonNull(repositoryFilters, "expected parameter 'repositoryFilters' to be non-null");
        this.scanFrequency = Objects.requireNonNull(scanFrequency, "expected parameter 'scanFrequency' to be non-null");
    }

    private RegistryScanningConfigurationRuleArgs() {
        this.repositoryFilters = Output.empty();
        this.scanFrequency = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryScanningConfigurationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<RegistryScanningConfigurationRuleRepositoryFilterArgs>> repositoryFilters;
        private Output<String> scanFrequency;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryScanningConfigurationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryFilters = defaults.repositoryFilters;
    	      this.scanFrequency = defaults.scanFrequency;
        }

        public Builder repositoryFilters(Output<List<RegistryScanningConfigurationRuleRepositoryFilterArgs>> repositoryFilters) {
            this.repositoryFilters = Objects.requireNonNull(repositoryFilters);
            return this;
        }
        public Builder repositoryFilters(List<RegistryScanningConfigurationRuleRepositoryFilterArgs> repositoryFilters) {
            this.repositoryFilters = Output.of(Objects.requireNonNull(repositoryFilters));
            return this;
        }
        public Builder repositoryFilters(RegistryScanningConfigurationRuleRepositoryFilterArgs... repositoryFilters) {
            return repositoryFilters(List.of(repositoryFilters));
        }
        public Builder scanFrequency(Output<String> scanFrequency) {
            this.scanFrequency = Objects.requireNonNull(scanFrequency);
            return this;
        }
        public Builder scanFrequency(String scanFrequency) {
            this.scanFrequency = Output.of(Objects.requireNonNull(scanFrequency));
            return this;
        }        public RegistryScanningConfigurationRuleArgs build() {
            return new RegistryScanningConfigurationRuleArgs(repositoryFilters, scanFrequency);
        }
    }
}