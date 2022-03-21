// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCertificateResult {
    private final String certificate;
    private final Integer certificateId;
    private final String creationTimestamp;
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String namePrefix;
    private final String privateKey;
    private final @Nullable String project;
    private final String selfLink;

    @CustomType.Constructor
    private GetCertificateResult(
        @CustomType.Parameter("certificate") String certificate,
        @CustomType.Parameter("certificateId") Integer certificateId,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namePrefix") String namePrefix,
        @CustomType.Parameter("privateKey") String privateKey,
        @CustomType.Parameter("project") @Nullable String project,
        @CustomType.Parameter("selfLink") String selfLink) {
        this.certificate = certificate;
        this.certificateId = certificateId;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.id = id;
        this.name = name;
        this.namePrefix = namePrefix;
        this.privateKey = privateKey;
        this.project = project;
        this.selfLink = selfLink;
    }

    public String getCertificate() {
        return this.certificate;
    }
    public Integer getCertificateId() {
        return this.certificateId;
    }
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    public String getDescription() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getNamePrefix() {
        return this.namePrefix;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    public String getSelfLink() {
        return this.selfLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificate;
        private Integer certificateId;
        private String creationTimestamp;
        private String description;
        private String id;
        private String name;
        private String namePrefix;
        private String privateKey;
        private @Nullable String project;
        private String selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.certificateId = defaults.certificateId;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.privateKey = defaults.privateKey;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder certificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }
        public Builder certificateId(Integer certificateId) {
            this.certificateId = Objects.requireNonNull(certificateId);
            return this;
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namePrefix(String namePrefix) {
            this.namePrefix = Objects.requireNonNull(namePrefix);
            return this;
        }
        public Builder privateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }        public GetCertificateResult build() {
            return new GetCertificateResult(certificate, certificateId, creationTimestamp, description, id, name, namePrefix, privateKey, project, selfLink);
        }
    }
}
