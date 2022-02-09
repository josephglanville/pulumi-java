// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.KeyVaultKeyReferenceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIntegrationAccountCertificateResult {
    private final String changedTime;
    private final String createdTime;
    private final String id;
    private final @Nullable KeyVaultKeyReferenceResponse key;
    private final @Nullable String location;
    private final @Nullable Object metadata;
    private final String name;
    private final @Nullable String publicCertificate;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"changedTime","createdTime","id","key","location","metadata","name","publicCertificate","tags","type"})
    private GetIntegrationAccountCertificateResult(
        String changedTime,
        String createdTime,
        String id,
        @Nullable KeyVaultKeyReferenceResponse key,
        @Nullable String location,
        @Nullable Object metadata,
        String name,
        @Nullable String publicCertificate,
        @Nullable Map<String,String> tags,
        String type) {
        this.changedTime = Objects.requireNonNull(changedTime);
        this.createdTime = Objects.requireNonNull(createdTime);
        this.id = Objects.requireNonNull(id);
        this.key = key;
        this.location = location;
        this.metadata = metadata;
        this.name = Objects.requireNonNull(name);
        this.publicCertificate = publicCertificate;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public String getChangedTime() {
        return this.changedTime;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }
    public String getId() {
        return this.id;
    }
    public Optional<KeyVaultKeyReferenceResponse> getKey() {
        return Optional.ofNullable(this.key);
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public Optional<Object> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getPublicCertificate() {
        return Optional.ofNullable(this.publicCertificate);
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationAccountCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String changedTime;
        private String createdTime;
        private String id;
        private @Nullable KeyVaultKeyReferenceResponse key;
        private @Nullable String location;
        private @Nullable Object metadata;
        private String name;
        private @Nullable String publicCertificate;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationAccountCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changedTime = defaults.changedTime;
    	      this.createdTime = defaults.createdTime;
    	      this.id = defaults.id;
    	      this.key = defaults.key;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.publicCertificate = defaults.publicCertificate;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setChangedTime(String changedTime) {
            this.changedTime = Objects.requireNonNull(changedTime);
            return this;
        }

        public Builder setCreatedTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKey(@Nullable KeyVaultKeyReferenceResponse key) {
            this.key = key;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMetadata(@Nullable Object metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPublicCertificate(@Nullable String publicCertificate) {
            this.publicCertificate = publicCertificate;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetIntegrationAccountCertificateResult build() {
            return new GetIntegrationAccountCertificateResult(changedTime, createdTime, id, key, location, metadata, name, publicCertificate, tags, type);
        }
    }
}
