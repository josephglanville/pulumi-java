// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelPayloadArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DetectorModelLambdaArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelLambdaArgs Empty = new DetectorModelLambdaArgs();

    /**
     * The ARN of the Lambda function that is executed.
     * 
     */
    @Import(name="functionArn", required=true)
      private final Output<String> functionArn;

    public Output<String> getFunctionArn() {
        return this.functionArn;
    }

    @Import(name="payload")
      private final @Nullable Output<DetectorModelPayloadArgs> payload;

    public Output<DetectorModelPayloadArgs> getPayload() {
        return this.payload == null ? Output.empty() : this.payload;
    }

    public DetectorModelLambdaArgs(
        Output<String> functionArn,
        @Nullable Output<DetectorModelPayloadArgs> payload) {
        this.functionArn = Objects.requireNonNull(functionArn, "expected parameter 'functionArn' to be non-null");
        this.payload = payload;
    }

    private DetectorModelLambdaArgs() {
        this.functionArn = Output.empty();
        this.payload = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelLambdaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> functionArn;
        private @Nullable Output<DetectorModelPayloadArgs> payload;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelLambdaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionArn = defaults.functionArn;
    	      this.payload = defaults.payload;
        }

        public Builder functionArn(Output<String> functionArn) {
            this.functionArn = Objects.requireNonNull(functionArn);
            return this;
        }
        public Builder functionArn(String functionArn) {
            this.functionArn = Output.of(Objects.requireNonNull(functionArn));
            return this;
        }
        public Builder payload(@Nullable Output<DetectorModelPayloadArgs> payload) {
            this.payload = payload;
            return this;
        }
        public Builder payload(@Nullable DetectorModelPayloadArgs payload) {
            this.payload = Output.ofNullable(payload);
            return this;
        }        public DetectorModelLambdaArgs build() {
            return new DetectorModelLambdaArgs(functionArn, payload);
        }
    }
}
