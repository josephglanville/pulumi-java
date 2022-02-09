// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.azurenative.databox.outputs.CloudErrorResponse;
import io.pulumi.azurenative.databox.outputs.DcAccessSecurityCodeResponse;
import io.pulumi.azurenative.databox.outputs.DiskSecretResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DataBoxDiskJobSecretsResponse {
    private final DcAccessSecurityCodeResponse dcAccessSecurityCode;
    private final List<DiskSecretResponse> diskSecrets;
    private final CloudErrorResponse error;
    private final Boolean isPasskeyUserDefined;
    private final String jobSecretsType;
    private final String passKey;

    @OutputCustomType.Constructor({"dcAccessSecurityCode","diskSecrets","error","isPasskeyUserDefined","jobSecretsType","passKey"})
    private DataBoxDiskJobSecretsResponse(
        DcAccessSecurityCodeResponse dcAccessSecurityCode,
        List<DiskSecretResponse> diskSecrets,
        CloudErrorResponse error,
        Boolean isPasskeyUserDefined,
        String jobSecretsType,
        String passKey) {
        this.dcAccessSecurityCode = Objects.requireNonNull(dcAccessSecurityCode);
        this.diskSecrets = Objects.requireNonNull(diskSecrets);
        this.error = Objects.requireNonNull(error);
        this.isPasskeyUserDefined = Objects.requireNonNull(isPasskeyUserDefined);
        this.jobSecretsType = Objects.requireNonNull(jobSecretsType);
        this.passKey = Objects.requireNonNull(passKey);
    }

    public DcAccessSecurityCodeResponse getDcAccessSecurityCode() {
        return this.dcAccessSecurityCode;
    }
    public List<DiskSecretResponse> getDiskSecrets() {
        return this.diskSecrets;
    }
    public CloudErrorResponse getError() {
        return this.error;
    }
    public Boolean getIsPasskeyUserDefined() {
        return this.isPasskeyUserDefined;
    }
    public String getJobSecretsType() {
        return this.jobSecretsType;
    }
    public String getPassKey() {
        return this.passKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataBoxDiskJobSecretsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DcAccessSecurityCodeResponse dcAccessSecurityCode;
        private List<DiskSecretResponse> diskSecrets;
        private CloudErrorResponse error;
        private Boolean isPasskeyUserDefined;
        private String jobSecretsType;
        private String passKey;

        public Builder() {
    	      // Empty
        }

        public Builder(DataBoxDiskJobSecretsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dcAccessSecurityCode = defaults.dcAccessSecurityCode;
    	      this.diskSecrets = defaults.diskSecrets;
    	      this.error = defaults.error;
    	      this.isPasskeyUserDefined = defaults.isPasskeyUserDefined;
    	      this.jobSecretsType = defaults.jobSecretsType;
    	      this.passKey = defaults.passKey;
        }

        public Builder setDcAccessSecurityCode(DcAccessSecurityCodeResponse dcAccessSecurityCode) {
            this.dcAccessSecurityCode = Objects.requireNonNull(dcAccessSecurityCode);
            return this;
        }

        public Builder setDiskSecrets(List<DiskSecretResponse> diskSecrets) {
            this.diskSecrets = Objects.requireNonNull(diskSecrets);
            return this;
        }

        public Builder setError(CloudErrorResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setIsPasskeyUserDefined(Boolean isPasskeyUserDefined) {
            this.isPasskeyUserDefined = Objects.requireNonNull(isPasskeyUserDefined);
            return this;
        }

        public Builder setJobSecretsType(String jobSecretsType) {
            this.jobSecretsType = Objects.requireNonNull(jobSecretsType);
            return this;
        }

        public Builder setPassKey(String passKey) {
            this.passKey = Objects.requireNonNull(passKey);
            return this;
        }

        public DataBoxDiskJobSecretsResponse build() {
            return new DataBoxDiskJobSecretsResponse(dcAccessSecurityCode, diskSecrets, error, isPasskeyUserDefined, jobSecretsType, passKey);
        }
    }
}
