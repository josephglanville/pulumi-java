// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.azurenative.databox.outputs.CloudErrorResponse;
import io.pulumi.azurenative.databox.outputs.DataBoxSecretResponse;
import io.pulumi.azurenative.databox.outputs.DcAccessSecurityCodeResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataboxJobSecretsResponse {
    private final DcAccessSecurityCodeResponse dcAccessSecurityCode;
    private final CloudErrorResponse error;
    private final String jobSecretsType;
    private final @Nullable List<DataBoxSecretResponse> podSecrets;

    @OutputCustomType.Constructor({"dcAccessSecurityCode","error","jobSecretsType","podSecrets"})
    private DataboxJobSecretsResponse(
        DcAccessSecurityCodeResponse dcAccessSecurityCode,
        CloudErrorResponse error,
        String jobSecretsType,
        @Nullable List<DataBoxSecretResponse> podSecrets) {
        this.dcAccessSecurityCode = Objects.requireNonNull(dcAccessSecurityCode);
        this.error = Objects.requireNonNull(error);
        this.jobSecretsType = Objects.requireNonNull(jobSecretsType);
        this.podSecrets = podSecrets;
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
    public List<DataBoxSecretResponse> getPodSecrets() {
        return this.podSecrets == null ? List.of() : this.podSecrets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataboxJobSecretsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DcAccessSecurityCodeResponse dcAccessSecurityCode;
        private CloudErrorResponse error;
        private String jobSecretsType;
        private @Nullable List<DataBoxSecretResponse> podSecrets;

        public Builder() {
    	      // Empty
        }

        public Builder(DataboxJobSecretsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dcAccessSecurityCode = defaults.dcAccessSecurityCode;
    	      this.error = defaults.error;
    	      this.jobSecretsType = defaults.jobSecretsType;
    	      this.podSecrets = defaults.podSecrets;
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

        public Builder setPodSecrets(@Nullable List<DataBoxSecretResponse> podSecrets) {
            this.podSecrets = podSecrets;
            return this;
        }

        public DataboxJobSecretsResponse build() {
            return new DataboxJobSecretsResponse(dcAccessSecurityCode, error, jobSecretsType, podSecrets);
        }
    }
}
