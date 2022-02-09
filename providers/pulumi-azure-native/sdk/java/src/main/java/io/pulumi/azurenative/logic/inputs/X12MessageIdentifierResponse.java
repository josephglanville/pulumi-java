// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class X12MessageIdentifierResponse extends io.pulumi.resources.InvokeArgs {

    public static final X12MessageIdentifierResponse Empty = new X12MessageIdentifierResponse();

    @InputImport(name="messageId", required=true)
    private final String messageId;

    public String getMessageId() {
        return this.messageId;
    }

    public X12MessageIdentifierResponse(String messageId) {
        this.messageId = Objects.requireNonNull(messageId, "expected parameter 'messageId' to be non-null");
    }

    private X12MessageIdentifierResponse() {
        this.messageId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12MessageIdentifierResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String messageId;

        public Builder() {
    	      // Empty
        }

        public Builder(X12MessageIdentifierResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageId = defaults.messageId;
        }

        public Builder setMessageId(String messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }

        public X12MessageIdentifierResponse build() {
            return new X12MessageIdentifierResponse(messageId);
        }
    }
}
