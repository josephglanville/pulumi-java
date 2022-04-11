// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageGetArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateTemplatePredefinedValuesKeyUsageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateTemplatePredefinedValuesKeyUsageGetArgs Empty = new CertificateTemplatePredefinedValuesKeyUsageGetArgs();

    /**
     * Describes high-level ways in which a key may be used.
     * 
     */
    @Import(name="baseKeyUsage")
      private final @Nullable Output<CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageGetArgs> baseKeyUsage;

    public Output<CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageGetArgs> getBaseKeyUsage() {
        return this.baseKeyUsage == null ? Codegen.empty() : this.baseKeyUsage;
    }

    /**
     * Detailed scenarios in which a key may be used.
     * 
     */
    @Import(name="extendedKeyUsage")
      private final @Nullable Output<CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs> extendedKeyUsage;

    public Output<CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs> getExtendedKeyUsage() {
        return this.extendedKeyUsage == null ? Codegen.empty() : this.extendedKeyUsage;
    }

    /**
     * Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message.
     * 
     */
    @Import(name="unknownExtendedKeyUsages")
      private final @Nullable Output<List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageGetArgs>> unknownExtendedKeyUsages;

    public Output<List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageGetArgs>> getUnknownExtendedKeyUsages() {
        return this.unknownExtendedKeyUsages == null ? Codegen.empty() : this.unknownExtendedKeyUsages;
    }

    public CertificateTemplatePredefinedValuesKeyUsageGetArgs(
        @Nullable Output<CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageGetArgs> baseKeyUsage,
        @Nullable Output<CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs> extendedKeyUsage,
        @Nullable Output<List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageGetArgs>> unknownExtendedKeyUsages) {
        this.baseKeyUsage = baseKeyUsage;
        this.extendedKeyUsage = extendedKeyUsage;
        this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
    }

    private CertificateTemplatePredefinedValuesKeyUsageGetArgs() {
        this.baseKeyUsage = Codegen.empty();
        this.extendedKeyUsage = Codegen.empty();
        this.unknownExtendedKeyUsages = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateTemplatePredefinedValuesKeyUsageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageGetArgs> baseKeyUsage;
        private @Nullable Output<CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs> extendedKeyUsage;
        private @Nullable Output<List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageGetArgs>> unknownExtendedKeyUsages;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateTemplatePredefinedValuesKeyUsageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseKeyUsage = defaults.baseKeyUsage;
    	      this.extendedKeyUsage = defaults.extendedKeyUsage;
    	      this.unknownExtendedKeyUsages = defaults.unknownExtendedKeyUsages;
        }

        public Builder baseKeyUsage(@Nullable Output<CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageGetArgs> baseKeyUsage) {
            this.baseKeyUsage = baseKeyUsage;
            return this;
        }
        public Builder baseKeyUsage(@Nullable CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageGetArgs baseKeyUsage) {
            this.baseKeyUsage = Codegen.ofNullable(baseKeyUsage);
            return this;
        }
        public Builder extendedKeyUsage(@Nullable Output<CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs> extendedKeyUsage) {
            this.extendedKeyUsage = extendedKeyUsage;
            return this;
        }
        public Builder extendedKeyUsage(@Nullable CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs extendedKeyUsage) {
            this.extendedKeyUsage = Codegen.ofNullable(extendedKeyUsage);
            return this;
        }
        public Builder unknownExtendedKeyUsages(@Nullable Output<List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageGetArgs>> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
            return this;
        }
        public Builder unknownExtendedKeyUsages(@Nullable List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageGetArgs> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = Codegen.ofNullable(unknownExtendedKeyUsages);
            return this;
        }
        public Builder unknownExtendedKeyUsages(CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageGetArgs... unknownExtendedKeyUsages) {
            return unknownExtendedKeyUsages(List.of(unknownExtendedKeyUsages));
        }        public CertificateTemplatePredefinedValuesKeyUsageGetArgs build() {
            return new CertificateTemplatePredefinedValuesKeyUsageGetArgs(baseKeyUsage, extendedKeyUsage, unknownExtendedKeyUsages);
        }
    }
}
