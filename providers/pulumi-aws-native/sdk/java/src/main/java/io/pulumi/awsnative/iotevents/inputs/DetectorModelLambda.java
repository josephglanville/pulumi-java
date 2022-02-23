// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelPayload;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DetectorModelLambda extends io.pulumi.resources.InvokeArgs {

    public static final DetectorModelLambda Empty = new DetectorModelLambda();

    /**
     * The ARN of the Lambda function that is executed.
     * 
     */
    @InputImport(name="functionArn", required=true)
      private final String functionArn;

    public String getFunctionArn() {
        return this.functionArn;
    }

    @InputImport(name="payload")
      private final @Nullable DetectorModelPayload payload;

    public Optional<DetectorModelPayload> getPayload() {
        return this.payload == null ? Optional.empty() : Optional.ofNullable(this.payload);
    }

    public DetectorModelLambda(
        String functionArn,
        @Nullable DetectorModelPayload payload) {
        this.functionArn = Objects.requireNonNull(functionArn, "expected parameter 'functionArn' to be non-null");
        this.payload = payload;
    }

    private DetectorModelLambda() {
        this.functionArn = null;
        this.payload = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelLambda defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String functionArn;
        private @Nullable DetectorModelPayload payload;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelLambda defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionArn = defaults.functionArn;
    	      this.payload = defaults.payload;
        }

        public Builder setFunctionArn(String functionArn) {
            this.functionArn = Objects.requireNonNull(functionArn);
            return this;
        }

        public Builder setPayload(@Nullable DetectorModelPayload payload) {
            this.payload = payload;
            return this;
        }
        public DetectorModelLambda build() {
            return new DetectorModelLambda(functionArn, payload);
        }
    }
}
