// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The baseline constraints resource for a monitoring job.
 * 
 */
public final class MonitoringScheduleConstraintsResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringScheduleConstraintsResourceArgs Empty = new MonitoringScheduleConstraintsResourceArgs();

    /**
     * The Amazon S3 URI for baseline constraint file in Amazon S3 that the current monitoring job should validated against.
     * 
     */
    @Import(name="s3Uri")
      private final @Nullable Output<String> s3Uri;

    public Output<String> getS3Uri() {
        return this.s3Uri == null ? Output.empty() : this.s3Uri;
    }

    public MonitoringScheduleConstraintsResourceArgs(@Nullable Output<String> s3Uri) {
        this.s3Uri = s3Uri;
    }

    private MonitoringScheduleConstraintsResourceArgs() {
        this.s3Uri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleConstraintsResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> s3Uri;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleConstraintsResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Uri = defaults.s3Uri;
        }

        public Builder s3Uri(@Nullable Output<String> s3Uri) {
            this.s3Uri = s3Uri;
            return this;
        }
        public Builder s3Uri(@Nullable String s3Uri) {
            this.s3Uri = Output.ofNullable(s3Uri);
            return this;
        }        public MonitoringScheduleConstraintsResourceArgs build() {
            return new MonitoringScheduleConstraintsResourceArgs(s3Uri);
        }
    }
}
