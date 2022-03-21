// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.AS2AcknowledgementConnectionSettingsArgs;
import io.pulumi.azurenative.logic.inputs.AS2EnvelopeSettingsArgs;
import io.pulumi.azurenative.logic.inputs.AS2ErrorSettingsArgs;
import io.pulumi.azurenative.logic.inputs.AS2MdnSettingsArgs;
import io.pulumi.azurenative.logic.inputs.AS2MessageConnectionSettingsArgs;
import io.pulumi.azurenative.logic.inputs.AS2SecuritySettingsArgs;
import io.pulumi.azurenative.logic.inputs.AS2ValidationSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The AS2 agreement protocol settings.
 * 
 */
public final class AS2ProtocolSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AS2ProtocolSettingsArgs Empty = new AS2ProtocolSettingsArgs();

    /**
     * The acknowledgement connection settings.
     * 
     */
    @Import(name="acknowledgementConnectionSettings", required=true)
      private final Output<AS2AcknowledgementConnectionSettingsArgs> acknowledgementConnectionSettings;

    public Output<AS2AcknowledgementConnectionSettingsArgs> getAcknowledgementConnectionSettings() {
        return this.acknowledgementConnectionSettings;
    }

    /**
     * The envelope settings.
     * 
     */
    @Import(name="envelopeSettings", required=true)
      private final Output<AS2EnvelopeSettingsArgs> envelopeSettings;

    public Output<AS2EnvelopeSettingsArgs> getEnvelopeSettings() {
        return this.envelopeSettings;
    }

    /**
     * The error settings.
     * 
     */
    @Import(name="errorSettings", required=true)
      private final Output<AS2ErrorSettingsArgs> errorSettings;

    public Output<AS2ErrorSettingsArgs> getErrorSettings() {
        return this.errorSettings;
    }

    /**
     * The MDN settings.
     * 
     */
    @Import(name="mdnSettings", required=true)
      private final Output<AS2MdnSettingsArgs> mdnSettings;

    public Output<AS2MdnSettingsArgs> getMdnSettings() {
        return this.mdnSettings;
    }

    /**
     * The message connection settings.
     * 
     */
    @Import(name="messageConnectionSettings", required=true)
      private final Output<AS2MessageConnectionSettingsArgs> messageConnectionSettings;

    public Output<AS2MessageConnectionSettingsArgs> getMessageConnectionSettings() {
        return this.messageConnectionSettings;
    }

    /**
     * The security settings.
     * 
     */
    @Import(name="securitySettings", required=true)
      private final Output<AS2SecuritySettingsArgs> securitySettings;

    public Output<AS2SecuritySettingsArgs> getSecuritySettings() {
        return this.securitySettings;
    }

    /**
     * The validation settings.
     * 
     */
    @Import(name="validationSettings", required=true)
      private final Output<AS2ValidationSettingsArgs> validationSettings;

    public Output<AS2ValidationSettingsArgs> getValidationSettings() {
        return this.validationSettings;
    }

    public AS2ProtocolSettingsArgs(
        Output<AS2AcknowledgementConnectionSettingsArgs> acknowledgementConnectionSettings,
        Output<AS2EnvelopeSettingsArgs> envelopeSettings,
        Output<AS2ErrorSettingsArgs> errorSettings,
        Output<AS2MdnSettingsArgs> mdnSettings,
        Output<AS2MessageConnectionSettingsArgs> messageConnectionSettings,
        Output<AS2SecuritySettingsArgs> securitySettings,
        Output<AS2ValidationSettingsArgs> validationSettings) {
        this.acknowledgementConnectionSettings = Objects.requireNonNull(acknowledgementConnectionSettings, "expected parameter 'acknowledgementConnectionSettings' to be non-null");
        this.envelopeSettings = Objects.requireNonNull(envelopeSettings, "expected parameter 'envelopeSettings' to be non-null");
        this.errorSettings = Objects.requireNonNull(errorSettings, "expected parameter 'errorSettings' to be non-null");
        this.mdnSettings = Objects.requireNonNull(mdnSettings, "expected parameter 'mdnSettings' to be non-null");
        this.messageConnectionSettings = Objects.requireNonNull(messageConnectionSettings, "expected parameter 'messageConnectionSettings' to be non-null");
        this.securitySettings = Objects.requireNonNull(securitySettings, "expected parameter 'securitySettings' to be non-null");
        this.validationSettings = Objects.requireNonNull(validationSettings, "expected parameter 'validationSettings' to be non-null");
    }

    private AS2ProtocolSettingsArgs() {
        this.acknowledgementConnectionSettings = Output.empty();
        this.envelopeSettings = Output.empty();
        this.errorSettings = Output.empty();
        this.mdnSettings = Output.empty();
        this.messageConnectionSettings = Output.empty();
        this.securitySettings = Output.empty();
        this.validationSettings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2ProtocolSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<AS2AcknowledgementConnectionSettingsArgs> acknowledgementConnectionSettings;
        private Output<AS2EnvelopeSettingsArgs> envelopeSettings;
        private Output<AS2ErrorSettingsArgs> errorSettings;
        private Output<AS2MdnSettingsArgs> mdnSettings;
        private Output<AS2MessageConnectionSettingsArgs> messageConnectionSettings;
        private Output<AS2SecuritySettingsArgs> securitySettings;
        private Output<AS2ValidationSettingsArgs> validationSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2ProtocolSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acknowledgementConnectionSettings = defaults.acknowledgementConnectionSettings;
    	      this.envelopeSettings = defaults.envelopeSettings;
    	      this.errorSettings = defaults.errorSettings;
    	      this.mdnSettings = defaults.mdnSettings;
    	      this.messageConnectionSettings = defaults.messageConnectionSettings;
    	      this.securitySettings = defaults.securitySettings;
    	      this.validationSettings = defaults.validationSettings;
        }

        public Builder acknowledgementConnectionSettings(Output<AS2AcknowledgementConnectionSettingsArgs> acknowledgementConnectionSettings) {
            this.acknowledgementConnectionSettings = Objects.requireNonNull(acknowledgementConnectionSettings);
            return this;
        }
        public Builder acknowledgementConnectionSettings(AS2AcknowledgementConnectionSettingsArgs acknowledgementConnectionSettings) {
            this.acknowledgementConnectionSettings = Output.of(Objects.requireNonNull(acknowledgementConnectionSettings));
            return this;
        }
        public Builder envelopeSettings(Output<AS2EnvelopeSettingsArgs> envelopeSettings) {
            this.envelopeSettings = Objects.requireNonNull(envelopeSettings);
            return this;
        }
        public Builder envelopeSettings(AS2EnvelopeSettingsArgs envelopeSettings) {
            this.envelopeSettings = Output.of(Objects.requireNonNull(envelopeSettings));
            return this;
        }
        public Builder errorSettings(Output<AS2ErrorSettingsArgs> errorSettings) {
            this.errorSettings = Objects.requireNonNull(errorSettings);
            return this;
        }
        public Builder errorSettings(AS2ErrorSettingsArgs errorSettings) {
            this.errorSettings = Output.of(Objects.requireNonNull(errorSettings));
            return this;
        }
        public Builder mdnSettings(Output<AS2MdnSettingsArgs> mdnSettings) {
            this.mdnSettings = Objects.requireNonNull(mdnSettings);
            return this;
        }
        public Builder mdnSettings(AS2MdnSettingsArgs mdnSettings) {
            this.mdnSettings = Output.of(Objects.requireNonNull(mdnSettings));
            return this;
        }
        public Builder messageConnectionSettings(Output<AS2MessageConnectionSettingsArgs> messageConnectionSettings) {
            this.messageConnectionSettings = Objects.requireNonNull(messageConnectionSettings);
            return this;
        }
        public Builder messageConnectionSettings(AS2MessageConnectionSettingsArgs messageConnectionSettings) {
            this.messageConnectionSettings = Output.of(Objects.requireNonNull(messageConnectionSettings));
            return this;
        }
        public Builder securitySettings(Output<AS2SecuritySettingsArgs> securitySettings) {
            this.securitySettings = Objects.requireNonNull(securitySettings);
            return this;
        }
        public Builder securitySettings(AS2SecuritySettingsArgs securitySettings) {
            this.securitySettings = Output.of(Objects.requireNonNull(securitySettings));
            return this;
        }
        public Builder validationSettings(Output<AS2ValidationSettingsArgs> validationSettings) {
            this.validationSettings = Objects.requireNonNull(validationSettings);
            return this;
        }
        public Builder validationSettings(AS2ValidationSettingsArgs validationSettings) {
            this.validationSettings = Output.of(Objects.requireNonNull(validationSettings));
            return this;
        }        public AS2ProtocolSettingsArgs build() {
            return new AS2ProtocolSettingsArgs(acknowledgementConnectionSettings, envelopeSettings, errorSettings, mdnSettings, messageConnectionSettings, securitySettings, validationSettings);
        }
    }
}
