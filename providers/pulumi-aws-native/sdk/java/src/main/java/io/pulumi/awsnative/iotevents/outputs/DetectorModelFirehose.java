// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.awsnative.iotevents.outputs.DetectorModelPayload;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DetectorModelFirehose {
    /**
     * The name of the Kinesis Data Firehose delivery stream where the data is written.
     * 
     */
    private final String deliveryStreamName;
    private final @Nullable DetectorModelPayload payload;
    /**
     * A character separator that is used to separate records written to the Kinesis Data Firehose delivery stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     * 
     */
    private final @Nullable String separator;

    @CustomType.Constructor
    private DetectorModelFirehose(
        @CustomType.Parameter("deliveryStreamName") String deliveryStreamName,
        @CustomType.Parameter("payload") @Nullable DetectorModelPayload payload,
        @CustomType.Parameter("separator") @Nullable String separator) {
        this.deliveryStreamName = deliveryStreamName;
        this.payload = payload;
        this.separator = separator;
    }

    /**
     * The name of the Kinesis Data Firehose delivery stream where the data is written.
     * 
    */
    public String getDeliveryStreamName() {
        return this.deliveryStreamName;
    }
    public Optional<DetectorModelPayload> getPayload() {
        return Optional.ofNullable(this.payload);
    }
    /**
     * A character separator that is used to separate records written to the Kinesis Data Firehose delivery stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     * 
    */
    public Optional<String> getSeparator() {
        return Optional.ofNullable(this.separator);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelFirehose defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deliveryStreamName;
        private @Nullable DetectorModelPayload payload;
        private @Nullable String separator;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelFirehose defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryStreamName = defaults.deliveryStreamName;
    	      this.payload = defaults.payload;
    	      this.separator = defaults.separator;
        }

        public Builder deliveryStreamName(String deliveryStreamName) {
            this.deliveryStreamName = Objects.requireNonNull(deliveryStreamName);
            return this;
        }
        public Builder payload(@Nullable DetectorModelPayload payload) {
            this.payload = payload;
            return this;
        }
        public Builder separator(@Nullable String separator) {
            this.separator = separator;
            return this;
        }        public DetectorModelFirehose build() {
            return new DetectorModelFirehose(deliveryStreamName, payload, separator);
        }
    }
}
