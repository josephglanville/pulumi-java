// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DomainEbsOptions {
    /**
     * Whether EBS volumes are attached to data nodes in the domain.
     * 
     */
    private final Boolean ebsEnabled;
    /**
     * Baseline input/output (I/O) performance of EBS volumes attached to data nodes. Applicable only for the Provisioned IOPS EBS volume type.
     * 
     */
    private final @Nullable Integer iops;
    /**
     * Size of EBS volumes attached to data nodes (in GiB).
     * 
     */
    private final @Nullable Integer volumeSize;
    /**
     * Type of EBS volumes attached to data nodes.
     * 
     */
    private final @Nullable String volumeType;

    @OutputCustomType.Constructor
    private DomainEbsOptions(
        @OutputCustomType.Parameter("ebsEnabled") Boolean ebsEnabled,
        @OutputCustomType.Parameter("iops") @Nullable Integer iops,
        @OutputCustomType.Parameter("volumeSize") @Nullable Integer volumeSize,
        @OutputCustomType.Parameter("volumeType") @Nullable String volumeType) {
        this.ebsEnabled = ebsEnabled;
        this.iops = iops;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    /**
     * Whether EBS volumes are attached to data nodes in the domain.
     * 
    */
    public Boolean getEbsEnabled() {
        return this.ebsEnabled;
    }
    /**
     * Baseline input/output (I/O) performance of EBS volumes attached to data nodes. Applicable only for the Provisioned IOPS EBS volume type.
     * 
    */
    public Optional<Integer> getIops() {
        return Optional.ofNullable(this.iops);
    }
    /**
     * Size of EBS volumes attached to data nodes (in GiB).
     * 
    */
    public Optional<Integer> getVolumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }
    /**
     * Type of EBS volumes attached to data nodes.
     * 
    */
    public Optional<String> getVolumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainEbsOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean ebsEnabled;
        private @Nullable Integer iops;
        private @Nullable Integer volumeSize;
        private @Nullable String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainEbsOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ebsEnabled = defaults.ebsEnabled;
    	      this.iops = defaults.iops;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setEbsEnabled(Boolean ebsEnabled) {
            this.ebsEnabled = Objects.requireNonNull(ebsEnabled);
            return this;
        }

        public Builder setIops(@Nullable Integer iops) {
            this.iops = iops;
            return this;
        }

        public Builder setVolumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }

        public Builder setVolumeType(@Nullable String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public DomainEbsOptions build() {
            return new DomainEbsOptions(ebsEnabled, iops, volumeSize, volumeType);
        }
    }
}
