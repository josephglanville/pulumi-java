// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.inputs;

import io.pulumi.azurenative.timeseriesinsights.inputs.IngressEnvironmentStatusResponse;
import io.pulumi.azurenative.timeseriesinsights.inputs.WarmStorageEnvironmentStatusResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * An object that represents the status of the environment, and its internal state in the Time Series Insights service.
 * 
 */
public final class EnvironmentStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final EnvironmentStatusResponse Empty = new EnvironmentStatusResponse();

    /**
     * An object that represents the status of ingress on an environment.
     * 
     */
    @InputImport(name="ingress", required=true)
      private final IngressEnvironmentStatusResponse ingress;

    public IngressEnvironmentStatusResponse getIngress() {
        return this.ingress;
    }

    /**
     * An object that represents the status of warm storage on an environment.
     * 
     */
    @InputImport(name="warmStorage", required=true)
      private final WarmStorageEnvironmentStatusResponse warmStorage;

    public WarmStorageEnvironmentStatusResponse getWarmStorage() {
        return this.warmStorage;
    }

    public EnvironmentStatusResponse(
        IngressEnvironmentStatusResponse ingress,
        WarmStorageEnvironmentStatusResponse warmStorage) {
        this.ingress = Objects.requireNonNull(ingress, "expected parameter 'ingress' to be non-null");
        this.warmStorage = Objects.requireNonNull(warmStorage, "expected parameter 'warmStorage' to be non-null");
    }

    private EnvironmentStatusResponse() {
        this.ingress = null;
        this.warmStorage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IngressEnvironmentStatusResponse ingress;
        private WarmStorageEnvironmentStatusResponse warmStorage;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingress = defaults.ingress;
    	      this.warmStorage = defaults.warmStorage;
        }

        public Builder setIngress(IngressEnvironmentStatusResponse ingress) {
            this.ingress = Objects.requireNonNull(ingress);
            return this;
        }

        public Builder setWarmStorage(WarmStorageEnvironmentStatusResponse warmStorage) {
            this.warmStorage = Objects.requireNonNull(warmStorage);
            return this;
        }
        public EnvironmentStatusResponse build() {
            return new EnvironmentStatusResponse(ingress, warmStorage);
        }
    }
}
