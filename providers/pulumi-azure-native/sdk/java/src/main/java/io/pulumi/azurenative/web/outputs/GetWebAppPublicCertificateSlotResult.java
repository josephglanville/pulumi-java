// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWebAppPublicCertificateSlotResult {
    private final @Nullable String blob;
    private final String id;
    private final @Nullable String kind;
    private final String name;
    private final @Nullable String publicCertificateLocation;
    private final String thumbprint;
    private final String type;

    @OutputCustomType.Constructor({"blob","id","kind","name","publicCertificateLocation","thumbprint","type"})
    private GetWebAppPublicCertificateSlotResult(
        @Nullable String blob,
        String id,
        @Nullable String kind,
        String name,
        @Nullable String publicCertificateLocation,
        String thumbprint,
        String type) {
        this.blob = blob;
        this.id = Objects.requireNonNull(id);
        this.kind = kind;
        this.name = Objects.requireNonNull(name);
        this.publicCertificateLocation = publicCertificateLocation;
        this.thumbprint = Objects.requireNonNull(thumbprint);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getBlob() {
        return Optional.ofNullable(this.blob);
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getPublicCertificateLocation() {
        return Optional.ofNullable(this.publicCertificateLocation);
    }
    public String getThumbprint() {
        return this.thumbprint;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppPublicCertificateSlotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String blob;
        private String id;
        private @Nullable String kind;
        private String name;
        private @Nullable String publicCertificateLocation;
        private String thumbprint;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppPublicCertificateSlotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blob = defaults.blob;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.publicCertificateLocation = defaults.publicCertificateLocation;
    	      this.thumbprint = defaults.thumbprint;
    	      this.type = defaults.type;
        }

        public Builder setBlob(@Nullable String blob) {
            this.blob = blob;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPublicCertificateLocation(@Nullable String publicCertificateLocation) {
            this.publicCertificateLocation = publicCertificateLocation;
            return this;
        }

        public Builder setThumbprint(String thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetWebAppPublicCertificateSlotResult build() {
            return new GetWebAppPublicCertificateSlotResult(blob, id, kind, name, publicCertificateLocation, thumbprint, type);
        }
    }
}
