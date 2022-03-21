// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerFixedResponseConfig extends io.pulumi.resources.InvokeArgs {

    public static final ListenerFixedResponseConfig Empty = new ListenerFixedResponseConfig();

    @Import(name="contentType")
      private final @Nullable String contentType;

    public Optional<String> getContentType() {
        return this.contentType == null ? Optional.empty() : Optional.ofNullable(this.contentType);
    }

    @Import(name="messageBody")
      private final @Nullable String messageBody;

    public Optional<String> getMessageBody() {
        return this.messageBody == null ? Optional.empty() : Optional.ofNullable(this.messageBody);
    }

    @Import(name="statusCode", required=true)
      private final String statusCode;

    public String getStatusCode() {
        return this.statusCode;
    }

    public ListenerFixedResponseConfig(
        @Nullable String contentType,
        @Nullable String messageBody,
        String statusCode) {
        this.contentType = contentType;
        this.messageBody = messageBody;
        this.statusCode = Objects.requireNonNull(statusCode, "expected parameter 'statusCode' to be non-null");
    }

    private ListenerFixedResponseConfig() {
        this.contentType = null;
        this.messageBody = null;
        this.statusCode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerFixedResponseConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String contentType;
        private @Nullable String messageBody;
        private String statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerFixedResponseConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.messageBody = defaults.messageBody;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder contentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder messageBody(@Nullable String messageBody) {
            this.messageBody = messageBody;
            return this;
        }
        public Builder statusCode(String statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }        public ListenerFixedResponseConfig build() {
            return new ListenerFixedResponseConfig(contentType, messageBody, statusCode);
        }
    }
}
