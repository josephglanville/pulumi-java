// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquerydatatransfer_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Represents preferences for sending email notifications for transfer run events.
 * 
 */
public final class EmailPreferencesResponse extends io.pulumi.resources.InvokeArgs {

    public static final EmailPreferencesResponse Empty = new EmailPreferencesResponse();

    /**
     * If true, email notifications will be sent on transfer run failures.
     * 
     */
    @Import(name="enableFailureEmail", required=true)
      private final Boolean enableFailureEmail;

    public Boolean getEnableFailureEmail() {
        return this.enableFailureEmail;
    }

    public EmailPreferencesResponse(Boolean enableFailureEmail) {
        this.enableFailureEmail = Objects.requireNonNull(enableFailureEmail, "expected parameter 'enableFailureEmail' to be non-null");
    }

    private EmailPreferencesResponse() {
        this.enableFailureEmail = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmailPreferencesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableFailureEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(EmailPreferencesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableFailureEmail = defaults.enableFailureEmail;
        }

        public Builder enableFailureEmail(Boolean enableFailureEmail) {
            this.enableFailureEmail = Objects.requireNonNull(enableFailureEmail);
            return this;
        }        public EmailPreferencesResponse build() {
            return new EmailPreferencesResponse(enableFailureEmail);
        }
    }
}
