// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.certificateauthority.outputs.CertificateConfigX509ConfigKeyUsageBaseKeyUsage;
import io.pulumi.gcp.certificateauthority.outputs.CertificateConfigX509ConfigKeyUsageExtendedKeyUsage;
import io.pulumi.gcp.certificateauthority.outputs.CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsage;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class CertificateConfigX509ConfigKeyUsage {
    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    private final CertificateConfigX509ConfigKeyUsageBaseKeyUsage baseKeyUsage;
    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    private final CertificateConfigX509ConfigKeyUsageExtendedKeyUsage extendedKeyUsage;
    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsage> unknownExtendedKeyUsages;

    @CustomType.Constructor
    private CertificateConfigX509ConfigKeyUsage(
        @CustomType.Parameter("baseKeyUsage") CertificateConfigX509ConfigKeyUsageBaseKeyUsage baseKeyUsage,
        @CustomType.Parameter("extendedKeyUsage") CertificateConfigX509ConfigKeyUsageExtendedKeyUsage extendedKeyUsage,
        @CustomType.Parameter("unknownExtendedKeyUsages") @Nullable List<CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsage> unknownExtendedKeyUsages) {
        this.baseKeyUsage = baseKeyUsage;
        this.extendedKeyUsage = extendedKeyUsage;
        this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
    }

    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
    */
    public CertificateConfigX509ConfigKeyUsageBaseKeyUsage getBaseKeyUsage() {
        return this.baseKeyUsage;
    }
    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
    */
    public CertificateConfigX509ConfigKeyUsageExtendedKeyUsage getExtendedKeyUsage() {
        return this.extendedKeyUsage;
    }
    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * Structure is documented below.
     * 
    */
    public List<CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsage> getUnknownExtendedKeyUsages() {
        return this.unknownExtendedKeyUsages == null ? List.of() : this.unknownExtendedKeyUsages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigX509ConfigKeyUsage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateConfigX509ConfigKeyUsageBaseKeyUsage baseKeyUsage;
        private CertificateConfigX509ConfigKeyUsageExtendedKeyUsage extendedKeyUsage;
        private @Nullable List<CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsage> unknownExtendedKeyUsages;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigX509ConfigKeyUsage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseKeyUsage = defaults.baseKeyUsage;
    	      this.extendedKeyUsage = defaults.extendedKeyUsage;
    	      this.unknownExtendedKeyUsages = defaults.unknownExtendedKeyUsages;
        }

        public Builder baseKeyUsage(CertificateConfigX509ConfigKeyUsageBaseKeyUsage baseKeyUsage) {
            this.baseKeyUsage = Objects.requireNonNull(baseKeyUsage);
            return this;
        }
        public Builder extendedKeyUsage(CertificateConfigX509ConfigKeyUsageExtendedKeyUsage extendedKeyUsage) {
            this.extendedKeyUsage = Objects.requireNonNull(extendedKeyUsage);
            return this;
        }
        public Builder unknownExtendedKeyUsages(@Nullable List<CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsage> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
            return this;
        }
        public Builder unknownExtendedKeyUsages(CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsage... unknownExtendedKeyUsages) {
            return unknownExtendedKeyUsages(List.of(unknownExtendedKeyUsages));
        }        public CertificateConfigX509ConfigKeyUsage build() {
            return new CertificateConfigX509ConfigKeyUsage(baseKeyUsage, extendedKeyUsage, unknownExtendedKeyUsages);
        }
    }
}
