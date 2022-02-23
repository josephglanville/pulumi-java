// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * The AS2 agreement acknowledgement connection settings.
 * 
 */
public final class AS2AcknowledgementConnectionSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AS2AcknowledgementConnectionSettingsResponse Empty = new AS2AcknowledgementConnectionSettingsResponse();

    /**
     * Indicates whether to ignore mismatch in certificate name.
     * 
     */
    @InputImport(name="ignoreCertificateNameMismatch", required=true)
      private final Boolean ignoreCertificateNameMismatch;

    public Boolean getIgnoreCertificateNameMismatch() {
        return this.ignoreCertificateNameMismatch;
    }

    /**
     * Indicates whether to keep the connection alive.
     * 
     */
    @InputImport(name="keepHttpConnectionAlive", required=true)
      private final Boolean keepHttpConnectionAlive;

    public Boolean getKeepHttpConnectionAlive() {
        return this.keepHttpConnectionAlive;
    }

    /**
     * Indicates whether to support HTTP status code 'CONTINUE'.
     * 
     */
    @InputImport(name="supportHttpStatusCodeContinue", required=true)
      private final Boolean supportHttpStatusCodeContinue;

    public Boolean getSupportHttpStatusCodeContinue() {
        return this.supportHttpStatusCodeContinue;
    }

    /**
     * Indicates whether to unfold the HTTP headers.
     * 
     */
    @InputImport(name="unfoldHttpHeaders", required=true)
      private final Boolean unfoldHttpHeaders;

    public Boolean getUnfoldHttpHeaders() {
        return this.unfoldHttpHeaders;
    }

    public AS2AcknowledgementConnectionSettingsResponse(
        Boolean ignoreCertificateNameMismatch,
        Boolean keepHttpConnectionAlive,
        Boolean supportHttpStatusCodeContinue,
        Boolean unfoldHttpHeaders) {
        this.ignoreCertificateNameMismatch = Objects.requireNonNull(ignoreCertificateNameMismatch, "expected parameter 'ignoreCertificateNameMismatch' to be non-null");
        this.keepHttpConnectionAlive = Objects.requireNonNull(keepHttpConnectionAlive, "expected parameter 'keepHttpConnectionAlive' to be non-null");
        this.supportHttpStatusCodeContinue = Objects.requireNonNull(supportHttpStatusCodeContinue, "expected parameter 'supportHttpStatusCodeContinue' to be non-null");
        this.unfoldHttpHeaders = Objects.requireNonNull(unfoldHttpHeaders, "expected parameter 'unfoldHttpHeaders' to be non-null");
    }

    private AS2AcknowledgementConnectionSettingsResponse() {
        this.ignoreCertificateNameMismatch = null;
        this.keepHttpConnectionAlive = null;
        this.supportHttpStatusCodeContinue = null;
        this.unfoldHttpHeaders = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2AcknowledgementConnectionSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean ignoreCertificateNameMismatch;
        private Boolean keepHttpConnectionAlive;
        private Boolean supportHttpStatusCodeContinue;
        private Boolean unfoldHttpHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2AcknowledgementConnectionSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreCertificateNameMismatch = defaults.ignoreCertificateNameMismatch;
    	      this.keepHttpConnectionAlive = defaults.keepHttpConnectionAlive;
    	      this.supportHttpStatusCodeContinue = defaults.supportHttpStatusCodeContinue;
    	      this.unfoldHttpHeaders = defaults.unfoldHttpHeaders;
        }

        public Builder setIgnoreCertificateNameMismatch(Boolean ignoreCertificateNameMismatch) {
            this.ignoreCertificateNameMismatch = Objects.requireNonNull(ignoreCertificateNameMismatch);
            return this;
        }

        public Builder setKeepHttpConnectionAlive(Boolean keepHttpConnectionAlive) {
            this.keepHttpConnectionAlive = Objects.requireNonNull(keepHttpConnectionAlive);
            return this;
        }

        public Builder setSupportHttpStatusCodeContinue(Boolean supportHttpStatusCodeContinue) {
            this.supportHttpStatusCodeContinue = Objects.requireNonNull(supportHttpStatusCodeContinue);
            return this;
        }

        public Builder setUnfoldHttpHeaders(Boolean unfoldHttpHeaders) {
            this.unfoldHttpHeaders = Objects.requireNonNull(unfoldHttpHeaders);
            return this;
        }
        public AS2AcknowledgementConnectionSettingsResponse build() {
            return new AS2AcknowledgementConnectionSettingsResponse(ignoreCertificateNameMismatch, keepHttpConnectionAlive, supportHttpStatusCodeContinue, unfoldHttpHeaders);
        }
    }
}
