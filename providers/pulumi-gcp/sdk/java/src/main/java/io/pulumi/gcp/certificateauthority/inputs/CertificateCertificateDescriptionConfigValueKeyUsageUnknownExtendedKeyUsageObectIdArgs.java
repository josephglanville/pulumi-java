// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs Empty = new CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs();

    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * 
     */
    @Import(name="objectIdPaths")
      private final @Nullable Output<List<Integer>> objectIdPaths;

    public Output<List<Integer>> getObjectIdPaths() {
        return this.objectIdPaths == null ? Output.empty() : this.objectIdPaths;
    }

    public CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs(@Nullable Output<List<Integer>> objectIdPaths) {
        this.objectIdPaths = objectIdPaths;
    }

    private CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs() {
        this.objectIdPaths = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Integer>> objectIdPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectIdPaths = defaults.objectIdPaths;
        }

        public Builder objectIdPaths(@Nullable Output<List<Integer>> objectIdPaths) {
            this.objectIdPaths = objectIdPaths;
            return this;
        }
        public Builder objectIdPaths(@Nullable List<Integer> objectIdPaths) {
            this.objectIdPaths = Output.ofNullable(objectIdPaths);
            return this;
        }
        public Builder objectIdPaths(Integer... objectIdPaths) {
            return objectIdPaths(List.of(objectIdPaths));
        }        public CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs build() {
            return new CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs(objectIdPaths);
        }
    }
}
