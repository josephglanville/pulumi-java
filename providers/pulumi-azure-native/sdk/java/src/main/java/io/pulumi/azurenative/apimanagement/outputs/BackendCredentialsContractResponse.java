// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.azurenative.apimanagement.outputs.BackendAuthorizationHeaderCredentialsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackendCredentialsContractResponse {
    /**
     * Authorization header authentication
     * 
     */
    private final @Nullable BackendAuthorizationHeaderCredentialsResponse authorization;
    /**
     * List of Client Certificate Thumbprints. Will be ignored if certificatesIds are provided.
     * 
     */
    private final @Nullable List<String> certificate;
    /**
     * List of Client Certificate Ids.
     * 
     */
    private final @Nullable List<String> certificateIds;
    /**
     * Header Parameter description.
     * 
     */
    private final @Nullable Map<String,List<String>> header;
    /**
     * Query Parameter description.
     * 
     */
    private final @Nullable Map<String,List<String>> query;

    @CustomType.Constructor
    private BackendCredentialsContractResponse(
        @CustomType.Parameter("authorization") @Nullable BackendAuthorizationHeaderCredentialsResponse authorization,
        @CustomType.Parameter("certificate") @Nullable List<String> certificate,
        @CustomType.Parameter("certificateIds") @Nullable List<String> certificateIds,
        @CustomType.Parameter("header") @Nullable Map<String,List<String>> header,
        @CustomType.Parameter("query") @Nullable Map<String,List<String>> query) {
        this.authorization = authorization;
        this.certificate = certificate;
        this.certificateIds = certificateIds;
        this.header = header;
        this.query = query;
    }

    /**
     * Authorization header authentication
     * 
    */
    public Optional<BackendAuthorizationHeaderCredentialsResponse> getAuthorization() {
        return Optional.ofNullable(this.authorization);
    }
    /**
     * List of Client Certificate Thumbprints. Will be ignored if certificatesIds are provided.
     * 
    */
    public List<String> getCertificate() {
        return this.certificate == null ? List.of() : this.certificate;
    }
    /**
     * List of Client Certificate Ids.
     * 
    */
    public List<String> getCertificateIds() {
        return this.certificateIds == null ? List.of() : this.certificateIds;
    }
    /**
     * Header Parameter description.
     * 
    */
    public Map<String,List<String>> getHeader() {
        return this.header == null ? Map.of() : this.header;
    }
    /**
     * Query Parameter description.
     * 
    */
    public Map<String,List<String>> getQuery() {
        return this.query == null ? Map.of() : this.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendCredentialsContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BackendAuthorizationHeaderCredentialsResponse authorization;
        private @Nullable List<String> certificate;
        private @Nullable List<String> certificateIds;
        private @Nullable Map<String,List<String>> header;
        private @Nullable Map<String,List<String>> query;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendCredentialsContractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorization = defaults.authorization;
    	      this.certificate = defaults.certificate;
    	      this.certificateIds = defaults.certificateIds;
    	      this.header = defaults.header;
    	      this.query = defaults.query;
        }

        public Builder authorization(@Nullable BackendAuthorizationHeaderCredentialsResponse authorization) {
            this.authorization = authorization;
            return this;
        }
        public Builder certificate(@Nullable List<String> certificate) {
            this.certificate = certificate;
            return this;
        }
        public Builder certificate(String... certificate) {
            return certificate(List.of(certificate));
        }
        public Builder certificateIds(@Nullable List<String> certificateIds) {
            this.certificateIds = certificateIds;
            return this;
        }
        public Builder certificateIds(String... certificateIds) {
            return certificateIds(List.of(certificateIds));
        }
        public Builder header(@Nullable Map<String,List<String>> header) {
            this.header = header;
            return this;
        }
        public Builder query(@Nullable Map<String,List<String>> query) {
            this.query = query;
            return this;
        }        public BackendCredentialsContractResponse build() {
            return new BackendCredentialsContractResponse(authorization, certificate, certificateIds, header, query);
        }
    }
}
