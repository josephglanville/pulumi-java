// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for resources used by Airflow web server.
 * 
 */
public final class WebServerResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebServerResourceArgs Empty = new WebServerResourceArgs();

    /**
     * Optional. CPU request and limit for Airflow web server.
     * 
     */
    @Import(name="cpu")
      private final @Nullable Output<Double> cpu;

    public Output<Double> getCpu() {
        return this.cpu == null ? Output.empty() : this.cpu;
    }

    /**
     * Optional. Memory (GB) request and limit for Airflow web server.
     * 
     */
    @Import(name="memoryGb")
      private final @Nullable Output<Double> memoryGb;

    public Output<Double> getMemoryGb() {
        return this.memoryGb == null ? Output.empty() : this.memoryGb;
    }

    /**
     * Optional. Storage (GB) request and limit for Airflow web server.
     * 
     */
    @Import(name="storageGb")
      private final @Nullable Output<Double> storageGb;

    public Output<Double> getStorageGb() {
        return this.storageGb == null ? Output.empty() : this.storageGb;
    }

    public WebServerResourceArgs(
        @Nullable Output<Double> cpu,
        @Nullable Output<Double> memoryGb,
        @Nullable Output<Double> storageGb) {
        this.cpu = cpu;
        this.memoryGb = memoryGb;
        this.storageGb = storageGb;
    }

    private WebServerResourceArgs() {
        this.cpu = Output.empty();
        this.memoryGb = Output.empty();
        this.storageGb = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebServerResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> cpu;
        private @Nullable Output<Double> memoryGb;
        private @Nullable Output<Double> storageGb;

        public Builder() {
    	      // Empty
        }

        public Builder(WebServerResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.memoryGb = defaults.memoryGb;
    	      this.storageGb = defaults.storageGb;
        }

        public Builder cpu(@Nullable Output<Double> cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder cpu(@Nullable Double cpu) {
            this.cpu = Output.ofNullable(cpu);
            return this;
        }
        public Builder memoryGb(@Nullable Output<Double> memoryGb) {
            this.memoryGb = memoryGb;
            return this;
        }
        public Builder memoryGb(@Nullable Double memoryGb) {
            this.memoryGb = Output.ofNullable(memoryGb);
            return this;
        }
        public Builder storageGb(@Nullable Output<Double> storageGb) {
            this.storageGb = storageGb;
            return this;
        }
        public Builder storageGb(@Nullable Double storageGb) {
            this.storageGb = Output.ofNullable(storageGb);
            return this;
        }        public WebServerResourceArgs build() {
            return new WebServerResourceArgs(cpu, memoryGb, storageGb);
        }
    }
}
