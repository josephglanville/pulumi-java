// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleFixedResponseConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleFixedResponseConfigArgs Empty = new ListenerRuleFixedResponseConfigArgs();

    @Import(name="contentType")
      private final @Nullable Output<String> contentType;

    public Output<String> getContentType() {
        return this.contentType == null ? Codegen.empty() : this.contentType;
    }

    @Import(name="messageBody")
      private final @Nullable Output<String> messageBody;

    public Output<String> getMessageBody() {
        return this.messageBody == null ? Codegen.empty() : this.messageBody;
    }

    @Import(name="statusCode", required=true)
      private final Output<String> statusCode;

    public Output<String> getStatusCode() {
        return this.statusCode;
    }

    public ListenerRuleFixedResponseConfigArgs(
        @Nullable Output<String> contentType,
        @Nullable Output<String> messageBody,
        Output<String> statusCode) {
        this.contentType = contentType;
        this.messageBody = messageBody;
        this.statusCode = Objects.requireNonNull(statusCode, "expected parameter 'statusCode' to be non-null");
    }

    private ListenerRuleFixedResponseConfigArgs() {
        this.contentType = Codegen.empty();
        this.messageBody = Codegen.empty();
        this.statusCode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleFixedResponseConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> contentType;
        private @Nullable Output<String> messageBody;
        private Output<String> statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleFixedResponseConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.messageBody = defaults.messageBody;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder contentType(@Nullable Output<String> contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder contentType(@Nullable String contentType) {
            this.contentType = Codegen.ofNullable(contentType);
            return this;
        }
        public Builder messageBody(@Nullable Output<String> messageBody) {
            this.messageBody = messageBody;
            return this;
        }
        public Builder messageBody(@Nullable String messageBody) {
            this.messageBody = Codegen.ofNullable(messageBody);
            return this;
        }
        public Builder statusCode(Output<String> statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }
        public Builder statusCode(String statusCode) {
            this.statusCode = Output.of(Objects.requireNonNull(statusCode));
            return this;
        }        public ListenerRuleFixedResponseConfigArgs build() {
            return new ListenerRuleFixedResponseConfigArgs(contentType, messageBody, statusCode);
        }
    }
}
