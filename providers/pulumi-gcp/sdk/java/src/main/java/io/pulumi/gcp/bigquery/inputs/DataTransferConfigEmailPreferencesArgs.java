// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class DataTransferConfigEmailPreferencesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataTransferConfigEmailPreferencesArgs Empty = new DataTransferConfigEmailPreferencesArgs();

    /**
     * If true, email notifications will be sent on transfer run failures.
     * 
     */
    @Import(name="enableFailureEmail", required=true)
      private final Output<Boolean> enableFailureEmail;

    public Output<Boolean> getEnableFailureEmail() {
        return this.enableFailureEmail;
    }

    public DataTransferConfigEmailPreferencesArgs(Output<Boolean> enableFailureEmail) {
        this.enableFailureEmail = Objects.requireNonNull(enableFailureEmail, "expected parameter 'enableFailureEmail' to be non-null");
    }

    private DataTransferConfigEmailPreferencesArgs() {
        this.enableFailureEmail = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataTransferConfigEmailPreferencesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> enableFailureEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(DataTransferConfigEmailPreferencesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableFailureEmail = defaults.enableFailureEmail;
        }

        public Builder enableFailureEmail(Output<Boolean> enableFailureEmail) {
            this.enableFailureEmail = Objects.requireNonNull(enableFailureEmail);
            return this;
        }
        public Builder enableFailureEmail(Boolean enableFailureEmail) {
            this.enableFailureEmail = Output.of(Objects.requireNonNull(enableFailureEmail));
            return this;
        }        public DataTransferConfigEmailPreferencesArgs build() {
            return new DataTransferConfigEmailPreferencesArgs(enableFailureEmail);
        }
    }
}
