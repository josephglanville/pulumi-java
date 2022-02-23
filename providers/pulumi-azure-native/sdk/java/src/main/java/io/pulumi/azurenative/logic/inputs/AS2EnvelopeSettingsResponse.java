// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * The AS2 agreement envelope settings.
 * 
 */
public final class AS2EnvelopeSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AS2EnvelopeSettingsResponse Empty = new AS2EnvelopeSettingsResponse();

    /**
     * The value indicating whether to auto generate file name.
     * 
     */
    @InputImport(name="autogenerateFileName", required=true)
      private final Boolean autogenerateFileName;

    public Boolean getAutogenerateFileName() {
        return this.autogenerateFileName;
    }

    /**
     * The template for file name.
     * 
     */
    @InputImport(name="fileNameTemplate", required=true)
      private final String fileNameTemplate;

    public String getFileNameTemplate() {
        return this.fileNameTemplate;
    }

    /**
     * The message content type.
     * 
     */
    @InputImport(name="messageContentType", required=true)
      private final String messageContentType;

    public String getMessageContentType() {
        return this.messageContentType;
    }

    /**
     * The value indicating whether to suspend message on file name generation error.
     * 
     */
    @InputImport(name="suspendMessageOnFileNameGenerationError", required=true)
      private final Boolean suspendMessageOnFileNameGenerationError;

    public Boolean getSuspendMessageOnFileNameGenerationError() {
        return this.suspendMessageOnFileNameGenerationError;
    }

    /**
     * The value indicating whether to transmit file name in mime header.
     * 
     */
    @InputImport(name="transmitFileNameInMimeHeader", required=true)
      private final Boolean transmitFileNameInMimeHeader;

    public Boolean getTransmitFileNameInMimeHeader() {
        return this.transmitFileNameInMimeHeader;
    }

    public AS2EnvelopeSettingsResponse(
        Boolean autogenerateFileName,
        String fileNameTemplate,
        String messageContentType,
        Boolean suspendMessageOnFileNameGenerationError,
        Boolean transmitFileNameInMimeHeader) {
        this.autogenerateFileName = Objects.requireNonNull(autogenerateFileName, "expected parameter 'autogenerateFileName' to be non-null");
        this.fileNameTemplate = Objects.requireNonNull(fileNameTemplate, "expected parameter 'fileNameTemplate' to be non-null");
        this.messageContentType = Objects.requireNonNull(messageContentType, "expected parameter 'messageContentType' to be non-null");
        this.suspendMessageOnFileNameGenerationError = Objects.requireNonNull(suspendMessageOnFileNameGenerationError, "expected parameter 'suspendMessageOnFileNameGenerationError' to be non-null");
        this.transmitFileNameInMimeHeader = Objects.requireNonNull(transmitFileNameInMimeHeader, "expected parameter 'transmitFileNameInMimeHeader' to be non-null");
    }

    private AS2EnvelopeSettingsResponse() {
        this.autogenerateFileName = null;
        this.fileNameTemplate = null;
        this.messageContentType = null;
        this.suspendMessageOnFileNameGenerationError = null;
        this.transmitFileNameInMimeHeader = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2EnvelopeSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autogenerateFileName;
        private String fileNameTemplate;
        private String messageContentType;
        private Boolean suspendMessageOnFileNameGenerationError;
        private Boolean transmitFileNameInMimeHeader;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2EnvelopeSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autogenerateFileName = defaults.autogenerateFileName;
    	      this.fileNameTemplate = defaults.fileNameTemplate;
    	      this.messageContentType = defaults.messageContentType;
    	      this.suspendMessageOnFileNameGenerationError = defaults.suspendMessageOnFileNameGenerationError;
    	      this.transmitFileNameInMimeHeader = defaults.transmitFileNameInMimeHeader;
        }

        public Builder setAutogenerateFileName(Boolean autogenerateFileName) {
            this.autogenerateFileName = Objects.requireNonNull(autogenerateFileName);
            return this;
        }

        public Builder setFileNameTemplate(String fileNameTemplate) {
            this.fileNameTemplate = Objects.requireNonNull(fileNameTemplate);
            return this;
        }

        public Builder setMessageContentType(String messageContentType) {
            this.messageContentType = Objects.requireNonNull(messageContentType);
            return this;
        }

        public Builder setSuspendMessageOnFileNameGenerationError(Boolean suspendMessageOnFileNameGenerationError) {
            this.suspendMessageOnFileNameGenerationError = Objects.requireNonNull(suspendMessageOnFileNameGenerationError);
            return this;
        }

        public Builder setTransmitFileNameInMimeHeader(Boolean transmitFileNameInMimeHeader) {
            this.transmitFileNameInMimeHeader = Objects.requireNonNull(transmitFileNameInMimeHeader);
            return this;
        }
        public AS2EnvelopeSettingsResponse build() {
            return new AS2EnvelopeSettingsResponse(autogenerateFileName, fileNameTemplate, messageContentType, suspendMessageOnFileNameGenerationError, transmitFileNameInMimeHeader);
        }
    }
}
