// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.enums.AfdCertificateType;
import io.pulumi.azurenative.cdn.enums.AfdMinimumTlsVersion;
import io.pulumi.azurenative.cdn.inputs.ResourceReferenceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The JSON object that contains the properties to secure a domain.
 * 
 */
public final class AFDDomainHttpsParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final AFDDomainHttpsParametersArgs Empty = new AFDDomainHttpsParametersArgs();

    /**
     * Defines the source of the SSL certificate.
     * 
     */
    @Import(name="certificateType", required=true)
      private final Output<Either<String,AfdCertificateType>> certificateType;

    public Output<Either<String,AfdCertificateType>> getCertificateType() {
        return this.certificateType;
    }

    /**
     * TLS protocol version that will be used for Https
     * 
     */
    @Import(name="minimumTlsVersion")
      private final @Nullable Output<AfdMinimumTlsVersion> minimumTlsVersion;

    public Output<AfdMinimumTlsVersion> getMinimumTlsVersion() {
        return this.minimumTlsVersion == null ? Codegen.empty() : this.minimumTlsVersion;
    }

    /**
     * Resource reference to the secret. ie. subs/rg/profile/secret
     * 
     */
    @Import(name="secret")
      private final @Nullable Output<ResourceReferenceArgs> secret;

    public Output<ResourceReferenceArgs> getSecret() {
        return this.secret == null ? Codegen.empty() : this.secret;
    }

    public AFDDomainHttpsParametersArgs(
        Output<Either<String,AfdCertificateType>> certificateType,
        @Nullable Output<AfdMinimumTlsVersion> minimumTlsVersion,
        @Nullable Output<ResourceReferenceArgs> secret) {
        this.certificateType = Objects.requireNonNull(certificateType, "expected parameter 'certificateType' to be non-null");
        this.minimumTlsVersion = minimumTlsVersion;
        this.secret = secret;
    }

    private AFDDomainHttpsParametersArgs() {
        this.certificateType = Codegen.empty();
        this.minimumTlsVersion = Codegen.empty();
        this.secret = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AFDDomainHttpsParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,AfdCertificateType>> certificateType;
        private @Nullable Output<AfdMinimumTlsVersion> minimumTlsVersion;
        private @Nullable Output<ResourceReferenceArgs> secret;

        public Builder() {
    	      // Empty
        }

        public Builder(AFDDomainHttpsParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateType = defaults.certificateType;
    	      this.minimumTlsVersion = defaults.minimumTlsVersion;
    	      this.secret = defaults.secret;
        }

        public Builder certificateType(Output<Either<String,AfdCertificateType>> certificateType) {
            this.certificateType = Objects.requireNonNull(certificateType);
            return this;
        }
        public Builder certificateType(Either<String,AfdCertificateType> certificateType) {
            this.certificateType = Output.of(Objects.requireNonNull(certificateType));
            return this;
        }
        public Builder minimumTlsVersion(@Nullable Output<AfdMinimumTlsVersion> minimumTlsVersion) {
            this.minimumTlsVersion = minimumTlsVersion;
            return this;
        }
        public Builder minimumTlsVersion(@Nullable AfdMinimumTlsVersion minimumTlsVersion) {
            this.minimumTlsVersion = Codegen.ofNullable(minimumTlsVersion);
            return this;
        }
        public Builder secret(@Nullable Output<ResourceReferenceArgs> secret) {
            this.secret = secret;
            return this;
        }
        public Builder secret(@Nullable ResourceReferenceArgs secret) {
            this.secret = Codegen.ofNullable(secret);
            return this;
        }        public AFDDomainHttpsParametersArgs build() {
            return new AFDDomainHttpsParametersArgs(certificateType, minimumTlsVersion, secret);
        }
    }
}
