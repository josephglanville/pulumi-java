// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionBackendServiceFailoverPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionBackendServiceFailoverPolicyGetArgs Empty = new RegionBackendServiceFailoverPolicyGetArgs();

    /**
     * On failover or failback, this field indicates whether connection drain
     * will be honored. Setting this to true has the following effect: connections
     * to the old active pool are not drained. Connections to the new active pool
     * use the timeout of 10 min (currently fixed). Setting to false has the
     * following effect: both old and new connections will have a drain timeout
     * of 10 min.
     * This can be set to true only if the protocol is TCP.
     * The default is false.
     * 
     */
    @Import(name="disableConnectionDrainOnFailover")
      private final @Nullable Output<Boolean> disableConnectionDrainOnFailover;

    public Output<Boolean> getDisableConnectionDrainOnFailover() {
        return this.disableConnectionDrainOnFailover == null ? Output.empty() : this.disableConnectionDrainOnFailover;
    }

    /**
     * This option is used only when no healthy VMs are detected in the primary
     * and backup instance groups. When set to true, traffic is dropped. When
     * set to false, new connections are sent across all VMs in the primary group.
     * The default is false.
     * 
     */
    @Import(name="dropTrafficIfUnhealthy")
      private final @Nullable Output<Boolean> dropTrafficIfUnhealthy;

    public Output<Boolean> getDropTrafficIfUnhealthy() {
        return this.dropTrafficIfUnhealthy == null ? Output.empty() : this.dropTrafficIfUnhealthy;
    }

    /**
     * The value of the field must be in [0, 1]. If the ratio of the healthy
     * VMs in the primary backend is at or below this number, traffic arriving
     * at the load-balanced IP will be directed to the failover backend.
     * In case where 'failoverRatio' is not set or all the VMs in the backup
     * backend are unhealthy, the traffic will be directed back to the primary
     * backend in the "force" mode, where traffic will be spread to the healthy
     * VMs with the best effort, or to all VMs when no VM is healthy.
     * This field is only used with l4 load balancing.
     * 
     */
    @Import(name="failoverRatio")
      private final @Nullable Output<Double> failoverRatio;

    public Output<Double> getFailoverRatio() {
        return this.failoverRatio == null ? Output.empty() : this.failoverRatio;
    }

    public RegionBackendServiceFailoverPolicyGetArgs(
        @Nullable Output<Boolean> disableConnectionDrainOnFailover,
        @Nullable Output<Boolean> dropTrafficIfUnhealthy,
        @Nullable Output<Double> failoverRatio) {
        this.disableConnectionDrainOnFailover = disableConnectionDrainOnFailover;
        this.dropTrafficIfUnhealthy = dropTrafficIfUnhealthy;
        this.failoverRatio = failoverRatio;
    }

    private RegionBackendServiceFailoverPolicyGetArgs() {
        this.disableConnectionDrainOnFailover = Output.empty();
        this.dropTrafficIfUnhealthy = Output.empty();
        this.failoverRatio = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceFailoverPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> disableConnectionDrainOnFailover;
        private @Nullable Output<Boolean> dropTrafficIfUnhealthy;
        private @Nullable Output<Double> failoverRatio;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceFailoverPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableConnectionDrainOnFailover = defaults.disableConnectionDrainOnFailover;
    	      this.dropTrafficIfUnhealthy = defaults.dropTrafficIfUnhealthy;
    	      this.failoverRatio = defaults.failoverRatio;
        }

        public Builder disableConnectionDrainOnFailover(@Nullable Output<Boolean> disableConnectionDrainOnFailover) {
            this.disableConnectionDrainOnFailover = disableConnectionDrainOnFailover;
            return this;
        }
        public Builder disableConnectionDrainOnFailover(@Nullable Boolean disableConnectionDrainOnFailover) {
            this.disableConnectionDrainOnFailover = Output.ofNullable(disableConnectionDrainOnFailover);
            return this;
        }
        public Builder dropTrafficIfUnhealthy(@Nullable Output<Boolean> dropTrafficIfUnhealthy) {
            this.dropTrafficIfUnhealthy = dropTrafficIfUnhealthy;
            return this;
        }
        public Builder dropTrafficIfUnhealthy(@Nullable Boolean dropTrafficIfUnhealthy) {
            this.dropTrafficIfUnhealthy = Output.ofNullable(dropTrafficIfUnhealthy);
            return this;
        }
        public Builder failoverRatio(@Nullable Output<Double> failoverRatio) {
            this.failoverRatio = failoverRatio;
            return this;
        }
        public Builder failoverRatio(@Nullable Double failoverRatio) {
            this.failoverRatio = Output.ofNullable(failoverRatio);
            return this;
        }        public RegionBackendServiceFailoverPolicyGetArgs build() {
            return new RegionBackendServiceFailoverPolicyGetArgs(disableConnectionDrainOnFailover, dropTrafficIfUnhealthy, failoverRatio);
        }
    }
}
