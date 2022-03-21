// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.networksecurity_v1beta1.outputs.CertificateProviderInstanceResponse;
import io.pulumi.googlenative.networksecurity_v1beta1.outputs.GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse;
import java.util.Objects;

@CustomType
public final class ValidationCAResponse {
    /**
     * The certificate provider instance specification that will be passed to the data plane, which will be used to load necessary credential information.
     * 
     */
    private final CertificateProviderInstanceResponse certificateProviderInstance;
    /**
     * gRPC specific configuration to access the gRPC server to obtain the CA certificate.
     * 
     */
    private final GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse grpcEndpoint;

    @CustomType.Constructor
    private ValidationCAResponse(
        @CustomType.Parameter("certificateProviderInstance") CertificateProviderInstanceResponse certificateProviderInstance,
        @CustomType.Parameter("grpcEndpoint") GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse grpcEndpoint) {
        this.certificateProviderInstance = certificateProviderInstance;
        this.grpcEndpoint = grpcEndpoint;
    }

    /**
     * The certificate provider instance specification that will be passed to the data plane, which will be used to load necessary credential information.
     * 
    */
    public CertificateProviderInstanceResponse getCertificateProviderInstance() {
        return this.certificateProviderInstance;
    }
    /**
     * gRPC specific configuration to access the gRPC server to obtain the CA certificate.
     * 
    */
    public GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse getGrpcEndpoint() {
        return this.grpcEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidationCAResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateProviderInstanceResponse certificateProviderInstance;
        private GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse grpcEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidationCAResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateProviderInstance = defaults.certificateProviderInstance;
    	      this.grpcEndpoint = defaults.grpcEndpoint;
        }

        public Builder certificateProviderInstance(CertificateProviderInstanceResponse certificateProviderInstance) {
            this.certificateProviderInstance = Objects.requireNonNull(certificateProviderInstance);
            return this;
        }
        public Builder grpcEndpoint(GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse grpcEndpoint) {
            this.grpcEndpoint = Objects.requireNonNull(grpcEndpoint);
            return this;
        }        public ValidationCAResponse build() {
            return new ValidationCAResponse(certificateProviderInstance, grpcEndpoint);
        }
    }
}
