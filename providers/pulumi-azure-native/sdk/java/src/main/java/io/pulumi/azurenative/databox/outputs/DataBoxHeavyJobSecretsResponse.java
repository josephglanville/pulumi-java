// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.azurenative.databox.outputs.CloudErrorResponse;
import io.pulumi.azurenative.databox.outputs.DataBoxHeavySecretResponse;
import io.pulumi.azurenative.databox.outputs.DcAccessSecurityCodeResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DataBoxHeavyJobSecretsResponse {
    private final List<DataBoxHeavySecretResponse> cabinetPodSecrets;
    private final DcAccessSecurityCodeResponse dcAccessSecurityCode;
    private final CloudErrorResponse error;
    private final String jobSecretsType;

    @OutputCustomType.Constructor({"cabinetPodSecrets","dcAccessSecurityCode","error","jobSecretsType"})
    private DataBoxHeavyJobSecretsResponse(
        List<DataBoxHeavySecretResponse> cabinetPodSecrets,
        DcAccessSecurityCodeResponse dcAccessSecurityCode,
        CloudErrorResponse error,
        String jobSecretsType) {
        this.cabinetPodSecrets = Objects.requireNonNull(cabinetPodSecrets);
        this.dcAccessSecurityCode = Objects.requireNonNull(dcAccessSecurityCode);
        this.error = Objects.requireNonNull(error);
        this.jobSecretsType = Objects.requireNonNull(jobSecretsType);
    }

    public List<DataBoxHeavySecretResponse> getCabinetPodSecrets() {
        return this.cabinetPodSecrets;
    }
    public DcAccessSecurityCodeResponse getDcAccessSecurityCode() {
        return this.dcAccessSecurityCode;
    }
    public CloudErrorResponse getError() {
        return this.error;
    }
    public String getJobSecretsType() {
        return this.jobSecretsType;
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
