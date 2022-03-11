// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Information needed to configure the payload.
 * 
 * By default, AWS IoT Events generates a standard payload in JSON for any action. This action payload contains all attribute-value pairs that have the information about the detector model instance and the event triggered the action. To configure the action payload, you can use `contentExpression`.
 * 
 */
public final class DetectorModelPayloadArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelPayloadArgs Empty = new DetectorModelPayloadArgs();

    /**
     * The content of the payload. You can use a string expression that includes quoted strings (`'<string>'`), variables (`$variable.<variable-name>`), input values (`$input.<input-name>.<path-to-datum>`), string concatenations, and quoted strings that contain `${}` as the content. The recommended maximum size of a content expression is 1 KB.
     * 
     */
    @InputImport(name="contentExpression", required=true)
      private final Output<String> contentExpression;

    public Output<String> getContentExpression() {
        return this.contentExpression;
    }

    /**
     * The value of the payload type can be either `STRING` or `JSON`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public DetectorModelPayloadArgs(
        Output<String> contentExpression,
        Output<String> type) {
        this.contentExpression = Objects.requireNonNull(contentExpression, "expected parameter 'contentExpression' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DetectorModelPayloadArgs() {
        this.contentExpression = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelPayloadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> contentExpression;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelPayloadArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentExpression = defaults.contentExpression;
    	      this.type = defaults.type;
        }

        public Builder contentExpression(Output<String> contentExpression) {
            this.contentExpression = Objects.requireNonNull(contentExpression);
            return this;
        }

        public Builder contentExpression(String contentExpression) {
            this.contentExpression = Output.of(Objects.requireNonNull(contentExpression));
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public DetectorModelPayloadArgs build() {
            return new DetectorModelPayloadArgs(contentExpression, type);
        }
    }
}
