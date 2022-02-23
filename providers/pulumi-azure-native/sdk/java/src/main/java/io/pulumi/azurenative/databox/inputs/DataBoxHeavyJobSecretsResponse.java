// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.CloudErrorResponse;
import io.pulumi.azurenative.databox.inputs.DataBoxHeavySecretResponse;
import io.pulumi.azurenative.databox.inputs.DcAccessSecurityCodeResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The secrets related to a databox heavy job.
 * 
 */
public final class DataBoxHeavyJobSecretsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataBoxHeavyJobSecretsResponse Empty = new DataBoxHeavyJobSecretsResponse();

    /**
     * Contains the list of secret objects for a databox heavy job.
     * 
     */
    @InputImport(name="cabinetPodSecrets", required=true)
      private final List<DataBoxHeavySecretResponse> cabinetPodSecrets;

    public List<DataBoxHeavySecretResponse> getCabinetPodSecrets() {
        return this.cabinetPodSecrets;
    }

    /**
     * Dc Access Security Code for Customer Managed Shipping
     * 
     */
    @InputImport(name="dcAccessSecurityCode", required=true)
      private final DcAccessSecurityCodeResponse dcAccessSecurityCode;

    public DcAccessSecurityCodeResponse getDcAccessSecurityCode() {
        return this.dcAccessSecurityCode;
    }

    /**
     * Error while fetching the secrets.
     * 
     */
    @InputImport(name="error", required=true)
      private final CloudErrorResponse error;

    public CloudErrorResponse getError() {
        return this.error;
    }

    /**
     * Used to indicate what type of job secrets object.
     * Expected value is 'DataBoxHeavy'.
     * 
     */
    @InputImport(name="jobSecretsType", required=true)
      private final String jobSecretsType;

    public String getJobSecretsType() {
        return this.jobSecretsType;
    }

    public DataBoxHeavyJobSecretsResponse(
        List<DataBoxHeavySecretResponse> cabinetPodSecrets,
        DcAccessSecurityCodeResponse dcAccessSecurityCode,
        CloudErrorResponse error,
        String jobSecretsType) {
        this.cabinetPodSecrets = Objects.requireNonNull(cabinetPodSecrets, "expected parameter 'cabinetPodSecrets' to be non-null");
        this.dcAccessSecurityCode = Objects.requireNonNull(dcAccessSecurityCode, "expected parameter 'dcAccessSecurityCode' to be non-null");
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
        this.jobSecretsType = Objects.requireNonNull(jobSecretsType, "expected parameter 'jobSecretsType' to be non-null");
    }

    private DataBoxHeavyJobSecretsResponse() {
        this.cabinetPodSecrets = List.of();
        this.dcAccessSecurityCode = null;
        this.error = null;
        this.jobSecretsType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataBoxHeavyJobSecretsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DataBoxHeavySecretResponse> cabinetPodSecrets;
        private DcAccessSecurityCodeResponse dcAccessSecurityCode;
        private CloudErrorResponse error;
        private String jobSecretsType;

        public Builder() {
    	      // Empty
        }

        public Builder(DataBoxHeavyJobSecretsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cabinetPodSecrets = defaults.cabinetPodSecrets;
    	      this.dcAccessSecurityCode = defaults.dcAccessSecurityCode;
    	      this.error = defaults.error;
    	      this.jobSecretsType = defaults.jobSecretsType;
        }

        public Builder setCabinetPodSecrets(List<DataBoxHeavySecretResponse> cabinetPodSecrets) {
            this.cabinetPodSecrets = Objects.requireNonNull(cabinetPodSecrets);
            return this;
        }

        public Builder setDcAccessSecurityCode(DcAccessSecurityCodeResponse dcAccessSecurityCode) {
            this.dcAccessSecurityCode = Objects.requireNonNull(dcAccessSecurityCode);
            return this;
        }

        public Builder setError(CloudErrorResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setJobSecretsType(String jobSecretsType) {
            this.jobSecretsType = Objects.requireNonNull(jobSecretsType);
            return this;
        }
        public DataBoxHeavyJobSecretsResponse build() {
            return new DataBoxHeavyJobSecretsResponse(cabinetPodSecrets, dcAccessSecurityCode, error, jobSecretsType);
        }
    }
}
