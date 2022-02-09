// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class EdifactMessageFilterResponse extends io.pulumi.resources.InvokeArgs {

    public static final EdifactMessageFilterResponse Empty = new EdifactMessageFilterResponse();

    @InputImport(name="messageFilterType", required=true)
    private final String messageFilterType;

    public String getMessageFilterType() {
        return this.messageFilterType;
    }

    public EdifactMessageFilterResponse(String messageFilterType) {
        this.messageFilterType = Objects.requireNonNull(messageFilterType, "expected parameter 'messageFilterType' to be non-null");
    }

    private EdifactMessageFilterResponse() {
        this.messageFilterType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactMessageFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String messageFilterType;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactMessageFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageFilterType = defaults.messageFilterType;
        }

        public Builder setMessageFilterType(String messageFilterType) {
            this.messageFilterType = Objects.requireNonNull(messageFilterType);
            return this;
        }

        public EdifactMessageFilterResponse build() {
            return new EdifactMessageFilterResponse(messageFilterType);
        }
    }
}
