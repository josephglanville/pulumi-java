// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleS3OutputArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The output object for a monitoring job.
 * 
 */
public final class MonitoringScheduleMonitoringOutputArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringScheduleMonitoringOutputArgs Empty = new MonitoringScheduleMonitoringOutputArgs();

    @Import(name="s3Output", required=true)
      private final Output<MonitoringScheduleS3OutputArgs> s3Output;

    public Output<MonitoringScheduleS3OutputArgs> getS3Output() {
        return this.s3Output;
    }

    public MonitoringScheduleMonitoringOutputArgs(Output<MonitoringScheduleS3OutputArgs> s3Output) {
        this.s3Output = Objects.requireNonNull(s3Output, "expected parameter 's3Output' to be non-null");
    }

    private MonitoringScheduleMonitoringOutputArgs() {
        this.s3Output = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleMonitoringOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<MonitoringScheduleS3OutputArgs> s3Output;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleMonitoringOutputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Output = defaults.s3Output;
        }

        public Builder s3Output(Output<MonitoringScheduleS3OutputArgs> s3Output) {
            this.s3Output = Objects.requireNonNull(s3Output);
            return this;
        }
        public Builder s3Output(MonitoringScheduleS3OutputArgs s3Output) {
            this.s3Output = Output.of(Objects.requireNonNull(s3Output));
            return this;
        }        public MonitoringScheduleMonitoringOutputArgs build() {
            return new MonitoringScheduleMonitoringOutputArgs(s3Output);
        }
    }
}
