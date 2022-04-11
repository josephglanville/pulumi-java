// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionGetArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageGetArgs Empty = new CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageGetArgs();

    @Import(name="keyUsageOptions")
      private final @Nullable Output<List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionGetArgs>> keyUsageOptions;

    public Output<List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionGetArgs>> getKeyUsageOptions() {
        return this.keyUsageOptions == null ? Codegen.empty() : this.keyUsageOptions;
    }

    public CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageGetArgs(@Nullable Output<List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionGetArgs>> keyUsageOptions) {
        this.keyUsageOptions = keyUsageOptions;
    }

    private CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageGetArgs() {
        this.keyUsageOptions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionGetArgs>> keyUsageOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUsageOptions = defaults.keyUsageOptions;
        }

        public Builder keyUsageOptions(@Nullable Output<List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionGetArgs>> keyUsageOptions) {
            this.keyUsageOptions = keyUsageOptions;
            return this;
        }
        public Builder keyUsageOptions(@Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionGetArgs> keyUsageOptions) {
            this.keyUsageOptions = Codegen.ofNullable(keyUsageOptions);
            return this;
        }
        public Builder keyUsageOptions(CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionGetArgs... keyUsageOptions) {
            return keyUsageOptions(List.of(keyUsageOptions));
        }        public CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageGetArgs build() {
            return new CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageGetArgs(keyUsageOptions);
        }
    }
}
