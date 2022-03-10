// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.outputs;

import io.pulumi.aws.ecr.outputs.RegistryScanningConfigurationRuleRepositoryFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RegistryScanningConfigurationRule {
    /**
     * One or more repository filter blocks, containing a `filter` (required string filtering repositories, see pattern regex [here](https://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_ScanningRepositoryFilter.html)) and a `filter_type` (required string, currently only `WILDCARD` is supported).
     * 
     */
    private final List<RegistryScanningConfigurationRuleRepositoryFilter> repositoryFilters;
    /**
     * The frequency that scans are performed at for a private registry. Can be `SCAN_ON_PUSH`, `CONTINUOUS_SCAN`, or `MANUAL`.
     * 
     */
    private final String scanFrequency;

    @OutputCustomType.Constructor
    private RegistryScanningConfigurationRule(
        @OutputCustomType.Parameter("repositoryFilters") List<RegistryScanningConfigurationRuleRepositoryFilter> repositoryFilters,
        @OutputCustomType.Parameter("scanFrequency") String scanFrequency) {
        this.repositoryFilters = repositoryFilters;
        this.scanFrequency = scanFrequency;
    }

    /**
     * One or more repository filter blocks, containing a `filter` (required string filtering repositories, see pattern regex [here](https://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_ScanningRepositoryFilter.html)) and a `filter_type` (required string, currently only `WILDCARD` is supported).
     * 
    */
    public List<RegistryScanningConfigurationRuleRepositoryFilter> getRepositoryFilters() {
        return this.repositoryFilters;
    }
    /**
     * The frequency that scans are performed at for a private registry. Can be `SCAN_ON_PUSH`, `CONTINUOUS_SCAN`, or `MANUAL`.
     * 
    */
    public String getScanFrequency() {
        return this.scanFrequency;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryScanningConfigurationRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RegistryScanningConfigurationRuleRepositoryFilter> repositoryFilters;
        private String scanFrequency;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryScanningConfigurationRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryFilters = defaults.repositoryFilters;
    	      this.scanFrequency = defaults.scanFrequency;
        }

        public Builder setRepositoryFilters(List<RegistryScanningConfigurationRuleRepositoryFilter> repositoryFilters) {
            this.repositoryFilters = Objects.requireNonNull(repositoryFilters);
            return this;
        }

        public Builder setScanFrequency(String scanFrequency) {
            this.scanFrequency = Objects.requireNonNull(scanFrequency);
            return this;
        }
        public RegistryScanningConfigurationRule build() {
            return new RegistryScanningConfigurationRule(repositoryFilters, scanFrequency);
        }
    }
}
