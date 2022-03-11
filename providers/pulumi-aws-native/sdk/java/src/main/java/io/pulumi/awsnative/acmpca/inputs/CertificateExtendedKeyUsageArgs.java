// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Structure that contains X.509 ExtendedKeyUsage information.
 * 
 */
public final class CertificateExtendedKeyUsageArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateExtendedKeyUsageArgs Empty = new CertificateExtendedKeyUsageArgs();

    @InputImport(name="extendedKeyUsageObjectIdentifier")
      private final @Nullable Output<String> extendedKeyUsageObjectIdentifier;

    public Output<String> getExtendedKeyUsageObjectIdentifier() {
        return this.extendedKeyUsageObjectIdentifier == null ? Output.empty() : this.extendedKeyUsageObjectIdentifier;
    }

    @InputImport(name="extendedKeyUsageType")
      private final @Nullable Output<String> extendedKeyUsageType;

    public Output<String> getExtendedKeyUsageType() {
        return this.extendedKeyUsageType == null ? Output.empty() : this.extendedKeyUsageType;
    }

    public CertificateExtendedKeyUsageArgs(
        @Nullable Output<String> extendedKeyUsageObjectIdentifier,
        @Nullable Output<String> extendedKeyUsageType) {
        this.extendedKeyUsageObjectIdentifier = extendedKeyUsageObjectIdentifier;
        this.extendedKeyUsageType = extendedKeyUsageType;
    }

    private CertificateExtendedKeyUsageArgs() {
        this.extendedKeyUsageObjectIdentifier = Output.empty();
        this.extendedKeyUsageType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateExtendedKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> extendedKeyUsageObjectIdentifier;
        private @Nullable Output<String> extendedKeyUsageType;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateExtendedKeyUsageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extendedKeyUsageObjectIdentifier = defaults.extendedKeyUsageObjectIdentifier;
    	      this.extendedKeyUsageType = defaults.extendedKeyUsageType;
        }

        public Builder extendedKeyUsageObjectIdentifier(@Nullable Output<String> extendedKeyUsageObjectIdentifier) {
            this.extendedKeyUsageObjectIdentifier = extendedKeyUsageObjectIdentifier;
            return this;
        }

        public Builder extendedKeyUsageObjectIdentifier(@Nullable String extendedKeyUsageObjectIdentifier) {
            this.extendedKeyUsageObjectIdentifier = Output.ofNullable(extendedKeyUsageObjectIdentifier);
            return this;
        }

        public Builder extendedKeyUsageType(@Nullable Output<String> extendedKeyUsageType) {
            this.extendedKeyUsageType = extendedKeyUsageType;
            return this;
        }

        public Builder extendedKeyUsageType(@Nullable String extendedKeyUsageType) {
            this.extendedKeyUsageType = Output.ofNullable(extendedKeyUsageType);
            return this;
        }
        public CertificateExtendedKeyUsageArgs build() {
            return new CertificateExtendedKeyUsageArgs(extendedKeyUsageObjectIdentifier, extendedKeyUsageType);
        }
    }
}
