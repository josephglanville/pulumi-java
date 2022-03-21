// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.networksecurity_v1beta1.outputs.GoogleCloudNetworksecurityV1beta1CertificateProviderResponse;
import io.pulumi.googlenative.networksecurity_v1beta1.outputs.ValidationCAResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetClientTlsPolicyResult {
    /**
     * Optional. Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
     * 
     */
    private final GoogleCloudNetworksecurityV1beta1CertificateProviderResponse clientCertificate;
    /**
     * The timestamp when the resource was created.
     * 
     */
    private final String createTime;
    /**
     * Optional. Free-text description of the resource.
     * 
     */
    private final String description;
    /**
     * Optional. Set of label tags associated with the resource.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Name of the ClientTlsPolicy resource. It matches the pattern `projects/*{@literal /}locations/{location}/clientTlsPolicies/{client_tls_policy}`
     * 
     */
    private final String name;
    /**
     * Optional. Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
     * 
     */
    private final List<ValidationCAResponse> serverValidationCa;
    /**
     * Optional. Server Name Indication string to present to the server during TLS handshake. E.g: "secure.example.com".
     * 
     */
    private final String sni;
    /**
     * The timestamp when the resource was updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetClientTlsPolicyResult(
        @CustomType.Parameter("clientCertificate") GoogleCloudNetworksecurityV1beta1CertificateProviderResponse clientCertificate,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("serverValidationCa") List<ValidationCAResponse> serverValidationCa,
        @CustomType.Parameter("sni") String sni,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.clientCertificate = clientCertificate;
        this.createTime = createTime;
        this.description = description;
        this.labels = labels;
        this.name = name;
        this.serverValidationCa = serverValidationCa;
        this.sni = sni;
        this.updateTime = updateTime;
    }

    /**
     * Optional. Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
     * 
    */
    public GoogleCloudNetworksecurityV1beta1CertificateProviderResponse getClientCertificate() {
        return this.clientCertificate;
    }
    /**
     * The timestamp when the resource was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Optional. Free-text description of the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Optional. Set of label tags associated with the resource.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Name of the ClientTlsPolicy resource. It matches the pattern `projects/*{@literal /}locations/{location}/clientTlsPolicies/{client_tls_policy}`
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Optional. Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
     * 
    */
    public List<ValidationCAResponse> getServerValidationCa() {
        return this.serverValidationCa;
    }
    /**
     * Optional. Server Name Indication string to present to the server during TLS handshake. E.g: "secure.example.com".
     * 
    */
    public String getSni() {
        return this.sni;
    }
    /**
     * The timestamp when the resource was updated.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientTlsPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudNetworksecurityV1beta1CertificateProviderResponse clientCertificate;
        private String createTime;
        private String description;
        private Map<String,String> labels;
        private String name;
        private List<ValidationCAResponse> serverValidationCa;
        private String sni;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClientTlsPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.serverValidationCa = defaults.serverValidationCa;
    	      this.sni = defaults.sni;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder clientCertificate(GoogleCloudNetworksecurityV1beta1CertificateProviderResponse clientCertificate) {
            this.clientCertificate = Objects.requireNonNull(clientCertificate);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder serverValidationCa(List<ValidationCAResponse> serverValidationCa) {
            this.serverValidationCa = Objects.requireNonNull(serverValidationCa);
            return this;
        }
        public Builder serverValidationCa(ValidationCAResponse... serverValidationCa) {
            return serverValidationCa(List.of(serverValidationCa));
        }
        public Builder sni(String sni) {
            this.sni = Objects.requireNonNull(sni);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetClientTlsPolicyResult build() {
            return new GetClientTlsPolicyResult(clientCertificate, createTime, description, labels, name, serverValidationCa, sni, updateTime);
        }
    }
}
