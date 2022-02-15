// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudtasks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;


public final class QueueStackdriverLoggingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueueStackdriverLoggingConfigArgs Empty = new QueueStackdriverLoggingConfigArgs();

    @InputImport(name="samplingRatio", required=true)
    private final Input<Double> samplingRatio;

    public Input<Double> getSamplingRatio() {
        return this.samplingRatio;
    }

    public QueueStackdriverLoggingConfigArgs(Input<Double> samplingRatio) {
        this.samplingRatio = Objects.requireNonNull(samplingRatio, "expected parameter 'samplingRatio' to be non-null");
    }

    private QueueStackdriverLoggingConfigArgs() {
        this.samplingRatio = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueStackdriverLoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Double> samplingRatio;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueStackdriverLoggingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.samplingRatio = defaults.samplingRatio;
        }

        public Builder setSamplingRatio(Input<Double> samplingRatio) {
            this.samplingRatio = Objects.requireNonNull(samplingRatio);
            return this;
        }

        public Builder setSamplingRatio(Double samplingRatio) {
            this.samplingRatio = Input.of(Objects.requireNonNull(samplingRatio));
            return this;
        }

        public QueueStackdriverLoggingConfigArgs build() {
            return new QueueStackdriverLoggingConfigArgs(samplingRatio);
        }
    }
}