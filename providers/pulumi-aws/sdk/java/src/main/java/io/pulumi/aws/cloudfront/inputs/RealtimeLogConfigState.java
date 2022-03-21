// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.RealtimeLogConfigEndpointGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RealtimeLogConfigState extends io.pulumi.resources.ResourceArgs {

    public static final RealtimeLogConfigState Empty = new RealtimeLogConfigState();

    /**
     * The ARN (Amazon Resource Name) of the CloudFront real-time log configuration.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The Amazon Kinesis data streams where real-time log data is sent.
     * 
     */
    @Import(name="endpoint")
      private final @Nullable Output<RealtimeLogConfigEndpointGetArgs> endpoint;

    public Output<RealtimeLogConfigEndpointGetArgs> getEndpoint() {
        return this.endpoint == null ? Output.empty() : this.endpoint;
    }

    /**
     * The fields that are included in each real-time log record. See the [AWS documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields) for supported values.
     * 
     */
    @Import(name="fields")
      private final @Nullable Output<List<String>> fields;

    public Output<List<String>> getFields() {
        return this.fields == null ? Output.empty() : this.fields;
    }

    /**
     * The unique name to identify this real-time log configuration.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The sampling rate for this real-time log configuration. The sampling rate determines the percentage of viewer requests that are represented in the real-time log data. An integer between `1` and `100`, inclusive.
     * 
     */
    @Import(name="samplingRate")
      private final @Nullable Output<Integer> samplingRate;

    public Output<Integer> getSamplingRate() {
        return this.samplingRate == null ? Output.empty() : this.samplingRate;
    }

    public RealtimeLogConfigState(
        @Nullable Output<String> arn,
        @Nullable Output<RealtimeLogConfigEndpointGetArgs> endpoint,
        @Nullable Output<List<String>> fields,
        @Nullable Output<String> name,
        @Nullable Output<Integer> samplingRate) {
        this.arn = arn;
        this.endpoint = endpoint;
        this.fields = fields;
        this.name = name;
        this.samplingRate = samplingRate;
    }

    private RealtimeLogConfigState() {
        this.arn = Output.empty();
        this.endpoint = Output.empty();
        this.fields = Output.empty();
        this.name = Output.empty();
        this.samplingRate = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RealtimeLogConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<RealtimeLogConfigEndpointGetArgs> endpoint;
        private @Nullable Output<List<String>> fields;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> samplingRate;

        public Builder() {
    	      // Empty
        }

        public Builder(RealtimeLogConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.endpoint = defaults.endpoint;
    	      this.fields = defaults.fields;
    	      this.name = defaults.name;
    	      this.samplingRate = defaults.samplingRate;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder endpoint(@Nullable Output<RealtimeLogConfigEndpointGetArgs> endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public Builder endpoint(@Nullable RealtimeLogConfigEndpointGetArgs endpoint) {
            this.endpoint = Output.ofNullable(endpoint);
            return this;
        }
        public Builder fields(@Nullable Output<List<String>> fields) {
            this.fields = fields;
            return this;
        }
        public Builder fields(@Nullable List<String> fields) {
            this.fields = Output.ofNullable(fields);
            return this;
        }
        public Builder fields(String... fields) {
            return fields(List.of(fields));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder samplingRate(@Nullable Output<Integer> samplingRate) {
            this.samplingRate = samplingRate;
            return this;
        }
        public Builder samplingRate(@Nullable Integer samplingRate) {
            this.samplingRate = Output.ofNullable(samplingRate);
            return this;
        }        public RealtimeLogConfigState build() {
            return new RealtimeLogConfigState(arn, endpoint, fields, name, samplingRate);
        }
    }
}
