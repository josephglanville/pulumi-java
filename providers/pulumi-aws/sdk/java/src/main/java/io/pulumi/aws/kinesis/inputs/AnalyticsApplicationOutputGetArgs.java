// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputKinesisFirehoseGetArgs;
import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputKinesisStreamGetArgs;
import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputLambdaGetArgs;
import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputSchemaGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsApplicationOutputGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationOutputGetArgs Empty = new AnalyticsApplicationOutputGetArgs();

    /**
     * The ARN of the Kinesis Analytics Application.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The Kinesis Firehose configuration for the destination stream. Conflicts with `kinesis_stream`.
     * See Kinesis Firehose below for more details.
     * 
     */
    @Import(name="kinesisFirehose")
      private final @Nullable Output<AnalyticsApplicationOutputKinesisFirehoseGetArgs> kinesisFirehose;

    public Output<AnalyticsApplicationOutputKinesisFirehoseGetArgs> getKinesisFirehose() {
        return this.kinesisFirehose == null ? Output.empty() : this.kinesisFirehose;
    }

    /**
     * The Kinesis Stream configuration for the destination stream. Conflicts with `kinesis_firehose`.
     * See Kinesis Stream below for more details.
     * 
     */
    @Import(name="kinesisStream")
      private final @Nullable Output<AnalyticsApplicationOutputKinesisStreamGetArgs> kinesisStream;

    public Output<AnalyticsApplicationOutputKinesisStreamGetArgs> getKinesisStream() {
        return this.kinesisStream == null ? Output.empty() : this.kinesisStream;
    }

    /**
     * The Lambda function destination. See Lambda below for more details.
     * 
     */
    @Import(name="lambda")
      private final @Nullable Output<AnalyticsApplicationOutputLambdaGetArgs> lambda;

    public Output<AnalyticsApplicationOutputLambdaGetArgs> getLambda() {
        return this.lambda == null ? Output.empty() : this.lambda;
    }

    /**
     * The Name of the in-application stream.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The Schema format of the data written to the destination. See Destination Schema below for more details.
     * 
     */
    @Import(name="schema", required=true)
      private final Output<AnalyticsApplicationOutputSchemaGetArgs> schema;

    public Output<AnalyticsApplicationOutputSchemaGetArgs> getSchema() {
        return this.schema;
    }

    public AnalyticsApplicationOutputGetArgs(
        @Nullable Output<String> id,
        @Nullable Output<AnalyticsApplicationOutputKinesisFirehoseGetArgs> kinesisFirehose,
        @Nullable Output<AnalyticsApplicationOutputKinesisStreamGetArgs> kinesisStream,
        @Nullable Output<AnalyticsApplicationOutputLambdaGetArgs> lambda,
        Output<String> name,
        Output<AnalyticsApplicationOutputSchemaGetArgs> schema) {
        this.id = id;
        this.kinesisFirehose = kinesisFirehose;
        this.kinesisStream = kinesisStream;
        this.lambda = lambda;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.schema = Objects.requireNonNull(schema, "expected parameter 'schema' to be non-null");
    }

    private AnalyticsApplicationOutputGetArgs() {
        this.id = Output.empty();
        this.kinesisFirehose = Output.empty();
        this.kinesisStream = Output.empty();
        this.lambda = Output.empty();
        this.name = Output.empty();
        this.schema = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationOutputGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<AnalyticsApplicationOutputKinesisFirehoseGetArgs> kinesisFirehose;
        private @Nullable Output<AnalyticsApplicationOutputKinesisStreamGetArgs> kinesisStream;
        private @Nullable Output<AnalyticsApplicationOutputLambdaGetArgs> lambda;
        private Output<String> name;
        private Output<AnalyticsApplicationOutputSchemaGetArgs> schema;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationOutputGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kinesisFirehose = defaults.kinesisFirehose;
    	      this.kinesisStream = defaults.kinesisStream;
    	      this.lambda = defaults.lambda;
    	      this.name = defaults.name;
    	      this.schema = defaults.schema;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public Builder kinesisFirehose(@Nullable Output<AnalyticsApplicationOutputKinesisFirehoseGetArgs> kinesisFirehose) {
            this.kinesisFirehose = kinesisFirehose;
            return this;
        }
        public Builder kinesisFirehose(@Nullable AnalyticsApplicationOutputKinesisFirehoseGetArgs kinesisFirehose) {
            this.kinesisFirehose = Output.ofNullable(kinesisFirehose);
            return this;
        }
        public Builder kinesisStream(@Nullable Output<AnalyticsApplicationOutputKinesisStreamGetArgs> kinesisStream) {
            this.kinesisStream = kinesisStream;
            return this;
        }
        public Builder kinesisStream(@Nullable AnalyticsApplicationOutputKinesisStreamGetArgs kinesisStream) {
            this.kinesisStream = Output.ofNullable(kinesisStream);
            return this;
        }
        public Builder lambda(@Nullable Output<AnalyticsApplicationOutputLambdaGetArgs> lambda) {
            this.lambda = lambda;
            return this;
        }
        public Builder lambda(@Nullable AnalyticsApplicationOutputLambdaGetArgs lambda) {
            this.lambda = Output.ofNullable(lambda);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder schema(Output<AnalyticsApplicationOutputSchemaGetArgs> schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }
        public Builder schema(AnalyticsApplicationOutputSchemaGetArgs schema) {
            this.schema = Output.of(Objects.requireNonNull(schema));
            return this;
        }        public AnalyticsApplicationOutputGetArgs build() {
            return new AnalyticsApplicationOutputGetArgs(id, kinesisFirehose, kinesisStream, lambda, name, schema);
        }
    }
}
