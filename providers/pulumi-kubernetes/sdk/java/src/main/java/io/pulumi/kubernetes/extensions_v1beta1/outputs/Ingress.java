// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.extensions_v1beta1.outputs.IngressSpec;
import io.pulumi.kubernetes.extensions_v1beta1.outputs.IngressStatus;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Ingress {
    private final @Nullable String apiVersion;
    private final @Nullable String kind;
    private final @Nullable ObjectMeta metadata;
    private final @Nullable IngressSpec spec;
    private final @Nullable IngressStatus status;

    @OutputCustomType.Constructor({"apiVersion","kind","metadata","spec","status"})
    private Ingress(
        @Nullable String apiVersion,
        @Nullable String kind,
        @Nullable ObjectMeta metadata,
        @Nullable IngressSpec spec,
        @Nullable IngressStatus status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
    }

    public Optional<String> getApiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public Optional<ObjectMeta> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    public Optional<IngressSpec> getSpec() {
        return Optional.ofNullable(this.spec);
    }
    public Optional<IngressStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Ingress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable IngressSpec spec;
        private @Nullable IngressStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(Ingress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setMetadata(@Nullable ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setSpec(@Nullable IngressSpec spec) {
            this.spec = spec;
            return this;
        }

        public Builder setStatus(@Nullable IngressStatus status) {
            this.status = status;
            return this;
        }

        public Ingress build() {
            return new Ingress(apiVersion, kind, metadata, spec, status);
        }
    }
}