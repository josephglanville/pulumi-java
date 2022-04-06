// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleActionFixedResponseArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionFixedResponseArgs Empty = new ListenerRuleActionFixedResponseArgs();

    /**
     * The content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
     * 
     */
    @Import(name="contentType", required=true)
      private final Output<String> contentType;

    public Output<String> getContentType() {
        return this.contentType;
    }

    /**
     * The message body.
     * 
     */
    @Import(name="messageBody")
      private final @Nullable Output<String> messageBody;

    public Output<String> getMessageBody() {
        return this.messageBody == null ? Output.empty() : this.messageBody;
    }

    /**
     * The HTTP response code. Valid values are `2XX`, `4XX`, or `5XX`.
     * 
     */
    @Import(name="statusCode")
      private final @Nullable Output<String> statusCode;

    public Output<String> getStatusCode() {
        return this.statusCode == null ? Output.empty() : this.statusCode;
    }

    public ListenerRuleActionFixedResponseArgs(
        Output<String> contentType,
        @Nullable Output<String> messageBody,
        @Nullable Output<String> statusCode) {
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.messageBody = messageBody;
        this.statusCode = statusCode;
    }

    private ListenerRuleActionFixedResponseArgs() {
        this.contentType = Output.empty();
        this.messageBody = Output.empty();
        this.statusCode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionFixedResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> contentType;
        private @Nullable Output<String> messageBody;
        private @Nullable Output<String> statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleActionFixedResponseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.messageBody = defaults.messageBody;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder contentType(Output<String> contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        public Builder contentType(String contentType) {
            this.contentType = Output.of(Objects.requireNonNull(contentType));
            return this;
        }
        public Builder messageBody(@Nullable Output<String> messageBody) {
            this.messageBody = messageBody;
            return this;
        }
        public Builder messageBody(@Nullable String messageBody) {
            this.messageBody = Output.ofNullable(messageBody);
            return this;
        }
        public Builder statusCode(@Nullable Output<String> statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Builder statusCode(@Nullable String statusCode) {
            this.statusCode = Output.ofNullable(statusCode);
            return this;
        }        public ListenerRuleActionFixedResponseArgs build() {
            return new ListenerRuleActionFixedResponseArgs(contentType, messageBody, statusCode);
        }
    }
}