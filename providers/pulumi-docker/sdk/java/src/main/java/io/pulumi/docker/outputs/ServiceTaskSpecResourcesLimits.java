// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTaskSpecResourcesLimits {
    private final @Nullable Integer memoryBytes;
    private final @Nullable Integer nanoCpus;

    @CustomType.Constructor
    private ServiceTaskSpecResourcesLimits(
        @CustomType.Parameter("memoryBytes") @Nullable Integer memoryBytes,
        @CustomType.Parameter("nanoCpus") @Nullable Integer nanoCpus) {
        this.memoryBytes = memoryBytes;
        this.nanoCpus = nanoCpus;
    }

    public Optional<Integer> getMemoryBytes() {
        return Optional.ofNullable(this.memoryBytes);
    }
    public Optional<Integer> getNanoCpus() {
        return Optional.ofNullable(this.nanoCpus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecResourcesLimits defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer memoryBytes;
        private @Nullable Integer nanoCpus;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecResourcesLimits defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memoryBytes = defaults.memoryBytes;
    	      this.nanoCpus = defaults.nanoCpus;
        }

        public Builder memoryBytes(@Nullable Integer memoryBytes) {
            this.memoryBytes = memoryBytes;
            return this;
        }
        public Builder nanoCpus(@Nullable Integer nanoCpus) {
            this.nanoCpus = nanoCpus;
            return this;
        }        public ServiceTaskSpecResourcesLimits build() {
            return new ServiceTaskSpecResourcesLimits(memoryBytes, nanoCpus);
        }
    }
}
