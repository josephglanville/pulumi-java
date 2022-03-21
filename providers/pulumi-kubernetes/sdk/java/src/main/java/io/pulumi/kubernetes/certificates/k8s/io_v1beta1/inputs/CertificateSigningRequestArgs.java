// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.certificates.k8s.io_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.certificates.k8s.io_v1beta1.inputs.CertificateSigningRequestSpecArgs;
import io.pulumi.kubernetes.certificates.k8s.io_v1beta1.inputs.CertificateSigningRequestStatusArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a certificate signing request
 * 
 */
public final class CertificateSigningRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateSigningRequestArgs Empty = new CertificateSigningRequestArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
      private final @Nullable Output<String> apiVersion;

    public Output<String> getApiVersion() {
        return this.apiVersion == null ? Output.empty() : this.apiVersion;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * The certificate request itself and any additional information.
     * 
     */
    @Import(name="spec")
      private final @Nullable Output<CertificateSigningRequestSpecArgs> spec;

    public Output<CertificateSigningRequestSpecArgs> getSpec() {
        return this.spec == null ? Output.empty() : this.spec;
    }

    /**
     * Derived information about the request.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<CertificateSigningRequestStatusArgs> status;

    public Output<CertificateSigningRequestStatusArgs> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public CertificateSigningRequestArgs(
        @Nullable Output<String> apiVersion,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        @Nullable Output<CertificateSigningRequestSpecArgs> spec,
        @Nullable Output<CertificateSigningRequestStatusArgs> status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
    }

    private CertificateSigningRequestArgs() {
        this.apiVersion = Output.empty();
        this.kind = Output.empty();
        this.metadata = Output.empty();
        this.spec = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateSigningRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private @Nullable Output<CertificateSigningRequestSpecArgs> spec;
        private @Nullable Output<CertificateSigningRequestStatusArgs> status;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateSigningRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Output.ofNullable(apiVersion);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }
        public Builder spec(@Nullable Output<CertificateSigningRequestSpecArgs> spec) {
            this.spec = spec;
            return this;
        }
        public Builder spec(@Nullable CertificateSigningRequestSpecArgs spec) {
            this.spec = Output.ofNullable(spec);
            return this;
        }
        public Builder status(@Nullable Output<CertificateSigningRequestStatusArgs> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable CertificateSigningRequestStatusArgs status) {
            this.status = Output.ofNullable(status);
            return this;
        }        public CertificateSigningRequestArgs build() {
            return new CertificateSigningRequestArgs(apiVersion, kind, metadata, spec, status);
        }
    }
}
