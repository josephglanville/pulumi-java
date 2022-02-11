// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import io.pulumi.kubernetes.storage.k8s.io_v1beta1.inputs.CSIDriverSpecArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CSIDriverArgs extends io.pulumi.resources.ResourceArgs {

    public static final CSIDriverArgs Empty = new CSIDriverArgs();

    @InputImport(name="apiVersion")
    private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="metadata")
    private final @Nullable Input<ObjectMetaArgs> metadata;

    public Input<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    @InputImport(name="spec", required=true)
    private final Input<CSIDriverSpecArgs> spec;

    public Input<CSIDriverSpecArgs> getSpec() {
        return this.spec;
    }

    public CSIDriverArgs(
        @Nullable Input<String> apiVersion,
        @Nullable Input<String> kind,
        @Nullable Input<ObjectMetaArgs> metadata,
        Input<CSIDriverSpecArgs> spec) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = Objects.requireNonNull(spec, "expected parameter 'spec' to be non-null");
    }

    private CSIDriverArgs() {
        this.apiVersion = Input.empty();
        this.kind = Input.empty();
        this.metadata = Input.empty();
        this.spec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CSIDriverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<String> kind;
        private @Nullable Input<ObjectMetaArgs> metadata;
        private Input<CSIDriverSpecArgs> spec;

        public Builder() {
    	      // Empty
        }

        public Builder(CSIDriverArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
        }

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setMetadata(@Nullable Input<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setSpec(Input<CSIDriverSpecArgs> spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }

        public Builder setSpec(CSIDriverSpecArgs spec) {
            this.spec = Input.of(Objects.requireNonNull(spec));
            return this;
        }

        public CSIDriverArgs build() {
            return new CSIDriverArgs(apiVersion, kind, metadata, spec);
        }
    }
}
