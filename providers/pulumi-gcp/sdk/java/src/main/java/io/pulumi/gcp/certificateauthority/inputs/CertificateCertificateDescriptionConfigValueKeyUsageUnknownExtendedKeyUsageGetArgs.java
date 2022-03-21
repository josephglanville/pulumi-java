// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdGetArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageGetArgs Empty = new CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageGetArgs();

    @Import(name="obectIds")
      private final @Nullable Output<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdGetArgs>> obectIds;

    public Output<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdGetArgs>> getObectIds() {
        return this.obectIds == null ? Output.empty() : this.obectIds;
    }

    public CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageGetArgs(@Nullable Output<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdGetArgs>> obectIds) {
        this.obectIds = obectIds;
    }

    private CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageGetArgs() {
        this.obectIds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdGetArgs>> obectIds;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.obectIds = defaults.obectIds;
        }

        public Builder obectIds(@Nullable Output<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdGetArgs>> obectIds) {
            this.obectIds = obectIds;
            return this;
        }
        public Builder obectIds(@Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdGetArgs> obectIds) {
            this.obectIds = Output.ofNullable(obectIds);
            return this;
        }
        public Builder obectIds(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdGetArgs... obectIds) {
            return obectIds(List.of(obectIds));
        }        public CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageGetArgs build() {
            return new CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageGetArgs(obectIds);
        }
    }
}
