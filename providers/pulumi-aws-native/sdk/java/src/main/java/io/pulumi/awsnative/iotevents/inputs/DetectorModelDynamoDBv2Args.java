// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelPayloadArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines an action to write to the Amazon DynamoDB table that you created. The default action payload contains all attribute-value pairs that have the information about the detector model instance and the event that triggered the action. You can also customize the [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html). A separate column of the DynamoDB table receives one attribute-value pair in the payload that you specify.
 * 
 * You can use expressions for parameters that are strings. For more information, see [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html) in the *AWS IoT Events Developer Guide*.
 * 
 */
public final class DetectorModelDynamoDBv2Args extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelDynamoDBv2Args Empty = new DetectorModelDynamoDBv2Args();

    @Import(name="payload")
      private final @Nullable Output<DetectorModelPayloadArgs> payload;

    public Output<DetectorModelPayloadArgs> getPayload() {
        return this.payload == null ? Output.empty() : this.payload;
    }

    /**
     * The name of the DynamoDB table.
     * 
     */
    @Import(name="tableName", required=true)
      private final Output<String> tableName;

    public Output<String> getTableName() {
        return this.tableName;
    }

    public DetectorModelDynamoDBv2Args(
        @Nullable Output<DetectorModelPayloadArgs> payload,
        Output<String> tableName) {
        this.payload = payload;
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private DetectorModelDynamoDBv2Args() {
        this.payload = Output.empty();
        this.tableName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelDynamoDBv2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DetectorModelPayloadArgs> payload;
        private Output<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelDynamoDBv2Args defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payload = defaults.payload;
    	      this.tableName = defaults.tableName;
        }

        public Builder payload(@Nullable Output<DetectorModelPayloadArgs> payload) {
            this.payload = payload;
            return this;
        }
        public Builder payload(@Nullable DetectorModelPayloadArgs payload) {
            this.payload = Output.ofNullable(payload);
            return this;
        }
        public Builder tableName(Output<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Output.of(Objects.requireNonNull(tableName));
            return this;
        }        public DetectorModelDynamoDBv2Args build() {
            return new DetectorModelDynamoDBv2Args(payload, tableName);
        }
    }
}
