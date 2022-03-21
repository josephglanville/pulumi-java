// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.appengine.outputs.FlexibleAppVersionResourcesVolume;
import java.lang.Double;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlexibleAppVersionResources {
    /**
     * Number of CPU cores needed.
     * 
     */
    private final @Nullable Integer cpu;
    /**
     * Disk size (GB) needed.
     * 
     */
    private final @Nullable Integer diskGb;
    /**
     * Memory (GB) needed.
     * 
     */
    private final @Nullable Double memoryGb;
    /**
     * List of ports, or port pairs, to forward from the virtual machine to the application container.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<FlexibleAppVersionResourcesVolume> volumes;

    @CustomType.Constructor
    private FlexibleAppVersionResources(
        @CustomType.Parameter("cpu") @Nullable Integer cpu,
        @CustomType.Parameter("diskGb") @Nullable Integer diskGb,
        @CustomType.Parameter("memoryGb") @Nullable Double memoryGb,
        @CustomType.Parameter("volumes") @Nullable List<FlexibleAppVersionResourcesVolume> volumes) {
        this.cpu = cpu;
        this.diskGb = diskGb;
        this.memoryGb = memoryGb;
        this.volumes = volumes;
    }

    /**
     * Number of CPU cores needed.
     * 
    */
    public Optional<Integer> getCpu() {
        return Optional.ofNullable(this.cpu);
    }
    /**
     * Disk size (GB) needed.
     * 
    */
    public Optional<Integer> getDiskGb() {
        return Optional.ofNullable(this.diskGb);
    }
    /**
     * Memory (GB) needed.
     * 
    */
    public Optional<Double> getMemoryGb() {
        return Optional.ofNullable(this.memoryGb);
    }
    /**
     * List of ports, or port pairs, to forward from the virtual machine to the application container.
     * Structure is documented below.
     * 
    */
    public List<FlexibleAppVersionResourcesVolume> getVolumes() {
        return this.volumes == null ? List.of() : this.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionResources defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer cpu;
        private @Nullable Integer diskGb;
        private @Nullable Double memoryGb;
        private @Nullable List<FlexibleAppVersionResourcesVolume> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionResources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.diskGb = defaults.diskGb;
    	      this.memoryGb = defaults.memoryGb;
    	      this.volumes = defaults.volumes;
        }

        public Builder cpu(@Nullable Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder diskGb(@Nullable Integer diskGb) {
            this.diskGb = diskGb;
            return this;
        }
        public Builder memoryGb(@Nullable Double memoryGb) {
            this.memoryGb = memoryGb;
            return this;
        }
        public Builder volumes(@Nullable List<FlexibleAppVersionResourcesVolume> volumes) {
            this.volumes = volumes;
            return this;
        }
        public Builder volumes(FlexibleAppVersionResourcesVolume... volumes) {
            return volumes(List.of(volumes));
        }        public FlexibleAppVersionResources build() {
            return new FlexibleAppVersionResources(cpu, diskGb, memoryGb, volumes);
        }
    }
}
