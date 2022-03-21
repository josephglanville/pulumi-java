// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Azure credentials For information on our data retention policy for user credentials, see [User credentials](/storage-transfer/docs/data-retention#user-credentials).
 * 
 */
public final class AzureCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureCredentialsArgs Empty = new AzureCredentialsArgs();

    /**
     * Azure shared access signature (SAS). For more information about SAS, see [Grant limited access to Azure Storage resources using shared access signatures (SAS)](https://docs.microsoft.com/en-us/azure/storage/common/storage-sas-overview).
     * 
     */
    @Import(name="sasToken", required=true)
      private final Output<String> sasToken;

    public Output<String> getSasToken() {
        return this.sasToken;
    }

    public AzureCredentialsArgs(Output<String> sasToken) {
        this.sasToken = Objects.requireNonNull(sasToken, "expected parameter 'sasToken' to be non-null");
    }

    private AzureCredentialsArgs() {
        this.sasToken = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> sasToken;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sasToken = defaults.sasToken;
        }

        public Builder sasToken(Output<String> sasToken) {
            this.sasToken = Objects.requireNonNull(sasToken);
            return this;
        }
        public Builder sasToken(String sasToken) {
            this.sasToken = Output.of(Objects.requireNonNull(sasToken));
            return this;
        }        public AzureCredentialsArgs build() {
            return new AzureCredentialsArgs(sasToken);
        }
    }
}
