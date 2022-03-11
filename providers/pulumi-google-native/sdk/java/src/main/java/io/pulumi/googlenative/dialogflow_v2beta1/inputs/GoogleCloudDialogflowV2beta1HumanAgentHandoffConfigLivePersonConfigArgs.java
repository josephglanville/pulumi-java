// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration specific to LivePerson (https://www.liveperson.com).
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs Empty = new GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs();

    /**
     * Account number of the LivePerson account to connect. This is the account number you input at the login page.
     * 
     */
    @InputImport(name="accountNumber", required=true)
      private final Output<String> accountNumber;

    public Output<String> getAccountNumber() {
        return this.accountNumber;
    }

    public GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs(Output<String> accountNumber) {
        this.accountNumber = Objects.requireNonNull(accountNumber, "expected parameter 'accountNumber' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs() {
        this.accountNumber = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountNumber = defaults.accountNumber;
        }

        public Builder accountNumber(Output<String> accountNumber) {
            this.accountNumber = Objects.requireNonNull(accountNumber);
            return this;
        }

        public Builder accountNumber(String accountNumber) {
            this.accountNumber = Output.of(Objects.requireNonNull(accountNumber));
            return this;
        }
        public GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs build() {
            return new GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs(accountNumber);
        }
    }
}
