// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.EdifactAcknowledgementSettingsArgs;
import io.pulumi.azurenative.logic.inputs.EdifactDelimiterOverrideArgs;
import io.pulumi.azurenative.logic.inputs.EdifactEnvelopeOverrideArgs;
import io.pulumi.azurenative.logic.inputs.EdifactEnvelopeSettingsArgs;
import io.pulumi.azurenative.logic.inputs.EdifactFramingSettingsArgs;
import io.pulumi.azurenative.logic.inputs.EdifactMessageFilterArgs;
import io.pulumi.azurenative.logic.inputs.EdifactMessageIdentifierArgs;
import io.pulumi.azurenative.logic.inputs.EdifactProcessingSettingsArgs;
import io.pulumi.azurenative.logic.inputs.EdifactSchemaReferenceArgs;
import io.pulumi.azurenative.logic.inputs.EdifactValidationOverrideArgs;
import io.pulumi.azurenative.logic.inputs.EdifactValidationSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Edifact agreement protocol settings.
 * 
 */
public final class EdifactProtocolSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdifactProtocolSettingsArgs Empty = new EdifactProtocolSettingsArgs();

    /**
     * The EDIFACT acknowledgement settings.
     * 
     */
    @InputImport(name="acknowledgementSettings", required=true)
      private final Input<EdifactAcknowledgementSettingsArgs> acknowledgementSettings;

    public Input<EdifactAcknowledgementSettingsArgs> getAcknowledgementSettings() {
        return this.acknowledgementSettings;
    }

    /**
     * The EDIFACT delimiter override settings.
     * 
     */
    @InputImport(name="edifactDelimiterOverrides")
      private final @Nullable Input<List<EdifactDelimiterOverrideArgs>> edifactDelimiterOverrides;

    public Input<List<EdifactDelimiterOverrideArgs>> getEdifactDelimiterOverrides() {
        return this.edifactDelimiterOverrides == null ? Input.empty() : this.edifactDelimiterOverrides;
    }

    /**
     * The EDIFACT envelope override settings.
     * 
     */
    @InputImport(name="envelopeOverrides")
      private final @Nullable Input<List<EdifactEnvelopeOverrideArgs>> envelopeOverrides;

    public Input<List<EdifactEnvelopeOverrideArgs>> getEnvelopeOverrides() {
        return this.envelopeOverrides == null ? Input.empty() : this.envelopeOverrides;
    }

    /**
     * The EDIFACT envelope settings.
     * 
     */
    @InputImport(name="envelopeSettings", required=true)
      private final Input<EdifactEnvelopeSettingsArgs> envelopeSettings;

    public Input<EdifactEnvelopeSettingsArgs> getEnvelopeSettings() {
        return this.envelopeSettings;
    }

    /**
     * The EDIFACT framing settings.
     * 
     */
    @InputImport(name="framingSettings", required=true)
      private final Input<EdifactFramingSettingsArgs> framingSettings;

    public Input<EdifactFramingSettingsArgs> getFramingSettings() {
        return this.framingSettings;
    }

    /**
     * The EDIFACT message filter.
     * 
     */
    @InputImport(name="messageFilter", required=true)
      private final Input<EdifactMessageFilterArgs> messageFilter;

    public Input<EdifactMessageFilterArgs> getMessageFilter() {
        return this.messageFilter;
    }

    /**
     * The EDIFACT message filter list.
     * 
     */
    @InputImport(name="messageFilterList")
      private final @Nullable Input<List<EdifactMessageIdentifierArgs>> messageFilterList;

    public Input<List<EdifactMessageIdentifierArgs>> getMessageFilterList() {
        return this.messageFilterList == null ? Input.empty() : this.messageFilterList;
    }

    /**
     * The EDIFACT processing Settings.
     * 
     */
    @InputImport(name="processingSettings", required=true)
      private final Input<EdifactProcessingSettingsArgs> processingSettings;

    public Input<EdifactProcessingSettingsArgs> getProcessingSettings() {
        return this.processingSettings;
    }

    /**
     * The EDIFACT schema references.
     * 
     */
    @InputImport(name="schemaReferences", required=true)
      private final Input<List<EdifactSchemaReferenceArgs>> schemaReferences;

    public Input<List<EdifactSchemaReferenceArgs>> getSchemaReferences() {
        return this.schemaReferences;
    }

    /**
     * The EDIFACT validation override settings.
     * 
     */
    @InputImport(name="validationOverrides")
      private final @Nullable Input<List<EdifactValidationOverrideArgs>> validationOverrides;

    public Input<List<EdifactValidationOverrideArgs>> getValidationOverrides() {
        return this.validationOverrides == null ? Input.empty() : this.validationOverrides;
    }

    /**
     * The EDIFACT validation settings.
     * 
     */
    @InputImport(name="validationSettings", required=true)
      private final Input<EdifactValidationSettingsArgs> validationSettings;

    public Input<EdifactValidationSettingsArgs> getValidationSettings() {
        return this.validationSettings;
    }

    public EdifactProtocolSettingsArgs(
        Input<EdifactAcknowledgementSettingsArgs> acknowledgementSettings,
        @Nullable Input<List<EdifactDelimiterOverrideArgs>> edifactDelimiterOverrides,
        @Nullable Input<List<EdifactEnvelopeOverrideArgs>> envelopeOverrides,
        Input<EdifactEnvelopeSettingsArgs> envelopeSettings,
        Input<EdifactFramingSettingsArgs> framingSettings,
        Input<EdifactMessageFilterArgs> messageFilter,
        @Nullable Input<List<EdifactMessageIdentifierArgs>> messageFilterList,
        Input<EdifactProcessingSettingsArgs> processingSettings,
        Input<List<EdifactSchemaReferenceArgs>> schemaReferences,
        @Nullable Input<List<EdifactValidationOverrideArgs>> validationOverrides,
        Input<EdifactValidationSettingsArgs> validationSettings) {
        this.acknowledgementSettings = Objects.requireNonNull(acknowledgementSettings, "expected parameter 'acknowledgementSettings' to be non-null");
        this.edifactDelimiterOverrides = edifactDelimiterOverrides;
        this.envelopeOverrides = envelopeOverrides;
        this.envelopeSettings = Objects.requireNonNull(envelopeSettings, "expected parameter 'envelopeSettings' to be non-null");
        this.framingSettings = Objects.requireNonNull(framingSettings, "expected parameter 'framingSettings' to be non-null");
        this.messageFilter = Objects.requireNonNull(messageFilter, "expected parameter 'messageFilter' to be non-null");
        this.messageFilterList = messageFilterList;
        this.processingSettings = Objects.requireNonNull(processingSettings, "expected parameter 'processingSettings' to be non-null");
        this.schemaReferences = Objects.requireNonNull(schemaReferences, "expected parameter 'schemaReferences' to be non-null");
        this.validationOverrides = validationOverrides;
        this.validationSettings = Objects.requireNonNull(validationSettings, "expected parameter 'validationSettings' to be non-null");
    }

    private EdifactProtocolSettingsArgs() {
        this.acknowledgementSettings = Input.empty();
        this.edifactDelimiterOverrides = Input.empty();
        this.envelopeOverrides = Input.empty();
        this.envelopeSettings = Input.empty();
        this.framingSettings = Input.empty();
        this.messageFilter = Input.empty();
        this.messageFilterList = Input.empty();
        this.processingSettings = Input.empty();
        this.schemaReferences = Input.empty();
        this.validationOverrides = Input.empty();
        this.validationSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactProtocolSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<EdifactAcknowledgementSettingsArgs> acknowledgementSettings;
        private @Nullable Input<List<EdifactDelimiterOverrideArgs>> edifactDelimiterOverrides;
        private @Nullable Input<List<EdifactEnvelopeOverrideArgs>> envelopeOverrides;
        private Input<EdifactEnvelopeSettingsArgs> envelopeSettings;
        private Input<EdifactFramingSettingsArgs> framingSettings;
        private Input<EdifactMessageFilterArgs> messageFilter;
        private @Nullable Input<List<EdifactMessageIdentifierArgs>> messageFilterList;
        private Input<EdifactProcessingSettingsArgs> processingSettings;
        private Input<List<EdifactSchemaReferenceArgs>> schemaReferences;
        private @Nullable Input<List<EdifactValidationOverrideArgs>> validationOverrides;
        private Input<EdifactValidationSettingsArgs> validationSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactProtocolSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acknowledgementSettings = defaults.acknowledgementSettings;
    	      this.edifactDelimiterOverrides = defaults.edifactDelimiterOverrides;
    	      this.envelopeOverrides = defaults.envelopeOverrides;
    	      this.envelopeSettings = defaults.envelopeSettings;
    	      this.framingSettings = defaults.framingSettings;
    	      this.messageFilter = defaults.messageFilter;
    	      this.messageFilterList = defaults.messageFilterList;
    	      this.processingSettings = defaults.processingSettings;
    	      this.schemaReferences = defaults.schemaReferences;
    	      this.validationOverrides = defaults.validationOverrides;
    	      this.validationSettings = defaults.validationSettings;
        }

        public Builder setAcknowledgementSettings(Input<EdifactAcknowledgementSettingsArgs> acknowledgementSettings) {
            this.acknowledgementSettings = Objects.requireNonNull(acknowledgementSettings);
            return this;
        }

        public Builder setAcknowledgementSettings(EdifactAcknowledgementSettingsArgs acknowledgementSettings) {
            this.acknowledgementSettings = Input.of(Objects.requireNonNull(acknowledgementSettings));
            return this;
        }

        public Builder setEdifactDelimiterOverrides(@Nullable Input<List<EdifactDelimiterOverrideArgs>> edifactDelimiterOverrides) {
            this.edifactDelimiterOverrides = edifactDelimiterOverrides;
            return this;
        }

        public Builder setEdifactDelimiterOverrides(@Nullable List<EdifactDelimiterOverrideArgs> edifactDelimiterOverrides) {
            this.edifactDelimiterOverrides = Input.ofNullable(edifactDelimiterOverrides);
            return this;
        }

        public Builder setEnvelopeOverrides(@Nullable Input<List<EdifactEnvelopeOverrideArgs>> envelopeOverrides) {
            this.envelopeOverrides = envelopeOverrides;
            return this;
        }

        public Builder setEnvelopeOverrides(@Nullable List<EdifactEnvelopeOverrideArgs> envelopeOverrides) {
            this.envelopeOverrides = Input.ofNullable(envelopeOverrides);
            return this;
        }

        public Builder setEnvelopeSettings(Input<EdifactEnvelopeSettingsArgs> envelopeSettings) {
            this.envelopeSettings = Objects.requireNonNull(envelopeSettings);
            return this;
        }

        public Builder setEnvelopeSettings(EdifactEnvelopeSettingsArgs envelopeSettings) {
            this.envelopeSettings = Input.of(Objects.requireNonNull(envelopeSettings));
            return this;
        }

        public Builder setFramingSettings(Input<EdifactFramingSettingsArgs> framingSettings) {
            this.framingSettings = Objects.requireNonNull(framingSettings);
            return this;
        }

        public Builder setFramingSettings(EdifactFramingSettingsArgs framingSettings) {
            this.framingSettings = Input.of(Objects.requireNonNull(framingSettings));
            return this;
        }

        public Builder setMessageFilter(Input<EdifactMessageFilterArgs> messageFilter) {
            this.messageFilter = Objects.requireNonNull(messageFilter);
            return this;
        }

        public Builder setMessageFilter(EdifactMessageFilterArgs messageFilter) {
            this.messageFilter = Input.of(Objects.requireNonNull(messageFilter));
            return this;
        }

        public Builder setMessageFilterList(@Nullable Input<List<EdifactMessageIdentifierArgs>> messageFilterList) {
            this.messageFilterList = messageFilterList;
            return this;
        }

        public Builder setMessageFilterList(@Nullable List<EdifactMessageIdentifierArgs> messageFilterList) {
            this.messageFilterList = Input.ofNullable(messageFilterList);
            return this;
        }

        public Builder setProcessingSettings(Input<EdifactProcessingSettingsArgs> processingSettings) {
            this.processingSettings = Objects.requireNonNull(processingSettings);
            return this;
        }

        public Builder setProcessingSettings(EdifactProcessingSettingsArgs processingSettings) {
            this.processingSettings = Input.of(Objects.requireNonNull(processingSettings));
            return this;
        }

        public Builder setSchemaReferences(Input<List<EdifactSchemaReferenceArgs>> schemaReferences) {
            this.schemaReferences = Objects.requireNonNull(schemaReferences);
            return this;
        }

        public Builder setSchemaReferences(List<EdifactSchemaReferenceArgs> schemaReferences) {
            this.schemaReferences = Input.of(Objects.requireNonNull(schemaReferences));
            return this;
        }

        public Builder setValidationOverrides(@Nullable Input<List<EdifactValidationOverrideArgs>> validationOverrides) {
            this.validationOverrides = validationOverrides;
            return this;
        }

        public Builder setValidationOverrides(@Nullable List<EdifactValidationOverrideArgs> validationOverrides) {
            this.validationOverrides = Input.ofNullable(validationOverrides);
            return this;
        }

        public Builder setValidationSettings(Input<EdifactValidationSettingsArgs> validationSettings) {
            this.validationSettings = Objects.requireNonNull(validationSettings);
            return this;
        }

        public Builder setValidationSettings(EdifactValidationSettingsArgs validationSettings) {
            this.validationSettings = Input.of(Objects.requireNonNull(validationSettings));
            return this;
        }
        public EdifactProtocolSettingsArgs build() {
            return new EdifactProtocolSettingsArgs(acknowledgementSettings, edifactDelimiterOverrides, envelopeOverrides, envelopeSettings, framingSettings, messageFilter, messageFilterList, processingSettings, schemaReferences, validationOverrides, validationSettings);
        }
    }
}
