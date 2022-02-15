// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GlusterfsPersistentVolumeSource {
    private final String endpoints;
    private final @Nullable String endpointsNamespace;
    private final String path;
    private final @Nullable Boolean readOnly;

    @OutputCustomType.Constructor({"endpoints","endpointsNamespace","path","readOnly"})
    private GlusterfsPersistentVolumeSource(
        String endpoints,
        @Nullable String endpointsNamespace,
        String path,
        @Nullable Boolean readOnly) {
        this.endpoints = Objects.requireNonNull(endpoints);
        this.endpointsNamespace = endpointsNamespace;
        this.path = Objects.requireNonNull(path);
        this.readOnly = readOnly;
    }

    public String getEndpoints() {
        return this.endpoints;
    }
    public Optional<String> getEndpointsNamespace() {
        return Optional.ofNullable(this.endpointsNamespace);
    }
    public String getPath() {
        return this.path;
    }
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlusterfsPersistentVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpoints;
        private @Nullable String endpointsNamespace;
        private String path;
        private @Nullable Boolean readOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(GlusterfsPersistentVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoints = defaults.endpoints;
    	      this.endpointsNamespace = defaults.endpointsNamespace;
    	      this.path = defaults.path;
    	      this.readOnly = defaults.readOnly;
        }

        public Builder setEndpoints(String endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }

        public Builder setEndpointsNamespace(@Nullable String endpointsNamespace) {
            this.endpointsNamespace = endpointsNamespace;
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public GlusterfsPersistentVolumeSource build() {
            return new GlusterfsPersistentVolumeSource(endpoints, endpointsNamespace, path, readOnly);
        }
    }
}