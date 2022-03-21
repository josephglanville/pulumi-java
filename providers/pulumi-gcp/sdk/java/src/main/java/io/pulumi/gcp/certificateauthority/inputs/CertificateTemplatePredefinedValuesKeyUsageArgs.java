// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateTemplatePredefinedValuesKeyUsageArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateTemplatePredefinedValuesKeyUsageArgs Empty = new CertificateTemplatePredefinedValuesKeyUsageArgs();

    /**
     * Describes high-level ways in which a key may be used.
     * 
     */
    @Import(name="baseKeyUsage")
      private final @Nullable Output<CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs> baseKeyUsage;

    public Output<CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs> getBaseKeyUsage() {
        return this.baseKeyUsage == null ? Output.empty() : this.baseKeyUsage;
    }

    /**
     * Detailed scenarios in which a key may be used.
     * 
     */
    @Import(name="extendedKeyUsage")
      private final @Nullable Output<CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageArgs> extendedKeyUsage;

    public Output<CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageArgs> getExtendedKeyUsage() {
        return this.extendedKeyUsage == null ? Output.empty() : this.extendedKeyUsage;
    }

    /**
     * Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message.
     * 
     */
    @Import(name="unknownExtendedKeyUsages")
      private final @Nullable Output<List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages;

    public Output<List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs>> getUnknownExtendedKeyUsages() {
        return this.unknownExtendedKeyUsages == null ? Output.empty() : this.unknownExtendedKeyUsages;
    }

    public CertificateTemplatePredefinedValuesKeyUsageArgs(
        @Nullable Output<CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs> baseKeyUsage,
        @Nullable Output<CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageArgs> extendedKeyUsage,
        @Nullable Output<List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages) {
        this.baseKeyUsage = baseKeyUsage;
        this.extendedKeyUsage = extendedKeyUsage;
        this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
    }

    private CertificateTemplatePredefinedValuesKeyUsageArgs() {
        this.baseKeyUsage = Output.empty();
        this.extendedKeyUsage = Output.empty();
        this.unknownExtendedKeyUsages = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateTemplatePredefinedValuesKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs> baseKeyUsage;
        private @Nullable Output<CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageArgs> extendedKeyUsage;
        private @Nullable Output<List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateTemplatePredefinedValuesKeyUsageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseKeyUsage = defaults.baseKeyUsage;
    	      this.extendedKeyUsage = defaults.extendedKeyUsage;
    	      this.unknownExtendedKeyUsages = defaults.unknownExtendedKeyUsages;
        }

        public Builder baseKeyUsage(@Nullable Output<CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs> baseKeyUsage) {
            this.baseKeyUsage = baseKeyUsage;
            return this;
        }
        public Builder baseKeyUsage(@Nullable CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs baseKeyUsage) {
            this.baseKeyUsage = Output.ofNullable(baseKeyUsage);
            return this;
        }
        public Builder extendedKeyUsage(@Nullable Output<CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageArgs> extendedKeyUsage) {
            this.extendedKeyUsage = extendedKeyUsage;
            return this;
        }
        public Builder extendedKeyUsage(@Nullable CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageArgs extendedKeyUsage) {
            this.extendedKeyUsage = Output.ofNullable(extendedKeyUsage);
            return this;
        }
        public Builder unknownExtendedKeyUsages(@Nullable Output<List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
            return this;
        }
        public Builder unknownExtendedKeyUsages(@Nullable List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = Output.ofNullable(unknownExtendedKeyUsages);
            return this;
        }
        public Builder unknownExtendedKeyUsages(CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs... unknownExtendedKeyUsages) {
            return unknownExtendedKeyUsages(List.of(unknownExtendedKeyUsages));
        }        public CertificateTemplatePredefinedValuesKeyUsageArgs build() {
            return new CertificateTemplatePredefinedValuesKeyUsageArgs(baseKeyUsage, extendedKeyUsage, unknownExtendedKeyUsages);
        }
    }
}
