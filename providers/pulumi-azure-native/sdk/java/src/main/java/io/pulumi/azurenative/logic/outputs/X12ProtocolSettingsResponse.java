// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.X12AcknowledgementSettingsResponse;
import io.pulumi.azurenative.logic.outputs.X12DelimiterOverridesResponse;
import io.pulumi.azurenative.logic.outputs.X12EnvelopeOverrideResponse;
import io.pulumi.azurenative.logic.outputs.X12EnvelopeSettingsResponse;
import io.pulumi.azurenative.logic.outputs.X12FramingSettingsResponse;
import io.pulumi.azurenative.logic.outputs.X12MessageFilterResponse;
import io.pulumi.azurenative.logic.outputs.X12MessageIdentifierResponse;
import io.pulumi.azurenative.logic.outputs.X12ProcessingSettingsResponse;
import io.pulumi.azurenative.logic.outputs.X12SchemaReferenceResponse;
import io.pulumi.azurenative.logic.outputs.X12SecuritySettingsResponse;
import io.pulumi.azurenative.logic.outputs.X12ValidationOverrideResponse;
import io.pulumi.azurenative.logic.outputs.X12ValidationSettingsResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class X12ProtocolSettingsResponse {
    /**
     * The X12 acknowledgment settings.
     * 
     */
    private final X12AcknowledgementSettingsResponse acknowledgementSettings;
    /**
     * The X12 envelope override settings.
     * 
     */
    private final @Nullable List<X12EnvelopeOverrideResponse> envelopeOverrides;
    /**
     * The X12 envelope settings.
     * 
     */
    private final X12EnvelopeSettingsResponse envelopeSettings;
    /**
     * The X12 framing settings.
     * 
     */
    private final X12FramingSettingsResponse framingSettings;
    /**
     * The X12 message filter.
     * 
     */
    private final X12MessageFilterResponse messageFilter;
    /**
     * The X12 message filter list.
     * 
     */
    private final @Nullable List<X12MessageIdentifierResponse> messageFilterList;
    /**
     * The X12 processing settings.
     * 
     */
    private final X12ProcessingSettingsResponse processingSettings;
    /**
     * The X12 schema references.
     * 
     */
    private final List<X12SchemaReferenceResponse> schemaReferences;
    /**
     * The X12 security settings.
     * 
     */
    private final X12SecuritySettingsResponse securitySettings;
    /**
     * The X12 validation override settings.
     * 
     */
    private final @Nullable List<X12ValidationOverrideResponse> validationOverrides;
    /**
     * The X12 validation settings.
     * 
     */
    private final X12ValidationSettingsResponse validationSettings;
    /**
     * The X12 delimiter override settings.
     * 
     */
    private final @Nullable List<X12DelimiterOverridesResponse> x12DelimiterOverrides;

    @CustomType.Constructor
    private X12ProtocolSettingsResponse(
        @CustomType.Parameter("acknowledgementSettings") X12AcknowledgementSettingsResponse acknowledgementSettings,
        @CustomType.Parameter("envelopeOverrides") @Nullable List<X12EnvelopeOverrideResponse> envelopeOverrides,
        @CustomType.Parameter("envelopeSettings") X12EnvelopeSettingsResponse envelopeSettings,
        @CustomType.Parameter("framingSettings") X12FramingSettingsResponse framingSettings,
        @CustomType.Parameter("messageFilter") X12MessageFilterResponse messageFilter,
        @CustomType.Parameter("messageFilterList") @Nullable List<X12MessageIdentifierResponse> messageFilterList,
        @CustomType.Parameter("processingSettings") X12ProcessingSettingsResponse processingSettings,
        @CustomType.Parameter("schemaReferences") List<X12SchemaReferenceResponse> schemaReferences,
        @CustomType.Parameter("securitySettings") X12SecuritySettingsResponse securitySettings,
        @CustomType.Parameter("validationOverrides") @Nullable List<X12ValidationOverrideResponse> validationOverrides,
        @CustomType.Parameter("validationSettings") X12ValidationSettingsResponse validationSettings,
        @CustomType.Parameter("x12DelimiterOverrides") @Nullable List<X12DelimiterOverridesResponse> x12DelimiterOverrides) {
        this.acknowledgementSettings = acknowledgementSettings;
        this.envelopeOverrides = envelopeOverrides;
        this.envelopeSettings = envelopeSettings;
        this.framingSettings = framingSettings;
        this.messageFilter = messageFilter;
        this.messageFilterList = messageFilterList;
        this.processingSettings = processingSettings;
        this.schemaReferences = schemaReferences;
        this.securitySettings = securitySettings;
        this.validationOverrides = validationOverrides;
        this.validationSettings = validationSettings;
        this.x12DelimiterOverrides = x12DelimiterOverrides;
    }

    /**
     * The X12 acknowledgment settings.
     * 
    */
    public X12AcknowledgementSettingsResponse getAcknowledgementSettings() {
        return this.acknowledgementSettings;
    }
    /**
     * The X12 envelope override settings.
     * 
    */
    public List<X12EnvelopeOverrideResponse> getEnvelopeOverrides() {
        return this.envelopeOverrides == null ? List.of() : this.envelopeOverrides;
    }
    /**
     * The X12 envelope settings.
     * 
    */
    public X12EnvelopeSettingsResponse getEnvelopeSettings() {
        return this.envelopeSettings;
    }
    /**
     * The X12 framing settings.
     * 
    */
    public X12FramingSettingsResponse getFramingSettings() {
        return this.framingSettings;
    }
    /**
     * The X12 message filter.
     * 
    */
    public X12MessageFilterResponse getMessageFilter() {
        return this.messageFilter;
    }
    /**
     * The X12 message filter list.
     * 
    */
    public List<X12MessageIdentifierResponse> getMessageFilterList() {
        return this.messageFilterList == null ? List.of() : this.messageFilterList;
    }
    /**
     * The X12 processing settings.
     * 
    */
    public X12ProcessingSettingsResponse getProcessingSettings() {
        return this.processingSettings;
    }
    /**
     * The X12 schema references.
     * 
    */
    public List<X12SchemaReferenceResponse> getSchemaReferences() {
        return this.schemaReferences;
    }
    /**
     * The X12 security settings.
     * 
    */
    public X12SecuritySettingsResponse getSecuritySettings() {
        return this.securitySettings;
    }
    /**
     * The X12 validation override settings.
     * 
    */
    public List<X12ValidationOverrideResponse> getValidationOverrides() {
        return this.validationOverrides == null ? List.of() : this.validationOverrides;
    }
    /**
     * The X12 validation settings.
     * 
    */
    public X12ValidationSettingsResponse getValidationSettings() {
        return this.validationSettings;
    }
    /**
     * The X12 delimiter override settings.
     * 
    */
    public List<X12DelimiterOverridesResponse> getX12DelimiterOverrides() {
        return this.x12DelimiterOverrides == null ? List.of() : this.x12DelimiterOverrides;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12ProtocolSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private X12AcknowledgementSettingsResponse acknowledgementSettings;
        private @Nullable List<X12EnvelopeOverrideResponse> envelopeOverrides;
        private X12EnvelopeSettingsResponse envelopeSettings;
        private X12FramingSettingsResponse framingSettings;
        private X12MessageFilterResponse messageFilter;
        private @Nullable List<X12MessageIdentifierResponse> messageFilterList;
        private X12ProcessingSettingsResponse processingSettings;
        private List<X12SchemaReferenceResponse> schemaReferences;
        private X12SecuritySettingsResponse securitySettings;
        private @Nullable List<X12ValidationOverrideResponse> validationOverrides;
        private X12ValidationSettingsResponse validationSettings;
        private @Nullable List<X12DelimiterOverridesResponse> x12DelimiterOverrides;

        public Builder() {
    	      // Empty
        }

        public Builder(X12ProtocolSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acknowledgementSettings = defaults.acknowledgementSettings;
    	      this.envelopeOverrides = defaults.envelopeOverrides;
    	      this.envelopeSettings = defaults.envelopeSettings;
    	      this.framingSettings = defaults.framingSettings;
    	      this.messageFilter = defaults.messageFilter;
    	      this.messageFilterList = defaults.messageFilterList;
    	      this.processingSettings = defaults.processingSettings;
    	      this.schemaReferences = defaults.schemaReferences;
    	      this.securitySettings = defaults.securitySettings;
    	      this.validationOverrides = defaults.validationOverrides;
    	      this.validationSettings = defaults.validationSettings;
    	      this.x12DelimiterOverrides = defaults.x12DelimiterOverrides;
        }

        public Builder acknowledgementSettings(X12AcknowledgementSettingsResponse acknowledgementSettings) {
            this.acknowledgementSettings = Objects.requireNonNull(acknowledgementSettings);
            return this;
        }
        public Builder envelopeOverrides(@Nullable List<X12EnvelopeOverrideResponse> envelopeOverrides) {
            this.envelopeOverrides = envelopeOverrides;
            return this;
        }
        public Builder envelopeOverrides(X12EnvelopeOverrideResponse... envelopeOverrides) {
            return envelopeOverrides(List.of(envelopeOverrides));
        }
        public Builder envelopeSettings(X12EnvelopeSettingsResponse envelopeSettings) {
            this.envelopeSettings = Objects.requireNonNull(envelopeSettings);
            return this;
        }
        public Builder framingSettings(X12FramingSettingsResponse framingSettings) {
            this.framingSettings = Objects.requireNonNull(framingSettings);
            return this;
        }
        public Builder messageFilter(X12MessageFilterResponse messageFilter) {
            this.messageFilter = Objects.requireNonNull(messageFilter);
            return this;
        }
        public Builder messageFilterList(@Nullable List<X12MessageIdentifierResponse> messageFilterList) {
            this.messageFilterList = messageFilterList;
            return this;
        }
        public Builder messageFilterList(X12MessageIdentifierResponse... messageFilterList) {
            return messageFilterList(List.of(messageFilterList));
        }
        public Builder processingSettings(X12ProcessingSettingsResponse processingSettings) {
            this.processingSettings = Objects.requireNonNull(processingSettings);
            return this;
        }
        public Builder schemaReferences(List<X12SchemaReferenceResponse> schemaReferences) {
            this.schemaReferences = Objects.requireNonNull(schemaReferences);
            return this;
        }
        public Builder schemaReferences(X12SchemaReferenceResponse... schemaReferences) {
            return schemaReferences(List.of(schemaReferences));
        }
        public Builder securitySettings(X12SecuritySettingsResponse securitySettings) {
            this.securitySettings = Objects.requireNonNull(securitySettings);
            return this;
        }
        public Builder validationOverrides(@Nullable List<X12ValidationOverrideResponse> validationOverrides) {
            this.validationOverrides = validationOverrides;
            return this;
        }
        public Builder validationOverrides(X12ValidationOverrideResponse... validationOverrides) {
            return validationOverrides(List.of(validationOverrides));
        }
        public Builder validationSettings(X12ValidationSettingsResponse validationSettings) {
            this.validationSettings = Objects.requireNonNull(validationSettings);
            return this;
        }
        public Builder x12DelimiterOverrides(@Nullable List<X12DelimiterOverridesResponse> x12DelimiterOverrides) {
            this.x12DelimiterOverrides = x12DelimiterOverrides;
            return this;
        }
        public Builder x12DelimiterOverrides(X12DelimiterOverridesResponse... x12DelimiterOverrides) {
            return x12DelimiterOverrides(List.of(x12DelimiterOverrides));
        }        public X12ProtocolSettingsResponse build() {
            return new X12ProtocolSettingsResponse(acknowledgementSettings, envelopeOverrides, envelopeSettings, framingSettings, messageFilter, messageFilterList, processingSettings, schemaReferences, securitySettings, validationOverrides, validationSettings, x12DelimiterOverrides);
        }
    }
}
