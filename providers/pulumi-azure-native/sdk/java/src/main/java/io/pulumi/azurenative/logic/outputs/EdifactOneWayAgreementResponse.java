// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.BusinessIdentityResponse;
import io.pulumi.azurenative.logic.outputs.EdifactProtocolSettingsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class EdifactOneWayAgreementResponse {
    private final EdifactProtocolSettingsResponse protocolSettings;
    private final BusinessIdentityResponse receiverBusinessIdentity;
    private final BusinessIdentityResponse senderBusinessIdentity;

    @OutputCustomType.Constructor({"protocolSettings","receiverBusinessIdentity","senderBusinessIdentity"})
    private EdifactOneWayAgreementResponse(
        EdifactProtocolSettingsResponse protocolSettings,
        BusinessIdentityResponse receiverBusinessIdentity,
        BusinessIdentityResponse senderBusinessIdentity) {
        this.protocolSettings = Objects.requireNonNull(protocolSettings);
        this.receiverBusinessIdentity = Objects.requireNonNull(receiverBusinessIdentity);
        this.senderBusinessIdentity = Objects.requireNonNull(senderBusinessIdentity);
    }

    public EdifactProtocolSettingsResponse getProtocolSettings() {
        return this.protocolSettings;
    }
    public BusinessIdentityResponse getReceiverBusinessIdentity() {
        return this.receiverBusinessIdentity;
    }
    public BusinessIdentityResponse getSenderBusinessIdentity() {
        return this.senderBusinessIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactOneWayAgreementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdifactProtocolSettingsResponse protocolSettings;
        private BusinessIdentityResponse receiverBusinessIdentity;
        private BusinessIdentityResponse senderBusinessIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactOneWayAgreementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protocolSettings = defaults.protocolSettings;
    	      this.receiverBusinessIdentity = defaults.receiverBusinessIdentity;
    	      this.senderBusinessIdentity = defaults.senderBusinessIdentity;
        }

        public Builder setProtocolSettings(EdifactProtocolSettingsResponse protocolSettings) {
            this.protocolSettings = Objects.requireNonNull(protocolSettings);
            return this;
        }

        public Builder setReceiverBusinessIdentity(BusinessIdentityResponse receiverBusinessIdentity) {
            this.receiverBusinessIdentity = Objects.requireNonNull(receiverBusinessIdentity);
            return this;
        }

        public Builder setSenderBusinessIdentity(BusinessIdentityResponse senderBusinessIdentity) {
            this.senderBusinessIdentity = Objects.requireNonNull(senderBusinessIdentity);
            return this;
        }

        public EdifactOneWayAgreementResponse build() {
            return new EdifactOneWayAgreementResponse(protocolSettings, receiverBusinessIdentity, senderBusinessIdentity);
        }
    }
}
