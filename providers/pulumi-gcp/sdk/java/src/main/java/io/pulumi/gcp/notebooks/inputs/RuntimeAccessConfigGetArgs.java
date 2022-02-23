// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuntimeAccessConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeAccessConfigGetArgs Empty = new RuntimeAccessConfigGetArgs();

    /**
     * The type of access mode this instance. For valid values, see
     * `https://cloud.google.com/vertex-ai/docs/workbench/reference/
     * rest/v1/projects.locations.runtimes#RuntimeAccessType`.
     * 
     */
    @InputImport(name="accessType")
      private final @Nullable Input<String> accessType;

    public Input<String> getAccessType() {
        return this.accessType == null ? Input.empty() : this.accessType;
    }

    /**
     * - 
     * The proxy endpoint that is used to access the runtime.
     * 
     */
    @InputImport(name="proxyUri")
      private final @Nullable Input<String> proxyUri;

    public Input<String> getProxyUri() {
        return this.proxyUri == null ? Input.empty() : this.proxyUri;
    }

    /**
     * The owner of this runtime after creation. Format: `alias@example.com`.
     * Currently supports one owner only.
     * 
     */
    @InputImport(name="runtimeOwner")
      private final @Nullable Input<String> runtimeOwner;

    public Input<String> getRuntimeOwner() {
        return this.runtimeOwner == null ? Input.empty() : this.runtimeOwner;
    }

    public RuntimeAccessConfigGetArgs(
        @Nullable Input<String> accessType,
        @Nullable Input<String> proxyUri,
        @Nullable Input<String> runtimeOwner) {
        this.accessType = accessType;
        this.proxyUri = proxyUri;
        this.runtimeOwner = runtimeOwner;
    }

    private RuntimeAccessConfigGetArgs() {
        this.accessType = Input.empty();
        this.proxyUri = Input.empty();
        this.runtimeOwner = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeAccessConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessType;
        private @Nullable Input<String> proxyUri;
        private @Nullable Input<String> runtimeOwner;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeAccessConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessType = defaults.accessType;
    	      this.proxyUri = defaults.proxyUri;
    	      this.runtimeOwner = defaults.runtimeOwner;
        }

        public Builder setAccessType(@Nullable Input<String> accessType) {
            this.accessType = accessType;
            return this;
        }

        public Builder setAccessType(@Nullable String accessType) {
            this.accessType = Input.ofNullable(accessType);
            return this;
        }

        public Builder setProxyUri(@Nullable Input<String> proxyUri) {
            this.proxyUri = proxyUri;
            return this;
        }

        public Builder setProxyUri(@Nullable String proxyUri) {
            this.proxyUri = Input.ofNullable(proxyUri);
            return this;
        }

        public Builder setRuntimeOwner(@Nullable Input<String> runtimeOwner) {
            this.runtimeOwner = runtimeOwner;
            return this;
        }

        public Builder setRuntimeOwner(@Nullable String runtimeOwner) {
            this.runtimeOwner = Input.ofNullable(runtimeOwner);
            return this;
        }
        public RuntimeAccessConfigGetArgs build() {
            return new RuntimeAccessConfigGetArgs(accessType, proxyUri, runtimeOwner);
        }
    }
}
