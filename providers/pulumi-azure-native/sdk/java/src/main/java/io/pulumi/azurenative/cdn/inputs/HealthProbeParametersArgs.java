// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.enums.HealthProbeRequestType;
import io.pulumi.azurenative.cdn.enums.ProbeProtocol;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HealthProbeParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final HealthProbeParametersArgs Empty = new HealthProbeParametersArgs();

    @InputImport(name="probeIntervalInSeconds")
    private final @Nullable Input<Integer> probeIntervalInSeconds;

    public Input<Integer> getProbeIntervalInSeconds() {
        return this.probeIntervalInSeconds == null ? Input.empty() : this.probeIntervalInSeconds;
    }

    @InputImport(name="probePath")
    private final @Nullable Input<String> probePath;

    public Input<String> getProbePath() {
        return this.probePath == null ? Input.empty() : this.probePath;
    }

    @InputImport(name="probeProtocol")
    private final @Nullable Input<ProbeProtocol> probeProtocol;

    public Input<ProbeProtocol> getProbeProtocol() {
        return this.probeProtocol == null ? Input.empty() : this.probeProtocol;
    }

    @InputImport(name="probeRequestType")
    private final @Nullable Input<HealthProbeRequestType> probeRequestType;

    public Input<HealthProbeRequestType> getProbeRequestType() {
        return this.probeRequestType == null ? Input.empty() : this.probeRequestType;
    }

    public HealthProbeParametersArgs(
        @Nullable Input<Integer> probeIntervalInSeconds,
        @Nullable Input<String> probePath,
        @Nullable Input<ProbeProtocol> probeProtocol,
        @Nullable Input<HealthProbeRequestType> probeRequestType) {
        this.probeIntervalInSeconds = probeIntervalInSeconds;
        this.probePath = probePath;
        this.probeProtocol = probeProtocol;
        this.probeRequestType = probeRequestType;
    }

    private HealthProbeParametersArgs() {
        this.probeIntervalInSeconds = Input.empty();
        this.probePath = Input.empty();
        this.probeProtocol = Input.empty();
        this.probeRequestType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthProbeParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> probeIntervalInSeconds;
        private @Nullable Input<String> probePath;
        private @Nullable Input<ProbeProtocol> probeProtocol;
        private @Nullable Input<HealthProbeRequestType> probeRequestType;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthProbeParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.probeIntervalInSeconds = defaults.probeIntervalInSeconds;
    	      this.probePath = defaults.probePath;
    	      this.probeProtocol = defaults.probeProtocol;
    	      this.probeRequestType = defaults.probeRequestType;
        }

        public Builder setProbeIntervalInSeconds(@Nullable Input<Integer> probeIntervalInSeconds) {
            this.probeIntervalInSeconds = probeIntervalInSeconds;
            return this;
        }

        public Builder setProbeIntervalInSeconds(@Nullable Integer probeIntervalInSeconds) {
            this.probeIntervalInSeconds = Input.ofNullable(probeIntervalInSeconds);
            return this;
        }

        public Builder setProbePath(@Nullable Input<String> probePath) {
            this.probePath = probePath;
            return this;
        }

        public Builder setProbePath(@Nullable String probePath) {
            this.probePath = Input.ofNullable(probePath);
            return this;
        }

        public Builder setProbeProtocol(@Nullable Input<ProbeProtocol> probeProtocol) {
            this.probeProtocol = probeProtocol;
            return this;
        }

        public Builder setProbeProtocol(@Nullable ProbeProtocol probeProtocol) {
            this.probeProtocol = Input.ofNullable(probeProtocol);
            return this;
        }

        public Builder setProbeRequestType(@Nullable Input<HealthProbeRequestType> probeRequestType) {
            this.probeRequestType = probeRequestType;
            return this;
        }

        public Builder setProbeRequestType(@Nullable HealthProbeRequestType probeRequestType) {
            this.probeRequestType = Input.ofNullable(probeRequestType);
            return this;
        }

        public HealthProbeParametersArgs build() {
            return new HealthProbeParametersArgs(probeIntervalInSeconds, probePath, probeProtocol, probeRequestType);
        }
    }
}
